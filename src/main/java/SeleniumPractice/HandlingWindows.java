package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindows {
	
	@SuppressWarnings("deprecation")
	@Test
	public void WindowsAssignment() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/popup.php");
		
		driver.findElement(By.linkText("Click Here")).click();
		
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> win=windows.iterator();
		
		String parentID=win.next();
		String childID=win.next();
		System.out.println("Parent Window: "+parentID);
		System.out.println("Child Window: "+childID);
		
		driver.switchTo().window(childID);
		WebElement emailID=driver.findElement(By.xpath("//input[@type='text']"));
		emailID.sendKeys("ashis123@gmail.com");
		
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
		driver.quit();
		
	}
}
