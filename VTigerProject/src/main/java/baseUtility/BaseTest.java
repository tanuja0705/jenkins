package baseUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import WD_JavaUtility.JavaUtility;
import genericUtilities.ListenerImplementation;
import genericUtilities.ReadingDataFromPropertiesFile;
import genericUtilities.ThreadLocalClass;

public class BaseTest {
	public WebDriver driver=null;
	public static WebDriver sdriver=null;
	public ReadingDataFromPropertiesFile read=new ReadingDataFromPropertiesFile();
	
	@BeforeSuite(groups = {"Smoke","Regression"})
	public void itsBeforeSuite() {
		//ListenerImplementation.test.log(Status.INFO,"Before Suite Started");
	}
	
	@BeforeClass(groups = {"Smoke","Regression"})
	public void itsBeforeClass() {
		//ListenerImplementation.test.log(Status.INFO,"Before Class Started");
	}
	
	@BeforeMethod(groups = {"Smoke","Regression"})
	public void itsBeforeMethod() throws Exception {
		//ListenerImplementation.test.log(Status.INFO,"Before Method Started");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("sonawaletanuja55@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Tanuja@0803");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		sdriver=driver;
		ThreadLocalClass.setWebDriver(sdriver);
	}
	
	@AfterMethod(groups = {"Smoke","Regression"})
	public void itsAfterMethod() throws InterruptedException {
		ListenerImplementation.test.log(Status.INFO,"After Method Started");
		WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(30);
		driver.findElement(By.linkText("Sign Out")).click();
		
	}
	
	@AfterClass(groups = {"Smoke","Regression"})
	public void itsAfterClass() {
		ListenerImplementation.test.log(Status.INFO,"After Class Started");
		driver.quit();
	}
	
	@AfterSuite(groups = {"Smoke","Regression"})
	public void itsAfterSuite() {
		ListenerImplementation.test.log(Status.INFO,"After Suite Started");
	}
}
