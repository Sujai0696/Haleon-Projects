package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class BioteneRecognizingDryMouthPage extends BaseClass{
	
	public BioteneRecognizingDryMouthPage() {
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
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='DRY MOUTH 101']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//a[@href='https://www.biotene.com/what-is-dry-mouth/dry-mouth-causes-medications/']//ancestor::span[text()='medications']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//a[@href='/dry-mouth-health-impacts/']//ancestor::span[text()='impact your oral health']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//div[@class='carousel component section dm101-products-carousel Desktop-symptoms-carousel odd initialized']//ancestor::li[@class='carousel-nav-item is-active']//ancestor::a[text()='1']")
	private static WebElement carouselOneActive;
	
	@FindBy(xpath = "//div[@class='carousel component section dm101-products-carousel Desktop-symptoms-carousel odd initialized']//a[@role='button'][normalize-space()='2']")
	private static WebElement carouselTwo;

	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//ancestor::a[text()='2']")
	private static WebElement carouselTwoActive;
	
	@FindBy(xpath = "//div[@class='carousel component section dm101-products-carousel Desktop-symptoms-carousel odd initialized']//a[@role='button'][normalize-space()='3']")
	private static WebElement carouselThree;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//ancestor::a[text()='3']")
	private static WebElement carouselThreeActive;
	
	@FindBy(xpath = "//div[@class='carousel component section dm101-products-carousel Desktop-symptoms-carousel odd initialized']//a[@role='button'][normalize-space()='4']")
	private static WebElement carouselFour;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//ancestor::a[text()='4']")
	private static WebElement carouselFourActive;
	
	@FindBy(xpath = "//div[@class='carousel component section dm101-products-carousel Desktop-symptoms-carousel odd initialized']//a[@role='button'][normalize-space()='5']")
	private static WebElement carouselFive;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//ancestor::a[text()='5']")
	private static WebElement carouselFiveActive;
	
	@FindBy(xpath = "//div[@class='carousel component section dm101-products-carousel Desktop-symptoms-carousel odd initialized']//a[@role='button'][normalize-space()='6']")
	private static WebElement carouselSix;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//ancestor::a[text()='6']")
	private static WebElement carouselSixActive;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//ancestor::a[text()='1']//preceding::a[@href='/dry-mouth-products/mouthwash/']//ancestor::span[normalize-space()='LEARN MORE']")
	private static WebElement learnMoreOne;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//ancestor::a[text()='2']//preceding::a[@href='/dry-mouth-products/gentle-oral-rinse/']//ancestor::span[normalize-space()='LEARN MORE']")
	private static WebElement learnMoreTwo;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//ancestor::a[text()='3']//preceding::a[@href='/dry-mouth-products/fresh-mint-toothpaste/']//ancestor::span[normalize-space()='LEARN MORE']")
	private static WebElement learnMoreThree;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//ancestor::a[text()='4']//preceding::a[@href='/dry-mouth-products/gentle-toothpaste/']//ancestor::span[normalize-space()='LEARN MORE']")
	private static WebElement learnMoreFour;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//ancestor::a[text()='5']//preceding::a[@href='/dry-mouth-products/moisturizing-mouth-spray/']//ancestor::span[normalize-space()='LEARN MORE']")
	private static WebElement learnMoreFive;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//ancestor::a[text()='6']//preceding::a[@href='/dry-mouth-products/moisturizing-gel/']//ancestor::span[normalize-space()='LEARN MORE']")
	private static WebElement learnMoreSix; 
	
	@FindBy(xpath = "//div[@class='carousel component section dm101-products-carousel Desktop-symptoms-carousel odd initialized']//a[@role='button'][normalize-space()='»']")
	private static WebElement next;
	
	@FindBy(xpath = "//div[@class='carousel component section dm101-products-carousel Desktop-symptoms-carousel odd initialized']//a[@role='button'][normalize-space()='«']")
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
	
	public void clickLearnMoreOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(carouselOneActive)) {
			moveToElement(carouselOneActive);
			doubleClickElement(carouselOneActive);
			scrollDownUsingElement(learnMoreOne);
			clickElementUsingJavaScript(learnMoreOne);
			Thread.sleep(2000);
			System.out.println("Learn More One clicked successfully");
		} else {
			System.out.println("Carousel one is not active");
			throw new Exception("Carousel one is not active");
		}
	}
	
	
	public void clickLearnMoreTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(carouselOneActive)) {
			moveToElement(carouselOneActive);
			doubleClickElement(carouselOneActive);
			visibilityOf(carouselTwo);
			moveToElement(carouselTwo);
			doubleClickElement(carouselTwo);
			if (isElementPresent(carouselTwoActive)) {
				scrollDownUsingElement(learnMoreTwo);
				clickElementUsingJavaScript(learnMoreTwo);
				Thread.sleep(2000);
				System.out.println("Learn More Two clicked successfully");
			} else {
				System.out.println("Carousel Two is not active");
				throw new Exception("Carousel Two is not active");
			}
		} else {
			System.out.println("Carousel One is not active");
			throw new Exception("Carousel one is not active");
		}
	}
	
	public void clickLearnMoreThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(carouselOneActive)) {
			moveToElement(carouselOneActive);
			doubleClickElement(carouselOneActive);
			visibilityOf(carouselThree);
			moveToElement(carouselThree);
			doubleClickElement(carouselThree);
			if (isElementPresent(carouselThreeActive)) {
				scrollDownUsingElement(learnMoreThree);
				clickElementUsingJavaScript(learnMoreThree);
				Thread.sleep(2000);
				System.out.println("Learn More Three clicked successfully");
			} else {
				System.out.println("Carousel Three is not active");
				throw new Exception("Carousel Three is not active");
			}
		} else {
			System.out.println("Carousel One is not active");
			throw new Exception("Carousel one is not active");
		}
	}
	
	public void clickLearnMoreFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(carouselOneActive)) {
			moveToElement(carouselOneActive);
			doubleClickElement(carouselOneActive);
			visibilityOf(carouselFour);
			moveToElement(carouselFour);
			doubleClickElement(carouselFour);
			if (isElementPresent(carouselFourActive)) {
				scrollDownUsingElement(learnMoreFour);
				clickElementUsingJavaScript(learnMoreFour);
				Thread.sleep(2000);
				System.out.println("Learn More Four clicked successfully");
			} else {
				System.out.println("Carousel Four is not active");
				throw new Exception("Carousel Four is not active");
			}
		} else {
			System.out.println("Carousel One is not active");
			throw new Exception("Carousel one is not active");
		}
	}
	
	public void clickLearnMoreFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(carouselOneActive)) {
			moveToElement(carouselOneActive);
			doubleClickElement(carouselOneActive);
			visibilityOf(carouselFive);
			moveToElement(carouselFive);
			doubleClickElement(carouselFive);
			if (isElementPresent(carouselFiveActive)) {
				scrollDownUsingElement(learnMoreFive);
				clickElementUsingJavaScript(learnMoreFive);
				Thread.sleep(2000);
				System.out.println("Learn More Five clicked successfully");
			} else {
				System.out.println("Carousel Five is not active");
				throw new Exception("Carousel Five is not active");
			}
		} else {
			System.out.println("Carousel One is not active");
			throw new Exception("Carousel one is not active");
		}
	}
	
	public void clickLearnMoreSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(carouselOneActive)) {
			moveToElement(carouselOneActive);
			doubleClickElement(carouselOneActive);
			visibilityOf(carouselSix);
			moveToElement(carouselSix);
			doubleClickElement(carouselSix);
			if (isElementPresent(carouselSixActive)) {
				scrollDownUsingElement(learnMoreSix);
				clickElementUsingJavaScript(learnMoreSix);
				Thread.sleep(2000);
				System.out.println("Learn More Six clicked successfully");
			} else {
				System.out.println("Carousel Six is not active");
				throw new Exception("Carousel Six is not active");
			}
		} else {
			System.out.println("Carousel One is not active");
			throw new Exception("Carousel one is not active");
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
			clickElementUsingJavaScript(next);
			visibilityOf(carouselSixActive);
			Assert.assertTrue(elementIsDisplayed(carouselSixActive));
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
