package com.testsuite_regression;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.LandingPage;
import com.Pages.SignUpPage;
import com.base.BaseClass;

public class TP_TC_016 extends BaseClass {
	
	LandingPage obj_LandingPage;
	SignUpPage obj_SignUpPage;
	
	@Test
	public void invalidUserName() {
		obj_LandingPage = new LandingPage(driver);
		app_logs.info("TwoPlugs application opened");
		obj_LandingPage.clickbtnjnfrfree();
		app_logs.info("Clicked Join now for free");
		obj_SignUpPage = new SignUpPage(driver);
		obj_SignUpPage.invalidUserName("u@#4&&&","gee123@yahoo.com","123");
		app_logs.info("Username field validated by giving invalid Username");
	}
	
	@BeforeClass
	public void initialise() throws IOException {
		init();
	}

	
	@AfterClass
	public void closebrowser() {
		tearDown();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE)
		{
			takeScreenShot(driver, result.getName());
		}
	
	}
	

}
