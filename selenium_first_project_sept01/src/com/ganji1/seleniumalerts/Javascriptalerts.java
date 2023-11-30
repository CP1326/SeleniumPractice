package com.ganji1.seleniumalerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptalerts 
{
	public static void main (String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick=\'jsAlert()\']")).click();
		Alert a1 =driver.switchTo().alert();
		a1.accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.xpath("//button[@onclick=\'jsConfirm()\']")).click();
		Alert a2 = driver.switchTo().alert();
		a2.accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		a2.dismiss();
		driver.findElement(By.xpath("//button[@onclick=\'jsPrompt()\']")).click();
		Alert a3=driver.switchTo().alert();
		a3.sendKeys("chandipriyanka@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		a3.accept();
		
		
	}

}
