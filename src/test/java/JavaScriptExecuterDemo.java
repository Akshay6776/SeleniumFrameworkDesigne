import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptExecuterDemo {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		
		
//		//draw border Line
//		WebElement logoele = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		JavaScriptUtils.drawBorder(logoele, driver);
//		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File trg = new File("C:\\Users\\HP\\OneDrive\\Desktop\\Screenshot\\logo.png");
//		try {
//			FileUtils.copyFile(src, trg);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
//		//capture title of page
//		String title = JavaScriptUtils.getTitleByJS(driver);
//		System.out.println(title);
		
		//click 
		
//		WebElement booksButton = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']"));
//		JavaScriptUtils.clickElementByJs(booksButton, driver);
		
		//generate alert message
		
		//JavaScriptUtils.generateAlert(driver, "Hi! Watsup");
		
		WebElement logoele = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		JavaScriptUtils.flash(driver, logoele);
		
		//driver.quit();
		

	}

}
