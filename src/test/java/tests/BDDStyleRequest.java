package tests;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
//import io.restassured.response.Response;
//import io.restassured.response.ValidatableResponse;
//import io.restassured.specification.RequestSpecification;

public class BDDStyleRequest {
	
	@Test
	public void GetBookingIds_VerifyStatusCode() {
		
		
		given().baseUri("https://restful-booker.herokuapp.com/booking").get().
		then().
		statusCode(200).
		statusLine("HTTP/1.1 200 OK").
		//body("bookingid.sum()", Matchers.hasSize(1703998)).
		body("bookingid[1]", Matchers.equalTo(1383));	
		//String resString=response.asString();
		//System.out.print("Response details "+resString);
		//ValidatableResponse valRes=response.then();
		
		//valRes.statusCode(200);
		//valRes.statusLine("HTTP/1.1 200 OK");
	}

}
