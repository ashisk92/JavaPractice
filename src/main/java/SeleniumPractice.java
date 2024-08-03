
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice {

	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://omayo.blogspot.com/p/page7.html");

		// How to find all broken links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		// allLinks.addAll(driver.findElements(By.tagName("img")));
		System.out.println(allLinks.size());

		int resCode = 200;
		int brokenLinkCnt = 0;

		for (WebElement ele : allLinks) {

			String url = ele.getAttribute("href");

			try {
				URL urlLink = new URL(url);
				HttpURLConnection huc = (HttpURLConnection) urlLink.openConnection();
				huc.connect();

				resCode = huc.getResponseCode();

				if (resCode >= 400) {
					System.out.println(url + "broken link");
					brokenLinkCnt++;
				}
			}

			catch (MalformedURLException e) {
			} catch (Exception e) {
			}

		}
		System.out.println("Total broken links: " + brokenLinkCnt);

		/*
		 * List<WebElement> activeLink = new ArrayList<WebElement>();
		 * 
		 * for (int i = 0; i < allLinks.size(); i++) { if
		 * (allLinks.get(i).getAttribute("href") != null) {
		 * activeLink.add(allLinks.get(i)); } } System.out.println(allLinks.size());
		 * 
		 * for (int i = 0; i < activeLink.size(); i++) {
		 * 
		 * HttpURLConnection connection;
		 * 
		 * connection = (HttpURLConnection) new
		 * URL(activeLink.get(i).getAttribute("href")).openConnection();
		 * connection.connect(); connection.getResponseMessage();
		 * connection.disconnect();
		 * 
		 */

	}

}
