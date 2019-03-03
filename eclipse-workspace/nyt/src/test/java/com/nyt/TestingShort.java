package com.nyt;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingShort {

	WebDriver driver;
	String title = "The New York Times - Breaking News, World News & Multimedia";
	String mainPage = "https://g1.nyt.com/assets/collection/20180621-170233/images/foundation/logos/nyt-logo-185x26.png";

	List<String> selected = new ArrayList<>();
	List<String> selectedXPath = new ArrayList<>();
	List<String> all = new ArrayList<>();
	List<String> allXPath = new ArrayList<>();

	public void selectSections() {
		all.add("World");
		all.add("U.S.");
		all.add("Politics");
		all.add("New York");
		all.add("Business Day");
		all.add("Opinion");
		all.add("Technology");
		all.add("Science");
		all.add("Health");
		all.add("Sports");
		all.add("Arts");
		all.add("Books");
		all.add("Style");
		all.add("Travel");
		all.add("Real Estate");
		all.add("Education");

		allXPath.add("//a[@href='https://www.nytimes.com/section/world']");
		allXPath.add("//a[@href='https://www.nytimes.com/section/us']");
		allXPath.add("//a[@href='https://www.nytimes.com/section/politics']");
		allXPath.add("//a[@href='https://www.nytimes.com/section/nyregion']");
		allXPath.add("//a[@href='https://www.nytimes.com/section/business']");
		allXPath.add("//a[@href='https://www.nytimes.com/section/opinion']");
		allXPath.add("//a[@href='https://www.nytimes.com/section/technology']");
		allXPath.add("//a[@href='https://www.nytimes.com/section/science']");
		allXPath.add("//a[@href='https://www.nytimes.com/section/health']");
		allXPath.add("//a[@href='https://www.nytimes.com/section/sports']");
		allXPath.add("//a[@href='https://www.nytimes.com/section/arts']");
		allXPath.add("//a[@href='https://www.nytimes.com/section/books']");
		allXPath.add("//a[@href='https://www.nytimes.com/section/fashion']");
		allXPath.add("//a[@href='https://www.nytimes.com/section/travel']");
		allXPath.add("//a[@href='https://www.nytimes.com/section/magazine']");
		allXPath.add("//a[@href='https://www.nytimes.com/section/t-magazine']");
		allXPath.add("//a[@href='https://www.nytimes.com/section/realestate']");
		allXPath.add("//a[@href='https://www.nytimes.com/section/education']");

		while (selected.size() < all.size() / 3) {
			Random r = new Random();
			int j = r.nextInt(all.size());
			if (!selected.contains(all.get(j))) {
				selected.add(all.get(j));
				selectedXPath.add(allXPath.get(j));
			}
		}
	}

	@BeforeMethod
	public void setupTesting() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://nyt.com");
		Thread.sleep(6000);
		System.out.println("Method begins");
	}

	public void verifyGoBackToMainPageVerify(String section) throws InterruptedException {
		Assert.assertTrue(section.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		System.out.println(driver.getTitle());
		driver.findElement(By.id("branding-heading-link")).click();
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().equals(title));
	}

	@Test
	public void clickSectionTest() throws InterruptedException {
		selectSections();
		for (int i = 0; i < selected.size(); i++) {
			System.out.println("Testing " + selected.get(i));
			driver.findElement(By.xpath(selectedXPath.get(i))).click();
			verifyGoBackToMainPageVerify(selected.get(i));
		}

	}

	@AfterMethod
	public void tearDownTest() {
		driver.close();
		System.out.println("Method ends");
	}

}