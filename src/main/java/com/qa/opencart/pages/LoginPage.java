package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	// 1. private By locators:
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By loginbtn = By.xpath("//input[@value='Login']");
    private By forgotPwdLink = By.linkText("Forgotten Password");
    
    // 2. page constructor...
    public LoginPage(WebDriver driver) {
    	this.driver = driver;
    }
    
    //3. page actions/methods
    public String getLoginPageTitle() {
    	String title = driver.getTitle();
    	System.out.println("Login page title: "+ title);
    	return title;
    }
	
    public String getLoginPageURL() {
    	String url = driver.getCurrentUrl();
    	System.out.println("Login page title: "+ url);
    	return url;
    }
    
    public boolean isForgotPwdLinkExit() throws InterruptedException {
    	Thread.sleep(2000);
    	boolean status = driver.findElement(forgotPwdLink).isDisplayed();
    	return status;
    }
	
    
    //positive use case
    public void doLogin(String un, String pwd) throws InterruptedException {
    	
    	driver.findElement(emailId).sendKeys(un);
    	driver.findElement(password).sendKeys(pwd);
    	Thread.sleep(2000);
    	driver.findElement(loginbtn).click();
    }
	
	
	
}
