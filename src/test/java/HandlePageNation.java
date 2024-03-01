import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlePageNation {

	static WebDriver driver;
	public static void main(String[] args) {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://datatables.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		String position = getData("Suki Burks");	
		System.out.println(position);
			
		driver.quit();
		
	}
		
	
	public static String getData(String name) 
	{
		boolean nameFound = false;
		while(!nameFound) 
		{
			List<WebElement> names = driver.findElements(By.xpath("//table[@id='example']/tbody//td[normalize-space()='"+name+"']"));
			List<WebElement> disableNextButton= driver.findElements(By.xpath("//button[@class='dt-paging-button disabled next']"));
			
			if(names.size()>0) 
			{
				nameFound=true;
			}
			else if(disableNextButton.size()==0)
			{
				driver.findElement(By.xpath("//button[@class='dt-paging-button next']")).click();
			}
			else 
			{
				return "-1";
			}	
		}
		
		return driver.findElement(By.xpath("//table[@id='example']/tbody//td[normalize-space()='"+name+"']/following-sibling::td[1]")).getText();
	}

	
}
