package Googlepage._selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait3 {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver1=new ChromeDriver();
		
		driver1.get("https://ebay.com");
		Thread.sleep(2000);
		
		driver1.findElement(By.id("gh-cat")).sendKeys("baby"+Keys.ENTER);
		
		
		
		//fluent wait condition
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver1)							
				.withTimeout(Duration.ofSeconds(30)) 			
				.pollingEvery(Duration.ofSeconds(20)) 			
				.ignoring(NoSuchElementException.class);
		WebElement Linkf=wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Motors")));
		
		Linkf.click();
		
		
	}

}
