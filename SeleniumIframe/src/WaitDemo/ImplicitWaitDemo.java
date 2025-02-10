package WaitDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
    
	ChromeDriver driver=new ChromeDriver();	 
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.linkText("Create new account")).click();
		
	// Implicit wait
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	// Enter first name
	
	driver.findElement(By.name("firstname")).sendKeys("Ravi");
	
	// Enter Last name
	
	driver.findElement(By.name("lastname")).sendKeys("Verma");

	}

}
