package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC03_0_Alert {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		System.out.println(text);
		
		if(text.equalsIgnoreCase("Please enter a valid user name")) {
			System.out.println("Correct error msg...");
		}else {
			System.out.println("Invalid error msg");
		}
		
		alt.accept();
		
//		alt.dismiss()
		
		
	}

}
