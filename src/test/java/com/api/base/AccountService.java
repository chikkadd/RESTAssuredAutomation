package com.api.base;

import io.restassured.response.Response;

public class AccountService extends BaseService{
	private static final String BASEPATH="/api/accounts";
	
	
	public Response postAccounts(String token,Object payload)
	{
		setAuthToken(token);
		return postRequest(payload, BASEPATH);
	}

}
