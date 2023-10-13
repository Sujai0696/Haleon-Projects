package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class BioteneShopNowPage extends BaseClass{
	
	public BioteneShopNowPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//ancestor::div[@class='component-content']//self::div[@style]")
	private static WebElement emailBtn;

	@FindBy(xpath = "//div[@class='box component section cf-popup-form first odd last alpha']")
	private static WebElement emailClose;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//ancestor::a[text()='BUY NOW']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//h2[text()='Buy Online']//ancestor::div[@class='ps-online-tab-label']")
	private static WebElement buyNow;

	@FindBy(xpath = "//h2[text()='Buy Online']//ancestor::div[@class='ps-online-tab-label selected']")
	private static WebElement buyNowActive;
	
	@FindBy(xpath = "//h2[text()='Buy Local']//ancestor::div[@class='ps-local-tab-label']")
	private static WebElement buyLocal;
	
	@FindBy(xpath = "//h2[text()='Buy Local']//ancestor::div[@class='ps-local-tab-label selected']")
	private static WebElement buyLocalActive;
	
	
	
	
	
	
	
	public void clickCookieBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Dismiss is not presented");
			throw new Exception("Unable to click on cookie Pop-up");
		}
	}

	public void clickEmailBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(emailBtn)) {
			elementToBeClickable(emailBtn);
			try {
				if (emailBtn.isDisplayed()) {
					clickElementUsingJavaScript(emailBtn);
				}
				implicitWait();
				Assert.assertFalse(elementIsDisplayed(emailClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Email Pop-Up is not presented");
			throw new Exception("Unable to click on Email Pop-up");
		}
	}
	
	public void clickBreadcrumbOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbOne)) {
			clickElementUsingJavaScript(breadcrumbOne);
			System.out.println("Breadcrumb one clicked successfully");
		} else {
			System.out.println("Breadcrumb one is not presented in the page");
			throw new Exception("Breadcrumb one is not presented in the page");
		}
	}
	
	public void clickBreadcrumbTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbTwo)) {
			clickElementUsingJavaScript(breadcrumbTwo);
			System.out.println("Breadcrumb Two clicked successfully");
		} else {
			System.out.println("Breadcrumb Two is not presented in the page");
			throw new Exception("Breadcrumb Two is not presented in the page");
		}
	}
	
	public void clickBuyNowAndBuyLocal() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(buyNowActive)) {
			scrollDownUsingElement(buyNowActive);
			clickElementUsingJavaScript(buyLocal);
			visibilityOf(buyLocalActive);
			Assert.assertTrue(elementIsDisplayed(buyLocalActive));
			clickElementUsingJavaScript(buyNow);
			visibilityOf(buyNowActive);
			Assert.assertTrue(elementIsDisplayed(buyNowActive));
			System.out.println("Buy Now and Buy local is verified successfully");
		} else {
			System.out.println("Buy Now and Buy Local is not active in the page");
			throw new Exception("Buy Now and Buy Local is not active in the page");
		}
	}
}
