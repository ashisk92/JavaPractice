package ExcelRWeekdaySeleniumTraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(5000);
		
		//Total number of CheckBoxes
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total number of CheckBoxes : "+ checkBoxes.size());
		
		for(WebElement abc : checkBoxes) {
			abc.click();
		}
		
		Thread.sleep(3000);
		
		WebElement option1 = driver.findElement(By.id("checkBoxOption1"));
		option1.click();
		System.out.println(option1.isSelected());
		
		
		Thread.sleep(3000);
		
		if(option1.isSelected()) {
			System.out.println("CheckBox is Checked!!!");
		} else {
			System.out.println("CheckBox is not Checked!!!");
		}
		
		
		driver.close();
		
	}

}
