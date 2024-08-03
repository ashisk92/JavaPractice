package ExcelRWeekdaySeleniumTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNewTabORWindow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());

		// opening a new tab or window
		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("http://www.facebook.com");
		System.out.println("after switching : "+driver.getTitle());

		Set<String> windows = driver.getWindowHandles();
		List<String> ids = new ArrayList<String>(windows);
		String parentId = ids.get(0);
		String childId = ids.get(1);

		System.out.println(parentId);
		System.out.println(childId);

		driver.close();

		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());

	}

}
