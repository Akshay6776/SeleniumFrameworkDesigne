import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class PagenationDynamicWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://datatables.net/");

		List<WebElement> noOfPages = driver.findElements(By.xpath("//div[@id='example_paginate']/span/a"));
		int pages = noOfPages.size();
		//System.out.println(pages);
		
		List<String> names = new ArrayList<String>();
		
		for(int i=1; i<=pages; i++) 
		{
			driver.findElement(By.xpath("(//div[@id='example_paginate']/span/a)["+i+"]")).click();
			List<WebElement> namesEle = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[1]"));
			for(WebElement elename: namesEle) 
			{
				names.add(elename.getText());
			}
		}
		
		System.out.println(names);
		int actualNoOfNames = names.size();
		System.out.println("Total number of names captured: "+actualNoOfNames);
		
		String[] NoOFNames = driver.findElement(By.xpath("//div[@id='example_info']")).getText().split(" ");
		String totalNoOfDisplayedCount = NoOFNames[5];
		System.out.println("Total number of names Displayed: "+totalNoOfDisplayedCount);
		
		Assert.assertEquals(totalNoOfDisplayedCount, String.valueOf(actualNoOfNames));
		
		driver.quit();
		
		
	}

}
