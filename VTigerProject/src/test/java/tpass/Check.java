package tpass;

import org.testng.annotations.Test;

public class Check {
	
	@Test (invocationCount = 0)
	public void method1Test() {
		System.out.println("M1");
		//Assert.fail();
	}
	
	@Test(dependsOnMethods = "method1Test")
	public void method2Test() {
		System.out.println("M2");
	}
	
	@Test 
	public void method3() {
		System.out.println("M3");
	}
	
	@Test
	public void method4() {
		System.out.println("M4");
	}
}
