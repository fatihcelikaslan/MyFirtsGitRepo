package rest_api_testing;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class JSONPathExample2 {

  int newUserID ; 
  
  @BeforeClass
  public void init() {
    
    RestAssured.baseURI = "https://www.batch8-api-site.dev.cc" ; 
    RestAssured.basePath = "/wp-json/wp/v2" ; 
    
  }
  @Test
  public void testJSONPath() {
    
    Response response  = 
    
      given()
        .relaxedHTTPSValidation().
      //.auth().preemptive().basic("admin", "admin").
      when()
        .log().all()
        .get("http://ergast.com/api/f1/drivers.json",1) ;
    
    
    System.out.println( response.asString()  );
    response.prettyPrint();
    
    JsonPath jsonPath = response.jsonPath() ; 
    
    
    System.out.println( jsonPath.getString("_links.collection[0].href") );
    
    // title , slug , self
    
    
    //GET http://ergast.com/api/f1/drivers.json
    
    
    
  ;
    
    
  }
  
  
}
