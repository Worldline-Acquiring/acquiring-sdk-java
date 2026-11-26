package com.worldline.acquiring.sdk.java.it;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.worldline.acquiring.sdk.java.Communicator;
import com.worldline.acquiring.sdk.java.CommunicatorBuilder;
import com.worldline.acquiring.sdk.java.communication.DefaultConnectionBuilder;
import com.worldline.acquiring.sdk.java.communication.MetadataProvider;
import com.worldline.acquiring.sdk.java.communication.MultipartFormDataObject;
import com.worldline.acquiring.sdk.java.communication.MultipartFormDataRequest;
import com.worldline.acquiring.sdk.java.communication.ResponseException;
import com.worldline.acquiring.sdk.java.domain.UploadableFile;
import com.worldline.acquiring.sdk.java.json.DefaultMarshaller;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;

/**
 * Verifies the multipart/form-data requests that the SDK puts on the wire, using a local {@link MockWebServer}.
 * The communicator uses a stub authenticator, so these tests do not depend on any external service or credentials.
 */
class MultipartFormDataTest {

    private static final String AUTHORIZATION = "Bearer test-token";
    private static final String OK_RESPONSE_BODY = "{\"status\": \"ok\"}";
    private static final long REQUEST_TIMEOUT_SECONDS = 5;

    private static final Pattern NAME_PATTERN = Pattern.compile("\\bname=\"([^\"]*)\"");
    private static final Pattern FILENAME_PATTERN = Pattern.compile("\\bfilename=\"([^\"]*)\"");

    private MockWebServer server;

    @BeforeEach
    void setUp() throws IOException {
        server = new MockWebServer();
        server.start();
    }

    @AfterEach
    void tearDown() throws IOException {
        server.shutdown();
    }

    @Nested
    class WhenPostingMultipartFormData {

        @Nested
        class WithMultipartFormDataObject {

            @Nested
            class WithSingleFileAndValue {

                @Test
                void shouldPostWithResponse() throws Exception {
                    server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                    try (Communicator communicator = createCommunicator();
                            InputStream content = createTestFileStream("file content")) {

                        MultipartFormDataObject multipart = new MultipartFormDataObject();
                        multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
                        multipart.addValue("value", "Hello World");

                        @SuppressWarnings("unchecked")
                        Map<String, Object> response = communicator.post("/post", null, null, multipart, Map.class, null);

                        assertOkResponse(response);
                    }

                    Map<String, Part> parts = takeMultipartRequest("POST", "/post");
                    assertEquals(2, parts.size());
                    assertFilePart(parts, "file", "file.txt", "text/plain", "file content");
                    assertValuePart(parts, "value", "Hello World");
                }

                @Test
                void shouldPostWithBodyHandler() throws Exception {
                    server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                    AtomicBoolean handled = new AtomicBoolean();

                    try (Communicator communicator = createCommunicator();
                            InputStream content = createTestFileStream("file content")) {

                        MultipartFormDataObject multipart = new MultipartFormDataObject();
                        multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
                        multipart.addValue("value", "Hello World");

                        communicator.post("/post", null, null, multipart, (bodyStream, headers) -> {
                            @SuppressWarnings("unchecked")
                            Map<String, Object> response = DefaultMarshaller.INSTANCE.unmarshal(bodyStream, Map.class);

                            assertOkResponse(response);
                            handled.set(true);
                        }, null);
                    }

                    assertTrue(handled.get(), "body handler was not called");

                    Map<String, Part> parts = takeMultipartRequest("POST", "/post");
                    assertEquals(2, parts.size());
                    assertFilePart(parts, "file", "file.txt", "text/plain", "file content");
                    assertValuePart(parts, "value", "Hello World");
                }
            }

            @Nested
            class WithMultipleFiles {

