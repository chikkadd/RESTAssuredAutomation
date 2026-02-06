package com.api.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest {
	
	@Test(description = "verify if login API is working")
	public void apiTest()
	{
		RestAssured.baseURI="http://64.227.160.186:8080";
		//RestAssured.given();
		RequestSpecification X=RestAssured.given();
		RequestSpecification Y=X.header("content-type","application/json");
		RequestSpecification Z=Y.body("{\"username\": \"Chikke\", \"password\": \"Sonika@10\"}");
		
		Response response=Z.post("/api/auth/login");
		System.out.println(response.asPrettyString());
		
	}

}
