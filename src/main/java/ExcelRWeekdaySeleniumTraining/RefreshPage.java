package ExcelRWeekdaySeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//driver.navigate().refresh();
	//	driver.get(driver.getCurrentUrl());
	//	driver.navigate().to(driver.getCurrentUrl());
		driver.findElement(By.name("q")).sendKeys(Keys.F5);
	}

}
