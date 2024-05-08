package automationtesting;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import automationdemo.Listener;

@Listeners(Listener.class)
public class ListnrTestCase {
	ExtentHtmlReporter hr;//makes report in 
	ExtentReports er;//report generation
	ExtentTest et;//
	@BeforeTest
	public void reportGenrator() {
		hr=new ExtentHtmlReporter(System.getProperty("user.dir")+"//test-output//testReport.html");
		er=new ExtentReports();
		er.attachReporter(hr);
		hr.config().setDocumentTitle("Listener class test case");
		hr.config().setReportName("test report for listener");
		hr.config().setTheme(Theme.STANDARD);
		hr.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')' ");
	}
	
	
	@Test
	public void tests1() {
	et	= er.createTest("tc1","tc1 has passed");
	Assert.assertTrue(true);
	}
	@Test
	public void tests2() {
	et	= er.createTest("tc2","tc2 has failed");
	Assert.assertTrue(false);
	}
	@Test
	public void tests3() {
	et	= er.createTest("tc3","tc3 has been skipped");
	throw new SkipException("test is skipped");
	}
	
	 @AfterMethod public void getResult(ITestResult result ) {
		  if(result.getStatus()==ITestResult.SUCCESS) {
		  et.log(Status.PASS,result.getTestName()); 
		  } 
		  else if(result.getStatus()==ITestResult.FAILURE){
		  et.log(Status.FAIL, result.getThrowable()); 
		  } 
		  else {
			  et.log(Status.SKIP, result.getTestName()); 
		  }
		  }
	
	@AfterTest
	public void tearDown1()
	{
		er.flush();// to write or update test info to a reporter
	}
	

}


