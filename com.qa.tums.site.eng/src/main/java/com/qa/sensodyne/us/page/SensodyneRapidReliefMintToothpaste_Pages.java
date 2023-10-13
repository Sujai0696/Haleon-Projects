package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneRapidReliefMintToothpaste_Pages extends BaseClass{
	
	public SensodyneRapidReliefMintToothpaste_Pages() {
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
	private static WebElement SensodyneRapidReliefMintToothpasteBreadcrumbs;
	
	@FindBy(xpath = "//button[text()='Write a review ']")
	private static WebElement ReviewBtn;
	
	@FindBy(xpath = "//h2[@class=\"bv-mbox-breadcrumb\"]")
	private static WebElement ReviewClose;
	
	@FindBy(xpath = "//span[text()='My Review for Rapid Relief - Mint']")
	private static WebElement ReviewTxt;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget btn ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
	private static WebElement BuyNowBtn;
	
	@FindBy(xpath = "//h2[text()='Rapid Relief, Mint 3.4 oz']")
	private static WebElement BuyNowTxt;
	
	@FindBy(xpath = "//span[@class=\"ps-lightbox-close\"]")
	private static WebElement BuyNowClose;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/coupon/\"])[5]")
	private static WebElement GetCoupon;
	
	@FindBy(xpath = "//a[text()='Extra Fresh']")
	private static WebElement extrafresh;
	
	@FindBy(xpath = "//a[text()='Whitening']")
	private static WebElement whitening;
	
	@FindBy(xpath = "//span[text()='Ingredients']")
	private static WebElement Ingredients;
	
	@FindBy(xpath = "//span[text()='Directions']")
	private static WebElement Directions;
	
	@FindBy(xpath = "//li[@class=\"tabs-nav-item even is-active\"]")
	private static WebElement DirectionsActive;
	
	@FindBy(xpath = "//span[text()='Warnings']")
	private static WebElement warnings;
	
	@FindBy(xpath = "//li[@class=\"tabs-nav-item odd last is-active\"]")
	private static WebElement warningsActive;
	
	@FindBy(xpath = "(//span[text()='*With twice daily brushing'])[2]")
	private static WebElement Header1;
	
	@FindBy(xpath = "//h2[text()='Sensodyne Rapid Relief in Action']")
	private static WebElement Header2;
	
	@FindBy(xpath = "(//div[@class=\"title-content\"])[1]")
	private static WebElement YouTubeBtn;

	@FindBy(xpath = "//iframe[@id=\"ytplayer\"]")
	private static WebElement iframe;
	
	@FindBy(xpath = "//div[@class=\"ytp-cued-thumbnail-overlay\"]")
	private static WebElement iconyoutubebtn;

	@FindBy(xpath = "//button[@title=\"Pause (k)\"]")
	private static WebElement pauseyoutubebtn;
	
	@FindBy(xpath = "//a[text()='Learn More']")
	private static WebElement learnmore;
	
	@FindBy(xpath = "(//div[@class=\"title-content\"])[2]")
	private static WebElement Youtubebtn1;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']")
	private static WebElement Header3;
	
	@FindBy(xpath = "//a[text()='Rapid Relief']")
	private static WebElement popularproduct1;
	
	@FindBy(xpath = "//span[text()='Extra Whitening']")
	private static WebElement popularproduct2;
	
	@FindBy(xpath = "//a[text()='Repair and Protect']")
	private static WebElement popularproduct3;
	
	@FindBy(xpath = "//a[text()='Complete Protection']")
	private static WebElement popularproduct4;
	
	@FindBy(xpath = "//span[text()='Fresh Mint']")
	private static WebElement popularproduct5;
	
	@FindBy(xpath = "//a[text()='Get Your Coupon']")
	private static WebElement getyourcoupon;
	
	@FindBy(xpath = "//a[text()='Find Your Store']")
	private static WebElement findyourstore;
	
	
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
    public void clickOnSensodyneRapidReliefMintToothpasteBreadCrumbs() throws Exception {
    	moveToElement(SensodyneRapidReliefMintToothpasteBreadcrumbs);
		clickElementUsingJavaScript(SensodyneRapidReliefMintToothpasteBreadcrumbs);
	}
    public void clickOnReviewBtn() throws Exception {
    	moveToElement(ReviewBtn);
		clickElementUsingJavaScript(ReviewBtn);
		//visibilityOf(ReviewClose);
//		boolean elementIsDisplayed=elementIsDisplayed(ReviewTxt);
//		Assert.assertTrue(elementIsDisplayed);
//		clickElementUsingJavaScript(ReviewClose);
	}
    public void clickOnBuyNowBtn() throws Exception {
    	moveToElement(BuyNowBtn);
		clickElementUsingJavaScript(BuyNowBtn);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowTxt);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
	}
    public void clickOnGetCoupon() throws Exception {
    	moveToElement(GetCoupon);
		clickElementUsingJavaScript(GetCoupon);
	}
    public void clickOnExtrafresh() throws Exception {
    	moveToElement(extrafresh);
		clickElementUsingJavaScript(extrafresh);
	}
    public void clickOnwhitening() throws Exception {
    	moveToElement(whitening);
		clickElementUsingJavaScript(whitening);
	}
    public void clickOnIngredients() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(Ingredients);
		clickElementUsingJavaScript(Ingredients);
	}
    public void clickOnDirections() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(Directions);
		clickElementUsingJavaScript(Directions);
		visibilityOf(DirectionsActive);
		boolean elementIsDisplayed=elementIsDisplayed(DirectionsActive);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(DirectionsActive);
	}
    public void clickOnWarnings() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(warnings);
		clickElementUsingJavaScript(warnings);
		visibilityOf(warningsActive);
		boolean elementIsDisplayed=elementIsDisplayed(warningsActive);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(warningsActive);
	}
    public void clickOnYouTubelink1() throws Exception {
    	scrollDownUsingElement(Header2);
    	//moveToElement(YouTubeBtn);
		clickElementUsingJavaScript(YouTubeBtn);
		visibilityOf(iframe);
		switchToFrameUsingElement(iframe);
		//moveToElement(iconyoutubebtn);
		actionClick(iconyoutubebtn);
		Thread.sleep(1000);
		//boolean elementIsDisplayed=elementIsDisplayed(pauseyoutubebtn);
		//Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(iconyoutubebtn);
		frameSwitchingToDefaultContent();
	}
    public void clickOnPopularproduct1() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(popularproduct1);
		clickElementUsingJavaScript(popularproduct1);
	}
    public void clickOnPopularproduct2() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(popularproduct2);
		clickElementUsingJavaScript(popularproduct2);
	}
    public void clickOnPopularproduct3() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(popularproduct3);
		clickElementUsingJavaScript(popularproduct3);
	}
    public void clickOnPopularproduct4() throws Exception {
    	//scrollDownUsingElement(Header3);
    	moveToElement(popularproduct4);
		clickElementUsingJavaScript(popularproduct4);
	}
    public void clickOnPopularproduct5() throws Exception {
    	//scrollDownUsingElement(Header3);
    	moveToElement(popularproduct5);
		clickElementUsingJavaScript(popularproduct5);
	}
    public void clickOnGetyourcoupon() throws Exception {
    	//scrollDownUsingElement(Header3);
    	moveToElement(getyourcoupon);
		clickElementUsingJavaScript(getyourcoupon);
	}
    public void clickOnfindyourstore() throws Exception {
    	//scrollDownUsingElement(Header3);
    	moveToElement(findyourstore);
		clickElementUsingJavaScript(findyourstore);
	}
	
	
	
	
	
	

}
