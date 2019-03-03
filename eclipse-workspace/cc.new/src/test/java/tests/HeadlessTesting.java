package tests;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver",
                "/Users/fcelikaslan/Documents/selenium dependencies/drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        
        options.addArguments("headless");
        
        options.addArguments("window-size=1200x600");
        
        WebDriver driver = new ChromeDriver(options);
     
        driver.get("https://www.hilton.com");
        
        System.out.println("title is: " + driver.getTitle());
        
        TakesScreenshot ts = (TakesScreenshot) driver;
        
        File source = ts.getScreenshotAs(OutputType.FILE);
        
        String dest = "/Users/fcelikaslan/Desktop/HeadlessScreenshot.png";
        
        File destination = new File(dest);
        
        FileUtils.copyFile(source, destination);
        
        driver.close();
    }
}