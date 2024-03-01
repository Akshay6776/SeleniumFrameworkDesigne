import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingStaticWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");
		
		//print table headings
		
		//List<WebElement> tableHeadingTitles = driver.findElements(By.xpath("//table[@id='table1']//th"));
		
		//System.out.println(tableHeadingTitles.size());
		
		//by for each loop
//		for(WebElement header: tableHeadingTitles) 
//		{
//			String tableHeader = header.getText();
//			System.out.println(tableHeader);
//		}
		
		//for loop
		
//		for(int i=0;i<tableHeadingTitles.size();i++) 
//		{
//			String tableHeader = tableHeadingTitles.get(i).getText();
//			System.out.println(tableHeader);
//		}
		
		//List<WebElement> tableData = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		
//		for(int i=0;i<tableData.size();i++) 
//		{
//			String tableHeader = tableData.get(i).getText();
//			System.out.println(tableHeader);
//		}
		
//		for(WebElement header: tableData) 
//		{
//			String tabledata = header.getText();
//			System.out.println(tabledata);
//		}
		
		//print table data in first row
//		
//		List<WebElement> firstRowData = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
//		
//		for(WebElement header: firstRowData) 
//		{
//			String firstRowtabledata = header.getText();
//			System.out.println(firstRowtabledata);
//		}
		
//		List<WebElement> secondRowData = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[2]/td"));
//		
//		for(WebElement header: secondRowData) 
//		{
//			String secondRowtabledata = header.getText();
//			System.out.println(secondRowtabledata);
//		}
		
		//print data of third row second data
//		String data = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[3]/td[2]")).getText();
//		System.out.println(data);		

		//print 3rd column data
		
//		List<WebElement> thirdColumnData = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[3]"));
//		
//		for(WebElement data: thirdColumnData) 
//		{
//			String thirdcolumntabledata = data.getText();
//			System.out.println(thirdcolumntabledata);
//		}
		
		//find no of rows
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		int rowCount = rows.size();
	
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='table1']//th"));
		int columnCount = columns.size();	
	
		for(int r=1; r<=rowCount; r++) 
		{
			if(r==1) 
			{
				for(int c=1; c<=columnCount; c++) 
				{
					String headerData = driver.findElement(By.xpath("//table[@id='table1']//th["+c+"]")).getText();
					System.out.print(headerData+"  ");
				}
			}
			else 
			{
				for(int c=1; c<=columnCount; c++) 
				{
					String tableData = driver.findElement(By.xpath("//table[@id='table1']//tr["+(r-1)+"]//td["+c+"]")).getText();
					System.out.print(tableData+"  ");
				}
			}
			System.out.println();
		}
		
		driver.quit();
		
		
		
	}

}
