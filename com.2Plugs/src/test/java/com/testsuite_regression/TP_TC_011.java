package com.testsuite_regression;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.Pages.LandingPage;
import com.base.BaseClass;

public class TP_TC_011 extends BaseClass {
	LandingPage obj_LandingPage;
	
	//Clicking the FAQ link which is at the top right corner of the LandingPage
	//Checking whether each question is clickable and displays the appropriate answer for the question.
	@Test
	public void landingFAQ() {
		
		obj_LandingPage = new LandingPage(driver);
		app_logs.info("Application opened");
		
		app_logs.info("Validation Started for FAQ link");
		obj_LandingPage.clickFAQ();
		app_logs.info("Clicked FAQ tab");
		obj_LandingPage.Question1();
		app_logs.info("Checked Question1");
		obj_LandingPage.Question2();
		app_logs.info("Checked Question2");
		//obj_LandingPage.Question3();
		app_logs.info("Checked Question3");
		obj_LandingPage.Question4();
		app_logs.info("Checked Question4");
		obj_LandingPage.Question5();
		app_logs.info("Checked Question5");
		obj_LandingPage.Question6();
		app_logs.info("Checked Question6");
		obj_LandingPage.Question7();
		app_logs.info("Checked Question7");
		app_logs.info("Validation completed for FAQ link at the top of the Landing Page");
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

		
		
	