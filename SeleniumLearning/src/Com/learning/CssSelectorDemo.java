package Com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static void main(String[] args) {
		
		
	// open chrome browser	
		
	System.setProperty("webdriver.chrome.driver","F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
							
	ChromeDriver driver=new ChromeDriver();	
						
	//Launch Orange HRM login page
		
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
	// Enter user name
	
	driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
	
	// Enter Password
	
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
	
	// Click on Login button
		
	driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		

	}

}
