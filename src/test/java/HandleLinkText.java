import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//capture all the links
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
//		for(WebElement link: links) 
//		{
//			System.out.println((link.getText()));
//		}
		
		for(int i=0; i<links.size(); i++) 
		{
			System.out.println((links.get(i).getText()));
			System.out.println(links.get(i).getAttribute("href"));
		}
		
		
		driver.quit();
		
	}

}
