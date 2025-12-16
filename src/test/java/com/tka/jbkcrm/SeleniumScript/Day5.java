package com.tka.jbkcrm.SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5 {

public static void main(String[] args) {
// open chromedriver browser
		WebDriver driver = new ChromeDriver();
// open url
		driver.get("https://javabykiran.in/other/CC/search");
		driver.manage().window().maximize();
// 
//		WebElement loginLink = driver.findElement(By.linkText("Login"));
//	    boolean isDisplay=loginLink.isDisplayed();
//	    if(isDisplay)
//	    {
//	    System.out.println("Test case Pass");
//	    } else {
//	    System.out.println("Test case Failed");
//	     WebElement registerLink = driver.findElement(By.linkText("Register"));
//		 boolean isDisplay=registerLink.isDisplayed();
//		 if(isDisplay)
//		 {
//		 System.out.println("Test case Pass");
//		 } else {
//	     System.out.println("Test case Failed");
//	check search text box enable to enter value or not
//	     WebElement txtsearch = driver.findElement(By.name("search[keywords]"));
//	     boolean isEnable=txtsearch.isEnabled();
//
//	     if(isEnable)
//	     {
//	     System.out.println("Test case!! is Pass and you are able to enter a value in a search textbox");
//	     } else {
//	     System.out.println("Test case Failed!! and you are not able to enter a value in a search textbox");
	
}
}


