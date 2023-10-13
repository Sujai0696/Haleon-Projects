package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class VoltarengelHomePage extends BaseClass{
	
	public VoltarengelHomePage() {
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
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/']//self::a[text()='Managing Your Arthritis']")
    private static WebElement breadcrumbThree;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/home/']//self::a[text()='Managing Arthritis at Home']")
    private static WebElement breadcrumbFour;
    
    @FindBy(xpath = "//a[@href='/what-is-arthritis/']//self::a[text()='live with arthritis']")
    private static WebElement hyperLinkLiveWithArthritis;
    
    @FindBy(xpath = "//a[@href='/what-is-arthritis/symptoms/']//self::a[text()='discomfort']")
    private static WebElement hyperLinkDiscomfort;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/how-to-relieve-arthritis-pain/']//self::a[text()='relief']")
    private static WebElement hyperLinkRelief;
    
    @FindBy(xpath = "//a[@href='/understanding-pain/about-pain/']//self::a[text()='easing pain']")
    private static WebElement hyperLinkEasingPain;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/exercises/']//self::a[text()='Exercise']")
    private static WebElement hyperLinkExercise;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/natural-remedies/']//self::a[text()='eat a healthy diet']")
    private static WebElement hyperLinkEatAHealthyDiet;
    
    @FindBy(xpath = "//div[@class='parametrizedhtml component section video-int first odd col-xs-12 reference-custom-video']")
    private static WebElement scroll;
    
    @FindBy(xpath = "//i[@class='icon icon-video-play']")
    private static WebElement videoPlayIcon;
    
    @FindBy(xpath = "//iframe[@class='responsive-iframe']")
    private static WebElement iframe;
    
    @FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay']//div[@class='ytp-cued-thumbnail-overlay-image']")
    private static WebElement videoClick;
    
    @FindBy(xpath = "//div[contains(@class,'playing-mode')]")
    private static WebElement playingMode;
    
    @FindBy(xpath = "//div[contains(@class,'paused-mode')]")
    private static WebElement pausedMode;
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd']//ancestor::header[@class='accordion-head']//ancestor::span[text()='Show Transcript']")
    private static WebElement showTranscript;
    
    @FindBy(xpath = "//span[@class='accordion-title-text']//self::span[text()='Show Transcript']")
    private static WebElement showTranscriptClick;
    
    @FindBy(xpath = "//span[text()='Show Transcript']//ancestor::li[@class='accordion-slide first last odd is-active']")
    private static WebElement showTranscriptActive;
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd']//ancestor::header[@class='accordion-head']//ancestor::span[text()='Show References']")
    private static WebElement showReference;
    
    @FindBy(xpath = "//span[@class='accordion-title-text']//self::span[text()='Show References']")
    private static WebElement showReferenceClick;
    
    @FindBy(xpath = "//span[text()='Show References']//ancestor::li[@class='accordion-slide first last odd is-active']")
    private static WebElement showReferenceActive;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/how-to-relieve-arthritis-pain/']//ancestor::strong[text()='READ MORE']")
    private static WebElement relatedArticleReadMoreOne;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/use-your-head-to-navigate-websites/']//ancestor::strong[text()='READ MORE']")
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
	
	public void clickBreadcrumbFour() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbFour)) {
			clickElementUsingJavaScript(breadcrumbFour);
			pageLoad();
			System.out.println("Breadcrumb Four clicked successfully");
		} else {
			System.out.println("Breadcrumb Four is not presented in the page");
			throw new Exception("Breadcrumb Four is not presented in the page");
		}
	}
	
	
	public void clickHyperLinkLiveWithArthritis() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkLiveWithArthritis)) {
			scrollDownUsingElement(hyperLinkLiveWithArthritis);
			clickElementUsingJavaScript(hyperLinkLiveWithArthritis);
			pageLoad();
			System.out.println("Hyper Link Live With Arthritis is clicked successfully");
		} else {
			System.out.println("Hyper Link Live With Arthritis is not preseneted in the page");
			throw new Exception("Hyper Link Live With Arthritis is not preseneted in the page");
		}
	}
	
	public void clickHyperLinkDiscomfort() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkDiscomfort)) {
			scrollDownUsingElement(hyperLinkDiscomfort);
			clickElementUsingJavaScript(hyperLinkDiscomfort);
			pageLoad();
			System.out.println("Hyper Link Discomfort is clicked successfully");
		} else {
			System.out.println("Hyper Link Discomfort is not preseneted in the page");
			throw new Exception("Hyper Link Discomfort is not preseneted in the page");
		}
	}
	
	public void clickHyperLinkRelief() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkRelief)) {
			scrollDownUsingElement(hyperLinkRelief);
			clickElementUsingJavaScript(hyperLinkRelief);
			pageLoad();
			System.out.println("Hyper Link Relief is clicked successfully");
		} else {
			System.out.println("Hyper Link Relief is not preseneted in the page");
			throw new Exception("Hyper Link Relief is not preseneted in the page");
		}
	}
	
	public void clickHyperLinkEasingPain() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkEasingPain)) {
			scrollDownUsingElement(hyperLinkEasingPain);
			clickElementUsingJavaScript(hyperLinkEasingPain);
			pageLoad();
			System.out.println("Hyper Link Easing Pain is clicked successfully");
		} else {
			System.out.println("Hyper Link Easing Pain is not preseneted in the page");
			throw new Exception("Hyper Link Easing Pain is not preseneted in the page");
		}
	}
	
	public void clickHyperLinkExercise() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkExercise)) {
			scrollDownUsingElement(hyperLinkExercise);
			clickElementUsingJavaScript(hyperLinkExercise);
			pageLoad();
			System.out.println("Hyper Link Exercise is clicked successfully");
		} else {
			System.out.println("Hyper Link Exercise is not preseneted in the page");
			throw new Exception("Hyper Link Exercise is not preseneted in the page");
		}
	}
	
	public void clickHyperLinkEatAHealthyDiet() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkEatAHealthyDiet)) {
			scrollDownUsingElement(hyperLinkEatAHealthyDiet);
			clickElementUsingJavaScript(hyperLinkEatAHealthyDiet);
			pageLoad();
			System.out.println("Hyper Link Eat A Healthy Diet is clicked successfully");
		} else {
			System.out.println("Hyper Link Eat A Healthy Diet is not preseneted in the page");
			throw new Exception("Hyper Link Eat A Healthy Diet is not preseneted in the page");
		}
	}
	
	 public void clickYoutubeVideo() throws Exception{
	    	waitForPageLoadJava();
	    	if (isElementPresent(scroll)) {
	    		scrollDownUsingElement(scroll);
	    		moveToElement(videoPlayIcon);
	    		actionClick(videoPlayIcon);
	    		visibilityOf(iframe);
	    		switchToFrameUsingElement(iframe);
	    		Thread.sleep(5000);
	    		visibilityOf(playingMode);
	    		Assert.assertTrue(elementIsDisplayed(playingMode));
	    		clickElementUsingJavaScript(videoClick);
	    		visibilityOf(pausedMode);
	    		Assert.assertTrue(elementIsDisplayed(pausedMode));
	    		System.out.println("Youtuve video Successfully verified");
			} else {
				System.out.println("Youtube play icon is not presented in the page");
				throw new Exception("Youtube play icon is not presented in the page");
			}
		}
	 
	 public void clickShowTranscript() throws Exception{
			waitForPageLoadJava();
			if (isElementPresent(showTranscriptClick)) {
				scrollDownUsingElement(showTranscriptClick);
				clickElementUsingJavaScript(showTranscriptClick);
				visibilityOf(showTranscriptActive);
				Assert.assertTrue(elementIsDisplayed(showTranscriptActive));
				clickElementUsingJavaScript(showTranscriptClick);
				visibilityOf(showTranscriptClick);
				Assert.assertTrue(elementIsDisplayed(showTranscript));
				System.out.println("Show Transcript is successfully verified");
			} else {
				System.out.println("Show Transcript is not presented in the page");
				throw new Exception("Show Transcript is not presented in the page");
			}
		}
	
    
	 public void clickShowReference() throws Exception{
			waitForPageLoadJava();
			if (isElementPresent(showReferenceClick)) {
				scrollDownUsingElement(showReferenceClick);
				clickElementUsingJavaScript(showReferenceClick);
				visibilityOf(showReferenceActive);
				Assert.assertTrue(elementIsDisplayed(showReferenceActive));
				clickElementUsingJavaScript(showReferenceClick);
				visibilityOf(showReferenceClick);
				Assert.assertTrue(elementIsDisplayed(showReference));
				System.out.println("Show reference is successfully verified");
			} else {
				System.out.println("Show Reference is not presented in the page");
				throw new Exception("Show Reference is not presented in the page");
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
