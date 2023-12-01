package Googlepage._selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		// driver.get("https://demo.guru99.com/test/radio.html");
		driver.get("https:www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement radio1=driver.findElement(By.className("_8esa"));
		radio1.isSelected();
		radio1.click();
		
		/*
		 * WebElement radio1 = driver.findElement(By.id("vfb-7-1")); WebElement radio2 =
		 * driver.findElement(By.id("vfb-7-2")); WebElement
		 * radio3=driver.findElement(By.id("vfb-7-3"));
		 */

		
		/*
		 * radio1.isSelected(); radio1.click(); Thread.sleep(3000); radio2.isSelected();
		 * radio2.click(); Thread.sleep(3000); radio3.isSelected(); radio3.click();
		 */
	}

}
