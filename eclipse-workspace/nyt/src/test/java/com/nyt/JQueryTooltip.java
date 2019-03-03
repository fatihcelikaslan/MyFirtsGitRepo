package com.nyt;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryTooltip {
  
  WebDriver driver;
  @BeforeClass
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().fullscreen();
  }
  @Test
  public void test() throws Exception {

    String baseUrl = "http://demo.guru99.com/test/tooltip.html";
    String expectedTooltip = "What's new in 3.2";
    driver.get(baseUrl);

    WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));
    Actions builder = new Actions(driver);
    Thread.sleep(2000);
    builder.clickAndHold().moveToElement(download);
    builder.moveToElement(download).build().perform();
    Thread.sleep(1000);
    
    takeSnapShot(driver, "/Users/fcelikaslan/Desktop/ScreenShots/test.jpg");
    WebElement toolTipElement = driver.findElement(By.xpath(".//*[@class='box']/div/a"));
    String actualTooltip = toolTipElement.getText();

    System.out.println("Actual Title of Tool Tip  " + actualTooltip);
    if (actualTooltip.equals(expectedTooltip)) {
      System.out.println("Test Case Passed");
    }
  }
    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);
        //Call getScreenshotAs method to create image file
                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
            //Move image file to new destination
                File DestFile=new File(fileWithPath);
                //Copy file at destination
                FileUtils.copyFile(SrcFile, DestFile);
    }
    @AfterMethod
    public void tearDown() {
      driver.close();
    }

}