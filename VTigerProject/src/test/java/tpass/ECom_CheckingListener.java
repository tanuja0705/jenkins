package tpass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import baseUtility.BaseClass1;
import genericUtilities.ThreadLocalClass;


@Listeners(genericUtilities.ListenerImplementation1.class)
public class ECom_CheckingListener extends BaseClass1{
	@Test
	public void amazon_Test() throws Exception {
		System.out.println("Amazon");
		driver.get("https://www.amazon.com/");
		Assert.assertEquals(driver.getTitle().contains("Amazon.com"), true, "*****Navigated to wrong application*****");
		ThreadLocalClass.getExtentTest().log(Status.PASS,"Navigated to correct application");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Computer",Keys.ENTER);
		Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).getText().contains("Computer"), "*****Product wasn't searched*****");
		ThreadLocalClass.getExtentTest().log(Status.PASS,"Product searched");
		Thread.sleep(3000);
	}
	
	@Test
	public void flipkart_Test() throws Exception {
		System.out.println("Flipkart");
		driver.get("https://www.flipkart.com/");
		Assert.assertEquals(driver.getTitle().contains("Online Shopping"), true, "*****Navigated to wrong application*****");
		ThreadLocalClass.getExtentTest().log(Status.PASS,"Navigated to correct application");
		driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]")).sendKeys("Computer",Keys.ENTER);
		Assert.assertTrue(driver.getTitle().contains("Computer"), "*****Product wasn't searched*****");
		ThreadLocalClass.getExtentTest().log(Status.PASS,"Product searched");
		Thread.sleep(3000);
	}
}
