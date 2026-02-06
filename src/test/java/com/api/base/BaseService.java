package com.api.base;

import static io.restassured.RestAssured.*;

import com.api.filters.LoggingFilter;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	//base URL
	//createing request
	//handling response
	
	private static String BaseURI="http://64.227.160.186:8080";
	private RequestSpecification requestSpecification;
	
	public BaseService()
	{
		requestSpecification=given().baseUri(BaseURI);
	}
	static
	{
		RestAssured.filters(new LoggingFilter());
	
	}
	
	public void setAuthToken(String token)
	{
		requestSpecification.header("Authorization","Bearer "+token);
	}
	public Response postRequest(Object payload, String endPoint)
	{
		
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endPoint);
	}
	
	public Response putRequest(Object payload, String endPoint)
	{
		
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endPoint);
	}
	public Response getRequest(String endPoint)
	{
		
		return requestSpecification.get(endPoint);
	}
	
	/*
	 * public Response postRequest(String baseURL,Object payload, String endPoint) {
	 * return
	 * requestSpecification.get(baseURL).contentType().body(payload).post(endPoint);
	 * }
	 */
}
