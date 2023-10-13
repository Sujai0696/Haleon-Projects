package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class bioteneFooterPage extends BaseClass{
	
	public bioteneFooterPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']//self::button[text()='Accept Cookies']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//div[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
	
		@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//child::div[@class='component-content']")
		private static WebElement emailpopup_Close;
	
		@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//ancestor::div[@class='component-content']//self::div[@style]")
		private static WebElement email_text;
	
	
		//Header//
		
		@FindBy(xpath = "//div[@class='box component section footer-box first odd']//child::a[@href='/dry-mouth-faq/']")
		private static WebElement FAQ;
	
		@FindBy(xpath = "//div[@class='box component section footer-box first odd']//child::a[@href='/contact-us/']")
		private static WebElement Contactus;
	
		@FindBy(xpath = "//div[@class='box component section footer-box first odd']//child::a[@href='/site-map/']")
		private static WebElement Sitemap;
	
	
	
	
	
	
	
	
	
		//Methods//
		
//				public void clickonMail() throws Exception {
//					waitForPageLoadJava();
//					clickElementUsingJavaScript(email_text);
//					email_text.sendKeys("yogita.patil0515@gmail.com");
//					clickElementUsingJavaScript(email_submit);
//					Thread.sleep(1000);
//					clickElementUsingJavaScript(emailpopup_Close);
//				}
				
				public void clickonCookieBtn() throws Exception {
					waitForPageLoadJava();
					if(isElementPresent(cookieBtn)) {
						elementToBeClickable(cookieBtn);
						try {
							if(cookieBtn.isDisplayed()) {
								clickElementUsingJavaScript(cookieBtn);
							}
							implicitWait();
							visibilityOf(cookieClose);
							Assert.assertTrue(elementIsDisplayed(cookieClose));
						}
						catch (Exception e) {
							
						}
					}else {
						System.out.println("Dismiss is not presented");
						throw new Exception("Unable to click on cookie Pop-up");
					}
					}
				public void clickonEmailBtn() throws Exception {
					waitForPageLoadJava();
					if(isElementPresent(email_text)) {
						elementToBeClickable(email_text);
						try {
							if(email_text.isDisplayed()) {
								clickElementUsingJavaScript(email_text);
							}
							implicitWait();
							visibilityOf(emailpopup_Close);
							Assert.assertTrue(elementIsDisplayed(emailpopup_Close));
						}
						catch (Exception e) {
							
						}
					}else {
						System.out.println("Email Pop-Up is not presented");
						throw new Exception("Unable to click on Email Pop-up");
					}
					}
				
					
				//Footer//
				
					public void ClickonFAQ() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(FAQ);
						clickElementUsingJavaScript(FAQ);
						pageLoad();
					}
					public void ClickonContactUs() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(Contactus);
						clickElementUsingJavaScript(Contactus);
						pageLoad();
					}
					public void ClickonSitemap() throws Exception {
						waitForPageLoadJava();
						scrollDownUsingElement(Sitemap);
						clickElementUsingJavaScript(Sitemap);
						pageLoad();
					}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
