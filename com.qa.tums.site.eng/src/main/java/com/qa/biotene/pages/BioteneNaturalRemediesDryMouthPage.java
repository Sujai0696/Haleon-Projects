package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class BioteneNaturalRemediesDryMouthPage extends BaseClass{
	
	public BioteneNaturalRemediesDryMouthPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='onetrust-accept-btn-handler']//self::button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//ancestor::div[@class='component-content']//self::div[@style]")
	private static WebElement emailBtn;

	@FindBy(xpath = "//div[@class='box component section cf-popup-form first odd last alpha']")
	private static WebElement emailClose;

	@FindBy(xpath = "//*[@href='/dry-mouth-products/mouthwash/']//self::a[text()='mouthwash']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='IMPACT ON ORAL HEALTH']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='Natural Remedies for Dry Mouth']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//*[@href='/dry-mouth-products/mouthwash/']//self::a[text()='mouthwash']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//*[@href='/dry-mouth-products/moisturizing-mouth-spray/']//self::a[text()='dry mouth moisturizing spray']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//*[@href='/dry-mouth-products/']//self::a[text()='Biotène products']")
	private static WebElement hyperLinkThree;
	
	@FindBy(xpath = "//a[text()='READ MORE']")
	private static WebElement readMore;
	
	@FindBy(xpath = "//a[text()='TAKE THE QUIZ']")
	private static WebElement takeTheQuiz;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod odd last grid_4 omega']//ancestor::a[text()='SHOP NOW']")
	private static WebElement shopNow;
	
	
	
	
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

	public void clickEmailBtn() throws Exception {
		waitForPageLoadJava();
		if (isElementPresent(emailBtn)) {
			elementToBeClickable(emailBtn);
			try {
				if (emailBtn.isDisplayed()) {
					clickElementUsingJavaScript(emailBtn);
				}
				implicitWait();
				Assert.assertFalse(elementIsDisplayed(emailClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Email Pop-Up is not presented");
			throw new Exception("Unable to click on Email Pop-up");
		}
	}
	
	public void clickBreadcrumbOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbOne)) {
			clickElementUsingJavaScript(breadcrumbOne);
			Thread.sleep(1000);
			System.out.println("Breadcrumb one clicked successfully");
		} else {
			System.out.println("Breadcrumb one is not presented in the page");
			throw new Exception("Breadcrumb one is not presented in the page");
		}
	}
	
	public void clickBreadcrumbTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbTwo)) {
			clickElementUsingJavaScript(breadcrumbTwo);
			Thread.sleep(1000);
			System.out.println("Breadcrumb Two clicked successfully");
		} else {
			System.out.println("Breadcrumb Two is not presented in the page");
			throw new Exception("Breadcrumb Two is not presented in the page");
		}
	}
	
	public void clickBreadcrumbThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbThree)) {
			clickElementUsingJavaScript(breadcrumbThree);
			Thread.sleep(1000);
			System.out.println("Breadcrumb Three clicked successfully");
		} else {
			System.out.println("Breadcrumb Three is not presented in the page");
			throw new Exception("Breadcrumb Three is not presented in the page");
		}
	}
	
	public void clickHyperLinkOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkOne)) {
			clickElementUsingJavaScript(hyperLinkOne);
			Thread.sleep(1000);
			System.out.println("Hyper Link One clicked successfully");
		} else {
			System.out.println("Hyper Link One is not presented in the page");
			throw new Exception("Hyper Link One is not presented in the page");
		}
	}
	
	public void clickHyperLinkTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkTwo)) {
			clickElementUsingJavaScript(hyperLinkTwo);
			Thread.sleep(1000);
			System.out.println("Hyper Link Two clicked successfully");
		} else {
			System.out.println("Hyper Link Two is not presented in the page");
			throw new Exception("Hyper Link Two is not presented in the page");
		}
	}
	
	public void clickHyperLinkThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkThree)) {
			clickElementUsingJavaScript(hyperLinkThree);
			Thread.sleep(1000);
			System.out.println("Hyper Link Three clicked successfully");
		} else {
			System.out.println("Hyper Link Three is not presented in the page");
			throw new Exception("Hyper Link Three is not presented in the page");
		}
	}
	
	
	public void clickReadMore() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(readMore)) {
			scrollDownUsingElement(readMore);
			clickElementUsingJavaScript(readMore);
			pageLoad();
			System.out.println("Read More clicked successfully");
		} else {
			System.out.println("Read More is not presented in the page");
			throw new Exception("Read More is not presented in the page");
		}
	}
	
	public void clickTakeTheQuiz() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(takeTheQuiz)) {
			scrollDownUsingElement(takeTheQuiz);
			clickElementUsingJavaScript(takeTheQuiz);
			pageLoad();
			System.out.println("Take the Quiz clicked successfully");
		} else {
			System.out.println("Take the Quiz is not presented in the page");
			throw new Exception("Take the Quiz is not presented in the page");
		}
	}
	
	public void clickShopNow() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(shopNow)) {
			scrollDownUsingElement(shopNow);
			clickElementUsingJavaScript(shopNow);
			pageLoad();
			System.out.println("Shop Now clicked successfully");
		} else {
			System.out.println("Shop Now is not presented in the page");
			throw new Exception("Shop Now  is not presented in the page");
		}
	}
}
