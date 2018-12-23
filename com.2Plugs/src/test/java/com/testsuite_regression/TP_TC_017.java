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

public class TP_TC_017 extends BaseClass {
	
	LandingPage obj_LandingPage;
	SignUpPage obj_SignUpPage;
	
	@Test
	public void invalidemailaddress() {
		obj_LandingPage = new LandingPage(driver);
		app_logs.info("TwoPlugs application displayed");
		obj_LandingPage.clickbtnjnfrfree();
		obj_SignUpPage = new SignUpPage(driver);
		obj_SignUpPage.isinValidEmailAddress("ghh123");
        app_logs.info("Email address field validated by providing invalid email address");
		
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
