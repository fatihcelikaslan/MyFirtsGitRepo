package com.nyt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RandomMethods {
	WebDriver driver;
	String url = "https://nyt.com";

	@BeforeMethod
	public void before() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	@Test
	public void abc() {
		driver.get(url);
	}

}
