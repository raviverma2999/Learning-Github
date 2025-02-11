package Com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextDemo {

	public static void main(String[] args) {


		// open chrome browser	
		
		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
			
		ChromeDriver driver=new ChromeDriver();	
		
		//Open Facebook Url
			
	    driver.get("https://www.facebook.com");
	    
	    //Click on Forgot Password? link
	    
	    //driver.findElement(By.linkText("Forgotten password?")).click();
	    
	    driver.findElement(By.partialLinkText("password?")).click();
	    
	    
		
		
	

	}

}
