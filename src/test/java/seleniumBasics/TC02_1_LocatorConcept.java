package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC02_1_LocatorConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://app.hubspot.com/login/beta");
		
		driver.findElement(By.id("username")).sendKeys("reacttestingca@gmail.com");
		
		driver.findElement(By.id("loginBtn")).click();
		
		driver.findElement(By.id("current-password")).sendKeys("123@Mohan");
		
		driver.findElement(By.xpath("//i18n-string[text()= 'Log in']")).click();

	}

}
