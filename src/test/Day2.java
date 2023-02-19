package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test
	public void test123(){
		System.out.println("day2 m1");
	}
	
	@Test
	public void test1234(){
		System.out.println("day2 m2");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test12345(){
		System.out.println("day2 m3");
	}

}
