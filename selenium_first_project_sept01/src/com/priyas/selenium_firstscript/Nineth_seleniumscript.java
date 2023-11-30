package com.priyas.selenium_firstscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nineth_seleniumscript {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https:/meesho.com/");
		
		driver.findElement(By.xpath("//span[normalize-space()='Women Western']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']")).sendKeys("saree");
		
	
			}

}
