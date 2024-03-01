import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DatePicker2 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//span[normalize-space()='Departure']")).click();
		
		String monthAndYear = "March 2024";
		String date = "16";
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']/i")));
		driver.findElement(By.xpath("//*[@id='webklipper-publisher-widget-container-notification-close-div']/i")).click();
		
		
		while(true) 
		{
			String text = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
			if(text.equals(monthAndYear)) 
			{
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}


		List<WebElement> allDates = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]/div/div/div/p"));
		
		for(WebElement dates : allDates) 
		{
			if(dates.getText().equals(date)) 
			{
				dates.click();
				break;
			}
		}


	}

}
