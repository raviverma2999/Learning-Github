package sslCertificateHandlingDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class sslFirefoxDemo {

	public static void main(String[] args) {

		FirefoxOptions options = new FirefoxOptions();

		options.setAcceptInsecureCerts(true);

		System.setProperty("webdriver.gecko.driver", "F:\\FireFoxBrowserExe\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver(options);

		driver.manage().window().maximize();

		driver.get("https://expired.badssl.com/");

	}

}
