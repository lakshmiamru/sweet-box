import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetSizeDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Softwares\\chromedriver_win32 (2)\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("http://spiproject.com");
		Thread.sleep(4000);
//		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getClass());
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
		Dimension d = new Dimension(500,350);	
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(5000);
		driver.quit();
	}

}
