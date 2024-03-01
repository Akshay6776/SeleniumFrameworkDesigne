import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DownLoadFiles {

	public static void main(String[] args) {
		
		String location = "C:\\Users\\HP\\OneDrive\\Desktop\\Downloads\\";
		
		HashMap<String, String> preferences = new HashMap<String, String>();
		preferences.put("download.default_directory", location);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.setExperimentalOption("prefs", preferences);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");

		
		WebElement downLoadButton = driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", downLoadButton);
		
		Actions act = new Actions(driver);
		act.moveToElement(downLoadButton).click().perform();
		
		
		//driver.quit();
		
	}

}
