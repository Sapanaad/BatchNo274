package com.tka.jbkcrm.SeleniumScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//*[@id=\'loginForm\']/div[1]/div[1]/div/label/input"));
		username.sendKeys("iranna@thekiranacademy");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[2]/div/label/input"));
		password.sendKeys("iranna@");
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[3]"));
		loginButton.click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "welcome to Instagram";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Test case Pass");
		}else
			System.out.println("Test case Failed");
		}
}

