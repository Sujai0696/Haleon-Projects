package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsChoosingOvertheCounter extends BaseClass{
	public TumsChoosingOvertheCounter() {
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath = "//button[text()='Accept Cookies']")
//	private static WebElement cookiesAcceptBtn;
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[@title='Heartburn 101']")
	private static WebElement heartburn101;

	@FindBy(xpath = "(//li[@class='breadcrumb-list-item odd first ']//a)[2]")
	private static WebElement Bread_HomeIcon;
	
	@FindBy(xpath = "(//li[@class='breadcrumb-list-item even ']//a)[2]")
	private static WebElement Bread_Heartburn101;
	
	@FindBy(xpath = "//a[text()='heartburn']")
	private static WebElement HeartburnLink;
	
	@FindBy(xpath = "//a[text()='TUMS']")
	private static WebElement TUMSLink;
	
	@FindBy(xpath = "//a[text()='TUMS Chewy Bites']")
	private static WebElement TUMSChewyBitesLink;
	
	@FindBy(xpath = "//a[text()='heartburn quiz']")
	private static WebElement HeartburnQuizLink;
	
	@FindBy(xpath = "//a[text()='causes of heartburn']")
	private static WebElement CausesofHeartburnLink;
	
	@FindBy(xpath = "//a[text()='how to relieve heartburn']")
	private static WebElement HowtoRelieveHeartburnLink;
	
	@FindBy(xpath = "//a[text()='what behaviors can trigger heartburn']")
	private static WebElement WhatBehaviorsCanTriggerHeartburnLink;
	
	@FindBy(xpath = "//a[text()='See products']")
	private static WebElement SeeProducts;
	
	
//	public void clickOnCookies() throws Throwable {
//		implicitWait(3);
//		elementClick(cookiesAcceptBtn);
//	}
	public void clickOnCookies() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
//				visibilityOf(cookieClose);
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		} else {
			System.out.println("Dismiss is not presented");
			Assert.assertTrue(false);
		}
	}


	public void clickOnHomeIcon() throws Throwable {
		moveToElement(Bread_HomeIcon);
		clickElementUsingJavaScript(Bread_HomeIcon);
	}

	public void clickOnHeartBurn101() throws Throwable {
		moveToElement(Bread_Heartburn101);
		clickElementUsingJavaScript(Bread_Heartburn101);
	}
	
	public void clickHeartburnLink() throws Throwable {
		moveToElement(HeartburnLink);
		clickElementUsingJavaScript(HeartburnLink);
	}
	
	public void clickTUMSLink() throws Throwable {
		moveToElement(TUMSLink);
		clickElementUsingJavaScript(TUMSLink);
	}
	public void clickTUMSChewyBitesLink() throws Throwable {
		moveToElement(TUMSChewyBitesLink);
		clickElementUsingJavaScript(TUMSChewyBitesLink);
	}
	public void clickHeartburnQuizLink() throws Throwable {
		moveToElement(HeartburnQuizLink);
		clickElementUsingJavaScript(HeartburnQuizLink);
	}
	public void clickCausesofHeartburnLink() throws Throwable {
		moveToElement(CausesofHeartburnLink);
		clickElementUsingJavaScript(CausesofHeartburnLink);
	}
	public void clickHowtoRelieveHeartburnLink() throws Throwable {
		moveToElement(HowtoRelieveHeartburnLink);
		clickElementUsingJavaScript(HowtoRelieveHeartburnLink);
	}
	public void clickWhatBehaviorsCanTriggerHeartburnLink() throws Throwable {
		moveToElement(WhatBehaviorsCanTriggerHeartburnLink);
		clickElementUsingJavaScript(WhatBehaviorsCanTriggerHeartburnLink);
	}
	public void clickSeeProducts() throws Throwable {
		moveToElement(SeeProducts);
		clickElementUsingJavaScript(SeeProducts);
	}
}
