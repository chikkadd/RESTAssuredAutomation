package com.api.base;

import java.util.HashMap;

import io.restassured.response.Response;

public class AuthService extends BaseService{
	
	private static final String BASEPATH="/api/auth/";
	
	public Response login(Object payload)
	{
		return postRequest(payload, BASEPATH+"login");
	}
	public Response signUp(Object payload)
	{
		return postRequest(payload, BASEPATH+"signup");
	}
	public Response forgotPassword(String emailAddress)
	{
		HashMap<String, String> payload=new HashMap<String, String>();
		payload.put("email", emailAddress);
		return postRequest(payload, BASEPATH+"forgot-password");
	}


}
