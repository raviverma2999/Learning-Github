package Com.learning;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","F:\\FireFoxBrowserExe\\geckodriver.exe");
		
	FirefoxDriver driver=new FirefoxDriver();
	
	driver.get("https://www.facebook.com");

	}

}
