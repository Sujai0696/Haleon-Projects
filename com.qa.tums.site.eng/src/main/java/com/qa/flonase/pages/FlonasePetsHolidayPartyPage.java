package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class FlonasePetsHolidayPartyPage extends BaseClass{
	
	public FlonasePetsHolidayPartyPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[@href='/products/where-to-buy/' and text()='Find out where you can buy FLONASE for you and your guests']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//a[@href='/allergies/#indoor-allergies' and normalize-space()='Indoor Allergies']")
	private static WebElement tagsLinksOne;
	
	@FindBy(xpath = "//a[@href='/allergies/#living-with-allergies' and normalize-space()='Living with Allergies']")
	private static WebElement tagsLinksTwo;
	
	@FindBy(xpath = "//a[@href='/allergies/#pet-allergies' and normalize-space()='Pet Allergies']")
	private static WebElement tagsLinksThree;
	
	@FindBy(xpath = "//a[@href='/allergies/#allergy-causes' and normalize-space()='Allergy Causes']")
	private static WebElement tagsLinksFour;
	
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
	
	public void clickTagsLinksTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tagsLinksTwo)) {
			scrollDownUsingElement(tagsLinksTwo);
			clickElementUsingJavaScript(tagsLinksTwo);
			pageLoad();
			System.out.println("tagsLinksTwo clicked successfully");
		} else {
			System.out.println("tagsLinksTwo is not presented in the page");
			throw new Exception("tagsLinksTwo is not presented in the page");
		}
	}
	
	public void clickTagsLinksThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tagsLinksThree)) {
			scrollDownUsingElement(tagsLinksThree);
			clickElementUsingJavaScript(tagsLinksThree);
			pageLoad();
			System.out.println("tagsLinksThree clicked successfully");
		} else {
			System.out.println("tagsLinksThree is not presented in the page");
			throw new Exception("tagsLinksThree is not presented in the page");
		}
	}
	
	public void clickTagsLinksFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tagsLinksFour)) {
			scrollDownUsingElement(tagsLinksFour);
			clickElementUsingJavaScript(tagsLinksFour);
			pageLoad();
			System.out.println("tagsLinksFour clicked successfully");
		} else {
			System.out.println("tagsLinksFour is not presented in the page");
			throw new Exception("tagsLinksFour is not presented in the page");
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
