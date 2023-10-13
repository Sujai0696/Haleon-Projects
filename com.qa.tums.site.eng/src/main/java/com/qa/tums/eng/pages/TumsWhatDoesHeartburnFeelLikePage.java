package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsWhatDoesHeartburnFeelLikePage extends BaseClass {
	
	public TumsWhatDoesHeartburnFeelLikePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='TUMS Home']")
	private static WebElement breadCrumbHome;
	
	@FindBy(xpath = "//a[text()='Heartburn 101']")
	private static WebElement breadCrumbOne;
	
	@FindBy(xpath = "//img[@src='/content/dam/cf-consumer-healthcare/bp-tums/en_US/products/what-does-hearburn-feel-like-thumb.jpg']")
	private static WebElement youtubePlay;
	
	@FindBy(xpath = "//iframe[@title='The Difference Between Heartburn & Indigestion | TUMS']")
	private static WebElement iframe;
	
	@FindBy(xpath = "//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")
	private static WebElement youtubePlayIcon;
	
	@FindBy(xpath = "//div[contains(@class,'playing-mode')]")
	private static WebElement playingMode;
	
	@FindBy(xpath = "//video[@class='video-stream html5-main-video']")
	private static WebElement videoPause;
	
	@FindBy(xpath = "//div[contains(@class,'paused-mode')]")
	private static WebElement pausedMode;
	
	@FindBy(xpath = "//a[text()='more than once a week']")
	private static WebElement moreThanOnceAWeek;
	
	@FindBy(xpath = "//a[text()='confuse the pain of heartburn with a heart attack']")
	private static WebElement confuseThePain;
	
	@FindBy(id = "seeproducts-link")
	private static WebElement seeProducts;
	
	
	
	
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
	
	
	public void clickYoutube() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(youtubePlay);
		clickElementUsingJavaScript(youtubePlay);
		visibilityOf(iframe);
		switchToFrameUsingElement(iframe);
		moveToElement(youtubePlayIcon);
		actionClick(youtubePlayIcon);
		if (isElementPresent(playingMode)) {
			Assert.assertTrue(elementIsDisplayed(playingMode));
			Thread.sleep(5000);
			clickElementUsingJavaScript(videoPause);
			visibilityOf(pausedMode);
			Assert.assertTrue(elementIsDisplayed(pausedMode));
			System.out.println("Video is playing Successfully");
		} else {
		System.out.println("Video is Unavailable");	
		Assert.assertTrue(false);
		}
		frameSwitchingToDefaultContent();
	}
	
	public void clickHyperlinkOne() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(moreThanOnceAWeek);
		clickElementUsingJavaScript(moreThanOnceAWeek);
	}
	
	public void clickHyperLinkTwo() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(confuseThePain);
		clickElementUsingJavaScript(confuseThePain);
	}
	
	public void clickSeeProducts() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(seeProducts);
		clickElementUsingJavaScript(seeProducts);
	}
}
