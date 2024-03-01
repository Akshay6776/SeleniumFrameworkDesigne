import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePagenation1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://datatables.net/");
		
		ArrayList<String> nameList = new ArrayList<String>();
		
		List<WebElement> pages = driver.findElements(By.xpath("//button[@class='dt-paging-button' or contains(@class,'current')]"));
		int noOfPages = pages.size();
		System.out.println(noOfPages);
		
		for(int i=1;i<=noOfPages;i++) 
		{
			driver.findElement(By.xpath("(//button[@class='dt-paging-button' or contains(@class,'current')])["+i+"]")).click();
			List<WebElement> names = driver.findElements(By.xpath("//table[@id='example']/tbody//td[1]"));
			for(WebElement e:names) 
			{
				String actualName = e.getText();
				nameList.add(actualName);
			}
		}
			
		System.out.println(nameList);
		System.out.println(nameList.size());
		
		
		
		driver.quit();
		
		
		
		
		

	}

}
