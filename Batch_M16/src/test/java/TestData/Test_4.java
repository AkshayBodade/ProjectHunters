package TestData;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Test_4 {
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Browser Open");
	}

	@Test
	public void testa() {
		System.out.println("Test A");
		Assert.assertTrue(false);
		//Asserts.assertTrue(false); //code fail TC
	}
	
	@Test(invocationCount=3)
	public void testb() {
		System.out.println("Test B");
	}
	
	@Test(dependsOnMethods="testa")
	public void testc() {
		System.out.println("Test C");
	}
	
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Browser Close");
	}


}
