package ExcelRWeekdaySeleniumTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropDown = new Select(staticDropdown);
		
		//We can now select by Index
		dropDown.selectByIndex(1);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		
		/*
		 * We can select By Visible Text
		 * 
		 * dropDown.selectByValue("Option1");
		 * System.out.println(dropDown.getFirstSelectedOption().getText());
		*/
		
		/*
		 * We can select By Value
		 * 
		 * dropDown.selectByValue("option1");
		 * System.out.println(dropDown.getFirstSelectedOption().getText());
		 * 
		 */
		
		driver.close();

	}

}
