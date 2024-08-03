package ExcelRWeekdaySeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionMouseHover {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		Actions act = new Actions(driver);

		// Sending capital letter by using actions
		WebElement name = driver.findElement(By.id("name"));
		act.moveToElement(name).click().keyDown(Keys.SHIFT).sendKeys("hello")
		.build().perform();

		// Right click on a element
		WebElement openwindow = driver.findElement(By.id("openwindow"));
		act.moveToElement(openwindow).contextClick().build().perform();
		

		//MouseHover action
		WebElement mouseHover = driver.findElement(By.id("mousehover")); //Move To
		act.moveToElement(mouseHover).build().perform();
		driver.findElement(By.linkText("Top")).click();
		 

	}

}
