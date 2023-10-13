package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneRepairProtectExtraFreshToothpastePage extends BaseClass{
	
	public SensodyneRepairProtectExtraFreshToothpastePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage gigya-heading first odd component col-xs-12 active']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//div[contains(@class,'content_hide')]")
	private static WebElement gigyaClose;
	
	@FindBy(xpath = "//button[@class='bv_button_buttonMinimalist ']")
	private static WebElement btnWriteAReview;
	
	@FindBy(xpath = "//span[text()='My Review for Repair & Protect - Extra Fresh']")
	private static WebElement reviewText;
	
	@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
	private static WebElement reviewClose;
	
	@FindBy(xpath = "(//a[@class='ps-widget btn ps-5b6e03fcd6cbbe001fa936ea ps-enabled'])[1]")
	private static WebElement btnBuyNow;
	
	@FindBy(xpath = "//h2[text()='Repair & Protect, Extra Fresh 3.4 oz']")
	private static WebElement buyNowText;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement buyNowClose;
	
	@FindBy(xpath = "(//a[@class='btn']//self::a[text()='Get Coupon'])[1]")
	private static WebElement getCoupon;
	
	@FindBy(xpath = "//a[text()='Whitening']")
	private static WebElement whitening;
	
	@FindBy(xpath = "//a[text()='Original']")
	private static WebElement original;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item odd first is-active']")
	private static WebElement ingredientsActive;
	
	@FindBy(xpath = "//span[text()='Directions']")
	private static WebElement directions;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item even is-active']")
	private static WebElement directionsActive;
	
	@FindBy(xpath = "//span[text()='Warnings']")
	private static WebElement warnings;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item odd last is-active']")
	private static WebElement warningsActive;
	
	@FindBy(xpath = "//a[text()='Rapid Relief']")
	private static WebElement mostPopularProductsOne;
	
	@FindBy(xpath = "//span[text()='Extra Whitening']")
	private static WebElement mostPopularProductsTwo;
	
	@FindBy(xpath = "//*[text()=' Whitening']//ancestor::a[text()='Repair and Protect']")
	private static WebElement mostPopularProductsThree;
	
	@FindBy(xpath = "//a[text()='Complete Protection']")
	private static WebElement mostPopularProductsFour;
	
	@FindBy(xpath = "//span[text()='Fresh Mint']")
	private static WebElement mostPopularProductsFive;
	
	@FindBy(xpath = "//h2[text()='Save']//following::a[text()='Get Your Coupon']")
	private static WebElement getYourCoupon;
	
	@FindBy(xpath = "//h2[text()='Shop']//following::a[text()='Find Your Store']")
	private static WebElement findYourStore;
	
	
	
	
	
	
	
	
	public void clickCookieBtn() throws Exception {
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					elementClick(cookieBtn);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Dismiss is not presented");
		}
	}

	public void clickGigyaForm() throws Exception {
		if (isElementPresent(gigyaForm)) {
			elementToBeClickable(gigyaForm);
			try {
				if (gigyaForm.isDisplayed()) {
					elementClick(gigyaForm);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(gigyaClose));
			} catch (Exception e) {
			}
		} else {
			System.out.println("gigya is not presented");
		}
	}
	
	
	public void clickWriteAReview()throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(btnWriteAReview);
		clickElementUsingJavaScript(btnWriteAReview);
		visibilityOf(reviewText);
		Assert.assertTrue(elementIsDisplayed(reviewText));
		clickElementUsingJavaScript(reviewClose);
	}
	
	public void clickBuyNow() throws Exception{
		scrollDownUsingElement(btnBuyNow);
		clickElementUsingJavaScript(btnBuyNow);
		visibilityOf(buyNowText);
		Assert.assertTrue(elementIsDisplayed(buyNowText));
		clickElementUsingJavaScript(buyNowClose);
	}
	
	public void clickGetCoupon() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(getCoupon);
		clickElementUsingJavaScript(getCoupon);
		pageLoad();
	}
	
	public void clickWhitening() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(whitening);
		clickElementUsingJavaScript(whitening);
		pageLoad();
	}
	
	public void clickOriginal() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(original);
		clickElementUsingJavaScript(original);
		pageLoad();
	}
	
	public void checkIngredientsActive() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(ingredientsActive);
		Assert.assertTrue(elementIsDisplayed(ingredientsActive));
	}
	
	public void clickDirections() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(directions);
		clickElementUsingJavaScript(directions);
		visibilityOf(directionsActive);
		Assert.assertTrue(elementIsDisplayed(directionsActive));
	}
	
	public void clickWarnings() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(warnings);
		clickElementUsingJavaScript(warnings);
		visibilityOf(warningsActive);
		Assert.assertTrue(elementIsDisplayed(warningsActive));
	}	
	
	public void clickMostPopularProductsOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(mostPopularProductsOne);
		clickElementUsingJavaScript(mostPopularProductsOne);
		pageLoad();
	}
	
	public void clickMostPopularProductsTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(mostPopularProductsTwo);
		clickElementUsingJavaScript(mostPopularProductsTwo);
		pageLoad();
	}
	
	public void clickMostPopularProductsThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(mostPopularProductsThree);
		clickElementUsingJavaScript(mostPopularProductsThree);
		pageLoad();
	}
	
	public void clickMostPopularProductsFour() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(mostPopularProductsFour);
		clickElementUsingJavaScript(mostPopularProductsFour);
		pageLoad();
	}
	
	public void clickMostPopularProductsFive() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(mostPopularProductsFive);
		clickElementUsingJavaScript(mostPopularProductsFive);
		pageLoad();
	}

	public void clickGetYourCoupon() throws Exception {
		waitForPageLoadJava();
		scrollDownUsingElement(getYourCoupon);
		clickElementUsingJavaScript(getYourCoupon);
		pageLoad();
	}
	
	public void clickFindYourStore() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(findYourStore);
		clickElementUsingJavaScript(findYourStore);
		pageLoad();
	}

	

}
