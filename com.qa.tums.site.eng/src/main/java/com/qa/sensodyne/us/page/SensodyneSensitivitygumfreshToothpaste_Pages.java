package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneSensitivitygumfreshToothpaste_Pages extends BaseClass{
		
		public SensodyneSensitivitygumfreshToothpaste_Pages(){
			 PageFactory.initElements(driver, this);
		 }
		@FindBy(xpath = "//button[text()='Accept Cookies']")
	    private static WebElement cookieBtn;

	    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	    private static WebElement cookieClose;

	    @FindBy(xpath = "(//h2[text()='Sign Up & Save!'])[2]")
	    private static WebElement gigyaForm;

	    @FindBy(xpath = "//div[contains(@class,'content_hide')]")
	    private static WebElement gigyaClose;
		
		@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even \"]")
		private static WebElement OurProductsBreadCrumbs;
		
		@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd last is-current \"]")
		private static WebElement SensitivitygumcleanfreshBreadCrumbs;
		
		@FindBy(xpath = "(//a[@class=\"ps-widget btn ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
		private static WebElement BuyNowBtn;
	
		@FindBy(xpath = "//span[@class=\"ps-lightbox-close\"]")
		private static WebElement BuyNowClose;
	
		@FindBy(xpath = "//div[@class=\"richText component section hide-mobile col-xs-12 Product-CTA fixed-component\"]//child::a")
		private static WebElement getCoupons;
	
		@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitivity-and-gum-mint-toothpaste/\"])[3]")
		private static WebElement Mint;
	
		@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitivity-and-gum-whitening-toothpaste/\"])[2]")
		private static WebElement whitening;
	
		@FindBy(xpath = "//span[text()='Ingredients']")
		private static WebElement Ingredients;
		
		@FindBy(xpath = "//span[text()='Directions']")
		private static WebElement Directions;
		
		@FindBy(xpath = "//span[text()='Warnings']")
		private static WebElement Warnings;
		
		@FindBy(xpath = "//strong[text()='Two Benefits. One Toothpaste.']")
		private static WebElement Header1;
		
		@FindBy(xpath = "//div[@class=\"title-content\"]")
		private static WebElement Youtubebtn;
		
		@FindBy(xpath = "//div[@class=\"ytp-cued-thumbnail-overlay\"]")
		private static WebElement iconyoutube;
		
		@FindBy(xpath = "//iframe[@id=\"ytplayer\"]")
		private static WebElement iframebtn;
		
		@FindBy(xpath = "//button[@title=\"Pause (k)\"]")
		private static WebElement Youtubepause;
		
		@FindBy(xpath = "//span[text()='Most Popular Products']")
		private static WebElement Header2;
		
		@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-mint-toothpaste/\"])[3]")
		private static WebElement PopularProduct1;
		
		@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-extra-whitening-toothpaste/\"])[2]")
		private static WebElement PopularProduct2;
		
		@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-whitening-toothpaste/\"])[2]")
		private static WebElement PopularProduct3;
		
		@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-complete-protection-extra-fresh-toothpaste/\"])[2]")
		private static WebElement PopularProduct4;
		
		@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-fresh-mint-toothpaste/\"])[2]")
		private static WebElement PopularProduct5;
		
		@FindBy(xpath = "//a[text()='Get Your Coupon']")
		private static WebElement getyourCoupon;
		
		
		@FindBy(xpath = "//a[text()='Find Your Store']")
		private static WebElement findstore;
		
		
		
		
		//Methods//
		
		public void clickCookieBtn() throws Exception {
	        elementToBeClickable(cookieBtn);
	        try {
	            if (cookieBtn.isDisplayed()) {
	                elementClick(cookieBtn);
	            }
	            visibilityOf(cookieClose);
	            Assert.assertTrue(elementIsDisplayed(cookieClose));
	            elementClick(cookieClose);
	        } catch (Exception e) {
	        }
	    }
	    public void clickGigyaForm() throws Exception {
	        elementToBeClickable(gigyaForm);
	        try {
	            if (gigyaForm.isDisplayed()) {
	                elementClick(gigyaForm);
	            }
	            visibilityOf(gigyaClose);
	            implicitWait();
	            Assert.assertTrue(elementIsDisplayed(gigyaClose));
	            elementClick(gigyaClose);
	        } catch (Exception e) {
	       }
	    }
	    public void clickOnOurProductsBreadCrumbs() throws Exception {
	    	moveToElement(OurProductsBreadCrumbs);
			clickElementUsingJavaScript(OurProductsBreadCrumbs);
		}
	    public void clickOnSensitivityGumCleanFreshBreadCrumbs() throws Exception {
	    	moveToElement(SensitivitygumcleanfreshBreadCrumbs);
			clickElementUsingJavaScript(SensitivitygumcleanfreshBreadCrumbs);
		}
	    public void clickOnBuyNowLink() throws Exception {
	    	moveToElement(BuyNowBtn);
			clickElementUsingJavaScript(BuyNowBtn);
			visibilityOf(BuyNowClose);
			boolean elementIsDisplayed=elementIsDisplayed(BuyNowClose);
			Assert.assertTrue(elementIsDisplayed);
			clickElementUsingJavaScript(BuyNowClose);
		}
	    public void clickOnGetCoupons() throws Exception {
	    	moveToElement(getCoupons);
			elementClick(getCoupons);
		}
	    public void clickOnMint() throws Exception {
	    	scrollDownUsingElement(getCoupons);
	    	moveToElement(Mint);
			clickElementUsingJavaScript(Mint);
		}
	    public void clickOnWhitening() throws Exception {
	    	scrollDownUsingElement(getCoupons);
	    	moveToElement(whitening);
			clickElementUsingJavaScript(whitening);
		}
	    public void clickOnIngredients() throws Exception {
	    	moveToElement(Ingredients);
			clickElementUsingJavaScript(Ingredients);
		}
	    public void clickOnDirections() throws Exception {
	    	moveToElement(Directions);
			clickElementUsingJavaScript(Directions);
		}
	    public void clickOnWarnings() throws Exception {
	    	moveToElement(Warnings);
			clickElementUsingJavaScript(Warnings);
		}
	    public void clickOnYoutubelink() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	moveToElement(Youtubebtn);
			clickElementUsingJavaScript(Youtubebtn);
			visibilityOf(iframebtn);
			switchToFrameUsingElement(iframebtn);
			moveToElement(iconyoutube);
			actionClick(iconyoutube);
			Thread.sleep(1000);
			clickElementUsingJavaScript(iconyoutube);
			System.out.println("Play the Video successfully");
			frameSwitchingToDefaultContent();
		}
	    public void clickOnPopularProducts1() throws Exception {
	    	scrollDownUsingElement(Header2);
	    	moveToElement(PopularProduct1);
			clickElementUsingJavaScript(PopularProduct1);
		}
	    public void clickOnPopularProducts2() throws Exception {
	    	scrollDownUsingElement(Header2);
	    	moveToElement(PopularProduct2);
			clickElementUsingJavaScript(PopularProduct2);
		}
	    public void clickOnPopularProducts3() throws Exception {
	    	scrollDownUsingElement(Header2);
	    	moveToElement(PopularProduct3);
			clickElementUsingJavaScript(PopularProduct3);
		}
	    public void clickOnPopularProducts4() throws Exception {
	    	scrollDownUsingElement(Header2);
	    	moveToElement(PopularProduct4);
			clickElementUsingJavaScript(PopularProduct4);
		}
	    public void clickOnPopularProducts5() throws Exception {
	    	scrollDownUsingElement(Header2);
	    	moveToElement(PopularProduct5);
			clickElementUsingJavaScript(PopularProduct5);
		}
	    public void clickOnGetyourCoupon() throws Exception {
	    	scrollDownUsingElement(Header2);
	    	moveToElement(getyourCoupon);
			clickElementUsingJavaScript(getyourCoupon);
		}
	    public void clickOnFindStore() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(Header2);
	    	moveToElement(findstore);
			clickElementUsingJavaScript(findstore);
			
		}
	
	
	
	
	
	

}
