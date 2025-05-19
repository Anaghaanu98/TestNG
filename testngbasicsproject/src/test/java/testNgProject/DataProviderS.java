package testNgProject;

import org.testng.annotations.DataProvider;

public class DataProviderS {
	
	@DataProvider(name="Search product")
	public Object[][] productsSearch()
	{
		return new Object [][] {{"bag"},{"shoe"},{"watch"}};
	}
	
	@DataProvider(name="Login page")
	public Object[][] methodData1()
	{
		return new Object [][] {{"anagha@gmail.com","1234"},{"abc@gmail.com","abcd"},{"hgf@gmail.com","hfg"}};
	}
	


}
