package com.priyas.selenium_firstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sixth_seleniumscript {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ebay.com/");
		driver.findElement(By.linkText("Electronics")).click();
		driver.findElement(By.partialLinkText("Cell Phones, Smart Watches & Accessories")).click();

	}

}
