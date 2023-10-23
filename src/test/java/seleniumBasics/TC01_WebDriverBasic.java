package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01_WebDriverBasic {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google")) {
			System.out.println("Correct title...");
		}else {
			System.out.println("Invalid title");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();
		
		System.out.println(driver.getTitle());
		

	}

}
