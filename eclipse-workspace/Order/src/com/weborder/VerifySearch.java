package com.weborder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySearch {
	/*
	 * 1.Open browser
	 * 2.Open Etsy homepage
	 * 3.Enter search term
	 * 4.Verify the results page title contains the search term
	 * 5.Verify search entry is still saved in the search bar
	 */

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get(" http://www.etsy.com");
		driver.findElement(By.id("search-query")).sendKeys("Wooden spoons");
	}

}
