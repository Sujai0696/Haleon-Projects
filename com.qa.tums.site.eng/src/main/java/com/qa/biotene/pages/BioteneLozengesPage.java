package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class BioteneLozengesPage extends BaseClass{
	
	public BioteneLozengesPage() {
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
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='BIOTÈNE® PRODUCTS']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='BIOTÈNE® DRY MOUTH LOZENGES']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "")
	private static WebElement buyNow;
	
	@FindBy(xpath = "")
	private static WebElement buyNowText;
	
	@FindBy(xpath = "")
	private static WebElement buyNowClose;
	
	@FindBy(xpath = "//*[@tabindex='0']//self::a[@aria-hidden='false']")
	private static WebElement buyNowVerify;
	
	@FindBy(xpath = "//div[@class='carousel component section home-carousel-products odd grid_12 alpha omega initialized']//following::li[@class='carousel-nav-item is-active']//ancestor::a[text()='1']")
	private static WebElement carouselOneActive;
	
	@FindBy(xpath = "//div[@class='carousel component section home-carousel-products odd grid_12 alpha omega initialized']//a[@role='button'][normalize-space()='2']")
	private static WebElement carouselTwo;

	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//ancestor::a[text()='2']")
	private static WebElement carouselTwoActive;
	
	@FindBy(xpath = "//div[@class='carousel component section home-carousel-products odd grid_12 alpha omega initialized']//a[@role='button'][normalize-space()='3']")
	private static WebElement carouselThree;
	
	@FindBy(xpath = "//li[@class='carousel-nav-item is-active']//ancestor::a[text()='3']")
	private static WebElement carouselThreeActive;
	
	@FindBy(xpath = "//div[@class='box component section home-carousel-product-box first odd grid_4 alpha']//ancestor::span[text()='LEARN MORE']//ancestor::a[@href='/dry-mouth-products/mouthwash/']")
	private static WebElement learnMoreOne;
	
	@FindBy(xpath = "//div[@class='box component section home-carousel-product-box even grid_4']//ancestor::span[text()='LEARN MORE']//ancestor::a[@href='/dry-mouth-products/gentle-oral-rinse/']")
	private static WebElement learnMoreTwo;
	
	@FindBy(xpath = "//div[@class='box component section home-carousel-product-box odd last grid_4 omega']//ancestor::span[text()='LEARN MORE']//ancestor::a[@href='/dry-mouth-products/fresh-mint-toothpaste/']")
	private static WebElement learnMoreThree;
	
	@FindBy(xpath = "//div[@class='box component section home-carousel-product-box first odd grid_4 alpha']//ancestor::span[text()='LEARN MORE']//ancestor::a[@href='/dry-mouth-products/gentle-toothpaste/']	")
	private static WebElement learnMoreFour;
	
	@FindBy(xpath = "//div[@class='box component section home-carousel-product-box even grid_4']//ancestor::span[text()='LEARN MORE']//ancestor::a[@href='/dry-mouth-products/moisturizing-mouth-spray/']")
	private static WebElement learnMoreFive;
	
	@FindBy(xpath = "//div[@class='box component section home-carousel-product-box odd last grid_4 omega']//ancestor::span[text()='LEARN MORE']//ancestor::a[@href='/dry-mouth-products/moisturizing-gel/']")
	private static WebElement learnMoreSix; 
	
	@FindBy(xpath = "//div[@class='box component section home-carousel-product-box first odd last grid_4 alpha']//ancestor::span[text()='LEARN MORE']//ancestor::a[@href='/dry-mouth-products/lozenges/']")
	private static WebElement learnMoreSeven;
	
	@FindBy(xpath = "//div[@class='carousel component section home-carousel-products odd grid_12 alpha omega initialized']//a[@role='button'][normalize-space()='»']")
	private static WebElement next;
	
	@FindBy(xpath = "//div[@class='carousel component section home-carousel-products odd grid_12 alpha omega initialized']//a[@role='button'][normalize-space()='«']")
	private static WebElement previous;
	
	@FindBy(xpath = "//a[text()='GET COUPON']")
	private static WebElement getCoupon;
	
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
	
	public void clickBannerBuyNow() throws Exception{
		waitForPageLoadJava();
		scrollDownUsingElement(buyNow);
		clickElementUsingJavaScript(buyNow);
		if (isElementPresent(buyNowText)) {
			visibilityOf(buyNowClose);
			clickElementUsingJavaScript(buyNowClose);
			visibilityOf(buyNowVerify);
			Assert.assertTrue(elementIsDisplayed(buyNowVerify));
			System.out.println("Banner Buy Now is verified successfully");
		} else {
			System.out.println("Banner Buy Now button is not clicked or Buy Now text is not displayed in the page");
			throw new Exception("Banner Buy Now button is not clicked or Buy Now text is not displayed in the page");
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
			scrollDownUsingElement(learnMoreTwo);
			clickElementUsingJavaScript(learnMoreTwo);
			Thread.sleep(2000);
			System.out.println("Learn More One clicked successfully");
		} else {
			System.out.println("Carousel one is not active");
			throw new Exception("Carousel one is not active");
		}
	}
	
	public void clickLearnMoreThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(carouselOneActive)) {
			moveToElement(carouselOneActive);
			doubleClickElement(carouselOneActive);
			scrollDownUsingElement(learnMoreThree);
			clickElementUsingJavaScript(learnMoreThree);
			Thread.sleep(2000);
			System.out.println("Learn More Three clicked successfully");
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
			visibilityOf(carouselTwo);
			moveToElement(carouselTwo);
			doubleClickElement(carouselTwo);
			if (isElementPresent(carouselTwoActive)) {
				scrollDownUsingElement(learnMoreFour);
				clickElementUsingJavaScript(learnMoreFour);
				Thread.sleep(2000);
				System.out.println("Learn More Four clicked successfully");
			} else {
				System.out.println("Carousel Two is not active");
				throw new Exception("Carousel Two is not active");
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
			visibilityOf(carouselTwo);
			moveToElement(carouselTwo);
			doubleClickElement(carouselTwo);
			if (isElementPresent(carouselTwoActive)) {
				scrollDownUsingElement(learnMoreFive);
				clickElementUsingJavaScript(learnMoreFive);
				Thread.sleep(2000);
				System.out.println("Learn More Five clicked successfully");
			} else {
				System.out.println("Carousel Two is not active");
				throw new Exception("Carousel Two is not active");
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
			visibilityOf(carouselTwo);
			moveToElement(carouselTwo);
			doubleClickElement(carouselTwo);
			if (isElementPresent(carouselTwoActive)) {
				scrollDownUsingElement(learnMoreSix);
				clickElementUsingJavaScript(learnMoreSix);
				Thread.sleep(2000);
				System.out.println("Learn More Six clicked successfully");
			} else {
				System.out.println("Carousel Two is not active");
				throw new Exception("Carousel Two is not active");
			}
		} else {
			System.out.println("Carousel One is not active");
			throw new Exception("Carousel one is not active");
		}
	}
	
	public void clickLearnMoreSeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(carouselOneActive)) {
			moveToElement(carouselOneActive);
			doubleClickElement(carouselOneActive);
			visibilityOf(carouselThree);
			moveToElement(carouselThree);
			doubleClickElement(carouselThree);
			if (isElementPresent(carouselThreeActive)) {
				scrollDownUsingElement(learnMoreSeven);
				clickElementUsingJavaScript(learnMoreSeven);
				Thread.sleep(2000);
				System.out.println("Learn More Seven clicked successfully");
			} else {
				System.out.println("Carousel Three is not active");
				throw new Exception("Carousel Three is not active");
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
			scrollDownUsingElement(next);
			clickElementUsingJavaScript(next);
			visibilityOf(carouselTwoActive);
			Assert.assertTrue(elementIsDisplayed(carouselTwoActive));
			clickElementUsingJavaScript(next);
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
	
	public void clickGetCoupon() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(getCoupon)) {
			scrollDownUsingElement(getCoupon);
			clickElementUsingJavaScript(getCoupon);
			pageLoad();
			System.out.println("Get Coupon clicked successfully");
		} else {
			System.out.println("Get Coupon is not presented in the page");
			throw new Exception("Get Coupon is not presented in the page");
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
