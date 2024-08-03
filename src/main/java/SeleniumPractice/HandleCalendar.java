package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCalendar {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

		driver.findElement(By.id("first_date_picker")).click();
		// To select current date
		// driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-hover")).click();

		// Select Month
		while (!driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[1]")).getText().contains("January")) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		

		// To select any date
		List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
		for (int i = 0; i < dates.size(); i++) {
			String text = dates.get(i).getText();
			if (text.equalsIgnoreCase("31")) {
				dates.get(i).click();
			}
		}

	}

}
