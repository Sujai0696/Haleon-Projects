package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class PrephTotablesPage extends BaseClass{
	
	public PrephTotablesPage() {
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
	
	@FindBy(xpath = "//li[text()=' Totables ']")
	private static WebElement Totables_Breadcrumbs;		
	
	@FindBy(xpath = "//h1[text()='Totables']")
	private static WebElement Totables_txt_Breadcrumbs;		
	
	@FindBy(xpath = "//a[text()='Full Product Label']")
	private static WebElement fullproductlabel;		
	
	@FindBy(xpath = "//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement Buynow;
	
	@FindBy(xpath = "//h1[text()='Preparation H Rapid Relief Totables w. Lidocaine 20 ct']")
	private static WebElement Buynow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement Buynow_Close;
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage coupon-button even last component col-xs-12']//a[@href='/coupons-and-special-offers/']")
	private static WebElement Coupons;
	
	@FindBy(xpath = "//h1[text()='Save and shop Preparation H']")
	private static WebElement Coupons_txt;
	
	@FindBy(xpath = "(//div[@class='richText component section text-center-d text-center-m even last col-xs-12']//a[text()='Enlarge'])[2]")
	private static WebElement enlarge;
	
	@FindBy(xpath = "//button[@class='_JS_zoomIn _JS_zoomControls zoominbtn']")
	private static WebElement enlarge_zoomin;
	
	@FindBy(xpath = "//button[@class='_JS_zoomOut _JS_zoomControls zoomoutbtn']")
	private static WebElement enlarge_zoomout;
	
	@FindBy(xpath = "//a[@class='enlargeclose']")
	private static WebElement enlarge_close;
	
	@FindBy(xpath = "//img[@alt='Totables enlarged']")
	private static WebElement enlarge_img;
	
	@FindBy(xpath = "//a[@title='Learn More']")
	private static WebElement learnmore;
	
	@FindBy(xpath = "//h1[text()='Using My FSA or HSA to Purchase Preparation H Products']")
	private static WebElement learnmore_txt;
	
	@FindBy(xpath = "//span[text()='Benefits']")
	private static WebElement benefits;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item odd first is-active']")
	private static WebElement benefits_Active;
	
	@FindBy(xpath = "//a[text()='Ointment']")
	private static WebElement ointment;

	@FindBy(xpath = "//h1[text()='Ointment']")
	private static WebElement ointment_txt;
	
	@FindBy(xpath = "//a[text()='Multi-Symptom Cream']")
	private static WebElement multisymptomscreame;
	
	@FindBy(xpath = "//h1[text()='Multi-Symptom Cream']")
	private static WebElement multisymptomscreame_txt;
	
	@FindBy(xpath = "//a[text()='Cooling Gel']")
	private static WebElement cooiling;
	
	@FindBy(xpath = "//h1[text()='Cooling Gel']")
	private static WebElement cooiling_txt;
	
	@FindBy(xpath = "//a[text()='Suppositories']")
	private static WebElement suppositories;
	
	@FindBy(xpath = "//h1[text()='Suppositories']")
	private static WebElement suppositories_txt;
	
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
			public void clickonTotablesBreadcrumbs() throws Exception{
		    	waitForPageLoadJava();
				moveToElement(Totables_Breadcrumbs);
				if (isElementPresent(Totables_Breadcrumbs)) {
					clickElementUsingJavaScript(Totables_Breadcrumbs);
					visibilityOf(Totables_txt_Breadcrumbs);
					boolean elementIsDisplayed=elementIsDisplayed(Totables_txt_Breadcrumbs);
					Assert.assertTrue(elementIsDisplayed(Totables_txt_Breadcrumbs));
					pageLoad();
				} else {
					throw new Exception("Totables_Breadcrumbs are not Present on Page");
				}
				
			}		
			public void clickonFullproductlabel() throws Exception{
		    	waitForPageLoadJava();
				moveToElement(fullproductlabel);
				if (isElementPresent(fullproductlabel)) {
					clickElementUsingJavaScript(fullproductlabel);
					pageLoad();
				} else {
					throw new Exception("fullproductlabel are not Present on Page");
				}
				
			}	
			public void clickonBuyNowBtn() throws Exception{
		    	waitForPageLoadJava();
				moveToElement(Buynow);
				if (isElementPresent(Buynow)) {
					clickElementUsingJavaScript(Buynow);
					visibilityOf(Buynow_txt);
					boolean elementIsDisplayed=elementIsDisplayed(Buynow_txt);
					Assert.assertTrue(elementIsDisplayed(Buynow_txt));
					clickElementUsingJavaScript(Buynow_Close);
					pageLoad();
				} else {
					throw new Exception("BuyNow button is  not Present on Page");
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
				moveToElement(enlarge);
				if (isElementPresent(enlarge)) {
					clickElementUsingJavaScript(enlarge);
					moveToElement(enlarge_zoomin);
					actionClick(enlarge_zoomin);
					implicitWait();
					moveToElement(enlarge_zoomout);
					actionClick(enlarge_zoomout);
					visibilityOf(enlarge_img);
					boolean elementIsDisplayed=elementIsDisplayed(enlarge_img);
					Assert.assertTrue(elementIsDisplayed(enlarge_img));
					clickElementUsingJavaScript(enlarge_close);
					pageLoad();
				} else {
					throw new Exception("Enlarge view is  not present on Page");
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
			public void clickonBenefitsActive() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(benefits);
				moveToElement(benefits);
				if (isElementPresent(benefits)) {
					clickElementUsingJavaScript(benefits);
					visibilityOf(benefits_Active);
					boolean elementIsDisplayed=elementIsDisplayed(benefits_Active);
					Assert.assertTrue(elementIsDisplayed(benefits_Active));
					pageLoad();
				} else {
					throw new Exception("Benefits Active are not Present on Page");
				}
				
			}	
			public void clickonOintment() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(ointment);
				moveToElement(ointment);
				if (isElementPresent(ointment)) {
					clickElementUsingJavaScript(ointment);
					visibilityOf(ointment_txt);
					boolean elementIsDisplayed=elementIsDisplayed(ointment_txt);
					Assert.assertTrue(elementIsDisplayed(ointment_txt));
					System.out.println(getElementText(ointment_txt));
					pageLoad();
				} else {
					throw new Exception("Ointment are not Present on Page");
				}
				
			}	
			public void clickonMultiSymptomsCreame() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(multisymptomscreame);
				moveToElement(multisymptomscreame);
				if (isElementPresent(multisymptomscreame)) {
					clickElementUsingJavaScript(multisymptomscreame);
					visibilityOf(multisymptomscreame_txt);
					boolean elementIsDisplayed=elementIsDisplayed(multisymptomscreame_txt);
					Assert.assertTrue(elementIsDisplayed(multisymptomscreame_txt));
					System.out.println(getElementText(multisymptomscreame_txt));
					pageLoad();
				} else {
					throw new Exception("multisymptomscreame_txt are not Present on Page");
				}
				
			}	
			public void clickonCooling() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(cooiling);
				moveToElement(cooiling);
				if (isElementPresent(cooiling)) {
					clickElementUsingJavaScript(cooiling);
					visibilityOf(cooiling_txt);
					boolean elementIsDisplayed=elementIsDisplayed(cooiling_txt);
					Assert.assertTrue(elementIsDisplayed(cooiling_txt));
					System.out.println(getElementText(cooiling_txt));
					pageLoad();
				} else {
					throw new Exception("cooiling_txt are not Present on Page");
				}
				
			}	
			public void clickonSuppostories() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(suppositories);
				moveToElement(suppositories);
				if (isElementPresent(suppositories)) {
					clickElementUsingJavaScript(suppositories);
					visibilityOf(suppositories_txt);
					boolean elementIsDisplayed=elementIsDisplayed(suppositories_txt);
					Assert.assertTrue(elementIsDisplayed(suppositories_txt));
					System.out.println(getElementText(suppositories_txt));
					pageLoad();
				} else {
					throw new Exception("suppositories_txt are not Present on Page");
				}
				
			}	
			public void clickonSizes() throws Exception{
		    	waitForPageLoadJava();
		    	scrollDownUsingElement(sizes);
				moveToElement(sizes);
				if (isElementPresent(sizes)) {
					clickElementUsingJavaScript(sizes);
					visibilityOf(sizes);
					boolean elementIsDisplayed=elementIsDisplayed(sizes);
					Assert.assertTrue(elementIsDisplayed(sizes));
					pageLoad();
				} else {
					throw new Exception("sizes are not Present on Page");
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
					pageLoad();
				} else {
					throw new Exception("application_Active are not Present on Page");
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
					pageLoad();
				} else {
					throw new Exception("warning_Active are not Present on Page");
				}
				
			}	
			
	
	
	
	
	
			
			
			
			
			
			
			
			
			
			
			
			
	
	

}
