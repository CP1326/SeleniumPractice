package com.priyas.selenium_firstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second_seleniumscript {

	public static void main(String[] args)
	{
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://amzon.com/");
		Driver.findElement(By.xpath("input[@id='/twotabsearchtextbox/']")).sendKeys("jeans");
		
		
		
		
	

	}

}
