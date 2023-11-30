import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextcompareDemo1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		WebElement input=driver.findElement(By.id("inputText1")); 
		
		WebElement input1=driver.findElement(By.id("inputText2"));
		input.sendKeys("priya");
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL);
		a.sendKeys("a");
		a.keyUp(Keys.CONTROL);
		a.perform();
		a.keyDown(Keys.CONTROL);
		a.sendKeys("c");
		a.keyUp(Keys.CONTROL);
		a.perform();
		//tab to shift input2
		a.keyDown(Keys.TAB);
		a.perform();
		a.keyDown(Keys.CONTROL);
		a.sendKeys("v");
		a.keyUp(Keys.CONTROL);
		a.perform();
		
		
		
		

	}

}
//text1
//<textarea name="text2" 