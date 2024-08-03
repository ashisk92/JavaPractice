package ExcelRWeekdaySeleniumTraining;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownRelated {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement staticDropdown = driver.findElement(By.id("dropdown"));
		Select dropDown = new Select(staticDropdown);
		
		List<WebElement> options = dropDown.getOptions();
		int len = options.size();
		
		for(int i=0; i<len; i++) {
			System.out.println(options.get(i).getText());
		}
		
		driver.close();
		
	}
	
	

}
