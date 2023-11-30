package com.priyas.selenium_firstscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eighth_seleniumscript {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://google.com/");
	driver.findElement(By.name("q")).sendKeys("selenium new version"+Keys.ENTER);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(800));
	driver.close();
	driver.quit();
	

	

	}

}
