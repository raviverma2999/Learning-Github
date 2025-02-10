package browserOperations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeEnableDisableNotifications {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		
		/*options.addArguments("--disable-javascript");
		
		options.addArguments("--disable-notifications");*/
		
        options.addArguments("--enable-javascript");
		
		options.addArguments("--enable-notifications");
		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.justdial.com/");

	}

}
