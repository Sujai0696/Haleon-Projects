package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class FlonaseGardenFallAllergiesPage extends BaseClass{
	
	public FlonaseGardenFallAllergiesPage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item odd first']//ancestor::span[text()='SHRUBS,TREES & GRASSES']")
	private static WebElement tabSecOne;
	
	@FindBy(xpath = "//span[text()='SHRUBS,TREES & GRASSES']//ancestor::li[@class='tabs-nav-item odd first is-active']")
	private static WebElement tabSecActiveOne;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item even last ']//ancestor::span[text()='FLOWERING PLANTS']")
	private static WebElement tabSecTwo;
	
	@FindBy(xpath = "//span[text()='FLOWERING PLANTS']//ancestor::li[@class='tabs-nav-item even last is-active']")
	private static WebElement tabSecActiveTwo;
	
	@FindBy(xpath = "//a[@href='/products/' and text()='BUY NOW']")
	private static WebElement btnBuyNow;
	
	
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
	
	
	public void clickTabSec() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(tabSecActiveOne)) {
			scrollDownUsingElement(tabSecActiveOne);
			clickElementUsingJavaScript(tabSecTwo);
			visibilityOf(tabSecActiveTwo);
			Assert.assertTrue(elementIsDisplayed(tabSecActiveTwo));
			System.out.println("Tab section Two clicked  and verified successfully");
			
			pageLoad();
			clickElementUsingJavaScript(tabSecOne);
			visibilityOf(tabSecActiveOne);
			Assert.assertTrue(elementIsDisplayed(tabSecActiveOne));
			System.out.println("Tab section One clicked  and verified successfully");
			
		} else {
			System.out.println("tabSecActiveOne is not presented in the page");
			throw new Exception("tabSecActiveOne is not presented in the page");
		}
	}
	
	public void clickBtnBuyNow() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(btnBuyNow)) {
			scrollDownUsingElement(btnBuyNow);
			clickElementUsingJavaScript(btnBuyNow);
			pageLoad();
			System.out.println("btnBuyNow clicked successfully");
		} else {
			System.out.println("btnBuyNow is not presented in the page");
			throw new Exception("btnBuyNow is not presented in the page");
		}
	}
	
	

}
