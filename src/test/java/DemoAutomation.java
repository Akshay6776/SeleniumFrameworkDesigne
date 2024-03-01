import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class DemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(passwordField)).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(passwordField)).click();
		driver.quit();
	}

}
