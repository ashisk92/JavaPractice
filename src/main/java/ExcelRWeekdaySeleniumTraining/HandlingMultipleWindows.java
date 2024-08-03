package ExcelRWeekdaySeleniumTraining;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleWindows {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// It returns no. of windows opened by WebDriver and will return Set of Strings
		driver.findElement(By.id("openwindow")).click();
		
		Set<String> windows =driver.getWindowHandles();
		
		/*
		String childWindowId = null;
		for(String abc : set) {
			if(abc.equals(mainWindowId)) {
			} 
			else {
				childWindowId = abc;
			}
		}
		*/
		Iterator<String> it = windows.iterator();
		String mainWindowId = it.next();
		String childWindowId = it.next();
		
		System.out.println("Parent Window Id " + mainWindowId);
		System.out.println("Child WindowID --> "+childWindowId);
		
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}

