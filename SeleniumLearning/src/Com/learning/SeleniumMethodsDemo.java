package Com.learning;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethodsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		// Get the title of the page
		
		String title=driver.getTitle();
		
		System.out.println("Page Title is " +title);
		
		// Get the URL of the page
		
		String url=driver.getCurrentUrl();
		
		System.out.println("Page URL is " +url);
		
		

	}

}
