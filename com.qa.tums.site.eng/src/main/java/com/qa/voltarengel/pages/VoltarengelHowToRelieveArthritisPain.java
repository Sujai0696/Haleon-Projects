package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class VoltarengelHowToRelieveArthritisPain extends BaseClass {
	public VoltarengelHowToRelieveArthritisPain() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//h2[text()='Sign Up. Save.']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage gigyaform__heading first odd component col-xs-12']")
	private static WebElement gigyaClose;

	@FindBy(xpath = "//li[@class='accordion-slide first last odd']//ancestor::header[@class='accordion-head']//ancestor::span[text()='Show References']")
	private static WebElement showReference;

	@FindBy(xpath = "//span[@class='accordion-title-text']//self::span[text()='Show References']")
	private static WebElement showReferenceClick;

	@FindBy(xpath = "//span[text()='Show References']//ancestor::li[@class='accordion-slide first last odd is-active']")
	private static WebElement showReferenceActive;

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
	
	@FindBy(xpath = "//a[text()='Living with arthritis']")
	private static WebElement LivingWithArthritis;
	
	@FindBy(xpath = "//a[text()='especially your joints']")
	private static WebElement EspeciallyYourJoints;
	
	@FindBy(xpath = "//a[text()='Mediterranean diet']")
	private static WebElement MediterraneanDiet;
	
	@FindBy(xpath = "//a[text()='fight inflammation']")
	private static WebElement FightInflammation;
	
	@FindBy(xpath = "//a[text()='Low-impact exercises']")
	private static WebElement LowImpactExercises;
	
	@FindBy(xpath = "//a[@href='https://www.voltarengel.com/living-with-arthritis/natural-remedies/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt first odd col-xs-12 col-md-6']")
	private static WebElement Article1;
	
	@FindBy(xpath = "//a[@href='https://www.voltarengel.com/what-is-arthritis/symptoms/']//ancestor::div[@class='box component section articleCard padding-15-left-dt padding-20-bottom-dt padding-20-top-dt even last col-xs-12 col-md-6']")
	private static WebElement Article2;
	
	@FindBy(xpath = "//a[text()='good options']")
	private static WebElement GoodOptions;
	
	@FindBy(xpath = "//a[text()='Get Coupons']")
	private static WebElement GetCoupon;
	
	 @FindBy(xpath = "//span[text()='BUY NOW']//ancestor::a[@class='rd-nr-btn btn voltarenBtnBlueOutline noTextDecoration']")
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
				visibilityOf(cookieClose);
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		} else {
			System.out.println("Dismiss is not presented");
			throw new Exception("Unable to click on cookie Pop-up");
		}
	}

	public void clickGigyaForm() throws Exception {
		waitForPageLoadJava();
		try {
			if (gigyaForm.isDisplayed()) {
				clickElementUsingJavaScript(gigyaForm);
			}
			implicitWait();
			actionClick(gigyaClose);
			Assert.assertTrue(elementIsDisplayed(gigyaClose));

		} catch (Exception e) {

		}
	}

	public void clickShowReference() throws Exception {
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

	public void clickYoutubeVideo() throws Exception {
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

	public void clickonLivingWithArthritis() throws Exception {
		waitForPageLoadJava();
		moveToElement(LivingWithArthritis);
		actionClick(LivingWithArthritis);
	}
	public void clickonEspeciallyYourJoints() throws Exception {
		waitForPageLoadJava();
		moveToElement(EspeciallyYourJoints);
		actionClick(EspeciallyYourJoints);
	}
	public void clickonMediterraneanDiet() throws Exception {
		waitForPageLoadJava();
		moveToElement(MediterraneanDiet);
		actionClick(MediterraneanDiet);
	}
	public void clickonFightInflammation() throws Exception {
		waitForPageLoadJava();
		moveToElement(FightInflammation);
		actionClick(FightInflammation);
	}
	public void clickonLowImpactExercises() throws Exception {
		waitForPageLoadJava();
		moveToElement(LowImpactExercises);
		actionClick(LowImpactExercises);
	}
	public void clickonGoodOption() throws Exception {
		waitForPageLoadJava();
		moveToElement(GoodOptions);
		actionClick(GoodOptions);
	}
	public void clickonArticle1() throws Exception {
		waitForPageLoadJava();
		moveToElement(Article1);
		actionClick(Article1);
	}
	public void clickonArticle2() throws Exception {
		waitForPageLoadJava();
		moveToElement(Article2);
		actionClick(Article2);
	}
	public void clickonGetCoupon() throws Exception {
		waitForPageLoadJava();
		moveToElement(GetCoupon);
		actionClick(GetCoupon);
	}
	
}
