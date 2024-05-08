package automationtesting;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import automationdemo.Listener;

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


public class ReportDemo {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
	public void startReport() {
		htmlReporter= new ExtentHtmlReporter (System.getProperty("user.dir") +"//test-output//testReport.html");
		extent= new ExtentReports();
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setDocumentTitle("Simple AutoMation Reporter");
		htmlReporter.config().setReportName("Test Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')' ");
			}
	@Test
	public void test1() {
	test	= extent.createTest("tc1","tc1 has passed");
	Assert.assertTrue(true);
		}
	@Test
	public void test2() {
	test	= extent.createTest("tc2","tc2 has failed");
	//Assert.assertTrue(false);
		}
	@Test
	public void test3() {
	test	= extent.createTest("tc3","tc3 has skipped");
	throw new SkipException("test is skipped");
	}

	
	  @AfterMethod public void getResult(ITestResult result ) {
	  if(result.getStatus()==ITestResult.SUCCESS) {
	  test.log(Status.PASS,result.getTestName()); 
	  } 
	  else if(result.getStatus()==ITestResult.FAILURE){
	  test.log(Status.FAIL, result.getThrowable()); 
	  } 
	  else {
		  test.log(Status.SKIP,
		  result.getTestName()); 
	  }
	  }
	 
	@AfterTest
	public void tearDown()
	{
		extent.flush();// to write or update test info to a reporter
	}
	
}