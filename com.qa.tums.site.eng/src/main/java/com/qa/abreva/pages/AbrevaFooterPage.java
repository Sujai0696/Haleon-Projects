package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaFooterPage extends BaseClass{
	
	public AbrevaFooterPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//button[text()='Accept Cookies']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
		private static WebElement cookieClose;
			
		@FindBy(xpath = "//a[text()='SITE MAP']")
		private static WebElement sitemap;	
	
		@FindBy(xpath = "//h1[text()='Sitemap']")
		private static WebElement sitemap_txt;	
	
		@FindBy(xpath = "//a[text()='CONTACT US']")
		private static WebElement Contactus;	
	
		@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even component']")
		private static WebElement Contactus_txt;	
	
	
	
	
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
				public void clickonSitemap() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(sitemap);
					moveToElement(sitemap);
					clickElementUsingJavaScript(sitemap);
					visibilityOf(sitemap_txt);
					boolean elementIsDisplayed=elementIsDisplayed(sitemap_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(sitemap_txt));
					pageLoad();
				}
				public void clickonContactus() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(Contactus);
					moveToElement(Contactus);
					clickElementUsingJavaScript(Contactus);
					visibilityOf(Contactus_txt);
					boolean elementIsDisplayed=elementIsDisplayed(Contactus_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(Contactus_txt));
					pageLoad();
				}
	
	
	
	
	
	
	

}
