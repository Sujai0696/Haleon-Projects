package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaTriggerFreeSummerVacatioPlanningPage extends BaseClass{
	
	public AbrevaTriggerFreeSummerVacatioPlanningPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//a[text()='Managing Your Triggers']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement breadcrumbOne;
    
    @FindBy(xpath = "//a[text()='sun exposure']//self::a[@href='/managing-lip-health/cold-sore-triggers/sun-and-cold-sores/']")
    private static WebElement hyperLinkSunExposure;
    
    @FindBy(xpath = "//a[text()='stress wears down your immune system']//self::a[@href='/managing-lip-health/cold-sore-triggers/stress-can-trigger-the-tingle/']")
    private static WebElement hyperLinkStressWearsDown;
    
    @FindBy(xpath = "//a[text()='act on it']//self::a[@href='/cold-sore-first-signs/']")
    private static WebElement hyperLinkActOnIt;
    
    @FindBy(xpath = "//a[text()='TRIGGER. TINGLE. TREATMENT']//self::a[@href='/about-cold-sores/what-triggers-your-cold-sores/']//ancestor::div[@class='image component section article-promo-img clickable-box first odd grid_4 alpha']")
    private static WebElement wholeCardSecOne;
    
    @FindBy(xpath = "//a[text()='Sun and Cold Sores | Abreva']//self::a[@href='/managing-lip-health/cold-sore-triggers/sun-and-cold-sores/']//ancestor::div[@class='image component section article-promo-img clickable-box even grid_4']")
    private static WebElement wholeCardSecTwo;
    
    @FindBy(xpath = "//a[text()='STRESS CAN TRIGGER THE TINGLE']//self::a[@href='/managing-lip-health/cold-sore-triggers/stress-can-trigger-the-tingle/']//ancestor::div[@class='image component section article-promo-img clickable-box odd last grid_4 omega']")
    private static WebElement wholeCardSecThree;
    
    @FindBy(xpath = "//span[text()='GET COUPON']//ancestor::a[@href='/coupon/']")
    private static WebElement getcoupon;
    
    @FindBy(xpath = "//div[@class='parametrizedhtml component section default-style reference-abreva-price-spider-button fixedcomponent6 fixed-component image']//ancestor::span[text()='BUY NOW']")
    private static WebElement buyNow;
    
    @FindBy(xpath = "//h2[@class='ps-product-name']//self::h2[text()='Oral Care Pump']")
    private static WebElement buyNowText;
    
    @FindBy(xpath = "//span[@class='ps-lightbox-close']")
    private static WebElement buyNowClose;
    
    @FindBy(xpath = "//span[text()='BUY NOW']//ancestor::a[@tabindex='0']//self::a[@aria-hidden='false']")
    private static WebElement buyNowCloseVerify;
    
    
   
	
    
    public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Dismiss is not presented");
			throw new Exception("Unable to click on cookie Pop-up");
		}
	}
    
    public void clickBreadcrumbOne() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(breadcrumbOne)) {
			scrollDownUsingElement(breadcrumbOne);
			clickElementUsingJavaScript(breadcrumbOne);
			pageLoad();
			System.out.println("Breadcrumb One clicked successfully");
		} else {
			System.out.println("Breadcrumb One is not presented in the page");
			throw new Exception("Breadcrumb One is not presented in the page");
		}
	}
	
    
    public void clickHyperLinkSunExposure() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkSunExposure)) {
			scrollDownUsingElement(hyperLinkSunExposure);
			clickElementUsingJavaScript(hyperLinkSunExposure);
			pageLoad();
			System.out.println("HyperLink Sun Exposure clicked successfully");
		} else {
			System.out.println("HyperLink Sun Exposure is not presented in the page");
			throw new Exception("HyperLink Sun Exposure is not presented in the page");
		}
	}
    
    public void clickHyperLinkStressWearsDown() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkStressWearsDown)) {
			scrollDownUsingElement(hyperLinkStressWearsDown);
			clickElementUsingJavaScript(hyperLinkStressWearsDown);
			pageLoad();
			System.out.println("HyperLink Stress Wears Down clicked successfully");
		} else {
			System.out.println("HyperLink Stress Wears Down is not presented in the page");
			throw new Exception("HyperLink Stress Wears Down is not presented in the page");
		}
	}
    
    public void clickHyperLinkActOnIt() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkActOnIt)) {
			scrollDownUsingElement(hyperLinkActOnIt);
			clickElementUsingJavaScript(hyperLinkActOnIt);
			pageLoad();
			System.out.println("HyperLink Act On It clicked successfully");
		} else {
			System.out.println("HyperLink Act On It is not presented in the page");
			throw new Exception("HyperLink Act On It is not presented in the page");
		}
	}
    
    public void clickWholeCardSecOne() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(wholeCardSecOne)) {
			scrollDownUsingElement(wholeCardSecOne);
			clickElementUsingJavaScript(wholeCardSecOne);
			pageLoad();
			System.out.println("HyperLink Whole Card Sec One clicked successfully");
		} else {
			System.out.println("HyperLink Whole Card Sec One is not presented in the page");
			throw new Exception("HyperLink Whole Card Sec One is not presented in the page");
		}
	}
    
    public void clickWholeCardSecTwo() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(wholeCardSecTwo)) {
			scrollDownUsingElement(wholeCardSecTwo);
			clickElementUsingJavaScript(wholeCardSecTwo);
			pageLoad();
			System.out.println("HyperLink Whole Card Sec Two clicked successfully");
		} else {
			System.out.println("HyperLink Whole Card Sec Two is not presented in the page");
			throw new Exception("HyperLink Whole Card Sec Two is not presented in the page");
		}
	}
    
    public void clickWholeCardSecThree() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(wholeCardSecThree)) {
			scrollDownUsingElement(wholeCardSecThree);
			clickElementUsingJavaScript(wholeCardSecThree);
			pageLoad();
			System.out.println("HyperLink Whole Card Sec Three clicked successfully");
		} else {
			System.out.println("HyperLink Whole Card Sec Three is not presented in the page");
			throw new Exception("HyperLink Whole Card Sec Three is not presented in the page");
		}
	}
    
    public void clickGetcoupon() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(getcoupon)) {
			scrollDownUsingElement(getcoupon);
			clickElementUsingJavaScript(getcoupon);
			pageLoad();
			System.out.println("HyperLink Get coupon clicked successfully");
		} else {
			System.out.println("HyperLink Get coupon is not presented in the page");
			throw new Exception("HyperLink Get coupon is not presented in the page");
		}
	}
    
    
    
    public void clickBuyNow() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(buyNow)) {
    		scrollDownUsingElement(buyNow);
    		clickElementUsingJavaScript(buyNow);
    		visibilityOf(buyNowText);
    		Assert.assertTrue(elementIsDisplayed(buyNowText));
    		clickElementUsingJavaScript(buyNowClose);
    		visibilityOf(buyNowCloseVerify);
    		Assert.assertTrue(elementIsDisplayed(buyNowCloseVerify));
    		System.out.println("Buy Now button successfully verified");
		} else {
			System.out.println("Buy Now Button is not Presented in the page");
			throw new Exception("Buy Now Button is not Presented in the page");
		}
	}

}
