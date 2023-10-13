package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsGutHealthFood extends BaseClass {

	public TumsGutHealthFood() {
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath = "//button[text()='Accept Cookies']")
//	private static WebElement cookiesAcceptBtn;

	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "(//li[@class='breadcrumb-list-item odd first ']//a)[2]")
	private static WebElement Bread_HomeIcon;

	@FindBy(xpath = "(//li[@class='breadcrumb-list-item even ']//a)[2]")
	private static WebElement Bread_Heartburn101;

	@FindBy(xpath = "//a[text()='culprits for heartburn']")
	private static WebElement CulpritsForHeartburn;

	@FindBy(xpath = "//a[text()='manage indigestion']")
	private static WebElement ManageIndigestion;

	@FindBy(xpath = "//a[text()='site']")
	private static WebElement Site;

	@FindBy(xpath = "//a[text()='See products']")
	private static WebElement SeeProducts;

//	public void clickOnCookies() throws Throwable {
//		implicitWait(3);
//		elementClick(cookiesAcceptBtn);
//	}

	public void clickCookieBtn() throws Exception {
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

	public void clickOnCulpritsForHeartburn() throws Throwable {
		// moveToElement(CulpritsForHeartburn);
		clickElementUsingJavaScript(CulpritsForHeartburn);
	}

	public void clickOnManageIndigestion() throws Throwable {
		// moveToElement(ManageIndigestion);
		clickElementUsingJavaScript(ManageIndigestion);
	}

	public void clickOnSite() throws Throwable {
		// moveToElement(Site);
		clickElementUsingJavaScript(Site);
	}

	public void clickSeeProducts() throws Throwable {
		moveToElement(SeeProducts);
		clickElementUsingJavaScript(SeeProducts);
	}

}
