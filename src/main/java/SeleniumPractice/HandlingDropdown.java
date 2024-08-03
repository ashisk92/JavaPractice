package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropdown {
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select dropDown = new Select(staticDropdown);
		dropDown.selectByValue("option2");
		
		//To print all Options from dropdown
		List<WebElement> options = dropDown.getOptions();
		System.out.println(options.size());
		for(int i=0; i<options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		
		driver.close();

	}

}
