package com.priyas.selenium_firstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thrid_seleniumscript {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://ebay.com/");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("guitar");
		WebElement SearchIcon=driver.findElement(By.xpath("//input[@id='gh-btn']"));
		SearchIcon.click();
		
	

	}

}
