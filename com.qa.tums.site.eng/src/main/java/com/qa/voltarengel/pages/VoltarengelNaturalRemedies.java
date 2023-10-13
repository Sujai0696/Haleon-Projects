package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class VoltarengelNaturalRemedies extends BaseClass{
	public VoltarengelNaturalRemedies() {
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
	
	@FindBy(xpath = "//a[text()='osteoarthritis to rheumatoid arthritis']")
	private static WebElement OsteoarthritisToRheumatoidArthritis;
	
	@FindBy(xpath = "//a[text()='Voltaren Arthritis Pain Gel']")
	private static WebElement VoltarenArthritisPainGel;
	
	@FindBy(xpath = "//a[text()='symptoms of arthritis pain']")
	private static WebElement SymptomsOfArthritisPain;
	
	@FindBy(xpath = "//a[text()='pain management']")
	private static WebElement PainManagement;
	
	@FindBy(xpath = "//a[text()='symptoms of stress']")
	private static WebElement SymptomsOfStress;
	
	@FindBy(xpath = "//a[text()='muscle-strengthening exercises']")
	private static WebElement MuscleStrengtheningExercises;
	
	@FindBy(xpath = "//a[text()='symptom relief for arthritis pain']")
	private static WebElement SymptomReliefForArthritisPain;
	
	@FindBy(xpath = "//a[text()='at home']")
	private static WebElement AtHome;
	
	@FindBy(xpath = "//a[text()='in social situations']")
	private static WebElement InSocialSituations;
	
	@FindBy(xpath = "//li[@class='accordion-slide first last odd']//ancestor::header[@class='accordion-head']//ancestor::span[text()='Show References']")
	private static WebElement showReference;

	@FindBy(xpath = "//span[@class='accordion-title-text']//self::span[text()='Show References']")
	private static WebElement showReferenceClick;

	@FindBy(xpath = "//span[text()='Show References']//ancestor::li[@class='accordion-slide first last odd is-active']")
	private static WebElement showReferenceActive;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/how-to-relieve-arthritis-pain/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt first odd col-xs-12 col-md-6']")
	private static WebElement HowToRelieveArthritisPain;
	
	@FindBy(xpath = "//a[@href='/what-is-arthritis/causes/']//ancestor::div[@class='box component section articleCard padding-15-left-dt padding-20-bottom-dt padding-20-top-dt even last col-xs-12 col-md-6']")
	private static WebElement WhataretheCausesOfArthritis;
	
	@FindBy(xpath = "//a[text()='Get Coupons']")
	private static WebElement GetCoupons;
	
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
	public void clickonOsteoarthritisToRheumatoidArthritis() throws Exception {
		waitForPageLoadJava();
		moveToElement(OsteoarthritisToRheumatoidArthritis);
		actionClick(OsteoarthritisToRheumatoidArthritis);
	}
	public void clickonVoltarenArthritisPainGel() throws Exception {
		waitForPageLoadJava();
		moveToElement(VoltarenArthritisPainGel);
		actionClick(VoltarenArthritisPainGel);
	}
	public void clickonSymptomsOfArthritisPain() throws Exception {
		waitForPageLoadJava();
		moveToElement(SymptomsOfArthritisPain);
		actionClick(SymptomsOfArthritisPain);
	}
	public void clickonPainManagement() throws Exception {
		waitForPageLoadJava();
		moveToElement(PainManagement);
		actionClick(PainManagement);
	}
	public void clickonSymptomsOfStress() throws Exception {
		waitForPageLoadJava();
		moveToElement(SymptomsOfStress);
		actionClick(SymptomsOfStress);
	}
	public void clickonMuscleStrengtheningExercises() throws Exception {
		waitForPageLoadJava();
		moveToElement(MuscleStrengtheningExercises);
		actionClick(MuscleStrengtheningExercises);
	}
	public void clickonSymptomReliefForArthritisPain() throws Exception {
		waitForPageLoadJava();
		moveToElement(SymptomReliefForArthritisPain);
		actionClick(SymptomReliefForArthritisPain);
	}
	public void clickonAtHome() throws Exception {
		waitForPageLoadJava();
		moveToElement(AtHome);
		actionClick(AtHome);
	}
	public void clickonInSocialSituations() throws Exception {
		waitForPageLoadJava();
		moveToElement(InSocialSituations);
		actionClick(InSocialSituations);
	}
	public void clickonHowToRelieveArthritisPain() throws Exception {
		waitForPageLoadJava();
		moveToElement(HowToRelieveArthritisPain);
		actionClick(HowToRelieveArthritisPain);
	}
	public void clickonWhataretheCausesOfArthritis() throws Exception {
		waitForPageLoadJava();
		moveToElement(WhataretheCausesOfArthritis);
		actionClick(WhataretheCausesOfArthritis);
	}
	public void clickonGetCoupons() throws Exception {
		waitForPageLoadJava();
		moveToElement(GetCoupons);
		actionClick(GetCoupons);
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
	

	
}
