package com.selenium.PracticOne;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
public class TestNGRetry implements IRetryAnalyzer{
	private int retryCount         = 1;
    private int maxRetryCount     = 2;   // 失败后重跑的次数

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }else { 
        	return false;	
        }
     }
}

