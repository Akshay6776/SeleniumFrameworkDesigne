import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SortDropdown {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.twoplugs.com");
		
		driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
		WebElement dropElements = driver.findElement(By.xpath("//select[@name='category_id']"));
		
		Select selDropElement = new Select(dropElements);
		List<WebElement> options = selDropElement.getOptions();
		
		
		ArrayList<String> originalList = new ArrayList<String>();
		ArrayList<String> templList = new ArrayList<String>();
		
		for(WebElement option: options) 
		{
			originalList.add(option.getText());
			templList.add(option.getText());
		}
		
		System.out.println(originalList);
		System.out.println(templList);
		
		Collections.sort(templList);
	
		System.out.println(originalList);
		System.out.println(templList);
		
		if(originalList.equals(templList)) 
		{
			System.out.println("Dropdown options are sorted");
		}
		else 
		{
			System.out.println("Dropdown options are not sorted");
		}
		
		driver.quit();
		
	}

}
