//Checks whether help pages are working correct



package com.testsuite_regression;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.HelpPage;
import com.Pages.HomePage;
import com.Pages.LandingPage;
import com.Pages.LoginPage;
import com.base.BaseClass;

public class TP_TC_083 extends BaseClass{
	
	LandingPage obj_LandingPage;
	LoginPage obj_LoginPage;
	HomePage obj_HomePage;
	HelpPage obj_HelpPage;
	
	// Help pages are displaying  when user clicks on help link

	@Test(dataProvider = "LoginData")
	public void deleteURL() throws InterruptedException {
		
		obj_LandingPage = new LandingPage(driver);
		obj_LandingPage.signin1();
		obj_LoginPage = new LoginPage(driver);

		app_logs.info("Login Clicked");
		obj_LoginPage.login("virat", "test2plug");
		app_logs.info("Logged In");
	
		
		Assert.assertTrue(obj_LoginPage.username1.isDisplayed());
		obj_HomePage = new HomePage(driver);
		Assert.assertTrue(obj_HomePage.homeIcon.isDisplayed());
		obj_HomePage.dropdownforProfile();
		obj_HomePage.help();
		obj_HelpPage = new HelpPage(driver);
		Assert.assertTrue(obj_HelpPage.title.isDisplayed());	
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
