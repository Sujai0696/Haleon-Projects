package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class FlonasePrepareForAllergySeasonPage extends BaseClass{
	
	public FlonasePrepareForAllergySeasonPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[@href='/allergies/common-allergy-symptoms/' and text()='Symptoms']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//a[@href='/allergies/sneezing-facts/' and text()='sneezing']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//a[@href='/allergies/pollen-allergies/' and text()='pollen']")
	private static WebElement hyperLinkThree;
	
	@FindBy(xpath = "//a[@href='/allergies/tree-pollen-allergy-types/' and text()='tree pollen season']")
	private static WebElement hyperLinkFour;
	
	@FindBy(xpath = "//a[@href='/allergies/summer-allergies/' and text()='summer']")
	private static WebElement hyperLinkFive;
	
	@FindBy(xpath = "//a[@href='/allergies/what-is-ragweed-allergy/' and text()='ragweed pollen causes most fall allergies']")
	private static WebElement hyperLinkSix;
	
	@FindBy(xpath = "//a[@href='/allergies/when-and-what-is-allergy-season/' and text()='spring, summer and fall pollen seasons']")
	private static WebElement hyperLinkSeven;
	
	@FindBy(xpath = "//a[@href='/allergies/allergy-pills-vs-nasal-allergy-sprays/' and text()='allergy treatment that targets your symptoms']")
	private static WebElement hyperLinkEight;
	
	@FindBy(xpath = "//a[@href='/products/' and text()='FLONASE nasal sprays']")
	private static WebElement hyperLinkNine;
	
	@FindBy(xpath = "//a[@href='/allergies/air-purifiers-for-allergies/' and text()='air conditioning unit']")
	private static WebElement hyperLinkTen;
	
	@FindBy(xpath = "//a[@href='/allergies/gardening-with-allergies/' and text()='gardening before your seasonal allergies properly kick in']")
	private static WebElement hyperLinkEleven;
	
	@FindBy(xpath = "//a[@href='/allergies/ragweed/' and text()='ragweed that are common allergens']")
	private static WebElement hyperLinkTweleve;
	
	@FindBy(xpath = "//a[@href='/allergies/best-cities-for-allergies/' and text()='five best U.S. cities for avoiding pollen']")
	private static WebElement hyperLinkThirteen;
	
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
	
	public void clickHyperLinkThirteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkThirteen)) {
			scrollDownUsingElement(hyperLinkThirteen);
			clickElementUsingJavaScript(hyperLinkThirteen);
			pageLoad();
			System.out.println("hyperLinkThirteen clicked successfully");
		} else {
			System.out.println("hyperLinkThirteen is not presented in the page");
			throw new Exception("hyperLinkThirteen is not presented in the page");
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
