package baseUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.stream.Stream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MOCK {
	
	@Test
	public void NinzaTest() throws Throwable {
	
	WebDriver driver= new ChromeDriver();
	driver.get("http://49.249.28.218:8091/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.findElement(By.name("username")).sendKeys("rmgyantra");
	driver.findElement(By.name("password")).sendKeys("rmgy@9999");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
//	driver.findElement(By.xpath("//a[.='Projects']")).click();
//	driver.findElement(By.xpath("//span[.='Create Project']")).click();
//	
	FileInputStream fis= new FileInputStream("./testdata/mock.xlsx");
	Workbook book= WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("sheet1");
//	String project_name = sh.getRow(1).getCell(0).toString();
//	//String team_size = sh.getRow(1).getCell(1).toString();
//	String project_manager = sh.getRow(1).getCell(2).toString();
//	String project_status = sh.getRow(1).getCell(3).toString();
//	
//	driver.findElement(By.name("projectName")).sendKeys(project_name);
//	Thread.sleep(2000);
//	//driver.findElement(By.name("teamSize")).sendKeys(team_size);
//	//Thread.sleep(3000);
//	driver.findElement(By.name("createdBy")).sendKeys(project_manager);
//	Thread.sleep(2000);
//	WebElement project_status_dd = driver.findElement(By.xpath("//option[.='Select Value']/parent::select[@name='status']"));
//	
//	Select s = new Select(project_status_dd);
//	s.selectByVisibleText(project_status);
//	
//	driver.findElement(By.xpath("//input[@value='Add Project']")).click();
	
	
	driver.findElement(By.xpath("//a[.='Employees']")).click();
	driver.findElement(By.xpath("//span[.='Add New Employee']")).click();
	
	
	String name = sh.getRow(4).getCell(0).toString();
	String email = sh.getRow(4).getCell(1).toString();
	 String ph_no = sh.getRow(4).getCell(2).toString();
	String username=sh.getRow(4).getCell(3).toString();
	String dest=sh.getRow(4).getCell(4).toString();
	String exp=sh.getRow(4).getCell(5).toString();
	String project=sh.getRow(4).getCell(6).toString();
	
	driver.findElement(By.xpath("//label[text()='Name*']/following-sibling::input")).sendKeys(name);
	driver.findElement(By.xpath("//label[text()='Email*']/following-sibling::input")).sendKeys(email);
	
	driver.findElement(By.xpath("//label[text()='Phone*']/following-sibling::input")).sendKeys(ph_no);
	
	driver.findElement(By.xpath("//label[text()='Username*']/following-sibling::input")).sendKeys(username);
	
	driver.findElement(By.xpath("//label[text()='Designation*']/following-sibling::input")).sendKeys(dest);
	
	driver.findElement(By.xpath("//label[text()='Experience*']/following-sibling::input")).sendKeys(exp);
	
	 WebElement project_dd = driver.findElement(By.xpath("//option[.='Select Project']/parent::select[@name='project']"));
	Select s1= new Select(project_dd);
	s1.selectByVisibleText(project);
	
	driver.findElement(By.xpath("//select[@name='project']")).sendKeys(Keys.TAB,Keys.TAB,Keys.ENTER);
	//driver.findElement(By.xpath("//input[@value='Add']")).click();
	
	
	WebElement confrm = driver.findElement(By.xpath("//div[.='User hutag Successfully Created']"));
	
	boolean displayed = confrm.isDisplayed();
	
	Assert.assertTrue(displayed);
	
	driver.quit();
	
	
	
	
	
	}
}
