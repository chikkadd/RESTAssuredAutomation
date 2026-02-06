package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserServiceManagementService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {
	
	@Test(description = "update the existing profile")
	public void updateProfileTest()
	{
		AuthService authservice=new AuthService();
		Response res=authservice.login(new LoginRequest("Chikke", "Sonika@10"));
		LoginResponse loginResponse=res.as(LoginResponse.class);
		System.out.println(res.asPrettyString());
		System.out.println("_________________________________________________________");
		UserServiceManagementService userService= new UserServiceManagementService();
		//res=userService.getProfile(loginResponse.getToken());
		//System.out.println(res.asPrettyString());
		//UserProfileResponse userProfileResponse=res.as(UserProfileResponse.class);
		//Assert.assertEquals(userProfileResponse.getFirstName(), "Chikke");
		System.out.println("______________________________________");
		ProfileRequest profileRequet=new ProfileRequest.Builder()
				.firstName("Chikke")
				.lastName("Hema")
				.email("chikke@yopmail.com")
				.mobileNumber("978654321").build();
		res=userService.updateProfile(loginResponse.getToken(), profileRequet);
		System.out.println(res.asPrettyString());
		
	}

}
