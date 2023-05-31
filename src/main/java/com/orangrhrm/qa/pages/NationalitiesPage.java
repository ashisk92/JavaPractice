package com.orangrhrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.base.TestBase;

public class NationalitiesPage extends TestBase {

	// Page Factory -- Object Repository
	By nationalitiesTitle = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']");

	// Initializing the Page Objects
	public NationalitiesPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getNationalitiesTitle() {
		return driver.findElement(nationalitiesTitle);
	}

	public void verifyNationalities() {
		String before_xpath = "//*[@id='app']/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[";
		String after_xpath = "]/div/div[2]";

		for (int i = 1; i <= 50; i++) {
			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			if(name.contains("Bangladeshi")) {
				driver.findElement(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).click();
			}
		}
	}
	
	public void verify() {
		
		
		
		
	}
	
	
	
	
	
	
	

}
