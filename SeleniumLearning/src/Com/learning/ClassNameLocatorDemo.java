package Com.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocatorDemo {

	public static void main(String[] args) {
		
		
		// Open google chrome browser
		
		System.setProperty("webdriver.chrome.driver","F:\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		
		// open facebook login page
		
		driver.get("https://www.facebook.com/");		
		
		
		// capture all text boxes of the login page
		
		List <WebElement> allTextBoxes= driver.findElements(By.className("inputtext"));
		
		System.out.println("Total text boxes are: "+allTextBoxes.size());
		
		allTextBoxes.get(0).sendKeys("Test@test.com");
		
		allTextBoxes.get(1).sendKeys("12345");
		
	}

}
