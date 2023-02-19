import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dynamicdd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Softwares\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("vijay");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
//		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
//		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		

	}

}
