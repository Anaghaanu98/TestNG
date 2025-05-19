package assignment;
import org.testng.annotations.DataProvider;
public class DataProviderS {
	
	@DataProvider(name ="Enter details")
	public Object[][] productsSearch()
	{
		return new Object [][] {{"abc","bfd","abcd@12","tvm","kerala","12345"},{"sdf","aaa","nhgt@12","tvm","kerala","87345"}};
	}

}
