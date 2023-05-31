package com.orangehrm.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.qa.base.TestBase;
import com.orangrhrm.qa.pages.AdminPage;
import com.orangrhrm.qa.pages.DashboardPage;
import com.orangrhrm.qa.pages.LoginPage;

public class DashboardPageTest extends TestBase {
	
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AdminPage adminPage;
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		dashboardPage = new DashboardPage();
	}
	
	@Test(priority=8)
	public void getAdmin() {
		loginPage.login(prop.getProperty("un"), prop.getProperty("pwd"));
		Assert.assertTrue(dashboardPage.getDashboardTitle().getText().contains("Dashboard"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
