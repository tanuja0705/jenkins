package tpass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("xxxxx"); 				//Pass proper email
		driver.findElement(By.className("password")).clear();							
		driver.findElement(By.className("password")).sendKeys("123456");				//Pass valid password
		driver.findElement(By.name("RememberMe")).click();
		driver.findElement(By.className("button-1 login-button")).click();
		driver.quit();
	}
}