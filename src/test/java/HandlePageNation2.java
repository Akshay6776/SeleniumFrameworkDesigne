import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePageNation2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://datatables.net/");
		
		ArrayList<String> nameList = new ArrayList<String>();
		
		List<WebElement> names = driver.findElements(By.xpath("//table[@id='example']/tbody//td[1]"));
		for(WebElement e:names) 
		{
			String actualName = e.getText();
			nameList.add(actualName);
		}
		
		String nextButtonClassName = driver.findElement(By.xpath("//button[@aria-label='Next']")).getAttribute("class");
		
		while(!nextButtonClassName.contains("disabled")) 
		{
			driver.findElement(By.xpath("//button[@aria-label='Next']")).click();
			names = driver.findElements(By.xpath("//table[@id='example']/tbody//td[1]"));
			for(WebElement e:names) 
			{
				String actualName = e.getText();
				nameList.add(actualName);
			}
			
			nextButtonClassName = driver.findElement(By.xpath("//button[@aria-label='Next']")).getAttribute("class");
			
		}
		
		System.out.println(nameList);
		System.out.println(nameList.size());
		
		
		
		driver.quit();

	}

}
