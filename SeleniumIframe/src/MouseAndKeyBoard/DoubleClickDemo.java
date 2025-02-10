package MouseAndKeyBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DoubleClickDemo {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
	
	// Perform double click event
	
	driver.switchTo().frame("iframeResult");
		
    WebElement button=driver.findElement(By.xpath("//button[text()='Double-click me']"));
    
    Actions action=new Actions(driver);
        
    action.doubleClick(button).build().perform();
    
 
    
	}

}
