package Googlepage._selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instapage {
	public static void main(String args[]) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ebay.com");
		
		driver.findElement(By.id("gh-ac")).sendKeys("guitar for kids");
		WebElement searchIcon=driver.findElement(By.partialLinkText("guitar for kids"));
		searchIcon.click();
		
		
				
		
	}

}
