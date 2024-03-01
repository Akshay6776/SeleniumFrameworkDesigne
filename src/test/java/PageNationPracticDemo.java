import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageNationPracticDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		int noOfPages = driver.findElements(By.xpath("//ul[@id='pagination']/li/a")).size();
		
		List<String> productList = new ArrayList<String>();
		
		for(int i=1;i<=noOfPages;i++) 
		{
			driver.findElement(By.xpath(("(//ul[@id='pagination']/li/a)["+i+"]"))).click();
			List<WebElement> products = driver.findElements(By.xpath("//table[@id='productTable']//tr/td[2]"));
			for(WebElement prod: products) 
			{
				String productName = prod.getText();
				productList.add(productName);
				
			}
		}
		
		System.out.println(productList);
		
		driver.quit();
		
		
		
		
		
		
	}

}
