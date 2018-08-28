package com.umoveindia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import helpers.PageObject;

public class HomePage extends PageObject {

	@FindBy(how = How.XPATH, using = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	private WebElement SignInLink;
	@FindBy(how = How.LINK_TEXT, using = "Contact us")
	private WebElement ContactUsLink;

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public SignInPage clickOnSignIn(){
		
		SignInLink.click();
		return new SignInPage(driver);
		
	}
	
	public ContactUsPage clickOnContactUsLink(){
		
		ContactUsLink.click();
		return new ContactUsPage(driver);
		
	}

}
