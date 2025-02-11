package Com.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocatorDemo {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","F:\\\\ChromeDriverExe\\\\chromedriver-win64\\\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	List <WebElement> allLinks= driver.findElements(By.tagName("a"));
	
	System.out.println("Total number of links are "+ allLinks.size());
	
    for(int i=0; i<allLinks.size(); i++) {
    	
    System.out.println(allLinks.get(i).getText());	
    
    
    }
    
    
	
	}

}
