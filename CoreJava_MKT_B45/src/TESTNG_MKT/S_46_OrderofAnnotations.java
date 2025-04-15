package TESTNG_MKT;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class S_46_OrderofAnnotations {

	@BeforeTest
	public void bTest()
	{
		System.out.println("bTest");
	}
	@BeforeClass
	public void bClass()
	{
		System.out.println("bClass");
	}
	
	@BeforeMethod
	public void bMethod()
	{
		System.out.println("bMethod");
	}
	
	@AfterMethod
	public void aMethod()
	{
		System.out.println("aMethod");
	}
	
	@Test
	public void test()
	{
		System.out.println("test");
	}
}
