package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG2 {	
	WebDriver driver;
	@Test
	public void verifyCheckboxoneEnabled()
	{
		WebElement checkbox =driver.findElement(By.id("check-box-one"));
		boolean actualResult1 = checkbox.isEnabled();
		System.out.println(actualResult1);
		Assert.assertTrue(actualResult1);	
	}
	@Test
	public void verifyCheckboxSelected()
	{
		WebElement checkbox =driver.findElement(By.id("check-box-one"));
		checkbox.click();
		boolean actualResult = checkbox.isSelected();
		System.out.println(actualResult);
		//boolean expectedResult =true;
		Assert.assertTrue(actualResult);
	}
	@BeforeMethod
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
	}

}
