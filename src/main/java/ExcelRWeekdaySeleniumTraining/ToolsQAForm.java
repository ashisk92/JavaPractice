package ExcelRWeekdaySeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsQAForm {

WebDriver driver;
	
	@BeforeMethod (alwaysRun = true)
	public void LaunchBrowser()
	{
	  WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.get("https://demoqa.com"); //to get the url  
	    }
		
	   @Test(groups = {"smoke"})
	    public void test1()
	   {
			System.out.println("this is test1 method");
	  }
	@Test(groups = {"Regression"})
	 public void StudentRegistrationFormTest()
	{
			
	        driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[2]")).click();
	        driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]")).click();
	        driver.findElement(By.id("firstName")).sendKeys("Ashis");
	        driver.findElement(By.id("lastName")).sendKeys("Khatua");
	        driver.findElement(By.id("userEmail")).sendKeys("ashis.khatua@gmail.com");
	        driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
            driver.findElement(By.xpath("//div[contains(text(),'Gender')]")).click();
	        driver.findElement(By.id("userNumber")).sendKeys("1234567890");
	      //  driver.findElement(By.id("dateOfBirthInput")).sendKeys("24-08-2000");
	        driver.findElement(By.id("dateOfBirthInput")).click();
			Select dobYear = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
			dobYear.selectByValue("2000");
			Select dobMonth = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
			dobMonth.selectByVisibleText("September");
			driver.findElement(By.xpath("//div[@aria-label='Choose Tuesday, September 12th, 2000']")).click();
			driver.findElement(By.id("currentAddress")).sendKeys("Mumbai");
			
			
			driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).click();
	driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
			
			driver.findElement(By.id("submit")).click();
		}
		

	      
		
	@AfterMethod (alwaysRun = true)
	public void closeTheApplication()
	{
		driver.quit();
	}


}
