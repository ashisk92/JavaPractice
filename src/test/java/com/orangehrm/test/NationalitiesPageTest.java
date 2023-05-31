package com.orangehrm.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.qa.base.TestBase;
import com.orangrhrm.qa.pages.AdminPage;
import com.orangrhrm.qa.pages.DashboardPage;
import com.orangrhrm.qa.pages.LoginPage;
import com.orangrhrm.qa.pages.NationalitiesPage;



public class NationalitiesPageTest extends TestBase {
	
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AdminPage adminPage;
	NationalitiesPage nationalitiesPage;
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage = new LoginPage();
		dashboardPage = new DashboardPage();
		adminPage = new AdminPage();
		nationalitiesPage = new NationalitiesPage();
	}
	
	@Test
	public void verifyNationalitiesPage() {
		loginPage.login(prop.getProperty("un"), prop.getProperty("pwd"));
		dashboardPage.clickOnAdmin();
		adminPage.clickOnNationlaities();
		Assert.assertTrue(nationalitiesPage.getNationalitiesTitle().getText().contains("Nationalities"));
		
		nationalitiesPage.verifyNationalities();
	}
	
	
	/*
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	*/
	

}
