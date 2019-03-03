package tests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/fcelikaslan/Documents/selenium dependencies/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		// Launching the site.
		driver.get("http://demo.guru99.com/popup.php");

		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

		String MainWindow = driver.getWindowHandle();

		// To handle all new opened window.
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			String ChildWindow = i1.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

				// Switching to Child window
				driver.switchTo().window(ChildWindow);
				driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");

				driver.findElement(By.name("btnLogin")).click();

				// Closing the Child Window.
				driver.close();
			}
		}
		// Switching to Parent window i.e Main Window.
		driver.switchTo().window(MainWindow);
		driver.close();
	}
}