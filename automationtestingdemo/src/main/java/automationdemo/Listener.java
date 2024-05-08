package automationdemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	
		public void onTestStart(ITestResult result) {
			System.out.println("Starting the Test");
		}
		
		public void onTestSuccess(ITestResult result) {
			System.out.println("testcase is sucessfull"+"   =====>   "+result.getName());
		}
		public void onTestFailure(ITestResult result) {
			System.out.println("testcase is failed"+"   =====>   "+result.getName());
			
		}
		public void onTestSkipped(ITestResult result) {
			System.out.println("testcase is skipped"+"   =====>   "+result.getName());
			
		}
		
		@Override
		public void onFinish(ITestContext context) {
			System.out.println("the testing is finished");			
		}
		
		}
