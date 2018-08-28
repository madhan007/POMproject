package com.umoveindia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import helpers.PageObject;

public class MyAccountPage extends PageObject {
	
	
	@FindBy(how=How.XPATH, using="//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")
	private WebElement WelcomeMsg;
	@FindBy(how=How.XPATH, using="//*[@id='header']/div[2]/div/div/nav/div[2]/a")
	private WebElement SignOut;
	
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	public void getMsgAfterLogin(){
		System.out.println(WelcomeMsg.getText());
	}
	
	public SignInPage SignOutFromAccount(){
		
		SignOut.click();
		return new SignInPage(driver);
		
	}
	

}
