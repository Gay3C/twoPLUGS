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

public class TP_TC_019 extends BaseClass {

	LandingPage obj_LandingPage;
	SignUpPage obj_SignUpPage;
	
	@Test
	public void blankpassword() {
				
		obj_LandingPage = new LandingPage(driver);
		app_logs.info("TwoPlugs application opened");
		obj_LandingPage.clickbtnjnfrfree();
		app_logs.info("Join now for free button clicked");
		obj_SignUpPage = new SignUpPage(driver);
		app_logs.info("Validation started for password field");
		obj_SignUpPage.blankpwd("GGG","gee123@gmail.com","");
		app_logs.info("Validation completed for password field by leaving the field blank");
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
