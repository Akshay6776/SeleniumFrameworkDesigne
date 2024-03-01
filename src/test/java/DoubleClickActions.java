import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActions {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_event_dblclick");

		driver.switchTo().frame("iframeResult");
		
		WebElement paragraphClick = driver.findElement(By.xpath("//p[normalize-space()='Double-click on this paragraph.']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(paragraphClick).doubleClick().perform();
		
		driver.switchTo().alert().accept();
		
		driver.close();

	}

}
