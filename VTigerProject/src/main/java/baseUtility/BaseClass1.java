/*Git URI: https://github.com/tanuja0705/jenkins.git*/
package baseUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass1 {
	public WebDriver driver;
	public static WebDriver sdriver;
	@BeforeMethod
	public void lauchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		sdriver=driver;
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
