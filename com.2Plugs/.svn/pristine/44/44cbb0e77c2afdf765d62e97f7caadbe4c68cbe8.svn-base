
package com.Pages;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html/body//h2/span[@class='help']")
	public WebElement homeIcon;
	@FindBy(xpath = "/html/body//nav[@role='navigation']//a[@href='/home']")
	public WebElement twoPlugsIcon;				
	@FindBy(xpath = "/html/body/div[7]/nav/div/div[2]/ul/li[2]/a")
	public WebElement transactionsBtn;
	@FindBy(xpath = "/html/body/div[7]/nav/div/form/div[2]")
	public WebElement createNewServiceBtn;
	@FindBy(xpath = "/html//nav[@role='navigation']//form[@action='/newsearchserviceneed']//ul//a[@href='/addservices/1']")
	public WebElement createNewServiceOption;
	@FindBy(xpath = "/html/body/div[*]/nav/div/div[2]/ul/li[4]/a/span[3]")
	public WebElement dropdownforProfile;
	@FindBy(xpath = "/html//nav[@role='navigation']//ul[@class='nav navbar-nav']/li[4]/ul//a[@href='/profile/Nora']/span[@class='help']")
	public WebElement profile;
	@FindBy(xpath = "/html//div[@class='wrapper']/div[@class='container']/div[2]/div[2]//table//a[@href='/service/5302']")
	public WebElement dummyService;
	@FindBy(xpath = "/html/body/div[7]/section/div/div[2]/div[1]/div/div/div/a")
	public WebElement editService;
	@FindBy(xpath= "/html//div[@class='wrapper']/div[@class='container']/div[2]/div[1]//table//a[@href='/service/5364']")
	public WebElement dummyNeed;
	@FindBy(xpath = "/html/body/div[@class='wrapper']/section/div[@class='container']//a[@href='/editService/5364/type/0']")
	public WebElement editNeed;
	@FindBy(xpath = "/html//nav[@role='navigation']//ul[@class='nav navbar-nav']/li[4]/ul//a[@href='/help']/span[@class='help']")
	public WebElement help;
	@FindBy(xpath = "/html//nav[@role='navigation']//form[@action='/newsearchserviceneed']//ul//a[@href='/addservices/0']")
	public WebElement createNewNeedOption;
	@FindBy(xpath = "/html//nav[@role='navigation']//ul[@class='nav navbar-nav']//a[@href='/newplug']/span[@class='help']")
	public WebElement plugsIcon;
	@FindBy(xpath = "/html/body/div[7]/div[4]/div[1]/div[1]/div/div[1]/div/a[2]")
	public WebElement editProfile;
	@FindBy(xpath = "/html/body/div[8]/section/div[1]/div/div[1]/img")
	public WebElement avatar;
	@FindBy(xpath = "/html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[3]/a/span[2]")
	public WebElement signOut;
	@FindBy(xpath = "/html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[2]/a/span[2]")
	public WebElement settings;
	@FindBy(xpath = "/html[1]/body[1]/div[7]/div[4]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/ul[1]/li[2]/a[1]")
	public WebElement deleteNeed;
	@FindBy(xpath = "/html[1]/body[1]/div[7]/div[4]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/ul[1]/li[2]/a[1]")
	public WebElement deleteService;
	@FindBy(xpath = "//*[@id=\"btn_deleteService\"]/span")
	public WebElement confirmDelete;
	
	public void twoplugs() {
		twoPlugsIcon.click();
	}
	
	public void transactions() {
		transactionsBtn.click();
	}
	
	public void createNewService() {
		createNewServiceBtn.click(); 
	}
	
	public void createNewServiceOption() {
		createNewServiceOption.click(); 
	}
	
	public void createNewNeedOption() {
		createNewNeedOption.click();
	}
	
	public void dropdownforProfile() {
		Actions action = new Actions(driver);
		action.moveToElement(dropdownforProfile).build().perform();	
	}
	
	public void profile() {
		profile.click();
	}
	
	public void dummyservice() {
		dummyService.click();
	}
	
	public void editService() {
		editService.click();
	}
	
	public void dummyNeed() {
		dummyNeed.click();
	}
	
	public void editNeed() {
		editNeed.click();
	}
	
	public void help() {
		help.click();
	}
	
	public void plugsIcon() {
		plugsIcon.click();
	}
	
	public void editProfile() {
		editProfile.click();
	}
	
	public void signOut() {
		signOut.click();
	}
	
	public void deleteNeed() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(deleteNeed));
		wait.until(ExpectedConditions.elementToBeClickable(deleteNeed));
		deleteNeed.click();
	}
	
	public void deleteService() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(deleteService));
		wait.until(ExpectedConditions.elementToBeClickable(deleteService));
		deleteService.click();
	}
	
	public void confirmDelete() {
//		Actions action = new Actions(driver);
//		action.moveToElement(confirmDelete).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(confirmDelete));
		wait.until(ExpectedConditions.elementToBeClickable(confirmDelete));
		confirmDelete.click();
	}
	
	
