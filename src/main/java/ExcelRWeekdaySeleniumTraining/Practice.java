package ExcelRWeekdaySeleniumTraining;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();

		// Assert.assertEquals(verifyPracticePage(), "Practice 0Page");
		verifyPracticePage();
		
		selectDropdown("Option2");

		driver.quit();

	}

	public static void verifyPracticePage() {
		driver.findElement(By.id("autocomplete")).sendKeys("Au");
		List<WebElement> ListOfCouyntries = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		for (WebElement country : ListOfCouyntries) {
			if (country.getText().equalsIgnoreCase("Australia")) {
				country.click();
				break;
			}
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void selectDropdown(String value) {

		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(dropDown);
		
		select.selectByVisibleText(value);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
