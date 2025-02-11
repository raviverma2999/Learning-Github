package Com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
	
	ChromeDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/r.php?entry_point=login");
	
	//Identify Dropdown field
	
	WebElement day= driver.findElement(By.id("day"));
	
	
	// Select a value from the list
	
	Select selectday= new Select(day);
	
	// Select an option based of the Index of options
			
	selectday.selectByIndex(0);	
	
	
	//Select options based on the value attribute
	
	
	//selectday.selectByValue("Enter String value");
	
	
	// Select option based on the visible text
	
	selectday.selectByVisibleText("Enter String value");
	
	
	// Get selected value from the dropdown
	
	WebElement selectedOption= selectday.getFirstSelectedOption();
	
	String SelectedDropDownvalue= selectedOption.getText();
	
	System.out.println("Selected dropdown value is :" +SelectedDropDownvalue);
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
