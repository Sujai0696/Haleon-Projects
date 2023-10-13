package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class FlonaseHayFeverTipsPage extends BaseClass{
	
	
	public FlonaseHayFeverTipsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[@href='/allergies/what-is-hay-fever-old/' and text()='hay fever']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//a[@href='/allergies/when-and-what-is-allergy-season/' and text()='seasonal allergies']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//a[@href='/allergies/tree-pollen-allergy-types/' and text()='pollen from trees']")
	private static WebElement hyperLinkThree;
	
	@FindBy(xpath = "//a[@href='/allergies/dust-allergies/' and text()='dust mites']")
	private static WebElement hyperLinkFour;
	
	@FindBy(xpath = "//a[@href='/allergies/pet-allergies/' and text()='pet dander']")
	private static WebElement hyperLinkFive;
	
	@FindBy(xpath = "//a[@href='/allergies/mold-allergies/' and text()='indoor molds']")
	private static WebElement hyperLinkSix;
	
	@FindBy(xpath = "//a[@href='/allergies/sneezing-facts/' and text()='Sneezing']")
	private static WebElement hyperLinkSeven;
	
	@FindBy(xpath = "//a[@href='/allergies/can-allergies-make-you-tired/' and text()='Fatigue']")
	private static WebElement hyperLinkEight;
	
	@FindBy(xpath = "//a[@href='/allergies/allergic-rhinitis/' and text()='allergic rhinitis']")
	private static WebElement hyperLinkNine;
	
	@FindBy(xpath = "//a[@href='/allergies/air-purifiers-for-allergies/' and text()='air purifier can help if you suffer from allergy symptoms indoors']")
	private static WebElement hyperLinkTen;
	
	@FindBy(xpath = "//a[@href='/products/flonase-allergy-relief/' and text()='FLONASE Nasal Sprays']")
	private static WebElement hyperLinkEleven;
	
	@FindBy(xpath = "//a[@href='/products/' and text()='FLONASE products']")
	private static WebElement hyperLinkTweleve;
	
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
	
	public void clickHyperLinkSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkSix)) {
			scrollDownUsingElement(hyperLinkSix);
			clickElementUsingJavaScript(hyperLinkSix);
			pageLoad();
			System.out.println("hyperLinkSix clicked successfully");
		} else {
			System.out.println("hyperLinkSix is not presented in the page");
			throw new Exception("hyperLinkSix is not presented in the page");
		}
	}
	
	
	public void clickHyperLinkSeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkSeven)) {
			scrollDownUsingElement(hyperLinkSeven);
			clickElementUsingJavaScript(hyperLinkSeven);
			pageLoad();
			System.out.println("hyperLinkSeven clicked successfully");
		} else {
			System.out.println("hyperLinkSeven is not presented in the page");
			throw new Exception("hyperLinkSeven is not presented in the page");
		}
	}
	
	public void clickHyperLinkEight() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkEight)) {
			scrollDownUsingElement(hyperLinkEight);
			clickElementUsingJavaScript(hyperLinkEight);
			pageLoad();
			System.out.println("hyperLinkEight clicked successfully");
		} else {
			System.out.println("hyperLinkEight is not presented in the page");
			throw new Exception("hyperLinkEight is not presented in the page");
		}
	}
	
	public void clickHyperLinkNine() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkNine)) {
			scrollDownUsingElement(hyperLinkNine);
			clickElementUsingJavaScript(hyperLinkNine);
			pageLoad();
			System.out.println("hyperLinkNine clicked successfully");
		} else {
			System.out.println("hyperLinkNine is not presented in the page");
			throw new Exception("hyperLinkNine is not presented in the page");
		}
	}
	
	public void clickHyperLinkTen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkTen)) {
			scrollDownUsingElement(hyperLinkTen);
			clickElementUsingJavaScript(hyperLinkTen);
			pageLoad();
			System.out.println("hyperLinkTen clicked successfully");
		} else {
			System.out.println("hyperLinkTen is not presented in the page");
			throw new Exception("hyperLinkTen is not presented in the page");
		}
	}
	
	public void clickHyperLinkEleven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkEleven)) {
			scrollDownUsingElement(hyperLinkEleven);
			clickElementUsingJavaScript(hyperLinkEleven);
			pageLoad();
			System.out.println("hyperLinkEleven clicked successfully");
		} else {
			System.out.println("hyperLinkEleven is not presented in the page");
			throw new Exception("hyperLinkEleven is not presented in the page");
		}
	}
	
	public void clickHyperLinkTweleve() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkTweleve)) {
			scrollDownUsingElement(hyperLinkTweleve);
			clickElementUsingJavaScript(hyperLinkTweleve);
			pageLoad();
			System.out.println("hyperLinkTweleve clicked successfully");
		} else {
			System.out.println("hyperLinkTweleve is not presented in the page");
			throw new Exception("hyperLinkTweleve is not presented in the page");
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

