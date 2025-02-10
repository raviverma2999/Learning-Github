package testNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MultipleAssertionDemo {

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
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[text()='Leave']")));	
		
		//click on leave button
		
		driver.findElement(By.xpath("//span[text()='Leave']")).click();
		
		SoftAssert softAssert=new SoftAssert();
		
		//Reset button needs to be visible
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='oxd-switch-wrapper']/child::label/child::span")));
		
		boolean resetBtn=driver.findElement(By.xpath("//div[@class='oxd-switch-wrapper']/child::label/child::span")).isEnabled();
		
		softAssert.assertTrue(resetBtn);
		
		// Search button needs to be visible
		
		boolean searchBtn=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		
		softAssert.assertTrue(searchBtn);
		
		// Date CheckBox is seleceted or not
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='oxd-checkbox-wrapper']/child::label/child::span/child::i")));
		
		boolean dateCheckBox=driver.findElement(By.xpath("//div[@class='oxd-checkbox-wrapper']/child::label/child::span/child::i")).isSelected();

		softAssert.assertTrue(dateCheckBox);
		
		
		
		
		
	}

}
