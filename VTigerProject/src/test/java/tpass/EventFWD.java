package tpass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EventFWD {
	@Test
	public void launchB() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
	}
}
