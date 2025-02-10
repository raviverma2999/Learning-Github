package xmlDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {

	ChromeDriver driver;
	
	@Parameters({"userName","password"})
	@Test (priority=1)
	public void loginOrangeHrm(String userName, String password) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// Open Application
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("username")));
		
		// Enter User name
		
		driver.findElement(By.name("username")).sendKeys(userName);
		
		// Enter Password
		
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys(password);
		
		// Click on Login button
		
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
}
