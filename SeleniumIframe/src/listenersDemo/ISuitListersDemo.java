package listenersDemo;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ISuitListersDemo implements ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("Suite is "+ suite.getName()+ " started" );
	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("Suite is "+ suite.getName()+ " ended" );
	}

	
	
	
	
	
	
	
	
}
