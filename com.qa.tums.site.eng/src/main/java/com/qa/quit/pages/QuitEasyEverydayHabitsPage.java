package com.qa.quit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class QuitEasyEverydayHabitsPage extends BaseClass{
	
	public QuitEasyEverydayHabitsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='News and Events' and @href='/news-and-events.html']")
	private static WebElement bannerImgLink;
	
	@FindBy(xpath = "//a[text()='7 strange things stress can do to your body' and @href='/news-and-events/7-strange-things.html']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//div[@class='richText component section rte-quit-articles-navigation even last']//a[text()='Back to News & Features' and @href='/news-and-events.html']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//a[text()='For smokers, finding a job is harder' and @href='/news-and-events/for-smokers-finding-a-job.html']")
	private static WebElement hyperLinkThree;
	
	
	
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

	public void clickBannerImgLink() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(bannerImgLink)) {
			scrollDownUsingElement(bannerImgLink);
			clickElementUsingJavaScript(bannerImgLink);
			pageLoad();
			System.out.println("BannerImgLink One clicked successfully");
		} else {
			System.out.println("BannerImgLink One is not presented in the page");
			throw new Exception("BannerImgLink One is not presented in the page");
		}
	}
	
	public void clickHyperLinkOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkOne)) {
			scrollDownUsingElement(hyperLinkOne);
			clickElementUsingJavaScript(hyperLinkOne);
			pageLoad();
			System.out.println("hyperLinkOne  clicked successfully");
		} else {
			System.out.println("hyperLinkOne  is not presented in the page");
			throw new Exception("hyperLinkOne  is not presented in the page");
		}
	}
	

	public void clickHyperLinkTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkTwo)) {
			scrollDownUsingElement(hyperLinkTwo);
			clickElementUsingJavaScript(hyperLinkTwo);
			pageLoad();
			System.out.println("hyperLinkTwo  clicked successfully");
		} else {
			System.out.println("hyperLinkTwo  is not presented in the page");
			throw new Exception("hyperLinkTwo  is not presented in the page");
		}
	}
	
	public void clickHyperLinkThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkThree)) {
			scrollDownUsingElement(hyperLinkThree);
			clickElementUsingJavaScript(hyperLinkThree);
			pageLoad();
			System.out.println("hyperLinkThree  clicked successfully");
		} else {
			System.out.println("hyperLinkThree  is not presented in the page");
			throw new Exception("hyperLinkThree  is not presented in the page");
		}
	}

}
