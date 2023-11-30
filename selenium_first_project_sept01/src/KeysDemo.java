import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions a1=new Actions(driver);
		a1.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
		a1.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		a1.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		a1.sendKeys(Keys.CLEAR).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
