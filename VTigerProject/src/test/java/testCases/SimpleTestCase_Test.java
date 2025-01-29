package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseUtility.BaseTest;
import genericUtilities.ListenerImplementation;

@Listeners(genericUtilities.ListenerImplementation.class)
public class SimpleTestCase_Test extends BaseTest{
	WebDriver driver=null;
	@Test(groups = "Smoke")
	public void show_Test() {
		//driver=new ChromeDriver();
		//driver.get("https://demowebshop.tricentis.com/");
		ListenerImplementation.test.log(Status.PASS, "SimpleTestCase_Test show_Test method");
		//driver.quit();
	}
	
	@Test(groups = "Regression")
	public void show1_Test() {
		ListenerImplementation.test.log(Status.PASS, "SimpleTestCase_Test show1_Test method");
		Assert.assertTrue(false);
		driver.quit();
	}
	
	@Test(groups = "Regression")
	public void show2_Test() {
		//driver=new ChromeDriver();
		//driver.get("https://demowebshop.tricentis.com/");
		ListenerImplementation.test.log(Status.PASS, "SimpleTestCase_Test show2_Test method");
		//driver.quit();
	}
}
