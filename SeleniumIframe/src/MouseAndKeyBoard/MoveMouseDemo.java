package MouseAndKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveMouseDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		// Move mouse over account and link list

		WebElement accountAndLink = driver.findElement(By.id("nav-link-accountList"));

		Actions action = new Actions(driver);

		action.click(accountAndLink).build().perform();
		
		Thread.sleep(5000);

		// Click on Order link

		WebElement myOrder = driver.findElement(By.xpath("//span[text()='Your Orders']/parent::a"));

		action.click(myOrder).build().perform();

		// Enter email id

		WebElement enterId = driver.findElement(By.id("ap_email"));
		
		action.sendKeys(enterId, "test@test.com").build().perform();

	}

}
