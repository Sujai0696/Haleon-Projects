package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class FlonaseTreePollenAllergyTypesPage extends BaseClass{
	
	public FlonaseTreePollenAllergyTypesPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[@href='/allergies/spring-allergies-causes-symptoms-treatment/' and text()='spring allergy season']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//a[@href='/allergies/baseball-spring-allergies-checklist/' and text()='spring allergy']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//a[@href='/allergies/summer-allergies/' and text()='allergy symptoms well into early summer']")
	private static WebElement hyperLinkThree;
	
	@FindBy(xpath = "//a[@href='/allergies/#about-allergies' and text()='About Allergies']")
	private static WebElement tagsLinksOne;
	
	@FindBy(xpath = "//a[@href='/allergies/#spring-allergies' and text()='Spring Allergies']")
	private static WebElement tagsLinksTwo;
	
	
	@FindBy(xpath = "//a[@href='/allergies/' and text()='See all articles >']")
	private static WebElement hyperLinkSeeAllArticles;
	
	
	@FindBy(xpath = "//a[@href='/allergies/when-and-what-is-allergy-season/' and text()='5 ALLERGY MYTHS DEBUNKED']")
	private static WebElement allAboutAllergiesArticleOne;
	
	@FindBy(xpath = "//a[@href='/allergies/when-and-what-is-allergy-season/' and text()=\"ALLERGY TRIGGERS YOU DIDN'T KNOW ABOUT\"]")
	private static WebElement allAboutAllergiesArticleTwo;
	
	@FindBy(xpath = "//a[@href='/allergies/what-to-expect-flonase-products/' and text()=\"GETTING STARTED WITH YOUR FLONASE PRODUCT\"]")
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
