package com.chandi.checkboxes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Javascriptexecutor {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
         jse.executeScript("window.scrollBy(o,400)");
         Thread.sleep(3000);
         jse.executeScript("window.scrollBy(0,-200");
	}

}