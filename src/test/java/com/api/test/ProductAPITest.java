package com.api.test;

import org.testng.annotations.Test;

import com.api.base.ProductService;
import com.api.models.request.CustomerDetailsRequest;
import com.api.models.request.ProductRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;

public class ProductAPITest {

	@Test(description = "verify nested json")
	public void verifyNestedJson() throws JsonProcessingException {
		CustomerDetailsRequest customerdetails1 = new CustomerDetailsRequest("Chikke", "43432432", "Bangalore");
		CustomerDetailsRequest customerdetails2 = new CustomerDetailsRequest("Chikke", "342424", "Hassan");
		CustomerDetailsRequest [] customerArray= {customerdetails1,customerdetails2};
		ProductRequest productDetails = new ProductRequest("ApplePhone", "red", "testing", customerArray) ;

		ObjectMapper mapper = new ObjectMapper();
		
		
		String mydata = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(productDetails);
		System.out.println(mydata);
		  ProductService prodService= new ProductService(); 
		  Response res=prodService.postProduct(mydata);
		  System.out.println(res.asPrettyString());
	}

}
