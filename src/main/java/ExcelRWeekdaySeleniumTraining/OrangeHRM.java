package ExcelRWeekdaySeleniumTraining;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//li[1]//a[1]//span[1]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();

		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("li");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("locSelectVal")));

		List<WebElement> list = driver.findElements(By.xpath("//div[@role='listbox']"));

		System.out.println("Auto Suggest List ::" + list.size());

		for (int i = 1; i < list.size(); i++) {
			System.out.println(list.get(i).getText());

			if (list.get(i).getText().equals("Lisa Andrews")) {
				list.get(i).click();
				break;

			}
		}

	}

	public void selectEmployeeName() {

	}

}
