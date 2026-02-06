package tests;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class WithoutStatic {

	@Test
	public void testing()
	
	
	{
		RestAssured.baseURI="https://reqres.in/";
		Response res=RestAssured.get("/api/users?page=2");
		Assert.assertEquals(200, res.getStatusCode());
		Assert.assertEquals("HTTP/1.1 200 OK", res.getStatusLine());
		//res.getBody().hasItems("data.first_name","");
	}
}
