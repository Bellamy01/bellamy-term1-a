package com.rw.sprite.integration;

import com.rw.sprite.dto.DoMathRequest;
import com.rw.sprite.util.InvalidOperatorException;
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
		DoMathRequest request = new DoMathRequest(5, 3, "+");
		double result = restTemplate.postForObject(url, request, Double.class);
		Assert.assertEquals(8, result);
	}

	@Test
	public void testDoMathEndpoint_Division() throws InvalidOperatorException {
		DoMathRequest request = new DoMathRequest(6, 3, "/");
		double result = restTemplate.postForObject(url, request, Double.class);
		Assert.assertEquals(2, result);
	}

	@Test
	public void testDoMathEndpoint_Multiplication() throws InvalidOperatorException {
		DoMathRequest request = new DoMathRequest(5, 3, "*");
		double result = restTemplate.postForObject(url, request, Double.class);
		Assert.assertEquals(15, result);
	}

	@Test
	public void testDoMathEndpoint_Subtraction() throws InvalidOperatorException {
		DoMathRequest request = new DoMathRequest(5, 3, "-");
		double result = restTemplate.postForObject(url, request, Double.class);
		Assert.assertEquals(2, result);
	}

}
