package Googlepage._selenium;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepage1 
{
	public static void main(String args[])
	{
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://accounts.google.com/");
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
		driver.findElement(By.id("identifierId")).sendKeys("mdvsk416@gmail.com");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		driver.findElement(By.name("Passwd")).click();
		
		
//		
//		
//		
	}

}
