package Com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingbrowserDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Open google chrome browser
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		// open application
		driver.get("http://the-internet.herokuapp.com/");
		
		// scroll down page 
		
		JavascriptExecutor js = driver ; 
		js.executeScript("window.scrollTo(0 , document.body.scrollHeight)");
		
		
		// Click on Elemental Selenium link 
		
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
		Thread.sleep(5000);
		
		// close()
		driver.close();
		
		Thread.sleep(5000);
		
		// quite()
		
		driver.quit();
		

	}

}
