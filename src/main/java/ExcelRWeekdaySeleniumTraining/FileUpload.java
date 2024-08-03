package ExcelRWeekdaySeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.foundit.in/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();

		Thread.sleep(3000);

		// Inspect Element,If type = file present, then we can use sendKeys() method
		driver.findElement(By.id("file-upload")).sendKeys("‪‪C:\\Users\\khatu\\OneDrive\\Desktop\\CV.docx");

	}
}
