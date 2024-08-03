package ExcelRWeekdaySeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTable {

	
	@SuppressWarnings("deprecation")
	@Test
	public void HandlingWebTable() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		String innertext = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(innertext);
	}
	

	@SuppressWarnings("deprecation")
	@Test
	public void HandlingNestedTable() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/accessing-nested-table.html");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText();
		System.out.println(innerText);
	}

}
