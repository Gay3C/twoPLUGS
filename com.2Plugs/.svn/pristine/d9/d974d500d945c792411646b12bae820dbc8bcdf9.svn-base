package com.testsuite_regression;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.LandingPage;
import com.base.BaseClass;

public class TP_TC_013 extends BaseClass {
	LandingPage obj_LandingPage;
	
	//Validating whether the socialmedia icons directs the user to the appropriate sites
	@Test
	public void SocialMediaIcons() throws InterruptedException {
		obj_LandingPage=new LandingPage(driver);
		app_logs.info("Validation started for Social Media icons");
		obj_LandingPage.clickfb();
		app_logs.info("Facebook icon clicked");
		obj_LandingPage.clickinsta();
		app_logs.info("Instagram icon clicked");
		obj_LandingPage.clicktwtr();
		app_logs.info("Twitter icon clicked");
		app_logs.info("Validation completed for Social Media icons");
		
		
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
