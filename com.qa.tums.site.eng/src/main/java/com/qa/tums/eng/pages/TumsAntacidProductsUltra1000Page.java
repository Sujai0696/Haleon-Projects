package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsAntacidProductsUltra1000Page extends BaseClass{
	
	public TumsAntacidProductsUltra1000Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='TUMS Home']")
	private static WebElement breadCrumbHome;
	
	@FindBy(xpath = "//a[text()='Product Selector']")
	private static WebElement breadCrumbOne;
	
	@FindBy(xpath = "//button[@id='WAR']")
	private static WebElement writeAReview;
	
	@FindBy(xpath = "//span[text()='My Review for Ultra Strength 1000']")
	private static WebElement reviewText;
	
	@FindBy(xpath = "//button[@name='Cancel']")
	private static WebElement reviewClose;
	
	@FindBy(xpath = "//span[text()='Buy Now']//ancestor::a[@role='button']")
	private static WebElement buyNow;
	
	@FindBy(xpath = "//h2[text()='TUMS Ultra Strength Tablets Assorted Berries, 72 ct']")
	private static WebElement buyNowText;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement buyNowClose;
	
	@FindBy(xpath = "//a[text()='Get Coupon']")
	private static WebElement getCoupon;
	
	@FindBy(xpath = "//span[text()='Product Details']//ancestor::li[@class='tabs-nav-item odd first']")
	private static WebElement tabNavOne;
	
	@FindBy(xpath = "//span[text()='Product Details']//ancestor::li[@class='tabs-nav-item odd first is-active']")
	private static WebElement tabNavActive;
	
	@FindBy(xpath = "//span[text()='Product Details']//ancestor::li[@class='tabs-nav-item odd first is-active']")
	private static WebElement tabNavActiveOne;
	
	@FindBy(xpath = "//span[text()='Directions']//ancestor::li[@class='tabs-nav-item even ']")
	private static WebElement tabNavTwo;
	
	@FindBy(xpath = "//span[text()='Directions']//ancestor::li[@class='tabs-nav-item even is-active']")
	private static WebElement tabNavActiveTwo;
	
	@FindBy(xpath = "//span[text()='Warnings']//ancestor::li[@class='tabs-nav-item odd ']")
	private static WebElement tabNavThree;
	
	@FindBy(xpath = "//span[text()='Warnings']//ancestor::li[@class='tabs-nav-item odd is-active']")
	private static WebElement tabNavActiveThree;
	
	@FindBy(xpath = "//span[text()='Varieties']//ancestor::li[@class='tabs-nav-item even last ']")
	private static WebElement tabNavFour;
	
	@FindBy(xpath = "//span[text()='Varieties']//ancestor::li[@class='tabs-nav-item even last is-active']")
	private static WebElement tabNavActiveFour;
	
	@FindBy(xpath = "//a[@id='stums-product-online--link ']")
	private static WebElement seeProducts;
	
	@FindBy(xpath = "//div[@data-title='How Does TUMS Work']//following::img[@alt='How Does TUMS Work']")
	private static WebElement youtubePlay;
	
	@FindBy(xpath = "//iframe[@title='The Science Behind TUMS']")
	private static WebElement iframe;
	
	@FindBy(xpath = "//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']//preceding::div[@class='ytp-cued-thumbnail-overlay-image']")
	private static WebElement youtubePlayVideo;
	
	@FindBy(xpath = "//video[@class='video-stream html5-main-video']//ancestor::div[contains(@class,'playing-mode')]")
	private static WebElement playingMode;
	
	@FindBy(xpath = "//video[@class='video-stream html5-main-video']//ancestor::div[contains(@class,'paused-mode')]")
	private static WebElement pausedMode;
	
	@FindBy(xpath = "//video[@class='video-stream html5-main-video']")
	private static WebElement youtubePauseVideo;
	
	@FindBy(xpath = "//a[@id='youtube-link' or text()='Read More']")
	private static WebElement readMore;
	
	@FindBy(xpath = "//img[@title='TUMS Vs Other Antacids']//following::a[text()='Compare Antacid Providers']")
	private static WebElement prdtOne;
	
	@FindBy(xpath = "//img[@title='TUMS Chewy Bites Cooling Sensation']//following::a[text()='Try TUMS Chewy Bites Cooling Sensation']")
	private static WebElement prdtTwo;
	
	@FindBy(xpath = "//img[@title='Heartburn Icon']//following::a[text()='Heartburn 101']")
	private static WebElement prdtThree;
	
	
	
	
	
	
	public void clickCookieBtn() throws Exception {
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
		}
	}
	
	public void clickBreadCrumbHome() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(breadCrumbHome);
		clickElementUsingJavaScript(breadCrumbHome);
	}
	
	public void clickBreadCrumbOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(breadCrumbOne);
		clickElementUsingJavaScript(breadCrumbOne);
	}
	
	public void clickWriteAReview() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(writeAReview);
		clickElementUsingJavaScript(writeAReview);
		visibilityOf(reviewText);
		if (isElementPresent(reviewText)) {
			Assert.assertTrue(elementIsDisplayed(reviewText));
			visibilityOf(reviewClose);
			clickElementUsingJavaScript(reviewClose);
			System.out.println("Write a review verified successfully");
		} else {
			System.out.println("Write a review is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickBuyNow() throws Exception{
		waitForPageLoadJava();
		visibilityOf(buyNow);
		scrollDownUsingElement(buyNow);
		clickElementUsingJavaScript(buyNow);
		visibilityOf(buyNowText);
		if (isElementPresent(buyNowText)) {
			Assert.assertTrue(elementIsDisplayed(buyNowText));
			visibilityOf(buyNowClose);
			clickElementUsingJavaScript(buyNowClose);
			System.out.println("Buynow verified successfully");
		} else {
			System.out.println("Buynow is not verified");
			Assert.assertTrue(false);
		}
	}
	
	public void clickGetCoupon() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(getCoupon);
		clickElementUsingJavaScript(getCoupon);
	}
	
	
	public void clickTabNavTwo() throws Exception{
		waitForPageLoadJava();
		visibilityOf(tabNavActiveOne);
		scrollDownUsingElement(tabNavActiveOne);
		if (isElementPresent(tabNavActiveOne)) {
			visibilityOf(tabNavTwo);
			clickElementUsingJavaScript(tabNavTwo);
			Assert.assertTrue(elementIsDisplayed(tabNavActiveTwo));
			System.out.println(getElementText(tabNavActiveTwo));
			System.out.println("Tab navigation is verified successfully");
		} else {
			System.out.println("Tab navigation is not verified successfully");
			Assert.assertTrue(false);
		}
	}
	
	public void clickTabNavThree() throws Exception{
		waitForPageLoadJava();
		visibilityOf(tabNavActiveOne);
		scrollDownUsingElement(tabNavActiveOne);
		if (isElementPresent(tabNavActiveOne)) {
			visibilityOf(tabNavThree);
			clickElementUsingJavaScript(tabNavThree);
			Assert.assertTrue(elementIsDisplayed(tabNavActiveThree));
			System.out.println(getElementText(tabNavActiveThree));
			System.out.println("Tab navigation is verified successfully");
		} else {
			System.out.println("Tab navigation is not verified successfully");
			Assert.assertTrue(false);
		}
	}
	
	public void clickTabNavFour() throws Exception{
		waitForPageLoadJava();
		visibilityOf(tabNavActiveOne);
		scrollDownUsingElement(tabNavActiveOne);
		if (isElementPresent(tabNavActiveOne)) {
			visibilityOf(tabNavFour);
			clickElementUsingJavaScript(tabNavFour);
			Assert.assertTrue(elementIsDisplayed(tabNavActiveFour));
			System.out.println(getElementText(tabNavActiveFour));
			System.out.println("Tab navigation is verified successfully");
		} else {
			System.out.println("Tab navigation is not verified successfully");
			Assert.assertTrue(false);
		}
	}
	
	public void clickTabNavOne() throws Exception{
		waitForPageLoadJava();
		visibilityOf(tabNavActiveOne);
		scrollDownUsingElement(tabNavActiveOne);
		if (isElementPresent(tabNavActiveOne)) {
			visibilityOf(tabNavTwo);
			clickElementUsingJavaScript(tabNavTwo);
			visibilityOf(tabNavOne);
			clickElementUsingJavaScript(tabNavOne);
			Assert.assertTrue(elementIsDisplayed(tabNavActiveOne));
			System.out.println(getElementText(tabNavActiveOne));
			System.out.println("Tab navigation is verified successfully");
		} else {
			System.out.println("Tab navigation is not verified successfully");
			Assert.assertTrue(false);
		}
	}
		
	public void clickSeeProducts() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(seeProducts);
		clickElementUsingJavaScript(seeProducts);
	}
			
	public void clickYoutube() throws Exception{
		waitForPageLoadJava();
		visibilityOf(youtubePlay);
		if (isElementPresent(youtubePlay)) {
			scrollDownUsingElement(youtubePlay);
			clickElementUsingJavaScript(youtubePlay);
			visibilityOf(iframe);
			switchToFrameUsingElement(iframe);
			elementToBeClickable(youtubePlayVideo);
			moveToElement(youtubePlayVideo);
			actionClick(youtubePlayVideo);
			Thread.sleep(5000);
			visibilityOf(playingMode);
			Assert.assertTrue(elementIsDisplayed(playingMode));
			System.out.println("youtube video playing successfully");
			moveToElement(youtubePauseVideo);
			actionClick(youtubePauseVideo);
			visibilityOf(pausedMode);
			Assert.assertTrue(elementIsDisplayed(pausedMode));
			System.out.println("youtube video paused successfully");
		} else {
			System.out.println("Video is not verified");
			Assert.assertTrue(false);
		}
	}	
			
	public void clickReadMore() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(readMore);
		clickElementUsingJavaScript(readMore);
	}
	
	public void clickPrdtOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(prdtOne);
		clickElementUsingJavaScript(prdtOne);
	}
	
	public void clickPrdtTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(prdtTwo);
		clickElementUsingJavaScript(prdtTwo);
	}
	
	public void clickPrdtThree() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(prdtThree);
		clickElementUsingJavaScript(prdtThree);
	}

}
