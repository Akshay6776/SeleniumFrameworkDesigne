import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int BrokenLink = 0;
		
		for(WebElement ele:links) 
		{
			String url = ele.getAttribute("href");
			if(url==null || url.isEmpty()) 
			{
				System.out.println("url is empty");
				continue;
			}
			
			
			URL link = null;
			try {
				link = new URI(url).toURL();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HttpURLConnection httpConn = null;
			try {
				httpConn = (HttpURLConnection) link.openConnection();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				httpConn.connect();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				if(httpConn.getResponseCode()>=400) 
				{
					System.out.println(httpConn.getResponseCode()+"  "+url+"  "+"is Broken Link");
					BrokenLink++;
				}
				else 
				{
					System.out.println(httpConn.getResponseCode()+"  "+url+"  "+"is valied Link");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("The no of Broken Links are: "+BrokenLink);
		
		driver.quit();

	}

}
