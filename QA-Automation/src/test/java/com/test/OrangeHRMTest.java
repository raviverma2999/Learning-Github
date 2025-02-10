package com.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest {
	
	
	RemoteWebDriver driver;
	
	
	
    @Test (priority=1)
	public void orangeHrmLogin() throws MalformedURLException {
    	
    	ChromeOptions browserOptions = new ChromeOptions();
    	browserOptions.setPlatformName("Windows 11");
    	browserOptions.setBrowserVersion("latest");
    	Map<String, Object> sauceOptions = new HashMap ();
    	sauceOptions.put("username", "oauth-raviverma2999-4e108");
    	sauceOptions.put("accessKey", "9d7fc1a2-94f6-4048-88ac-801089e7085d");
    	sauceOptions.put("build", "Login automation Orange HRM");
    	sauceOptions.put("name", "<login, admin, logout>");
    	browserOptions.setCapability("sauce:options", sauceOptions);

    	// start the session
    	URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
    	 driver = new RemoteWebDriver(url, browserOptions);


		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

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
