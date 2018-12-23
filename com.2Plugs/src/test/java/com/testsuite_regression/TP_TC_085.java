//Checks whether need title is accepting max 50 chars and
//Checks whether need description is accepting max 256 chars


package com.testsuite_regression;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.CreateNewServicePage;
import com.Pages.HomePage;
import com.Pages.LandingPage;
import com.Pages.LoginPage;
import com.base.BaseClass;

public class TP_TC_085 extends BaseClass{
	
	LandingPage obj_LandingPage;
	LoginPage obj_LoginPage;
	HomePage obj_HomePage;
	CreateNewServicePage obj_CreateNewServicePage;
	
//Creating a need and then checking the length of it's title and description.
	@Test(dataProvider = "LoginData")
	public void createNeed(String username, String password) throws InterruptedException {
		
		obj_LandingPage = new LandingPage(driver);
		obj_LandingPage.signin1();
		obj_LoginPage = new LoginPage(driver);
		Assert.assertTrue(obj_LoginPage.username1.isDisplayed());
		obj_LoginPage.login(username, password); //Login using data driven testing.
		obj_HomePage = new HomePage(driver);
		Assert.assertTrue(obj_HomePage.homeIcon.isDisplayed());
		obj_HomePage.createNewService();
		obj_HomePage.createNewNeedOption();
		String name = getRandomString(52);
		String description = getRandomString(259);
		obj_CreateNewServicePage = new CreateNewServicePage(driver);
		obj_CreateNewServicePage.title.sendKeys(name);	
		obj_CreateNewServicePage.description.sendKeys(description);
		obj_CreateNewServicePage.categorySelect();
		obj_CreateNewServicePage.accomodationSelect();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0, 200)");
		obj_CreateNewServicePage.subCategorySelect();
		obj_CreateNewServicePage.rentSelect();
		obj_CreateNewServicePage.price.sendKeys("100");
		obj_CreateNewServicePage.create.click();
		obj_CreateNewServicePage.editBtn();
		Assert.assertTrue(obj_CreateNewServicePage.title.isDisplayed());
		String text = obj_CreateNewServicePage.title.getAttribute("textContent");
		String text1 = obj_CreateNewServicePage.title.getText();
		String text2 = obj_CreateNewServicePage.description.getAttribute("textContent");
		String text3 = obj_CreateNewServicePage.description.getText();
		int size = obj_CreateNewServicePage.description.getText().length();
		System.out.println("text is :" +text);
		System.out.println("text is :" +text1);
		System.out.println("text is :" +text2);
		System.out.println("text is :" +text3);
		Assert.assertEquals(size, 256);
//	}
//
//	
//	@Test()
//	public void deleteNeed() throws InterruptedException {
		obj_CreateNewServicePage = new CreateNewServicePage(driver);
		obj_CreateNewServicePage.save();
		obj_HomePage.dropdownforProfile();
		obj_HomePage.profile();
		obj_HomePage.deleteNeed();
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
