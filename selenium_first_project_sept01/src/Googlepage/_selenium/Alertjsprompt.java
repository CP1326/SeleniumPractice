package Googlepage._selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertjsprompt {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert a3=driver.switchTo().alert();
		
		System.out.println(a3.getText());
		a3.sendKeys("hello chandi priyanka, welcome to github ");
		a3.accept();
		if (driver.getPageSource().contains("you entered:hello chandi priyanka ,welcome to github"));
		
		System.out.println("hello chandi priyanka");

	}

}
