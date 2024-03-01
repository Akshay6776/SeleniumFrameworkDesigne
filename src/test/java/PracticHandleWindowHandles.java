import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticHandleWindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		driver.findElement(By.xpath("//div[@class='orangehrm-copyright-wrapper']//a")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		//Iterater method
		
//		Iterator<String> it = windowIds.iterator();
//		String parentWindowId = it.next();
//		System.out.println("Parent Window id: "+parentWindowId);
//		System.out.println("Parent Window Title: "+driver.getTitle());
//		
//		String childWindowId = it.next();
//		System.out.println("Child Window id: "+childWindowId);
//		System.out.println("Child Window Title: "+driver.getTitle());
		
		//List method
		
		List<String> actualWindowIds = new ArrayList<String>(windowIds);
		
//		String parentWinId = actualWindowIds.get(0);
//		String childWinId = actualWindowIds.get(1);
//		
//		driver.switchTo().window(parentWinId);
//		System.out.println("Parent Window id: "+parentWinId);
//		System.out.println("Parent Window Title: "+driver.getTitle());
//		
//		driver.switchTo().window(childWinId);
//		System.out.println("Child Window id: "+childWinId);
//		System.out.println("Child Window Title: "+driver.getTitle());

		// for each Loop
		
		for(String winId: actualWindowIds) 
		{
			String title = driver.switchTo().window(winId).getTitle();
			System.out.println(title);
			if(title.equals("OrangeHRM HR Software | OrangeHRM")) 
			{
				driver.close();
			}
		}
		
		//driver.close();
		
	}

}
