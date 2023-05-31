package com.orangehrm.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.qa.base.TestBase;
import com.orangrhrm.qa.pages.DashboardPage;
import com.orangrhrm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	DashboardPage dashboardPage;

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority=0)
	public void validateLogin() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, prop.getProperty("pageTitle"));

	}

	@Test(priority=1)
	public void loginTestValidCredentilas() {
		loginPage.login(prop.getProperty("un"), prop.getProperty("pwd"));

	}

	@Test(priority=2)
	public void loginTestRightUsernameWrongPassword() {
		loginPage.login(prop.getProperty("un"), prop.getProperty("wrongPass"));
		Assert.assertTrue(loginPage.getErrorMessage(driver).getText().contains(prop.getProperty("invCred")));

	}

	@Test(priority=3)
	public void loginTestWrongUsernameRightPassword() {
		loginPage.login(prop.getProperty("wrongUsername"), prop.getProperty("pwd"));
		Assert.assertTrue(loginPage.getErrorMessage(driver).getText().contains(prop.getProperty("invCred")));

	}

	@Test(priority=4)
	public void loginTestWrongUsernameWrongPassword() {
		loginPage.login(prop.getProperty("wrongUsername"), prop.getProperty("wrongPass"));
		Assert.assertTrue(loginPage.getErrorMessage(driver).getText().contains(prop.getProperty("invCred")));

	}

	@Test(priority=5)
	public void loginTestBlankUsernameBlankPassword() {
		loginPage.login("", "");
		Assert.assertTrue(loginPage.getErrRequiredMessage(driver).getText().contains(prop.getProperty("req")));
		System.out.println(loginPage.getErrRequiredMessage(driver).getText());

	}

	@Test(priority=6)
	public void loginTestRightUsernameBlankPassword() {
		loginPage.login(prop.getProperty("un"), "");
		Assert.assertTrue(loginPage.getErrRequiredMessage(driver).getText().contains(prop.getProperty("req")));

	}

	@Test(priority=7)
	public void loginTestBlankUsernameRightPassword() {
		loginPage.login("", prop.getProperty("pwd"));
		Assert.assertTrue(loginPage.getErrRequiredMessage(driver).getText().contains(prop.getProperty("req")));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
