package com.Exception.seleniumexception;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropandDrag {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement oslo=driver.findElement(By.id("box1"));
		WebElement norway=driver.findElement(By.id("box101"));
		Actions a =new Actions(driver);
		a.dragAndDrop(oslo, norway).perform()
;		
		

	}

}
