package com.rw.sprite.e2e;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpriteEndToEndTest {

    @LocalServerPort
    private int port;

    String url = "http://localhost:" + port + "/api/v1/doMath";

    HttpHeaders headers = new HttpHeaders();

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testAddition() {
        headers.setContentType(MediaType.APPLICATION_JSON);
        String requestBody = "{\"op1\": 2, \"op2\": 5, \"operation\": \"+\"}";

        HttpEntity<String> request = new HttpEntity<>(requestBody, headers);
        String response = restTemplate.postForObject(url, request, String.class);

        assertEquals("{ calcResponse: 20 }", response);
    }

    @Test
    public void testMultiplication() {
        headers.setContentType(MediaType.APPLICATION_JSON);
        String requestBody = "{\"op1\": 2, \"op2\": 5, \"operation\": \"*\"}";

        HttpEntity<String> request = new HttpEntity<>(requestBody, headers);
        String response = restTemplate.postForObject(url, request, String.class);

        assertEquals("{ calcResponse: 10 }", response);
    }

    @Test
    public void testSubtraction() {
        headers.setContentType(MediaType.APPLICATION_JSON);
        String requestBody = "{\"op1\": 2, \"op2\": 5, \"operation\": \"-\"}";

        HttpEntity<String> request = new HttpEntity<>(requestBody, headers);
        String response = restTemplate.postForObject(url, request, String.class);

        assertEquals("{ calcResponse: -3 }", response);
    }

    @Test
    public void testDivision() {
        headers.setContentType(MediaType.APPLICATION_JSON);
        String requestBody = "{\"op1\": 2, \"op2\": 5, \"operation\": \"/\"}";

        HttpEntity<String> request = new HttpEntity<>(requestBody, headers);
        String response = restTemplate.postForObject(url, request, String.class);

        assertEquals("{ calcResponse: 0.4 }", response);
    }
}