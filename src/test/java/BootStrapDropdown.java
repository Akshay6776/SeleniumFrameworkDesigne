import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BootStrapDropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/selectmenu/");

		driver.switchTo().frame(0);
		

		
		
		//select speed
		driver.findElement(By.xpath("(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[1]")).click();
		List<WebElement> speeds = driver.findElements(By.xpath("//ul[@id='speed-menu']/li/div"));
		selectDropDownOptions(speeds,"Medium");
		
//		for(WebElement speed : speeds) 
//		{
//			if(speed.getText().equals("Medium")) 
//			{
//				speed.click();
//				break;
//			}
//		}
		
		//select fileType
		driver.findElement(By.xpath("(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[2]")).click();
		List<WebElement> filesType = driver.findElements(By.xpath("//ul[@id='files-menu']/li/div"));
		selectDropDownOptions(filesType,"Some unknown file");
		
//		for(WebElement file : filesType) 
//		{
//			if(file.getText().equals("Some unknown file")) 
//			{
//				file.click();
//				break;
//			}
//		
//		}
		
		driver.findElement(By.xpath("(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[3]")).click();
		List<WebElement> numberType = driver.findElements(By.xpath("//ul[@id='number-menu']/li/div"));
		selectDropDownOptions(numberType,"5");
		
		
		
	}



public static void selectDropDownOptions(List<WebElement> options, String value) 
{
	for(WebElement option : options) 
	{
		if(option.getText().equals(value)) 
		{
			option.click();
			break;
		}
	}
}


}


