package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.baseClass.BaseClass;

public class TumsHeartburnvsIndigestion extends BaseClass {
	
	public TumsHeartburnvsIndigestion() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[@title='Heartburn 101']")
	private static WebElement heartburn101;
	
	@FindBy(xpath = "//div[@data-link-title='Heartburn 101']//a[text()='Heartburn vs. Indigestion ']")
	private static WebElement heartburnvsIndigestion;
	
	@FindBy(xpath = "//nav[@aria-label='Breadcrumb']//li[@class='breadcrumb-list-item odd first ']")
	private static WebElement Bread_HomeIcon;
	
	@FindBy(xpath = "//nav[@aria-label='Breadcrumb']//li[@class='breadcrumb-list-item even ']")
	private static WebElement Bread_Heartburn101;

	@FindBy(xpath = "//div[@class='youtube-player content paragraphSystem universal']")
	private static WebElement youtubePlay;
	//div[@class='ytp-cued-thumbnail-overlay-image']
	@FindBy(xpath = "//iframe[@title='The Difference Between Heartburn & Indigestion | TUMS']")
	private static WebElement youtubeFrame;
	
	@FindBy(xpath = "//div[@class='html5-video-container']//video")
	private static WebElement playvideo;
	
	@FindBy(xpath = "//button[@title='Play (k)']")
	private static WebElement playBtn;
	
	@FindBy(xpath = "//button[@title='Pause (k)']")
	private static WebElement pausebtn;
	

	public void clickOnHomeIcon() throws Throwable {
		implicitWait();
		moveToElement(Bread_HomeIcon);
		clickElementUsingJavaScript(Bread_HomeIcon);
		
	}
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

	public void clickOnHeartBurn101() throws Throwable {
		//moveToElement(Bread_Heartburn101);
		elementClick(Bread_Heartburn101);
	}

	public void clickOnyoutubevideo() throws Throwable {
		moveToElement(youtubePlay);
		elementClick(youtubePlay);
		System.out.println("clicked on video section");

	}

	public void switchToYoutubeFrame() throws Throwable {
		//switchToFrameUsingElement(youtubeFrame);
		//System.out.println("switched Frame");
		driver.switchTo().frame(youtubeFrame);

	}
	
	public void verifyYoutubevideo() throws Throwable {
		actionClick(playvideo);
		moveToElement(playBtn);
		clickElementUsingJavaScript(playBtn);
		// switchToFrameUsingElement(youtubeFrame);
		// actionClick(playvideo);
		if (elementIsDisplayed(pausebtn)) {
			System.out.println("Video is playing");
		} else {
			System.out.println("Video is unavailable");
		}
		Thread.sleep(5000);
		//elementClick(pausebtn);
		frameSwitchingToDefaultContent();
		}
	
}