                @Test
                void shouldPostTwoFiles() throws Exception {
                    server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                    try (Communicator communicator = createCommunicator();
                            InputStream firstContent = createTestFileStream("firstContent");
                            InputStream secondContent = createTestFileStream("secondContent")) {

                        MultipartFormDataObject multipart = new MultipartFormDataObject();
                        multipart.addFile("firstFile", new UploadableFile("first.txt", firstContent, "text/plain"));
                        multipart.addFile("secondFile", new UploadableFile("second.txt", secondContent, "text/plain"));

                        @SuppressWarnings("unchecked")
                        Map<String, Object> response = communicator.post("/post", null, null, multipart, Map.class, null);

                        assertOkResponse(response);
                    }

                    Map<String, Part> parts = takeMultipartRequest("POST", "/post");
                    assertEquals(2, parts.size());
                    assertFilePart(parts, "firstFile", "first.txt", "text/plain", "firstContent");
                    assertFilePart(parts, "secondFile", "second.txt", "text/plain", "secondContent");
                }

                @Test
                void shouldPostThreeFilesWithDifferentTypes() throws Exception {
                    server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                    try (Communicator communicator = createCommunicator();
                            InputStream textContent = createTestFileStream("text");
                            InputStream jsonContent = createTestFileStream("{\"key\": \"json\"}");
                            InputStream xmlContent = createTestFileStream("<key>xml</key>")) {

                        MultipartFormDataObject multipart = new MultipartFormDataObject();
                        multipart.addFile("textFile", new UploadableFile("file.txt", textContent, "text/plain"));
                        multipart.addFile("jsonFile", new UploadableFile("file.json", jsonContent, "application/json"));
                        multipart.addFile("xmlFile", new UploadableFile("file.xml", xmlContent, "application/xml"));

                        @SuppressWarnings("unchecked")
                        Map<String, Object> response = communicator.post("/post", null, null, multipart, Map.class, null);

                        assertOkResponse(response);
                    }

                    Map<String, Part> parts = takeMultipartRequest("POST", "/post");
                    assertEquals(3, parts.size());
                    assertFilePart(parts, "textFile", "file.txt", "text/plain", "text");
                    assertFilePart(parts, "jsonFile", "file.json", "application/json", "{\"key\": \"json\"}");
                    assertFilePart(parts, "xmlFile", "file.xml", "application/xml", "<key>xml</key>");
                }
            }

            @Nested
            class WithMultipleValues {

                @Test
                void shouldPostTwoValues() throws Exception {
                    server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                    try (Communicator communicator = createCommunicator()) {

                        MultipartFormDataObject multipart = new MultipartFormDataObject();
                        multipart.addValue("firstKey", "firstValue");
                        multipart.addValue("secondKey", "secondValue");

                        @SuppressWarnings("unchecked")
                        Map<String, Object> response = communicator.post("/post", null, null, multipart, Map.class, null);

                        assertOkResponse(response);
                    }

                    Map<String, Part> parts = takeMultipartRequest("POST", "/post");
                    assertEquals(2, parts.size());
                    assertValuePart(parts, "firstKey", "firstValue");
                    assertValuePart(parts, "secondKey", "secondValue");
                }

                @Test
                void shouldPostThreeValues() throws Exception {
                    server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                    try (Communicator communicator = createCommunicator()) {

                        MultipartFormDataObject multipart = new MultipartFormDataObject();
                        multipart.addValue("name", "John");
                        multipart.addValue("age", "30");
                        multipart.addValue("city", "NYC");

                        @SuppressWarnings("unchecked")
                        Map<String, Object> response = communicator.post("/post", null, null, multipart, Map.class, null);

                        assertOkResponse(response);
                    }

                    Map<String, Part> parts = takeMultipartRequest("POST", "/post");
                    assertEquals(3, parts.size());
                    assertValuePart(parts, "name", "John");
                    assertValuePart(parts, "age", "30");
                    assertValuePart(parts, "city", "NYC");
                }

