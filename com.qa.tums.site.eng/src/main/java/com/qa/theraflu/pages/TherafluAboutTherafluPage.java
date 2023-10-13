package com.qa.theraflu.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TherafluAboutTherafluPage extends BaseClass{
	
	public TherafluAboutTherafluPage() {
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

	
	
	@FindBy(xpath = "//h4[text()='How Long Does it Take for Theraflu to Kick In?']//following::a[@href='/about-theraflu/how-long-does-it-take-for-theraflu-to-kick-in/' and text()='Read more']")
	private static WebElement readMoreOne;
	
	@FindBy(xpath ="//h4[text()='Common Cold and Flu Medicine Ingredients']//following::a[@href='/about-theraflu/cold-flu-ingredients/' and text()='Read more']")
	private static WebElement readMoreTwo;
	
	@FindBy(xpath = "//h4[text()='Treating Cold & Flu Resources']//following::a[@href='/treating-cold-flu/' and text()='Read more']")
	private static WebElement readMoreThree;
	
	
	
	@FindBy(xpath = "//a[@href='/products/chest-congestion/' and text()='chest congestion']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//a[@href='/products/body-aches/' and text()='body aches']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//a[@href='/products/sore-throat-pain/' and text()='sore throat']")
	private static WebElement hyperLinkThree;
	
	@FindBy(xpath = "//a[@href='/products/cough/' and text()='cough']")
	private static WebElement hyperLinkFour;
	
	@FindBy(xpath = "//a[@href='/products/sinus-and-nasal-congestion/' and text()='sinus and nasal congestion']")
	private static WebElement hyperLinkFive;
	
	@FindBy(xpath = "//a[@href='/products/' and text()='Explore Theraflu Products']")
	private static WebElement btnExploreTherafluProducts;
	
	
	
	@FindBy(xpath = "//h4[text()='Cold and Flu Symptoms Explained']//ancestor::div[@class='image component section anchor-box zglazyload line-height-h3-1-2 related-articles first odd last']")
	private static WebElement recommendedArticlesOne;
	
	@FindBy(xpath = "//h4[text()='What Is Sinus Congestion?']//ancestor::div[@class='image component section anchor-box zglazyload line-height-h3-1-2 related-articles first odd last']")
	private static WebElement recommendedArticlesTwo;
	
	@FindBy(xpath = "//h4[text()='Prevention Methods']//ancestor::div[@class='image component section anchor-box zglazyload line-height-h3-1-2 related-articles first odd last']")
	private static WebElement recommendedArticlesThree;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	
	public void clickReadMoreOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(readMoreOne)) {
			scrollDownUsingElement(readMoreOne);
			clickElementUsingJavaScript(readMoreOne);
			pageLoad();
			System.out.println("readMoreOne clicked successfully");
		} else {
			System.out.println("readMoreOne is not presented in the page");
			throw new Exception("readMoreOne is not presented in the page");
		}
	}
	
	public void clickReadMoreTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(readMoreTwo)) {
			scrollDownUsingElement(readMoreTwo);
			clickElementUsingJavaScript(readMoreTwo);
			pageLoad();
			System.out.println("readMoreTwo clicked successfully");
		} else {
			System.out.println("readMoreTwo is not presented in the page");
			throw new Exception("readMoreTwo is not presented in the page");
		}
	}
	
	public void clickReadMoreThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(readMoreThree)) {
			scrollDownUsingElement(readMoreThree);
			clickElementUsingJavaScript(readMoreThree);
			pageLoad();
			System.out.println("readMoreThree clicked successfully");
		} else {
			System.out.println("readMoreThree is not presented in the page");
			throw new Exception("readMoreThree is not presented in the page");
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
	
	public void clickBtnExploreTherafluProducts() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(btnExploreTherafluProducts)) {
			scrollDownUsingElement(btnExploreTherafluProducts);
			clickElementUsingJavaScript(btnExploreTherafluProducts);
			pageLoad();
			System.out.println("btnExploreTherafluProducts clicked successfully");
		} else {
			System.out.println("btnExploreTherafluProducts is not presented in the page");
			throw new Exception("btnExploreTherafluProducts is not presented in the page");
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
	
	
}