@FindBy(xpath = "/html/body/div[@class='wrapper']/div[@class='container']//a[@href='/pendingTransactions']")

public WebElement btnPendingTransaction_More;

@FindBy(xpath = "/html/body/div[@class='wrapper']/div[@class='container']//a[@href='/followUpdates']")
public WebElement btnLiveUpdateFrmUser_More;

@FindBy(xpath = "/html/body/div[@class='wrapper']/div[@class='container']//a[@href='/networkUpdates']")
public WebElement btnLiveUpdateInNetwork_More;

@FindBy(xpath = "/html/body/div[@class='wrapper']/div[@class='container']/div[1]/div[1]/div[1]/div[@class='caption']/div")
public WebElement lblPendingTransactions;

@FindBy(xpath = "/html/body/div[@class='wrapper']/div[@class='container']/div[1]/div[1]/div[2]/div[@class='caption']/div")
public WebElement lblUpdateFromUser;

@FindBy(xpath = "/html/body/div[@class='wrapper']/div[@class='container']/div[1]/div[2]/div[@class='box theme-3']/div[@class='caption']/div")
public WebElement lblUpdateFromNetwork;

@FindBy(xpath ="/html/body//h2/a[@href='/home']/span[@class='help']")
public WebElement btnHome;

@FindBy(xpath ="/html/body/div[@class='wrapper']/div[@class='container']/div[2]/div[1]/div[@class='box theme-3']/div[@class='caption']/div[.='Top 5 Services in Network']")
public WebElement lblTop5Services;

@FindBy(xpath ="/html/body/div[@class='wrapper']/div[@class='container']/div[2]/div[2]/div[@class='box theme-3']/div[@class='caption']/div[.='Top 5 Traders in network']")
public WebElement lblTop5Network;

@FindBy(xpath = "/html//div[@class='wrapper']/div[@class='container']/div/div/div/div[2]/div[1]/table/tbody")
public WebElement tblRowCountPendingTrans;

@FindBy(xpath = "/html/body/div[@class='wrapper']/div[@class='container']//table[@class='table-Colorful']/tbody")
public WebElement tblRowCountLiveUpdtUser;

@FindBy(xpath = "/html/body/div[@class='wrapper']/div[@class='container']//table[@class='table-Colorful']/tbody")
public WebElement tblRowCountLiveUpdtNtwk;

@FindBy(xpath = "/html/body/div[@class='wrapper']/div[@class='container']/div[2]/div[1]/div[@class='box theme-3']/table[@class='table-Colorful']/tbody")
public WebElement tblSortTop5Services;

@FindBy(xpath = "/html/body/div[@class='wrapper']/div[@class='container']/div[2]/div[2]/div[@class='box theme-3']/table[@class='table-Colorful']/tbody")
public WebElement tblSortTop5Traders;

//@FindBy(xpath = "/html//nav[@role='navigation']//form[@action='/newsearchserviceneed']//span[@class='w-icons-caret']")
//public WebElement drpDwnCreateNewService;
//				//html//nav[@role='navigation']//form[@action='/newsearchserviceneed']//ul//a[@href='/addservices/1']
//
//@FindBy(xpath = "/html//nav[@role='navigation']//form[@action='/newsearchserviceneed']//ul//a[@href='/addservices/1']")
//public WebElement OptCreateNewService;