                @Test
                void shouldPostNonAsciiValue() throws Exception {
                    server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                    try (Communicator communicator = createCommunicator()) {

                        MultipartFormDataObject multipart = new MultipartFormDataObject();
                        multipart.addValue("greeting", "Hello, Šđčćž €");

                        @SuppressWarnings("unchecked")
                        Map<String, Object> response = communicator.post("/post", null, null, multipart, Map.class, null);

                        assertOkResponse(response);
                    }

                    Map<String, Part> parts = takeMultipartRequest("POST", "/post");
                    assertEquals(1, parts.size());
                    assertValuePart(parts, "greeting", "Hello, Šđčćž €");
                }
            }

            @Nested
            class WithFilesOnly {

                @Test
                void shouldPostSingleFileWithoutValues() throws Exception {
                    server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                    try (Communicator communicator = createCommunicator();
                            InputStream content = createTestFileStream("doc content")) {

                        MultipartFormDataObject multipart = new MultipartFormDataObject();
                        multipart.addFile("document", new UploadableFile("doc.pdf", content, "application/pdf"));

                        @SuppressWarnings("unchecked")
                        Map<String, Object> response = communicator.post("/post", null, null, multipart, Map.class, null);

                        assertOkResponse(response);
                    }

                    Map<String, Part> parts = takeMultipartRequest("POST", "/post");
                    assertEquals(1, parts.size());
                    assertFilePart(parts, "document", "doc.pdf", "application/pdf", "doc content");
                }
            }

            @Nested
            class WithValuesOnly {

                @Test
                void shouldPostSingleValueWithoutFiles() throws Exception {
                    server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                    try (Communicator communicator = createCommunicator()) {

                        MultipartFormDataObject multipart = new MultipartFormDataObject();
                        multipart.addValue("message", "Hello");

                        @SuppressWarnings("unchecked")
                        Map<String, Object> response = communicator.post("/post", null, null, multipart, Map.class, null);

                        assertOkResponse(response);
                    }

                    Map<String, Part> parts = takeMultipartRequest("POST", "/post");
                    assertEquals(1, parts.size());
                    assertValuePart(parts, "message", "Hello");
                }
            }

            @Nested
            class WithDifferentContentTypes {

                @Test
                void shouldPostPdfFile() throws Exception {
                    assertSingleFileIsPosted("pdf", "document.pdf", "application/pdf", "pdf content".getBytes(StandardCharsets.UTF_8));
                }

                @Test
                void shouldPostImageFile() throws Exception {
                    assertSingleFileIsPosted("image", "photo.jpg", "image/jpeg", "image content".getBytes(StandardCharsets.UTF_8));
                }

                @Test
                void shouldPostJsonFile() throws Exception {
                    assertSingleFileIsPosted("data", "data.json", "application/json", "{\"key\": \"value\"}".getBytes(StandardCharsets.UTF_8));
                }

                @Test
                void shouldPostBinaryFile() throws Exception {
                    byte[] content = new byte[64 * 1024];
                    for (int i = 0; i < content.length; i++) {
                        content[i] = (byte) i;
                    }
                    assertSingleFileIsPosted("binary", "data.bin", "application/octet-stream", content);
                }

                private void assertSingleFileIsPosted(String parameterName, String fileName, String contentType, byte[] content) throws Exception {
                    server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                    try (Communicator communicator = createCommunicator();
                            InputStream contentStream = new ByteArrayInputStream(content)) {

                        MultipartFormDataObject multipart = new MultipartFormDataObject();
                        multipart.addFile(parameterName, new UploadableFile(fileName, contentStream, contentType));

                        @SuppressWarnings("unchecked")
                        Map<String, Object> response = communicator.post("/post", null, null, multipart, Map.class, null);

                        assertOkResponse(response);
                    }

                    Map<String, Part> parts = takeMultipartRequest("POST", "/post");
                    assertEquals(1, parts.size());
                    assertFilePart(parts, parameterName, fileName, contentType, content);
                }
            }

            @Nested
            class WithContentLength {

