package Com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonOperationsDemo {

	public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
    
    ChromeDriver  driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
    
    // Identify button Element
    
    WebElement addButton=driver.findElement(By.xpath("//button[text()='Add Element']"));
    
    
    // Check Display status
    
    boolean isDisplayedStatus=addButton.isDisplayed();
    
    System.out.println("Display status is "+ isDisplayedStatus);
    // Check enabled status
    
    boolean isEnabledStatus=addButton.isEnabled();
    
    System.out.println("Enabled status is "+ isEnabledStatus);
    
    // Get the name of the button
    
    String buttonName=addButton.getText();
    
    System.out.println("Button Name is "+ buttonName);
    
    // Click on the button
    
    addButton.click();
    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
