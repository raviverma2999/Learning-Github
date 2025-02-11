package Com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/r.php?entry_point=login");
	
	//Identify the Link
	
	WebElement link= driver.findElement(By.linkText("Already have an account?"));
	
	// Display status of link
	
	boolean displayStatus=link.isDisplayed();
	
	System.out.println("Display Status of link is :" + displayStatus);
	
	// Enable status of link
	
	boolean enableStatus=link.isEnabled();
	
	System.out.println("Enabled Status of link is :" + displayStatus);
	
	// get the link name
	
	String linkName=link.getText();
	
	// Click on link
	
	link.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
