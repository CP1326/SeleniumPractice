package com.priyas.selenium_firstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fourth_seleniumscript {
	public static void main (String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com/");
		Threadsleep (3000);
		driver.manage().window().minimize();
		Threadsleep (4000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@ id=\"twotabsearchtextbox\"]")).sendKeys("jeans for women");
	WebElement SerachIcon=driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
	SerachIcon.click();
		
		
	}

	private static void Threadsleep(int i) {
		// TODO Auto-generated method stub
		
	}

}
