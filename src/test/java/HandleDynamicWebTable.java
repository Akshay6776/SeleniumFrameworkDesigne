import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDynamicWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/admin/");
		
		//Login to account
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button")).click();
		
		//go to orders
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		
		//grab customer name and click checkbox
		List<WebElement> customers = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tr/td[4]"));
		
//		for(int i=0;i<customers.size();i++) 
//		{
//			String customerName = customers.get(i).getText();
//			if(customerName.equals("Natalia Natalia")) 
//			{
//				driver.findElements(By.xpath("//tr/td[1]/input[1]")).get(i).click();
//				break;
//			}
//		}
	
//		for(int i=0;i<customers.size();i++) 
//		{
//			String customerName = customers.get(i).getText();
//			if(customerName.equals("Alex Admin")) 
//			{
//				driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tr["+(i)+"]/td[1]/input[1]")).click();
//				break;
//			}
//		
//		}
		
		String customerName = "Alex Admin";
		
		String xpath = "//table[@class='table table-bordered table-hover']//tr/td[4][text()='"+customerName+"']/preceding-sibling::td[3]/input";
		
		driver.findElement(By.xpath(xpath)).click();
		
		
	}

}
