package tpass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartMultipleWindow_Test {
	@Test
	public void addToCart_Test() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Prod')]")).clear();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Prod')]")).sendKeys("samsung mobile",
				Keys.ENTER);
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Men']"))).perform();
		driver.findElement(By.linkText("T-Shirts")).click();
		String parent=driver.getWindowHandle();
		
		act.scrollByAmount(0, 200).perform();
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[text()='ADIDAS']/preceding-sibling::div")).click();
		driver.findElement(By.linkText("Men Solid Polo Neck Cotton Blend Blue T-Shirt")).click();
		
		Set<String> wins=driver.getWindowHandles();
		wins.remove(parent);
		for(String s:wins) {
			driver.switchTo().window(s);
		}
		
		act.scrollByAmount(0, 800).perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]"))));
		driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
		
		driver.switchTo().window(parent);
		 driver.findElement(By.xpath("//a[contains(@href,'viewcart')]")).click();
		 
		 int price=Integer.parseInt(driver.findElement(By.xpath("//span[@class='LAlF6k re6bBo']")).getText().replace("₹", ""));
		int platformFee= Integer.parseInt(driver.findElement(By.xpath("//div[text()='Platform Fee']/parent::div/following-sibling::div/span[@class='b5rp0W']")).getText().replace("₹", ""));
		price+=platformFee;
		
		int total=Integer.parseInt(driver.findElement(By.xpath("//div[@class='_1Y9Lgu']/span[text()]")).getText().replace("₹", ""));
		
		Assert.assertEquals(price, total, "Actual price and total price are not matching");
		System.out.println("Actual and expected price are matching");
		 
		driver.quit();
	}
}
