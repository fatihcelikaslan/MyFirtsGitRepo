package com.nyt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {
	WebDriver driver;
	
	@BeforeMethod
	public void setupTesting() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Method begins");
	}
	
	@Test
	public void myLinks() {
		driver.get("https://nyt.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int numberOfLinksOnNYT = links.size();
		System.out.println("Number of links: "+numberOfLinksOnNYT);
		for(WebElement link : links) {
			if(!link.getText().isEmpty()) {
			System.out.println(link.getText());
		}}
	
	
	
}}





	
