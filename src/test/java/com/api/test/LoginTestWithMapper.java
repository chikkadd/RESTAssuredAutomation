package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;

public class LoginTestWithMapper {
	
	@Test(description = "login test with mapper")
	public void loginTestWithMapper() throws JsonProcessingException
	{
		AuthService service= new AuthService();
		LoginRequest loginRequest= new LoginRequest();
		loginRequest.setUsername("Chikke");
		loginRequest.setPassword("Sonika@10");
		ObjectMapper mapper = new ObjectMapper();
		String loginDetails=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(loginRequest);
		System.out.println(loginDetails);
		Response response=service.login(loginDetails);
		Assert.assertEquals(response.statusCode(), 200, "Status code is not correct");
		Assert.assertEquals(response.statusLine().trim(), "HTTP/1.1 200", "Status line is not coming correctly");
		LoginResponse loginResponse=response.as(LoginResponse.class);
		Assert.assertEquals(loginResponse.getEmail(), "chikkadd20@gmail.com");
		
	}

}
