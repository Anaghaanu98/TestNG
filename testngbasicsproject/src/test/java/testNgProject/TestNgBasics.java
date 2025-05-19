package testNgProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Execute before suite");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Execute before class");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Execute before test");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Execute before method");
	}
	
	@Test
	public void testCase()
	{
		System.out.println("Execute testcase");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Execute after method");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("Execute after test");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Execute after suite");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("Execute after class");
	}

}
