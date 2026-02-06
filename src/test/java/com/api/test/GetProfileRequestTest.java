package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserServiceManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest {
	
	@Test
	public void getProfileRequestTest()
	{
		
		AuthService authService = new AuthService();
		Response res=authService.login(new LoginRequest("Chikke", "Sonika@10"));
		LoginResponse loginResponse=res.as(LoginResponse.class);
		System.out.println("Auth token is "+loginResponse.getToken());
		
		UserServiceManagementService userManagement=new UserServiceManagementService();
		Response userResponse=userManagement.getProfile(loginResponse.getToken());
		System.out.println(userResponse.asPrettyString());
		UserProfileResponse userprofileResponse=userResponse.as(UserProfileResponse.class);
		System.out.println(userprofileResponse.getUsername());
	}

}
