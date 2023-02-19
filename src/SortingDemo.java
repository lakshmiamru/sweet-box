import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortingDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Softwares\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
//		ArrayList<String> al1 = new ArrayList<String>();
//		
//		al1.add("Z");
//		al1.add("F");
//		al1.add("B");
//		al1.add("X");
//		
//		for(int i=0; i<al1.size(); i++)
//			System.out.println(al1.get(i));
//		
//		System.out.println("&&&&&&&&&&&&&&");
//		
//		ArrayList<String> al2 = (ArrayList<String>) al1.clone();
//		Collections.sort(al2); 
//		for(int i=0; i<al2.size(); i++)
//			System.out.println(al2.get(i));
//		System.out.println(al1.equals(al2));
		
		
		
		
		

	}

}
