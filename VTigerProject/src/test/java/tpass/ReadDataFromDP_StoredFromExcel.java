package tpass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtilities.ReadingDatafromExcelInDataProvider;

public class ReadDataFromDP_StoredFromExcel {
	@Test(dataProviderClass = ReadingDatafromExcelInDataProvider.class, dataProvider = "readingDataFromExcel")
	public void launchUrl(String product) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]")).sendKeys(product,Keys.ENTER);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
