
package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.BasePage;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "signInEmail")
	public WebElement username1;
	@FindBy(id="signInPassword")
	public WebElement password1;
	@FindBy(xpath = "/html//form[@role='form']//ul[@class='line-btn']//a[@href='signup']/span[@class='help']")
	public WebElement signup1;

	@FindBy(id = "signUpUser")
	public WebElement username3;
	@FindBy(id = "signUpUser")
	public WebElement username4;
	@FindBy(xpath= "/html/body//form[@role='form']//ul[@class='line-btn']//button[@class='btn btn-success w-btn-success']")
	public WebElement clickLogin;

	@FindBy(xpath = "/html//nav[@role='navigation']//a[@href='/']/img[@alt='']")
	public WebElement  twoPlugsIcon;
					


	public void login(String username, String password) {
	username1.sendKeys(username);
	password1.sendKeys(password);
	clickLogin.click();
	}
	
	public void twoPlugs() {
		twoPlugsIcon.click();
	}
	
	public void signup1() {
		signup1.click();
	}
	
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[5]/ul/li[2]/button/span")
	WebElement btnLogIn;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[5]/ul/li[1]/a/span")
	WebElement btnSignIn;
	
	@FindBy(xpath="/html/body/div[7]/div/form/div[2]")
	WebElement exptText;
	
	
	public void clickButton()
	{
		btnLogIn.click();
	}

	public String getExpectedText()
	{
		return exptText.getText();
	}
	
}