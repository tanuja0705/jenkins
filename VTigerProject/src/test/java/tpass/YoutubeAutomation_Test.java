package tpass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YoutubeAutomation_Test {
	@Test
	public void playMovie() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.name("search_query")).clear();
		driver.findElement(By.name("search_query")).sendKeys("Baal Hanuman movie in hindi",Keys.ENTER);
		driver.findElement(By.xpath("//yt-formatted-string[text()='Bal Hanuman 3D Animated Hindi Full Movie || Hanuman || Hindi Movies']")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
