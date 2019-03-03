package rest_api_testing;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;


public class RestAPITesting {
	
	@BeforeClass
	public void setUp() {
		RestAssured.baseURI = "https://www.fatihcelikaslan.dev.cc/wp-json/wp/v2" ;
		basePath = "/wo2/v2";
		
	}
	
	
	
	@Test
	public void simpleGetRequest() {
		given()
			.relaxedHTTPSValidation()
		.when()
			.log().all()
//			.queryParam("per_page", 1)
			.get("/posts/26")
			.then()
			.log().all()
			.body("id", equalTo(26))
//			.body("title.rendered", is("MONDAY POST"))
			.assertThat()
			.statusCode(200)
			;
		
	}

}
