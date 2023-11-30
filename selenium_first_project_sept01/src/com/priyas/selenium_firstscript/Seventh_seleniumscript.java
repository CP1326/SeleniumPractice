package com.priyas.selenium_firstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seventh_seleniumscript {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.cssSelector
				("input[name='username']")).sendKeys("sivakumar");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("sivapriya");

	}

}
