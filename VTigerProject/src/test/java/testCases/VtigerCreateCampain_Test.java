package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtilities.Reading_WritingDataFrom_ToExcelFile;

public class VtigerCreateCampain_Test {
	@Test
	public void createCampain_Test() throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://localhost:8888/index.php");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("More")).click();
		driver.findElement(By.linkText("Campaigns")).click();
		driver.findElement(By.xpath("//img[contains(@title,'Create Campaign')]")).click();
		
		driver.findElement(By.name("campaignname")).sendKeys("Elvish");
		driver.findElement(By.xpath("//input[@value='U']")).click();
		
		Reading_WritingDataFrom_ToExcelFile obj = new Reading_WritingDataFrom_ToExcelFile();
		obj.makeExcelSheetInReadMood("vtiger");
		
		driver.findElement(By.name("budgetcost")).clear();
		driver.findElement(By.name("budgetcost")).sendKeys(obj.readingDataFromExcelFile(0,0));
		Thread.sleep(3000);
		driver.findElement(By.name("actualcost")).clear();
		driver.findElement(By.name("actualcost")).sendKeys(obj.readingDataFromExcelFile(1,0));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@value,'Save')]")).click();
		
		driver.quit();
	}
}
