package testNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertEg {
	WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

	
	@Test
	public void verifyButtonColorButtontext()
	{
		WebElement text =driver.findElement(By.id("button-one"));
		String actualText = text.getText();
		String expectedText ="Show Message";
		String actualColor =text.getCssValue("background-color");
		System.out.println(actualColor);
		String expextedColor ="rgba(0, 123, 255, 2)";
		softAssert.assertEquals(actualColor, expextedColor);//softassert is used to run all the testcases if passed or failed. If we dont use the tests after a failed one will not execute
		softAssert.assertEquals(actualText, expectedText);
		System.out.println("Hello");
		softAssert.assertAll();//if not given the failed test case will not fail

}
	@BeforeMethod
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
