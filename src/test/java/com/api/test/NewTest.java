package com.api.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class NewTest {

	private static final String baseURL = "https://automationexercise.com/api/";

	@Test
	public void newTest() {

		RestAssured.get(baseURL + "productsList").then().statusCode(200);

	}

}
