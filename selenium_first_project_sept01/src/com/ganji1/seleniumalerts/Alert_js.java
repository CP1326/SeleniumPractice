package com.ganji1.seleniumalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_js {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='js Alert()']")).click();
		//created one object here a1 is the object alert is class here
		Alert a1=driver.switchTo().alert();
		String s1=a1.getText();
		a1.accept();
		
		


	}

}
