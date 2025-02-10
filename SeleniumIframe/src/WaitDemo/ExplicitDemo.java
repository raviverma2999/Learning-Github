package WaitDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitDemo {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		    
			ChromeDriver driver=new ChromeDriver();	 
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			driver.findElement(By.linkText("Create new account")).click();
				
			// Explicit wait
			
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			
			// Expected condition
			
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("firstname")));
			
			// Enter first name
			
			driver.findElement(By.name("firstname")).sendKeys("Ravi");
			
			// Enter Last name
			
			driver.findElement(By.name("lastname")).sendKeys("Verma");	

	}

}
