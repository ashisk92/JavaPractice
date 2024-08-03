package ExcelRWeekdaySeleniumTraining;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowScrollingByJavaScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Casting our driver to JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Go to console- window.scrollBy(0,500)
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		//Scrolling inside table
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		

	}

}
