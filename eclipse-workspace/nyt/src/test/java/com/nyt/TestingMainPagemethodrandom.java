package com.nyt;

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

public class TestingMainPagemethodrandom {

	WebDriver driver;
	String title = "The New York Times - Breaking News, World News & Multimedia";
	String mainPage = "https://g1.nyt.com/assets/collection/20180621-170233/images/foundation/logos/nyt-logo-185x26.png";
	String worldSection = "World";
	String usSection = "U.S.";
	String politicsSection = "Politics";
	String nySection = "New York";
	String businessSection = "Business Day";
	String opinionSection = "Opinion";
	String techSection = "Technology";
	String scienceSection = "Science";
	String healthSection = "Health";
	String sportsSection = "Sports";
	String artsSection = "Arts";
	String booksSection = "Books";
	String travelSection = "Travel";
	String realEstateSection = "Real Estate";
	String educationSection = "Education";
	String obituariesSection = "Obituaries";
	String todaysPaperSection = "Today’s Paper";
	String opEdColumnistsSection = "Op-Ed Columnists";
	String editorialsSection = "Editorials";
	String opEdContributorsSection = "Contributors";
	String lettersSection = "Letters to the Editor";
	String sundaySection = "Sunday Review";
	String videoSection = " Opinion Video Channel - NYTimes.com";

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
//		driver.findElement(By.className("shortcuts-9A43D8FC-F4CF-44D9-9B34-138D30468F8F ")).click();
//		verifyGoBackToMainPageVerify(worldSection);
//		 
//		driver.findElement(By.className("shortcuts-23FD6C8B-62D5-4CEA-A331-6C2A9A1223BE ")).click();
//		verifyGoBackToMainPageVerify(usSection);

		 driver.findElement(By.className("shortcuts-80E6DEE6-87E4-4AD0-9152-14FA6B07E5AB")).click();
		verifyGoBackToMainPageVerify(politicsSection);
		 driver.findElement(By.className("shortcuts-C4DC8C0C-E148-4201-BF10-82F1C903DBFB")).click();
		verifyGoBackToMainPageVerify(nySection);
		// Assert.assertTrue(nySection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// driver.findElement(By.id("branding-heading-link")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		//
		// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/business']")).click();
		// Assert.assertTrue(businessSection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// driver.findElement(By.id("branding-heading-link")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/opinion']")).click();
		// Assert.assertTrue(opinionSection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// driver.findElement(By.id("branding-heading-link")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/technology']")).click();
		// Assert.assertTrue(techSection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// driver.findElement(By.id("branding-heading-link")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/science']")).click();
		// Assert.assertTrue(scienceSection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// driver.findElement(By.id("branding-heading-link")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/health']")).click();
		// Assert.assertTrue(healthSection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// driver.findElement(By.id("branding-heading-link")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/sports']")).click();
		// Assert.assertTrue(sportsSection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// driver.findElement(By.id("branding-heading-link")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/arts']")).click();
		// Assert.assertTrue(artsSection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// driver.findElement(By.id("branding-heading-link")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/books']")).click();
		// Assert.assertTrue(booksSection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// driver.findElement(By.id("branding-heading-link")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/travel']")).click();
		// Assert.assertTrue(travelSection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// driver.findElement(By.id("branding-heading-link")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/realestate']")).click();
		// Assert.assertTrue(realEstateSection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// driver.findElement(By.id("branding-heading-link")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));

