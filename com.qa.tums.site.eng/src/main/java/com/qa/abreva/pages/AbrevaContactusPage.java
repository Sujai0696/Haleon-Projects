package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaContactusPage extends BaseClass{
	
	public AbrevaContactusPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//button[text()='Accept Cookies']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
		private static WebElement cookieClose;
				
		@FindBy(xpath = "//div[@class='navigation component section header-nav even last grid_10 initialized']//a[@href='/cold-sore-products/abreva-cream/']")
		private static WebElement abrevaproducts;
	
		@FindBy(xpath = "//div[@class='navigation component section header-nav even last grid_10 initialized']//a[@href='/about-cold-sores/what-are-cold-sores/']")
		private static WebElement aboutcoldsore;
	
		@FindBy(xpath = "//div[@class='navigation component section header-nav even last grid_10 initialized']//a[@href='/managing-lip-health/cold-sore-triggers/']")
		private static WebElement  managingliphealth;
	
		@FindBy(xpath = "//div[@class='navigation component section header-nav even last grid_10 initialized']//a[@href='/faq/abreva-basics/']")
		private static WebElement  faq;
	
		@FindBy(xpath = "//div[@class='navigation component section header-nav even last grid_10 initialized']//a[@href='/cold-sore-first-signs/']")
		private static WebElement  getridoncoldsores;
	
	
	
	
	
	
	
	
	
	
	
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
				public void clickonAbrevaproducts() throws Exception {	
					waitForPageLoadJava();
					moveToElement(abrevaproducts);
					clickElementUsingJavaScript(abrevaproducts);
					pageLoad();
				}
				public void clickonAboutcoldsores() throws Exception {	
					waitForPageLoadJava();
					moveToElement(aboutcoldsore);
					clickElementUsingJavaScript(aboutcoldsore);
					pageLoad();
				}
				public void clickonManagingliphealth() throws Exception {	
					waitForPageLoadJava();
					moveToElement(managingliphealth);
					clickElementUsingJavaScript(managingliphealth);
					pageLoad();
				}
				public void clickonFAQ() throws Exception {	
					waitForPageLoadJava();
					moveToElement(faq);
					clickElementUsingJavaScript(faq);
					pageLoad();
				}
				public void clickonGetridofcoldsores() throws Exception {	
					waitForPageLoadJava();
					moveToElement(getridoncoldsores);
					clickElementUsingJavaScript(getridoncoldsores);
					pageLoad();
				}
	
	
	
	
	
	
	
	

}
