import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo 
{
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions a1= new Actions(driver);
		a1.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		a1.moveToElement(driver.findElement(By.linkText("Today's Deals"))).click().build().perform();
		
		
	}
	
	

}
