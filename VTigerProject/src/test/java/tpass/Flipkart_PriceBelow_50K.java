package tpass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Flipkart_PriceBelow_50K {
	@Test
	public void printProductBelow50K() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Prod')]")).clear();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Prod')]")).sendKeys("samsung mobile",
				Keys.ENTER);

		List<WebElement> prod = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));

		for (int i = 0; i < prod.size() & i < price.size(); i++) {
			int amt = Integer.parseInt(price.get(i).getText().replace("₹", "").replace(",", ""));
			if (amt <= 30000)
				System.out.println("*************"+prod.get(i).getText()+ "*************" + price.get(i).getText() + "*************");
		}

		driver.quit();
	}
}
