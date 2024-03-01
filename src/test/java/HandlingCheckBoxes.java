import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//tick any check box
		//driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		
		//select all the boxes
		
//		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='form-check-input'][@type='checkbox']"));
//		
//		for(WebElement checkBox:checkBoxes) 
//		{
//			checkBox.click();
//		}
		
		//to select first 2 selected checkBox
		
//		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='form-check-input'][@type='checkbox']"));
//		int i = 0;
//		for(WebElement checkBox:checkBoxes) 
//		{
//			if(i<2) 
//			{
//				checkBox.click();
//				i++;
//			}
//		
//		}

		//to select last 2 checkBoxes
//		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='form-check-input'][@type='checkbox']"));
//		
//		for(int i=checkBoxes.size()-1;i>checkBoxes.size()-3;i--) {
//			if(i>checkBoxes.size()-3) 
//			{
//				checkBoxes.get(i).click();
//			}
//		}
//			

		//select checkbox of choice
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox'][contains(@id,'day')]"));
		
		for(WebElement checkbox:checkBoxes) 
		{
			String weekDay =  checkbox.getAttribute("id");
			if(weekDay.equals("sunday") || weekDay.equals("friday"))
				
			{
				checkbox.click();
			}
		}
			
		
		
		

	}
	
}
