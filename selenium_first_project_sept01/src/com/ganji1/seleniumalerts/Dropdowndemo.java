package com.ganji1.seleniumalerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowndemo {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com/");
		WebElement dropdown= driver.findElement(By.id("searchDropdownBox"));
		Select dropmat=new Select(dropdown);
		//dropmat.selectByVisibleText("Baby");
		dropmat.selectByIndex(8);
		WebElement SearchIcon=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		SearchIcon.click();
		

	}

}
