package tpass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class KalkiFashions_Test {
	@Test
	public void addingProductToCart_Test() throws InterruptedException {
		
		WebDriver driver=null;
		String browser="chrome";
		
		if(browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.kalkifashion.com/");
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		driver.findElement(By.id("okButton")).click();
		
		//driver.findElement(By.xpath("(//*[name()='svg']/*[name()='circle' and contains(@stroke,'#262433')])[5]")).click();
		//driver.findElement(By.id("user_close_popup")).click();
		
		//WebDriverWait wWait=new WebDriverWait(driver, Duration.ofSeconds(50));
		//wWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h4[text()='Sign Up']"))));

		driver.findElement(By.xpath("//div[contains(text(),'Search for Style')]")).click();
		WebElement search=driver.findElement(By.id("search-input"));
		search.clear();
		search.sendKeys("Kurti");
		search.sendKeys(Keys.ENTER);
		
		//adding 1st dress
		driver.findElement(By.id("//h3[text()='White And Blue Printed Georgette Kurti']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
