package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumModuleTwoAssTwo {


	@SuppressWarnings("deprecation")
	@Test
	public void deleteCustomer() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://demo.guru99.com/test/delete_customer.php");

		WebElement customerId = driver.findElement(By.xpath("//input[@type='text']"));
		// Enter Customer Id
		customerId.sendKeys("ashis123");

		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		// Click on Submit
		submit.click();

		//One prompt open, click on ok
		driver.switchTo().alert().accept();
		//Again open one prompt click on ok
		driver.switchTo().alert().accept();
		
		driver.quit();

	}
}
