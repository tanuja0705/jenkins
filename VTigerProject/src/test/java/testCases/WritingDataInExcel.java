package testCases;
import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class WritingDataInExcel {
	public Workbook wb;
	@Test
	public void readingDataFromExcelFile() throws EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		FileInputStream fis=new FileInputStream("./testData/TestData1.xlsx");
		wb=WorkbookFactory.create(fis);
		driver.findElement(By.id("Email")).sendKeys(wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue());
		driver.findElement(By.id("Password")).sendKeys(wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		if(driver.findElement(By.linkText("Log out")).getText().equals("Log out")) {
			

			Cell cell=wb.getSheet("Sheet1").getRow(1).createCell(3);
			cell.setCellValue("Loggedin");
			FileOutputStream fos=new FileOutputStream("./testData/TestData1.xlsx");
			wb.write(fos);
			
			fos.close();
			wb.close();
		}
		
		else
			System.out.println("Something is wrong");
		
		driver.quit();
	}
}


