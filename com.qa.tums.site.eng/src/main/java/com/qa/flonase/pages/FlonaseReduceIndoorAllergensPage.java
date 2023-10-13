package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class FlonaseReduceIndoorAllergensPage extends BaseClass{
	
	public FlonaseReduceIndoorAllergensPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	

	@FindBy(xpath = "//u[text()='allergies']//ancestor::a[@href='/allergies/']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//u[text()='indoor allergens']//ancestor::a[@href='/allergies/reduce-indoor-allergens/']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//u[text()='nasal allergy symptoms']//ancestor::a[@href='/allergies/symptoms-causes/']")
	private static WebElement hyperLinkThree;
	
	@FindBy(xpath = "//u[text()='outdoor allergens']//ancestor::a[@href='/allergies/indoor-vs-outdoor-allergens/']")
	private static WebElement hyperLinkFour;
	
	@FindBy(xpath = "//a[@href='/products/flonase-allergy-relief/' and normalize-space()='the #1 most prescribed allergy medicine']")
	private static WebElement hyperLinkFive;
	
	
	
	@FindBy(xpath = "//a[@href='/allergies/#indoor-allergies' and normalize-space()='Indoor Allergies']")
	private static WebElement tagsLinksOne;
	
	@FindBy(xpath = "//a[@href='/allergies/#living-with-allergies' and normalize-space()='Living with Allergies']")
	private static WebElement tagsLinksTwo;
	
	
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
	
	public void clickHyperLinkFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkFour)) {
			scrollDownUsingElement(hyperLinkFour);
			clickElementUsingJavaScript(hyperLinkFour);
			pageLoad();
			System.out.println("hyperLinkFour clicked successfully");
		} else {
			System.out.println("hyperLinkFour is not presented in the page");
			throw new Exception("hyperLinkFour is not presented in the page");
		}
	}
	
	
	public void clickHyperLinkFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkFive)) {
			scrollDownUsingElement(hyperLinkFive);
			clickElementUsingJavaScript(hyperLinkFive);
			pageLoad();
			System.out.println("hyperLinkFive clicked successfully");
		} else {
			System.out.println("hyperLinkFive is not presented in the page");
			throw new Exception("hyperLinkFive is not presented in the page");
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
