package com.worldline.acquiring.sdk.java.it;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.worldline.acquiring.sdk.java.Communicator;
import com.worldline.acquiring.sdk.java.CommunicatorConfiguration;
import com.worldline.acquiring.sdk.java.Factory;
import com.worldline.acquiring.sdk.java.communication.MultipartFormDataObject;
import com.worldline.acquiring.sdk.java.communication.MultipartFormDataRequest;
import com.worldline.acquiring.sdk.java.domain.UploadableFile;
import com.worldline.acquiring.sdk.java.json.DefaultMarshaller;

class MultipartFormDataTest extends ItTest {

    private static final String HTTPBIN_URL = System.getProperty("httpbin.url", "http://httpbin.org");

    @Test
    void testPostMultipartFormDataObjectWithResponse() throws URISyntaxException, IOException {
        CommunicatorConfiguration configuration = getCommunicatorConfiguration();
        configuration.setApiEndpoint(URI.create(HTTPBIN_URL));

        try (Communicator communicator = Factory.createCommunicator(configuration);
                InputStream content = getClass().getResourceAsStream("/itconfiguration.properties")) {

            MultipartFormDataObject multipart = new MultipartFormDataObject();
            multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
            multipart.addValue("value", "Hello World");

            @SuppressWarnings("unchecked")
            Map<String, Object> response = communicator.post("/anything/operations", null, null, multipart, Map.class, null);

            @SuppressWarnings("unchecked")
            Map<String, Object> files = assertInstanceOf(Map.class, response.get("files"));
            assertEquals(1, files.size());
            String file = assertInstanceOf(String.class, files.get("file"));
            assertThat(file, containsString("\nacquiring.api.endpoint.host"));

            @SuppressWarnings("unchecked")
            Map<String, Object> form = assertInstanceOf(Map.class, response.get("form"));
            assertEquals(1, form.size());
            String value = assertInstanceOf(String.class, form.get("value"));
            assertEquals("Hello World", value);
        }
    }

    @Test
    void testPostMultipartFormDataRequestWithResponse() throws URISyntaxException, IOException {
        CommunicatorConfiguration configuration = getCommunicatorConfiguration();
        configuration.setApiEndpoint(URI.create(HTTPBIN_URL));

        try (Communicator communicator = Factory.createCommunicator(configuration);
                InputStream content = getClass().getResourceAsStream("/itconfiguration.properties")) {

            MultipartFormDataObject multipart = new MultipartFormDataObject();
            multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
            multipart.addValue("value", "Hello World");
            MultipartFormDataRequest request = () -> multipart;

            @SuppressWarnings("unchecked")
            Map<String, Object> response = communicator.post("/anything/operations", null, null, request, Map.class, null);

            @SuppressWarnings("unchecked")
            Map<String, Object> files = assertInstanceOf(Map.class, response.get("files"));
            assertEquals(1, files.size());
            String file = assertInstanceOf(String.class, files.get("file"));
            assertThat(file, containsString("\nacquiring.api.endpoint.host"));

            @SuppressWarnings("unchecked")
            Map<String, Object> form = assertInstanceOf(Map.class, response.get("form"));
            assertEquals(1, form.size());
            String value = assertInstanceOf(String.class, form.get("value"));
            assertEquals("Hello World", value);
        }
    }

    @Test
    void testPostMultipartFormDataObjectWithBodyHandler() throws URISyntaxException, IOException {
        CommunicatorConfiguration configuration = getCommunicatorConfiguration();
        configuration.setApiEndpoint(URI.create(HTTPBIN_URL));

        try (Communicator communicator = Factory.createCommunicator(configuration);
                InputStream content = getClass().getResourceAsStream("/itconfiguration.properties")) {

            MultipartFormDataObject multipart = new MultipartFormDataObject();
            multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
            multipart.addValue("value", "Hello World");

            communicator.post("/anything/operations", null, null, multipart, (bodyStream, headers) -> {
                @SuppressWarnings("unchecked")
                Map<String, Object> response = DefaultMarshaller.INSTANCE.unmarshal(bodyStream, Map.class);

                @SuppressWarnings("unchecked")
                Map<String, Object> files = assertInstanceOf(Map.class, response.get("files"));
                assertEquals(1, files.size());
                String file = assertInstanceOf(String.class, files.get("file"));
                assertThat(file, containsString("\nacquiring.api.endpoint.host"));

                @SuppressWarnings("unchecked")
                Map<String, Object> form = assertInstanceOf(Map.class, response.get("form"));
                assertEquals(1, form.size());
                String value = assertInstanceOf(String.class, form.get("value"));
                assertEquals("Hello World", value);
            }, null);
        }
    }

    @Test
    void testPostMultipartFormDataRequestWithBodyHandler() throws URISyntaxException, IOException {

        CommunicatorConfiguration configuration = getCommunicatorConfiguration();
        configuration.setApiEndpoint(URI.create(HTTPBIN_URL));

        try (Communicator communicator = Factory.createCommunicator(configuration);
                InputStream content = getClass().getResourceAsStream("/itconfiguration.properties")) {

            MultipartFormDataObject multipart = new MultipartFormDataObject();
            multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
            multipart.addValue("value", "Hello World");
            MultipartFormDataRequest request = () -> multipart;

            communicator.post("/anything/operations", null, null, request, (bodyStream, headers) -> {
                @SuppressWarnings("unchecked")
                Map<String, Object> response = DefaultMarshaller.INSTANCE.unmarshal(bodyStream, Map.class);

                @SuppressWarnings("unchecked")
                Map<String, Object> files = assertInstanceOf(Map.class, response.get("files"));
                assertEquals(1, files.size());
                String file = assertInstanceOf(String.class, files.get("file"));
                assertThat(file, containsString("\nacquiring.api.endpoint.host"));

                @SuppressWarnings("unchecked")
                Map<String, Object> form = assertInstanceOf(Map.class, response.get("form"));
                assertEquals(1, form.size());
                String value = assertInstanceOf(String.class, form.get("value"));
                assertEquals("Hello World", value);
            }, null);
        }
    }

