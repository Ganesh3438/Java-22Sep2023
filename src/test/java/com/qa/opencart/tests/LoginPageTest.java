package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class LoginPageTest extends BaseTest {

	@Test
	public void loginPageTitleTest() {

		String actualtitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(actualtitle, "My Account");
	}
	
	@Test
	public void loginPageUrlTest() {
		String actualURL = loginPage.getLoginPageURL();
		Assert.assertTrue(actualURL.contains("route=account/account"));
	}
	
//	@Test
//	public void forgotPwdLinkExistTest() throws InterruptedException {
//		Assert.assertTrue(loginPage.isForgotPwdLinkExit());
//	}
	
	@Test
	public void doLoginTest() throws InterruptedException {
		loginPage.doLogin("testing99@mailinator.com", "123456");
	}

}
