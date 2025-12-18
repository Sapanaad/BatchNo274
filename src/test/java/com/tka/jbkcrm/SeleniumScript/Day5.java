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
		WebElement clickRegisterLink = driver.findElement(By.linkText("Register"));
        clickRegisterLink.click();
        WebElement title = driver.findElement(By.xpath("//*[@id=\"title\"]"));
		title.sendKeys("Javabykiran");
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		firstname.sendKeys("sapna");
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
		lastname.sendKeys("dudhe");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("sapanazade232@gmail.com");
		WebElement phone = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
		phone.sendKeys("9146762556");
		WebElement mobile = driver.findElement(By.xpath("//*[@id=\"mobile\"]"));
		mobile.sendKeys("9146762556");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("Sapana@123");
		WebElement conformpassword = driver.findElement(By.xpath("//*[@id=\"passconf\"]"));
		conformpassword.sendKeys("Sapana@123");
		WebElement termsCheckbox = driver.findElement(By.xpath("//*[@id=\"terms\"]"));
		termsCheckbox.click();
		WebElement clickRegister = driver.findElement(By.xpath("//*[@id=\"register_submit\"]"));
        clickRegister.click();
        System.out.println("go to next page && show ypur profile");
//	check search text box enable to enter value or not
//	     WebElement txtsearch = driver.findElement(By.name("search[keywords]"));
//	     boolean isEnable=txtsearch.isEnabled();
//
//	     if(isEnable)
//	     {
//	     System.out.println("Test case!! is Pass and you are able to enter a value in a search textbox");
//	     }
//		else 
//		{
//	     System.out.println("Test case Failed!! and you are not able to enter a value in a search textbox");
	// check advance login link is clickable or not and if enabled then click on a link
//		WebElement linkAdvanceSearch = driver.findElement(By.partialLinkText("Advanced Search"));
//	     boolean isEnable=linkAdvanceSearch.isEnabled();
//	     boolean isclickable=false;
//	     if(isEnable)
//	     {
//	    	 isclickable=true;
//          System.out.println("Advance link is enable for click!!");
//          linkAdvanceSearch.click();
//	     }
//	     else
//	     {
//	    	 System.out.println("Advance link is not enable for click!!"); 
//	     }
//     if(isclickable)
//     {
//    	 System.out.println("Test case Pass");	
//	     } 
//     else 
//	     {
//	    System.out.println("Test case Failed");	

}
}


