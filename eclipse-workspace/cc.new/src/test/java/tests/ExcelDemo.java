package tests;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDemo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/fcelikaslan/Documents/selenium dependencies/drivers/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().fullscreen();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();

		String filePath = "/Users/fcelikaslan/Desktop/Login.xlsx";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet worksheet = workbook.getSheetAt(0);
		
		Row row = worksheet.getRow(1);
		
		Cell cellTest = row.getCell(0);
		
		Cell cellOne = row.getCell(1);
		
		Cell cellTwo = row.getCell(2);
		
		int rowsCount = worksheet.getPhysicalNumberOfRows()-1;
		
		List<String> listTest = new ArrayList<String>();
		
		List<String> listOne = new ArrayList<String>();
		
		List<String> listTwo = new ArrayList<String>();
		
		for (int rowNum = 1; rowNum <= rowsCount; rowNum++) {
			
			row = worksheet.getRow(rowNum);
			
			cellTest = row.getCell(0);
			
			cellOne = row.getCell(1);
			
			cellTwo = row.getCell(2);
			
			listOne.add(cellOne.toString());
			
			listTwo.add(cellTwo.toString());
			
		}
		
		int j = 0;
		
		int k = 0;
		
		for (int i = 0; i < rowsCount; i++) {
			
			driver.get("https://hilton.com");
			
			String str1 = listOne.get(j);
			
			String str2 = listTwo.get(k);
			
			driver.findElement(By.id("sign_in")).click();
			
			driver.findElement(By.id("username")).sendKeys(str1);
			
			driver.findElement(By.id("password")).sendKeys(str2);
			
			driver.findElement(By.xpath("//*[@id='formSignIn']/p[5]/a/span")).click();
			
			j++;
			
			k++;
		
		}
		
		workbook.close();
		
		fis.close();
		
		driver.close();
		
	}
}
