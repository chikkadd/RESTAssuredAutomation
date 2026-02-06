package com.api.base;

import io.restassured.response.Response;

public class ProductService extends BaseService{
	
private static final String BASEPATH="/api/products/";
	
	

	public Response postProduct(Object payload)
	{
		return postRequest(payload,BASEPATH+"Products");
	}

}
