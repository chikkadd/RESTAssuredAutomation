package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class LoginApiTest2 {
	@Test(description = "verify if login API is working")
	public void apiTest2()
	{
		AuthService auth=new AuthService();
		Response res=auth.login("{\"username\": \"Chikke\", \"password\": \"Sonika@10\"}");
		System.out.println(res.asPrettyString());
	}

}
