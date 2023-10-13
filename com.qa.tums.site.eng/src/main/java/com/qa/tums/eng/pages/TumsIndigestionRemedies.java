package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsIndigestionRemedies extends BaseClass{
	public TumsIndigestionRemedies() {
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
	
	@FindBy(xpath = "//a[text()='Indigestion and heartburn are often confused with one another']")
	private static WebElement IndigestionAndHeartburn;
	
	@FindBy(xpath = "//a[text()='tips on getting fast heartburn relief']")
	private static WebElement TipsOnGettingFastHeartburn;
	
	@FindBy(xpath = "//a[text()='more articles from TUMS']")
	private static WebElement MoreArticlesFromTUMS;
	
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
	public void clickOnIndigestionAndHeartburn() throws Throwable {
		moveToElement(IndigestionAndHeartburn);
		clickElementUsingJavaScript(IndigestionAndHeartburn);
	}
	public void clickOnTipsOnGettingFastHeartburn() throws Throwable {
		moveToElement(TipsOnGettingFastHeartburn);
		clickElementUsingJavaScript(TipsOnGettingFastHeartburn);
	}
	public void clickOnMoreArticlesFromTUMS() throws Throwable {
		moveToElement(MoreArticlesFromTUMS);
		clickElementUsingJavaScript(MoreArticlesFromTUMS);
	}
	
	public void clickSeeProducts() throws Throwable {
		moveToElement(SeeProducts);
		clickElementUsingJavaScript(SeeProducts);
	}

	

}
