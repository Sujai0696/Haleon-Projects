package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class VoltarengelExercises extends BaseClass{
	public VoltarengelExercises() {
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
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/exercises/wrist/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt first odd col-xs-12 col-md-6']")
	private static WebElement WristExerciseForArthritis;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/exercises/hand/']//ancestor::div[@class='box component section articleCard padding-15-left-dt padding-20-bottom-dt padding-20-top-dt even col-xs-12 col-md-6']")
	private static WebElement HandExerciseforArthritis;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/exercises/knee/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt odd col-xs-12 col-md-6']")
	private static WebElement KneeExerciseforArthritis;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/exercises/elbow/']//ancestor::div[@class='box component section articleCard padding-15-left-dt padding-20-bottom-dt padding-20-top-dt even col-xs-12 col-md-6']")
	private static WebElement ElbowExercisesforArthritis;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/exercises/ab-workouts-from-home/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt odd col-xs-12 col-md-6']")
	private static WebElement FiveAbWorkout;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/exercises/how-to-get-fit-at-home/']//ancestor::div[@class='box component section articleCard padding-15-left-dt padding-20-bottom-dt padding-20-top-dt even col-xs-12 col-md-6']")
	private static WebElement HowtoGetFitatHome;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/']//ancestor::div[@class='box component section articleCard padding-15-left-dt padding-20-bottom-dt padding-20-top-dt even col-xs-12 col-md-6']")
	private static WebElement HowtoManageYourArthritis;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/exercises/exercises-for-arthritis/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt odd col-xs-12 col-md-6']")
	private static WebElement ExecisesForArthritis;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/exercises/how-to-relieve-knee-pain/']//ancestor::div[@class='box component section articleCard padding-15-left-dt padding-20-bottom-dt padding-20-top-dt even col-xs-12 col-md-6']")
	private static WebElement HowToRelieveKneePain;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/exercises/knee-stretches-for-arthritis/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt odd col-xs-12 col-md-6']")
	private static WebElement StandingStretchesToRelieve;
	
	@FindBy(xpath = "//a[@href='/living-with-arthritis/exercises/arthritis-at-night/']//ancestor::div[@class='box component section articleCard padding-15-left-dt padding-20-bottom-dt padding-20-top-dt even last col-xs-12 col-md-6']")
	private static WebElement ArthritisHurtsatNight;
	
	@FindBy(xpath = "//a[@class='btn voltarenBtnMailBlue noTextDecoration']")
	private static WebElement SignMeUp;
	
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
	public void clickonWristExerciseForArthritis() throws Exception {
		waitForPageLoadJava();
		moveToElement(WristExerciseForArthritis);
		actionClick(WristExerciseForArthritis);
	}
	public void clickonHandExerciseforArthritis() throws Exception {
		waitForPageLoadJava();
		moveToElement(HandExerciseforArthritis);
		actionClick(HandExerciseforArthritis);
	}
	public void clickonKneeExerciseforArthritis() throws Exception {
		waitForPageLoadJava();
		moveToElement(KneeExerciseforArthritis);
		actionClick(KneeExerciseforArthritis);
	}
	public void clickonElbowExercisesforArthritis() throws Exception {
		waitForPageLoadJava();
		moveToElement(ElbowExercisesforArthritis);
		actionClick(ElbowExercisesforArthritis);
	}
	public void clickonFiveAbWorkout() throws Exception {
		waitForPageLoadJava();
		moveToElement(FiveAbWorkout);
		actionClick(FiveAbWorkout);
	}
	public void clickonHowtoGetFitatHome() throws Exception {
		waitForPageLoadJava();
		moveToElement(HowtoGetFitatHome);
		actionClick(HowtoGetFitatHome);
	}
	public void clickonHowtoManageYourArthritis() throws Exception {
		waitForPageLoadJava();
		moveToElement(HowtoManageYourArthritis);
		actionClick(HowtoManageYourArthritis);
	}
	public void clickonExecisesForArthritis() throws Exception {
		waitForPageLoadJava();
		moveToElement(ExecisesForArthritis);
		actionClick(ExecisesForArthritis);
	}
	public void clickonHowToRelieveKneePain() throws Exception {
		waitForPageLoadJava();
		moveToElement(HowToRelieveKneePain);
		actionClick(HowToRelieveKneePain);
	}
	public void clickonStandingStretchesToRelieve() throws Exception {
		waitForPageLoadJava();
		moveToElement(StandingStretchesToRelieve);
		actionClick(StandingStretchesToRelieve);
	}
	public void clickonArthritisHurtsatNight() throws Exception {
		waitForPageLoadJava();
		moveToElement(ArthritisHurtsatNight);
		actionClick(ArthritisHurtsatNight);
	}
	public void clickonSignMeUp() throws Exception {
		waitForPageLoadJava();
		moveToElement(SignMeUp);
		actionClick(SignMeUp);
	}
	public void clickonGetCoupon() throws Exception {
		waitForPageLoadJava();
		moveToElement(GetCoupon);
		actionClick(GetCoupon);
	}
	
}
