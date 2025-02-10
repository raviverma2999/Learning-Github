package testNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertequalDemo {

	@Test
	public void loginToOrangeHrmDemo() {

		System.setProperty("webdriver.chrome.driver",
				"F:\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Explicit wait

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Expected condition

		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name("username")));

		// enter username

		driver.findElement(By.name("username")).sendKeys("Admin");

		// enter password

		driver.findElement(By.name("password")).sendKeys("admin123");

		// click on login button

		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();

		// Assertions to be used

		String actualUrl = driver.getCurrentUrl();

		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

		// Comparison with Assert.equals method

		Assert.assertEquals(actualUrl, expectedUrl);

	}

}
