package com.umoveindia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import helpers.PageObject;

public class SignInPage extends PageObject {

	@FindBy(how = How.ID, using = "email")
	private WebElement loginEmailTxtBox;
	@FindBy(how = How.ID, using = "passwd")
	private WebElement LoginPasswd;
	@FindBy(how = How.XPATH, using = "//*[@id='SubmitLogin']")
	private WebElement SubmitBtn;
	@FindBy(how = How.XPATH, using = "//*[@id='columns']/div[1]/a")
	private WebElement HomeBtn;

	public SignInPage(WebDriver driver) {
		super(driver);
	}

	public void SignInDetails(String Uname, String Passwd) {

		loginEmailTxtBox.sendKeys(Uname);
		LoginPasswd.sendKeys(Passwd);
	}

	public MyAccountPage clickOnSubmitBtn() {
		SubmitBtn.submit();
		return new MyAccountPage(driver);
	}

	public void goToHome() {

		HomeBtn.click();

	}

}
