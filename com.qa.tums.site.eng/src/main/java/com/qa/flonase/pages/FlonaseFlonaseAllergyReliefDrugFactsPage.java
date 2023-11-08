package com.qa.flonase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class FlonaseFlonaseAllergyReliefDrugFactsPage extends BaseClass{
	
	public FlonaseFlonaseAllergyReliefDrugFactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[@href='/products/flonase-allergy-relief/' and text()='About']")
	private static WebElement bannerImgLinkOne;
	
	@FindBy(xpath = "//a[@href='/products/flonase-allergy-relief/how-to-use/' and text()='How to use']")
	private static WebElement bannerImgLinkTwo;
	
	@FindBy(xpath = "//a[@href='/products/flonase-allergy-relief/drug-facts/' and text()='Drug facts']")
	private static WebElement bannerImgLinkThree;
	
	@FindBy(xpath = "//a[@href='/products/flonase-allergy-relief/faqs/' and text()='FAQs']")
	private static WebElement bannerImgLinkFour;
	
	@FindBy(xpath = "//a[@href='/products/flonase-allergy-relief/reviews/' and text()='Read all reviews']")
	private static WebElement bannerImgLinkFive;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item odd first is-active']//ancestor::span[text()='USE WITH OTHER MEDICATIONS']")
	private static WebElement tabSecActiveOne;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item odd first']//ancestor::span[text()='USE WITH OTHER MEDICATIONS']")
	private static WebElement tabsecOne;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item even last ']//ancestor::span[text()='WHO SHOULD NOT USE']")
	private static WebElement tabSecTwo;
	
	@FindBy(xpath = "//li[@class='tabs-nav-item even last is-active']//ancestor::span[text()='WHO SHOULD NOT USE']")
	private static WebElement tabSecAciveTwo;
	
	@FindBy(xpath = "//a[@href='/allergies/' and text()='See all articles >']")
	private static WebElement hyperLinkSeeAllArticles;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-400 flex cols-d-2 cols-m-2 flex-row align-items-center align-items-center-d anchor-box justify-content-stretch first odd col-xs-12']")
	private static WebElement allAboutAllergiesArticleOne;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-400 flex cols-d-2 cols-m-2 flex-row align-items-center align-items-center-d anchor-box even col-xs-12']")
	private static WebElement allAboutAllergiesArticleTwo;
	
	@FindBy(xpath = "//div[@class='box component section bg-color-white border border-color-gray-400 flex cols-d-2 cols-m-2 flex-row align-items-center align-items-center-d anchor-box odd last col-xs-12']")
	private static WebElement allAboutAllergiesArticleThree;
	
	@FindBy(xpath = "//a[@href='/products/sensimist/' and text()='FLONASE SENSIMIST Allergy Relief']")
	private static WebElement reliefProductsOne;
	
	@FindBy(xpath = "//a[@href='/products/sensimist-family-pack/' and text()='Family FLONASE Allergy Relief Pack ']")
	private static WebElement reliefProductsTwo;
	
	@FindBy(xpath = "//a[@href='/products/childrens-sensimist/' and text()='Children’s FLONASE SENSIMIST Allergy Relief']")
	private static WebElement reliefProductsThree;
	
	@FindBy(xpath = "//a[@href='/products/childrens-flonase/' and text()='Children’s FLONASE Allergy Relief']")
	private static WebElement reliefProductsFour;
	
	@FindBy(xpath = "//a[@href='/products/headache-and-allergy/' and text()='FLONASE Headache & Allergy Relief']")
	private static WebElement reliefProductsFive;
	
	@FindBy(xpath = "//a[@href='/products/nighttime-allergy/' and text()='FLONASE Nighttime Headache & Allergy Relief']")
	private static WebElement reliefProductsSix;
	
	
	
	
	
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
	
	public void clickBannerImgLinkOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(bannerImgLinkOne)) {
			scrollDownUsingElement(bannerImgLinkOne);
			clickElementUsingJavaScript(bannerImgLinkOne);
			pageLoad();
			System.out.println("bannerImgLinkOne clicked successfully");
		} else {
			System.out.println("bannerImgLinkOne is not presented in the page");
			throw new Exception("bannerImgLinkOne is not presented in the page");
		}
	}
	
	public void clickBannerImgLinkTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(bannerImgLinkTwo)) {
			scrollDownUsingElement(bannerImgLinkTwo);
			clickElementUsingJavaScript(bannerImgLinkTwo);
			pageLoad();
			System.out.println("bannerImgLinkTwo clicked successfully");
		} else {
			System.out.println("bannerImgLinkTwo is not presented in the page");
			throw new Exception("bannerImgLinkTwo is not presented in the page");
		}
	}
	
	public void clickBannerImgLinkThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(bannerImgLinkThree)) {
			scrollDownUsingElement(bannerImgLinkThree);
			clickElementUsingJavaScript(bannerImgLinkThree);
			pageLoad();
			System.out.println("bannerImgLinkThree clicked successfully");
		} else {
			System.out.println("bannerImgLinkThree is not presented in the page");
			throw new Exception("bannerImgLinkThree is not presented in the page");
		}
	}
	
	public void clickBannerImgLinkFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(bannerImgLinkFour)) {
			scrollDownUsingElement(bannerImgLinkFour);
			clickElementUsingJavaScript(bannerImgLinkFour);
			pageLoad();
			System.out.println("bannerImgLinkFour clicked successfully");
		} else {
			System.out.println("bannerImgLinkFour is not presented in the page");
			throw new Exception("bannerImgLinkFour is not presented in the page");
		}
	}
	
	public void clickBannerImgLinkFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(bannerImgLinkFive)) {
			scrollDownUsingElement(bannerImgLinkFive);
			clickElementUsingJavaScript(bannerImgLinkFive);
			pageLoad();
			System.out.println("bannerImgLinkFive clicked successfully");
		} else {
			System.out.println("bannerImgLinkFive is not presented in the page");
			throw new Exception("bannerImgLinkFive is not presented in the page");
		}
	}
	
	public void clickTabSection() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(tabSecActiveOne)) {
			scrollDownUsingElement(tabSecActiveOne);
			clickElementUsingJavaScript(tabSecTwo);
			visibilityOf(tabSecAciveTwo);
			Assert.assertTrue(elementIsDisplayed(tabSecAciveTwo));
			pageLoad();
			clickElementUsingJavaScript(tabsecOne);
			visibilityOf(tabSecActiveOne);
			Assert.assertTrue(elementIsDisplayed(tabSecActiveOne));
			System.out.println("Tab Section verified successfilly");
		} else {
			System.out.println("tabSecActiveOne is not presented in the page");
			throw new Exception("tabSecActiveOne is not presented in the page");
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
	
	public void clickReliefProductsOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(reliefProductsOne)) {
			scrollDownUsingElement(reliefProductsOne);
			clickElementUsingJavaScript(reliefProductsOne);
			pageLoad();
			System.out.println("reliefProductsOne clicked successfully");
		} else {
			System.out.println("reliefProductsOne is not presented in the page");
			throw new Exception("reliefProductsOne is not presented in the page");
		}
	}
	
	public void clickReliefProductsTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(reliefProductsTwo)) {
			scrollDownUsingElement(reliefProductsTwo);
			clickElementUsingJavaScript(reliefProductsTwo);
			pageLoad();
			System.out.println("reliefProductsTwo clicked successfully");
		} else {
			System.out.println("reliefProductsTwo is not presented in the page");
			throw new Exception("reliefProductsTwo is not presented in the page");
		}
	}
	
	public void clickReliefProductsThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(reliefProductsThree)) {
			scrollDownUsingElement(reliefProductsThree);
			clickElementUsingJavaScript(reliefProductsThree);
			pageLoad();
			System.out.println("reliefProductsThree clicked successfully");
		} else {
			System.out.println("reliefProductsThree is not presented in the page");
			throw new Exception("reliefProductsThree is not presented in the page");
		}
	}
	
	public void clickReliefProductsFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(reliefProductsFour)) {
			scrollDownUsingElement(reliefProductsFour);
			clickElementUsingJavaScript(reliefProductsFour);
			pageLoad();
			System.out.println("reliefProductsFour clicked successfully");
		} else {
			System.out.println("reliefProductsFour is not presented in the page");
			throw new Exception("reliefProductsFour is not presented in the page");
		}
	}
	
	public void clickReliefProductsFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(reliefProductsFive)) {
			scrollDownUsingElement(reliefProductsFive);
			clickElementUsingJavaScript(reliefProductsFive);
			pageLoad();
			System.out.println("reliefProductsFive clicked successfully");
		} else {
			System.out.println("reliefProductsFive is not presented in the page");
			throw new Exception("reliefProductsFive is not presented in the page");
		}
	}
	
	public void clickReliefProductsSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(reliefProductsSix)) {
			scrollDownUsingElement(reliefProductsSix);
			clickElementUsingJavaScript(reliefProductsSix);
			pageLoad();
			System.out.println("reliefProductsSix clicked successfully");
		} else {
			System.out.println("reliefProductsSix is not presented in the page");
			throw new Exception("reliefProductsSix is not presented in the page");
		}
	}
	
	

}
