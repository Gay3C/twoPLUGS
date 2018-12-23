
package com.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.base.BasePage;

public class LandingPage extends BasePage {

	public LandingPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="/html/body/div/header/div/nav/ul/li[4]/a") //Added xpath for FAQ link which is at the top right corner of the landingpage.
	public WebElement FAQlnk;
	@FindBy(xpath="/html[1]/body[1]/div[1]/header[1]/div[1]/ul[1]/li[2]/a[1]/span[1]")//Added xpath for joinforfree button in the header
	public WebElement btnjoinheader;
	@FindBy(xpath = "/html/body[@class='main-template']//header/div[@class='container']/ul[@class='control-bar']//a[@href='/login']/span[@class='help']")
	public WebElement loginbtn1;
	@FindBy(xpath = "/html/body/div/header/div/ul/li[2]/a")
	public WebElement loginbtn2;
	@FindBy(xpath = "/html//ul[@id='delicious-slider']/li[@class='rslides2_on']//a[@href='/signup']/span[@class='help']")
	public WebElement loginbtn3;
	@FindBy(xpath = "/html/body[@class='main-template']//div[@class='copy-info']/a[@href='/signup']/span[@class='help']")
	public WebElement loginbtn4;
	@FindBy(xpath = "/html/body/div/header/div/nav/ul/li[2]")
	public WebElement livePosting;
	@FindBy(xpath = "/html/body[@class='main-template']//nav[@class='nav navbar-nav']/ul//a[@href='/contactus']")
	public WebElement contact;
	@FindBy(xpath ="//*[@id=\"comment-thumbs\"]/li[1]/a/img")
	public WebElement testimonial1;
	@FindBy(xpath = "//ul[@id='comment-thumbs']/li[@class='rslides1_s2']/a[@href='#']/img[@alt='']")
	public WebElement testimonial2;
	@FindBy(xpath = "//ul[@id='comment-thumbs']/li[@class='rslides1_s3']/a[@href='#']/img[@alt='']")
	public WebElement testimonial3;
	@FindBy (xpath = "//ul[@id='slider-comment']/li[@class='rslides1_on']/div[@class='name']")
	public WebElement name1;
	@FindBy (xpath = "//ul[@id='slider-comment']/li[@class='rslides1_on']//span[.=', accountant']")
	public WebElement name2;
	@FindBy (xpath = "//ul[@id='slider-comment']/li[@class='rslides1_on']//span[.=', student']")
	public WebElement name3;
	@FindBy(xpath = "/html/body[@class='main-template']//section[@class='section-1']//a[@href='http://www.youtube.com/watch?v=GrdwORRjoF0']")
	public WebElement video;
	@FindBy(xpath = "//body[@class='main-template']/div[2]/div//a[@title='Close']")
	public WebElement closeVideo;
	@FindBy(xpath = "//a[@href='https://www.youtube.com/watch?v=GrdwORRjoF0']")
	public WebElement youtube;
	
	//Question1:What do I need to sign up? 
		@FindBy(xpath="//*[@id=\"Zebra_Accordion\"]/dt[1]/span")
		@CacheLookup
		WebElement Qn1;
		
		//Question2:What is eeds?
		@FindBy(xpath="//*[@id=\"Zebra_Accordion\"]/dt[2]/span")
		@CacheLookup
		WebElement Qn2;
		
		//Question3:How much should I sell my service (skill)?
		@FindBy(xpath="//*[@id=\"Zebra_Accordion\"]/dt[3]/span")
		@CacheLookup
		WebElement Qn3;
		
		//Question4:How do I trust a Seller?
		@FindBy(xpath="/html[1]/body[1]/div[1]/section[7]/div[1]/dl[1]/dt[4]/span[1]")
		@CacheLookup
		WebElement Qn4;
		
		//Question5:What kind of service (skill) can I sell?
		@FindBy(xpath="/html[1]/body[1]/div[1]/section[7]/div[1]/dl[1]/dt[5]/span[1]")
		@CacheLookup
		WebElement Qn5;
		
		//Question6:Can I use twoPLUGS?
		@FindBy(xpath="//*[@id=\"Zebra_Accordion\"]/dt[6]/span")
		@CacheLookup
		WebElement Qn6;
		
		//Question7:How do I trust a Buyer to pay me?
		@FindBy(xpath="//*[@id=\"Zebra_Accordion\"]/dt[7]/span")
		@CacheLookup
		WebElement Qn7;
		
		//Assigned text of each question to a WebElement
		@FindBy(xpath="//*[@id=\"Zebra_Accordion\"]/dd[1]/p") WebElement Qn1text;
		@FindBy(xpath="//*[@id=\"Zebra_Accordion\"]/dd[2]/p") WebElement Qn2text;
		@FindBy(xpath="//*[@id=\"Zebra_Accordion\"]/dd[3]/p") WebElement Qn3text;
		@FindBy(xpath="//*[@id=\"Zebra_Accordion\"]/dd[4]/p") WebElement Qn4text;
		@FindBy(xpath="//*[@id=\"Zebra_Accordion\"]/dd[5]/p") WebElement Qn5text;
		@FindBy(xpath="//*[@id=\"Zebra_Accordion\"]/dd[6]/p") WebElement Qn6text;
		@FindBy(xpath="//*[@id=\"Zebra_Accordion\"]/dd[7]/p") WebElement Qn7text;
		
		//Clicking the FAQ tab in the LandingPage
		public void clickFAQ() {
			FAQlnk.click();
		}
		
		//Checking whether each question is clickable and displays the appropriate answer for the question.
		public void Question1() {
			Qn1.click();
			String Ques1="You need a facebook account or a valid email address to sign up.";
			Assert.assertTrue(Qn1.isDisplayed());

			Assert.assertEquals(Qn1text.getText(),Ques1);
		}
		
		public void Question2() {
			Qn2.click();
			String Ques2="eeds is an international barter currency developed by twoPLUGS. A first of its kind, eeds is what you receive when you sell your services (skills). Use your eeds to buy a service you need or simply send to a family or friend in need. eeds allows you to spend less and save more of your money.";
			Assert.assertTrue(Qn2.isDisplayed());
			Assert.assertEquals(Qn2text.getText(),Ques2);
			
		}
		
	public void Question3() {
			
			Qn3.click();
			String Ques3="The prices of services will be gradually determined by buyers and sellers. 1eed is valued at $1, so sell your services at a similar price. For example if a service is $20, charge 20 eeds. Read about eeds and international trading.";
			Assert.assertTrue(Qn3.isDisplayed());
			Assert.assertEquals(Qn3text.getText(),Ques3);
			
		}

	public void Question4() {
		
		Qn4.click();
		String Ques4="Before buying a service from a seller, make sure to read reviews from past buyers. Check out the seller experience ranking, the ratings of the service and the number of sold services. Ensure you agree with the payment type and refund policy before agreeing to buy a service.";
		Assert.assertTrue(Qn4.isDisplayed());
		Assert.assertEquals(Qn4text.getText(),Ques4);
	}

	public void Question5() {
		
		Qn5.click();
		String Ques5="You can sell any kind of service. There are several service categories to choose from. Ensure to list your service in the right category.";
		Assert.assertTrue(Qn5.isDisplayed());
		Assert.assertEquals(Qn5text.getText(),Ques5);
	}

	public void Question6() {
		
		Qn6.click();
		String Ques6="twoPLUGS is currently only available in US and Canada. An international version will be released soon.";
		Assert.assertTrue(Qn6.isDisplayed());
		Assert.assertEquals(Qn6text.getText(),Ques6);
	}

	public void Question7() {
		
		Qn7.click();
		String Ques7="We prevent buyers from buying a service they cannot afford. We do this by comparing the account balance of the buyer to the price of the service they want to purchase. All purchases use a payment type of \"twoplugs\", where the buyer pays full amount to twoplugs, and twoplugs pays you after the buyer confirms delivery of service.";
		Assert.assertTrue(Qn7.isDisplayed());
		Assert.assertEquals(Qn7text.getText(),Ques7);
	}
		
	public void joinfrfreeheader() {
		btnjoinheader.click();
	}
	
	public void signin1() {
		loginbtn1.click();
	}
	
	public void signin2() {
		loginbtn2.click();
	}
	
	public void signin3() {
		loginbtn3.click();
	}
	
	public void signin4() {
		loginbtn4.click();
	}
	
	public void livePostingBtn() {
		livePosting.click();
	}
	
	public void contactBtn() {
		contact.click();
	}
	
	public void testimonial1click() {
		testimonial1.click();
	}
	
	public void testimonial2click() {
		testimonial2.click();
	}
	
	public void testimonial3click() {
		testimonial3.click();
	}
	
	public void videoLink() {
		video.click();
	}
	
	
	@FindBy(xpath="/html/body[@class='main-template']//div[@class='contact-info']/ul//a[@href='https://www.facebook.com/twoplugsinc']")
	@CacheLookup
	WebElement btnfb;
	
	@FindBy(xpath="/html/body[@class='main-template']//div[@class='contact-info']/ul//a[@href='https://twitter.com/twoplugsinc']")
	@CacheLookup
	WebElement btntwtr;

	@FindBy(xpath="/html/body[@class='main-template']//div[@class='contact-info']/ul//a[@href='https://instagram.com/twoplugs']")
	@CacheLookup
	WebElement btninsta;
	
	@FindBy(xpath="//html/body/div[1]/div[3]/div[1]/div/div/div[2]/div[2]/div/div[1]/div/div/div/div[1]/div/div[1]")
    @CacheLookup
	public
	WebElement txtfb;
	
	@FindBy(xpath="//*[@id='global-nav-home']/a/span[2]")
	@CacheLookup
	public
	WebElement txttwtr;
	
	@FindBy(xpath="//*[@id='react-root']/section/main/div/header/section/div[1]/h1")
	@CacheLookup
	public
	WebElement txtinsta;
	
	
	public void clickfb() throws InterruptedException
	{
		String ParentWindow=driver.getWindowHandle();
		btnfb.click();
		Thread.sleep(5000);
		//Using windowHandle to access the new window
		for(String currWindow :driver.getWindowHandles()) {
			
			driver.switchTo().window(currWindow);
			
			}
		Thread.sleep(5000);
		
		String expected_url="https://www.facebook.com/twoplugsinc";
		Assert.assertEquals(driver.getCurrentUrl(), expected_url);
		driver.switchTo().window(ParentWindow);
	}
	public void clicktwtr() throws InterruptedException
	{
		String ParentWindow=driver.getWindowHandle();
		btntwtr.click();
		Thread.sleep(5000);
        for(String currWindow :driver.getWindowHandles()) {
			
			driver.switchTo().window(currWindow);
			
			}
		Thread.sleep(5000);
		
		String expected_url="https://twitter.com/twoplugsinc";
		Assert.assertEquals(driver.getCurrentUrl(), expected_url);
		
		driver.switchTo().window(ParentWindow);
	}
	public void clickinsta() throws InterruptedException
	{
		String ParentWindow=driver.getWindowHandle();
		btninsta.click();
		Thread.sleep(5000);
        for(String currWindow :driver.getWindowHandles()) {
			
			driver.switchTo().window(currWindow);
			
			}
        Thread.sleep(5000);
        
        String expected_url="https://www.instagram.com/twoplugs/";
		Assert.assertEquals(driver.getCurrentUrl(), expected_url);
		
		driver.switchTo().window(ParentWindow);
	}
	
	@FindBy(xpath="/html/body/footer/div/div[3]/ul/li[1]/a")
	@CacheLookup
	WebElement lnkabout;
	
	@FindBy(xpath="/html/body/footer/div/div[3]/ul/li[2]/a")
	@CacheLookup
	WebElement lnkeeds;
	
	@FindBy(xpath="/html/body/footer/div/div[3]/ul/li[3]/a")
	@CacheLookup
	WebElement lnktrstsfty;
	
	@FindBy(xpath="/html/body/footer/div/div[3]/ul/li[4]/a")
	@CacheLookup
	WebElement lnkfaq;
	
	@FindBy(xpath="/html/body/footer/div/div[3]/ul/li[5]/a")
	@CacheLookup
	WebElement lnkhelp;
	
	
	@FindBy(xpath="/html/body/footer/div[1]/div[3]/ul/li[6]/a")
	@CacheLookup
	WebElement lnkterms;
	
	@FindBy(xpath="/html/body/footer/div[1]/div[3]/ul/li[7]/a")
    @CacheLookup
	WebElement lnkprvcy;
	
	@FindBy(xpath="/html/body/footer/div/div[1]/a[2]/span")
	@CacheLookup
	WebElement btnjnfrfree;
	
	@FindBy(xpath="/html/body/div[1]/section[1]/div/div/p[1]")
	@CacheLookup
	public
	WebElement txtabout;
	
	@FindBy(xpath="/html/body/div/main/section[1]/div/div/div/div/div/h2")
	@CacheLookup
	public
	WebElement txteeds;
	
	@FindBy(xpath="/html/body/div[1]/section[1]/div/h1")
	@CacheLookup
	public
	WebElement txttrstsfty;
	
	@FindBy(xpath="/html/body/div[7]/section[2]/div/div/div[1]/div/div/div[2]")
	@CacheLookup
	public
	WebElement txtfaq;
	
	@FindBy(xpath="/html/body/div[7]/section[2]/div/div/div[1]/div/div/div")
	@CacheLookup
	public
	WebElement txthelp;
	
	@FindBy(xpath="/html/body/div[7]/div/h2")
	@CacheLookup
	public
	WebElement txtterm;
	
	@FindBy(xpath="/html/body/div[7]/div/section[2]/h2")
	@CacheLookup
	public
	WebElement txtprivacy;
	
	@FindBy(xpath="/html/body/footer/div/div[1]/a[2]/span")
	@CacheLookup
	public
	WebElement txtjoin;
	
	public void clicklnkabout()
	{
		lnkabout.click();
		String expected_url="https://qatest.twoplugs.com/about";
		Assert.assertEquals(driver.getCurrentUrl(), expected_url);
		
	}
	
	public void clicklnkeeds()
	{
		lnkeeds.click();
		String expected_url="https://qatest.twoplugs.com/powerofeeds";
		Assert.assertEquals(driver.getCurrentUrl(), expected_url);
	}
	public void clicklnktrstsfty()
	{
		lnktrstsfty.click();
		String expected_url="https://qatest.twoplugs.com/trustsafety";
		Assert.assertEquals(driver.getCurrentUrl(), expected_url);
	}
	public void clicklnkfaq()
	{
		lnkfaq.click();
		String expected_url="https://qatest.twoplugs.com/helparticles/2";
		Assert.assertEquals(driver.getCurrentUrl(), expected_url);
		driver.navigate().back();//To navigate back 
	}
	public void clicklnkhelp()
	{
		lnkhelp.click();
		String expected_url="https://qatest.twoplugs.com/help";
		Assert.assertEquals(driver.getCurrentUrl(), expected_url);
		driver.navigate().back();
	}
	public void clicklnkterms()
	{
		lnkterms.click();
		String expected_url="https://qatest.twoplugs.com/terms";
		Assert.assertEquals(driver.getCurrentUrl(), expected_url);
		driver.navigate().back();
	}
	public void clicklnkprvcy()
	{
		lnkprvcy.click();
		String expected_url="https://qatest.twoplugs.com/terms#privacy";
		Assert.assertEquals(driver.getCurrentUrl(), expected_url);
		driver.navigate().back();
	}
	public void clickbtnjnfrfree()
	{
		btnjnfrfree.click();
		String expected_url="https://qatest.twoplugs.com/signup";
		Assert.assertEquals(driver.getCurrentUrl(), expected_url);
	}

