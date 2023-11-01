package testNgConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02_AmazonTest {

	WebDriver driver;
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
	}
	
	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title: "+title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
	}
	

	@Test
	public void searchExistTest() {
		boolean flag = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void isHelpExistTest() {
		boolean flag = driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
