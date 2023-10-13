package com.qa.quit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class Quit7StrangeThingsPage extends BaseClass{
	
	public Quit7StrangeThingsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='News and Events' and @href='/news-and-events.html']")
	private static WebElement bannerImgLink;
	
	@FindBy(xpath = "//a[text()='Stress' and @href='/quit-smoking-tips/smoking-and-anxiety/dealing-with-stress.html']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//a[text()='The Best Way to Break a Bad Habit' and @href='/news-and-events/the-best-way-to-break.html']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//div[@class='richText component section rte-quit-articles-navigation even last']//a[text()='Back to News & Features' and @href='/news-and-events.html']")
	private static WebElement hyperLinkThree;
	
	@FindBy(xpath = "//a[text()='Easy everyday habits that can keep your heart healthy' and @href='/news-and-events/easy-everyday-habits.html']")
	private static WebElement hyperLinkFour;
	
	
	
	
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
	
	
	public void clickHyperLinkFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkFour)) {
			scrollDownUsingElement(hyperLinkFour);
			clickElementUsingJavaScript(hyperLinkFour);
			pageLoad();
			System.out.println("hyperLinkFour  clicked successfully");
		} else {
			System.out.println("hyperLinkFour  is not presented in the page");
			throw new Exception("hyperLinkFour  is not presented in the page");
		}
	}
	
}