//	@FindBy(xpath="/html/body/div/section[8]/div/h2")
//	@CacheLookup
//	WebElement txtfaq;
	
	@FindBy(xpath="/html/body/div/section[7]/div/dl/dt[1]")
		//*[@id='Zebra_Accordion']/dt[1]
	@CacheLookup
	public
	WebElement btnddone;
			
	@FindBy(xpath="/html/body/div/section[7]/div/dl/dt[2]")
	//*[@id="Zebra_Accordion"]/dt[2]
	//html/body/div/section[8]/div/dl/dt[2]
	//*[@id="Zebra_Accordion"]/dt[2]
	//*[@id="Zebra_Accordion"]/dt[2]/span
	@CacheLookup
	public
	WebElement btnddtwo;	
	
	@FindBy(xpath="/html/body/div/section[7]/div/dl/dt[3]")
	@CacheLookup
	public
	WebElement btnddthree;
	
	@FindBy(xpath="/html/body/div/section[7]/div/dl/dt[4]")
	//*[@id="Zebra_Accordion"]/dt[4]
    @CacheLookup
	public
	WebElement btnddfour;
	
	@FindBy(xpath="/html/body/div/section[7]/div/dl/dt[5]")
	/* /html/body/div/section[8]/div/dl/dt[5] */
	/*    //*[@id="Zebra_Accordion"]/dt[5] */
	/*/html/body/div/section[8]/div/dl/dt[5]*/
	//*[@id="Zebra_Accordion"]/dt[5]
	//html/body/div/section[7]/div/dl/dt[5]	
	@CacheLookup
	public
	WebElement btnddfive;
	
	@FindBy(xpath="/html/body/div/section[7]/div/dl/dt[6]")
	@CacheLookup
	public
	WebElement btnddsix;
	
	@FindBy(xpath="/html/body/div/section[7]/div/dl/dt[7]")

	@CacheLookup
	public
	WebElement btnddseven;
	
	@FindBy(xpath="/html/body/div/section[7]/div/dl/dd[1]/p")
	@CacheLookup
	public
	WebElement btnddeight;
	
	@FindBy(xpath="/html/body/div/section[7]/div/dl/dd[2]/p")
	@CacheLookup
	public
	WebElement btnddnine;
	
	@FindBy(xpath="/html/body/div/section[7]/div/dl/dd[3]/p")
	@CacheLookup
	public
	WebElement btnddten;
	
	@FindBy(xpath="/html/body/div/section[7]/div/dl/dd[4]/p")
	@CacheLookup
	public
	WebElement btnddelvn;
	
	@FindBy(xpath="/html/body/div/section[7]/div/dl/dd[5]/p")
	@CacheLookup
	public
	WebElement btnddtwlve;
	
	@FindBy(xpath="/html/body/div/section[7]/div/dl/dd[6]/p")
	@CacheLookup
	public
	WebElement btnddthrtn;
	
	@FindBy(xpath="/html/body/div/section[7]/div/dl/dd[7]/p")
	@CacheLookup
	public
	WebElement btnddfrtn;

	public void clickddone()
	{
		btnddone.click();
	}	
	public void clickddtwo()
	{
		btnddtwo.click();
	}
	public void clickddthree()
	{
		btnddthree.click();
	}
	public void clickddfour()
	{
		btnddfour.click();
	}
	public void clickddfive()
	{
		btnddfive.click();
	}
	public void clickddsix()
	{
		btnddsix.click();
	}
	public void clickddseven()
	{
		btnddseven.click();
	}
	
	
	
}

