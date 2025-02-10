package Iframe;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabsDemo {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.icicibank.com/");
		
		driver.manage().window().maximize();
		
		// Click on Credit card button
		
		// Get the window id of the first tab
		
		// 

	}

}
