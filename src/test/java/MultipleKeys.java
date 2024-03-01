import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MultipleKeys {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://text-compare.com/");
		
		WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		input1.sendKeys("Welcome to selenium classes");
		
		Actions act = new Actions(driver);
		
		//CTRL + a
		act.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL).perform();
		
		//CTRL + c
		act.keyDown(Keys.CONTROL)
		.sendKeys("c")
		.keyUp(Keys.CONTROL).perform();
		
		//press TAB key
		act.sendKeys(Keys.TAB).perform();
		
		//paste the text into inputbox2
		act.keyDown(Keys.CONTROL)
		.sendKeys("v")
		.keyUp(Keys.CONTROL).perform();
		
		if(input1.getAttribute("value").equals(input2.getAttribute("value"))) 
		{
			System.out.println("Text are similar");
		}
		else 
		{
			System.out.println("Text are not similar");
		}
		
		driver.quit();
	
	}

}
