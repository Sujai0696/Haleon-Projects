package com.qa.quit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class QuitThePathToZeroPage extends BaseClass{
	
	public QuitThePathToZeroPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='News and Events' and @href='/news-and-events.html']")
	private static WebElement bannerImgLink;
	
	
	
	
	
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
	
	
	
}
