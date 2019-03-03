package com.nyt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Deneme {
	String bnm = "Mike";

	WebDriver driver;

	@BeforeMethod
	public void setupTesting() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Method begins");
	}
	
	@Test
	public void clickVerifyGoBackToMainPageVerify()  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		String actual = driver.getTitle();
		String expected = "Wikipedia";
		Assert.assertEquals(actual, expected);
		driver.findElement(By.xpath("//a[@id='js-link-box-en']")).click();
		driver.findElement(By.xpath("//input[@title='Search Wikipedia [ctrl-option-f]']")).sendKeys("Chuck Norris"+Keys.ENTER);

	}
	
	@Test
	public void Teytrer()  {
		String abc = driver.getCurrentUrl();
		Assert.assertNotEquals((abc ), bnm);
	
	}
	
	
	
	@AfterMethod
	public void tearDownTest() {
		driver.close();
		System.out.println("Method ends");
	}

}
