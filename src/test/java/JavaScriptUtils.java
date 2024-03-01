import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtils {

	
	public static void drawBorder(WebElement ele,WebDriver driver) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'", ele);
	}
	
	public static String getTitleByJS(WebDriver driver) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static void clickElementByJs(WebElement ele,WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
	} 

	public static void generateAlert(WebDriver driver,String message) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('"+message+"')");
	}
	
	public static void refreshPageByJS(WebDriver driver) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");	
	}
	
	public static void scrollDownPageByJS(WebDriver driver) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");	
	}
	
	public static void scrollUpPageByJS(WebDriver driver) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");	
	}
	
	public static void zoomPageByJS(WebDriver driver) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='50%'");	
	}
	
	
	public static void changeColour(WebDriver driver, String color,WebElement ele) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",ele);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void flash(WebDriver driver,WebElement ele) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String bgcolor = ele.getCssValue("backgroundColor");
		for(int i=0; i<20; i++) 
		{
			changeColour(driver,"#000000",ele);
			changeColour(driver,bgcolor,ele);
		}
	}
	
	
}
