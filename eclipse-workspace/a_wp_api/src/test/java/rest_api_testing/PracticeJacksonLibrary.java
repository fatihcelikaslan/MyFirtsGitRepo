package rest_api_testing;
import java.io.IOException;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class PracticeJacksonLibrary {
  @Test
  public void databindTest() throws Exception {
    String jsonString = "{\"name\" : \"Adam\",\"age\" : 21}" ; 
    ObjectMapper om  = new ObjectMapper() ; 
    Person obj = om.readValue( jsonString , Person.class ) ; 
    System.out.println(jsonString);
    System.out.println(obj);
    String convertedStr = om.writeValueAsString(obj) ; 
    System.out.println( convertedStr );

  }
  @Test
  public void databindTest2() throws Exception {
	  
    String jsonString = " {\n" + 
    		"                    \"driverId\": \"abate\",\n" + 
    		"                    \"url\": \"http://en.wikipedia.org/wiki/Carlo_Mario_Abate\",\n" + 
    		"                    \"givenName\": \"Carlo\",\n" + 
    		"                    \"familyName\": \"Abate\",\n" + 
    		"                    \"dateOfBirth\": \"1932-07-10\",\n" + 
    		"                    \"nationality\": \"Italian\"\n" + 
    		"                }" ; 
    
    ObjectMapper om  = new ObjectMapper() ; 
    Driver obj = om.readValue( jsonString , Driver.class ) ; 
    System.out.println(jsonString);
    System.out.println(obj);
    String convertedStr = om.writeValueAsString(obj) ; 
    System.out.println( convertedStr );

  }
  
  
}

class Person{
  
  String name; 
  int age ; 


  public Person() {
  }
  
  public Person(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + "]";
  }
  
  
  
}