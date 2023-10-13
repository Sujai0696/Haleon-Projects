package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaColdSoreConfessionsPage extends BaseClass{

	public AbrevaColdSoreConfessionsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//a[text()='Dealing with Cold Sores']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/']")
	private static WebElement breadcrumbOne;
	
	
	
	@FindBy(xpath = "//h2[contains(text(),'Hear firsthand from cold sore sufferers like you')]")
	private static WebElement scroll;

	@FindBy(xpath = "//iframe[@id='confessionsvideo']")
	private static WebElement iframe;

	@FindBy(xpath = "//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")
	private static WebElement videoPlayIcon;

	@FindBy(xpath = "//div[@id='movie_player']")
	private static WebElement videoClick;

	@FindBy(xpath = "//div[contains(@class,'playing-mode')]")
	private static WebElement playingMode;

	@FindBy(xpath = "//div[contains(@class,'paused-mode')]")
	private static WebElement pausedMode;
	
	
	
	@FindBy(xpath = "//a[text()='PLAN FOR IMPORTANT DAYS']//self::a[@href='/managing-lip-health/cold-sore-triggers/plan-for-important-days/']//ancestor::div[@class='image component section article-promo-img clickable-box first odd grid_4 alpha']")
    private static WebElement wholeCardSecOne;
    
    @FindBy(xpath = "//a[@href='/managing-lip-health/dealing-with-cold-sores/staying-confident/']//ancestor::div[@class='image component section article-promo-img clickable-box even grid_4']")
    private static WebElement wholeCardSecTwo;
    
    @FindBy(xpath = "//a[text()='LYSINE AND COLD SORES']//self::a[@href='/managing-lip-health/lip-care/lysine-and-cold-sores/']//ancestor::div[@class='image component section article-promo-img odd last grid_4 omega']")
    private static WebElement wholeCardSecThree;
    
    @FindBy(xpath = "//span[text()='GET COUPON']//ancestor::a[@href='/coupon/']")
    private static WebElement getcoupon;
    
    @FindBy(xpath = "//div[@class='parametrizedhtml component section default-style reference-abreva-price-spider-button fixedcomponent6 fixed-component image']//ancestor::span[text()='BUY NOW']")
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



	public void clickYoutubeVideo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(scroll)) {
			scrollDownUsingElement(scroll);
			switchToFrameUsingElement(iframe);
			moveToElement(videoPlayIcon);
			actionClick(videoPlayIcon);
			Thread.sleep(5000);
			visibilityOf(playingMode);
			Assert.assertTrue(elementIsDisplayed(playingMode));
			clickElementUsingJavaScript(videoClick);
			visibilityOf(pausedMode);
			Assert.assertTrue(elementIsDisplayed(pausedMode));
			System.out.println("Youtuve video Successfully verified");
		} else {
			System.out.println("Youtube play icon is not presented in the page");
			throw new Exception("Youtube play icon is not presented in the page");
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
	    
	    public void clickGetcoupon() throws Exception{
	    	waitForPageLoadJava();
	    	if (isElementPresent(getcoupon)) {
				scrollDownUsingElement(getcoupon);
				clickElementUsingJavaScript(getcoupon);
				pageLoad();
				System.out.println("HyperLink Get coupon clicked successfully");
			} else {
				System.out.println("HyperLink Get coupon is not presented in the page");
				throw new Exception("HyperLink Get coupon is not presented in the page");
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
