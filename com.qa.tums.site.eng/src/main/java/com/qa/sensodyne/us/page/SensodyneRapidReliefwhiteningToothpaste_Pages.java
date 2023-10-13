package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneRapidReliefwhiteningToothpaste_Pages extends BaseClass{
	
	public SensodyneRapidReliefwhiteningToothpaste_Pages(){
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
	private static WebElement ourproductsBreadcrumbs;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd last is-current \"]")
	private static WebElement RapidReliefToothpasteBreadcrumbs;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget btn ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
	private static WebElement BuyNowBtn;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement BuyNowClose;
	
	@FindBy(xpath = "//div[@class=\"richText component section hide-mobile col-xs-12 Product-CTA fixed-component\"]//child::a")
	private static WebElement getcoupon;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-extra-fresh-toothpaste/\"])[2]")
	private static WebElement Extrafresh;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-mint-toothpaste/\"])[3]")
	private static WebElement Mint;
	
	@FindBy(xpath = "//span[text()='Ingredients']")
	private static WebElement Ingredients;
	
	@FindBy(xpath = "(//div[@class=\"title-content\"])[1]")
	private static WebElement Youtubebtn;
	
	@FindBy(xpath = "//iframe[@id=\"ytplayer\"]")
	private static WebElement iframe;
	
	@FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay']")
	private static WebElement btnYoutubeIcon;
	
	@FindBy(xpath = "//button[@title=\"Pause (k)\"]")
	private static WebElement Youtubepausebtn;
	
	@FindBy(xpath = "//span[text()='Directions']")
	private static WebElement Direction;
	
	@FindBy(xpath = "//span[text()='Warnings']")
	private static WebElement Warnings;
	
	@FindBy(xpath = "//span[text()='Engineered for Speed']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//a[text()='Learn More']")
	private static WebElement learnmore;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']")
	private static WebElement Header2;
	
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
	private static WebElement getcoupons1;
	
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
    public void clickOnOurProductsBreadcrumbs() throws Exception {
    	moveToElement(ourproductsBreadcrumbs);
		clickElementUsingJavaScript(ourproductsBreadcrumbs);
	}
    public void clickOnRapidReliefToothpasteBreadcrumbs() throws Exception {
    	moveToElement(RapidReliefToothpasteBreadcrumbs);
		clickElementUsingJavaScript(RapidReliefToothpasteBreadcrumbs);
	}
    public void clickOnBuyNowBtn() throws Exception {
    	moveToElement(BuyNowBtn);
		clickElementUsingJavaScript(BuyNowBtn);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClose);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
		refreshWebPage();
		
	}
    public void clickOngetcoupon() throws Exception {
    	moveToElement(getcoupon);
		clickElementUsingJavaScript(getcoupon);
	}
    public void clickOnExtraFresh() throws Exception {
    	scrollPageInUpAndDown();
    	moveToElement(Extrafresh);
		clickElementUsingJavaScript(Extrafresh);
	}
    public void clickOnMint() throws Exception {
    	scrollPageInUpAndDown();
    	moveToElement(Mint);
		clickElementUsingJavaScript(Mint);
	}
    public void clickOnYouTubeLink() throws Exception {
    	scrollDownUsingElement(Ingredients);
    	//moveToElement(Youtubebtn);
		clickElementUsingJavaScript(Youtubebtn);
		visibilityOf(iframe);
		switchToFrameUsingElement(iframe);
		moveToElement(btnYoutubeIcon);
		actionClick(btnYoutubeIcon);
		Thread.sleep(1000);
		clickElementUsingJavaScript(Youtubepausebtn);
		System.out.println("Video is playing Successfully");
		frameSwitchingToDefaultContent();
	}
    public void clickOnDirection() throws Exception {
    	scrollDownUsingElement(Ingredients);
    	moveToElement(Direction);
		clickElementUsingJavaScript(Direction);
	}
    public void clickOnWarnings() throws Exception {
    	scrollDownUsingElement(Ingredients);
    	moveToElement(Warnings);
		clickElementUsingJavaScript(Warnings);
	}
    public void clickOnLearnmore() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(learnmore);
		clickElementUsingJavaScript(learnmore);
	}
    public void clickOnPopularProduct1() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(PopularProduct1);
		clickElementUsingJavaScript(PopularProduct1);
	}
    public void clickOnPopularProduct2() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(PopularProduct2);
		clickElementUsingJavaScript(PopularProduct2);
	}
    public void clickOnPopularProduct3() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(PopularProduct3);
		clickElementUsingJavaScript(PopularProduct3);
	}
    public void clickOnPopularProduct4() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(PopularProduct4);
		clickElementUsingJavaScript(PopularProduct4);
	}
    public void clickOnGetCoupons1() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(getcoupons1);
		clickElementUsingJavaScript(getcoupons1);
	}
    public void clickOnFindStore() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(findstore);
		clickElementUsingJavaScript(findstore);
	}
	
	
	

}
