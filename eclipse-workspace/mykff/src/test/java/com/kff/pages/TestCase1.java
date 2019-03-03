package com.kff.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	//SPA-156
	@Test
	public void firstTestCase() throws InterruptedException {
		driver.get("https://www.kff.org");
		driver.findElement(By.xpath("//a[@class='menu']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/statedata']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("hs-eu-confirmation-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-254102\"]/a")).click();
		String expected = "State Health Facts | The Henry J. Kaiser Family Foundation";
		Assert.assertEquals(expected, driver.getTitle());
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int numberOfLinksOnStateFacts = links.size();
		System.out.println("Number of links: " + numberOfLinksOnStateFacts);
		for (WebElement link : links) {
			if (!link.getText().isEmpty()) {
				System.out.println(link.getText());
			}
		}
	}

		//SPA-23
	@Test
	public void secondTestCase() throws InterruptedException {  
		driver.get("https://www.kff.org/statedata");
		String searchTerm = "Health aid";
		driver.findElement(By.id("search-field")).sendKeys(searchTerm + Keys.ENTER);
		String expected = "Search | Search Results | " + searchTerm + " | The Henry J. Kaiser Family Foundation";
		Assert.assertEquals(expected, driver.getTitle());
		Thread.sleep(1000);
		driver.findElement(By.id("hs-eu-confirmation-button")).click();
		driver.findElement(By.xpath("//*[@id=\"data-center-search-results-wrapper\"]/div[4]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://www.kff.org/hivaids/state-indicator/samhsa-funding/']"))
				.click();
		String firstState = "Alabama";
		Assert.assertEquals(firstState,
				driver.findElement(By.xpath("//*[@id=\"center\"]/div/div[4]/div[1]/div/div[2]/div/span")).getText());

	}

	//SPA-158
	@Test
	public void fourthTestCase() throws InterruptedException {
		driver.get("https://www.kff.org/statedata");
		driver.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/demographics-and-the-economy/']"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.id("hs-eu-confirmation-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='https://www.kff.org/other/state-indicator/total-residents/']")).click();
		String alabama = "Alabama";
		String wyoming = "Wyoming";
		String actualFirstRow = driver
				.findElement(By.xpath("//*[@id=\"center\"]/div/div[4]/div[1]/div/div[2]/div/span")).getText();
		Assert.assertEquals(alabama, actualFirstRow);
		driver.findElement(By.id("agText")).click();
		actualFirstRow = driver.findElement(By.xpath("//*[@id=\"center\"]/div/div[4]/div[1]/div/div[2]/div/span"))
				.getText();
		Assert.assertEquals(wyoming, actualFirstRow);

	}

	//SPA-157
	@Test
	public void thirdTestCase() throws InterruptedException {
		driver.get("https://www.kff.org/statedata");
		driver.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/demographics-and-the-economy/']"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.id("hs-eu-confirmation-button")).click();
		driver.findElement(By.xpath("//a[@href='https://www.kff.org/other/state-indicator/total-residents/']")).click();
		String firstState = "Alabama";
		Assert.assertEquals(firstState,
				driver.findElement(By.xpath("//*[@id=\"center\"]/div/div[4]/div[1]/div/div[2]/div/span")).getText());
		String residentNrAlabama = "4,834,100";
		Assert.assertEquals(residentNrAlabama, driver
				.findElement(By.xpath("//*[@id=\"center\"]/div/div[4]/div[3]/div/div[1]/div[2]/div/span")).getText());
		driver.get("https://www.kff.org/statedata");
		driver.findElement(By.className("geo-picker")).click();
		driver.findElement(By.xpath("//*[@id=\"state-health-wrapper\"]/div[1]/select/option[2]")).click();
		driver.findElement(
				By.xpath("//a[@href='https://www.kff.org/state-category/demographics-and-the-economy/?state=al']"))
				.click();
		driver.findElement(By.xpath("//a[@href='https://www.kff.org/other/state-indicator/total-residents/?state=al']"))
				.click();
		Assert.assertEquals(firstState,
				driver.findElement(By.xpath("//*[@id=\"center\"]/div/div[4]/div[1]/div/div/div/span")).getText());
		Assert.assertEquals(residentNrAlabama, driver
				.findElement(By.xpath("//*[@id=\"center\"]/div/div[4]/div[3]/div/div[1]/div/div/span")).getText());
	}
	
	//SPA-159
	@Test
	public void fifthTestCase() throws InterruptedException {
		driver.get("https://www.kff.org/statedata");
		Assert.assertTrue(driver
				.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/demographics-and-the-economy/']"))
				.isEnabled());
		Assert.assertTrue(
				driver.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/health-costs-budgets/']"))
						.isEnabled());
		Assert.assertTrue(driver
				.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/health-coverage-uninsured/']"))
				.isEnabled());
		Assert.assertTrue(driver
				.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/health-insurance-managed-care/']"))
				.isEnabled());
		Assert.assertTrue(driver.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/health-reform/']"))
				.isEnabled());
		Assert.assertTrue(driver.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/health-status/']"))
				.isEnabled());
		Assert.assertTrue(
				driver.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/hivaids/']")).isEnabled());
		Assert.assertTrue(driver.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/medicaid-chip/']"))
				.isEnabled());
		Assert.assertTrue(
				driver.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/medicare/']")).isEnabled());
		Assert.assertTrue(driver
				.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/minority-health/']")).isEnabled());
		Assert.assertTrue(
				driver.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/providers-service-use/']"))
						.isEnabled());
		Assert.assertTrue(driver.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/womens-health/']"))
				.isEnabled());
		driver.findElement(By.className("geo-picker")).click();
		driver.findElement(By.xpath("//*[@id=\"state-health-wrapper\"]/div[1]/select/option[2]")).click();
		Assert.assertTrue(driver
				.findElement(By.xpath(
						"//a[@href='https://www.kff.org/state-category/demographics-and-the-economy/?state=al']"))
				.isEnabled());
		Assert.assertTrue(driver
				.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/health-costs-budgets/?state=al']"))
				.isEnabled());
		Assert.assertTrue(driver
				.findElement(
						By.xpath("//a[@href='https://www.kff.org/state-category/health-coverage-uninsured/?state=al']"))
				.isEnabled());
		Assert.assertTrue(driver
				.findElement(By.xpath(
						"//a[@href='https://www.kff.org/state-category/health-insurance-managed-care/?state=al']"))
				.isEnabled());
		Assert.assertTrue(
				driver.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/health-reform/?state=al']"))
						.isEnabled());
		Assert.assertTrue(
				driver.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/health-status/?state=al']"))
						.isEnabled());
		Assert.assertTrue(
				driver.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/hivaids/?state=al']"))
						.isEnabled());
		Assert.assertTrue(
				driver.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/medicaid-chip/?state=al']"))
						.isEnabled());
		Assert.assertTrue(
				driver.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/medicare/?state=al']"))
						.isEnabled());
		Assert.assertTrue(driver
				.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/minority-health/?state=al']"))
				.isEnabled());
		Assert.assertTrue(driver
				.findElement(
						By.xpath("//a[@href='https://www.kff.org/state-category/providers-service-use/?state=al']"))
				.isEnabled());
		Assert.assertTrue(
				driver.findElement(By.xpath("//a[@href='https://www.kff.org/state-category/womens-health/?state=al']"))
						.isEnabled());

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
