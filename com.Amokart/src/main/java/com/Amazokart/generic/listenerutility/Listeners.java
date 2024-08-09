package com.Amazokart.generic.listenerutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.Amazokart.generic.common.BaseClass;

public class Listeners extends BaseClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestStart(result);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
	}
	@Override
	public void onTestFailure(ITestResult result) {
			String name = result.getName();
		// TODO Auto-generated method stub
			Reporter.log("Taking screenshot --started--: "+ name, true);
		//ITestListener.super.onTestFailure(result);
		TakesScreenshot trsef = (TakesScreenshot) driver;
		File temp = trsef.getScreenshotAs(OutputType.FILE);
		File permanent = new File("./src/test/resources/Screenshot/"+name+".png");
		try {
		FileHandler.copy(temp, permanent);
			//FileHandler.copy(temp, permanent);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		Reporter.log("Taking screenshot completed: "+ name, true);
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onStart(context);
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//ITestListener.super.onFinish(context);
	}
	

}
