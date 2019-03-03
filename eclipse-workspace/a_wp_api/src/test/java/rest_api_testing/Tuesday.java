package rest_api_testing;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Tuesday {

  Faker faker = new Faker();
  int newUserID ; 
  
  @BeforeClass
  public void init() {
    
//    RestAssured.baseURI = "https://www.fatihcelikaslan.dev.cc" ; 
    RestAssured.baseURI = "http://ergast.com/api/f1/drivers.json" ; 
    RestAssured.basePath = "/wp-json/wp/v2" ; 
    
    
  }
  @Test
  public void simpleGetRequest() {
	  
	  Response response = 
    given()
      .relaxedHTTPSValidation()
    .when()
      .log().all()
      //.queryParam("per_page",2)
      .get("/posts")
      ;
	  JsonPath jp = response.jsonPath();
	  
	  
//	  System.out.println(jp.getString("author"));
	  List<Integer> lstNum = jp.getList("author", Integer.class);
	  System.out.println(lstNum);
	  
  }
  
  @Test
  public void getAllF1Drivers() {
	 Response res = given().when().get("http://ergast.com/api/f1/drivers.json");
	 JsonPath jp = res.jsonPath();
	 List<String> ls = jp.getList("MRData.DriverTable.Drivers.givenName", String.class);
	 System.out.println(ls);
	 
	 List<Object> abc = jp.get("MRData.DriverTable.Drivers.findAll{it.givenName.length()==3}");
	 System.out.println(abc);
  }
  
}