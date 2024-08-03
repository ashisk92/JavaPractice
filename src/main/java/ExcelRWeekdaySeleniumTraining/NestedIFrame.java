package ExcelRWeekdaySeleniumTraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedIFrame {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jsbin.com/osebed/2/edit?output");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement parentIFrame = driver.findElement(By.xpath("//iframe[@class='stretch']"));
		driver.switchTo().frame(parentIFrame);
		
		WebElement childIFrame = driver.findElement(By.xpath("//iframe[@name='JS Bin Output ']"));
		driver.switchTo().frame(childIFrame);
		
		WebElement selectDropdown = driver.findElement(By.id("fruits"));
		Select dropDown = new Select(selectDropdown);
		dropDown.selectByVisibleText("Orange");
		
		driver.close();

	}

}
