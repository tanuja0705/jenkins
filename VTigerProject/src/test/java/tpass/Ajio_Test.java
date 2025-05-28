package tpass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio_Test {
	@Test
	public void addProductToCart() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ajio.com/");
		driver.findElement(By.id("loginAjio")).click();
		driver.findElement(By.xpath("//div[@class='google-login']")).click();
		
		Set<String> window= driver.getWindowHandles();
		
		driver.findElement(By.name("identifier")).sendKeys("sonawaletanuja55@gmail.com");
		
	}
}
