package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrepHMultiSymptomsCreamePage extends BaseClass{
	
	public PrepHMultiSymptomsCreamePage() {
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
	
	@FindBy(xpath = "//li[text()=' Multi-Symptom Cream ']")
	private static WebElement multisymptoms_Breadcrumbs;		
	
	@FindBy(xpath = "//h1[text()='Multi-Symptom Cream']")
	private static WebElement multisymptoms_txt_Breadcrumbs;		
	
	@FindBy(xpath = "//a[text()='Full Product Label']")
	private static WebElement fullproductlabels;	
	
	@FindBy(xpath = "//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement BuyNow;	
	
	@FindBy(xpath = "//h1[text()='Preparation H  Multi-Symptom Cream 1.8 oz']")
	private static WebElement BuyNow_txt;	
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement BuyNow_Close;	
	
	@FindBy(xpath = "//a[text()='Coupon']")
	private static WebElement coupon;	
	
	@FindBy(xpath = "//h1[text()='Save and shop Preparation H']")
	private static WebElement coupon_txt;	
	
	@FindBy(xpath = "(//a[text()='Enlarge'])[1]")
	private static WebElement enlarge;
	
	@FindBy(xpath = "//button[@class='_JS_zoomIn _JS_zoomControls zoominbtn']")
	private static WebElement enlarge_zoomin;
	
	@FindBy(xpath = "//button[@class='_JS_zoomOut _JS_zoomControls zoomoutbtn']")
	private static WebElement enlarge_zoomout;
	
	@FindBy(xpath = "//img[@alt='PREPARATION H Multi-Symptom Pain Relief Cream enlarged']")
	private static WebElement enlarge_img;
	
	@FindBy(xpath = "//a[@class='enlargeclose']")
	private static WebElement enlarge_close;
	
	@FindBy(xpath = "//a[text()='Watch Video ']")
	private static WebElement watchvideo;
	
	@FindBy(xpath = "//div[@style='display: flex;']")
	private static WebElement Videodisplay;
	
	@FindBy(xpath = "//div[@id='movie_player']")
	private static WebElement VideodisIcon;
	
	@FindBy(xpath = "//a[@title='Learn More']")
	private static WebElement learnmore;
	
	@FindBy(xpath = "//h1[text()='Using My FSA or HSA to Purchase Preparation H Products']")
	private static WebElement learnmore_txt;
	
	@FindBy(xpath = "//span[text()='Benefits']")
	private static WebElement benefits;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item odd first is-active']")
	private static WebElement benefits_active;
	
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
		public void clickonMultisymptomsBreadcrumbs() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(multisymptoms_Breadcrumbs);
			if (isElementPresent(multisymptoms_Breadcrumbs)) {
				
				visibilityOf(multisymptoms_txt_Breadcrumbs);
				boolean elementIsDisplayed=elementIsDisplayed(multisymptoms_txt_Breadcrumbs);
				Assert.assertTrue(elementIsDisplayed(multisymptoms_txt_Breadcrumbs));
				pageLoad();
			} else {
				throw new Exception("multisymptoms_txt_Breadcrumbs are not Present on Page");
			}
			
		}	
		public void clickonFullProductLabel() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(fullproductlabels);
			if (isElementPresent(fullproductlabels)) {
				clickElementUsingJavaScript(fullproductlabels);
				
			} else {
				throw new Exception("fullproductlabels are not Present on Page");
			}
			
		}	
		public void clickonBuyNowButton() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(BuyNow);
			if (isElementPresent(BuyNow)) {
				clickElementUsingJavaScript(BuyNow);
				visibilityOf(BuyNow_txt);
				boolean elementIsDisplayed=elementIsDisplayed(BuyNow_txt);
				Assert.assertTrue(elementIsDisplayed(BuyNow_txt));
				clickElementUsingJavaScript(BuyNow_Close);
				pageLoad();
			} else {
				throw new Exception("BuyNow are not Present on Page");
			}
			
		}	
		public void clickonCoupons() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(coupon);
			if (isElementPresent(coupon)) {
				clickElementUsingJavaScript(coupon);
				visibilityOf(coupon_txt);
				boolean elementIsDisplayed=elementIsDisplayed(coupon_txt);
				Assert.assertTrue(elementIsDisplayed(coupon_txt));
				System.out.println(getElementText(coupon_txt));
				pageLoad();
			} else {
				throw new Exception("coupon_txt are not Present on Page");
			}
			
		}	
		public void clickonEnlarge() throws Exception{
	    	waitForPageLoadJava();
			//moveToElement(enlarge);
			if (isElementPresent(enlarge)) {
				clickElementUsingJavaScript(enlarge);
				//visibilityOf(enlarge_zoomin);
				implicitWait();
				actionClick(enlarge_zoomin);
				moveToElement(enlarge_zoomout);
				actionClick(enlarge_zoomout);
				implicitWait();
				visibilityOf(enlarge_img);
				boolean elementIsDisplayed=elementIsDisplayed(enlarge_img);
				Assert.assertTrue(elementIsDisplayed(enlarge_img));
				clickElementUsingJavaScript(enlarge_close);
				pageLoad();
			} else {
				throw new Exception("enlarge are not Present on Page");
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
			moveToElement(benefits);
			if (isElementPresent(benefits)) {
				clickElementUsingJavaScript(benefits);
				visibilityOf(benefits_active);
				boolean elementIsDisplayed=elementIsDisplayed(benefits_active);
				Assert.assertTrue(elementIsDisplayed(benefits_active));
				System.out.println(getElementText(benefits_active));
				pageLoad();
			} else {
				throw new Exception("Benefits  is  not present on Page");
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
				Assert.assertTrue(elementIsDisplayed(sizes_Active));
				System.out.println(getElementText(sizes_Active));
				pageLoad();
			} else {
				throw new Exception("Sizes  is  not present on Page");
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
				Assert.assertTrue(elementIsDisplayed(application_Active));
				System.out.println(getElementText(application_Active));
				pageLoad();
			} else {
				throw new Exception("Application Active is  not present on Page");
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
				Assert.assertTrue(elementIsDisplayed(warning_Active));
				System.out.println(getElementText(warning_Active));
				pageLoad();
			} else {
				throw new Exception("warning_Active is  not present on Page");
			}
			
		}		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
