package Listener_Class;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listesner_Demo_Practice implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("The test case is successfully started...........");		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("The above test case is Passed ......");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The given test case is failed...........");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The test case is Skiped.....");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Above test is failed due to the timeout.....");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("The test case is started.......");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("The test case is finished.........");
	}
	
	

}
