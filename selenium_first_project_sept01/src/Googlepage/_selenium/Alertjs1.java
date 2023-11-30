package Googlepage._selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertjs1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(4000);
		Alert js=driver.switchTo().alert();
		String s=js.getText();
		js.accept();
		Thread.sleep(3000);
		js.dismiss();
		System.out.println("------------------------------------");
		
		
		
		

	}

}
