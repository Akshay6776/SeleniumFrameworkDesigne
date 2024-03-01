import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DatePicker {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.expedia.ca/");
		
		String monthAndYear = "March 2025";
		String fromDate = "15";
		String toDate = "20";
		
		driver.findElement(By.cssSelector("button[name='EGDSDateRange-date-selector-trigger']")).click();
		
		
		while(true) 
		{
			String text = driver.findElement(By.xpath("//div[@class='uitk-month uitk-month-double uitk-month-double-left']/span")).getText();
			if(text.equals(monthAndYear)) 
			{
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//button[@data-stid='uitk-calendar-navigation-controls-next-button']")).click();
			}
		}
		
		List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='uitk-month uitk-month-double uitk-month-double-left']//td/div/div[2]"));
		
		for(WebElement dates:allDates) 
		{
			if(dates.getText().equals(fromDate)) 
			{
				dates.click();
				break;
			}
		}
		


		driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-layout-flex-item']")).click();
		
		//Pick no of travellers 3
		
		String noOfTraveller = "5";
		
		driver.findElement(By.xpath("(//div[@class='uitk-field has-floatedLabel-label has-icon has-placeholder'])[2]")).click();
		
		while(true) 
		{
			String traveller = driver.findElement(By.xpath("//input[@id='traveler_selector_adult_step_input-0']")).getAttribute("value");
			if(traveller.equals(noOfTraveller)) 
			{
				break;
			}
			else 
			{
				driver.findElement(By.xpath("(//button[@class='uitk-layout-flex-item uitk-step-input-touch-target'])[2]")).click();
			}
		}
		
		driver.findElement(By.xpath("//button[@id='traveler_selector_done_button']")).click();
		
	}

}
