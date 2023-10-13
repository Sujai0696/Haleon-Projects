package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class BioteneDryMouthSymptomsPage extends BaseClass{
	
	public BioteneDryMouthSymptomsPage() {
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

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='Home']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='WHAT IS DRY MOUTH?']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='DRY MOUTH SYMPTOMS & REMEDIES']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//span[text()='impact your ']//ancestor::a[@href='/dry-mouth-health-impacts/']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//div[@class='carousel component section Desktop-symptoms-carousel even initialized']//ancestor::li[@class='carousel-nav-item is-active']//ancestor::a[normalize-space()='1']")
	private static WebElement carouselOneActive;
	
	@FindBy(xpath = "//div[@class='carousel component section Desktop-symptoms-carousel even initialized']//a[@role='button'][normalize-space()='2']")
	private static WebElement carouselTwo;

	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//ancestor::a[text()='2']")
	private static WebElement carouselTwoActive;
	
	@FindBy(xpath = "//div[@class='carousel component section Desktop-symptoms-carousel even initialized']//a[@role='button'][normalize-space()='3']")
	private static WebElement carouselThree;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//ancestor::a[text()='3']")
	private static WebElement carouselThreeActive;
	
	@FindBy(xpath = "//div[@class='carousel component section Desktop-symptoms-carousel even initialized']//a[@role='button'][normalize-space()='4']")
	private static WebElement carouselFour;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//ancestor::a[text()='4']")
	private static WebElement carouselFourActive;
	
	@FindBy(xpath = "//div[@class='carousel component section Desktop-symptoms-carousel even initialized']//a[@role='button'][normalize-space()='5']")
	private static WebElement carouselFive;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//ancestor::a[text()='5']")
	private static WebElement carouselFiveActive;
	
	@FindBy(xpath = "//div[@class='carousel component section Desktop-symptoms-carousel even initialized']//a[@role='button'][normalize-space()='»']	")
	private static WebElement next;
	
	@FindBy(xpath = "//div[@class='carousel component section Desktop-symptoms-carousel even initialized']//a[@role='button'][normalize-space()='«']")
	private static WebElement previous;
	
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
	
	public void clickPreviousAndNextArrow() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(carouselOneActive)) {
			moveToElement(carouselOneActive);
			doubleClickElement(carouselOneActive);
			scrollDownUsingElement(next);
			clickElementUsingJavaScript(next);
			visibilityOf(carouselTwoActive);
			Assert.assertTrue(elementIsDisplayed(carouselTwoActive));
			clickElementUsingJavaScript(next);
			visibilityOf(carouselThreeActive);
			Assert.assertTrue(elementIsDisplayed(carouselThreeActive));
			clickElementUsingJavaScript(next);
			visibilityOf(carouselFourActive);
			Assert.assertTrue(elementIsDisplayed(carouselFourActive));
			clickElementUsingJavaScript(next);
			visibilityOf(carouselFiveActive);
			Assert.assertTrue(elementIsDisplayed(carouselFiveActive));
			clickElementUsingJavaScript(previous);
			visibilityOf(carouselFiveActive);
			Assert.assertTrue(elementIsDisplayed(carouselFiveActive));
			clickElementUsingJavaScript(previous);
			visibilityOf(carouselFourActive);
			Assert.assertTrue(elementIsDisplayed(carouselFourActive));
			clickElementUsingJavaScript(previous);
			visibilityOf(carouselThreeActive);
			Assert.assertTrue(elementIsDisplayed(carouselThreeActive));
			clickElementUsingJavaScript(previous);
			visibilityOf(carouselTwoActive);
			Assert.assertTrue(elementIsDisplayed(carouselTwoActive));
			clickElementUsingJavaScript(previous);
			visibilityOf(carouselOneActive);
			Assert.assertTrue(elementIsDisplayed(carouselOneActive));
			System.out.println("Previous and Next button verified successfully");
		} else {
			System.out.println("Carousel one is not active");
			throw new Exception("Carousel one is not active");
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
			throw new Exception("Read more is not presented in the page");
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
			throw new Exception("Shop Now Quiz is not presented in the page");
		}
	}

}
