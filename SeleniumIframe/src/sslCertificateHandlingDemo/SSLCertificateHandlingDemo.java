package sslCertificateHandlingDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCertificateHandlingDemo {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		
		options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
				
		driver.get("https://expired.badssl.com/");
		
		
		
		
		
		
	}

}
