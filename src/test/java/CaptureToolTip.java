import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CaptureToolTip {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.switchTo().frame(0);
		
		String toolTipYourAge = driver.findElement(By.xpath("//input[@id='age']")).getAttribute("title");
		System.out.println(toolTipYourAge);
		
		
		
		driver.quit();
		

	}

}
