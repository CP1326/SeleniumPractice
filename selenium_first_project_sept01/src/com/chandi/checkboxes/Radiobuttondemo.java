package com.chandi.checkboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttondemo 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//div[contains(@class,'makeFlex hrtlCenter appendBottom20 flightFare')]//div[contains(@class,'makeFlex hrtlCenter')]//li[2]")).click();
		Thread.sleep(2000);
		WebElement radio=driver.findElement(By.xpath("//li[@data-cy='roundTrip']//span[@class='tabsCircle appendRight5']"));
		radio.click();
		
		
	}
	

}
