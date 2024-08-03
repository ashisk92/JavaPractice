package ReadData;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataUsingDataProvider {

	@Test(dataProvider = "getDataFromExcel")
	public void loginFB(String uname, String pwd) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		getDataFromExcel();
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);

		driver.quit();

	}

	@DataProvider
	public Object[][] getDataFromExcel() throws IOException  {
		
		String filepath = "./src/main/java/ReadData/TestData.xlsx";
		String sheetName = "FBLoginUser";
		
		ReadFromExcel rf = new ReadFromExcel(filepath, sheetName);
		 return rf.getData();
	}

}
