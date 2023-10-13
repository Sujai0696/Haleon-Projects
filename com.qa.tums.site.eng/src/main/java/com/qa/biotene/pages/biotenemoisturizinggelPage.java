package com.qa.biotene.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class biotenemoisturizinggelPage extends BaseClass{
	
	public biotenemoisturizinggelPage() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']//self::button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//child::div[@class='component-content']")
	private static WebElement emailpopup_Close;

	@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//ancestor::div[@class='component-content']//self::div[@style]")
	private static WebElement email_text;
	
	@FindBy(xpath = "//a[text()='Home']")
	private static WebElement Home_Breadcrumbs;		
		
	@FindBy(xpath = "//a[text()='BIOTÈNE® PRODUCTS']")
	private static WebElement Bioteneproducts_Breadcrumbs;		
	
	@FindBy(xpath = "//a[text()='BIOTÈNE® ORALBALANCE MOISTURIZING GEL']")
	private static WebElement Biotenemoisturizinggel_Breadcrumbs;	
	
	@FindBy(xpath = "//a[@class='ps-widget ps-5d9249ab55d91500259ff935 ps-enabled']//child::span[text()='BUY NOW']")
	private static WebElement BuyNow_button;	
	
	@FindBy(xpath = "//h2[text()='Biotene Oralbalance Gel']")
	private static WebElement BuyNow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement BuyNow_Close;
	
	//carousel arrow//
	
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

		 @FindBy(xpath = "//div[@class='box component section home-carousel-product-box first odd grid_4 alpha']//child::a[@href='/dry-mouth-products/gentle-toothpaste/']")
		 private static WebElement learnMoreFour;

		 @FindBy(xpath = "//div[@class='box component section home-carousel-product-box even grid_4']//ancestor::span[text()='LEARN MORE']//ancestor::a[@href='/dry-mouth-products/moisturizing-mouth-spray/']")
		 private static WebElement learnMoreFive;

		 @FindBy(xpath = "//div[@class='box component section home-carousel-product-box odd last grid_4 omega']//ancestor::span[text()='LEARN MORE']//ancestor::a[@href='/dry-mouth-products/moisturizing-gel/']")
		 private static WebElement learnMoreSix;

			@FindBy(xpath = "//div[@class='box component section home-carousel-product-box first odd last grid_4 alpha']//child::a[@href='/dry-mouth-products/mouthwash/']")
		 private static WebElement learnMoreSeven;

		 @FindBy(xpath = "//div[@class='carousel component section home-carousel-products odd grid_12 alpha omega initialized']//a[@role='button'][normalize-space()='»']")
		 private static WebElement next;

		@FindBy(xpath = "//div[@class='carousel component section home-carousel-products odd grid_12 alpha omega initialized']//a[@role='button'][normalize-space()='«']")
		 private static WebElement previous;
		
		
		
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod first odd grid_4 alpha']//child::a[text()='GET COUPON']")
	private static WebElement getcoupon;
	
	@FindBy(xpath = "//h1[text()='Save Now on Biotène Products']")
	private static WebElement getcoupontxt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod even grid_4']//child::a[text()='TAKE THE QUIZ']")
	private static WebElement takequiz;
	
	@FindBy(xpath = "//h1[text()='Take the Dry Mouth Self-Assessment Test']")
	private static WebElement takequiztxt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod odd last grid_4 omega']//child::a[text()='SHOP NOW']")
	private static WebElement shopnow;
	
	@FindBy(xpath = "//div[@class='richText component section banner_text_buynow wdm-banner-img first odd last grid_12 alpha omega']//h1")
	private static WebElement shopnowtxt;
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Methods//
	
		public void clickonCookieBtn() throws Exception {
			waitForPageLoadJava();
			if(isElementPresent(cookieBtn)) {
				elementToBeClickable(cookieBtn);
				try {
					if(cookieBtn.isDisplayed()) {
						clickElementUsingJavaScript(cookieBtn);
					}
					implicitWait();
					visibilityOf(cookieClose);
					Assert.assertTrue(elementIsDisplayed(cookieClose));
				}
				catch (Exception e) {
					
				}
			}else {
				System.out.println("Dismiss is not presented");
				throw new Exception("Unable to click on cookie Pop-up");
			}
			}
		public void clickonEmailBtn() throws Exception {	
		waitForPageLoadJava();
		if(isElementPresent(email_text)) {
			elementToBeClickable(email_text);
			try {
				if(email_text.isDisplayed()) {
					clickElementUsingJavaScript(email_text);
				}
				implicitWait();
				visibilityOf(emailpopup_Close);
				Assert.assertTrue(elementIsDisplayed(emailpopup_Close));
			}
			catch (Exception e) {
				
			}
		}else {
			System.out.println("Email Pop-Up is not presented");
			throw new Exception("Unable to click on Email Pop-up");
		}
		}
		
		public void clickonHomeBreadcrumbs() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(Home_Breadcrumbs);
			pageLoad();
		}
		public void clickonBioteneproductsBreadcrumbs() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(Bioteneproducts_Breadcrumbs);
			pageLoad();
		}
		public void clickonBiotenemoisturizinggelBreadcrumbs() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(Biotenemoisturizinggel_Breadcrumbs);
			pageLoad();
		}
		public void clickonBioteneBuyNow() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(BuyNow_button);
			visibilityOf(BuyNow_txt);
			boolean elementIsDisplayed=elementIsDisplayed(BuyNow_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(BuyNow_txt));
			clickElementUsingJavaScript(BuyNow_Close);
			pageLoad();
		}
		
		//carousel//
		
		public void clickLearnMoreOne() throws Exception {
			waitForPageLoadJava();
			if (isElementPresent(carouselOneActive)) {
				moveToElement(carouselOneActive);
				doubleClickElement(carouselOneActive);
				scrollDownUsingElement(learnMoreOne);
				clickElementUsingJavaScript(learnMoreOne);
				Thread.sleep(1000);
				System.out.println("Learn More One clicked successfully");
				
				
			} else {
				System.out.println("Carousel one is not active");
				throw new Exception("Carousel one is not active");

			}
		} 
		public void clickLearnMoreTwo() throws Exception {
			waitForPageLoadJava();
			if (isElementPresent(carouselOneActive)) {
				moveToElement(carouselOneActive);
				doubleClickElement(carouselOneActive);
				scrollDownUsingElement(learnMoreTwo);
				clickElementUsingJavaScript(learnMoreTwo);
				Thread.sleep(1000);
				System.out.println("Learn More One clicked successfully");
				
				
			} else {
				System.out.println("Carousel one is not active");
				throw new Exception("Carousel one is not active");

			}
		} 
		public void clickLearnMoreThree() throws Exception {
			waitForPageLoadJava();
			if (isElementPresent(carouselOneActive)) {
				moveToElement(carouselOneActive);
				doubleClickElement(carouselOneActive);
				scrollDownUsingElement(learnMoreThree);
				clickElementUsingJavaScript(learnMoreThree);
				Thread.sleep(1000);
				System.out.println("Learn More One clicked successfully");
				
				
			} else {
				System.out.println("Carousel one is not active");
				throw new Exception("Carousel one is not active");

			}
		} 
		public void clickLearnMoreFour() throws Exception {
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
					Thread.sleep(1000);
					System.out.println("Learn More Four clicked successfully");
					
				} else {
					System.out.println("Carousel Two is not active");
				throw new Exception("Carousel Two is not active");
				}
			
			} else {
				System.out.println("Carousel one is not active");
				throw new Exception("Carousel one is not active");

			}
		} 
		public void clickLearnMoreFive() throws Exception {
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
					Thread.sleep(1000);
					System.out.println("Learn More Five clicked successfully");
					
				} else {
					System.out.println("Carousel Two is not active");
				throw new Exception("Carousel Two is not active");
				}
			
			} else {
				System.out.println("Carousel one is not active");
				throw new Exception("Carousel one is not active");

			}
		} 

		public void clickLearnMoreSix() throws Exception {
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
					Thread.sleep(1000);
					System.out.println("Learn More Six clicked successfully");
					
				} else {
					System.out.println("Carousel Two is not active");
				throw new Exception("Carousel Two is not active");
				}
			
			} else {
				System.out.println("Carousel one is not active");
				throw new Exception("Carousel one is not active");

			}
		} 
		public void clickLearnMoreSeven() throws Exception {
			waitForPageLoadJava();
			if (isElementPresent(carouselOneActive)) {
				moveToElement(carouselOneActive);
				doubleClickElement(carouselOneActive);
				visibilityOf(carouselThree);
				moveToElement(carouselThree);
				doubleClickElement(carouselTwo);
				if (isElementPresent(carouselThreeActive)) {
					scrollDownUsingElement(learnMoreSeven);
					clickElementUsingJavaScript(learnMoreSeven);
					Thread.sleep(1000);
					System.out.println("Learn More Seven clicked successfully");
					
				} else {
					System.out.println("Carousel Two is not active");
				throw new Exception("Carousel Two is not active");
				}
			
			} else {
				System.out.println("Carousel one is not active");
				throw new Exception("Carousel one is not active");

			}
		} 
		public void clickPreviousAndNextArrow() throws Exception {
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
		public void clickonGetCoupon() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(getcoupon);
			clickElementUsingJavaScript(getcoupon);
			visibilityOf(getcoupontxt);
			boolean elementIsDisplayed=elementIsDisplayed(getcoupontxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(getcoupontxt));
			pageLoad();
		}
		public void clickontakequiz() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(takequiz);
			clickElementUsingJavaScript(takequiz);
			visibilityOf(takequiztxt);
			boolean elementIsDisplayed=elementIsDisplayed(takequiztxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(takequiztxt));
			pageLoad();
		}
		public void clickonShopnow() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(shopnow);
			clickElementUsingJavaScript(shopnow);
			visibilityOf(shopnowtxt);
			boolean elementIsDisplayed=elementIsDisplayed(shopnowtxt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(shopnowtxt));
			pageLoad();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