		//// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/fashion']")).click();
		//// driver.findElement(By.id("branding-heading-link")).click();
		//// Assert.assertTrue(driver.getTitle().equals(title));
		//// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/dining/index.html']")).click();
		//// driver.findElement(By.id("branding-heading-link")).click();
		//// Assert.assertTrue(driver.getTitle().equals(title));
		//// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/magazine']")).click();
		//// driver.findElement(By.id("branding-heading-link")).click();
		//// Assert.assertTrue(driver.getTitle().equals(title));
		//// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/t-magazine']")).click();
		//// driver.findElement(By.id("branding-heading-link")).click();
		//// Assert.assertTrue(driver.getTitle().equals(title));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		// jse.executeScript("window.scrollBy(0,10000)", "");
		// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/education']")).click();
		// Assert.assertTrue(educationSection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// driver.findElement(By.id("branding-heading-link")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		// jse.executeScript("window.scrollBy(0,10000)", "");
		// driver.findElement(By.xpath("//*[@id=\"site-index-navigation\"]/div/div[1]/ul/li[11]/a")).click();
		// Assert.assertTrue(obituariesSection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// driver.findElement(By.id("branding-heading-link")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		// jse.executeScript("window.scrollBy(0,10000)", "");

		// *[@id="site-index-navigation"]/div/div[1]/ul/li[11]/a

		// driver.findElement(By.xpath("//*[@id=\"site-index-navigation\"]/div/div[1]/ul/li[12]/a")).click();
		// Assert.assertTrue(todaysPaperSection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@id=\"branding-heading-link\"]/svg/image")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));

		// driver.findElement(By.xpath("//*[@id=\"site-index-navigation\"]/div/div[2]/ul/li[1]/a")).click();
		// Assert.assertTrue(opinionSection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// driver.findElement(By.id("branding-heading-link")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/opinion/columnists']")).click();
		// Assert.assertTrue(opEdColumnistsSection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// driver.findElement(By.id("branding-heading-link")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/opinion/editorials']")).click();
		// Assert.assertTrue(editorialsSection.equals(driver.findElement(By.xpath("//h1[@class='css-rp1nnv
		// ea7896o0']")).getText()));
		// driver.findElement(By.xpath("//a[@aria-label='New York Times Logo. Click to
		// visit the homepage']")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/opinion/contributors']")).click();
		// Assert.assertTrue(opEdContributorsSection.equals(driver.findElement(By.xpath("//h1[@class='css-rp1nnv
		// ea7896o0']")).getText()));
		// driver.findElement(By.xpath("//a[@aria-label='New York Times Logo. Click to
		// visit the homepage']")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/opinion/letters']")).click();
		// Assert.assertTrue(lettersSection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// driver.findElement(By.xpath("//a[@id='branding-heading-link']")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/opinion/sunday']")).click();
		// Assert.assertTrue(sundaySection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
		// driver.findElement(By.xpath("//a[@id='branding-heading-link']")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/video/opinion']")).click();
		//// String kkll = (driver.getTitle());
		//// System.out.println(kkll);
		//// Assert.assertFalse(kkll.equals(driver.getTitle())); // title problem
		// driver.findElement(By.xpath("//button[@class='button
		// home-button']")).click();
		// Assert.assertTrue(driver.getTitle().equals(title));
		//

	}

	// @Test
	// public void allButtonTests() {
	// driver.findElement(By.xpath("//*[@id=\"mini-navigation\"]/ul/li[27]/button")).click();
	// //*[@id="mini-navigation"]/ul/li[27]/button
	//
	// }

	// @Test
	// public void readFromBottom() throws InterruptedException {
	// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// driver.get("http://nyt.com");
	// Thread.sleep(5000);
	// JavascriptExecutor jse = (JavascriptExecutor)driver;
	// jse.executeScript("window.scrollBy(0,10000)", "");
	// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/world']")).click();
	// Assert.assertTrue(worldSection.equals(driver.findElement(By.xpath("//h1[@class='collection-heading']")).getText()));
	// driver.findElement(By.id("branding-heading-link")).click();
	// Assert.assertTrue(driver.getTitle().equals(title));
	// }
	// @Test
	// public void myki() {
	// String actual1 =
	// driver.findElement(By.xpath("//h1[@itemprop='name']")).getText();
	// String expected1 =
	// driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/world'")).getText();
	// System.out.println(expected1);
	// System.out.println(actual1);
	// Assert.assertTrue(expected1.equals(actual1));
	//
	// }
	// @AfterMethod
	// public void tearDownTest() {
	// driver.close();
	// System.out.println("Method ends");
	// }

}
