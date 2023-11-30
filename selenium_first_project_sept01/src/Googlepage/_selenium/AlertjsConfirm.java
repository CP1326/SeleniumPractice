package Googlepage._selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertjsConfirm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		  driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		 Thread.sleep(4000); Alert js=driver.switchTo().alert(); String
		 s=js.getText(); js.accept(); Thread.sleep(3000); js.dismiss();
		 Thread.sleep(3000) ;
		 
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert a1 = driver.switchTo().alert();
		String s1 = a1.getText();
		a1.accept();

	}

}
