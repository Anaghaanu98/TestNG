package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGColor {
	WebDriver driver;
	@Test
	public void verifyFirstAlertColor()
	{
		WebElement firstText =driver.findElement(By.id("autoclosable-btn-success"));
		firstText.click();
		WebElement alertColor =driver.findElement(By.xpath("//div[@class='alert alert-success alert-autoclosable-success']"));
		String actualColor =alertColor.getCssValue("color");
		System.out.println(actualColor);
		String expectedColor ="rgba(21, 87, 36, 1)";
		Assert.assertEquals(actualColor, expectedColor);	
	}
	@Test
	public void verifyText()
	{
		WebElement firstText =driver.findElement(By.id("normal-btn-warning"));
		String actualText= firstText.getText();
		System.out.println(actualText);
		String expectedText ="Normal warning";
		Assert.assertEquals(actualText, expectedText);
	}
	@BeforeMethod
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/bootstrap-alert.php");
		driver.manage().window().maximize();
	}

}
