package Com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdandNameLocatorDemo {

	public static void main(String[] args) {
		
	// open chrome browser	
	
	System.setProperty("webdriver.chrome.driver","F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		
	ChromeDriver driver=new ChromeDriver();	
	
	//Open Facebook Url
		
    driver.get("https://www.facebook.com");
    
    //Enter email id by id locator
    
    driver.findElement(By.id("email")).sendKeys("test@test.com");
    
    // Enter Password
    
    driver.findElement(By.name("pass")).sendKeys("12345");
	
	
	
	
	}

}
