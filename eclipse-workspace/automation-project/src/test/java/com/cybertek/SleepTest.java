package com.cybertek;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SleepTest {
	
	@Test
	public void test() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
	
	driver.findElement(By.tagName("button")).click();
	
	Thread.sleep(5000);
	
	WebElement message = driver.findElement(By.xpath("//h4[.='Hello World!']"));
	assertTrue(message.isDisplayed(), "Message is not displayed");
	
	}
	
	public static void pause(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
