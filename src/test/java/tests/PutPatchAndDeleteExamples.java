package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutPatchAndDeleteExamples 
{
	//@Test
	public void testPost()
	{
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", "Chikkegowda");
		map.put("job", "IT Proffesion");
		System.out.println(map);
		JSONObject request= new JSONObject(map);
		System.out.println(request.toJSONString());
		
		baseURI="https://reqres.in/api";
		given().header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().put("/users/2").
		then().statusCode(200).log().all();
		/*
		 * given().body(request.toJSONString()). when().post("/users").
		 * then().statusCode(201).log().all();
		 */
		
		
	}
	
	@Test
	public void testPatch()
	{
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("name", "gowda");
		map.put("job", "IT Proffesion");
		System.out.println(map);
		JSONObject request= new JSONObject(map);
		System.out.println(request.toJSONString());
		
		baseURI="https://reqres.in";
		given().header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().patch("/api/users/2").
		then().statusCode(200).log().all();
		/*
		 * given().body(request.toJSONString()). when().post("/users").
		 * then().statusCode(201).log().all();
		 */
		
		
	}
	
	@Test
	public void testDelete()
	{
		
		baseURI="https://reqres.in";
		
		when().delete("/api/users/2").
		then().statusCode(204).log().all();
		/*
		 * given().body(request.toJSONString()). when().post("/users").
		 * then().statusCode(201).log().all();
		 */
		
		
	}
	
	
	

}
