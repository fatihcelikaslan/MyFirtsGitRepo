package tests;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting2 {
    public static void main(String[] args) throws Exception{
        System.setProperty("webdriver.chrome.driver",
                "/Users/fcelikaslan/Documents/selenium dependencies/drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        
        options.addArguments("headless");
        
        options.addArguments("window-size=1200x600");
        
        WebDriver driver = new ChromeDriver(options);
     
        for (int i = 0; i < 4; i++) {
			
        driver.get("https://www.hilton.com");
        
        driver.get("https://google.com");
        
        System.out.println("title is: " + driver.getTitle());
        
        TakesScreenshot ts = (TakesScreenshot) driver;
        
        File source = ts.getScreenshotAs(OutputType.FILE);
        
        String dest1 = "/Users/fcelikaslan/Desktop/HeadlessScreenshot";
        
        String dest2 = ".png";
        
        String dest = dest1+i+dest2;
        
        File destination = new File(dest);
        
        FileUtils.copyFile(source, destination);
        
        
        }
        driver.close();
    }
}