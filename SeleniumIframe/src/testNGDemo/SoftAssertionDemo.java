package testNGDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class SoftAssertionDemo {

    @Test
    public void loginToOrangeHrmDemo() {

        System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Expected condition for username presence
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));

        // Enter username
        driver.findElement(By.name("username")).sendKeys("Admin");

        // Enter password
        driver.findElement(By.name("password")).sendKeys("admin123");

        // Click on login button
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();

        // Wait for the 'Leave' button to be present
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Leave']")));

        // Click on the 'Leave' button
        driver.findElement(By.xpath("//span[text()='Leave']")).click();

        // Initialize SoftAssert
        SoftAssert softAssert = new SoftAssert();

        // Reset button needs to be visible
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-switch-wrapper']/child::label/child::span")));

        // Check if the reset button is displayed (use isDisplayed instead of isEnabled)
        boolean resetBtn = driver.findElement(By.xpath("//div[@class='oxd-switch-wrapper']/child::label/child::span")).isDisplayed();
        softAssert.assertFalse(resetBtn, "Reset button should not be visible");

        // Search button needs to be visible
        boolean searchBtn = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed(); // Changed isEnabled() to isDisplayed()
        softAssert.assertTrue(searchBtn, "Search button should be visible");

        // Date CheckBox is selected or not
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-checkbox-wrapper']/child::label/child::span/child::i")));

        boolean dateCheckBox = driver.findElement(By.xpath("//div[@class='oxd-checkbox-wrapper']/child::label/child::span/child::i")).isDisplayed();
        softAssert.assertTrue(dateCheckBox, "Date checkbox should be selected");

        // Assert all soft assertions
        softAssert.assertAll();

        // Close the driver
        driver.quit();
    }
}
