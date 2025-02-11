package Com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "F:\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	//Open Application
	
	driver.get("http://the-internet.herokuapp.com/checkboxes");
	
	// Identify CheckBox
	
	WebElement checkBox1= driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
	
	// Check CheckBox Status
	
	boolean isDisplayedStatus=checkBox1.isDisplayed();
	
	System.out.println("CheckBox Display status is :"+isDisplayedStatus);
	
	// Check CheckBox Ebabled status
	
	boolean isEnableStatus= checkBox1.isEnabled();
	
	System.out.println("CheckBox Enabled status is :"+isEnableStatus);
	
	// Select CheckBox
	
	checkBox1.click();
	
	Thread.sleep(5000);
	
	// Check Status of CheckBox after selection
	
	boolean isSelectedStatus=checkBox1.isSelected();
	
	System.out.println("CheckBox Enabled status is :"+isEnableStatus);
	
	// Un Select CheckBox
	
	checkBox1.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
