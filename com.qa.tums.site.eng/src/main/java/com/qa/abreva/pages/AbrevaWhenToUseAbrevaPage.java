package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaWhenToUseAbrevaPage extends BaseClass{
	
	public AbrevaWhenToUseAbrevaPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//span[text()='When should I use Abreva']//ancestor::a[@class='accordion-title-link']")
    private static WebElement accordionOne;
    
    @FindBy(xpath = "//span[text()='When should I use Abreva']//ancestor::li[@class='accordion-slide first odd is-active']")
    private static WebElement accordionActiveOne;
    
    @FindBy(xpath = "//li[@class='accordion-slide first odd is-active']//ancestor::span[text()='When should I use Abreva']//following::img[1]")
    private static WebElement AccordionYoutubeOne;
    
    @FindBy(xpath = "//iframe[@class='videoFrame video-iframe']")
    private static WebElement iframe;
    
    @FindBy(xpath = "//div[contains(@class,'paused-mode unstarted-mode')]")
	private static WebElement videoPlayIcon;

	@FindBy(xpath = "//div[contains(@class,'playing-mode')]//self::div[@id='movie_player']")
	private static WebElement videoClick;

	@FindBy(xpath = "//div[contains(@class,'playing-mode')]")
	private static WebElement playingMode;

	@FindBy(xpath = "//div[contains(@class,'paused-mode')]")
	private static WebElement pausedMode;
    
    @FindBy(xpath = "//span[text()='When should I use Abreva']//ancestor::li[@class='accordion-slide first odd']")
    private static WebElement accordionCloseOne;
    
    
    
    
    @FindBy(xpath = "//span[text()='If I feel a tingle, but the cold sore hasn’t erupted yet, can I use Abreva']//ancestor::a[@class='accordion-title-link']")
    private static WebElement accordionTwo;
    
    @FindBy(xpath = "//span[text()='If I feel a tingle, but the cold sore hasn’t erupted yet, can I use Abreva']//ancestor::li[@class='accordion-slide even is-active']")
    private static WebElement accordionActiveTwo;
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']//ancestor::span[text()='If I feel a tingle, but the cold sore hasn’t erupted yet, can I use Abreva']//following::img[1]")
    private static WebElement AccordionYoutubeTwo;
    
    @FindBy(xpath = "//span[text()='If I feel a tingle, but the cold sore hasn’t erupted yet, can I use Abreva']//ancestor::li[@class='accordion-slide even']")
    private static WebElement accordionCloseTwo;
    
    
    
    @FindBy(xpath = "//span[text()='Will Abreva']//ancestor::a[@class='accordion-title-link']")
    private static WebElement accordionThree;
    
    @FindBy(xpath = "//span[text()='Will Abreva']//ancestor::li[@class='accordion-slide odd is-active']")
    private static WebElement accordionActiveThree;

    @FindBy(xpath = "//li[@class='accordion-slide odd is-active']//ancestor::span[text()='Will Abreva']//following::img[1]")
    private static WebElement AccordionYoutubeThree;
    
    @FindBy(xpath = "//span[text()='Will Abreva']//ancestor::li[@class='accordion-slide odd']")
    private static WebElement accordionCloseThree;
    
    @FindBy(xpath = "//span[text()='Can I peel the scabs on my cold sore?']//ancestor::a[@class='accordion-title-link']")
    private static WebElement accordionFour;
    
    @FindBy(xpath = "//span[text()='Can I peel the scabs on my cold sore?']//ancestor::li[@class='accordion-slide even is-active']")
    private static WebElement accordionActiveFour;
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']//ancestor::span[text()='Can I peel the scabs on my cold sore?']//following::img[1]")
    private static WebElement AccordionYoutubeFour;
    
    @FindBy(xpath = "//span[text()='Can I peel the scabs on my cold sore?']//ancestor::li[@class='accordion-slide even']")
    private static WebElement accordionCloseFour;
    
    @FindBy(xpath = "//span[text()='What if I miss a dose of Abreva']//ancestor::a[@class='accordion-title-link']")
    private static WebElement accordionFive;
    
    @FindBy(xpath = "//span[text()='What if I miss a dose of Abreva']//ancestor::li[@class='accordion-slide last odd is-active']")
    private static WebElement accordionActiveFive;
    
    @FindBy(xpath = "//li[@class='accordion-slide last odd is-active']//ancestor::span[text()='What if I miss a dose of Abreva']//following::img[1]")
    private static WebElement AccordionYoutubeFive;
    
    @FindBy(xpath = "//span[text()='What if I miss a dose of Abreva']//ancestor::li[@class='accordion-slide last odd']")
    private static WebElement accordionCloseFive;
    
    @FindBy(xpath = "//span[text()='GET COUPON']//ancestor::a[@href='/coupon/']")
    private static WebElement getcoupon;
    
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
    
    
    public void clickAccordionOne() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(accordionOne)) {
    		scrollDownUsingElement(accordionOne);
    		clickElementUsingJavaScript(accordionOne);
    		visibilityOf(accordionActiveOne);
    		Assert.assertTrue(elementIsDisplayed(accordionActiveOne));
    		if (isElementPresent(AccordionYoutubeOne)) {
    			clickElementUsingJavaScript(AccordionYoutubeOne);
    			visibilityOf(iframe);
    			switchToFrameUsingElement(iframe);
    			moveToElement(videoPlayIcon);
    			actionClick(videoPlayIcon);
    			Thread.sleep(5000);
    			visibilityOf(playingMode);
    			Assert.assertTrue(elementIsDisplayed(playingMode));
    			clickElementUsingJavaScript(videoClick);
    			visibilityOf(pausedMode);
    			Assert.assertTrue(elementIsDisplayed(pausedMode));
    			frameSwitchingToDefaultContent();
    			System.out.println("Youtuve video Successfully verified");
			} else {
				System.out.println("Accordion Youtube One is not presented in the page");
				throw new Exception("Accordion Youtube One is not presented in the page");
			}
    		clickElementUsingJavaScript(accordionOne);
    		visibilityOf(accordionCloseOne);
    		Assert.assertTrue(elementIsDisplayed(accordionCloseOne));
			System.out.println("Accordion One verified successfully");
		} else {
			System.out.println("Accordion One is not verified");
			throw new Exception("Accordion one is not verified");
		}
	}
    
    
    public void clickAccordionTwo() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(accordionTwo)) {
    		scrollDownUsingElement(accordionTwo);
    		clickElementUsingJavaScript(accordionTwo);
    		visibilityOf(accordionActiveTwo);
    		Assert.assertTrue(elementIsDisplayed(accordionActiveTwo));
    		if (isElementPresent(AccordionYoutubeTwo)) {
    			clickElementUsingJavaScript(AccordionYoutubeTwo);
    			visibilityOf(iframe);
    			switchToFrameUsingElement(iframe);
    			moveToElement(videoPlayIcon);
    			actionClick(videoPlayIcon);
    			Thread.sleep(5000);
    			visibilityOf(playingMode);
    			Assert.assertTrue(elementIsDisplayed(playingMode));
    			clickElementUsingJavaScript(videoClick);
    			visibilityOf(pausedMode);
    			Assert.assertTrue(elementIsDisplayed(pausedMode));
    			frameSwitchingToDefaultContent();
    			System.out.println("Youtuve video Successfully verified");
			} else {
				System.out.println("Accordion Youtube Two is not presented in the page");
				throw new Exception("Accordion Youtube Two is not presented in the page");
			}
    		clickElementUsingJavaScript(accordionTwo);
    		visibilityOf(accordionCloseTwo);
    		Assert.assertTrue(elementIsDisplayed(accordionCloseTwo));
			System.out.println("Accordion Two verified successfully");
		} else {
			System.out.println("Accordion Two is not verified");
			throw new Exception("Accordion Two is not verified");
		}
	}
    
    public void clickAccordionThree() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(accordionThree)) {
    		scrollDownUsingElement(accordionThree);
    		clickElementUsingJavaScript(accordionThree);
    		visibilityOf(accordionActiveThree);
    		Assert.assertTrue(elementIsDisplayed(accordionActiveThree));
    		if (isElementPresent(AccordionYoutubeThree)) {
    			clickElementUsingJavaScript(AccordionYoutubeThree);
    			visibilityOf(iframe);
    			switchToFrameUsingElement(iframe);
    			moveToElement(videoPlayIcon);
    			actionClick(videoPlayIcon);
    			Thread.sleep(5000);
    			visibilityOf(playingMode);
    			Assert.assertTrue(elementIsDisplayed(playingMode));
    			clickElementUsingJavaScript(videoClick);
    			visibilityOf(pausedMode);
    			Assert.assertTrue(elementIsDisplayed(pausedMode));
    			frameSwitchingToDefaultContent();
    			System.out.println("Youtuve video Successfully verified");
			} else {
				System.out.println("Accordion Youtube Three is not presented in the page");
				throw new Exception("Accordion Youtube Three is not presented in the page");
			}
    		clickElementUsingJavaScript(accordionThree);
    		visibilityOf(accordionCloseThree);
    		Assert.assertTrue(elementIsDisplayed(accordionCloseThree));
			System.out.println("Accordion Three verified successfully");
		} else {
			System.out.println("Accordion Three is not verified");
			throw new Exception("Accordion Three is not verified");
		}
	}
    
    public void clickAccordionFour() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(accordionFour)) {
    		scrollDownUsingElement(accordionFour);
    		clickElementUsingJavaScript(accordionFour);
    		visibilityOf(accordionActiveFour);
    		Assert.assertTrue(elementIsDisplayed(accordionActiveFour));
    		if (isElementPresent(AccordionYoutubeFour)) {
    			clickElementUsingJavaScript(AccordionYoutubeFour);
    			visibilityOf(iframe);
    			switchToFrameUsingElement(iframe);
    			moveToElement(videoPlayIcon);
    			actionClick(videoPlayIcon);
    			Thread.sleep(5000);
    			visibilityOf(playingMode);
    			Assert.assertTrue(elementIsDisplayed(playingMode));
    			clickElementUsingJavaScript(videoClick);
    			visibilityOf(pausedMode);
    			Assert.assertTrue(elementIsDisplayed(pausedMode));
    			frameSwitchingToDefaultContent();
    			System.out.println("Youtuve video Successfully verified");
			} else {
				System.out.println("Accordion Youtube Four is not presented in the page");
				throw new Exception("Accordion Youtube Four is not presented in the page");
			}
    		clickElementUsingJavaScript(accordionFour);
    		visibilityOf(accordionCloseFour);
    		Assert.assertTrue(elementIsDisplayed(accordionCloseFour));
			System.out.println("Accordion Four verified successfully");
		} else {
			System.out.println("Accordion Four is not verified");
			throw new Exception("Accordion Four is not verified");
		}
	}
    
    public void clickAccordionFive() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(accordionFive)) {
    		scrollDownUsingElement(accordionFive);
    		clickElementUsingJavaScript(accordionFive);
    		visibilityOf(accordionActiveFive);
    		Assert.assertTrue(elementIsDisplayed(accordionActiveFive));
    		if (isElementPresent(AccordionYoutubeFive)) {
    			clickElementUsingJavaScript(AccordionYoutubeFive);
    			visibilityOf(iframe);
    			switchToFrameUsingElement(iframe);
    			moveToElement(videoPlayIcon);
    			actionClick(videoPlayIcon);
    			Thread.sleep(5000);
    			visibilityOf(playingMode);
    			Assert.assertTrue(elementIsDisplayed(playingMode));
    			clickElementUsingJavaScript(videoClick);
    			visibilityOf(pausedMode);
    			Assert.assertTrue(elementIsDisplayed(pausedMode));
    			frameSwitchingToDefaultContent();
    			System.out.println("Youtuve video Successfully verified");
			} else {
				System.out.println("Accordion Youtube Five is not presented in the page");
				throw new Exception("Accordion Youtube Five is not presented in the page");
			}
    		clickElementUsingJavaScript(accordionFive);
    		visibilityOf(accordionCloseFive);
    		Assert.assertTrue(elementIsDisplayed(accordionCloseFive));
			System.out.println("Accordion Five verified successfully");
		} else {
			System.out.println("Accordion Five is not verified");
			throw new Exception("Accordion Five is not verified");
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
