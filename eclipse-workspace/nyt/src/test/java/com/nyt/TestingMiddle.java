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

public class TestingMiddle {
	List<String> selected = new ArrayList<>();
	List<String> all = new ArrayList<>();
	List<String> allXpath = new ArrayList<>();
	
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
		all.add( "Arts");
		all.add("Books");
		all.add( "Travel");
		all.add("Real Estate");
		all.add( "Education");
		all.add( "Obituaries");
		
	}

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
	String opEdColumnistsSection = "Op-Ed Columnists";
	String editorialsSection = "Editorials";
	String opEdContributorsSection = "Contributors";
	String lettersSection = "Letters to the Editor";

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
		driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/world']")).click();
		verifyGoBackToMainPageVerify(worldSection);
		 
		driver.findElement(By.className("shortcuts-23FD6C8B-62D5-4CEA-A331-6C2A9A1223BE ")).click();
		verifyGoBackToMainPageVerify(usSection);

		 driver.findElement(By.className("shortcuts-80E6DEE6-87E4-4AD0-9152-14FA6B07E5AB ")).click();
		verifyGoBackToMainPageVerify(politicsSection);
		
		 driver.findElement(By.className("shortcuts-C4DC8C0C-E148-4201-BF10-82F1C903DBFB")).click();
		verifyGoBackToMainPageVerify(nySection);
		
		 driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/business']")).click();
			verifyGoBackToMainPageVerify(businessSection);
			
		driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/opinion']")).click();
			verifyGoBackToMainPageVerify(opinionSection);
			
		driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/technology']")).click();
		verifyGoBackToMainPageVerify(techSection);	
		
		driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/science']")).click();
		verifyGoBackToMainPageVerify(scienceSection);
		
		driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/health']")).click();
		verifyGoBackToMainPageVerify(healthSection);
		
		driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/sports']")).click();
		verifyGoBackToMainPageVerify(sportsSection);
		
		driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/arts']")).click();
		verifyGoBackToMainPageVerify(artsSection);
		
		driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/books']")).click();
		verifyGoBackToMainPageVerify(booksSection);
		
		driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/travel']")).click();
		verifyGoBackToMainPageVerify(travelSection);
		
		driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/realestate']")).click();
		verifyGoBackToMainPageVerify(realEstateSection);
		
		driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/education']")).click();
		verifyGoBackToMainPageVerify(educationSection);
		
		driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/obituaries']")).click();
		verifyGoBackToMainPageVerify(obituariesSection);
		
		driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/opinion/contributors']")).click();
		verifyGoBackToMainPageVerify(opEdColumnistsSection);
			
		driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/opinion/editorials']")).click();
		verifyGoBackToMainPageVerify(editorialsSection);
		
		driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/opinion/contributors']")).click();
		verifyGoBackToMainPageVerify(opEdContributorsSection);
			
		driver.findElement(By.xpath("//a[@href='https://www.nytimes.com/section/opinion/letters']")).click();
		verifyGoBackToMainPageVerify(lettersSection);
		
	}
}
