package genericUtilities;

import com.aventstack.extentreports.ExtentTest;

public class ThreadLocalClass {
	public static ThreadLocal<ExtentTest> etest=new ThreadLocal<ExtentTest>();
	
	public static void setExtentTest(ExtentTest test) {
		etest.set(test);
	}
	public static ExtentTest getExtentTest() {
		return etest.get();
	}
	
}
