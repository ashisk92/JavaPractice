package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAutoSuggestiveDropdown {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ind");
		Thread.sleep(2000);

		List<WebElement> options = driver.findElements(By.xpath("//li[@class='sbct']"));

		for (WebElement option : options) {

			if (option.getText().equalsIgnoreCase("Ind vs sa")) {
				option.click();
				break;
			}

		}

	}

}
