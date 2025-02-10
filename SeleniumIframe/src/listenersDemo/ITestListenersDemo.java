package listenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenersDemo implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {

    System.out.println("Test case: " + result.getName()+ " is passed");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case:" + result.getName()+ " is success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case: " + result.getName()+ " is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case: " + result.getName()+ " is skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test case: " + context.getName()+ " is started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test case:" + context.getName()+ " is finished");
	}

	
	
	
	
	
}
