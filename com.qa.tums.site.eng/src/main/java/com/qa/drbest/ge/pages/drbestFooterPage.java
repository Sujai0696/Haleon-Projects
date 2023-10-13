package com.qa.drbest.ge.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class drbestFooterPage extends BaseClass{
	
	public drbestFooterPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Akzeptieren']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-fade-in']//self::div[contains(@style,'display: none;')]")
		private static WebElement cookieClose;
	
		@FindBy(xpath = "//a[text()='Kontakt']")
		private static WebElement kontakt;
	
		@FindBy(xpath = "//a[text()='Sitemap']")
		private static WebElement sitemap;
	
	
	
	
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
					
				public void clickonkontakt() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(kontakt);
					clickElementUsingJavaScript(kontakt);
					pageLoad();
				}
				public void clickonSitemap() throws Exception {
					waitForPageLoadJava();
					scrollDownUsingElement(sitemap);
					clickElementUsingJavaScript(sitemap);
					pageLoad();
				}
	
	
	
	
	
	
	
	
	
	
	

}
