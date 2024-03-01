import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComboTreeDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		
		selectOptionFromDropdown(driver,"choice 1");
		//selectOptionFromDropdown(driver,"choice 1","choice 2 3","choice 6","choice 6 2","choice 6 2 3");
		//selectOptionFromDropdown(driver,"all");
		
		driver.quit();
	}
	
	public static void selectOptionFromDropdown(WebDriver driver,String... value) 
	{
		List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		if(!value[0].equalsIgnoreCase("all")) 
		{
			for(WebElement item: choiceList) 
			{
				String text = item.getText();
				for(String val: value) 
				{
					if(text.equals(val)) 
					{
						item.click();
						break;
					}
				}
			}
		}
		else 
		{
			try 
			{
				for(WebElement item: choiceList) 
				{
					item.click();
				}
			}
			catch(Exception e) 
			{
				
			}
		}
	}

}
