package listenersDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmTestcases {

	ChromeDriver driver;
	
	
	
    @Test (priority=1)
	public void orangeHrmLogin() {

		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// open Orange HRM page

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// enter username

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		// enter password

		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("admin123");

		// click on login button

		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();

	}
    @Test (priority=2)
	public void checkAdminButtonDisplayed() {
    	
    	
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    	
		boolean adminBtn = driver.findElement(By.linkText("Admin")).isDisplayed();
		driver.findElement(By.linkText("Admin")).click();
		Assert.assertTrue(adminBtn);

	}
	@Test (priority=3)
	public void logOutOrangeHrm() {
		

		
	driver.findElement(By.className("oxd-userdropdown-name")).click();
	
	driver.findElement(By.linkText("Logout")).click();
		
	}
	
	
	
	
	
	
	

}
