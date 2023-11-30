package com.chandi.checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxesdemo {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement Check=driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]"));
		
		Check.click();
		

	}

}
