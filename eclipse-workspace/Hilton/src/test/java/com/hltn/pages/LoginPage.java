package com.hltn.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hltn.utilities.Driver;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(id="username")
	public WebElement userName;
	
	@FindBy(id="password")
	public WebElement password;
	
	@FindBy(xpath="//*[@id='formSignIn\"]/p[5]/a/span']")
	public WebElement loginButton;
	
	@FindBy(id="invalidCredentials")
	public WebElement invalidUserNameErrMessage;
	
	public void login(String uid, String pwd) {
		userName.sendKeys(uid);
		password.sendKeys(pwd);
		loginButton.click();
	}

}
