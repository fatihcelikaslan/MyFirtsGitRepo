package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PopupTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/fcelikaslan/Documents/selenium dependencies/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("http://www.popuptest.com/goodpopups.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
		
//		String origin = driver.getWindowHandle();
//		for(String origin : driver.getWindowHandles()) {
//			driver.switchTo().window(nameOrHandle)
//		}
		
		driver.close();

	}
//	public static void switchToWindow(String targetTitle) {
//		String origin = Driver.getDriver().getWindowHandle();
//		for (String handle : Driver.getDriver().getWindowHandles()) {
//			Driver.getDriver().switchTo().window(handle);
//			if (Driver.getDriver().getTitle().equals(targetTitle)) {
//				return;
//			}
//		}
//		Driver.getDriver().switchTo().window(origin);
//	}
}
