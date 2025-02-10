package cookiesDemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookie {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriverExe\\chromedriver-win64\\chromedriver.exe");
		
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 // Add Cookie
		 
		 Cookie myCookies= new Cookie("testName","test value");
		 
		 driver.manage().addCookie(myCookies);
		 
		 // Get Cookie

		 Set <Cookie> allCookies=driver.manage().getCookies();
		 
		 for(Cookie ck:allCookies) {
			 
			 System.out.println(ck.getName()+ "===" + ck.getExpiry() +"===" +ck.getDomain());
		 }
		 
		 // Delete cookie
		 
		 driver.manage().deleteCookieNamed("orangehrm");
		 
		 Set<Cookie> allCookiesAfterDelete=driver.manage().getCookies();
		 
		 for(Cookie ck:allCookiesAfterDelete) {
			 
			 System.out.println(ck.getName()+ "===" + ck.getExpiry() +"===" +ck.getDomain());
		 }

	}

}
