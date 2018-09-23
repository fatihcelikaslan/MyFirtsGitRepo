package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class HerokuDragAndDropPage {
	
	public HerokuDragAndDropPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="column-a")
	public WebElement columnA;
	
	@FindBy(id="column-b")
	public WebElement columnB;

}
