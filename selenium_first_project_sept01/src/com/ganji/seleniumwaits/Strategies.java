package com.ganji.seleniumwaits;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Strategies {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver options= new ChromeDriver();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		Thread.sleep(3000);
		WebDriver driver= new ChromeDriver();
		driver.get("https://ebay.com/");
		
		
		

	}

}
