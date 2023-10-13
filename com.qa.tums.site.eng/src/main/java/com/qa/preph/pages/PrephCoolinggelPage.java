package com.qa.preph.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;
public class PrephCoolinggelPage extends BaseClass{
	
	public PrephCoolinggelPage() {
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
		
	@FindBy(xpath = "//li[text()=' Cooling Gel ']")
	private static WebElement coolingel_Breadcrumbs;	
	
	@FindBy(xpath = "//h1[text()='Cooling Gel']")
	private static WebElement coolingel_txt_Breadcrumbs;
	
	@FindBy(xpath = "//a[text()='Full Product Label']")
	private static WebElement fullproductlabel;
	
	@FindBy(xpath = "//a[@class='ps-widget btn ps-5e9df6d3d1038614b706904e ps-enabled']")
	private static WebElement BuyNowbtn;
	
	@FindBy(xpath = "//h1[text()='Preparation H Cooling Gel 1.8 oz']")
	private static WebElement BuyNowbtn_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement BuyNowbtn_close;
	
	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage coupon-button even last component col-xs-12']//a[@href='/coupons-and-special-offers/']")
	private static WebElement Coupons;
	
	@FindBy(xpath = "//h1[text()='Save and shop Preparation H']")
	private static WebElement Coupons_txt;
	
	@FindBy(xpath = "(//div[@class='richText-content']//a[text()='Enlarge'])[2]")
	private static WebElement EnlargeView;
	
	@FindBy(xpath = "//button[@class='_JS_zoomIn _JS_zoomControls zoominbtn']")
	private static WebElement EnlargeView_zoomin;
	
	@FindBy(xpath = "//button[@class='_JS_zoomOut _JS_zoomControls zoomoutbtn']")
	private static WebElement EnlargeView_zoomout;
	
	@FindBy(xpath = "//img[@alt='Preparation H Cooling Gel enlarged']")
	private static WebElement EnlargeView_img;
	
	@FindBy(xpath = "//a[@class='enlargeclose']")
	private static WebElement EnlargeView_Close;
	
	
	
	
	
	
	
	
	
	
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
				public void clickonCoolinggelBreadcrumbs() throws Exception{
			    	waitForPageLoadJava();
					moveToElement(coolingel_Breadcrumbs);
					if (isElementPresent(coolingel_Breadcrumbs)) {
						clickElementUsingJavaScript(coolingel_Breadcrumbs);
						visibilityOf(coolingel_txt_Breadcrumbs);
						boolean elementIsDisplayed=elementIsDisplayed(coolingel_txt_Breadcrumbs);
						Assert.assertTrue(elementIsDisplayed(coolingel_txt_Breadcrumbs));
						pageLoad();
					} else {
						throw new Exception("coolingel_txt_Breadcrumbs are not Present on Page");
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
					moveToElement(EnlargeView);
					if (isElementPresent(EnlargeView)) {
						clickElementUsingJavaScript(EnlargeView);
						moveToElement(EnlargeView_zoomin);
						actionClick(EnlargeView_zoomin);
						implicitWait();
						moveToElement(EnlargeView_zoomout);
						actionClick(EnlargeView_zoomout);
						visibilityOf(EnlargeView_img);
						boolean elementIsDisplayed=elementIsDisplayed(EnlargeView_img);
						Assert.assertTrue(elementIsDisplayed(EnlargeView_img));
						clickElementUsingJavaScript(EnlargeView_Close);
						pageLoad();
					} else {
						throw new Exception("Enlarge view  is  not present on Page");
					}
					
				}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
