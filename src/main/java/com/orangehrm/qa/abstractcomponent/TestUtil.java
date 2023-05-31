package com.orangehrm.qa.abstractcomponent;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	WebDriver driver;
	WebDriverWait wait;

	public TestUtil(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void waitForElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
	
	 public void waitForElementToBeClickable(WebElement element) {
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	    }
	
	public void selectValueFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	 public void performHoverAction(WebElement element) {
	        Actions actions = new Actions(driver);
	        actions.moveToElement(element).build().perform();
	    }

}
