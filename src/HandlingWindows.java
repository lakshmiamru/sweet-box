import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Softwares\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Admin/Desktop/NewTabWindow.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Visit W3Schools.com!")).click();
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids.size());
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		System.out.println("parent title: "+driver.switchTo().window(parentId).getTitle());
		System.out.println("child title: "+driver.switchTo().window(childId).getTitle());
		driver.close();
		driver.switchTo().window(parentId);
		driver.close();
		

	}

}
