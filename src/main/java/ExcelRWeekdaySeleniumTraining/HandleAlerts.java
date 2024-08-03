package ExcelRWeekdaySeleniumTraining;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlerts {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		
		driver.findElement(By.id("promptexample")).click();
		
		//Handling alert
		Alert al = driver.switchTo().alert();
		
		String expectedMsg = "I prompt you";
		String actualMsg = al.getText();
		System.out.println(actualMsg);
		
		if(expectedMsg.equals(actualMsg)) {
			System.out.println("TC Passed!!!");
		} else {
			System.out.println("TC Failed!!!");
		}
		
		driver.switchTo().alert().sendKeys("Hello");
		
		driver.switchTo().alert().accept();
		
		
	}

}
