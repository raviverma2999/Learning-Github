package Com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SellerMobileRegistrationAutomation {

    public static void main(String[] args) {
        // Set the path to your ChromeDriver
        System.setProperty("webdriver.chrome.driver", "F:\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the registration page
            driver.get("https://app.sellermobile.com/register");

            // Wait for the page to load completely
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("registration-form")));

            // Fill out the registration form
            fillRegistrationForm(driver, wait);

            // Wait for successful registration or error message to appear
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("success-message"))); // Replace with actual success/error message element

            // Log success message
            System.out.println("Registration Completed Successfully!");

        } catch (Exception e) {
            // Handle exceptions
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }

    private static void fillRegistrationForm(WebDriver driver, WebDriverWait wait) {
        // Fill in the email field
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("testuser@example.com");

        // Fill in the username field
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("testuser");

        // Fill in the password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("SecurePassword123!");

        // Fill in the confirm password field
        WebElement confirmPasswordField = driver.findElement(By.id("confirm-password"));
        confirmPasswordField.sendKeys("SecurePassword123!");

        // Select a country from the dropdown (if applicable)
        Select countryDropdown = new Select(driver.findElement(By.id("country")));
        countryDropdown.selectByVisibleText("United States");

        // Click the 'Register' button to submit the form
        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();
    }
}
