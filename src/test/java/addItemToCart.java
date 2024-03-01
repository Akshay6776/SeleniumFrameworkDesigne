import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class addItemToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String itemsNeeded[] = {"Cucumber","Cauliflower"};
		List<String> itemsNeededList = Arrays.asList(itemsNeeded);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0;i<products.size();i++) 
		{
			 
			 if(itemsNeededList.contains(itemsNeeded)) 
			 {
				 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				 break;
			 }
		}

	}

}
