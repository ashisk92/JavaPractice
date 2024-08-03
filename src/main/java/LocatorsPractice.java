import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsPractice {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Handle RadioButton
		handleRadioButton("Radio2");
		
		//Handle Alert
		driver.findElement(By.id("name")).sendKeys("Ashis");
		driver.findElement(By.id("alertbtn")).click();
		boolean isAlertPresent = isAlertPresent(driver);
		if (isAlertPresent) {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}

	}

	public static boolean isAlertPresent(WebDriver driver) {

		try {
			driver.switchTo().alert();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static void handleRadioButton(String value) {

		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@class='radioButton']"));

		for (int i = 0; i < radioButtons.size(); i++) {
			if(radioButtons.get(i).getAttribute("value").equalsIgnoreCase(value)) {
				radioButtons.get(i).click();
			}
		}

	}

}
