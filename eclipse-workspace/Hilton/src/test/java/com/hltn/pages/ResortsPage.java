package com.hltn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hltn.utilities.Driver;

public class ResortsPage {
	
	public ResortsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
	
	@FindBy(id="sign_in")
	public WebElement signInButton;
	
	public void signIn() {
		signInButton.click();
	}
	@FindBy(id="sign_out")
	public WebElement signOutLink;
	
	public void signOut() {
		signOutLink.click();
	}
	
	

}