    @Test
    void testPutMultipartFormDataObjectWithResponse() throws URISyntaxException, IOException {

        CommunicatorConfiguration configuration = getCommunicatorConfiguration();
        configuration.setApiEndpoint(URI.create(HTTPBIN_URL));

        try (Communicator communicator = Factory.createCommunicator(configuration);
                InputStream content = getClass().getResourceAsStream("/itconfiguration.properties")) {

            MultipartFormDataObject multipart = new MultipartFormDataObject();
            multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
            multipart.addValue("value", "Hello World");

            @SuppressWarnings("unchecked")
            Map<String, Object> response = communicator.put("/anything/operations", null, null, multipart, Map.class, null);

            @SuppressWarnings("unchecked")
            Map<String, Object> files = assertInstanceOf(Map.class, response.get("files"));
            assertEquals(1, files.size());
            String file = assertInstanceOf(String.class, files.get("file"));
            assertThat(file, containsString("\nacquiring.api.endpoint.host"));

            @SuppressWarnings("unchecked")
            Map<String, Object> form = assertInstanceOf(Map.class, response.get("form"));
            assertEquals(1, form.size());
            String value = assertInstanceOf(String.class, form.get("value"));
            assertEquals("Hello World", value);
        }
    }

    @Test
    void testPutMultipartFormDataRequestWithResponse() throws URISyntaxException, IOException {

        CommunicatorConfiguration configuration = getCommunicatorConfiguration();
        configuration.setApiEndpoint(URI.create(HTTPBIN_URL));

        try (Communicator communicator = Factory.createCommunicator(configuration);
                InputStream content = getClass().getResourceAsStream("/itconfiguration.properties")) {

            MultipartFormDataObject multipart = new MultipartFormDataObject();
            multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
            multipart.addValue("value", "Hello World");
            MultipartFormDataRequest request = () -> multipart;

            @SuppressWarnings("unchecked")
            Map<String, Object> response = communicator.put("/anything/operations", null, null, request, Map.class, null);

            @SuppressWarnings("unchecked")
            Map<String, Object> files = assertInstanceOf(Map.class, response.get("files"));
            assertEquals(1, files.size());
            String file = assertInstanceOf(String.class, files.get("file"));
            assertThat(file, containsString("\nacquiring.api.endpoint.host"));

            @SuppressWarnings("unchecked")
            Map<String, Object> form = assertInstanceOf(Map.class, response.get("form"));
            assertEquals(1, form.size());
            String value = assertInstanceOf(String.class, form.get("value"));
            assertEquals("Hello World", value);
        }
    }

    @Test
    void testPutMultipartFormDataObjectWithBodyHandler() throws URISyntaxException, IOException {

        CommunicatorConfiguration configuration = getCommunicatorConfiguration();
        configuration.setApiEndpoint(URI.create(HTTPBIN_URL));

        try (Communicator communicator = Factory.createCommunicator(configuration);
                InputStream content = getClass().getResourceAsStream("/itconfiguration.properties")) {

            MultipartFormDataObject multipart = new MultipartFormDataObject();
            multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
            multipart.addValue("value", "Hello World");

            communicator.put("/anything/operations", null, null, multipart, (bodyStream, headers) -> {
                @SuppressWarnings("unchecked")
                Map<String, Object> response = DefaultMarshaller.INSTANCE.unmarshal(bodyStream, Map.class);

                @SuppressWarnings("unchecked")
                Map<String, Object> files = assertInstanceOf(Map.class, response.get("files"));
                assertEquals(1, files.size());
                String file = assertInstanceOf(String.class, files.get("file"));
                assertThat(file, containsString("\nacquiring.api.endpoint.host"));

                @SuppressWarnings("unchecked")
                Map<String, Object> form = assertInstanceOf(Map.class, response.get("form"));
                assertEquals(1, form.size());
                String value = assertInstanceOf(String.class, form.get("value"));
                assertEquals("Hello World", value);
            }, null);
        }
    }

    @Test
    void testPutMultipartFormDataRequestWithBodyHandler() throws URISyntaxException, IOException {

        CommunicatorConfiguration configuration = getCommunicatorConfiguration();
        configuration.setApiEndpoint(URI.create(HTTPBIN_URL));

        try (Communicator communicator = Factory.createCommunicator(configuration);
                InputStream content = getClass().getResourceAsStream("/itconfiguration.properties")) {

            MultipartFormDataObject multipart = new MultipartFormDataObject();
            multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
            multipart.addValue("value", "Hello World");
            MultipartFormDataRequest request = () -> multipart;

            communicator.put("/anything/operations", null, null, request, (bodyStream, headers) -> {
                @SuppressWarnings("unchecked")
                Map<String, Object> response = DefaultMarshaller.INSTANCE.unmarshal(bodyStream, Map.class);

                @SuppressWarnings("unchecked")
                Map<String, Object> files = assertInstanceOf(Map.class, response.get("files"));
                assertEquals(1, files.size());
                String file = assertInstanceOf(String.class, files.get("file"));
                assertThat(file, containsString("\nacquiring.api.endpoint.host"));

                @SuppressWarnings("unchecked")
                Map<String, Object> form = assertInstanceOf(Map.class, response.get("form"));
                assertEquals(1, form.size());
                String value = assertInstanceOf(String.class, form.get("value"));
                assertEquals("Hello World", value);
            }, null);
        }
    }
}
