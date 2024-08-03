package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/");

		WebElement ele = driver.findElement(By.id("user"));
		ele.sendKeys("AshisK");
		// driver.findElement(By.id("user")).clear();
		getClear(ele);

	}

	public static void getClear(WebElement ele) {

		String txt = ele.getAttribute("value");
		for (int i = 0; i < txt.length(); i++) {
			ele.sendKeys(Keys.BACK_SPACE);
		}

	}

}