                @Test
                void shouldSendContentLengthForFileWithKnownLength() throws Exception {
                    server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                    try (Communicator communicator = createCommunicator();
                            InputStream content = createTestFileStream("content")) {

                        MultipartFormDataObject multipart = new MultipartFormDataObject();
                        multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain", 7));

                        @SuppressWarnings("unchecked")
                        Map<String, Object> response = communicator.post("/post", null, null, multipart, Map.class, null);

                        assertOkResponse(response);
                    }

                    RecordedRequest recordedRequest = takeRequest();
                    assertNull(recordedRequest.getHeader("Transfer-Encoding"));
                    assertEquals(String.valueOf(recordedRequest.getBodySize()), recordedRequest.getHeader("Content-Length"));

                    Map<String, Part> parts = parseMultipartRequest(recordedRequest, "POST", "/post");
                    assertEquals(1, parts.size());
                    assertFilePart(parts, "file", "file.txt", "text/plain", "content");
                }

                @Test
                void shouldUseChunkedTransferForFileWithUnknownLength() throws Exception {
                    server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                    try (Communicator communicator = createCommunicator();
                            InputStream content = createTestFileStream("content")) {

                        MultipartFormDataObject multipart = new MultipartFormDataObject();
                        multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));

                        @SuppressWarnings("unchecked")
                        Map<String, Object> response = communicator.post("/post", null, null, multipart, Map.class, null);

                        assertOkResponse(response);
                    }

                    RecordedRequest recordedRequest = takeRequest();
                    assertEquals("chunked", lowerCase(recordedRequest.getHeader("Transfer-Encoding")));
                    assertNull(recordedRequest.getHeader("Content-Length"));

                    Map<String, Part> parts = parseMultipartRequest(recordedRequest, "POST", "/post");
                    assertEquals(1, parts.size());
                    assertFilePart(parts, "file", "file.txt", "text/plain", "content");
                }
            }

            @Nested
            class WithErrorResponse {

                @Test
                void shouldThrowResponseExceptionForJsonErrorResponse() throws Exception {
                    String errorBody = "{\"status\": 400, \"title\": \"Bad Request\"}";
                    server.enqueue(jsonResponse(errorBody).setResponseCode(400));

                    try (Communicator communicator = createCommunicator();
                            InputStream content = createTestFileStream("file content")) {

                        MultipartFormDataObject multipart = new MultipartFormDataObject();
                        multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));

                        ResponseException exception = assertThrows(ResponseException.class,
                                () -> communicator.post("/post", null, null, multipart, Map.class, null));

                        assertEquals(400, exception.getStatusCode());
                        assertEquals(errorBody, exception.getBody());
                    }

