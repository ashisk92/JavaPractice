package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropAndScreenshot {

	static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/");
		clickOnDraggable().click();
		
		driver.switchTo().frame(0);
		
		Actions act = new Actions(driver);
		WebElement src = driver.findElement(By.id("draggable"));
		
		act.dragAndDropBy(src, 40, 100).build().perform();
		takeScreenshot("Draggable");
		
		driver.quit();
	}

	public static WebElement clickOnDraggable() {
		return driver.findElement(By.linkText("Draggable"));
	}
	
	public static void takeScreenshot(String fileName) throws IOException {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\khatu\\eclipse-workspace\\ExcelRWeekdaySeleniumTraining\\src\\main\\java\\SeleniumPractice\\"
		+fileName+".png"));
	}
	

}
