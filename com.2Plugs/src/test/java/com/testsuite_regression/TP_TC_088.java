//The Application should be  open  the Tooltip that" Help link of Refund % " by the User move mouse on Refund %  "?"  and by remove curser from the icon it has to be disappear


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

public class TP_TC_088 extends BaseClass{
	
	LandingPage obj_LandingPage;
	LoginPage obj_LoginPage;
	HomePage obj_HomePage;
	CreateNewServicePage obj_CreateNewServicePage;
	
//Creating a need and then taking the mouse on refund% to check for the tooltip.
	@Test(dataProvider = "LoginData")
	public void deleteURL(String username, String password) throws InterruptedException {
		
		obj_LandingPage = new LandingPage(driver);
		obj_LandingPage.signin1();
		obj_LoginPage = new LoginPage(driver);
		Assert.assertTrue(obj_LoginPage.username1.isDisplayed());
		obj_LoginPage.login(username, password); //Login using data driven testing.
		obj_HomePage = new HomePage(driver);
		Assert.assertTrue(obj_HomePage.homeIcon.isDisplayed());
		obj_HomePage.createNewService();
		obj_HomePage.createNewNeedOption();
		String name = getRandomString(8);
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
		obj_CreateNewServicePage.price.sendKeys("100");
		obj_CreateNewServicePage.create.click();
		obj_CreateNewServicePage.editBtn();
		Assert.assertTrue(obj_CreateNewServicePage.title.isDisplayed());
		js.executeScript("window.scrollBy(0, 200)");
		//Assert.assertFalse(obj_CreateNewServicePage.tooltip.isDisplayed());
		String tooltipText = obj_CreateNewServicePage.tooltip.getAttribute("title");
		Assert.assertEquals(tooltipText, "A percentage of the amount you want to receive when you ask for a refund");
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
