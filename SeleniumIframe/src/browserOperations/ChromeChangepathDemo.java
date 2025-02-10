package browserOperations;

import java.util.Hashtable;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeChangepathDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		
		Map<String, Object> Preferences=new Hashtable<String, Object>();
		
		Preferences.put("download.default_directory", "F:\\");
		
		ChromeOptions options=new ChromeOptions();
		
		options.setExperimentalOption("prefs", Preferences)		;
		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.google.com/");

	}

}
