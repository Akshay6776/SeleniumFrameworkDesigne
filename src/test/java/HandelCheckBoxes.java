import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelCheckBoxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//check first 2 checkBoxes
		
		List<WebElement> optionsCheckBox= driver.findElements(By.xpath("//input[@class='form-check-input'][contains(@id,'day')]"));
		System.out.println(optionsCheckBox.size());
		
		
//		for(int i=0;i<2;i++) 
//		{
//			if(i<2) 
//			{
//				optionsCheckBox.get(i).click();
//			}
//		}
		
		//check last 2 checkboxes
		
//		for(int i=optionsCheckBox.size()-1;i>optionsCheckBox.size()-3;i--) 
//		{
//			if(i>optionsCheckBox.size()-3) 
//			{
//				optionsCheckBox.get(i).click();
//			}
//		}

		//check all checkBoxes
//		
//		for(WebElement option: optionsCheckBox) 
//		{
//			option.click();
//		}

		//check selected checkboxes Monday and Thursday
		
		for(WebElement option: optionsCheckBox) 
		{
			String weekDay = option.getAttribute("value");
			if(weekDay.equals("monday") || weekDay.equals("thursday")) 
			{
				option.click();
			}
		}
		
		driver.quit();
		
		
	}
}
