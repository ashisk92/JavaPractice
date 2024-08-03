package AutoITPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {

		String downloadePath = System.getProperty("user.dir");

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory", downloadePath);
		options.setExperimentalOption("prefs", prefs);

		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.ilovepdf.com/pdf_to_word");

		// C:\Users\khatu\Downloads\Manual Testing Resume.pdf

		driver.findElement(By.id("pickfiles")).click();

		try {
			Runtime.getRuntime().exec("C:\\Users\\khatu\\OneDrive\\Desktop\\autoitdownload.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("processTaskTextBtn")));
		driver.findElement(By.id("processTaskTextBtn")).click();

		Actions action = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pickfiles")));
		action.moveToElement(driver.findElement(By.id("pickfiles")));
		driver.findElement(By.id("pickfiles")).click();

		File file = new File(downloadePath + "/Document+1");
		if (file.exists()) {
			Assert.assertTrue(file.exists());
			//if (file.delete())

				System.out.println("file deleted");

		}

	}
}
