package ChromeDevToolsProtocol;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v116.emulation.Emulation;

public class ChromeDevTools {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "");
		ChromeDriver driver = new ChromeDriver();

		// Get Object of devtools
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		devTools.send(Emulation.setDeviceMetricsOverride(600, 812, 75, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));

		Map<String, Object> deviceMetrices = new HashMap<String, Object>();
		deviceMetrices.put("width", 600);
		deviceMetrices.put("height", 1000);
		deviceMetrices.put("deviceScaleFactor", 50);
		deviceMetrices.put("mobile", true);
		
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrices);
		
		
		
		
	}

}
