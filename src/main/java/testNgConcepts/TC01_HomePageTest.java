package testNgConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC01_HomePageTest {
	
	@BeforeSuite
	public void startDBConnection() {
		System.out.println("BS --- startDBConnection");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("BT--createUser");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launch browser");
	}
	
	@BeforeMethod
	public void loginToAPP() {
		System.out.println("BM--loginToApp");
	}
	
	
	@Test
	public void homePageTitleTest() {
		System.out.println("homePageTitletest");
	}
	
	@Test
	public void homePageURLTest() {
		System.out.println("homePageURLTest");
	}
	
	@Test
	public void homePageSearchTest() {
		System.out.println("homePageSearchTest");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- closeBrowser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- deleteUser");
	}
	
	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS -- disconnectDB");
	}
	
}
