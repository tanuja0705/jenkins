package baseUtility;

import java.sql.SQLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import WD_JavaUtility.JavaUtility;
import genericUtilities.Reading_WritingDataFromDatabase;
import genericUtilities.ThreadLocalClass;
import vTigerPOMPages.LogInPage;

public class VTigerBaseClass {
	public Reading_WritingDataFromDatabase database= new Reading_WritingDataFromDatabase();
	public WebDriver driver=null;
	public JavaUtility ju=new JavaUtility();
	public LogInPage lp=null;
	
	@BeforeSuite
	public void beforeSuite() throws Exception {
		//Database Connection
		System.out.println("BS");
		database.getConnection("jdbc:mysql://49.249.28.218:3333/ninza_hrm", "root", "root");
	}
	
	@Parameters("browser")
	@BeforeTest
	public void beforeTest(@Optional("chrome") String browser) {
		//Launching browser
		System.out.println("BT");
		if(browser.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if(browser.equalsIgnoreCase("edge"))
			driver=new EdgeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		ThreadLocalClass.setWebDriver(driver);
	}
	
	@BeforeClass
	public void beforeClass() {
		//Navigating to application
		System.out.println("BC");
		driver.get("http://localhost:8888/index.php");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		//Login to application
		System.out.println("BM");
		lp=new LogInPage(driver);
		lp.loginToVtiger("admin", "admin");
	}
	
	@AfterMethod
	public void  afterMethod() throws Exception {
		//Logout from application
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"))).perform();
		driver.findElement(By.linkText("Sign Out")).click();
		
	}
	
	@AfterClass
	public void afterClass() {
		//close browser
		driver.quit();
	}
	
	@AfterTest
	public void afterTest() {
		//
	}
	
	@AfterSuite
	public void afterSuite() throws Exception {
		//close connection
		database.closeConnection();
	}
}
