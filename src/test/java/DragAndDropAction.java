import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		

		WebElement osloCapital = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement stockholmCapital = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement washingtonCapital = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement copenhagenCapital = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement seoulCapital = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement romeCapital = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement madridCapital = driver.findElement(By.xpath("//div[@id='box7']"));
		
		WebElement norwayCountry = driver.findElement(By.xpath("//div[@id='box101']"));
		WebElement swedenCountry = driver.findElement(By.xpath("//div[@id='box102']"));
		WebElement unitedStatesCountry = driver.findElement(By.xpath("//div[@id='box103']"));
		WebElement denmartCountry = driver.findElement(By.xpath("//div[@id='box104']"));
		WebElement sountKoreaCountry = driver.findElement(By.xpath("//div[@id='box105']"));
		WebElement italeCountry = driver.findElement(By.xpath("//div[@id='box106']"));
		WebElement spainCountry = driver.findElement(By.xpath("//div[@id='box107']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(osloCapital, norwayCountry).perform();
		act.dragAndDrop(stockholmCapital, swedenCountry).perform();
		act.dragAndDrop(washingtonCapital, unitedStatesCountry).perform();
		act.dragAndDrop(copenhagenCapital, denmartCountry).perform();
		act.dragAndDrop(seoulCapital, sountKoreaCountry).perform();
		act.dragAndDrop(romeCapital, italeCountry).perform();
		act.dragAndDrop(madridCapital, spainCountry).perform();
		
		driver.quit();
		
	}

}
