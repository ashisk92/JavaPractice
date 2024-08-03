package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		WebElement userName = driver.findElement(By.id("inputUsername"));

		Actions act = new Actions(driver);
		
		//For sending capital letter
		act.keyDown(userName, Keys.SHIFT).sendKeys("hello").build().perform();
		
		Thread.sleep(2000);
		
		//Clear data
		act.moveToElement(userName).click().sendKeys(Keys.BACK_SPACE).build().perform();
		
		String inputText = userName.getAttribute("value");
        if( inputText != null ) {
            for(int i=0; i<inputText.length();i++) {
            	userName.sendKeys(Keys.BACK_SPACE);
            }
        }
		
	}

}
