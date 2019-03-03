package com.automationpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyTests {
	
	WebDriver driver;
	
	@BeforeClass //runs once for all tests
	public void setUp() {
		System.out.println("Setting up WebDriver in BeforeClass...");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}	
	
	@Test
	public void testProperty() {
		driver.get(ConfigLoader.getMyValue("URL2"));
		driver.findElement(By.id("email")).sendKeys(ConfigLoader.getMyValue("User"));;
		driver.findElement(By.id("authentication")).sendKeys(ConfigLoader.getMyValue("Password"));
	}

}
