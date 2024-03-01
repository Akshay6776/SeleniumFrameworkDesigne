import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleDatePicker {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		
		String actualMonthAndYear = "Jun 2025";
		String actualDate = "15";
		
		driver.findElement(By.xpath("//span[@class='dateText']")).click();
		
		//pick month and year
		
		while(true) 
		{
			WebElement monthAndYear = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]"));
			if(monthAndYear.getText().equals(actualMonthAndYear)) 
			{
				break;
			}
			else 
			{
				driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click();
			}
		}
		
		//pick date
		
		List<WebElement> dateElements = driver.findElements(By.xpath("//div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj']/span[@class!='DayTiles__CalendarDaysSpan-sc-1xum02u-1 gigHYE']"));
		
		for(WebElement dateEle: dateElements) 
		{
			String date = dateEle.getText();
			if(date.equals(actualDate)) 
			{
				dateEle.click();
				break;
			}
		}
		
		driver.quit();

	}

}
