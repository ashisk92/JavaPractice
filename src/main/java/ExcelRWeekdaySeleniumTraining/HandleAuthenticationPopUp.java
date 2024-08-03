package ExcelRWeekdaySeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAuthenticationPopUp {

	@Test
	public void verifyTitle() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		// https://username:password@google.com
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		String congratsTitle = driver.findElement(By.xpath("//div[@class='example']/p")).getText();
		Assert.assertEquals(congratsTitle, "Congratulations! You must have the proper credentials.");

	}

}
