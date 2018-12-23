//Checks whether a user can post a service with zero price

package com.testsuite_regression;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*; 
import org.testng.annotations.Test;

import com.Pages.CreateNewServicePage;
import com.Pages.HomePage;
import com.Pages.LandingPage;

import com.Pages.LoginPage;
import com.base.BaseClass;

public class TP_TC_087 extends BaseClass {

	LandingPage obj_LandingPage;
	LoginPage obj_LoginPage;
	HomePage obj_HomePage;
	CreateNewServicePage obj_CreateNewServicePage;

	//Creating a service with price = 0 eeds
	
	@Test(dataProvider = "LoginData")
	public void createService(String username, String password) throws InterruptedException {
		
		obj_LandingPage = new LandingPage(driver);
		obj_LandingPage.signin1();
		obj_LoginPage = new LoginPage(driver);
		Assert.assertTrue(obj_LoginPage.username1.isDisplayed());
		obj_LoginPage.login(username, password); //Login using data driven testing.
		obj_HomePage = new HomePage(driver);
		Assert.assertTrue(obj_HomePage.homeIcon.isDisplayed());
		obj_HomePage.createNewService();
		obj_HomePage.createNewServiceOption();
		String name = getRandomString(5);
		String description = getRandomString(29);
		obj_CreateNewServicePage = new CreateNewServicePage(driver);
		obj_CreateNewServicePage.title.sendKeys(name);	
		obj_CreateNewServicePage.description.sendKeys(description);
		obj_CreateNewServicePage.categorySelect();
		obj_CreateNewServicePage.accomodationSelect();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0, 200)");
		obj_CreateNewServicePage.subCategorySelect();
		obj_CreateNewServicePage.rentSelect();
		obj_CreateNewServicePage.price.sendKeys("0");
		obj_CreateNewServicePage.create.click();
		obj_CreateNewServicePage.editBtn();
		Assert.assertTrue(obj_CreateNewServicePage.title.isDisplayed());
		obj_CreateNewServicePage.save();  // teardown/deletion of the service
		obj_HomePage.dropdownforProfile();
		obj_HomePage.profile();
		obj_HomePage.deleteService();
		obj_HomePage.confirmDelete();
		
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
