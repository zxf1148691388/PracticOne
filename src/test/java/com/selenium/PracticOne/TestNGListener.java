package com.selenium.PracticOne;
import java.util.Iterator;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.log4testng.Logger;
public class TestNGListener extends TestListenerAdapter{
	private static Logger log = Logger.getLogger(TestNGListener.class);
	@Override  
	public void onTestFailure(ITestResult tr) {  
	        super.onTestFailure(tr);  
	        log.info(tr.getName() + " Failure");  
	}  
	  
	@Override  
	public void onTestSkipped(ITestResult tr) {  
	        super.onTestSkipped(tr);  
	        log.info(tr.getName() + " Skipped");  
	}  
	  
	@Override  
	public void onTestSuccess(ITestResult tr) {  
	        super.onTestSuccess(tr);  
	        log.info(tr.getName() + " Success");  
	}  
	  
	@Override  
	public void onTestStart(ITestResult tr) {  
	        super.onTestStart(tr);  
	        log.info(tr.getName() + " Start");  
	}  
	  
	@Override  
	 public void onFinish(ITestContext context) { 
        Iterator<ITestResult> listOfFailedTests = context.getFailedTests().getAllResults().iterator();
        while (listOfFailedTests.hasNext()) {
            ITestResult failedTest = listOfFailedTests.next();
            ITestNGMethod method = failedTest.getMethod();
            if (context.getFailedTests().getResults(method).size() > 1) {
                listOfFailedTests.remove();
            } else {
                if (context.getPassedTests().getResults(method).size() > 0) {
                    listOfFailedTests.remove();
                }
            }
        }
    }
}

