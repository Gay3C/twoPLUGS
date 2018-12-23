package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BasePage;


public class CreateNewServicePage extends BasePage{

	public CreateNewServicePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="name")
	public WebElement title;
	@FindBy(id="description")
	public WebElement description;
	@FindBy(xpath = "/html//div[@id='category_id-styler']//div[@class='jq-selectbox__trigger-arrow']")
	public WebElement category;
	@FindBy(xpath = "//div[@id='category_id-styler']//ul/li[.='Accommodation & Travel']")
	public WebElement accomodation;
	@FindBy(xpath = "/html//div[@id='subcategory_id-styler']//div[@class='jq-selectbox__trigger-arrow']")
	public WebElement subCategory;
	@FindBy(xpath = "//div[@id='subcategory_id-styler']//ul/li[.='Rent']")
	public WebElement rent;
	@FindBy(id="price")
	public WebElement price;
	@FindBy(xpath = "//*[@id=\"imagegroup\"]/div[5]/ul/li[2]/button/span")
	public WebElement create;
	@FindBy(id="videourl")
	public WebElement videoURL;
	@FindBy(xpath = "/html/body/div[8]/section/div/div[2]/div[1]/div/div/div/a")
	public WebElement edit;
	@FindBy(xpath = "/html/body/div[7]/div[1]/form/div[4]/div[5]/ul/li[2]/button")
	public WebElement save;
	@FindBy(xpath = "//*[@id=\"purchase_service_form\"]/div/div/div/a/img")
	public WebElement youtubeIcon;
	@FindBy(xpath = "/html/body/div[7]/div[1]/form/div[3]/div[2]/label/span")
	public WebElement tooltip;
	
	public void categorySelect() {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(category));
		category.click();
	}
	
	public void subCategorySelect() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(subCategory));
		wait.until(ExpectedConditions.elementToBeClickable(subCategory));
		subCategory.click();
	}
	
	public void accomodationSelect() {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(accomodation));
		accomodation.click();
	}
	
	public void rentSelect() {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(rent));
		rent.click();
		// Actions actions = new Actions(driver);	
		//	 actions.moveToElement(rent).click().perform();
		//driver.switchTo().activeElement();			
	}	
		
	public void videoURL() {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(videoURL));
		videoURL.click();
		videoURL.sendKeys("https://www.youtube.com/watch?v=GrdwORRjoF0");

	}
	
	public void editBtn() {
		edit.click();
	}
	
	public void save() {
		save.click();
	}
	
}
	
