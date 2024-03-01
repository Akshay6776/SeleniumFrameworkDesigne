import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		//driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']")).click();
//		WebElement drpCountries =  driver.findElement(By.xpath("(//select)[1]"));
//		
//		Select drpCountry = new Select(drpCountries);
//		drpCountry.selectByVisibleText("Djibouti");
		
		//Selecting country without using method
		/*		
		driver.findElement(By.xpath("(//select)[1]")).click();
		
		List<WebElement> countries = driver.findElements(By.xpath("//Select/option"));
		
//		for(WebElement country : countries) 
//		{
//			if(country.getText().equalsIgnoreCase("Haiti")) 
//			{
//				country.click();
//				break;
//			}
//		}
//		

		
		for(WebElement country : countries) 
		{
			 String text = country.getAttribute("value");
			 if(text.equals("BEL")) 
			 {
				 country.click();
				 break;
			 }
		}
		
		try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
		//driver.quit();*/
		
		driver.findElement(By.xpath("(//select)[1]")).click();
		
		List<WebElement> countries = driver.findElements(By.xpath("//Select/option"));
		
		System.out.println(countries.size());
		
		driver.quit();
		
	}

}
