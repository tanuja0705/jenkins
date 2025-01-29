package tpass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import WD_JavaUtility.JavaUtility;

public class ERail_Test {
	JavaUtility ju=new JavaUtility();
	WebDriver driver;
	@Test
	public void perform() {
		String date=ju.generateDateBasedOnSpecification(30,"month");
		System.out.println(date);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String arr[]=date.split("-");
		driver.get("https://erail.in/");
		driver.findElement(By.xpath("//input[@title='Select Departure date for availability']")).click();
		String datee=arr[1]+"-"+arr[2];
		WebElement ele=driver.findElement(By.xpath("//td[text()='"+datee+"']parent::tr/following-sibling::tr//td[text()='"+arr[0]+"']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		act.click(ele).perform();
		
		driver.quit();
	}
}
