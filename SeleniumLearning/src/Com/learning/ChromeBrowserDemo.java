package Com.learning;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");	
		
	ChromeDriver driver=new ChromeDriver();	
	
	driver.get("https://www.google.com");

	}

}
