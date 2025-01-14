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

public class ChronoOrder2 {
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
	@BeforeClass
	public void beforeClass1()
	{
		System.out.println("before class 1");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}@Test
	public void test1()
	{
		System.out.println(" test case 1");
	}
	@Test
	public void test2()
	{
		System.out.println(" test case 2");
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
