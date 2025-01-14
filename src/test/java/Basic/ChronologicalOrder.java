package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder {
	
	@BeforeSuite
	public void  beforeSuite()
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before test");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}@Test
	public void test()
	{
		System.out.println(" test");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After class");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After test");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite");
	}
	

}
