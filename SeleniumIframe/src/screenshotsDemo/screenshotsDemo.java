package screenshotsDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotsDemo {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		// take screenshot
		
		TakesScreenshot screenshot=driver;
		
		File image=screenshot.getScreenshotAs(OutputType.FILE);
		
		// Copy file
		
		File myFile=new File("E:\\Eclipse workspace 12-2024\\SeleniumIframe\\Screenshots\\Image1.png");
		
		FileUtils.copyFile(image, myFile);

	}

}
