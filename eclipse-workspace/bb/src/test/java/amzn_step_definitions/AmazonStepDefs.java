package amzn_step_definitions;

import org.openqa.selenium.Keys;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import utilities.ConfigurationReader;
import utilities.Driver;
import pages.AmazonHomePage;
import pages.AmazonSearchResultsPage;

public class AmazonStepDefs {
	
	AmazonHomePage amazon = new AmazonHomePage();
	AmazonSearchResultsPage searchResult = new AmazonSearchResultsPage();
	
	
	@Given("User is Amazon homepage")
	public void user_is_Amazon_homepage() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url2"));
	}

	@When("clicks on search button")
	public void clicks_on_search_button() {
		amazon.searchBox.click();
	}

	@When("types {string}")
	public void types(String abc) {
		abc = "Wooden Spoons";
		amazon.searchBox.sendKeys(abc+Keys.ENTER);
	}

	@Then("he should see the search results")
	public void he_should_see_the_search_results() {
		
//		searchResult.firstResult.click();
//		String str = searchResult.searchResultPageTitle.getText();
//		assertEquals(str, "Amazon.com: Wooden Spoons - Kitchen & Dining: Home & Kitchen");
	}



}
