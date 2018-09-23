package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class HerokuappHomePage {
	
	public HerokuappHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//a[@href='/checkboxes']")
	public WebElement checkBoxesLink;
	
	@FindBy(xpath="//a[@href='/download']")
	public WebElement fileDownloadLink;
	
	@FindBy(xpath="//a[@href='/drag_and_drop']")
	public WebElement dragAndDropLink;
}
