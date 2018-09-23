package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class HerokuFileDownloadPage {
	
	public HerokuFileDownloadPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//a[@href='download/dogs.jpeg']")
	public WebElement selenaTXTFileLink;

}
