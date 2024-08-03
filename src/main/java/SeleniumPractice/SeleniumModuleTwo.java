package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumModuleTwo {

	static WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test
	public void companyNames() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://demo.guru99.com/test/web-table-element.php");

		List<WebElement> compname = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td/a"));

		for (WebElement e : compname) {
			System.out.println(e.getText());
		}
	}

	@SuppressWarnings("deprecation")
	@Test
	public void signIn() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://demo.guru99.com/test/login.html");

		WebElement emailaddress = driver.findElement(By.id("email"));
		emailaddress.sendKeys("ashisk@123gmail.com");

		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("Ashis@123");

		WebElement signInBtn = driver.findElement(By.id("SubmitLogin"));
		signInBtn.click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
