package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneSensitivityGummintToothpaste_Pages extends BaseClass {
	
	public SensodyneSensitivityGummintToothpaste_Pages() {
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
	private static WebElement OurproductsBreadcrumbs;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd last is-current \"]")
	private static WebElement SensodyneSensitivityGumMintBreadcrumbs;
	
	@FindBy(xpath = "//button[text()='Write a review ']")
	private static WebElement ReviewBtn;
	
	@FindBy(xpath = "//span[text()='My Review for Sensitivity & Gum - Mint']")
	private static WebElement ReviewBtnTxt;
	
	@FindBy(xpath = "//button[@class=\"bv-mbox-close bv-focusable\"]")
	private static WebElement ReviewBtnClose;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget btn ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
	private static WebElement BuyNowBtn;
	
	@FindBy(xpath = "//h2[text()='Sensitivity & Gum, Mint 3.4 oz']")
	private static WebElement BuyNowTxt;
	
	@FindBy(xpath = "//span[@class=\"ps-lightbox-close\"]")
	private static WebElement BuyNowClose;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/coupon/\"])[5]")
	private static WebElement GetCoupon;
	
	@FindBy(xpath = "//a[text()='Whitening']")
	private static WebElement Whitening;
	
	@FindBy(xpath = "//a[text()='Clean & Fresh']")
	private static WebElement CleanFresh;
	
	@FindBy(xpath = "//span[text()='Ingredients']")
	private static WebElement Ingredients;
	
	@FindBy(xpath = "//span[text()='Directions']")
	private static WebElement Directions;
	
	@FindBy(xpath = "//li[@class=\"tabs-nav-item even is-active\"]")
	private static WebElement DirectionsActive;
	
	@FindBy(xpath = "//span[text()='Warnings']")
	private static WebElement Warnings;
	
	@FindBy(xpath = "//li[@class=\"tabs-nav-item odd last is-active\"]")
	private static WebElement WarningsActive;
	
	@FindBy(xpath = "//div[@class=\"title-content\"]")
	private static WebElement YouTubeBtn;
	
	@FindBy(xpath = "//iframe[@id=\"ytplayer\"]")
	private static WebElement iframebtn;
	
	@FindBy(xpath = "//div[@class=\"ytp-cued-thumbnail-overlay\"]")
	private static WebElement thumbnailIcon;
	
	@FindBy(xpath = "//button[@title=\"Play (k)\"]")
	private static WebElement PauseYouTubeBtn;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//a[text()='Rapid Relief']")
	private static WebElement PopularProduct1;
	
	@FindBy(xpath = "//span[text()='Extra Whitening']")
	private static WebElement PopularProduct2;
	
	@FindBy(xpath = "//a[text()='Repair and Protect']")
	private static WebElement PopularProduct3;
	
	@FindBy(xpath = "//a[text()='Complete Protection']")
	private static WebElement PopularProduct4;
	
	@FindBy(xpath = "//span[text()='Fresh Mint']")
	private static WebElement PopularProduct5;
	
	@FindBy(xpath = "//a[text()='Get Your Coupon']")
	private static WebElement GetCoupons1;
	
	@FindBy(xpath = "//a[text()='Find Your Store']")
	private static WebElement FindStore;
	
	
	
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
		    	moveToElement(OurproductsBreadcrumbs);
				clickElementUsingJavaScript(OurproductsBreadcrumbs);
			}
		    public void clickOnSensodyneSensitivityGumMintBreadCrumbs() throws Exception {
		    	moveToElement(SensodyneSensitivityGumMintBreadcrumbs);
				clickElementUsingJavaScript(SensodyneSensitivityGumMintBreadcrumbs);
			}
		    public void clickOnReviewBtn() throws Exception {
		    	moveToElement(ReviewBtn);
				clickElementUsingJavaScript(ReviewBtn);
				visibilityOf(ReviewBtnClose);
				//boolean elementIsDisplayed=elementIsDisplayed(ReviewBtnTxt);
				//Assert.assertTrue(elementIsDisplayed);
				clickElementUsingJavaScript(ReviewBtnClose);
			}
		    public void clickOnBuyNowBtn() throws Exception {
		    	moveToElement(BuyNowBtn);
				clickElementUsingJavaScript(BuyNowBtn);
				visibilityOf(BuyNowClose);
				boolean elementIsDisplayed=elementIsDisplayed(BuyNowTxt);
				Assert.assertTrue(elementIsDisplayed);
				clickElementUsingJavaScript(BuyNowClose);
			}
		    public void clickOnGetCoupons() throws Exception {
		    	moveToElement(GetCoupon);
				clickElementUsingJavaScript(GetCoupon);
			}
		    public void clickOnWhitening() throws Exception {
		    	scrollDownUsingElement(GetCoupon);
		    	moveToElement(Whitening);
				clickElementUsingJavaScript(Whitening);
			}
		    public void clickOnCleanFresh() throws Exception {
		    	scrollDownUsingElement(GetCoupon);
		    	moveToElement(CleanFresh);
				clickElementUsingJavaScript(CleanFresh);
			}
		    public void clickOnIngredients() throws Exception {
		    	scrollDownUsingElement(CleanFresh);
		    	moveToElement(Ingredients);
				clickElementUsingJavaScript(Ingredients);
			}
		    public void clickOnDirection() throws Exception {
		    	scrollDownUsingElement(CleanFresh);
		    	moveToElement(Directions);
				clickElementUsingJavaScript(Directions);
				visibilityOf(DirectionsActive);
				boolean elementIsDisplayed=elementIsDisplayed(DirectionsActive);
				Assert.assertTrue(elementIsDisplayed);
				clickElementUsingJavaScript(DirectionsActive);
			}
		    public void clickOnWarnings() throws Exception {
		    	scrollDownUsingElement(CleanFresh);
		    	moveToElement(Warnings);
				clickElementUsingJavaScript(Warnings);
				visibilityOf(WarningsActive);
				boolean elementIsDisplayed=elementIsDisplayed(WarningsActive);
				Assert.assertTrue(elementIsDisplayed);
				clickElementUsingJavaScript(WarningsActive);
			}
		    public void clickOnYouTubeLink() throws Exception {
		    	scrollDownUsingElement(Warnings);
		    	moveToElement(YouTubeBtn);
				clickElementUsingJavaScript(YouTubeBtn);
				visibilityOf(iframebtn);
				switchToFrameUsingElement(iframebtn);
				//moveToElement(thumbnailIcon);
				actionClick(thumbnailIcon);
				Thread.sleep(1000);
				//Assert.assertTrue(elementIsDisplayed(PauseYouTubeBtn));
				clickElementUsingJavaScript(thumbnailIcon);
				frameSwitchingToDefaultContent();
			}
		    public void clickOnPopularProducts1() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(PopularProduct1);
				clickElementUsingJavaScript(PopularProduct1);
			}
		    public void clickOnPopularProducts2() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(PopularProduct2);
				clickElementUsingJavaScript(PopularProduct2);
			}
		    public void clickOnPopularProducts3() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(PopularProduct3);
				clickElementUsingJavaScript(PopularProduct3);
			}
		    public void clickOnPopularProducts4() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(PopularProduct4);
				clickElementUsingJavaScript(PopularProduct4);
			}
		    public void clickOnPopularProducts5() throws Exception {
		    	scrollDownUsingElement(Header1);
		    	moveToElement(PopularProduct5);
				clickElementUsingJavaScript(PopularProduct5);
			}
		    public void clickOnGetCoupons1() throws Exception {
		    	scrollDownUsingElement(PopularProduct5);
		    	moveToElement(GetCoupons1);
				clickElementUsingJavaScript(GetCoupons1);
			}
		    public void clickOnFindStore() throws Exception {
		    	scrollDownUsingElement(PopularProduct5);
		    	moveToElement(FindStore);
				clickElementUsingJavaScript(FindStore);
			}
	
	
	
	
	
	
	
	
	
	
	
	

}
