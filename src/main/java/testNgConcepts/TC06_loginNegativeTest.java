package testNgConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC06_loginNegativeTest {

	public WebDriver driver;

	public void doLogin(String username, String password) throws InterruptedException {

		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(2000);
//		String errorMsg = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
//		System.out.println(errorMsg);
//
//		if (errorMsg.contains("No match for E-mail Address and/or Password")) {
//			return true;
//		}
//		return false;
	}
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
	}
	
	@DataProvider
	public Object[][] getLoginNegativeData() {
		return new Object[][] {
			{"fghdh@gmail.com", ""},
			{"fghdh@gmail.com", "524525"},
			{"fghdh1@gmail.com", "bsghs"},
		};
	}
	
	@Test(dataProvider = "getLoginNegativeData")
	public void loginTest(String userName, String password) throws InterruptedException {
//		Assert.assertTrue(doLogin("fgdsgs", "gydydhuj"));
//		doLogin("fd@gmail.com", "dssg");
		doLogin(userName, password);
	}
	
	@AfterTest
	public void tearDown() {
//		driver.quit();
	}

}
