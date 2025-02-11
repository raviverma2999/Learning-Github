package Com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CalenderDemo {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.indianrail.gov.in/enquiry/SEAT/SeatAvailability.html?locale=en");
	
	// Click on Calender button
	
	WebElement ClickCalenderButton= driver.findElement(By.xpath("//img[contains(@class,'ui-datepicker-trigger')]"));
	
	
	// Enter Journey Date
	
	WebElement enterJrnyDate=driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]"));
	
	enterJrnyDate.click();
	
	Thread.sleep(5000);
	
	// Click on Calender button again
	
	WebElement ClickButtonagain= driver.findElement(By.xpath("//img[contains(@class,'ui-datepicker-trigger')]"));
	
	// Click next month button
	
	WebElement ClickNxtMntBtn= driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
	
	// Select First Feb Date
	
	WebElement enterNextMnthDate=driver.findElement(By.xpath("//a[contains(@class,'ui-state-default')]"));
	
	enterNextMnthDate.click();
	
	Thread.sleep(5000);
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
