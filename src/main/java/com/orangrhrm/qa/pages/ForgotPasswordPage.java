package com.orangrhrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.base.TestBase;

public class ForgotPasswordPage extends TestBase {

	By resetPassword = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']");

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement usernameInput;

	@FindBy(xpath = "//button[@type='button']")
	WebElement cancelButton;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement resetButton;

	@FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
	WebElement passLink;

	public ForgotPasswordPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement validateResetPassword(WebDriver driver) {
		return driver.findElement(resetPassword);
	}

	public void enterUsername(String username) {
		usernameInput.sendKeys(username);
	}

	public void clickCancelButton() {
		cancelButton.click();
	}

	public void clickResetButton() {
		resetButton.click();
	}

	public String getPassLinkText() {
		return passLink.getText();
	}

}
