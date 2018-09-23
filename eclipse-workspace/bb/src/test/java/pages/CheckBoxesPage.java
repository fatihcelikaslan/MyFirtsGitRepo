package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class CheckBoxesPage {

	public CheckBoxesPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id=\"checkboxes\"]/input[1]")
	public WebElement firstBox;
	
	@FindBy(xpath="//*[@id=\"checkboxes\"]/input[2]")
	public WebElement secondBox;
	
	@FindBy(id="checkboxes")
	public WebElement write;
	
	
}
