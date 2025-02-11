package Com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicXpathDemo {

	public static void main(String[] args) {

		// open chrome browser	
		
		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
							
		ChromeDriver driver=new ChromeDriver();	
						
		//Open Facebook Url
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		//Contains method example
		
		//driver.findElement(By.xpath("//input[contains(@aria-label,'First')]")).sendKeys("Ravi");
		
		// starts-with method example
		
		//driver.findElement(By.xpath("//input[starts-with(@aria-label,'First')]")).sendKeys("Ravi");
		
		//input[contains(@aria-label,'First')]
		
		// Test method example
		
		//driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		//Child method to find child eliment of the Parent class
		
		//driver.findElement(By.xpath("//div[@class='_1lch']/child::button")).click();
		
		//Parent Method to find Parent Eliment
		
		driver.findElement(By.xpath("//input[@aria-label='Surname']/parent::div")).sendKeys("Verma");
		

	}

}
