package testNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTestcase {
	
	WebDriver driver;//drawback of specifying the browser--updated version should be taken everytime
	@Test()
	public void verifyTitle()
	{
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle ="Anagha";
		Assert.assertEquals(actualTitle, expectedTitle,"Failed due to existing bug");//for comparing expected and actual result--first should be actual and next expected
	}
	@Test(invocationCount = 2)//the run below runs this specific test--runs in alphabetical order of testcase,invocation to run the test multiple times
	public void verifyShowmessageButtonText()
	{
		WebElement text =driver.findElement(By.id("button-one"));
		String actualButtonText = text.getText();
		String expextedButtonText ="Show Message";
		Assert.assertEquals(actualButtonText, expextedButtonText);
	}
	@Test(priority=2,enabled=false)//prirority:runs acc to priority number, enable false will not run the test
	public void verifyShowmessageBackgroundColor()
	{
		WebElement text =driver.findElement(By.id("button-one"));
		String actualColor =text.getCssValue("background-color");
		System.out.println(actualColor);
		String expextedColor ="rgba(0, 123, 255, 1)";
		Assert.assertEquals(actualColor, expextedColor);
	}
	@Test(dependsOnMethods = "verifyTitle")//depended one should not have priority--this one will get skipped
	public void verifyShowmessageButtonEnabled()
	{
		WebElement text =driver.findElement(By.id("button-one"));
		boolean actualResult = text.isEnabled();
		//Assert.assertEquals(actualResult, true);//since the expected is 'true' not declaring separately
		Assert.assertTrue(actualResult);//checks if actualresult is true
		
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
	//to generate report->test-output->show in->system explorer->emailer
	

}
