import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaticWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// print the table
		
		 int columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th")).size();
		 int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
//		for(int r=1; r<=rows; r++) 
//		{
//			if(r==1) 
//			{
//				for(int c=1;c<=columns;c++) 
//				{
//					String dataHeader = driver.findElement(By.xpath("//table[@name='BookTable']//tr/th["+c+"]")).getText();
//					System.out.print(dataHeader+"  ");
//				}
//			}
//			else 
//			{
//				for(int c=1;c<=columns;c++) 
//				{
//					String dataBody = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
//					System.out.print(dataBody+"  ");
//				}
//			}
//			System.out.println();
//		}
		
		 //
		
		
		
		for(int r=2; r<=rows; r++) 
		{
			for(int c=1;c<=columns;c++) 
			{
				String dataBody = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				if(dataBody.equals("Master In Java")) 
				{
					System.out.println(r+"*"+c);
	
				}
			}
		}
		
		driver.quit();
		
		
		
		
		
		
	}

}
