import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HandleSlider {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/slider/");
		
		
		driver.switchTo().frame(0);
		
		WebElement sliderEle = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		System.out.println("Loaction of slider: "+sliderEle.getLocation());
		System.out.println("size of siider: "+sliderEle.getSize());
		
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(sliderEle, 300, 0).perform();
		act.dragAndDropBy(sliderEle, -100, 0).perform();
		
		System.out.println("Loaction of slider: "+sliderEle.getLocation());
		System.out.println("size of siider: "+sliderEle.getSize());

		driver.quit();		
	}

}
