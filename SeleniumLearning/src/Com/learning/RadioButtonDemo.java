package Com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
    
    ChromeDriver driver=new ChromeDriver();
    
    driver.manage().window().maximize();
    
    driver.get("https://www.facebook.com/r.php?entry_point=login");
    
    // Identify Radio button Element
    
    WebElement firstRadioButton=driver.findElement(By.xpath("//input[@value='1']"));
		
    // Check Display status of the button
    
    boolean isDisplayStatus= firstRadioButton.isDisplayed();
    
    System.out.println("Display status of First Radio button :" + isDisplayStatus);
    
    // Check enable status of the button
    
    boolean isEnabledStatus= firstRadioButton.isEnabled();
    
    System.out.println("Enabled status of First Radio button :" + isEnabledStatus);
    
    // Select a Radio button
    
    firstRadioButton.click();
    
    Thread.sleep(5000);
        
    // Get Selected status of the Radio button
    
    boolean isSelectedStatus=firstRadioButton.isSelected();
    
    System.out.println("Selected status of First Radio button after selection :" + isSelectedStatus);
    
    // Un Select the Radio button
    
    WebElement secondRadioButton=driver.findElement(By.xpath("//input[@value='2']"));
    
    secondRadioButton.click();
    
	}

}
