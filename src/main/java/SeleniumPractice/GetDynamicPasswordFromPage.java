package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDynamicPasswordFromPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		WebElement username = driver.findElement(By.id("inputUsername"));
		username.sendKeys("AshisK");
		
		WebElement passwords = driver.findElement(By.xpath("//input[@type='password']"));
		passwords.sendKeys(password);
		
		WebElement signIn = driver.findElement(By.cssSelector("button.submit"));
		signIn.click();
		
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		WebElement forgotPassword = driver.findElement(By.linkText("Forgot your password?"));
		forgotPassword.click();
		
		Thread.sleep(3000);
		
		WebElement resetLogin = driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/div/button[2]"));
		resetLogin.click();
		
		String passwordText = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		// Please use temporary password 'rahulshettyacademy' to Login
		
		String[] passwordArray = passwordText.split("'");
		//0th Index = Please use temporary password 
		//1st Index = rahulshettyacademy' to Login
		
		String password = passwordArray[1].split("'")[0];
		return password;	
		
	}

}
