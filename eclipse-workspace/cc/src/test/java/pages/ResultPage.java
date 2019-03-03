package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class ResultPage {
	public ResultPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id='result_1']/div/div[2]/div/div/a/img")
	public WebElement searchResult;
}
