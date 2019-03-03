package stepdefinitions;

import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.DBUtils;

public class DBStepDefs {
	
	DBUtils db = new DBUtils();
	
	
	@Given("User enters query {string}")
	public void user_enters_query(String string) {
		DBUtils.createConnection();
		List<List<Object>> queryResultList = DBUtils.getQueryResultList(string);
		System.out.print(queryResultList);
	}

	@Then("The result should be {string}")
	public void the_result_should_be(String string) {
		List<List<Object>> queryResultList2 = DBUtils.getQueryResultList(string);
		System.out.print(queryResultList2);
		
		db.executeQuery("Select * from person");
		
	}
	

}
