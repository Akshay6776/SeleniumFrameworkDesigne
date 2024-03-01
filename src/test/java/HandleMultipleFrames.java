import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		
		
		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(0);
		
		String iconName = driver.findElement(By.xpath("//a[normalize-space()='Menu']")).getText();
		System.out.println(iconName);
		
		driver.switchTo().parentFrame();
		
		String outerFrameText = driver.findElement(By.xpath("//h1[normalize-space()='The iframe element']")).getText();
		System.out.println(outerFrameText);
		
		driver.quit();

	}

}
