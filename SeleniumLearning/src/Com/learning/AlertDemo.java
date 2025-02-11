package Com.learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// Click on button to get Java Script alert
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Thread.sleep(5000);
		
		// Switch focus from normal window to alert
		
		Alert al=driver.switchTo().alert();
		
		// Get the text of the alert
		
		String text=al.getText();
		
		// Click OK or Click Cancel
		
		//al.accept();
		
		al.dismiss();

	}

}
