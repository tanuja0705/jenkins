package tpass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
	public static void main(String[] args) {
		int i=0;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 2700).perform();
		
		List<WebElement> ele=driver.findElements(By.xpath("//ul[@id='pagination']/descendant::a"));
		for(;i<ele.size();i++) {
			if("Wireless Mouse 20".equalsIgnoreCase("Wireless Mouse 20")) {
				driver.findElement(By.xpath("//td[text()='Wireless Mouse 20']/following-sibling::td//input")).click();
				break;
			}
			else
				ele.get(i).click();
		}
		if(i==ele.size())
			System.out.println("Element was not present in any page");
		
		driver.quit();
	}
}
