package com.umoveindia.tests;

import org.testng.annotations.Test;

import com.umoveindia.pages.*;

import helpers.TestsBase;

public class LoginToAccount_Test extends TestsBase {

	@Test
	public void LoginTest() {

		HomePage homepage = new HomePage(driver);
		SignInPage signin = homepage.clickOnSignIn();
		signin.SignInDetails("abcd@wxy.com", "a1b1c1");
		MyAccountPage AccPage=signin.clickOnSubmitBtn();
		AccPage.getMsgAfterLogin();
		

	}

}
