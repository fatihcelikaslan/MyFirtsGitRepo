package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/fcelikaslan/Documents/selenium dependencies/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
//		driver.findElement(By.xpath("//button")).click();
//		
//		Thread.sleep(2000);
//		alert.accept();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button")).click();
//		Thread.sleep(2000);
//		alert.dismiss();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button")).click();
//		System.out.println(alert.getText());
//		driver.switchTo().alert().accept();;
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
//		Thread.sleep(2000);
//		alert.accept();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
//		Thread.sleep(2000);
//		alert.dismiss();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id='result']")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Who");
		Thread.sleep(3000);
//		alert.accept();
		driver.close();
	}

}
