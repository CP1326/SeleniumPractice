package com.ganji.seleniumwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaits {
	public static void main(String args[])
	{
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://ajio.com/");
		Driver.findElement(By.name("searchVal")).sendKeys("clothes"+Keys.ENTER);
		 WebDriverWait wait1=new WebDriverWait(Driver,Duration.ofSeconds(20));
		 WebElement link1=wait1.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("MEN")));
		 link1.click();
		
		
		
		
	}

}
