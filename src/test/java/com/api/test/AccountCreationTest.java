package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest 
{
	@Test(description = "validate signUpRequest")
	public void signUp()
	{
		SignUpRequest signUpRequest=new SignUpRequest.Builder().username("Chikkegowda").
		password("Sonika@10").
		email("chikke0102@gmail.com").
		firstname("Chikke").
		lastName("Gowda").
		mobileNumber("0123456789").build();
		System.out.println(signUpRequest.toString());
		AuthService authservice=new AuthService();
		Response response=authservice.signUp(signUpRequest);
		System.out.println(response.asPrettyString());
	}

}
