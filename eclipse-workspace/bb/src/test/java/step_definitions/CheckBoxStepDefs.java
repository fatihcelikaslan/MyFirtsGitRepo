package step_definitions;



import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.CheckBoxesPage;
import pages.HerokuDragAndDropPage;
import pages.HerokuFileDownloadPage;
import pages.HerokuappHomePage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CheckBoxStepDefs {
	BrowserUtils bu = new BrowserUtils();
		
	HerokuappHomePage herHomePage = new HerokuappHomePage();
	CheckBoxesPage checkPage = new CheckBoxesPage();
	HerokuFileDownloadPage download = new HerokuFileDownloadPage();
	HerokuDragAndDropPage drag = new HerokuDragAndDropPage();
	
	@Given("User navigates to webpage")
	public void user_navigates_to_webpage() {
//		bu.setSpeed(10000);
		Driver.getDriver().get(ConfigurationReader.getProperty("url1"));
	}

	@Given("clicks to Checkboxes")
	public void clicks_to_Checkboxes() {
		herHomePage.checkBoxesLink.click();
	}

	@Then("check the first box")
	public void check_the_first_box() {
		checkPage.firstBox.click();;
	}

	@Then("uncheck the second box")
	public void uncheck_the_second_box() {
		checkPage.secondBox.click();
		String expected = "checkboxes";
	}
	
	@Given("User navigates to heroku homepage")
	public void user_navigates_to_heroku_homepage() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url1"));
	}

	@Given("clicks to File Download")
	public void clicks_to_File_Download() {
		herHomePage.fileDownloadLink.click();
	}
	
	@Then("Clicks Selena.txt to download")
	public void clicks_Selena_txt_to_download() {
		download.selenaTXTFileLink.click();
	}
	
	@Given("clicks to Drag and Drop link")
	public void clicks_to_Drag_and_Drop_link() {
		herHomePage.dragAndDropLink.click();
	}

	@Then("Moves A onto B")
	public void moves_A_onto_B() {
		Actions action = new Actions(Driver.getDriver());
		action.dragAndDrop(drag.columnA, drag.columnB).perform();
		
	}
	
}
