package com.qa.nexium.us.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class NexiumCapsulesPage extends BaseClass{
	
	public NexiumCapsulesPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Homepage']//self::a[@href='/us/']")
	private static WebElement breadcrumbOne;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Products']//self::a[@href='/us/products/']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//self::li[text()=' Capsules ']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "(//button[@aria-label='Write a Review (opens pop-up)'][normalize-space()='Write a review'])[2]")
	private static WebElement writeAReview;
	
	@FindBy(xpath = "//span[text()='My Review for Nexium® 24HR']")
	private static WebElement writeAReviewText;
	
	@FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
	private static WebElement writeAReviewClose;
	
	@FindBy(xpath = "//div[@class='bv-mbox-overlay bv-hiding bv-mbox-overlay-hide']")
	private static WebElement writeAReviewVerify;
	
	
	@FindBy(xpath = "//a[@aria-label='Find where to buy this product']")
	private static WebElement buyNow;
	
	@FindBy(xpath = "//h2[text()='Nexium 24HR Capsules, 42 ct (3x14)']//self::h2[@class='ps-product-name']")
	private static WebElement buyNowText;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement buyNowClose;
	
	@FindBy(xpath = "//span[text()='Buy Now']//ancestor::a[@aria-hidden='false']")
	private static WebElement buyNowVerify;
	
	@FindBy(xpath = "//a[text()='Get Coupons']//self::a[@href='/us/coupons-for-nexium/']")
	private static WebElement getCoupon;
	
	
	
	@FindBy(xpath = "//div[@class='lSAction']//following::a[@class='lSNext']")
	private static WebElement nextIcon;
	
	@FindBy(xpath = "//a[@class='lSPrev']")
	private static WebElement prevIcon;
	
	@FindBy(xpath = "//img[@title='Nexium® 24HR Capsules 14 ct product']//ancestor::li[@class='carousel-slide clearfix odd is-active first lslide active']")
	private static WebElement productActiveOne;
	
	@FindBy(xpath = "//img[@title='Nexium® 24HR Capsules 42 ct product']//ancestor::li[@class='carousel-slide clearfix even last lslide active']")
	private static WebElement productActiveTwo;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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


	public void clickBreadcrumbOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbOne)) {
			scrollDownUsingElement(breadcrumbOne);
			clickElementUsingJavaScript(breadcrumbOne);
			pageLoad();
			System.out.println("Breadcrumb One clicked successfully");
		} else {
			System.out.println("Breadcrumb One is not presented in the page");
			throw new Exception("Breadcrumb One is not presented in the page");
		}
	}

	public void clickBreadcrumbTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbTwo)) {
			scrollDownUsingElement(breadcrumbTwo);
			clickElementUsingJavaScript(breadcrumbTwo);
			pageLoad();
			System.out.println("Breadcrumb Two clicked successfully");
		} else {
			System.out.println("Breadcrumb Two is not presented in the page");
			throw new Exception("Breadcrumb Two is not presented in the page");
		}
	}
	
	
	public void clickBreadcrumbThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbThree)) {
			scrollDownUsingElement(breadcrumbThree);
			String href = breadcrumbThree.getAttribute("href");
	        boolean hasValidUrl = href != null && !href.isEmpty();
	        Assert.assertFalse(hasValidUrl);
			System.out.println("Breadcrumb Three verified successfully");
		} else {
			System.out.println("Breadcrumb Three is not presented in the page");
			throw new Exception("Breadcrumb Three is not presented in the page");
		}
	}
	
	
	public void clickWriteAReview() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(writeAReview)) {
			scrollDownUsingElement(writeAReview);
			clickElementUsingJavaScript(writeAReview);
			visibilityOf(writeAReviewText);
			Assert.assertTrue(elementIsDisplayed(writeAReviewText));
			clickElementUsingJavaScript(writeAReviewClose);
			visibilityOf(writeAReviewVerify);
			Assert.assertTrue(elementIsDisplayed(writeAReviewVerify));
			System.out.println("Write a review is Verified Successfully");
		} else {
			System.out.println("Write a review is not presented in the page");
			throw new Exception("Write a review is not presented in the page");
		}
	}
	
	public void clickBuyNow() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(buyNow)) {
			scrollDownUsingElement(buyNow);
			clickElementUsingJavaScript(buyNow);
			visibilityOf(buyNowText);
			Assert.assertTrue(elementIsDisplayed(buyNowText));
			clickElementUsingJavaScript(buyNowClose);
			visibilityOf(buyNowVerify);
			Assert.assertTrue(elementIsDisplayed(buyNowVerify));
			System.out.println("Buy Now is Verified Successfully");
		} else {
			System.out.println("Buy Now is not presented in the page");
			throw new Exception("Buy Now is not presented in the page");
		}
	}
	
	public void clickGetCoupon()throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(getCoupon)) {
			scrollDownUsingElement(getCoupon);
			clickElementUsingJavaScript(getCoupon);
			pageLoad();
		} else {
			System.out.println("Get Coupon is not presented in the page");
			throw new Exception("Get Coupon is not presented in the page");
		}
	}
	
	public void clickNextAndPrevIcon() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productActiveOne)) {
			scrollDownUsingElement(productActiveOne);
			clickElementUsingJavaScript(nextIcon);
			visibilityOf(productActiveTwo);
			Assert.assertTrue(elementIsDisplayed(productActiveTwo));
			clickElementUsingJavaScript(prevIcon);
			visibilityOf(productActiveOne);
			Assert.assertTrue(elementIsDisplayed(productActiveOne));
			System.out.println("Carousel is successfully verified");
		} else {
			System.out.println("Carousel product one is not active in the page");
			throw new Exception("Carousel product one is not active in the page");
		}
	}

}
