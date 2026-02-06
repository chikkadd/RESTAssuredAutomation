package test2;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class EmployeeTest {
	
	@Test
	public void getAllEmp()
	{
		/*
		 * RestAssured.baseURI="http://localhost:8080/employees/get"; Response
		 * res=RestAssured.given().request("");
		 * System.out.println(res.getBody().asString());
		 */
		baseURI="http://localhost:8080/employees/get";
		given().get().getBody().asString();
		
	}

}
