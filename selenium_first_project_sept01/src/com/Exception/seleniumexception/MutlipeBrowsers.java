package com.Exception.seleniumexception;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutlipeBrowsers {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement tab1=driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/div"));
		tab1.findElements(By.tagName("a")).size();
		System.out.println("total no.of links:"+tab1.findElements(By.tagName("a")).size());
		for(int i=0; i<tab1.findElements(By.tagName("a")).size(); i++)
		{
			String tab2=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			tab1.findElements(By.tagName("a")).get(i).sendKeys(tab2);
		}
		
			
		
	
		

	}

}
