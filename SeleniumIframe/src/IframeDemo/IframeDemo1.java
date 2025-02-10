package IframeDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo1 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();

	}

}
