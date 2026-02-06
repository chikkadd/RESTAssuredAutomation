package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{
	@DataProvider(name="username")
	public Object[][] username()
	{
		return new Object[][] {{"chikke","sonika"},{"Gowda","sonika"}};
		
	}
	@Test(dataProvider="username")
	public void test(String username, String password)
	{
		System.out.println("dATAPROVIDER username VALUES "+username);
		System.out.println("dATAPROVIDER password VALUES "+password);
	}
	
	@DataProvider(name="usernameSinge")
	public Object[] usernameSinge()
	{
		return new Object[] {"Deepu","Hema"};
		
	}
	@Test(dataProvider="usernameSinge")
	public void test2(String user)
	{
		System.out.println("dATAPROVIDER username VALUES "+user);
	}

}
