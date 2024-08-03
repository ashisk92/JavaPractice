package ExcelRWeekdaySeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsXYCoordinates {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);

		// find the SoftwareTestingMaterial logo using linktext Locator
		WebElement element = driver.findElement(By.className("logoClass"));

		// Used points class to get x and y coordinates of element.
		Point point = element.getLocation();
		int xcord=point.getX();
		System.out.println("Position of the webelement from left side is "+xcord+"pixels");
		int ycord=point.getY();
		System.out.println("Position of the webelement from top side is "+ycord+"pixels");
		
		//Using Actions class
		Actions act = new Actions(driver);
		act.moveToElement(element, xcord, ycord).click().build().perform();
		
		
		

	}

}
