package TestData;

import org.testng.annotations.Test;

public class Test_5 {
	@Test(groups= {"Sanity"})
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(groups= {"Regression"})
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test(groups= {"Sanity"})
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test(groups= {"Sanity"})
	public void test4() {
		System.out.println("Test 4");
	}

}
