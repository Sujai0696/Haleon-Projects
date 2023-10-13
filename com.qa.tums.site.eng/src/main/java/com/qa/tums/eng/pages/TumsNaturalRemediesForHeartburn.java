package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsNaturalRemediesForHeartburn extends BaseClass{
	public TumsNaturalRemediesForHeartburn() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "(//li[@class='breadcrumb-list-item odd first ']//a)[2]")
	private static WebElement Bread_HomeIcon;
	
	@FindBy(xpath = "(//li[@class='breadcrumb-list-item even ']//a)[2]")
	private static WebElement Bread_Heartburn101;
	
	@FindBy(xpath = "//a[text()='home remedy']")
	private static WebElement HomeRemedy;
	
	@FindBy(xpath = "//a[text()='apple cider vinegar']")
	private static WebElement AppleCiderVinegar;
	
	@FindBy(xpath = "//a[text()='antacid']")
	private static WebElement Antacid;
	
	@FindBy(xpath = "//a[text()='antacid']")
	private static WebElement TUMS;
	
	@FindBy(xpath = "//a[text()='See products']")
	private static WebElement SeeProducts;
	
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
	public void clickOnHomeRemedy() throws Throwable {
		moveToElement(HomeRemedy);
		clickElementUsingJavaScript(HomeRemedy);
	}
	public void clickOnAppleCiderVinegar() throws Throwable {
		moveToElement(AppleCiderVinegar);
		clickElementUsingJavaScript(AppleCiderVinegar);
	}
	public void clickOnAntacid() throws Throwable {
		moveToElement(Antacid);
		clickElementUsingJavaScript(Antacid);
	}
	public void clickOnTUMS() throws Throwable {
		moveToElement(TUMS);
		clickElementUsingJavaScript(TUMS);
	}
	public void clickSeeProducts() throws Throwable {
		moveToElement(SeeProducts);
		clickElementUsingJavaScript(SeeProducts);
	}


}
