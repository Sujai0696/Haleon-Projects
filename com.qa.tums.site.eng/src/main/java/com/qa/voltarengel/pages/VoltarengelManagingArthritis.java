package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class VoltarengelManagingArthritis extends BaseClass {
	public VoltarengelManagingArthritis() {
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
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/home/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt first odd col-xs-12 col-md-6']")
	private static WebElement ManagingArthritisatHome;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/family/']//ancestor::div[@class='box component section articleCard padding-15-left-dt padding-20-bottom-dt padding-20-top-dt even col-xs-12 col-md-6']")
	private static WebElement ManagingArthritisWithYourFamily;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/alone/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt odd col-xs-12 col-md-6']")
	private static WebElement LivingIndependentlywithArthritis;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/work/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt odd col-xs-12 col-md-6']")
	private static WebElement ManagingArthritisatWork;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/otc-arthritis-medication/']//ancestor::div[@class='box component section articleCard padding-15-left-dt padding-20-bottom-dt padding-20-top-dt even col-xs-12 col-md-6']")
	private static WebElement OTCArthritisMedication;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/how-otc-arthritis-cream-gel-works/']//ancestor::div[@class='box component section articleCard padding-15-left-dt padding-15-right-dt padding-20-bottom-dt padding-20-top-dt odd col-xs-12 col-md-6']")
	private static WebElement HowOTCArthritisCreamWork;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/over-the-counter-diclofenac-gel/']//ancestor::div[@class='box component section articleCard padding-15-left-dt padding-20-bottom-dt padding-20-top-dt padding-30-right-dt even col-xs-12 col-md-6']")
	private static WebElement OvertheCounterDiclofenacGel;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/tylenol-alternatives-for-arthritis-pain/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt odd col-xs-12 col-md-6']")
	private static WebElement TylenolAlternative;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/how-to-prevent-arthritis/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt even col-xs-12 col-md-6']")
	private static WebElement HowtoPreventArthritis;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/joint-pain-medicine/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt odd col-xs-12 col-md-6']")
	private static WebElement JointPainMedicine;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/foods-to-avoid-for-arthritis/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt even col-xs-12 col-md-6']")
	private static WebElement WhatsFoodtoAvoidWhenYouHaveArthritis;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/knee-braces-for-osteoarthritis/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt odd col-xs-12 col-md-6']")
	private static WebElement KneeBracesforOsteoarthritis;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/what-is-lidocaine/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt even last col-xs-12 col-md-6']")
	private static WebElement WhatIsLidocainAndHowDoesItWork;
	
	@FindBy(xpath = "//a[@class='btn voltarenBtnMailBlue noTextDecoration']")
	private static WebElement SignMeUpBtn;
	
	@FindBy(xpath = "//a[@class='btn voltarenBtnWhite noTextDecoration']")
	private static WebElement GetCoupon;
	
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
	public void clickonManagingArthritisatHome() throws Exception {
		waitForPageLoadJava();
		moveToElement(ManagingArthritisatHome);
		actionClick(ManagingArthritisatHome);
	}
	public void clickonManagingArthritisWithYourFamily() throws Exception {
		waitForPageLoadJava();
		moveToElement(ManagingArthritisWithYourFamily);
		actionClick(ManagingArthritisWithYourFamily);
	}
	public void clickonLivingIndependentlywithArthritis() throws Exception {
		waitForPageLoadJava();
		moveToElement(LivingIndependentlywithArthritis);
		actionClick(LivingIndependentlywithArthritis);
	}
	public void clickonManagingArthritisatWork() throws Exception {
		waitForPageLoadJava();
		moveToElement(ManagingArthritisatWork);
		actionClick(ManagingArthritisatWork);
	}
	public void clickonOTCArthritisMedication() throws Exception {
		waitForPageLoadJava();
		moveToElement(OTCArthritisMedication);
		actionClick(OTCArthritisMedication);
	}
	public void clickonHowOTCArthritisCreamWork() throws Exception {
		waitForPageLoadJava();
		moveToElement(HowOTCArthritisCreamWork);
		actionClick(HowOTCArthritisCreamWork);
	}
	public void clickonOvertheCounterDiclofenacGel() throws Exception {
		waitForPageLoadJava();
		moveToElement(OvertheCounterDiclofenacGel);
		actionClick(OvertheCounterDiclofenacGel);
	}
	public void clickonTylenolAlternative() throws Exception {
		waitForPageLoadJava();
		moveToElement(TylenolAlternative);
		actionClick(TylenolAlternative);
	}
	public void clickonHowtoPreventArthritis() throws Exception {
		waitForPageLoadJava();
		moveToElement(HowtoPreventArthritis);
		actionClick(HowtoPreventArthritis);
	}
	public void clickonJointPainMedicine() throws Exception {
		waitForPageLoadJava();
		moveToElement(JointPainMedicine);
		actionClick(JointPainMedicine);
	}
	public void clickonWhatsFoodtoAvoidWhenYouHaveArthritis() throws Exception {
		waitForPageLoadJava();
		moveToElement(WhatsFoodtoAvoidWhenYouHaveArthritis);
		actionClick(WhatsFoodtoAvoidWhenYouHaveArthritis);
	}
	public void clickonKneeBracesforOsteoarthritis() throws Exception {
		waitForPageLoadJava();
		moveToElement(KneeBracesforOsteoarthritis);
		actionClick(KneeBracesforOsteoarthritis);
	}
	public void clickonWhatIsLidocainAndHowDoesItWork() throws Exception {
		waitForPageLoadJava();
		moveToElement(WhatIsLidocainAndHowDoesItWork);
		actionClick(WhatIsLidocainAndHowDoesItWork);
	}
	public void clickonSignMeUpBtn() throws Exception {
		waitForPageLoadJava();
		moveToElement(SignMeUpBtn);
		actionClick(SignMeUpBtn);
	}
	public void clickonGetCoupon() throws Exception {
		waitForPageLoadJava();
		moveToElement(GetCoupon);
		actionClick(GetCoupon);
	}
	

}
