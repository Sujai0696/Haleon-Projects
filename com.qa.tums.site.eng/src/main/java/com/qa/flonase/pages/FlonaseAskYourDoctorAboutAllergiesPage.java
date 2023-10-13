package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class FlonaseAskYourDoctorAboutAllergiesPage extends BaseClass{
	
	public FlonaseAskYourDoctorAboutAllergiesPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	
	@FindBy(xpath = "//a[@href='/products/flonase-allergy-relief/' and text()='over-the-counter solution for nasal congestion']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//a[@href='/allergies/what-is-ragweed-allergy/' and text()='ragweed season']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//a[@href='/allergies/flonase-itchy-watery-eyes/' and text()='Itchy, watery eyes']")
	private static WebElement hyperLinkThree;
	
	@FindBy(xpath = "//a[@href='/allergies/#living-with-allergies' and normalize-space()='Living with Allergies']")
	private static WebElement tagsLinksOne;
	
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
	
	public void clickHyperLinkOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkOne)) {
			scrollDownUsingElement(hyperLinkOne);
			clickElementUsingJavaScript(hyperLinkOne);
			pageLoad();
			System.out.println("hyperLinkOne clicked successfully");
		} else {
			System.out.println("hyperLinkOne is not presented in the page");
			throw new Exception("hyperLinkOne is not presented in the page");
		}
	}
	
	
	public void clickHyperLinkTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkTwo)) {
			scrollDownUsingElement(hyperLinkTwo);
			clickElementUsingJavaScript(hyperLinkTwo);
			pageLoad();
			System.out.println("hyperLinkTwo clicked successfully");
		} else {
			System.out.println("hyperLinkTwo is not presented in the page");
			throw new Exception("hyperLinkTwo is not presented in the page");
		}
	}
	
	public void clickHyperLinkThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkThree)) {
			scrollDownUsingElement(hyperLinkThree);
			clickElementUsingJavaScript(hyperLinkThree);
			pageLoad();
			System.out.println("hyperLinkThree clicked successfully");
		} else {
			System.out.println("hyperLinkThree is not presented in the page");
			throw new Exception("hyperLinkThree is not presented in the page");
		}
	}
	
	public void clickTagsLinksOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tagsLinksOne)) {
			scrollDownUsingElement(tagsLinksOne);
			clickElementUsingJavaScript(tagsLinksOne);
			pageLoad();
			System.out.println("tagsLinksOne clicked successfully");
		} else {
			System.out.println("tagsLinksOne is not presented in the page");
			throw new Exception("tagsLinksOne is not presented in the page");
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
