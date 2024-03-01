import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.bing.com/");
		
		driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("seleni");
		List<WebElement> suggessionList = driver.findElements(By.xpath("//ul[@id='sa_ul']/li//span"));
		System.out.println(suggessionList.size());
		
		for(WebElement option: suggessionList)
		{
			if(option.getText().equals("selenium dev")) 
			{
				option.click();
				break;
			}
		}
	}

}
