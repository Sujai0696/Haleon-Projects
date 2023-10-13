package com.qa.theraflu.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TherafluCanGinsengCureColdPage extends BaseClass{
	
	public TherafluCanGinsengCureColdPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home' and @href='/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Health Hub' and @href='/treating-cold-flu/']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//self::li[text()=' Can Ginseng Cure My Cold? ']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "(//a[@href='https://www.ncbi.nlm.nih.gov/pmc/articles/PMC3136130/'])[1]")
	private static WebElement bannerImgLinkOne;
	
	
	
	
	
	@FindBy(xpath = "//a[@href='https://nccih.nih.gov/health/asianginseng' and text()='used for health reasons for many centuries']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//a[@href='https://www.ncbi.nlm.nih.gov/pmc/articles/PMC2893180/#!po=4.23729' and text()='study']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//a[@href='https://www.pharmaceutical-journal.com/news-and-analysis/ginseng-effective-in-common-cold-study-suggests/10019455.article?firstPass=false' and text()='findings']")
	private static WebElement hyperLinkThree;
	
	@FindBy(xpath = "//a[@href='https://www.ncbi.nlm.nih.gov/pmc/articles/PMC3136130/' and text()='study']")
	private static WebElement hyperLinkFour;
	
	@FindBy(xpath = "(//a[@href='/products/combo-day-nighttime-severe-cold-relief-honey-lemon-flavor-hot-liquid-powders/'])[2]")
	private static WebElement hyperLinkFive;
	
	@FindBy(xpath = "//a[@href='/' and text()='Theraflu']")
	private static WebElement hyperLinkSix;
	
	
	@FindBy(xpath = "//li[@class='accordion-slide first last odd']//ancestor::header[@class='accordion-head']")
	private static WebElement references;
	
	@FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']//ancestor::header[@class='accordion-head']")
	private static WebElement referencesActive;
	
	@FindBy(xpath = "//h4[text()='How to Manage an Annoying Cough']//ancestor::div[@class='image component section anchor-box zglazyload line-height-h3-1-2 related-articles first odd last']")
	private static WebElement recommendedArticlesOne;
	
	@FindBy(xpath = "//h4[text()='Getting Over the Common Cold']//ancestor::div[@class='image component section anchor-box zglazyload line-height-h3-1-2 related-articles first odd last']")
	private static WebElement recommendedArticlesTwo;
	
	@FindBy(xpath = "//h4[text()='4 Foods and Drinks to Make When You Feel Sick']//ancestor::div[@class='image component section anchor-box zglazyload line-height-h3-1-2 related-articles first odd last']")
	private static WebElement recommendedArticlesThree;
	
	@FindBy(xpath = "//h4[text()='Can You Drink Coffee When You Feel Sick?']//ancestor::div[@class='image component section anchor-box zglazyload line-height-h3-1-2 related-articles first odd last']")
	private static WebElement recommendedArticlesFour;
	
	
	
	
	
	
	
	
	
	
	
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
	
	public void clickBreadcrumbOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbOne)) {
			scrollDownUsingElement(breadcrumbOne);
			clickElementUsingJavaScript(breadcrumbOne);
			pageLoad();
			System.out.println("Breadcrumb One clicked successfully");
		} else {
			System.out.println("Breadcrumb One is not presented in the page");
			throw new Exception("Breadcrumb One is not presented in the page");
		}
	}
	
	public void clickBreadcrumbTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbTwo)) {
			scrollDownUsingElement(breadcrumbTwo);
			clickElementUsingJavaScript(breadcrumbTwo);
			pageLoad();
			System.out.println("breadcrumbTwo clicked successfully");
		} else {
			System.out.println("breadcrumbTwo is not presented in the page");
			throw new Exception("breadcrumbTwo is not presented in the page");
		}
	}
	

	public void clickBreadcrumbThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbThree)) {
			scrollDownUsingElement(breadcrumbThree);
//			clickElementUsingJavaScript(breadcrumbTwo);
			String href = breadcrumbThree.getAttribute("href");
	        boolean hasValidUrl = href != null && !href.isEmpty();
	        Assert.assertFalse(hasValidUrl);
			pageLoad();
			System.out.println("Breadcrumb Three verified successfully");
		} else {
			System.out.println("Breadcrumb Three is not presented in the page");
			throw new Exception("Breadcrumb Three is not presented in the page");
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
	
	public void clickReferences() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(references)) {
			scrollDownUsingElement(references);
			clickElementUsingJavaScript(references);
			visibilityOf(referencesActive);
			Assert.assertTrue(elementIsDisplayed(referencesActive));
			clickElementUsingJavaScript(referencesActive);
			visibilityOf(references);
			Assert.assertTrue(elementIsDisplayed(references));
			pageLoad();
			System.out.println("References verified successfully");
		} else {
			System.out.println("References is not presented in the page");
			throw new Exception("References is not presented in the page");
		}
	}
	
	public void clickRecommendedArticleOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(recommendedArticlesOne)) {
			scrollDownUsingElement(recommendedArticlesOne);
			clickElementUsingJavaScript(recommendedArticlesOne);
			pageLoad();
			System.out.println("recommendedArticlesOne clicked successfully");
		} else {
			System.out.println("recommendedArticlesOne is not presented in the page");
			throw new Exception("recommendedArticlesOne is not presented in the page");
		}
	}
	
	public void clickRecommendedArticleTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(recommendedArticlesTwo)) {
			scrollDownUsingElement(recommendedArticlesTwo);
			clickElementUsingJavaScript(recommendedArticlesTwo);
			pageLoad();
			System.out.println("recommendedArticlesTwo clicked successfully");
		} else {
			System.out.println("recommendedArticlesTwo is not presented in the page");
			throw new Exception("recommendedArticlesTwo is not presented in the page");
		}
	}
	
	public void clickRecommendedArticleThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(recommendedArticlesThree)) {
			scrollDownUsingElement(recommendedArticlesThree);
			clickElementUsingJavaScript(recommendedArticlesThree);
			pageLoad();
			System.out.println("recommendedArticlesThree clicked successfully");
		} else {
			System.out.println("recommendedArticlesThree is not presented in the page");
			throw new Exception("recommendedArticlesThree is not presented in the page");
		}
	}
	
	public void clickRecommendedArticleFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(recommendedArticlesFour)) {
			scrollDownUsingElement(recommendedArticlesFour);
			clickElementUsingJavaScript(recommendedArticlesFour);
			pageLoad();
			System.out.println("recommendedArticlesFour clicked successfully");
		} else {
			System.out.println("recommendedArticlesFour is not presented in the page");
			throw new Exception("recommendedArticlesFour is not presented in the page");
		}
	}
	

}
