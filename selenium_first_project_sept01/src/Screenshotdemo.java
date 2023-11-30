import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotdemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		Thread.sleep(4000);
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		

	}

}
