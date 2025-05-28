package vtiger;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseUtility.VTigerBaseClass;
import genericUtilities.ThreadLocalClass;

public class CreateOrganization_Test extends VTigerBaseClass{
	@Test
	public void createOrg_Test() {
		ThreadLocalClass.getWebDiver().findElement(By.linkText("Organizations")).click();
		ThreadLocalClass.getWebDiver().findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		ThreadLocalClass.getWebDiver().findElement(By.name("accountname")).sendKeys("ShivSakti_"+ju.generateRandomNumber());
		ThreadLocalClass.getWebDiver().findElement(By.xpath("//input[contains(@title,'Save')]")).click();
		System.out.println("createOrg_Test");
	}
	
	@Test
	public void createOrgWithPhno_Test () {
		ThreadLocalClass.getWebDiver().findElement(By.linkText("Organizations")).click();
		ThreadLocalClass.getWebDiver().findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		ThreadLocalClass.getWebDiver().findElement(By.name("accountname")).sendKeys("ShivSakti_"+ju.generateRandomNumber());
		ThreadLocalClass.getWebDiver().findElement(By.id("phone")).sendKeys("9876546301");
		ThreadLocalClass.getWebDiver().findElement(By.xpath("//input[contains(@title,'Save')]")).click();
		System.out.println("createOrgWithPhno_Test");
	}
	
	@Test
	public void createOrgWithIndustyType_Test() {
		
		
	}
}
