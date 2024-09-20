package com.worldline.acquiring.sdk.java.it;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.jupiter.api.Test;

import com.worldline.acquiring.sdk.java.Communicator;
import com.worldline.acquiring.sdk.java.CommunicatorConfiguration;
import com.worldline.acquiring.sdk.java.Factory;
import com.worldline.acquiring.sdk.java.v1.acquirer.merchant.dynamiccurrencyconversion.DynamicCurrencyConversionClient;
import com.worldline.acquiring.sdk.java.v1.domain.GetDCCRateRequest;

class ConnectionPoolingTest extends ItTest {

    @Test
    void testConnectionPoolingMaxIsRequestCount() throws Exception {
        testConnectionPooling(10, 10);
    }

    @Test
    void testConnectionPoolingMaxIsHalfRequestCount() throws Exception {
        testConnectionPooling(10, 5);
    }

    @Test
    void testConnectionPoolingMaxIsOne() throws Exception {
        testConnectionPooling(10, 1);
    }

    private void testConnectionPooling(int requestCount, int maxConnections) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(requestCount);
        try {
            CommunicatorConfiguration configuration = getCommunicatorConfiguration()
                    .withMaxConnections(maxConnections);
            try (Communicator communicator = Factory.createCommunicator(configuration)) {
                testConnectionPooling(executorService, communicator, requestCount);
            }
        } finally {
            executorService.shutdown();
        }
    }

    private void testConnectionPooling(ExecutorService executorService, Communicator communicator, int requestCount) throws Exception {
        List<Future<ConvertDccRateApiResult>> futures = new ArrayList<>(requestCount);
        CountDownLatch barrier = new CountDownLatch(1);
        for (int i = 0; i < requestCount; i++) {
            Future<ConvertDccRateApiResult> future = executorService.submit(new ConvertDccRatesApiAction(barrier, i, communicator));
            futures.add(future);
        }
        barrier.countDown();

        List<ConvertDccRateApiResult> results = new ArrayList<>(requestCount);
        for (Future<ConvertDccRateApiResult> future : futures) {
            results.add(future.get());
        }
        // actual concurrent use of connections will need to be verified in the server logs
    }

    private final class ConvertDccRatesApiAction implements Callable<ConvertDccRateApiResult> {

        private final CountDownLatch barrier;
        private final GetDCCRateRequest request;
        private final DynamicCurrencyConversionClient dynamicCurrencyConversionClient;

        @SuppressWarnings("resource")
        private ConvertDccRatesApiAction(CountDownLatch barrier, int index, Communicator communicator) {
            this.barrier = barrier;
            this.dynamicCurrencyConversionClient = Factory.createClient(communicator)
                    .v1()
                    .acquirer(getAcquirerId())
                    .merchant(getMerchantId())
                    .dynamicCurrencyConversion();
            this.request = getDCCRateRequest(100L * (index + 1));
        }

        @Override
        public ConvertDccRateApiResult call() throws Exception {
            barrier.await();

            long startTime = System.currentTimeMillis();
            dynamicCurrencyConversionClient.requestDccRate(request);
            long endTime = System.currentTimeMillis();

            return new ConvertDccRateApiResult(startTime, endTime);
        }
    }

    private static final class ConvertDccRateApiResult {

        @SuppressWarnings("unused")
        private final long startTime;
        @SuppressWarnings("unused")
        private final long endTime;

        private ConvertDccRateApiResult(long startTime, long endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }
}
