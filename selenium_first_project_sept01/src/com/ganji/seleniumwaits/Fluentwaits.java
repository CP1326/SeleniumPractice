package com.ganji.seleniumwaits;

import java.time.Duration;
import java.util.NoSuchElementException;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Fluentwaits {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.findElement(By.name("email")).sendKeys("mdvsk@gmail.com");
		Wait<WebDriver>Fluent=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).ignoring(NoSuchElementException.class);
		WebElement linkf=Fluent.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='u_0_5_ee']")));
		
		linkf.click();
		

	}

}
