package com.orangehrm.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.qa.base.TestBase;
import com.orangrhrm.qa.pages.ForgotPasswordPage;
import com.orangrhrm.qa.pages.LoginPage;

public class ForgotPasswordTest extends TestBase {

	LoginPage loginPage;
	ForgotPasswordPage forgotPasswordPage;

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		forgotPasswordPage = new ForgotPasswordPage();
	}

	@Test(priority = 8)
	public void validateResetPasswordText() {
		loginPage.passwordReset();
		Assert.assertTrue(forgotPasswordPage.validateResetPassword(driver).getText().contains("Reset Password"));
	}

	@Test(priority = 9)
	public void validatePasswordReset() {
		loginPage.passwordReset();
		forgotPasswordPage.enterUsername(prop.getProperty("un"));
		forgotPasswordPage.clickResetButton();
		Assert.assertTrue(forgotPasswordPage.getPassLinkText().contains(prop.getProperty("resetTxt")));
	}

	@Test(priority = 10)
	public void validateCancelButton() {
		loginPage.passwordReset();
		forgotPasswordPage.clickCancelButton();
		Assert.assertEquals(loginPage.validateLoginPageTitle(), prop.getProperty("pageTitle"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
