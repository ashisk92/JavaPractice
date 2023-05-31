package com.orangehrm.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.qa.base.TestBase;
import com.orangrhrm.qa.pages.AdminPage;
import com.orangrhrm.qa.pages.DashboardPage;
import com.orangrhrm.qa.pages.LoginPage;



public class AdminPageTest extends TestBase {
	
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AdminPage adminPage;
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		dashboardPage = new DashboardPage();
		adminPage = new AdminPage();
		loginPage.login(prop.getProperty("un"), prop.getProperty("pwd"));
		dashboardPage.clickOnAdmin();
	}
	
	
	@Test(priority=9)
	public void validateAdminUserMgtText() {
	//	loginPage.login(prop.getProperty("un"), prop.getProperty("pwd"));
	//	dashboardPage.clickOnAdmin();
		Assert.assertTrue(adminPage.getAdminUserMgtText().getText().contains("User Management"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
	

}
