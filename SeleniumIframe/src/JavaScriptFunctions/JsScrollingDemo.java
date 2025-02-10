package JavaScriptFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsScrollingDemo {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/privacy/policy/?entry_point=data_policy_redirect&entry=0");
		
		Thread.sleep(5000);
		
		// Scroll down page to manual review
		
		WebElement manualReviewLink=driver.findElement(By.linkText("manual review"));
		
		JavascriptExecutor js=driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", manualReviewLink);
		
		Thread.sleep(5000);
				
		// Scroll down page till the end
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
