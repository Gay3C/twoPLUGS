package com.testsuite_regression;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.LandingPage;
import com.base.BaseClass;

public class TP_TC_012 extends BaseClass {
	LandingPage obj_LandingPage;
	
	//Validating the Footer links whether clicking on the link directs to the appropriate page.
	@Test
	public void LandingPageFooterLinks() {
		
		obj_LandingPage = new LandingPage(driver);
		app_logs.info("Validation started for Footer Links");
		
		obj_LandingPage.clicklnkabout();
		app_logs.info("ABOUT link clicked");
		obj_LandingPage.clicklnkeeds();
		app_logs.info("EEDS link clicked");
		obj_LandingPage.clicklnktrstsfty();
		app_logs.info("TRUST&SAFETY link clicked");
		obj_LandingPage.clicklnkfaq();
		app_logs.info("FAQ link clicked");
		obj_LandingPage.clicklnkhelp();
		app_logs.info("HELP link clicked");
		obj_LandingPage.clicklnkterms();
		app_logs.info("TERMS link clicked");
		obj_LandingPage.clicklnkprvcy();
		app_logs.info("PRIVACY link clicked");
		obj_LandingPage.clickbtnjnfrfree();
		app_logs.info("JOIN NOW FOR FREE button clicked");
		app_logs.info("Validation completed for ABOUT,EEDS,TRUST&SAFETY,FAQ,HELP,TERMS and PRIVACY links in the Footer");
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
