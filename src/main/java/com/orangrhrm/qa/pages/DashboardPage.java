package com.orangrhrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.base.TestBase;

public class DashboardPage extends TestBase {

	@FindBy(xpath = "//li[1]//a[1]//span[1]")
	WebElement adminele;
	
	By dashboard = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']");
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDashboardTitle() {
		return driver.findElement(dashboard);
	}
	
	
	public AdminPage clickOnAdmin() {
		adminele.click();
		return new AdminPage();
	}
	
	
	
}
