package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class FlonasePollenAllergiesPage extends BaseClass{
	
	public FlonasePollenAllergiesPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	
	
	@FindBy(xpath = "//a[@href='/allergies/tree-pollen-allergy-types/' and text()='pollen']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//a[@href='/allergies/dust-allergies/' and text()='dust']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//a[@href='/allergies/pet-allergies/' and text()='dogs or cats']")
	private static WebElement hyperLinkThree;
	
	@FindBy(xpath = "//a[@href='/allergies/common-allergy-symptoms/' and text()='allergy symptoms']")
	private static WebElement hyperLinkFour;
	
	@FindBy(xpath = "//a[@href='/allergies/can-allergies-make-you-tired/' and text()='interfere with daily activities']")
	private static WebElement hyperLinkFive;
	
	@FindBy(xpath = "//a[@href='/allergies/types-of-allergies/' and text()='OVERVIEW']")
	private static WebElement hyperLinkSix;
	
	@FindBy(xpath = "//a[@href='/allergies/pollen-allergies/' and text()='POLLEN']")
	private static WebElement hyperLinkSeven;
	
	@FindBy(xpath = "//a[@href='/allergies/pet-allergies/' and text()='PET DANDER']")
	private static WebElement hyperLinkEight;
	
	@FindBy(xpath = "//a[@href='/allergies/dust-allergies/' and text()='DUST MITES']")
	private static WebElement hyperLinkNine;
	
	@FindBy(xpath = "//a[@href='/allergies/mold-allergies/' and text()='MOLD']")
	private static WebElement hyperLinkTen;
	
	@FindBy(xpath = "//a[@href='/allergies/ragweed/' and text()='RAGWEED']")
	private static WebElement hyperLinkEleven;
	
	@FindBy(xpath = "//a[@href='/allergies/what-is-hay-fever-old/' and text()='hay fever']")
	private static WebElement hyperLinkTweleve;
	
	@FindBy(xpath = "//a[@href='/allergies/anatomy-of-an-allergy-attack/' and text()='your body mistakes the pollen for a dangerous substance']")
	private static WebElement hyperLinkThirteen;
	
	@FindBy(xpath = "//a[@href='/allergies/what-is-ragweed-allergy/' and text()='Ragweed plants are some of the biggest pollen']")
	private static WebElement hyperLinkFourteen;
	
	@FindBy(xpath = "//a[@href='/allergies/sneezing-facts/' and text()='Sneezing']")
	private static WebElement hyperLinkFifteen;
	
	@FindBy(xpath = "//a[@href='/allergies/flonase-itchy-watery-eyes/' and text()='Itchy, watery eyes']")
	private static WebElement hyperLinkSixteen;
	
	@FindBy(xpath = "//a[@href='/allergies/hay-fever-tips/' and text()='hay fever']")
	private static WebElement hyperLinkSeventeen;
	
	@FindBy(xpath = "//a[@href='/products/' and text()='FLONASE products']")
	private static WebElement hyperLinkEighteen;
	
	@FindBy(xpath = "//a[@href='/allergies/prepare-for-allergy-season/' and text()='6 ways to prepare for the allergy season']")
	private static WebElement hyperLinkNineteen;
	
	
	@FindBy(xpath = "//a[@href='/allergies/#about-allergies' and normalize-space()='About Allergies']")
	private static WebElement tagsLinksOne;
	
	@FindBy(xpath = "//a[@href='/allergies/#living-with-allergies' and normalize-space()='Living With Allergies']")
	private static WebElement tagsLinksTwo;
	
	
	@FindBy(xpath = "//a[@href='/allergies/' and text()='See all articles >']")
	private static WebElement hyperLinkSeeAllArticles;
	
	
	@FindBy(xpath = "//a[@href='/allergies/flonase-vs-nasal-decongestants/' and text()='THE DIFFERENCE BETWEEN FLONASE AND NASAL DECONGESTANTS']")
	private static WebElement allAboutAllergiesArticleOne;
	
	@FindBy(xpath = "//a[@href='#' and text()='WHEN IS ALLERGY SEASON IN 2019?']")
	private static WebElement allAboutAllergiesArticleTwo;
	
	@FindBy(xpath = "//a[@href='#' and text()='GETTING STARTED WITH YOUR FLONASE PRODUCT']")
	private static WebElement allAboutAllergiesArticleThree;
	
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
	
	public void clickHyperLinkFourteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkFourteen)) {
			scrollDownUsingElement(hyperLinkFourteen);
			clickElementUsingJavaScript(hyperLinkFourteen);
			pageLoad();
			System.out.println("hyperLinkFourteen clicked successfully");
		} else {
			System.out.println("hyperLinkFourteen is not presented in the page");
			throw new Exception("hyperLinkFourteen is not presented in the page");
		}
	}
	
	public void clickHyperLinkFifteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkFifteen)) {
			scrollDownUsingElement(hyperLinkFifteen);
			clickElementUsingJavaScript(hyperLinkFifteen);
			pageLoad();
			System.out.println("hyperLinkFifteen clicked successfully");
		} else {
			System.out.println("hyperLinkFifteen is not presented in the page");
			throw new Exception("hyperLinkFifteen is not presented in the page");
		}
	}
	
	public void clickHyperLinkSixteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkSixteen)) {
			scrollDownUsingElement(hyperLinkSixteen);
			clickElementUsingJavaScript(hyperLinkSixteen);
			pageLoad();
			System.out.println("hyperLinkSixteen clicked successfully");
		} else {
			System.out.println("hyperLinkSixteen is not presented in the page");
			throw new Exception("hyperLinkSixteen is not presented in the page");
		}
	}
	
	public void clickHyperLinkSeventeen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkSeventeen)) {
			scrollDownUsingElement(hyperLinkSeventeen);
			clickElementUsingJavaScript(hyperLinkSeventeen);
			pageLoad();
			System.out.println("hyperLinkSeventeen clicked successfully");
		} else {
			System.out.println("hyperLinkSeventeen is not presented in the page");
			throw new Exception("hyperLinkSeventeen is not presented in the page");
		}
	}
	
	public void clickHyperLinkEighteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkEighteen)) {
			scrollDownUsingElement(hyperLinkEighteen);
			clickElementUsingJavaScript(hyperLinkEighteen);
			pageLoad();
			System.out.println("hyperLinkEighteen clicked successfully");
		} else {
			System.out.println("hyperLinkEighteen is not presented in the page");
			throw new Exception("hyperLinkEighteen is not presented in the page");
		}
	}
	
	public void clickHyperLinkNineteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkNineteen)) {
			scrollDownUsingElement(hyperLinkNineteen);
			clickElementUsingJavaScript(hyperLinkNineteen);
			pageLoad();
			System.out.println("hyperLinkNineteen clicked successfully");
		} else {
			System.out.println("hyperLinkNineteen is not presented in the page");
			throw new Exception("hyperLinkNineteen is not presented in the page");
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
	
	
	public void clickHyperLinkSeeAllArticles() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkSeeAllArticles)) {
			scrollDownUsingElement(hyperLinkSeeAllArticles);
			clickElementUsingJavaScript(hyperLinkSeeAllArticles);
			pageLoad();
			System.out.println("hyperLinkSeeAllArticles clicked successfully");
		} else {
			System.out.println("hyperLinkSeeAllArticles is not presented in the page");
			throw new Exception("hyperLinkSeeAllArticles is not presented in the page");
		}
	}
	
	public void clickAllAboutAllergiesArticleOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(allAboutAllergiesArticleOne)) {
			scrollDownUsingElement(allAboutAllergiesArticleOne);
			clickElementUsingJavaScript(allAboutAllergiesArticleOne);
			pageLoad();
			System.out.println("allAboutAllergiesArticleOne clicked successfully");
		} else {
			System.out.println("allAboutAllergiesArticleOne is not presented in the page");
			throw new Exception("allAboutAllergiesArticleOne is not presented in the page");
		}
	}
	
	public void clickAllAboutAllergiesArticleTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(allAboutAllergiesArticleTwo)) {
			scrollDownUsingElement(allAboutAllergiesArticleTwo);
			clickElementUsingJavaScript(allAboutAllergiesArticleTwo);
			pageLoad();
			System.out.println("allAboutAllergiesArticleTwo clicked successfully");
		} else {
			System.out.println("allAboutAllergiesArticleTwo is not presented in the page");
			throw new Exception("allAboutAllergiesArticleTwo is not presented in the page");
		}
	}
	
	public void clickAllAboutAllergiesArticleThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(allAboutAllergiesArticleThree)) {
			scrollDownUsingElement(allAboutAllergiesArticleThree);
			clickElementUsingJavaScript(allAboutAllergiesArticleThree);
			pageLoad();
			System.out.println("allAboutAllergiesArticleThree clicked successfully");
		} else {
			System.out.println("allAboutAllergiesArticleThree is not presented in the page");
			throw new Exception("allAboutAllergiesArticleThree is not presented in the page");
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
