package com.rw.sprite;

import io.restassured.response.ValidatableResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloTest extends AbstractTestNGSpringContextTests {

    private final static String BASE_URI = "http://localhost:";

    @LocalServerPort
    private int port;

    @Value("${server.servlet.context-path}")
    private String basePath;

    private ValidatableResponse response;

    @Test
    public void verifyController1()  {
        response = given().contentType("application/json")
                .header("Content-Type", "application/json")
                .when().get(BASE_URI + port + basePath + "/").then().statusCode(200);

        String Actual = response.extract().asString();
        System.out.println("Result :"+Actual);
        Assert.assertEquals("Hello World, Spring Boot!", Actual);
    }

    @Test
    public void verifyController2()   {
        response = given().contentType("application/json")
                .header("Content-Type", "application/json")
                .when().get(BASE_URI + port + basePath + "/automation").then().statusCode(200);

        String Actual = response.extract().asString();
        System.out.println("Result :"+Actual);
        Assert.assertEquals("Hello QA Automation!", Actual);
    }
}