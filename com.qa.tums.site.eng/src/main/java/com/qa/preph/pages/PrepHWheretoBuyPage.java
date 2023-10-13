package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHWheretoBuyPage extends BaseClass{
	
	public PrepHWheretoBuyPage() {
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='Homepage (US)']")
	private static WebElement HomeBreadcrumbs;		

	@FindBy(xpath = "//li[text()=' Where To Buy ']")
	private static WebElement wheretobuyBreadcrumbs;	
	
	@FindBy(xpath = "//h1[text()='Where to Buy']")
	private static WebElement wheretobuy_txt_Breadcrumbs;	
	
	@FindBy(xpath = "//div[@class='ps-online-tab selected']")
	private static WebElement retailers;	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
		
		
			public void clickonHomeBreadcrumbs() throws Exception{
		    	waitForPageLoadJava();
				moveToElement(HomeBreadcrumbs);
				if (isElementPresent(HomeBreadcrumbs)) {
					clickElementUsingJavaScript(HomeBreadcrumbs);
					pageLoad();
				} else {
					throw new Exception("HomeBreadcrumbs are not Present on Page");
				}
				
			}		
			public void clickonwheretobuyBreadcrumbs() throws Exception{
		    	waitForPageLoadJava();
				moveToElement(wheretobuyBreadcrumbs);
				if (isElementPresent(wheretobuyBreadcrumbs)) {
					
					visibilityOf(wheretobuy_txt_Breadcrumbs);
					boolean elementIsDisplayed=elementIsDisplayed(wheretobuy_txt_Breadcrumbs);
					Assert.assertTrue(elementIsDisplayed(wheretobuy_txt_Breadcrumbs));
					System.out.println(getElementText(wheretobuy_txt_Breadcrumbs));
					pageLoad();
				} else {
					throw new Exception("wheretobuy_txt_Breadcrumbs are not Present on Page");
				}
				
			}	
			public void clickonRetailers() throws Exception{
		    	waitForPageLoadJava();
				
				if (isElementPresent(retailers)) {
					
					visibilityOf(retailers);
					boolean elementIsDisplayed=elementIsDisplayed(retailers);
					Assert.assertTrue(elementIsDisplayed(retailers));
					
					pageLoad();
				} else {
					throw new Exception("Retailers are not Present on Page");
				}
				
			}	
	
	
	
	
	
	
	
	
	
	
	

}
