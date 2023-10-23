package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC03_2_WindowBasedPopUp {
	
	// Set doesn't hold any duplicate values
	

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		String parentId = driver.getWindowHandle();
//		System.out.println(parentId);

		driver.findElement(By.xpath("//div[text()='Services']")).click();
		Set<String> allWindows = driver.getWindowHandles();

		int count = allWindows.size();
		System.out.println(count);
		
		for(String child: allWindows) {
			if(!parentId.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				
				driver.findElement(By.xpath("//div[@class='chatbotIcon']")).click();
				Thread.sleep(2000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		
		
	}

}
