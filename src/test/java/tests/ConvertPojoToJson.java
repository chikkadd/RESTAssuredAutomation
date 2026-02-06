package tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertPojoToJson 
{
	public static void main(String[] args) throws JsonProcessingException{
		Person person=new Person();
		person.setAge(16);
		person.setName("Chikke");
		ObjectMapper obj=new ObjectMapper();
		String json =obj.writerWithDefaultPrettyPrinter().writeValueAsString(person);
		System.out.println("Json object is ");
		System.out.println(json);
	}

}
