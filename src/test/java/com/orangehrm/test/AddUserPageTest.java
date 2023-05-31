package com.orangehrm.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.qa.abstractcomponent.TestUtil;
import com.orangehrm.qa.base.TestBase;
import com.orangrhrm.qa.pages.AddUserPage;
import com.orangrhrm.qa.pages.AdminPage;
import com.orangrhrm.qa.pages.DashboardPage;
import com.orangrhrm.qa.pages.LoginPage;

public class AddUserPageTest extends TestBase {

	LoginPage loginPage;
	DashboardPage dashboardPage;
	AdminPage adminPage;
	AddUserPage addUserPage;
	TestUtil testUtil;

	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		dashboardPage = new DashboardPage();
		adminPage = new AdminPage();
		addUserPage = new AddUserPage();
	}

	@Test
	public void call() {
		loginPage.login(prop.getProperty("un"), prop.getProperty("pwd"));
		dashboardPage.clickOnAdmin();
		adminPage.clickOnAdd();
		addUserPage.selectUserRole("Admin");
		addUserPage.enterUsername("Test Manual");
	}

	
	  @AfterMethod 
	  public void tearDown() { 
		  driver.quit(); 
	}
	 

}
