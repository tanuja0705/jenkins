package webdriverlistener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.Assert;

public class TestScript {
	 public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();

	        // Attach the listener
	        WebDriver decoratedDriver = new EventFiringDecorator<WebDriver>(new WebDriverListenerImpClass()).decorate(driver);

	        decoratedDriver.get("https://google.com");
	        decoratedDriver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
	        Thread.sleep(3000);
	        decoratedDriver.findElement(By.xpath("//span[text()='selenium webdrive r']")).click();
	        Thread.sleep(3000);
	        driver.quit();
	    }
}
