package Listener_Class;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Amezon_Listner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("The test cass is started........");	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	   System.out.println("The test case is successfully Passed.....");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	   System.out.println("The test is Failed........");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The above test case is Skipped......");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("The test case is Failed due to the Timeout condition........ ");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("The test case is successfully Started.......");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("The test cse is successfully finished........");
	}

}
