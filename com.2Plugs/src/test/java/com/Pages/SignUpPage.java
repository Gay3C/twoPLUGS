package com.Pages;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import com.base.BasePage;

public class SignUpPage extends BasePage {

	public SignUpPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="/html[1]/body[1]/div[7]/div[1]/div[1]/form[1]/div[2]/div[1]/a[1]")
	public WebElement btnfacebook;
	@FindBy(id="signUpUser") 
	public WebElement Username;
	@FindBy(id="signUpEmail")
	public WebElement Email;
	@FindBy(id="signUpPassword")
	public WebElement password;
	@FindBy(xpath="/html[1]/body[1]/div[7]/div[1]/div[1]/form[1]/div[2]/div[5]/button[1]/span[1]")
	public WebElement btnSignUp;
	@FindBy(xpath="/html[1]/body[1]/div[7]/div[1]/font[1]")
	public WebElement emailsendmsg;
	@FindBy(xpath="/html[1]/body[1]/div[7]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/p[1]")
	public WebElement pwdmsg;
	@FindBy(xpath="/html[1]/body[1]/div[7]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/p[1]")
	public WebElement invalidUsernamemsg;
	@FindBy(xpath="/html[1]/body[1]/div[7]/div[1]/font[1]")
	public WebElement activatemsg;
	@FindBy(xpath="/html[1]/body[1]/div[7]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/p[1]")
	public WebElement blankpassmsg;
	@FindBy(xpath="/html[1]/body[1]/div[7]/div[1]/div[1]/form[1]/div[2]/div[4]/div[1]/p[1]")
	public WebElement invalidformatpassmsg;
	
	

    public void facebooksignup() {
    	btnfacebook.click();
    	String expected_url="https://www.facebook.com/login.php?skip_api_login=1&api_key=1001632459920368&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fv2.8%2Fdialog%2Foauth%3Fredirect_uri%3Dhttps%253A%252F%252Fqatest.twoplugs.com%252Flogin%252Ffb%252Fcallback%26state%3D760943c5b16618cfd4019f236fb4f9e2%26scope%3Duser_birthday%252Cemail%26client_id%3D1001632459920368%26ret%3Dlogin%26sdk%3Dphp-sdk-4.0.23%26logger_id%3D822f8590-2838-c3c0-8f6d-5c7250413f2a&cancel_url=https%3A%2F%2Fqatest.twoplugs.com%2Flogin%2Ffb%2Fcallback%3Ferror%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%26state%3D760943c5b16618cfd4019f236fb4f9e2%23_%3D_&display=page&locale=en_US&logger_id=822f8590-2838-c3c0-8f6d-5c7250413f2a";
    	Assert.assertEquals(driver.getCurrentUrl(), expected_url);
    	driver.navigate().back();
    	
    }
	
    public void signup(String username,String email, String pwd) {
    	
	Username.sendKeys(username);
	Email.sendKeys(email);
	password.sendKeys(pwd);
	btnSignUp.click();	


      for(String Handle1:driver.getWindowHandles()) {
	        driver.switchTo().window(Handle1);
      }
          String expected_msg="Your account has been created. Check your email for instructions on how to activate your account.\r\n" + 
		  "Ensure to check your junk or spam folder as emails sometimes end up there. Flag the email as \"not spam\" to allow you click on the activation link.";
          
          Assert.assertEquals(emailsendmsg.getText(), expected_msg);
    }
    
    
    
    public void  isValidEmailAddress(String email) {
    	   boolean result = true;
    	   try {
    	      InternetAddress emailAddress = new InternetAddress(email);
    	      emailAddress.validate();
    	   } catch (AddressException ex) {
    	      result = false;
    	   }
    	   Assert.assertEquals(result,true);
    	}
    
    public void invalidUserName(String username,String email,String pwd) {
    	
    	Username.sendKeys(username);
    	Email.sendKeys(email);
    	password.sendKeys(pwd);
    	btnSignUp.click();	
    	
    	Assert.assertEquals(invalidUsernamemsg.getText(),"Username cannot contain special characters");
    	
    }
    
    public void  isinValidEmailAddress(String email) {
 	   boolean result = true;
 	   try {
 	      InternetAddress emailAddress = new InternetAddress(email);
 	      emailAddress.validate();
 	   } catch (AddressException ex) {
 	      result = false;
 	   }
 	   Assert.assertEquals(result,false);
 	}
    
    public void validpwd(String username,String email,String pwd) {
    	
    	Username.sendKeys(username);
    	Email.sendKeys(email);
    	password.sendKeys(pwd);
    	btnSignUp.click();	
    	
    	Assert.assertEquals(activatemsg.getText(), "Your account has been created. Check your email for instructions on how to activate your account.\r\n" +
    	"Ensure to check your junk or spam folder as emails sometimes end up there. Flag the email as \"not spam\" to allow you click on the activation link.");
    	
    }
    
    public void blankpwd(String username,String email,String pwd) {
    	
    	Username.sendKeys(username);
    	Email.sendKeys(email);
    	password.sendKeys(pwd);
    	btnSignUp.click();	
    	
    	Assert.assertEquals(blankpassmsg.getText(),"The password field is required.");
    	
    	
    }
    
    public void invalidpwdformat(String username,String email,String pwd) {
    	
    	Username.sendKeys(username);
    	Email.sendKeys(email);
    	password.sendKeys(pwd);
    	btnSignUp.click();	
    	
    	Assert.assertEquals(invalidformatpassmsg.getText(),"The password format is invalid, it must contain a min of 8 characters with at least one letter and one number.");
    	
    }
    
}