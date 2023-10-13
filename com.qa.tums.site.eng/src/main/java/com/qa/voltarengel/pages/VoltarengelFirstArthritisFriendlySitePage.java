package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class VoltarengelFirstArthritisFriendlySitePage extends BaseClass{
	
	public VoltarengelFirstArthritisFriendlySitePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;

    @FindBy(xpath = "//h2[@class='footer__gigya-heading ']//self::h2[text()='Sign Up. Save.']")
    private static WebElement gigyaForm;

    @FindBy(xpath = "//div[contains(@class,'content_hide')]")
    private static WebElement gigyaClose;
    
    @FindBy(xpath = "//a[@href='/']//self::a[normalize-space()='Homepage']")
    private static WebElement breadcrumbOne;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/']//self::a[text()='Living with Arthritis']")
    private static WebElement breadcrumbTwo;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/first-arthritis-friendly-site/']//self::a[text()='Arthritis-Friendly Website']")
    private static WebElement breadcrumbThree;
    
    @FindBy(xpath = "//a[@href='/understanding-pain/about-pain/']//self::a[text()='arthritis pain']")
    private static WebElement hyperLinkArthritisPain;
    
    @FindBy(xpath = "//a[@href='/what-is-arthritis/']//self::a[text()='arthritis']")
    private static WebElement hyperLinkArthritis;
    
    @FindBy(xpath = "//a[@href='https://www.microsoft.com/en-us/accessibility']//self::a[text()='activate voice search']")
    private static WebElement hyperLinkActivateVoiceSearch;
    
    @FindBy(xpath = "//a[@href='https://www.microsoft.com/en-us/accessibility']//self::a[text()='testimonials']")
    private static WebElement hyperLinkTestimonial;
    
    @FindBy(xpath = "//a[@href='https://www.voltarengel.com/what-is-voltaren/']//self::a[text()='how Voltaren works']")
    private static WebElement hyperLinkHowVoltarenWorks;
    
    @FindBy(xpath = "//a[contains(@href,'/living-with-arthritis/use-your-head-to-navigate-websites/')]//self::a[text()='these features']")
    private static WebElement hyperLinkTheseFeatures;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/use-your-head-to-navigate-websites/']//ancestor::strong[text()='READ MORE']")
    private static WebElement relatedArticleReadMoreOne;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/work/']//ancestor::strong[text()='READ MORE']")
    private static WebElement relatedArticleReadMoreTwo;
    
    @FindBy(xpath = "//a[@href='/samples-and-coupons/coupons/']//self::a[text()='Get Coupons']")
    private static WebElement getCoupons;
    
    @FindBy(xpath = "//span[text()='BUY NOW']//ancestor::button[@class='rd-nr-btn btn voltarenBtnBlueOutline noTextDecoration']")
    private static WebElement buyNow;
    
    @FindBy(xpath = "//div[contains(text(),'Shopping Bag')]/..//img[@alt='close cart icon']")
    private static WebElement buyNowCloseIcon;
    
    @FindBy(xpath = "//div[contains(@style,'background-color: initial;')]")
    private static WebElement verifyBuyNowClose;
    
    
    public void clickBuyNow() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(buyNow)) {
    		scrollDownUsingElement(buyNow);
    		clickElementUsingJavaScript(buyNow);
    		visibilityOf(buyNowCloseIcon);
    		Assert.assertTrue(elementIsDisplayed(buyNowCloseIcon));
    		clickElementUsingJavaScript(buyNowCloseIcon);
    		visibilityOf(verifyBuyNowClose);
    		Assert.assertTrue(elementIsDisplayed(verifyBuyNowClose));
    		System.out.println("Buy Now button successfully verified");
		} else {
			System.out.println("Buy Now Button is not Presented in the page");
			throw new Exception("Buy Now Button is not Presented in the page");
		}
	}
    
    
    
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

	public void clickGigyaForm() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(gigyaForm)) {
			elementToBeClickable(gigyaForm);
			try {
				if (gigyaForm.isDisplayed()) {
					clickElementUsingJavaScript(gigyaForm);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(gigyaClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Email Pop-Up is not presented");
			throw new Exception("Unable to click on Email Pop-up");
		}
	}
	
	public void clickBreadcrumbOne() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbOne)) {
			clickElementUsingJavaScript(breadcrumbOne);
			pageLoad();
			System.out.println("Breadcrumb one clicked successfully");
		} else {
			System.out.println("Breadcrumb one is not presented in the page");
			throw new Exception("Breadcrumb one is not presented in the page");
		}
	}
	
	public void clickBreadcrumbTwo() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbTwo)) {
			clickElementUsingJavaScript(breadcrumbTwo);
			pageLoad();
			System.out.println("Breadcrumb Two clicked successfully");
		} else {
			System.out.println("Breadcrumb Two is not presented in the page");
			throw new Exception("Breadcrumb Two is not presented in the page");
		}
	}
	
	public void clickBreadcrumbThree() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbThree)) {
			clickElementUsingJavaScript(breadcrumbThree);
			pageLoad();
			System.out.println("Breadcrumb Three clicked successfully");
		} else {
			System.out.println("Breadcrumb Three is not presented in the page");
			throw new Exception("Breadcrumb Three is not presented in the page");
		}
	}
	
	public void clickHyperLinkArthritisPain() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkArthritisPain)) {
			scrollDownUsingElement(hyperLinkArthritisPain);
			clickElementUsingJavaScript(hyperLinkArthritisPain);
			pageLoad();
			System.out.println("Hyper Link Arthritis Pain Gel is clicked successfully");
		} else {
			System.out.println("Hyper Link Arthritis Pain Gel is not preseneted in the page");
			throw new Exception("Hyper Link Arthritis Pain Gel is not preseneted in the page");
		}
	}
	
	public void clickHyperLinkArthritis() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkArthritis)) {
			scrollDownUsingElement(hyperLinkArthritis);
			clickElementUsingJavaScript(hyperLinkArthritis);
			pageLoad();
			System.out.println("Hyper Link Arthritis is clicked successfully");
		} else {
			System.out.println("Hyper Link Arthritis is not preseneted in the page");
			throw new Exception("Hyper Link Arthritis is not preseneted in the page");
		}
	}
	
	public void clickHyperLinkActivateVoiceSearch() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkActivateVoiceSearch)) {
			scrollDownUsingElement(hyperLinkActivateVoiceSearch);
			clickElementUsingJavaScript(hyperLinkActivateVoiceSearch);
			pageLoad();
			System.out.println("Hyper Link Activate Voice Search is clicked successfully");
		} else {
			System.out.println("Hyper Link Activate Voice Search is not preseneted in the page");
			throw new Exception("Hyper Link Activate Voice Search is not preseneted in the page");
		}
	}
	
	public void clickHyperLinkTestimonial() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkTestimonial)) {
			scrollDownUsingElement(hyperLinkTestimonial);
			clickElementUsingJavaScript(hyperLinkTestimonial);
			pageLoad();
			System.out.println("Hyper Link Testimonial is clicked successfully");
		} else {
			System.out.println("Hyper Link Testimonial is not preseneted in the page");
			throw new Exception("Hyper Link Testimonial is not preseneted in the page");
		}
	}
	
	public void clickHyperLinkHowVoltarenWorks() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkHowVoltarenWorks)) {
			scrollDownUsingElement(hyperLinkHowVoltarenWorks);
			clickElementUsingJavaScript(hyperLinkHowVoltarenWorks);
			pageLoad();
			System.out.println("Hyper Link How Voltaren Works is clicked successfully");
		} else {
			System.out.println("Hyper Link How Voltaren Works is not preseneted in the page");
			throw new Exception("Hyper Link How Voltaren Works is not preseneted in the page");
		}
	}
	
	public void clickHyperLinkTheseFeatures() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkTheseFeatures)) {
			scrollDownUsingElement(hyperLinkTheseFeatures);
			clickElementUsingJavaScript(hyperLinkTheseFeatures);
			pageLoad();
			System.out.println("Hyper Link These Features is clicked successfully");
		} else {
			System.out.println("Hyper Link These Features is not preseneted in the page");
			throw new Exception("Hyper Link These Features is not preseneted in the page");
		}
	}
	
	
	public void clickRelatedArticleReadMoreOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleReadMoreOne)) {
			scrollDownUsingElement(relatedArticleReadMoreOne);
			clickElementUsingJavaScript(relatedArticleReadMoreOne);
			pageLoad();
			System.out.println("Related Article Read More One is clicked successfully");
		} else {
			System.out.println("Related Article Read More One is not preseneted in the page");
			throw new Exception("Related Article Read More One is not preseneted in the page");
		}
	}
	
	public void clickRelatedArticleReadMoreTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleReadMoreTwo)) {
			scrollDownUsingElement(relatedArticleReadMoreTwo);
			clickElementUsingJavaScript(relatedArticleReadMoreTwo);
			pageLoad();
			System.out.println("Related Article Read More Two is clicked successfully");
		} else {
			System.out.println("Related Article Read More Two is not preseneted in the page");
			throw new Exception("Related Article Read More Two is not preseneted in the page");
		}
	}
	
	public void clickGetCoupons() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(getCoupons)) {
			scrollDownUsingElement(getCoupons);
			clickElementUsingJavaScript(getCoupons);
			pageLoad();
			System.out.println("Get Coupons is clicked successfully");
		} else {
			System.out.println("Get Couponsis not preseneted in the page");
			throw new Exception("Get Coupons is not preseneted in the page");
		}
	}
	
	

}
