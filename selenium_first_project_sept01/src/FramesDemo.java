import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.className("mce-content-body")).clear();
	driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("sivapriya lives in banglore");
		
		

	}

}
