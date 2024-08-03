package ExcelRWeekdaySeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//To know total number of frame
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		/*
		 * Switch to frame By using 3 Method-index no, Name, WebElement
		 * 
		 * driver.switchTo().frame(0); <--By index no
		 * driver.switchTo().frame("iframe-name"); <-- By frame name
		 * driver.switchTo().frame(driver.findElement(By.id("courses-iframe")) <-- By WebElement
		 * 
		 */
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Job Support']")).click();
		
		driver.close();
		
		
	}

}
