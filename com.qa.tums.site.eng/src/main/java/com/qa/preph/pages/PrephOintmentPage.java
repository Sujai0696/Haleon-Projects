package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;
public class PrephOintmentPage extends BaseClass{
	
	public PrephOintmentPage() {
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
	private static WebElement Ointment_Breadcrumbs;		
	
	@FindBy(xpath = "//h1[text()='Ointment']")
	private static WebElement Ointment_txt_Breadcrumbs;	
	
	@FindBy(xpath = "//a[text()='Full Product Label']")
	private static WebElement fullproductlabel;	
	
	@FindBy(xpath = "//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement BuyNowBtn;
	
	@FindBy(xpath = "//h1[text()='Preparation H Ointment 2 oz']")
	private static WebElement BuyNowBtn_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement BuyNowBtn_close;
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage coupon-button even last component col-xs-12']//a[@href='/coupons-and-special-offers/']")
	private static WebElement Coupons;
	
	@FindBy(xpath = "//h1[text()='Save and shop Preparation H']")
	private static WebElement Coupons_txt;
	
	@FindBy(xpath = "(//div[@class='richText component section text-center-d text-center-m even last col-xs-12']//a[text()='Enlarge'])[2]")
	private static WebElement Enlarge;
	
	@FindBy(xpath = "//button[@class='_JS_zoomIn _JS_zoomControls zoominbtn']")
	private static WebElement Enlarge_zoomin;
	
	@FindBy(xpath = "//button[@class='_JS_zoomOut _JS_zoomControls zoomoutbtn']")
	private static WebElement Enlarge_zoomout;
	
	@FindBy(xpath = "//a[@class='enlargeclose']")
	private static WebElement Enlarge_Close;
	
	@FindBy(xpath = "//a[text()='Watch Video ']")
	private static WebElement watchvideo;
	
	@FindBy(xpath = "//div[@style='display: flex;']")
	private static WebElement Videodisplay;
	
	@FindBy(xpath = "//iframe[@id='ytplayer']")
	private static WebElement iframe;
	
	@FindBy(xpath = "//button[@title='Play (k)']")
	private static WebElement Videoplay_pause;
	
	@FindBy(xpath = "//button[@title='Pause (k)']")
	private static WebElement Videoplay_play;
	
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
		public void clickonOintmentBreadcrumbs() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(Ointment_Breadcrumbs);
			if (isElementPresent(Ointment_Breadcrumbs)) {
				clickElementUsingJavaScript(Ointment_Breadcrumbs);
				visibilityOf(Ointment_txt_Breadcrumbs);
				boolean elementIsDisplayed=elementIsDisplayed(Ointment_txt_Breadcrumbs);
				Assert.assertTrue(elementIsDisplayed(Ointment_txt_Breadcrumbs));
				pageLoad();
			} else {
				throw new Exception("Ointment_Breadcrumbs are not Present on Page");
			}
			
		}		
		public void clickonFullProductLabel() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(fullproductlabel);
			if (isElementPresent(fullproductlabel)) {
				clickElementUsingJavaScript(fullproductlabel);
				System.out.println("Verified  full product label is present on Page");
				pageLoad();
			} else {
				throw new Exception("Verified  full product label is  not present on Page");
			}
			
		}		
		public void clickonBuyNowBtn() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(BuyNowBtn);
			if (isElementPresent(BuyNowBtn)) {
				clickElementUsingJavaScript(BuyNowBtn);
				visibilityOf(BuyNowBtn_txt);
				boolean elementIsDisplayed=elementIsDisplayed(BuyNowBtn_txt);
				Assert.assertTrue(elementIsDisplayed(BuyNowBtn_txt));
				System.out.println(getElementText(BuyNowBtn_txt));
				clickElementUsingJavaScript(BuyNowBtn_close);
				pageLoad();
			} else {
				throw new Exception("Verified  BuyNow Button  is  not present on Page");
			}
			
		}		
		public void clickonCoupons() throws Exception{
	    	waitForPageLoadJava();
			moveToElement(Coupons);
			if (isElementPresent(Coupons)) {
				clickElementUsingJavaScript(Coupons);
				visibilityOf(Coupons_txt);
				boolean elementIsDisplayed=elementIsDisplayed(Coupons_txt);
				Assert.assertTrue(elementIsDisplayed(Coupons_txt));
				System.out.println(getElementText(Coupons_txt));
				pageLoad();
			} else {
				throw new Exception("Verified  Coupons  is  not present on Page");
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
				clickElementUsingJavaScript(Enlarge_Close);
				pageLoad();
			} else {
				throw new Exception("EnlargeView  is  not present on Page");
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
