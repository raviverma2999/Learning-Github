package Com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValidationDemo {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
	
	ChromeDriver  driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().window().maximize();
	
	driver.get("https://the-internet.herokuapp.com/forgot_password");
	
	// Identify Element
	
	WebElement button= driver.findElement(By.id("form_submit"));
	
	
	// Css Validation
	
	String borderStyle=button.getCssValue("border-style");
	
    System.out.println("Border Style value is" + borderStyle);
    
    String fontSize=button.getCssValue("font-size");
    
    System.out.println("Border Font Size is" + fontSize);
	
	
	
	
	

	}

}
