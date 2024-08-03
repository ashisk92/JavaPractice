package ExcelRWeekdaySeleniumTraining;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestive {
	
	public static String value = "ind";

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys(value);
		
		List<WebElement> items = driver.findElements(By.xpath("//div[@id='Alh6id']/div/div/ul/li"));
		
		for(WebElement item : items) {
			if(item.getText().equalsIgnoreCase("ind vs aus")) {
				item.click();
				break;
			}
		}
		

	}

}
