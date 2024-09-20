package com.worldline.acquiring.sdk.java.authentication;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.mockito.stubbing.Answer;

import com.worldline.acquiring.sdk.java.ApiResource;
import com.worldline.acquiring.sdk.java.BodyHandler;
import com.worldline.acquiring.sdk.java.CallContext;
import com.worldline.acquiring.sdk.java.Client;
import com.worldline.acquiring.sdk.java.Communicator;
import com.worldline.acquiring.sdk.java.authentication.OAuth2Authenticator.TokenType;

class TokenTypeTest {

    @ParameterizedTest
    @ArgumentsSource(PathProvider.class)
    void testTokenExistsForPath(String path) {
        assertDoesNotThrow(() -> TokenType.of(path));
    }

    @Test
    @Disabled("currently all paths match")
    void testTokenDoesNotExistForInvalidPath() {
        String invalidPath = "/this-path-is-invalid";
        assertThrows(IllegalArgumentException.class, () -> TokenType.of(invalidPath));
    }

    static final class PathProvider implements ArgumentsProvider {

        private static final Map<Class<?>, Object> PARAMETER_VALUES = new HashMap<>();

        static {
            PARAMETER_VALUES.put(String.class, "<dummy>");
            PARAMETER_VALUES.put(Integer.class, 1000);
            PARAMETER_VALUES.put(Long.class, 1000L);
            PARAMETER_VALUES.put(Boolean.class, true);
        }

        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {
            return collectPaths()
                    .stream()
                    .map(Arguments::of);
        }

        @SuppressWarnings("resource")
        private List<String> collectPaths() {
            List<String> paths = new ArrayList<>();

            Communicator communicator = mock(Communicator.class);

            doAnswer(addToList(paths)).when(communicator).get(any(), any(), any(), anyResponseType(), any());
            doAnswer(addToList(paths)).when(communicator).delete(any(), any(), any(), anyResponseType(), any());
            doAnswer(addToList(paths)).when(communicator).post(any(), any(), any(), any(), anyResponseType(), any());
            doAnswer(addToList(paths)).when(communicator).put(any(), any(), any(), any(), anyResponseType(), any());

            doAnswer(addToList(paths)).when(communicator).get(any(), any(), any(), anyBodyHandler(), any());
            doAnswer(addToList(paths)).when(communicator).delete(any(), any(), any(), anyBodyHandler(), any());
            doAnswer(addToList(paths)).when(communicator).post(any(), any(), any(), any(), anyBodyHandler(), any());
            doAnswer(addToList(paths)).when(communicator).put(any(), any(), any(), any(), anyBodyHandler(), any());

            Client client = new Client(communicator);
            invokeAll(client);

            return paths;
        }

        private Class<?> anyResponseType() {
            return any();
        }

        private BodyHandler anyBodyHandler() {
            return any();
        }

        private <T> Answer<T> addToList(List<String> paths) {
            return invocation -> {
                paths.add(invocation.getArgument(0));
                return null;
            };
        }

        private void invokeAll(ApiResource apiResource) {
            Method[] methods = apiResource.getClass().getMethods();
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (ApiResource.class.isAssignableFrom(method.getReturnType())) {
                    Object[] parameterValues = getParameterValues(parameterTypes);
                    ApiResource childResource = (ApiResource) assertDoesNotThrow(() -> method.invoke(apiResource, parameterValues));
                    invokeAll(childResource);
                } else if (parameterTypes.length > 0 && parameterTypes[parameterTypes.length - 1] == CallContext.class) {
                    Object[] parameterValues = getParameterValues(parameterTypes);
                    assertDoesNotThrow(() -> method.invoke(apiResource, parameterValues));
                }
            }
        }

        private Object[] getParameterValues(Class<?>[] parameterTypes) {
            return Arrays.stream(parameterTypes)
                    .map(PARAMETER_VALUES::get)
                    .toArray();
        }
    }
}
