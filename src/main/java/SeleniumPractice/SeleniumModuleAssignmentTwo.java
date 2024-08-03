package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumModuleAssignmentTwo {

	@SuppressWarnings("deprecation")
	@Test
	public void SelectOptionAndCheckBox() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement radio = driver.findElement(By.xpath("//input[@value='Option 1']"));
		radio.click();
		Assert.assertTrue(radio.isSelected());

		WebElement checkbox2 = driver.findElement(By.xpath("//input[@value='checkbox2']"));
		checkbox2.click();
		WebElement checkbox3 = driver.findElement(By.xpath("//input[@value='checkbox3']"));
		checkbox3.click();
		
		driver.close();

	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void DropDown() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement dropdown=driver.findElement(By.name("country"));
		Select se=new Select(dropdown);
		
		se.selectByValue("KUWAIT");
		
		driver.close();
	}
	
	

}
