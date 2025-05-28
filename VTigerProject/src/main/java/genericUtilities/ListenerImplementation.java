package genericUtilities;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import WD_JavaUtility.JavaUtility;
import baseUtility.BaseTest;

public class ListenerImplementation implements ITestListener,ISuiteListener {
	public ExtentSparkReporter esreport=null;
	public ExtentReports ereport=null;
	public static ExtentTest test=null;
	public JavaUtility ju=new JavaUtility();
	
	public void onStart(ISuite suite) {
		
		String date=ju.getSystemDate();
		esreport= new ExtentSparkReporter("./advanceReport/"+suite.getName()+"_"+date+".html");
		esreport.config().setDocumentTitle("ECom");
		esreport.config().setTheme(Theme.DARK);
		esreport.config().setReportName("Report"+"_"+ju.generateRandomNumber());
		ereport= new ExtentReports();
		
	  }
	
	public void onFinish(ISuite suite) {
	    System.out.println("On finish of suite");
	  }
	
	public void onStart(ITestContext context) {
		System.out.println("contect:"+context);
		
		System.out.println("on start of test");
		ereport.attachReporter(esreport);
		ereport.setSystemInfo("OS", "Windows");
		ereport.setSystemInfo("OS Version", "Windows 11");
		ereport.setSystemInfo("Environment", "Testing");
		ereport.setSystemInfo("URL", "asgdhtjykufyjhg");
	 }
	
	public void onFinish(ITestContext context) {
	    System.out.println("on finish of test");
	    ereport.flush();
	  }
	
	public void onTestStart(ITestResult result) {
	    System.out.println("On Test Start");
	    test=ereport.createTest(result.getName());
	    ThreadLocalClass.setExtentTest(test);
	    if(BaseTest.sdriver.getTitle().contains("Home"))
			test.log(Status.PASS, "User is succefully loggedin😁😊");
		else
			test.log(Status.FAIL, "There is some issue while logging in😐");
	  }
	
	public void onTestSuccess(ITestResult result) {
	    System.out.println("On Test Success");
	    test.log(Status.PASS, result.getName()+" test case is passed");
	  }
	
	public void onTestFailure(ITestResult result) {
//	    TakesScreenshot ts=(TakesScreenshot)BaseTest.sdriver;
//	    String temp=ts.getScreenshotAs(OutputType.BASE64);
	   // test.addScreenCaptureFromBase64String(temp, result.getName());
	    test.log(Status.FAIL, result.getName()+" test case got filed because of the screenshot reason");
	    test.log(Status.FAIL, result.getThrowable());
	   }
	
	public void onTestSkipped(ITestResult result) {
	    System.out.println("On Test Skipped");
	    test.log(Status.SKIP, result.getName()+" test case is skipped");
	  }
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    System.out.println("On Test Failed But Within Success Percentage");
	    test.log(Status.FAIL, result.getName()+" test case is Failed But Within Success Percentage");
	  }
	
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("On Test Failed With Timeout");
		test.log(Status.FAIL, result.getName()+" test case because of timeout");
	    onTestFailure(result);
	  }

}
