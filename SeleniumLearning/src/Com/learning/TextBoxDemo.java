package Com.learning;

import javax.print.attribute.SetOfIntegerSyntax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "F:\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver.exe");
		
	ChromeDriver driver=new ChromeDriver();
	
	//Open Application
	
	driver.get("https://www.facebook.com/");
	
	
	// Identify TextBox
	
	WebElement emailTextBox= driver.findElement(By.name("email"));	
	
	// Check Textbox Displayed status
	
	boolean isDisplyaedStatus=emailTextBox.isDisplayed();
	
	System.out.println("Test Box Displayed or not status is :" + isDisplyaedStatus);	
	
	// Check Text Box enabled status
		
	boolean isEnabledStatus=emailTextBox.isEnabled();
	
	System.out.println("Test Box enabled or not status is :" + isEnabledStatus);
		
	// Enter value in TextBox
	
	emailTextBox.sendKeys("Test@Text.com");
	
	Thread.sleep(5000);
	
	@SuppressWarnings("deprecation")
	String enteredValue = emailTextBox.getAttribute("value");
	
	System.out.println(" Entered value of Text Box is :" + enteredValue);
	
	//Delete the entered value
		
     
	emailTextBox.clear();
	}

}