public void PendingTransaction_More()//To calculate no of rows in pending transaction
{
	btnPendingTransaction_More.click();
	//btnHome.click();
	List<WebElement>TotalRowsList = tblRowCountPendingTrans.findElements(By.tagName("tr"));
	System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
}
public void LiveUpdatesFrmUsers_More()//To calculate no of rows in live update from user
{
	btnLiveUpdateFrmUser_More.click();
	List<WebElement>TotalRowsList = tblRowCountLiveUpdtUser.findElements(By.tagName("tr"));
	System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
	//btnHome.click();	
}
public void LiveUpdatesInNetwork_More()//To calculate no of rows in live update in network 
{
	btnLiveUpdateInNetwork_More.click();
	List<WebElement>TotalRowsList = tblRowCountLiveUpdtNtwk.findElements(By.tagName("tr"));
	System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
	//btnHome.click();	
}

public void Top5SrvcesInNtwk()//To check top 5 Services is sorted
{
	//List<String> all_elements_text=new ArrayList<>();
	ArrayList<String> obtainedList = new ArrayList<String>(); 
	List<WebElement>TotalRowsList =tblSortTop5Services.findElements(By.tagName("tr"));
	System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
	
	for(WebElement we:TotalRowsList){
		   obtainedList.add(we.getText());
		}
		ArrayList<String> sortedList = new ArrayList<String>();   
		for(String s:obtainedList){
		sortedList.add(s);
		}
		//Collections.sort(sortedList);
		// Collections.reverse(sortedList);
		System.out.println(sortedList);
		Assert.assertTrue(sortedList.equals(obtainedList));
    }

public void Top5TradersInNtwk()//To check top 5 Traders is sorted
{
	//List<String> all_elements_text=new ArrayList<>();
	ArrayList<String> obtainedList = new ArrayList<String>(); 
	List<WebElement>TotalRowsList =tblSortTop5Traders.findElements(By.tagName("tr"));
	System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());
	
	for(WebElement we:TotalRowsList){
		   obtainedList.add(we.getText());
		}
		ArrayList<String> sortedList = new ArrayList<String>();   
		for(String s:obtainedList){
		sortedList.add(s);
		}
		//Collections.sort(sortedList);
		// Collections.reverse(sortedList);
		System.out.println(sortedList);
		Assert.assertTrue(sortedList.equals(obtainedList));
    }

@FindBy(xpath="/html/body/div[7]/nav/div/form/div[1]/div/button/span")
WebElement txtSearchBox;

@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[1]/a/span[2]")
WebElement menuPlugs;

@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[3]/a/span[2]")
WebElement menuMessage;

@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[2]/a/span[2]")
WebElement menuTransaction;

@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[3]/a/span[1]")
WebElement menuMessageCount;

//html/body/div[7]/nav/div/div[2]/ul/li[4]/a/span[2]
@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[4]/a/span[2]")
WebElement menuTitle;

@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[1]/a/span[2]")
WebElement menuProfile;

@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[2]/a/span[2]")
WebElement menuSetting;

@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[4]/a/span[2]")
WebElement menuHelp;

@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[3]/a/span[2]")
WebElement menuLogout;


public void clickOnsearchIcon()
{
	txtSearchBox.click();
}

public String getTwoPlugsColorB()
{
	return menuPlugs.getCssValue("color");
}

public String getTwoPlugsColorA()
{
	Actions act = new Actions(driver);
	act.moveToElement(menuPlugs).build().perform();
	return menuPlugs.getCssValue("color");
}

public String getTransactionColor()
{
	Actions act = new Actions(driver);
	act.moveToElement(menuTransaction).build().perform();
	return menuTransaction.getCssValue("color");
}

public String getMessageColor()
{
	Actions act = new Actions(driver);
	act.moveToElement(menuMessage).build().perform();
	return menuMessage.getCssValue("color");
}

public String getTitleColor()
{
	Actions act = new Actions(driver);
	act.moveToElement(menuTitle).build().perform();
	return menuTitle.getCssValue("color");
}

public void clickOnMessage() 
{
	menuMessage.click();
}

public void clickOnTraction()
{
	menuTransaction.click();
}

public void getMenuMesgCount( )
{
	menuMessageCount.getText();
}

public void mouseHoverMenu()
{
	Actions action = new Actions(driver);
	action.moveToElement(menuTitle).perform();
}

public void mouseHoverProfile()
{
	Actions action = new Actions(driver);
	action.moveToElement(menuTitle).moveToElement(menuProfile).click().build().perform();
}

public void clickOnLogout()
{
	Actions action = new Actions(driver);
	action.moveToElement(menuTitle).moveToElement(menuProfile).moveToElement(menuSetting).moveToElement(menuLogout).click().build().perform();
}
	
	
}

