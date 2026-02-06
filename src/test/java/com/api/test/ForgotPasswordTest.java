package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPasswordTest {
	
	@Test(description = "validate forgot password API")
	public void forgotPassword()
	{
		AuthService authService=new AuthService();
		Response response=authService.forgotPassword("chikke0102@gmail.com");
		System.out.println(response.asPrettyString());
		
	}

}
