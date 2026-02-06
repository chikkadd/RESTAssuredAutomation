package tests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTests 
{
	@Test(description="this is the description of testNG")
	public void test()
	{
		System.out.println("Test method executed");
	}
	@Test(invocationCount=2,invocationTimeOut =100 )
	public void test1() 
	{
		for(int i=0;i<50;i++) {
			try {
			//Thread.sleep(1);
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
		System.out.println("Test method 1 executed "+i);
		}
	}
	
	@Test(dependsOnMethods="test", timeOut = 200)
	public void test2()
	{
		for(int i=0;i<50;i++) {
			try {
			Thread.sleep(1);
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
		System.out.println("Test method 2 executed "+i);
		}
	}
	
	@Test(enabled=true)
	public void test5()
	{
		System.out.println("Test method 5 executed");
	}
	@Test(priority=1)
	public void test3()
	{
		System.out.println("Test method 3 executed");
	}
	
	@Test(expectedExceptions = {ArithmeticException.class})
	public void test4()
	{
		int x=5/0;
		System.out.println("Test method 4 executed"+x);
	}

	/*
	 * @BeforeSuite public void test_beforeSuite() {
	 * System.out.println("@before Suite method executed"); }
	 * 
	 * @AfterSuite public void test_afterSuite() {
	 * System.out.println("@after suite method executed"); }
	 * 
	 * @AfterClass public void test_afterClass() {
	 * System.out.println("@afterclass method executed"); }
	 * 
	 * @BeforeClass public void test_beforeClass() {
	 * System.out.println("@afterclass method executed"); }
	 * 
	 * @BeforeMethod public void test_beforemethod() {
	 * System.out.println("@abefore method executed"); }
	 * 
	 * @AfterMethod public void test_AfterMethod() {
	 * System.out.println("@after method executed"); }
	 * 
	 * @BeforeTest public void test_beforetest() {
	 * System.out.println("@abefore test method executed"); }
	 * 
	 * @AfterTest public void test_Aftertest() {
	 * System.out.println("@after test method executed"); }
	 */

	

}
