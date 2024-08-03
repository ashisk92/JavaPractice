package ExcelRWeekdaySeleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String currentUrl = driver.getTitle();
		System.out.println(currentUrl);
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.flipkart.com/");
		String newUrl = driver.getTitle();
		System.out.println(newUrl);
		//To REFRESH
		driver.navigate().refresh();
		Thread.sleep(3000);	
		
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.close();
		

	}

}
