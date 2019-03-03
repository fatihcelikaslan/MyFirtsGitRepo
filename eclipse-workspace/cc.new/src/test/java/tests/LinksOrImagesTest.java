package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksOrImagesTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/fcelikaslan/Documents/selenium dependencies/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("https://amazon.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));
		System.out.println("All the links number on Amazon Homepage is: "+links.size());
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		for (int i = 0; i < links.size(); i++) {
			if(links.get(i).getAttribute("href")!= null) {
				activeLinks.add(links.get(i));
			}
		}
		System.out.println("Active links number on Amazon Homepage is: "+activeLinks.size());
		
		driver.close();
	}

}
