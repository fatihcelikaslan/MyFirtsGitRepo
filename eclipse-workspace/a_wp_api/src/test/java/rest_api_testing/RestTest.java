package rest_api_testing;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;

public class RestTest {
	
	
	
//	@Test
//	public void firstTest() {
//		
//		when().get("http://73.166.37.2:1000/ords/hr/employees/100").then().statusCode(200);
//	}
//	@Test
//	public void secondTest() {
//		when().get("http://73.166.37.2:1000/ords/hr/jobs")
//		.then().statusCode(200);}
//
//	
	@Test
	public void thirdTest() {
		when().get("http://73.166.37.2:1000/ords/hr/nhhn").then().statusCode(404);
	}
	@Test
	public void fourthTest() {
		given().relaxedHTTPSValidation()
		.when().get("https://www.fatihcelikaslan.dev.cc/wp-admin/post.php?post=26")
		.then().statusCode(200);
	}
	
//	@Test
//	public void fifthTest() {
//		
//		given().relaxedHTTPSValidation()
//		.when().get("https://www.fatihcelikaslan.dev.cc/wp-json/wp/v2/posts/23")
//		.then().statusCode(200)
//		.and().assertThat().body("id", equalTo(23))
//		.body("title.rendered", equalTo("SALAM BRO"))
//		;
//	}
	
//	@Test
//	public void sixthTest() {
//		
//		given().relaxedHTTPSValidation()
//		.when()
//		.log().all()
//		.get("https://www.fatihcelikaslan.dev.cc/wp-json/wp/v2/posts/23")
//		.then().statusCode(200)
//		.and().assertThat().body("id", equalTo(23))
//		.body("title.rendered", equalTo("SALAM BRO"))
//		;
//	}
	
//	@Test
//	public void seventhTest() {
//		
//		given().relaxedHTTPSValidation()
//		.when().get("https://www.fatihcelikaslan.dev.cc/wp-json/wp/v2/posts/23")
//		.then().statusCode(200)
//		.and().assertThat().body("id", equalTo(23))
//		.body("title.rendered", equalTo("SALAM BRO"))
//		.body("status", equalTo("publish"))
//		.body("author", equalTo(1))
//		;
//	}
	
		//didnot work
//	@Test
//	public void eighth_Test() {
//		
//		given().relaxedHTTPSValidation()
//		.when()
//		.log().all()
//		.get("/https://www.fatihcelikaslan.dev.cc/wp-json/wp/v2/posts/{id}", 23)
//		.then().statusCode(200)
//		.body("title.rendered", equalTo("SALAM BRO"))
//		;
//	}
	
//		@Test
//		public void shortUrl() {
//			RestAssured.baseURI = "https://www.fatihcelikaslan.dev.cc/wp-json";
//			basePath = "/wp/v2/";
//			
//			
//		}
	

}
