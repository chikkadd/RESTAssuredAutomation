package com.api.listners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListners implements ITestListener{
	
	private static final Logger logger = LogManager.getLogger(TestListners.class);
	
	public void onStart(ITestContext context)
	{
		logger.info("Test suite started");
	}
	public void onFinish(ITestContext context)
	{
		logger.info("Test suite Completed");
		
	}
	public void onTestSuccess(ITestResult result)
	{
		logger.info("Passsed!!",result.getMethod().getMethodName());
		logger.info("Description!!",result.getMethod().getDescription());
	}
	public void onTestFailure(ITestResult result)
	{
		logger.error("Failed!!",result.getMethod().getMethodName());
	}
	public void onTestStart(ITestResult result)
	{
		logger.info("Started!!",result.getMethod().getMethodName());
		logger.info("Description!!",result.getMethod().getDescription());
	}
	public void onTestSkipped(ITestResult result)
	{
		logger.info("Skipped!!",result.getMethod().getMethodName());
	}
	

}
