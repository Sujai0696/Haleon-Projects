package com.qa.theraflu.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TherafluChestCongestionPage extends BaseClass{
	
	public TherafluChestCongestionPage() {
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
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd ']//ancestor::a[text()='About Symptoms' and @href='/treating-cold-flu/symptoms/']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//self::li[text()=' What Is Chest Congestion? ']")
	private static WebElement breadcrumbFour;
	
	
	@FindBy(xpath = "//a[@href='/treating-cold-flu/symptoms/' and text()='cold or flu virus']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//a[@href='/treating-cold-flu/covid-vs-flu-vs-cold/' and text()='common symptoms of COVID-19']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//a[@href='/treating-cold-flu/symptoms/body-aches/' and text()='body aches']")
	private static WebElement hyperLinkThree;
	
	@FindBy(xpath = "//a[@href='/treating-cold-flu/symptoms/cough/' and text()='Most coughs']")
	private static WebElement hyperLinkFour;
	
	@FindBy(xpath = "//a[@href='/treating-cold-flu/why-you-need-to-see-a-doctor/' and text()='speak to your doctor']")
	private static WebElement hyperLinkFive;
	
	@FindBy(xpath = "//a[@href='/treating-cold-flu/symptoms/cough/' and text()='frequent coughing']")
	private static WebElement hyperLinkSix;
	
	@FindBy(xpath = "//a[@href='/treating-cold-flu/at-home-cold-remedies/' and text()='home remedies']")
	private static WebElement hyperLinkSeven;
	
	@FindBy(xpath = "//a[@href='/treating-cold-flu/symptoms/sore-throat-home-remedies/' and text()='soothe a sore throat']")
	private static WebElement hyperLinkEight;
	
	@FindBy(xpath = "//a[@href='/treating-cold-flu/why-drink-fluids-when-sick/' and text()='keep up your fluid intake']")
	private static WebElement hyperLinkNine;
	
	@FindBy(xpath = "//a[@href='/products/daytime-cough-relief/' and text()='Theraflu Cough Relief Hot Liquid']")
	private static WebElement hyperLinkTen;
	
	@FindBy(xpath = "//a[@href='/products/daytime-severe-cold-relief-honey-lemon-flavor-hot-liquid-powder/' and text()='Theraflu Multi-Symptom Severe Cold Hot Liquid Powder']")
	private static WebElement hyperLinkEleven;
	
	@FindBy(xpath = "//a[@href='/treating-cold-flu/cold-flu-prevention/' and text()='cold and flu prevention']")
	private static WebElement hyperLinkTweleve;
	
	@FindBy(xpath = "//li[@class='accordion-slide first last odd']//ancestor::header[@class='accordion-head']")
	private static WebElement references;
	
	@FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']//ancestor::header[@class='accordion-head']")
	private static WebElement referencesActive;
	
	@FindBy(xpath = "//h4[text()='What is Social Distancing']//ancestor::div[@class='image component section anchor-box zglazyload line-height-h3-1-2 related-articles first odd last']")
	private static WebElement recommendedArticlesOne;
	
	@FindBy(xpath = "//h4[text()='The Differences Between a Cold, the Flu, and Allergies']//ancestor::div[@class='image component section anchor-box zglazyload line-height-h3-1-2 related-articles first odd last']")
	private static WebElement recommendedArticlesTwo;
	
	@FindBy(xpath = "//h4[text()='How to Manage an Annoying Cough']//ancestor::div[@class='image component section anchor-box zglazyload line-height-h3-1-2 related-articles first odd last']")
	private static WebElement recommendedArticlesThree;
	
	@FindBy(xpath = "//h4[text()='What Is Sinus Congestion?']//ancestor::div[@class='image component section anchor-box zglazyload line-height-h3-1-2 related-articles first odd last']")
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
			clickElementUsingJavaScript(breadcrumbThree);
			pageLoad();
			System.out.println("breadcrumbThree clicked successfully");
		} else {
			System.out.println("breadcrumbThree is not presented in the page");
			throw new Exception("breadcrumbThree is not presented in the page");
		}
	}

	public void clickBreadcrumbFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbFour)) {
			scrollDownUsingElement(breadcrumbFour);
//			clickElementUsingJavaScript(breadcrumbTwo);
			String href = breadcrumbFour.getAttribute("href");
	        boolean hasValidUrl = href != null && !href.isEmpty();
	        Assert.assertFalse(hasValidUrl);
			pageLoad();
			System.out.println("Breadcrumb Four verified successfully");
		} else {
			System.out.println("Breadcrumb Four is not presented in the page");
			throw new Exception("Breadcrumb Four is not presented in the page");
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
