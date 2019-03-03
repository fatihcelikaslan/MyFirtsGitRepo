package com.cybertek;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorExamples {
	
	  @Test
	  public void test() {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("alert ('WARNING: Something is happening')");
	
	  }
	  @Test
	  public void scroll() {
		  WebDriverManager.chromedriver().setup();
		    WebDriver driver = new ChromeDriver();
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    driver.get("http://amazon.com");
		    
		    WebElement element = driver.findElement(By.xpath("//*[.='Get to Know Us']"));
		    js.executeScript("arguments[0].scrollIntoView(true)", element);
		    
	  }
	  
	  @Test
	  public void click() {
		  WebDriverManager.chromedriver().setup();
		    WebDriver driver = new ChromeDriver();
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    driver.get("http://amazon.com");
		    
		    WebElement element = driver.findElement(By.partialLinkText("Manage Your"));
		    js.executeScript("arguments[0].click()", element);
		    
		    
	  }
	
	
	
}
