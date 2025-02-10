package screenshotsDemo;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleScreenshotsDemo {

	public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
    
    ChromeDriver driver=new ChromeDriver();
    
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    
    // take screenshot login page
    
    captureScreenshot(driver,"login page");
    
	// Explicit wait
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	
	// Expected condition
	
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("username")));
    
    // enter username
    
    driver.findElement(By.name("username")).sendKeys("Admin");
    
    // take screeenshot enter username
    
    captureScreenshot(driver,"username");
    
    // enter password
    
    driver.findElement(By.name("password")).sendKeys("admin123");
    
    // take screenshot enter password
    
    captureScreenshot(driver,"password");
    
    // click on login button
    
    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
    
    // take screenshot homepage
		
    captureScreenshot(driver,"login button");
	}

public static void captureScreenshot(ChromeDriver driver , String fileName) {
	ChromeDriver screenshot = driver;
	
	File image = 	screenshot.getScreenshotAs(OutputType.FILE);
	
	// copy 
	
	File myFile = new File("E:\\Eclipse workspace 12-2024\\SeleniumIframe\\Screenshots"+fileName+".png");
	
	try {
		FileUtils.copyFile(image, myFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}}
