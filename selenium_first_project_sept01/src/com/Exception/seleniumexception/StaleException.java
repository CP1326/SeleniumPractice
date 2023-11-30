package com.Exception.seleniumexception;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https;//facebook.com");
		
		  WebElement email=driver.findElement(By.name("email"));
		 email.sendKeys("chandipriyanka@gmail.com"); 
		
		 WebElement Password=driver.findElement(By.name("pass")); 
		 Password.sendKeys("abcd");
		 driver.navigate().refresh();

		 try
		 {
			email.sendKeys("chandipriyanka@gmail.com") ;
		 }
		 catch(StaleElementReferenceException se)
		 {
			 WebElement email1=driver.findElement(By.name("email"));
			 email1.sendKeys("chandipriyanka@gmail.com"); 
			 
//			 email
			 //pass
		 }
		  
		  
		  
		  
		 
	}

}
