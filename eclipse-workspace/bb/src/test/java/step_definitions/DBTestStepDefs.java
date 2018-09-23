package step_definitions;

import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import utilities.ConfigurationReader;
import utilities.DBUtils;

public class DBTestStepDefs {
	
	
//	@Given("I go to db")
//	public void i_go_to_db() {
//	DBUtils.createConnection();
//	}
//
//	@When("Sending query {string}")
//	public void sending_query(String string) {
//		List<List<Object>> queryResultList = DBUtils.getQueryResultList(string);
//		System.out.println(queryResultList);
//	}
//
//	@Then("I should see {string}")
//	public void i_should_see_Steven_Nina_Lex(String string) {
//		
//		List<Object> abc = DBUtils.getColumnData(string, "3");
//		System.out.println(abc);
//	}
	@Given("I go to db")
	public void i_go_to_db() {
		DBUtils.createConnection();
	}

	@When("Sending query {string}")
	public void sending_query(String string) {
		List<List<Object>> queryResultList = DBUtils.getQueryResultList(string);
		
		System.out.println(queryResultList);
	}

	@Then("Sending another query {string}")
	public void sending_another_query(String string) {
		List<Object> abc = DBUtils.getColumnData(string, "JOB_TITLE");
		System.out.println(abc);
	}
	
	@Then("Get column data {string}")
	public void get_column_data(String string) throws Exception {
		int i = DBUtils.getRowCount();
		System.out.println("Row count: "+i);
		
	}

}
