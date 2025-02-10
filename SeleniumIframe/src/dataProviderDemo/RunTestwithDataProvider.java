package dataProviderDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RunTestwithDataProvider {
	
	
	
	@Test(priority=1, dataProvider="getTestData")
	public void loginOrangeHRM(String username, String password) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("username")));
		
		driver.findElement(By.name("username")).sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
		
	}
	
	@DataProvider
	public Object[][] getTestData(){
		
		Object[][] getData=new Object[2][2];
		
		getData[0][0]="Admin";
		getData[0][1]="admin123";
		getData[1][0]="superAdmin";
		getData[1][1]="admin123";
		
		return getData;
	
	
	
	}
	
	
	}
