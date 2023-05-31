package com.orangrhrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.orangehrm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	
	//Page Factory -- Object Repository
	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//button[@text='SignUp']")
	WebElement signUpBtn;

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement forgotPassword;
	
	By invalidCredentilasErrorMessage = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
	
	By requredErrorMessage = By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']");

	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	//Action String
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public DashboardPage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new DashboardPage();
	}

	public ForgotPasswordPage passwordReset() {
		forgotPassword.click();
		return new ForgotPasswordPage();
	}
	
	public WebElement getErrorMessage(WebDriver driver) {
		return driver.findElement(invalidCredentilasErrorMessage);
	}
	
	public WebElement getErrRequiredMessage(WebDriver driver) {
		return driver.findElement(requredErrorMessage);
	}

	
}
