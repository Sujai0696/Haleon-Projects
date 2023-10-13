package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class VoltarengelJointPainMedicine extends BaseClass{
	public VoltarengelJointPainMedicine() {
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
	
	@FindBy(xpath = "//a[text()='Voltaren Arthritis Pain Gel']")
	private static WebElement VoltarenArthritisPainGel;
	
	@FindBy(xpath = "//a[text()='Advil']")
	private static WebElement Advil;
	
	@FindBy(xpath = "//a[text()='about pain']")
	private static WebElement AboutPain;
	
	@FindBy(xpath = "//a[text()='managing your arthritis symptoms']")
	private static WebElement ManagingYourArthritisSymptoms;
	
	@FindBy(xpath = "//li[@class='accordion-slide first last odd']//ancestor::header[@class='accordion-head']//ancestor::span[text()='Show References']")
	private static WebElement showReference;

	@FindBy(xpath = "//span[@class='accordion-title-text']//self::span[text()='Show References']")
	private static WebElement showReferenceClick;

	@FindBy(xpath = "//span[text()='Show References']//ancestor::li[@class='accordion-slide first last odd is-active']")
	private static WebElement showReferenceActive;
	
	@FindBy(xpath = "//a[@href='https://www.voltarengel.com/living-with-arthritis/natural-remedies/']//ancestor::div[@class='box component section articleCard padding-15-right-dt padding-20-bottom-dt padding-20-top-dt first odd col-xs-12 col-md-6']']")
	private static WebElement NaturalRemediesForArthritisPainRelief;
	
	@FindBy(xpath = "//a[@href='https://www.voltarengel.com/what-is-arthritis/symptoms/']//ancestor::div[@class='box component section articleCard padding-15-left-dt padding-20-bottom-dt padding-20-top-dt even last col-xs-12 col-md-6']']")
	private static WebElement WhatAreTheSymtomsofArthritis;
	
	@FindBy(xpath = "//a[text()='Get Coupons']']")
	private static WebElement GetCoupon;
	
	
	
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
	public void clickonVoltarenArthritisPainGel() throws Exception {
		waitForPageLoadJava();
		moveToElement(VoltarenArthritisPainGel);
		actionClick(VoltarenArthritisPainGel);
	}
	
	public void clickonAdvil() throws Exception {
		waitForPageLoadJava();
		moveToElement(Advil);
		actionClick(Advil);
	}
	
	public void clickonAboutPain() throws Exception {
		waitForPageLoadJava();
		moveToElement(AboutPain);
		actionClick(AboutPain);
	}
	public void clickonManagingYourArthritisSymptoms() throws Exception {
		waitForPageLoadJava();
		moveToElement(ManagingYourArthritisSymptoms);
		actionClick(ManagingYourArthritisSymptoms);
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
	public void clickonNaturalRemediesForArthritisPainRelief() throws Exception {
		waitForPageLoadJava();
		moveToElement(NaturalRemediesForArthritisPainRelief);
		actionClick(NaturalRemediesForArthritisPainRelief);
	}
	public void clickonWhatAreTheSymtomsofArthritis() throws Exception {
		waitForPageLoadJava();
		moveToElement(WhatAreTheSymtomsofArthritis);
		actionClick(WhatAreTheSymtomsofArthritis);
	}
	public void clickonGetCoupon() throws Exception {
		waitForPageLoadJava();
		moveToElement(GetCoupon);
		actionClick(GetCoupon);
	}
}
