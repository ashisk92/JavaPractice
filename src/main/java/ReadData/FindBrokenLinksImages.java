package ReadData;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinksImages {

	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		// get all the links
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		// add image link also
		linkList.addAll(driver.findElements(By.tagName("img")));
		// total no of links and images
		int toalNoOfLinkImg = linkList.size();
		System.out.println(toalNoOfLinkImg);

		List<WebElement> activeLink = new ArrayList<WebElement>();
		// pick only working image and url
		for (int i = 0; i < linkList.size(); i++) {
			if (linkList.get(i).getAttribute("href") != null) {
				activeLink.add(linkList.get(i));
			}
		}
		System.out.println(activeLink.size());
		
		//check href using HttpURLConnection
		for(int j=0; j<activeLink.size(); j++) {
			HttpURLConnection connection = (HttpURLConnection)new URL(activeLink.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String responseMSg = connection.getResponseMessage();
			System.out.println(responseMSg);
			connection.disconnect();
		}
		

	}

}
