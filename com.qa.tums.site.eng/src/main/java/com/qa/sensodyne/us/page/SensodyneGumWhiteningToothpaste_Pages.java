package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneGumWhiteningToothpaste_Pages extends BaseClass{
	
	public SensodyneGumWhiteningToothpaste_Pages(){
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
	private static WebElement SensitivityGumBreadCrumbs;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget btn ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
	private static WebElement BuyNowBtn;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement BuyNowClose;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/coupon/\"])[5]")
	private static WebElement getcoupon;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitivity-and-gum-mint-toothpaste/\"])[3]")
	private static WebElement Mint;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitivity-and-gum-fresh-clean-toothpaste/\"])[2]")
	private static WebElement CleanFresh;
	
	@FindBy(xpath = "//p[text()='Associated with gingivitis']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//span[text()='Ingredients']")
	private static WebElement Ingredients;
	
	@FindBy(xpath = "//span[text()='Directions']")
	private static WebElement Direction;
	
	@FindBy(xpath = "//span[text()='Warnings']")
	private static WebElement Warnings;
	
	@FindBy(xpath = "//strong[text()='Two Benefits. One Toothpaste.']")
	private static WebElement Header2;
	
	@FindBy(xpath = "//div[@class=\"title-content\"]")
	private static WebElement Youtubebtn;
	
	@FindBy(xpath = "//iframe[@id=\"ytplayer\"]")
	private static WebElement iframe;
	
	@FindBy(xpath = "//div[@class=\"ytp-cued-thumbnail-overlay\"]")
	private static WebElement iconyoutubebtn;
	
	@FindBy(xpath = "//button[@title=\"Pause (k)\"]")
	private static WebElement Youtubepasebtn;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']")
	private static WebElement Header3;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-mint-toothpaste/\"])[3]")
	private static WebElement popularproduct1;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-extra-whitening-toothpaste/\"])[2]")
	private static WebElement popularproduct2;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-whitening-toothpaste/\"])[2]")
	private static WebElement popularproduct3;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-complete-protection-extra-fresh-toothpaste/\"])[2]")
	private static WebElement popularproduct4;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-fresh-mint-toothpaste/\"])[2]")
	private static WebElement popularproduct5;
	
	@FindBy(xpath = "//a[text()='Get Your Coupon']")
	private static WebElement getyourcoupon;
	
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
    public void clickOnOurSensitivityGumWhiteningBreadCrumbs() throws Exception {
    	moveToElement(SensitivityGumBreadCrumbs);
		clickElementUsingJavaScript(SensitivityGumBreadCrumbs);
	}
    public void clickOnBuyNowButton() throws Exception {
    	moveToElement(BuyNowBtn);
		clickElementUsingJavaScript(BuyNowBtn);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClose);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
	}
    public void clickOnGetCoupon() throws Exception {
    	moveToElement(getcoupon);
		elementClick(getcoupon);
	}
    public void clickOnMint() throws Exception {
    	scrollDownUsingElement(getcoupon);
    	moveToElement(Mint);
		clickElementUsingJavaScript(Mint);
	}
    public void clickOnCleanandFresh() throws Exception {
    	scrollDownUsingElement(getcoupon);
    	moveToElement(CleanFresh);
		clickElementUsingJavaScript(CleanFresh);
	}
    public void clickOnIngredients() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(Ingredients);
		clickElementUsingJavaScript(Ingredients);
	}
    public void clickOnDirections() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(Direction);
		clickElementUsingJavaScript(Direction);
	}
    public void clickOnWarnings() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(Warnings);
		clickElementUsingJavaScript(Warnings);
	}
    public void clickOnYouTubeLink() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(Youtubebtn);
		clickElementUsingJavaScript(Youtubebtn);
		visibilityOf(iframe);
		switchToFrameUsingElement(iframe);
		moveToElement(iconyoutubebtn);
		actionClick(iconyoutubebtn);
		Thread.sleep(1000);
		clickElementUsingJavaScript(Youtubepasebtn);
		System.out.println("Video is playing Successfully");
		frameSwitchingToDefaultContent();
	}
    public void clickOnPopularProduct1() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(popularproduct1);
		clickElementUsingJavaScript(popularproduct1);
	}
    public void clickOnPopularProduct2() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(popularproduct2);
		clickElementUsingJavaScript(popularproduct2);
	}
    public void clickOnPopularProduct3() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(popularproduct3);
		clickElementUsingJavaScript(popularproduct3);
	}
    public void clickOnPopularProduct4() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(popularproduct4);
		clickElementUsingJavaScript(popularproduct4);
	}
    public void clickOnPopularProduct5() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(popularproduct5);
		clickElementUsingJavaScript(popularproduct5);
	}
    public void clickOnGetyourcoupon() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(getyourcoupon);
		clickElementUsingJavaScript(getyourcoupon);
	}
    public void clickOnFinfYourStore() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(findstore);
		clickElementUsingJavaScript(findstore);
	}
	
	
	
	

}
