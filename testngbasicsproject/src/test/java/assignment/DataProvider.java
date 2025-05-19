package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider {
	
	WebDriver driver;
	@Test(dataProvider ="Enter details",dataProviderClass=DataProviderS.class)
	public void verifyCredentialsInputTab(String firstName,String lastName,String userName, String city,String state, String zip)
	{
		WebElement firstNameTab = driver.findElement(By.id("validationCustom01"));
		firstNameTab.sendKeys(firstName);
		WebElement LastNameTab = driver.findElement(By.id("validationCustom02"));
		LastNameTab.sendKeys(lastName);
		WebElement userNameTab = driver.findElement(By.id("validationCustomUsername"));
		userNameTab.sendKeys(userName);
		WebElement cityTab = driver.findElement(By.id("validationCustom03"));
		cityTab.sendKeys(city);
		WebElement stateTab = driver.findElement(By.id("validationCustom04"));
		stateTab.sendKeys(state);
		WebElement zipTab = driver.findElement(By.id("validationCustom05"));
		zipTab.sendKeys(zip);
		
		WebElement checkbox = driver.findElement(By.id("invalidCheck"));
		checkbox.click();
		WebElement submit =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		submit.click();
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://selenium.qabible.in/form-submit.php");
	driver.manage().window().maximize();
	}

}
