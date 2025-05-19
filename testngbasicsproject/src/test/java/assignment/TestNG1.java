package assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG1 {
	WebDriver driver;
	@Test
	public void verifyButtonText()
	{
		WebElement text =driver.findElement(By.id("downloadButton"));
		String actualText =text.getText();
		String expectedText = "Start Download";
		Assert.assertEquals(actualText, expectedText);		
	}
	@Test
	public void verifyComplete()
	{
		WebElement text =driver.findElement(By.id("downloadButton"));
		text.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='dialog']//div[@class='progress-label']")));
		WebElement text1 = driver.findElement(By.xpath("//div[@id='dialog']//div[@class='progress-label']"));
		String actualtext1 =text1.getText();
		String expectedtext1 ="Complete!";
		Assert.assertEquals(actualtext1, expectedtext1);	
		}
	@BeforeMethod
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/jquery-progress-bar.php");
		
	}

}
