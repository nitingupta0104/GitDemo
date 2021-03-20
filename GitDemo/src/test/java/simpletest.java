import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class simpletest {
	
	@Test
	//this is a get method
	public void getMethod() {
		RestAssured.baseURI="https://reqres.in/api/users";
		//RestAssured.given().when().get("https://reqres.in/api/users?page=2").then().log().all();
		Response response= RestAssured.given().param("page", 2).when().get();
		
		System.out.println("Response body = " +response.getBody().asString());
		System.out.println("Content type = " +response.getContentType());
		System.out.println("Status Code = " +response.getStatusCode());
		
	}

}
