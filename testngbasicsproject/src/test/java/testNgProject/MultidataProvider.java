package testNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultidataProvider {
	
	WebDriver driver;
	@Test(dataProvider="Login page",dataProviderClass=DataProviderS.class)
	public void verifySearch(String userName, String password)
	{
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(userName);
		System.out.println(userName);
		WebElement password1 = driver.findElement(By.id("pass"));
		password1.sendKeys(password);
		System.out.println(password);
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
		
	}
	@BeforeMethod
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

}
