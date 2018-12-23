package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DeclinePage {
	
	public WebDriver ldriver;
	public WebDriver driver;
	
	public  DeclinePage(WebDriver rdriver)
	{ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"message_confirm_button\"]/div/a[1]")
	WebElement DeclineBtn;
	@FindBy(linkText="Bid Canceled")
	WebElement BidCanceled;
	@FindBy(xpath="/html/body/div[8]/nav/div/div[2]/ul/li[3]/a/span[1]/span/span")
	WebElement MessageBtn;
	public void click_Message()
	{MessageBtn.click();}
	@FindBy(xpath="//*[@id=\'delete_form\']/section/div/div/aside/ul/li[2]/a/span")
	WebElement Unread;
	@FindBy(xpath="//*[@id=\"inbox\"]/div[1]/h4")
	WebElement Bid_Cancelled_Message;
	@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[4]/a/span[2]")
	WebElement SignOutSeller;
	@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[4]/ul/li[3]/a")
	WebElement BtnSellerSignOut;
	@FindBy(xpath="/html/body/div[7]/nav/div/div[2]/ul/li[3]/a/span[2]")
	WebElement BuyerMessage;
	@FindBy(xpath="//*[@id=\'inbox\']/div[1]/h4")
	WebElement Confirm_Buyer_Msg;
	@FindBy(xpath="//*[@id=\"dismiss\"]/div/div")
	WebElement Alert_Bid_Cancelled_Message_Seller;
	
	
	
	public void Buyer_Message()
	{BuyerMessage.click();
	Unread.click();
	BidCanceled.click();}
	
	
	
	public void Buyer_Confirm()
	{
		Assert.assertTrue(Confirm_Buyer_Msg.getText().equals("Bid Canceled"));
		
	}
	
	
	
	public void click_Seller()
	{SignOutSeller.click();
	BtnSellerSignOut.click();
	}
	
	
	
	public void click_Unread_Msg()
	{Unread.click();	}

	
	public void click_Decline_Btn()
	{DeclineBtn.click();}
	
	public void click_Bid_Cancel()
	{BidCanceled.click();}
	
	
	public void Decline_Msg()
	{
		Assert.assertTrue(Bid_Cancelled_Message.getText().equals("Bid Canceled"));		
		
	}
	
	
	//TP_TC_129  This method is used for get confirm text for decline Bid.
	public String getAlertTestDeclineBid()
	{
		String msg=Alert_Bid_Cancelled_Message_Seller.getText();
		return msg;
	}
	
	
	
	
	
	
	
	
	
	
	

}
