package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeDemo {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	
	// Switch to HTML page to Parent frame
	
	driver.switchTo().frame("frame-top");
	
	// Switch to Parent frame to  Child frame
	
	driver.switchTo().frame("frame-middle");
	
	// Identify the web Element
	
	WebElement text= driver.findElement(By.id("content"));
	
	// Print the text of Web Element
	
	System.out.println("Text of WebElement is " +text.getText());
	
	// Come out from Child frame to Parent frame
	
	driver.switchTo().parentFrame();
	
	// Come out from Parent frame to HTML page
	
	driver.switchTo().defaultContent();

	}

}
