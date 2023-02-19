package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeSuite
	public void test123rtf(){
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void test123rtfe(){
		System.out.println("After Suite");
	}
	
	@BeforeClass
	public void test123rtfed(){
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void test123rtfedd(){
		System.out.println("After Class");
	}
	
	@AfterMethod
	public void test123rtrfedd(){
		System.out.println("After Method");
	}
	
	@BeforeMethod
	public void test123rtf4(){
		System.out.println("Before Method");
	}
	
	@BeforeTest
	public void test123rt(){
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void test123rst(){
		System.out.println("After Test");
	}
	
	@Test
	public void test123(){
		System.out.println("day3 m1");
	}
	
	@Test
	public void test1234(){
		System.out.println("day3 m2");
	}
	
	@Test
	public void abc123(){
		System.out.println("day3 m3");
	}
	
	@Test
	public void abc1234(){
		System.out.println("day3 m4");
	}

}
