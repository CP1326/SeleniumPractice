package Googlepage._selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement check=driver.findElement(By.xpath("//input[@type='checkbox']"));		
		check.click();
		System.out.println("clicked on checkbox no:1");
	
		

	}

}
