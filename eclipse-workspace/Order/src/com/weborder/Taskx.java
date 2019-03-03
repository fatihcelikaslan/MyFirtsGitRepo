package com.weborder;

import java.util.ArrayList;

public class Taskx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("SDET");
		list.add("Automation Engineer in test");
		list.add("Selenium Engineer");
		list.add("Java and Selenium");
		list.add("Software Developer");
		list.add("Quality Assurance Tester");
		list.add("Selenium Expert");
		list.add("Java Master");
		list.add("Java Developer");
		list.add("Maven");
		list.add("Git and GitHub");
		list.add("Cucumber");
		list.add("TestNG");
		list.add("SDET I");
		list.add("SDET II");
		list.add("SDET III");
		list.add("Lead Automation");
		list.add("Business Analyst");
		list.add("Scrum Master");
		list.add("Product Owner");

		for (int i = 0; i < list.size()-1; i++) {
		  driver.findElement(By.id("job")).clear();
		  driver.findElement(By.id("job")).sendKeys(list.get(i));
		  driver.findElement(By.xpath("//input[@value='Find Tech Jobs']")).click();
		  String count2 = driver.findElement(By.id("posiCountId")).getText();
		  System.out.println(count2);
		  String wholeThing = list.get(i) + "-" + count2;
		  System.out.println(wholeThing);
		}

	}

}
