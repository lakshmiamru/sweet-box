package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	
	
	@Test()
	public void test123() throws IOException{
		System.out.println("day1 method1");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\workspace\\SeleniumByDevName\\src\\test\\config.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		
	}
	
	@Test()
	public void test1234(){
		System.out.println("day1 method2");
//		System.out.println(un +":"+ pwd);
	}
	
	@Test()
	public void test1231(){
		System.out.println("day1 method3");
//		System.out.println(un +":"+ pwd);
	}
	
	@Test()
	public void test12321(){
		System.out.println("day12 method4");
		System.out.println("day12 method4");
//		System.out.println(un +":"+ pwd);
		System.out.println("day12 method4");
		System.out.println("day12 method4");
	}
	
	
	
	@DataProvider
	public Object getData(){
		Object[][] data = new Object[3][2];
		
		data[0][0] = "firstUN";
		data[0][1] = "firstPWD";
		
		data[1][0] = "secondUN";
		data[1][1] = "secondPWD";
		
		data[2][0] = "thirdUN";
		data[2][1] = "thirdPWD";
		
		return data;
	}
	

}
