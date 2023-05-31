package com.orangrhrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.qa.abstractcomponent.TestUtil;
import com.orangehrm.qa.base.TestBase;

public class AddUserPage extends TestBase {

	TestUtil testUtil;
	WebDriverWait wait;

	@FindBy(css = "div.oxd-select-text-input")
	private WebElement userRoleDropdown;

	@FindBy(xpath = "//label[text()='Status']/following-sibling::div//div[@class='oxd-select-text-input']")
	private WebElement statusDropdown;

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement usernameInput;

	By listOfEmp = By.xpath("//div[@class='oxd-autocomplete-option']");

	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
	WebElement username;

	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
	WebElement password;

	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
	WebElement resetPassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;

	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	WebElement cancel;

	public AddUserPage() {

		// this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
		this.testUtil = new TestUtil(driver);
	}

	public void selectUserRole(String role) {
		testUtil.waitForElementToBeClickable(userRoleDropdown);
		userRoleDropdown.click();
		WebElement roleOption = driver
				.findElement(By.xpath("//div[@class='oxd-select-text-input' and @text()='" + role + "']"));
		testUtil.waitForElementToBeClickable(roleOption);
		roleOption.click();
	}

	public void selectStatus(String status) {
		testUtil.waitForElementToBeClickable(statusDropdown);
		statusDropdown.click();
		WebElement statusOption = driver
				.findElement(By.xpath("//div[@class='oxd-select-text-option' and text()='" + status + "']"));
		testUtil.waitForElementToBeClickable(statusOption);
		statusOption.click();
	}

	public void enterUsername(String username) {
		usernameInput.sendKeys(username);
	}

}

/*
 * public void clickOnSave() {
 * 
 * //testUtil.selectValueFromDropDown(userRole, "Admin");
 * selectEmployeeName("nick Sunil Badwaik");
 * 
 * }
 * 
 * public void selectEmployeeName(String username) {
 * employeeName.sendKeys("ni");
 * wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(listOfEmp));
 * List<WebElement> list = driver.findElements(listOfEmp); for(int i=0;
 * i<list.size(); i++) { if(list.get(i).getText().equals(username)) {
 * list.get(i).click(); break; } }
 * 
 * }
 * 
 * public void clickOnCancel() { cancel.click(); }
 */
