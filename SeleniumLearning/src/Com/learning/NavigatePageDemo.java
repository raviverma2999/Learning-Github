package Com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatePageDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		// Click on any link
		
		driver.findElement(By.linkText("Broken Images")).click();
		
		Thread.sleep(5000);
		
		// Click on back button
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		// Click on forward button of the Browser
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		// Refresh the URL
		
		driver.navigate().refresh();
		
		
		

	}

}
