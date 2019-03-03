package com.hltn.tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.hltn.utilities.BrowserUtils;
import com.hltn.utilities.ConfigurationReader;
import com.hltn.utilities.Driver;

public abstract class TestBase {
	protected WebDriver driver;
	protected Actions action;
	
	protected ExtentReports report;
	protected ExtentHtmlReporter htmlReporter;
	protected ExtentTest extentLogger;
	
	
	@BeforeTest
	public void setUpTest() {
		report = new ExtentReports();
		String filePath = System.getProperty("user.dir") + "/test-output/report.html";
		htmlReporter = new ExtentHtmlReporter(filePath);
	
		report.attachReporter(htmlReporter);
		report.setSystemInfo("ENV", "staging");
		report.setSystemInfo("browser", ConfigurationReader.getProperty("browser"));
		report.setSystemInfo("ENV", "staging");
	
		htmlReporter.config().setReportName("Hilton Automated Reports");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void setUp() {
		driver = Driver.getDriver();
		action = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		
		driver.get(ConfigurationReader.getProperty("url"));
	}
	@AfterMethod(alwaysRun = true)
	public void tearDown(ITestResult result) throws IOException{
		if (result.getStatus() == ITestResult.FAILURE) {
			String screenshotLocation = BrowserUtils.getScreenshot(result.getName());
		extentLogger.fail(result.getName());
		extentLogger.addScreenCaptureFromPath(screenshotLocation);
		extentLogger.fail(result.getThrowable());
		}else if (result.getStatus() == ITestResult.SKIP) {
			extentLogger.skip("Test Case Skipped is "+ result.getName());
		}
		Driver.closeDriver();
	}
	@AfterTest
	public void tearDownTest() {
		report.flush();
	}
	

}
