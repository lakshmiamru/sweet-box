import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Softwares\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("fromCity")).sendKeys("mum");
		Thread.sleep(3000);
		driver.findElement(By.id("fromCity")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("fromCity")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

	}

}
