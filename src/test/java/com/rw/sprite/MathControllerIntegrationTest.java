package com.rw.sprite;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MathControllerIntegrationTest {

	@LocalServerPort
	private int port;

	private final String url = "http://localhost:" + port + "/doMath";

	private final TestRestTemplate restTemplate = new TestRestTemplate();

	@Test
	public void testDoMathEndpoint_Addition() throws InvalidOperatorException {
		DoMathRequest request = new DoMathRequest(5, 3, "+")
		double result = restTemplate.postForObject(url, request, Double.class);
		Assert.assertEquals();
	}

}
