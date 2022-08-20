package beta_Test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ai.gm.qa.base.TestBase;

public class L_Tesnng_annotation extends TestBase
{
	@BeforeSuite
	public void before_suite_test()
	{
		System.out.println("1. Befoe suite");
	}
	@BeforeTest
	public void before_test()
	{
		System.out.println("2. before test");
	}
	@BeforeClass
	public void before_class()
	{
		System.out.println("3. before class test");
	}
	@BeforeMethod
	public void before_method_test()
	{
		System.out.println("4. before method");
	}
	@Test
	public void test_test()
	{
		System.out.println("5. Test test");
	}
	@AfterSuite
	public void after_suite_test()
	{
		System.out.println("6. After suite");
	}
	@AfterTest
	public void after__test()
	{
		System.out.println("7. After test");
	}
	@AfterClass
	public void after__class()
	{
		System.out.println("8. After class test");
	}
	@AfterMethod
	public void after__method_test()
	{
		System.out.println("9. After method");
	}
}
