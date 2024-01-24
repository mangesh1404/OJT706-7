package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" test case started");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" test case passesd");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" test case failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" test case skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Test Suite started");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Suite finished");
		
	}

	
}
