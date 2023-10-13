package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class biotenedrymouthFAQPage extends BaseClass{
	
	public biotenedrymouthFAQPage() {
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
	
	@FindBy(xpath = "//a[text()='Home']")
	private static WebElement Home_Breadcrumbs;		
		
	@FindBy(xpath = "//a[text()='Frequently Asked Questions About Dry Mouth ']")
	private static WebElement FAQ_Breadcrumbs;				
	
	
	//DRY MOUTH SALVIA//
	
	@FindBy(xpath = "//div[@class='accordion component section drymouth-and-saliva-accordion even grid_12 alpha omega initialized']//span[text()='What is Dry Mouth?']")
	private static WebElement DrymouthActive;				
	
	@FindBy(xpath = "//li[@class='accordion-slide first odd']//child::span[text()='What is Dry Mouth?']")
	private static WebElement Drymouth;
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	//Methods//
	
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
		
		public void clickonHomeBreadcrumbs() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(Home_Breadcrumbs);
			pageLoad();
		}
		public void clickonFAQBreadcrumbs() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(FAQ_Breadcrumbs);
			pageLoad();
		}
		public void clickonDryMouth() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Drymouth);
			clickElementUsingJavaScript(Drymouth);
			visibilityOf(DrymouthActive);
			boolean elementIsDisplayed=elementIsDisplayed(DrymouthActive);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Drymouth));
			pageLoad();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
