import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggesstiveDropdownGoogle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("java tutorial");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> googleSearchOptions = driver.findElements(By.xpath("//li[@class='sbct']//div[@class='wM6W7d']/span"));
		System.out.println(googleSearchOptions.size());
		
		for(WebElement option: googleSearchOptions) 
		{
			if(option.getText().equals("java tutorial pdf")) 
			{
				option.click();
				break;
			}
		}
		
	}

}