                    Map<String, Part> parts = takeMultipartRequest("POST", "/post");
                    assertEquals(1, parts.size());
                    assertFilePart(parts, "file", "file.txt", "text/plain", "file content");
                }
            }
        }

        @Nested
        class WithMultipartFormDataRequest {

            @Test
            void shouldPostWithResponse() throws Exception {
                server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                try (Communicator communicator = createCommunicator();
                        InputStream content = createTestFileStream("file content")) {

                    MultipartFormDataObject multipart = new MultipartFormDataObject();
                    multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
                    multipart.addValue("value", "Hello World");
                    MultipartFormDataRequest request = () -> multipart;

                    @SuppressWarnings("unchecked")
                    Map<String, Object> response = communicator.post("/post", null, null, request, Map.class, null);

                    assertOkResponse(response);
                }

                Map<String, Part> parts = takeMultipartRequest("POST", "/post");
                assertEquals(2, parts.size());
                assertFilePart(parts, "file", "file.txt", "text/plain", "file content");
                assertValuePart(parts, "value", "Hello World");
            }

            @Test
            void shouldPostWithBodyHandler() throws Exception {
                server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                AtomicBoolean handled = new AtomicBoolean();

                try (Communicator communicator = createCommunicator();
                        InputStream content = createTestFileStream("file content")) {

                    MultipartFormDataObject multipart = new MultipartFormDataObject();
                    multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
                    multipart.addValue("value", "Hello World");
                    MultipartFormDataRequest request = () -> multipart;

                    communicator.post("/post", null, null, request, (bodyStream, headers) -> {
                        @SuppressWarnings("unchecked")
                        Map<String, Object> response = DefaultMarshaller.INSTANCE.unmarshal(bodyStream, Map.class);

                        assertOkResponse(response);
                        handled.set(true);
                    }, null);
                }

                assertTrue(handled.get(), "body handler was not called");

                Map<String, Part> parts = takeMultipartRequest("POST", "/post");
                assertEquals(2, parts.size());
                assertFilePart(parts, "file", "file.txt", "text/plain", "file content");
                assertValuePart(parts, "value", "Hello World");
            }
        }
    }

    @Nested
    class WhenPuttingMultipartFormData {

        @Nested
        class WithMultipartFormDataObject {

            @Test
            void shouldPutWithResponse() throws Exception {
                server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                try (Communicator communicator = createCommunicator();
                        InputStream content = createTestFileStream("file content")) {

                    MultipartFormDataObject multipart = new MultipartFormDataObject();
                    multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
                    multipart.addValue("value", "Hello World");

                    @SuppressWarnings("unchecked")
                    Map<String, Object> response = communicator.put("/put", null, null, multipart, Map.class, null);

                    assertOkResponse(response);
                }

                Map<String, Part> parts = takeMultipartRequest("PUT", "/put");
                assertEquals(2, parts.size());
                assertFilePart(parts, "file", "file.txt", "text/plain", "file content");
                assertValuePart(parts, "value", "Hello World");
            }

            @Test
            void shouldPutWithBodyHandler() throws Exception {
                server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                AtomicBoolean handled = new AtomicBoolean();

                try (Communicator communicator = createCommunicator();
                        InputStream content = createTestFileStream("file content")) {

                    MultipartFormDataObject multipart = new MultipartFormDataObject();
                    multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
                    multipart.addValue("value", "Hello World");

                    communicator.put("/put", null, null, multipart, (bodyStream, headers) -> {
                        @SuppressWarnings("unchecked")
                        Map<String, Object> response = DefaultMarshaller.INSTANCE.unmarshal(bodyStream, Map.class);

                        assertOkResponse(response);
                        handled.set(true);
                    }, null);
                }

                assertTrue(handled.get(), "body handler was not called");

                Map<String, Part> parts = takeMultipartRequest("PUT", "/put");
                assertEquals(2, parts.size());
                assertFilePart(parts, "file", "file.txt", "text/plain", "file content");
                assertValuePart(parts, "value", "Hello World");
            }
        }

        @Nested
        class WithMultipartFormDataRequest {

            @Test
            void shouldPutWithResponse() throws Exception {
                server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                try (Communicator communicator = createCommunicator();
                        InputStream content = createTestFileStream("file content")) {

                    MultipartFormDataObject multipart = new MultipartFormDataObject();
                    multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
                    multipart.addValue("value", "Hello World");
                    MultipartFormDataRequest request = () -> multipart;

                    @SuppressWarnings("unchecked")
                    Map<String, Object> response = communicator.put("/put", null, null, request, Map.class, null);

                    assertOkResponse(response);
                }

                Map<String, Part> parts = takeMultipartRequest("PUT", "/put");
                assertEquals(2, parts.size());
                assertFilePart(parts, "file", "file.txt", "text/plain", "file content");
                assertValuePart(parts, "value", "Hello World");
            }

            @Test
            void shouldPutWithBodyHandler() throws Exception {
                server.enqueue(jsonResponse(OK_RESPONSE_BODY));

                AtomicBoolean handled = new AtomicBoolean();

                try (Communicator communicator = createCommunicator();
                        InputStream content = createTestFileStream("file content")) {

                    MultipartFormDataObject multipart = new MultipartFormDataObject();
                    multipart.addFile("file", new UploadableFile("file.txt", content, "text/plain"));
                    multipart.addValue("value", "Hello World");
                    MultipartFormDataRequest request = () -> multipart;

                    communicator.put("/put", null, null, request, (bodyStream, headers) -> {
                        @SuppressWarnings("unchecked")
                        Map<String, Object> response = DefaultMarshaller.INSTANCE.unmarshal(bodyStream, Map.class);

                        assertOkResponse(response);
                        handled.set(true);
                    }, null);
                }

                assertTrue(handled.get(), "body handler was not called");

                Map<String, Part> parts = takeMultipartRequest("PUT", "/put");
                assertEquals(2, parts.size());
                assertFilePart(parts, "file", "file.txt", "text/plain", "file content");
                assertValuePart(parts, "value", "Hello World");
            }
        }
    }

    private Communicator createCommunicator() throws URISyntaxException {
        URI apiEndpoint = new URI("http", null, server.getHostName(), server.getPort(), null, null, null);
        return new CommunicatorBuilder()
                .withAPIEndpoint(apiEndpoint)
                .withConnection(new DefaultConnectionBuilder(5000, 10000).build())
                .withAuthenticator((httpMethod, resourceUri, requestHeaders) -> AUTHORIZATION)
                .withMetadataProvider(new MetadataProvider("Worldline"))
                .withMarshaller(DefaultMarshaller.INSTANCE)
                .build();
    }

    private static MockResponse jsonResponse(String body) {
        return new MockResponse()
                .setResponseCode(200)
                .addHeader("Content-Type", "application/json")
                .setBody(body);
    }

    private static InputStream createTestFileStream(String content) {
        return new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));
    }

    private static void assertOkResponse(Map<String, Object> response) {
        assertNotNull(response);
        assertEquals("ok", response.get("status"));
    }

    private RecordedRequest takeRequest() throws InterruptedException {
        RecordedRequest recordedRequest = server.takeRequest(REQUEST_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        assertNotNull(recordedRequest, "no request was received by the mock server");
        return recordedRequest;
    }

    private Map<String, Part> takeMultipartRequest(String expectedMethod, String expectedPath) throws InterruptedException {
        return parseMultipartRequest(takeRequest(), expectedMethod, expectedPath);
    }

    /**
     * Verifies the request line and headers of a multipart/form-data request, and parses its body into parts keyed by parameter name.
     */
    private static Map<String, Part> parseMultipartRequest(RecordedRequest recordedRequest, String expectedMethod, String expectedPath) {
        assertEquals(expectedMethod, recordedRequest.getMethod());
        assertEquals(expectedPath, recordedRequest.getPath());
        assertEquals(AUTHORIZATION, recordedRequest.getHeader("Authorization"));

        String contentType = recordedRequest.getHeader("Content-Type");
        assertNotNull(contentType, "Content-Type header is missing");
        String contentTypePrefix = "multipart/form-data; boundary=";
        assertTrue(contentType.startsWith(contentTypePrefix), "unexpected Content-Type: " + contentType);
        String boundary = contentType.substring(contentTypePrefix.length());
        assertFalse(boundary.isEmpty(), "boundary is empty");

        String body = new String(recordedRequest.getBody().readByteArray(), StandardCharsets.ISO_8859_1);
        String delimiter = "--" + boundary;
        String closeDelimiter = delimiter + "--";
        assertTrue(body.startsWith(delimiter + "\r\n"), "body does not start with the boundary delimiter");
        assertTrue(body.endsWith(closeDelimiter + "\r\n") || body.endsWith(closeDelimiter),
                "body does not end with the closing boundary delimiter");

        Map<String, Part> parts = new LinkedHashMap<>();
        String[] segments = body.substring(0, body.lastIndexOf(closeDelimiter)).split(Pattern.quote(delimiter), -1);
        assertEquals("", segments[0]);
        for (int i = 1; i < segments.length; i++) {
            Part part = Part.parse(segments[i]);
            assertNull(parts.put(part.name, part), "duplicate part: " + part.name);
        }

        return parts;
    }

    private static void assertFilePart(Map<String, Part> parts, String name, String fileName, String contentType, String content) {
        assertFilePart(parts, name, fileName, contentType, content.getBytes(StandardCharsets.UTF_8));
    }

    private static void assertFilePart(Map<String, Part> parts, String name, String fileName, String contentType, byte[] content) {
        Part part = parts.get(name);
        assertNotNull(part, "missing part: " + name);
        assertEquals(fileName, part.fileName);
        assertEquals(contentType, part.getMimeType());
        assertArrayEquals(content, part.content);
    }

    private static void assertValuePart(Map<String, Part> parts, String name, String value) {
        Part part = parts.get(name);
        assertNotNull(part, "missing part: " + name);
        assertNull(part.fileName, "value part should not have a filename");
        assertEquals("text/plain", part.getMimeType());
        assertEquals("utf-8", lowerCase(part.getCharset()));
        assertEquals(value, new String(part.content, StandardCharsets.UTF_8));
    }

    private static String lowerCase(String value) {
        return value != null ? value.toLowerCase(Locale.ROOT) : null;
    }

    private static final class Part {

        private final String name;
        private final String fileName;
        private final Map<String, String> headers;
        private final byte[] content;

        private Part(String name, String fileName, Map<String, String> headers, byte[] content) {
            this.name = name;
            this.fileName = fileName;
            this.headers = headers;
            this.content = content;
        }

        /**
         * Parses the text between two boundary delimiters: CRLF, headers, CRLF CRLF, content, CRLF.
         */
        private static Part parse(String segment) {
            assertTrue(segment.startsWith("\r\n"), "part does not start with CRLF");
            assertTrue(segment.endsWith("\r\n"), "part does not end with CRLF");
            String rawPart = segment.substring(2, segment.length() - 2);

            int headerEnd = rawPart.indexOf("\r\n\r\n");
            assertTrue(headerEnd >= 0, "part has no header separator");

            Map<String, String> headers = new LinkedHashMap<>();
            for (String headerLine : rawPart.substring(0, headerEnd).split("\r\n")) {
                int colon = headerLine.indexOf(':');
                assertTrue(colon > 0, "invalid part header: " + headerLine);
                headers.put(lowerCase(headerLine.substring(0, colon).trim()), headerLine.substring(colon + 1).trim());
            }

            String contentDisposition = headers.get("content-disposition");
            assertNotNull(contentDisposition, "part has no Content-Disposition header");
            assertTrue(contentDisposition.startsWith("form-data;"), "unexpected Content-Disposition: " + contentDisposition);

            Matcher nameMatcher = NAME_PATTERN.matcher(contentDisposition);
            assertTrue(nameMatcher.find(), "Content-Disposition has no name: " + contentDisposition);
            Matcher fileNameMatcher = FILENAME_PATTERN.matcher(contentDisposition);
            String fileName = fileNameMatcher.find() ? fileNameMatcher.group(1) : null;

            byte[] content = rawPart.substring(headerEnd + 4).getBytes(StandardCharsets.ISO_8859_1);
            return new Part(nameMatcher.group(1), fileName, headers, content);
        }

        private String getMimeType() {
            String contentType = headers.get("content-type");
            assertNotNull(contentType, "part " + name + " has no Content-Type header");
            int semicolon = contentType.indexOf(';');
            return (semicolon >= 0 ? contentType.substring(0, semicolon) : contentType).trim();
        }

        private String getCharset() {
            String contentType = headers.get("content-type");
            assertNotNull(contentType, "part " + name + " has no Content-Type header");
            for (String parameter : contentType.split(";")) {
                String trimmed = parameter.trim();
                if (lowerCase(trimmed).startsWith("charset=")) {
                    return trimmed.substring("charset=".length());
                }
            }
            return null;
        }
    }
}
