package browserOperations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadlessRun {

	public static void main(String[] args) {
		
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--headless");
		
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		
		// Capture title of webpage

		String title=driver.getTitle();
		
        // Capture URL of current URL of webpage
		
		String url=driver.getCurrentUrl();
		
		System.out.println(title);
		
		System.out.println(url);
		
		
	}

}
