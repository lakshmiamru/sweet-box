import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Softwares\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerElements = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerElements.findElements(By.tagName("a")).size());
		
		WebElement firstfoolter = footerElements.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(firstfoolter.findElements(By.tagName("a")).size());
		String clickonlinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		
		
		
		for(int i=1; i<firstfoolter.findElements(By.tagName("a")).size(); i++){
			
			firstfoolter.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
		}
		
		Set<String> window1 = driver.getWindowHandles();
		Iterator<String> itr = window1.iterator();
		
		while(itr.hasNext()){
			
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
			
			
		}
		
		
		
		
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		for(int i=0; i<links.size(); i++){
//			System.out.println(links.get(i).getText());
//		}
	}

}
