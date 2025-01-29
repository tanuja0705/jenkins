package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	@Test
	public void launchBrowser() {
		/*1. 
		 * use System.setProperty("",path of browser exe file);
		 * Then Launch Browser
		 * */
		
		//2. Upcasting
		WebDriver driver=new ChromeDriver();
		driver.quit();
		
		//3. Without upcasting
		FirefoxDriver fdriver=new FirefoxDriver();
		fdriver.quit();
		
		//4. Using WebDriver Manager
//		WebDriverManager.chromedriver().setup();
//        WebDriver driver1 = new ChromeDriver(); // Launch the Chrome browser
//        driver1.quit();
	}
}
