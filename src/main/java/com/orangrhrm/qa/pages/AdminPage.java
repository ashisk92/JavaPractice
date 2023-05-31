package com.orangrhrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.base.TestBase;

public class AdminPage extends TestBase {

	@FindBy(xpath = "//button[normalize-space()='Add']")
	WebElement addButton;

	@FindBy(xpath = "//span[normalize-space()='Job']")
	WebElement job;

	@FindBy(xpath = "//a[normalize-space()='Job Titles']")
	WebElement jobTitle;

	By adminUserMgt = By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-level']");

	@FindBy(xpath = "//a[normalize-space()='Nationalities']")
	WebElement nationalities;

	public AdminPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdminUserMgtText() {
		return driver.findElement(adminUserMgt);
	}

	public AddUserPage clickOnAdd() {
		addButton.click();
		return new AddUserPage();
	}

	public NationalitiesPage clickOnNationlaities() {
		nationalities.click();
		return new NationalitiesPage();
	}

	public void clickOnJobTitle() {
		job.click();
		
	}

}
