package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrephSuppostoriesPage extends BaseClass{
	
	public PrephSuppostoriesPage() {
		PageFactory.initElements(driver, this);
	}	
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='Homepage (US)']")
	private static WebElement HomeBreadcrumbs;		

	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//a[text()='Products']")
	private static WebElement Products_Breadcrumbs;		

	@FindBy(xpath = "//h2[text()='Wipe + Treat = Better Relief']")
	private static WebElement Products_txt_Breadcrumbs;			
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']")
	private static WebElement suppostories_Breadcrumbs;			
	
	@FindBy(xpath = "//a[text()='Full Product Label']")
	private static WebElement fullproductlabel;
	
	@FindBy(xpath = "//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement BuyNow;
	
	@FindBy(xpath = "//h1[text()='Preparation H Suppositories 48 ct']")
	private static WebElement BuyNow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement BuyNow_Close;
	
	@FindBy(xpath = "//a[text()='Coupon']")
	private static WebElement Coupons;
	
	@FindBy(xpath = "//h1[text()='Save and shop Preparation H']")
	private static WebElement Coupons_txt;
	
	@FindBy(xpath = "(//a[@class='btn btn-secondary enlargebtn'])[2]")
	private static WebElement Enlarge;
	
	@FindBy(xpath = "//button[@class='_JS_zoomIn _JS_zoomControls zoominbtn']")
	private static WebElement Enlarge_zoomin;
	
	@FindBy(xpath = "//button[@class='_JS_zoomOut _JS_zoomControls zoomoutbtn']")
	private static WebElement Enlarge_zoomout;
	
	@FindBy(xpath = "//img[@alt='Preparation H Suppositories enlarged']")
	private static WebElement Enlarge_img;
	
	@FindBy(xpath = "//a[@class='enlargeclose']")
	private static WebElement Enlarge_Close;
	
	@FindBy(xpath = "//a[text()='Watch Video ']")
	private static WebElement watchvideo;
	
	@FindBy(xpath = "//div[@style='display: flex;']")
	private static WebElement Videodisplay;
	
	@FindBy(xpath = "//button[@class='ytp-play-button ytp-button']")
	private static WebElement VideoButton_play;
	
	@FindBy(xpath = "//div[@class='iframe-container']//child::iframe")
	private static WebElement iframe;
	
	@FindBy(xpath = "//button[@title='Play (k)']")
	private static WebElement Video_pause;
	
	@FindBy(xpath = "//a[@title='Learn More']")
	private static WebElement learnmore;
	
	@FindBy(xpath = "//h1[text()='Using My FSA or HSA to Purchase Preparation H Products']")
	private static WebElement learnmore_txt;
	
	@FindBy(xpath = "//span[text()='Benefits']")
	private static WebElement benefits;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item odd first is-active']")
	private static WebElement benefits_Active;
	
	@FindBy(xpath = "//span[text()='Sizes']")
	private static WebElement sizes;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item even is-active']")
	private static WebElement sizes_Active;
	
	@FindBy(xpath = "//span[text()='Application']")
	private static WebElement application;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item odd is-active']")
	private static WebElement application_Active;
	
	@FindBy(xpath = "//span[text()='Warning']")
	private static WebElement warning;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item even last is-active']")
	private static WebElement warning_Active;
	
	
	
	
	
	
	
	
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
		public void clickonProductsBreadcrumbs() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(Products_Breadcrumbs);
			if (isElementPresent(Products_Breadcrumbs)) {
				clickElementUsingJavaScript(Products_Breadcrumbs);
				visibilityOf(Products_txt_Breadcrumbs);
				boolean elementIsDisplayed=elementIsDisplayed(Products_txt_Breadcrumbs);
				Assert.assertTrue(elementIsDisplayed(Products_txt_Breadcrumbs));
				pageLoad();
			} else {
				throw new Exception("Products_Breadcrumbs are not Present on Page");
			}
			
		}		
		public void clickonSuppostoriesBreadcrumbs() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(suppostories_Breadcrumbs);
			if (isElementPresent(suppostories_Breadcrumbs)) {
				visibilityOf(suppostories_Breadcrumbs);
				boolean elementIsDisplayed=elementIsDisplayed(suppostories_Breadcrumbs);
				Assert.assertTrue(elementIsDisplayed(suppostories_Breadcrumbs));
				pageLoad();
			} else {
				throw new Exception("suppostories_Breadcrumbs are not Present on Page");
			}
			
		}	
		public void clickonFullProductLabel() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(fullproductlabel);
			if (isElementPresent(fullproductlabel)) {
				clickElementUsingJavaScript(fullproductlabel);
				pageLoad();
			} else {
				throw new Exception("fullproductlabel are not Present on Page");
			}
			
		}	
		public void clickonBuyNowButton() throws Exception{
	    	waitForPageLoadJava();
	    	moveToElement(BuyNow);
	    	if (isElementPresent(BuyNow)) {
	    		clickElementUsingJavaScript(BuyNow);
	    		visibilityOf(BuyNow_txt);
	    		boolean elementIsDisplayed=elementIsDisplayed(BuyNow_txt);
	    		Assert.assertTrue(elementIsDisplayed);
	    		System.out.println(getElementText(BuyNow_txt));
	    		clickElementUsingJavaScript(BuyNow_Close);	
			} 
	    	else {
	    		throw new Exception("BuyNow  Button and BuyNow txt is not displayed on Page");
			}
	    	
		}
		public void clickonCoupons() throws Exception{
	    	waitForPageLoadJava();
	    	moveToElement(Coupons);
	    	if (isElementPresent(Coupons)) {
	    		clickElementUsingJavaScript(Coupons);
	    		visibilityOf(Coupons_txt);
	    		boolean elementIsDisplayed=elementIsDisplayed(Coupons_txt);
	    		Assert.assertTrue(elementIsDisplayed);
	    		System.out.println(getElementText(Coupons_txt));
	    			
			} 
	    	else {
	    		throw new Exception("Coupons is not displayed on Page");
			}
	    	
		}
		public void clickonEnlargeView() throws Exception{
			waitForPageLoadJava();
			moveToElement(Enlarge);
			if (isElementPresent(Enlarge)) {
				clickElementUsingJavaScript(Enlarge);
				moveToElement(Enlarge_zoomin);
				actionClick(Enlarge_zoomin);
				implicitWait();
				moveToElement(Enlarge_zoomout);
				actionClick(Enlarge_zoomout);
				visibilityOf(Enlarge_img);
				boolean elementIsDisplayed=elementIsDisplayed(Enlarge_img);
				Assert.assertTrue(elementIsDisplayed(Enlarge_img));
				clickElementUsingJavaScript(Enlarge_Close);
				pageLoad();
			} else {
				throw new Exception("Enlarge view is  not present on Page");
			}
			
		}		
		public void clickonYouTubeBtn() throws Exception{
	    	waitForPageLoadJava();
			
			if (isElementPresent(watchvideo)) {
				clickElementUsingJavaScript(watchvideo);
				implicitWait();
				//switchToFrameUsingElement(iframe);
				//moveToElement(Videodisplay);
				actionClick(Videodisplay);
				visibilityOf(Videodisplay);
				boolean elementIsDisplayed=elementIsDisplayed(Videodisplay);
				Assert.assertTrue(elementIsDisplayed(Videodisplay));
				//clickElementUsingJavaScript(Videoplay_play);
				implicitWait();
				//clickElementUsingJavaScript(Videoplay_pause);
				//frameSwitchingToDefaultContent();
				System.out.println("Verified Youtube is Displayed Successfully on Page");
				pageLoad();
			} else {
				throw new Exception("Verified Youtube is not Displayed Successfully on Page");
			}
			
		}	
		
		public void clickonLearnmore() throws Exception{
			waitForPageLoadJava();
			scrollDownUsingElement(learnmore);
			moveToElement(learnmore);
			if (isElementPresent(learnmore)) {
				clickElementUsingJavaScript(learnmore);
				visibilityOf(learnmore_txt);
				boolean elementIsDisplayed=elementIsDisplayed(learnmore_txt);
				Assert.assertTrue(elementIsDisplayed(learnmore_txt));
				System.out.println(getElementText(learnmore_txt));
				pageLoad();
			} else {
				throw new Exception("Learnmore  is  not present on Page");
			}
			
		}		
		public void clickonBenefits() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(benefits);
	    	moveToElement(benefits);
	    	if (isElementPresent(benefits)) {
	    		clickElementUsingJavaScript(benefits);
	    		visibilityOf(benefits_Active);
	    		boolean elementIsDisplayed=elementIsDisplayed(benefits_Active);
	    		Assert.assertTrue(elementIsDisplayed);
	    		System.out.println(getElementText(benefits_Active));
	    			
			} 
	    	else {
	    		throw new Exception("benefits_Active is not displayed on Page");
			}
	    	
		}
		public void clickonSizes() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(sizes);
	    	moveToElement(sizes);
	    	if (isElementPresent(sizes)) {
	    		clickElementUsingJavaScript(sizes);
	    		visibilityOf(sizes_Active);
	    		boolean elementIsDisplayed=elementIsDisplayed(sizes_Active);
	    		Assert.assertTrue(elementIsDisplayed);
	    		System.out.println(getElementText(sizes_Active));
	    			
			} 
	    	else {
	    		throw new Exception("sizes_Active is not displayed on Page");
			}
	    	
		}
		public void clickonApplication() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(application);
	    	moveToElement(application);
	    	if (isElementPresent(application)) {
	    		clickElementUsingJavaScript(application);
	    		visibilityOf(application_Active);
	    		boolean elementIsDisplayed=elementIsDisplayed(application_Active);
	    		Assert.assertTrue(elementIsDisplayed);
	    		System.out.println(getElementText(application_Active));
	    			
			} 
	    	else {
	    		throw new Exception("application_Active is not displayed on Page");
			}
	    	
		}
		public void clickonWarning() throws Exception{
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(warning);
	    	moveToElement(warning);
	    	if (isElementPresent(warning)) {
	    		clickElementUsingJavaScript(warning);
	    		visibilityOf(warning_Active);
	    		boolean elementIsDisplayed=elementIsDisplayed(warning_Active);
	    		Assert.assertTrue(elementIsDisplayed);
	    		System.out.println(getElementText(warning_Active));
	    			
			} 
	    	else {
	    		throw new Exception("warning_Active is not displayed on Page");
			}
	    	
		}
	
	
	
	
	
	
	

}
