package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class VoltarengelKneeBracesForOsteoarthritis extends BaseClass{
	public VoltarengelKneeBracesForOsteoarthritis() {
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
	
	@FindBy(xpath = "//a[text()='what osteoarthritis is']")
	private static WebElement WhatOsteoarthritisIs;
	
	@FindBy(xpath = "//a[text()='knee pain']")
	private static WebElement KneePain;
	
	@FindBy(xpath = "//a[text()='manage arthritis in social settings']")
	private static WebElement ManageArthritisInSocialSettings;
	
	@FindBy(xpath = "//a[text()='managing arthritis with your family']")
	private static WebElement ManagingArthritisWithYourFamily;
	
	@FindBy(xpath = "//li[@class='accordion-slide first last odd']//ancestor::header[@class='accordion-head']//ancestor::span[text()='Show References']")
	private static WebElement showReference;

	@FindBy(xpath = "//span[@class='accordion-title-text']//self::span[text()='Show References']")
	private static WebElement showReferenceClick;

	@FindBy(xpath = "//span[text()='Show References']//ancestor::li[@class='accordion-slide first last odd is-active']")
	private static WebElement showReferenceActive;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/how-to-relieve-arthritis-pain/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt first odd col-xs-12 col-md-6']")
	private static WebElement HowToRelieveArthritisPain;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/effects-of-aging-on-the-body/']//ancestor::div[@class='box component section articleCard padding-15-left-dt padding-20-bottom-dt padding-20-top-dt even last col-xs-12 col-md-6']")
	private static WebElement TheEffectOfAgingOnTheBody;
	
	@FindBy(xpath = "//a[text()='Get Coupons']")
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
	public void clickonWhatOsteoarthritisIs() throws Exception {
		waitForPageLoadJava();
		moveToElement(WhatOsteoarthritisIs);
		actionClick(WhatOsteoarthritisIs);
	}
	public void clickonKneePain() throws Exception {
		waitForPageLoadJava();
		moveToElement(KneePain);
		actionClick(KneePain);
	}
	public void clickonManageArthritisInSocialSettings() throws Exception {
		waitForPageLoadJava();
		moveToElement(ManageArthritisInSocialSettings);
		actionClick(ManageArthritisInSocialSettings);
	}
	public void clickonManagingArthritisWithYourFamily() throws Exception {
		waitForPageLoadJava();
		moveToElement(ManagingArthritisWithYourFamily);
		actionClick(ManagingArthritisWithYourFamily);
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
	public void clickonGetCoupon() throws Exception {
		waitForPageLoadJava();
		moveToElement(GetCoupon);
		actionClick(GetCoupon);
	}

}
