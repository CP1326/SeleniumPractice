package Googlepage._selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait 
{
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium cucumber framework"+Keys.ENTER);
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement link1=wait1.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Java")));
		
		link1.click();
		
	}

}
