package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Log4JDemo {
	
		WebDriver driver;
		
		Logger logger = Logger.getLogger(Log4JDemo.class);
		
		@BeforeMethod
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "/Users/fcelikaslan/Documents/selenium dependencies/drivers/chromedriver");

			driver = new ChromeDriver();
			logger.info("Launching Chrome Browser");
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().fullscreen();
			driver.manage().deleteAllCookies();
			
			driver.get("https://google.com");
			logger.info("Entering application URL");
			logger.fatal("First fake fatal message");
	}
	
		@Test(priority = 1)
		public void test1() {
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Google");
			logger.info("Page title is Google right?");
		}
		
		@Test(priority = 2)
		public void test2() {
			boolean bool = driver.findElement(By.name("q")).isDisplayed();
			Assert.assertTrue(bool);
			logger.warn("Attention, this is a warning message");
			logger.error("This is fake error message");
			logger.fatal("This is just a fake fatal error message");
		}
		
		
		
		
		@AfterMethod
		public void tearDown() {
			driver.close();
		}
		
		
		
		
}
