package com.weborder;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Order {

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "/Users/fcelikaslan/Documents/selenium dependencies/drivers/chromedriver");
	
	WebDriver driver = new ChromeDriver();
	driver.get(" http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
	driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Order")).click();
	
	Random rn = new Random();
	int t = rn.nextInt(101);
	String str = String.valueOf(t);
	String a = ""+str;
	Random rt = new Random();
	int low = 10_000;
	int high = 99_999;
	int e = rt.nextInt(high-low) + low;
	String zipCode = String.valueOf(e);
	Random rt2 = new Random();
	
	driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys(str);
	driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys
	("John"+a+"Smith");
	Thread.sleep(500);
	driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).
	sendKeys("123 any Street");
	Thread.sleep(500);
	driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).
	sendKeys("Anytown");
	Thread.sleep(500);
	driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).
	sendKeys("Colorado");
	Thread.sleep(500);
	driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5")).
	sendKeys(zipCode);
	Thread.sleep(500);
	
	Random rn3 = new Random();
    int t3 = rt2.nextInt(3);
    String str4 = String.valueOf(t3);
    
    String cardNumber = "";
    
    driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_"+t3)).click();
    Thread.sleep(500);
    
    Random rt3 = new Random();
    String cardNumbers ="";
	
    switch (t3) {
    case 0:
    	cardNumbers = String.valueOf(4);
    	for(int i = 0; i<15; i++) {
    		 int s = rt3.nextInt(10);
	    		cardNumbers +=String.valueOf(s);	    		
    	} 	
    	break;
    case 1:
    	cardNumbers = String.valueOf(5);
    	for(int i = 0; i<15; i++) {
   		 int s = rt3.nextInt(10);
	    		cardNumbers +=String.valueOf(s);	    		
   	} 	
    	break;
    case 2:
    	cardNumbers = String.valueOf(3);
    	for(int i = 0; i<14; i++) {
   		 int s = rt3.nextInt(10);
	    		cardNumbers +=String.valueOf(s);	    		
   	} 	
    	break;
    } 	
    
    driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).
	sendKeys(cardNumbers);
    Thread.sleep(500);
    
    driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).
	sendKeys("05/05");
    Thread.sleep(500);
    
    driver.findElement(By.id( "ctl00_MainContent_fmwOrder_InsertButton")).click();
    

    String expected = "New order has been successfully added.";

    String actual = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/div/strong"))
            .getText();

    if(expected.equals(actual)) {
        System.out.println("Expected result matches the actual result.");
    }else {
        System.out.println("Expected result does not match the actual result.");
   
    
    
    
    
	
	
	
    }	
}}
