package screenshotsDemo;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class AshotScreenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/privacy/policy/?entry_point=facebook_page_footer");
		
		Screenshot screenshot=new AShot().takeScreenshot(driver);
		
		File image=new File("E:\\Eclipse workspace 12-2024\\SeleniumIframe\\AshotScreenshots\\testFull.png");
		
		ImageIO.write(screenshot.getImage(), "png", image);
		
	}

}
