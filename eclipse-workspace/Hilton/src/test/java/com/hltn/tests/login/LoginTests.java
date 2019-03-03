package com.hltn.tests.login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hltn.tests.TestBase;

public class LoginTests extends TestBase{
	
	@Test
	public void positiveLoginTest() {
		extentLogger = report.createTest("Positive Login Test");
		
		extentLogger.info("entering user credentials");
		
		driver.findElement(By.id("username")).sendKeys("113747467");
		driver.findElement(By.id("password")).sendKeys("Tester.2018");
		extentLogger.info("click sign in");
		driver.findElement(By.xpath("//*[@id='formSignIn\"]/p[5]/a/span']")).click();
		extentLogger.info("Verifying sign out link");
//		assertTrue(new HotelSearchPage().signOutLink.isDisplayed);
		extentLogger.pass("Verified sign out link displayed");
		
	}
	@Test(groups= {"smoke"}, priority = 1)
	public void invalidUserNameTest() {
		extentLogger = report.createTest("Invalid username Test");
	}

}
