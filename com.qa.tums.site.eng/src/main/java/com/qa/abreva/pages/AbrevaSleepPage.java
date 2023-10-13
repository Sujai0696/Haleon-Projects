package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaSleepPage extends BaseClass{
	
	public AbrevaSleepPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//a[text()='Managing Your Triggers']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement breadcrumbOne;
    
    @FindBy(xpath = "//h3[text()='Move during the day.']//following::span[text()='Daily exercise']//ancestor::a[@href='/managing-lip-health/cold-sore-triggers/exercise/']")
    private static WebElement carouselMovingDuringTheDayHyperLinkOne;
    
    @FindBy(xpath = "//h3//span[text()='Create the right environment.']//ancestor::li[@class='carousel-slide clearfix odd is-active first ']")
    private static WebElement carouselActiveOne;
    
    @FindBy(xpath = "//h3[text()='Banish electronic screens from the bedroom.']//ancestor::li[@class='carousel-slide clearfix even is-active']")
    private static WebElement carouselActiveTwo;
    
    @FindBy(xpath = "//h3[text()='Stick to a bedtime routine.']//ancestor::li[@class='carousel-slide clearfix odd is-active']")
    private static WebElement carouselActiveThree;
    
    @FindBy(xpath = "//h3[text()='Eat sleep-promoting foods.']//ancestor::li[@class='carousel-slide clearfix even is-active']")
    private static WebElement carouselActiveFour;
    
    @FindBy(xpath = "//h3[text()='Plan your naps carefully.']//ancestor::li[@class='carousel-slide clearfix odd is-active']")
    private static WebElement carouselActiveFive;
    
    @FindBy(xpath = "//h3[text()='Move during the day.']//ancestor::li[@class='carousel-slide clearfix even last is-active']")
    private static WebElement carouselActiveSix;
    
    @FindBy(xpath = "//h3//span[text()='Create the right environment.']//ancestor::li[@class='carousel-slide clearfix odd first is-active']")
    private static WebElement carouselActiveAgainOne;
    
    @FindBy(xpath = "//li[@class='carousel-nav-next']//a[@role='button']")
    private static WebElement nextButton;
    
    @FindBy(xpath = "//li[@class='carousel-nav-prev']//a[@role='button']")
    private static WebElement previousButton;
    
    @FindBy(xpath = "//a[text()='TAKE IT EASY']//self::a[@href='/managing-lip-health/cold-sore-triggers/relaxation-techniques/']//ancestor::div[@class='image component section article-promo-img clickable-box first odd grid_4 alpha']")
    private static WebElement wholeCardSecOne;
    
    @FindBy(xpath = "//a[text()='HOW TO KEEP CONFIDENT WHEN A COLD SORE STRIKES']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/staying-confident/']//ancestor::div[@class='image component section article-promo-img clickable-box even grid_4']")
    private static WebElement wholeCardSecTwo;
    
    @FindBy(xpath = "//a[text()='FUEL YOUR LIPS']//self::a[@href='/managing-lip-health/lip-care/eating-for-lip-health/']//ancestor::div[@class='image component section article-promo-img clickable-box odd last grid_4 omega']")
    private static WebElement wholeCardSecThree;
    
    @FindBy(xpath = "//a[@aria-label='Oral Care Pump, buy now']")
    private static WebElement buyNow;
    
    @FindBy(xpath = "//h2[@class='ps-product-name']//self::h2[text()='Oral Care Pump']")
    private static WebElement buyNowText;
    
    @FindBy(xpath = "//span[@class='ps-lightbox-close']")
    private static WebElement buyNowClose;
    
    @FindBy(xpath = "//span[text()='BUY NOW']//ancestor::a[@tabindex='0']//self::a[@aria-hidden='false']")
    private static WebElement buyNowCloseVerify;
    
    
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
    
    public void clickHyperLinkCarouselMovingDuringOne() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(carouselActiveOne)) {
			scrollDownUsingElement(carouselActiveOne);
			clickElementUsingJavaScript(previousButton);
			visibilityOf(carouselActiveSix);
    		Assert.assertTrue(elementIsDisplayed(carouselActiveSix));
    		System.out.println("Carousel Six presented in the page");
			clickElementUsingJavaScript(carouselMovingDuringTheDayHyperLinkOne);
			pageLoad();
			System.out.println("Carousel Six Moving During The Day HyperLink One clicked successfully");
		} else {
			System.out.println("Carousel Six Moving During The Day HyperLink One is not presented in the page");
			throw new Exception("Carousel Six Moving During The Day HyperLink One is not presented in the page");
		}
	}
    
    
    public void clickCarouselNext() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(carouselActiveOne)) {
    		System.out.println("Carousel One presented in the page");
    		scrollDownUsingElement(carouselActiveOne);
    		clickElementUsingJavaScript(nextButton);
    		visibilityOf(carouselActiveTwo);
    		Assert.assertTrue(elementIsDisplayed(carouselActiveTwo));
    		System.out.println("Carousel Two presented in the page");
    		clickElementUsingJavaScript(nextButton);
    		visibilityOf(carouselActiveThree);
    		Assert.assertTrue(elementIsDisplayed(carouselActiveThree));
    		System.out.println("Carousel Three presented in the page");
    		clickElementUsingJavaScript(nextButton);
    		visibilityOf(carouselActiveFour);
    		Assert.assertTrue(elementIsDisplayed(carouselActiveFour));
    		System.out.println("Carousel Four presented in the page");
    		clickElementUsingJavaScript(nextButton);
    		visibilityOf(carouselActiveFive);
    		Assert.assertTrue(elementIsDisplayed(carouselActiveFive));
    		System.out.println("Carousel Five presented in the page");
    		clickElementUsingJavaScript(nextButton);
    		visibilityOf(carouselActiveSix);
    		Assert.assertTrue(elementIsDisplayed(carouselActiveSix));
    		System.out.println("Carousel Six presented in the page");
    		clickElementUsingJavaScript(nextButton);
    		visibilityOf(carouselActiveAgainOne);
    		Assert.assertTrue(elementIsDisplayed(carouselActiveAgainOne));
    		System.out.println("Carousel One again presented in the page");
		} else {
			System.out.println("Carousel one is not active in the page");
			throw new Exception("Carousel one is not active in the page");
		}
	}
    	
    
    public void clickCarouselPrevious() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(carouselActiveOne)) {
    		System.out.println("Carousel One presented in the page");
    		scrollDownUsingElement(carouselActiveOne);
    		clickElementUsingJavaScript(previousButton);
    		visibilityOf(carouselActiveSix);
    		Assert.assertTrue(elementIsDisplayed(carouselActiveSix));
    		System.out.println("Carousel Six presented in the page");
    		clickElementUsingJavaScript(previousButton);
    		visibilityOf(carouselActiveFive);
    		Assert.assertTrue(elementIsDisplayed(carouselActiveFive));
    		System.out.println("Carousel Five presented in the page");
    		clickElementUsingJavaScript(previousButton);
    		visibilityOf(carouselActiveFour);
    		Assert.assertTrue(elementIsDisplayed(carouselActiveFour));
    		System.out.println("Carousel Four presented in the page");
    		clickElementUsingJavaScript(previousButton);
    		visibilityOf(carouselActiveThree);
    		Assert.assertTrue(elementIsDisplayed(carouselActiveThree));
    		System.out.println("Carousel Three presented in the page");
    		clickElementUsingJavaScript(previousButton);
    		visibilityOf(carouselActiveTwo);
    		Assert.assertTrue(elementIsDisplayed(carouselActiveTwo));
    		System.out.println("Carousel Two presented in the page");
    		clickElementUsingJavaScript(previousButton);
    		visibilityOf(carouselActiveAgainOne);
    		Assert.assertTrue(elementIsDisplayed(carouselActiveAgainOne));
    		System.out.println("Carousel One again presented in the page");
		} else {
			System.out.println("Carousel one is not active in the page");
			throw new Exception("Carousel one is not active in the page");
		}
	}
    	
    public void clickWholeCardSecOne() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(wholeCardSecOne)) {
			scrollDownUsingElement(wholeCardSecOne);
			clickElementUsingJavaScript(wholeCardSecOne);
			pageLoad();
			System.out.println("HyperLink Whole Card Sec One clicked successfully");
		} else {
			System.out.println("HyperLink Whole Card Sec One is not presented in the page");
			throw new Exception("HyperLink Whole Card Sec One is not presented in the page");
		}
	}
    
    public void clickWholeCardSecTwo() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(wholeCardSecTwo)) {
			scrollDownUsingElement(wholeCardSecTwo);
			clickElementUsingJavaScript(wholeCardSecTwo);
			pageLoad();
			System.out.println("HyperLink Whole Card Sec Two clicked successfully");
		} else {
			System.out.println("HyperLink Whole Card Sec Two is not presented in the page");
			throw new Exception("HyperLink Whole Card Sec Two is not presented in the page");
		}
	}
    
    public void clickWholeCardSecThree() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(wholeCardSecThree)) {
			scrollDownUsingElement(wholeCardSecThree);
			clickElementUsingJavaScript(wholeCardSecThree);
			pageLoad();
			System.out.println("HyperLink Whole Card Sec Three clicked successfully");
		} else {
			System.out.println("HyperLink Whole Card Sec Three is not presented in the page");
			throw new Exception("HyperLink Whole Card Sec Three is not presented in the page");
		}
	}
    
    public void clickBuyNow() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(buyNow)) {
    		scrollDownUsingElement(buyNow);
    		clickElementUsingJavaScript(buyNow);
    		visibilityOf(buyNowText);
    		Assert.assertTrue(elementIsDisplayed(buyNowText));
    		clickElementUsingJavaScript(buyNowClose);
    		visibilityOf(buyNowCloseVerify);
    		Assert.assertTrue(elementIsDisplayed(buyNowCloseVerify));
    		System.out.println("Buy Now button successfully verified");
		} else {
			System.out.println("Buy Now Button is not Presented in the page");
			throw new Exception("Buy Now Button is not Presented in the page");
		}
	}

}
