package Com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		// open chrome browser	
		
		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
					
		ChromeDriver driver=new ChromeDriver();	
				
		//Open Facebook Url
					
		driver.get("https://www.facebook.com");	
		
		//Enter Email id value
		
		//driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div/div/div/form/div/div/input")).sendKeys("test@test.com");
		
		driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).sendKeys("test@test.com");
		
		
		
		
		

	}

}
