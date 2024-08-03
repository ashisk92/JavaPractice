package ExcelRWeekdaySeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingApplication {

	
	/* 1. Open Browser
	 * 2. Launch the application
	 * 3. Enter Username Value
	 * 4. Enter Password Value
	 * 5. Click on Login Button
	 * 6. Close the Browser
	 */
	
	public static void main(String[] args) {

		//Configuring the Browser
		WebDriverManager.chromedriver().setup();
		
		// Step1 : Open Browser
		WebDriver driver = new ChromeDriver();
		
		// Step2 : Launch the Application
		driver.get("https://www.facebook.com/");
		
		//Step3 : Enter Username Value
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("TestUserName");
		
		//Step4 : Enter Password Value
		driver.findElement(By.name("pass")).sendKeys("TestPassword");
		
		//Step5 : Click on the Login Button
		driver.findElement(By.name("login")).click();
		
		//Step6 : Close the Browsr
		driver.close();
		
		
		

	}

}
