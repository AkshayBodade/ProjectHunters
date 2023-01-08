package TestData;

import org.testng.annotations.Test;

import Demo3.Library;

public class Test_1 {
	@Test
	public void test1() throws Exception
	{
		String data1=Library.getStringData_Excel("Sheet1", 0, 0);
		System.out.println(data1);
	}
@Test
public void test2()
{
	System.out.println("data1");
}

}
