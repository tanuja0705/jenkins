package tpass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import WD_JavaUtility.JavaUtility;

public class Vtiger {
	@Test
	public void createOrg() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://localhost:8888/index.php");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin",Keys.ENTER);
		driver.findElement(By.linkText("Contacts")).click();
		
		JavaUtility ju=new JavaUtility();
		
		driver.findElement(By.xpath("//img[contains(@title,'Create')]")).click();
		driver.findElement(By.name("lastname")).sendKeys("OrgNameeee"+ju.generateRandomNumber());
		
		
		String start=ju.getSystemDate();
		String end=ju.generateDateBasedOnSpecification(30, "month");
		
		driver.findElement(By.name("support_start_date")).clear();
		driver.findElement(By.name("support_start_date")).sendKeys(start);
		
		driver.findElement(By.name("support_end_date")).clear();
		driver.findElement(By.name("support_end_date")).sendKeys(end);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
