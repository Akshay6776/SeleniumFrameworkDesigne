import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PagenationDyanmicwebTableMethod2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://datatables.net/");
		
		List<WebElement> names = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[1]"));
		
		List<String> nameList = new ArrayList<String>();
		
		for(WebElement nameele: names) 
		{
			nameList.add(nameele.getText());
		}

		String nextButtonClassName = driver.findElement(By.xpath("//a[@id='example_next']")).getAttribute("class");
		
		while(!nextButtonClassName.contains("disabled"))
		{
			driver.findElement(By.xpath("//a[@id='example_next']")).click();
			names = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[1]"));
			for(WebElement nameele: names) 
			{
				nameList.add(nameele.getText());
			}
			
			nextButtonClassName = driver.findElement(By.xpath("//a[@id='example_next']")).getAttribute("class");
		}
		
		System.out.println(nameList);
		int totalNames = nameList.size();
		System.out.println("Total number of names Present in list: "+totalNames);
		
		String[] NoOFNames = driver.findElement(By.xpath("//div[@id='example_info']")).getText().split(" ");
		String totalNoOfDisplayedCount = NoOFNames[5];
		System.out.println("Total number of names Displayed: "+totalNoOfDisplayedCount);
		
		Assert.assertEquals(totalNoOfDisplayedCount, String.valueOf(totalNames));
		
		
		driver.quit();
		
		
	}

}
