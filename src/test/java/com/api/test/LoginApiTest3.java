package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;
@Listeners(com.api.listners.TestListners.class)
public class LoginApiTest3 {
	@Test
	public void test3()
	{
	LoginRequest loginRequest= new LoginRequest("Chikke", "Sonika@10");
	AuthService authService=new AuthService();
	Response response=authService.login(loginRequest);
	System.out.println(response.asPrettyString());
	LoginResponse loginResponse=response.as(LoginResponse.class);
	System.out.println(loginResponse.getToken());
	System.out.println(loginResponse.getUsername());
	System.out.println(loginResponse.getId());
	Assert.assertNotNull(loginResponse.getToken());
	Assert.assertEquals(loginResponse.getEmail(),"chikkadd20@gmail.com");
	Assert.assertEquals(loginResponse.getUsername(),"Chikke");
	}
	
}
