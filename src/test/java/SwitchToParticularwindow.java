import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwitchToParticularwindow {

	static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		
		String tab = Keys.chord(Keys.CONTROL,Keys.RETURN);
		
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).sendKeys(tab);
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).sendKeys(tab);
		driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")).sendKeys(tab);
		
		Set<String> winIds = driver.getWindowHandles();
		
		List<String> windowIds = new ArrayList<String>(winIds);
		
		
		if(switchToSpecificWindow("books",windowIds)) 
		{
			System.out.println("print url: "+driver.getCurrentUrl());
		}
		

	}
	
	
	
	public static boolean switchToSpecificWindow(String Windowtitle, List<String> windowIds) 
	{
		for(String winId:windowIds) 
		{
			String title = driver.switchTo().window(winId).getTitle();
			System.out.println(title);
			if(title.toLowerCase().contains(Windowtitle)) 
			{
				System.out.println("found the Right window");
				return true;
			}
		}
		return false;
	}

}
