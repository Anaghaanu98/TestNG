package testNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderEx {
	WebDriver driver;
	@Test(dataProvider="Search product",dataProviderClass=DataProviderS.class)//singledimension data provider
	public void verifySearch(String product)
	{
		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys(product);
		search.sendKeys(Keys.ENTER);
		System.out.println(product);
		
	}
	@BeforeMethod
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}

}
