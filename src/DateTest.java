import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DateTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Softwares\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("travel_date")).click();
		
		
		
		while(!driver.findElement(By.xpath("//table[@class=' table-condensed']//th[@class='datepicker-switch']")).getText().contains("June")){
			driver.findElement(By.xpath("//table[@class=' table-condensed']//th[@class='next']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.xpath("//td[@class='day']"));
		
		for(int i=0; i<dates.size(); i++){
			
			if(dates.get(i).getText().equals("28")){
				dates.get(i).click();
				break;
			}
				
		}
		

	}

}
