package JavaScriptFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptIdPasswordDemo {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	// Enter username
	
	WebElement userName= driver.findElement(By.name("username"));
	
	JavascriptExecutor js=driver;
	
	js.executeScript("arguments[0].name='Admin'", userName);
	
	// Enter password
	
	WebElement password=driver.findElement(By.name("password"));
	
	js.executeScript("arguments[0].value='admin123'",password);
	
	// Click on login button
	
	WebElement button=driver.findElement(By.xpath("//button[contains(@type,'submit']"));
	
	js.executeScript("arguments[0].click()", button);
	
	}

}
