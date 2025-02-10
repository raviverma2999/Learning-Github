package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {


System.setProperty("webdriver.chrome.driver","F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
        
        driver.get("https://jqueryui.com/dialog/");
        
        // Identify the Element which is Present inside Iframe
        
        driver.switchTo().frame(0);
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//button[@title='Close']")).click();
        
        driver.switchTo().defaultContent();
        
        Thread.sleep(5000);
        
        driver.findElement(By.linkText("Demos")).click();
        
        // Version 132.0.6834.111

	}
	
	

}
