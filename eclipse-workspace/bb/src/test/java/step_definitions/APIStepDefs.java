package step_definitions;

import static io.restassured.RestAssured.given;

import utilities.ConfigurationReader;

import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIStepDefs {

	
	
	String token;
	Response responce;
	String user;

	@Given("I am logged reservation api using {string} and {string}")
	public void i_am_logged_reservation_api_using_and(String username, String password) {
		user = username;
		RestAssured.baseURI = ConfigurationReader.getProperty("qa1_base_url");

		Response res = RestAssured.given().param("email", username).param("password", password).when()
				.get(RestAssured.baseURI + "/sign");
		token = res.jsonPath().get("accessToken");
		System.out.println(token);

	}
	
	
}




