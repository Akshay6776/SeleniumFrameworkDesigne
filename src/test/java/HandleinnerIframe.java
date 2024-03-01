import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleinnerIframe {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		
	 	WebElement outerIframe = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
	 	driver.switchTo().frame(outerIframe);
	 	
	 	WebElement innerIframe = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	 	driver.switchTo().frame(innerIframe);
	 	
	 	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome");
	 	
		
		driver.quit();
		

	}

}
