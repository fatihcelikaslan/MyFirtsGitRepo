package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class AmazonHomePage {
	public AmazonHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	public WebElement searchBox;
	
	@FindBy(xpath="//*[@id=\"nav-search\"]/form/div[2]/div/input")
	public WebElement searchButton;
	
	

}
