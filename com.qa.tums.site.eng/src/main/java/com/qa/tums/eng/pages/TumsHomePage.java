package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsHomePage extends BaseClass {

	public TumsHomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(id = "learn-more")
	private static WebElement learnMoreBtn;
	
	@FindBy(xpath = "//p[@id='product-availability']//following::a[text()='Please see our product page.']")
	private static  WebElement productPage;
	
	@FindBy(xpath = "//video[@class='local-video']")
	private static WebElement playVideo;
	
	@FindBy(xpath = "//video[@data-gtm-play-sent='true']")
	private static WebElement streamingVideo;
	
	@FindBy(xpath = "//div[@class='richText-content']//following::a[text()='Buy Now']")
	private static WebElement BuyNowBtn;
	
	@FindBy(xpath = "//i[@class='icon icon-video-play']")
	private static WebElement youtubeIcon;

	@FindBy(xpath = "//iframe[@class='responsive-iframe']")
	private static WebElement frame;
	
	@FindBy(xpath = "//div[@class='html5-video-container']//descendant::video")
	private static WebElement youtubeVideo;

	@FindBy(xpath = "//button[@class='ytp-play-button ytp-button']")
	private static WebElement pauseIcon;

	@FindBy(xpath = "//div[@class='close']")
	private static WebElement youtubeCloseBtn;

	@FindBy(xpath = "//a[@id='chewy-bites-learn-more']")
	private static WebElement prdtLearnMoreOne;;

	@FindBy(xpath = "//a[@id='cooling-sensation-learn-more']")
	private static WebElement prdtLearnMoreTwo;

	@FindBy(xpath = "//a[@id='find-out-why']")
	private static WebElement PrdtFindOutWhyOne;	

	@FindBy(xpath = "//a[@id='fight-back-learn-more']")
	private static WebElement prdtLearnMoreThree;	

	
	

	
	
	
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

	
	public void ClickBannerLearnMore() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(learnMoreBtn);
		clickElementUsingJavaScript(learnMoreBtn);
	}
	
	public void clickBannerProductPage() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(productPage);
		clickElementUsingJavaScript(productPage);
	}
	

	public void clickVideoStreming() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(playVideo);
		moveToElement(playVideo);
		actionClick(playVideo);
		implicitWait();
		if (isElementPresent(streamingVideo)) {
			Assert.assertTrue(elementIsDisplayed(streamingVideo));
			Thread.sleep(5000);
			moveToElement(playVideo);
			actionClick(playVideo);
			System.out.println("Video is playing successfully");
		} else {
			System.out.println("Video is Unavailable");
			Assert.assertTrue(false);
		}
	}
	
	
	public void clickProductBuyNow() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(BuyNowBtn);
		clickElementUsingJavaScript(BuyNowBtn);
	}
	
	public void clickYoutubeVideo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(youtubeIcon);
		clickElementUsingJavaScript(youtubeIcon);
		visibilityOf(frame);
		switchToFrameUsingElement(frame);
		if (isElementPresent(youtubeVideo)) {
			Assert.assertTrue(elementIsDisplayed(youtubeVideo));
			moveToElement(pauseIcon);
			actionClick(pauseIcon);
			Thread.sleep(10000);
			System.out.println("video is playing successfully");
			frameSwitchingToDefaultContent();
			clickElementUsingJavaScript(youtubeCloseBtn);
		} else {
			System.out.println("Video is Unavailable");
			Assert.assertTrue(false);
		}
	}
	
	public void clickLearnMoreOne() throws Exception{
		waitForPageLoadJava(); 
		scrollDownUsingElement(prdtLearnMoreOne);
		clickElementUsingJavaScript(prdtLearnMoreOne);
	}
	
	public void clickLearnMoreTwo() throws Exception{
		waitForPageLoadJava(); 
		scrollDownUsingElement(prdtLearnMoreTwo);
		clickElementUsingJavaScript(prdtLearnMoreTwo);
	}
	
	public void clickFindOutWhy() throws Exception{
		waitForPageLoadJava(); 
		scrollDownUsingElement(PrdtFindOutWhyOne);
		clickElementUsingJavaScript(PrdtFindOutWhyOne);
	}
	
	public void clickLearnMoreThree() throws Exception{
		waitForPageLoadJava(); 
		scrollDownUsingElement(prdtLearnMoreThree);
		clickElementUsingJavaScript(prdtLearnMoreThree);
	}
	
}
