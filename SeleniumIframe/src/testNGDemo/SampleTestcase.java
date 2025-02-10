package testNGDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestcase {
	
    @Test
    public void launchFacebookPage() {

    System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
    
    ChromeDriver driver=new ChromeDriver();
    
    driver.get("https://www.facebook.com/");

    
    }
  
}
