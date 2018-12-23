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

public class TP_TC_014 extends BaseClass {
	
	 SignUpPage obj_SignUpPage;
	 LandingPage obj_LandingPage;
	 
	 @Test
	public void SignUp() {
		 
		 obj_LandingPage = new LandingPage(driver);
		 app_logs.info("TwoPlugs application opened");
		 obj_LandingPage.joinfrfreeheader();
		 app_logs.info("Join now for free button clicked");
		 obj_SignUpPage = new SignUpPage(driver);
		 app_logs.info("SignUp page displayed");
		 obj_SignUpPage.facebooksignup();
		 app_logs.info("Continue with Facebook button clicked");
		 obj_SignUpPage.signup("test555","testplugs555@gmail.com","test2plugs**");
		 app_logs.info("SignUp by providing Username,email and password");
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
