package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class AmazonSearchResultsPage {
	public AmazonSearchResultsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="/html/head/title")
	public WebElement searchResultPageTitle;
	
	@FindBy(className="textContainer__text")
	public WebElement firstResult;
}
