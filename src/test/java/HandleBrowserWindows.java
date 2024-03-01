import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		//System.out.println((driver.getWindowHandle()));
		
		driver.findElement(By.xpath("//div[@class='orangehrm-copyright-wrapper']//a")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
//		
//		 Iterator<String> it = windowIds.iterator();
//		 String parentId = it.next();
//		 String childId = it.next();
//		 
//		 System.out.println(parentId);
//		 System.out.println(childId);
		 
		
		List<String> windowIdList = new  ArrayList<String>(windowIds);
		 
//		String parentWindowId = windowIdList.get(0);
//		String childWindowId = windowIdList.get(1);
		
//		System.out.println(parentWindowId);
//		System.out.println(childWindowId);
//		
//		driver.switchTo().window(parentWindowId);
//		System.out.println("Parent Window title: "+driver.getTitle());
//		driver.switchTo().window(childWindowId);
//		System.out.println("child Window title: "+driver.getTitle());
		
		
//		for(String winId: windowIdList) 
//		{
//			//System.out.println(winId);
//			String title = driver.switchTo().window(winId).getTitle();
//			System.out.println(title);
//			
//		}
		
		//driver.quit();
		
		for(String winId: windowIdList) 
		{
			//System.out.println(winId);
			String title = driver.switchTo().window(winId).getTitle();
			if(title.equals("OrangeHRM")) 
			{
				driver.close();
			}
			
		}
		
		
		
		
		
	}

}
