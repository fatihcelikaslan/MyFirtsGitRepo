package com.olympicsmedals;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OlympicsMedals {
	WebDriver driver;
	String url = "https://en.wikipedia.org/wiki/2016_Summer_Olympics#Medal_table";
	
	@BeforeMethod
	public void setupTesting() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		System.out.println("Method begins");
	}
	
	@Test
	public void findMedals() {
		driver.get(url);
		List<WebElement> listNum  = driver.findElements(By.xpath("//table[@class = 'wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/td[1]"));
		
		List<String> str = Arrays.asList();
		System.out.println();
		
		
//		Integer[] expected = {1,2,3,4,5,6,7,8,9,10};
//		Integer[] actual = new Integer[10];
//		for (int i = 0; i < listNum.size()-1; i++) {
//			actual[i] = Integer.parseInt(listNum.getText());
//			System.out.print(actual[i]);
//		}}
//		driver.findElement(By.xpath("<th scope=\"col\" class=\"headerSort headerSortUp\" tabindex=\"0\" role=\"columnheader button\" title=\"Sort descending\">NOC</th>")).click();
	}
	@Test
	public void getIndex() {
		driver.get("https://en.wikipedia.org/wiki/2016_Summer_Olympics");
	}
}
