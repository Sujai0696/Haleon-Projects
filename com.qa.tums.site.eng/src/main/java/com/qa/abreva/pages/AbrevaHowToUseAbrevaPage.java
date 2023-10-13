package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaHowToUseAbrevaPage extends BaseClass{
	
	public AbrevaHowToUseAbrevaPage() {
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//span[text()='How should I apply Abreva']//ancestor::a[@class='accordion-title-link']")
	private static WebElement accordionOne;
	
	@FindBy(xpath = "//span[text()='How should I apply Abreva']//ancestor::li[@class='accordion-slide first odd is-active']")
	private static WebElement accordionActiveOne;
	
	@FindBy(xpath = "//li[@class='accordion-slide first odd is-active']//ancestor::span[text()='How should I apply Abreva']//following::img[1]")
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
	
	@FindBy(xpath = "//span[text()='How should I apply Abreva']//ancestor::li[@class='accordion-slide first odd']")
	private static WebElement accordionCloseOne;
	
	@FindBy(xpath = "//span[text()='How often can I reapply Abreva']//ancestor::a[@class='accordion-title-link']")
	private static WebElement accordionTwo;
	
	@FindBy(xpath = "//span[text()='How often can I reapply Abreva']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveTwo;
	
	@FindBy(xpath = "//li[@class='accordion-slide even is-active']//ancestor::span[text()='How often can I reapply Abreva']//following::img[1]")
	private static WebElement AccordionYoutubeTwo;
	
	@FindBy(xpath = "//span[text()='How often can I reapply Abreva']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accordionCloseTwo;
	
	@FindBy(xpath = "//span[text()='Can Abreva']//ancestor::a[@class='accordion-title-link']")
	private static WebElement accordionThree;

	@FindBy(xpath = "//span[text()='Can Abreva']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveThree;
	
	@FindBy(xpath = "//li[@class='accordion-slide odd is-active']//ancestor::span[text()='Can Abreva']//following::img[1]")
	private static WebElement AccordionYoutubeThree;
	
	@FindBy(xpath = "//span[text()='Can Abreva']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement accordionCloseThree;
	
	@FindBy(xpath = "//span[text()='How thin or thick of a coating of Abreva']//ancestor::a[@class='accordion-title-link']")
	private static WebElement accordionFour;
	
	@FindBy(xpath = "//span[text()='How thin or thick of a coating of Abreva']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveFour;
	
	@FindBy(xpath = "//li[@class='accordion-slide even is-active']//ancestor::span[text()='How thin or thick of a coating of Abreva']//following::img[1]")
	private static WebElement AccordionYoutubeFour;
	
	@FindBy(xpath = "//span[text()='How thin or thick of a coating of Abreva']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accordionCloseFour;
	
	@FindBy(xpath = "//span[text()='Who can and cannot use Abreva']//ancestor::a[@class='accordion-title-link']")
	private static WebElement accordionFive;
	
	@FindBy(xpath = "//span[text()='Who can and cannot use Abreva']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveFive;
	
	@FindBy(xpath = "//li[@class='accordion-slide odd is-active']//ancestor::span[text()='Who can and cannot use Abreva']//following::img[1]")
	private static WebElement AccordionYoutubeFive;
	
	@FindBy(xpath = "//span[text()='Who can and cannot use Abreva']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement accordionCloseFive;
	
	@FindBy(xpath = "//span[text()='Can I use Abreva']//ancestor::a[@class='accordion-title-link']")
	private static WebElement accordionSix;
	
	@FindBy(xpath = "//span[text()='Can I use Abreva']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveSix;
	
	@FindBy(xpath = "//li[@class='accordion-slide even is-active']//ancestor::span[text()='Can I use Abreva']//following::img[1]")
	private static WebElement AccordionYoutubeSix;
	
	@FindBy(xpath = "//span[text()='Can I use Abreva']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accordionCloseSix;
	
	@FindBy(xpath = "//span[text()='Can I apply cosmetics on top of Abreva']//ancestor::a[@class='accordion-title-link']")
	private static WebElement accordionSeven;
	
	@FindBy(xpath = "//span[text()='Can I apply cosmetics on top of Abreva']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveSeven;
	
	@FindBy(xpath = "//li[@class='accordion-slide odd is-active']//ancestor::span[text()='Can I apply cosmetics on top of Abreva']//following::img[1]")
	private static WebElement AccordionYoutubeSeven;
	
	@FindBy(xpath = "//span[text()='Can I apply cosmetics on top of Abreva']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement accordionCloseSeven;
	
	@FindBy(xpath = "//span[text()='Your label warning says to get medical help if Abreva']//ancestor::a[@class='accordion-title-link']")
	private static WebElement accordionEight;
	
	@FindBy(xpath = "//span[text()='Your label warning says to get medical help if Abreva']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveEight;
	
	@FindBy(xpath = "//li[@class='accordion-slide even is-active']//ancestor::span[text()='Your label warning says to get medical help if Abreva']//following::img[1]")
	private static WebElement AccordionYoutubeEight;
	
	@FindBy(xpath = "//span[text()='Your label warning says to get medical help if Abreva']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accordionCloseEight;
	
	@FindBy(xpath = "//span[text()='Can I kiss someone while a cold sore is on my lips?']//ancestor::a[@class='accordion-title-link']")
	private static WebElement accordionNine;
	
	@FindBy(xpath = "//span[text()='Can I kiss someone while a cold sore is on my lips?']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveNine;
	
	@FindBy(xpath = "//li[@class='accordion-slide odd is-active']//ancestor::span[text()='Can I kiss someone while a cold sore is on my lips?']//following::img[1]")
	private static WebElement AccordionYoutubeNine;
	
	@FindBy(xpath = "//span[text()='Can I kiss someone while a cold sore is on my lips?']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement accordionCloseNine;
	
	@FindBy(xpath = "//span[text()='What can I expect to happen if I get some Abreva']//ancestor::a[@class='accordion-title-link']")
	private static WebElement accordionTen;
	
	@FindBy(xpath = "//span[text()='What can I expect to happen if I get some Abreva']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveTen;
	
	@FindBy(xpath = "//li[@class='accordion-slide even is-active']//ancestor::span[text()='What can I expect to happen if I get some Abreva']//following::img[1]")
	private static WebElement AccordionYoutubeTen;
	
	@FindBy(xpath = "//span[text()='What can I expect to happen if I get some Abreva']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accordionCloseTen;
	
	@FindBy(xpath = "//span[text()='Why can’t I apply Abreva']//ancestor::a[@class='accordion-title-link']")
	private static WebElement accordionEleven;
	
	@FindBy(xpath = "//span[text()='Why can’t I apply Abreva']//ancestor::li[@class='accordion-slide odd is-active']")
	private static WebElement accordionActiveEleven;
	
	@FindBy(xpath = "//li[@class='accordion-slide odd is-active']//ancestor::span[text()='Why can’t I apply Abreva']//following::img[1]")
	private static WebElement AccordionYoutubeEleven;
	
	@FindBy(xpath = "//span[text()='Why can’t I apply Abreva']//ancestor::li[@class='accordion-slide odd']")
	private static WebElement accordionCloseEleven;
	
	@FindBy(xpath = "//span[text()='What happens if I accidentally get some Abreva']//ancestor::a[@class='accordion-title-link']")
	private static WebElement accordionTweleve;
	
	@FindBy(xpath = "//span[text()='What happens if I accidentally get some Abreva']//ancestor::li[@class='accordion-slide even is-active']")
	private static WebElement accordionActiveTweleve;
	
	@FindBy(xpath = "//li[@class='accordion-slide even is-active']//ancestor::span[text()='What happens if I accidentally get some Abreva']//following::img[1]")
	private static WebElement AccordionYoutubeTweleve;
	
	@FindBy(xpath = "//span[text()='What happens if I accidentally get some Abreva']//ancestor::li[@class='accordion-slide even']")
	private static WebElement accordionCloseTweleve;
	
	@FindBy(xpath = "//span[text()='What are the common cold sore triggers?']//ancestor::a[@class='accordion-title-link']")
	private static WebElement accordionThirteen;
	
	@FindBy(xpath = "//span[text()='What are the common cold sore triggers?']//ancestor::li[@class='accordion-slide last odd is-active']")
	private static WebElement accordionActiveThirteen;
	
	@FindBy(xpath = "//li[@class='accordion-slide last odd is-active']//ancestor::span[text()='What are the common cold sore triggers?']//following::img[1]")
	private static WebElement AccordionYoutubeThirteen;
	
	@FindBy(xpath = "//span[text()='What are the common cold sore triggers?']//ancestor::li[@class='accordion-slide last odd']")
	private static WebElement accordionCloseThirteen;
	
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
				System.out.println("Youtuve video One Successfully verified");
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
				System.out.println("Youtuve video Two Successfully verified");
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
				System.out.println("Youtuve video Three Successfully verified");
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
				System.out.println("Youtuve video Four Successfully verified");
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
				System.out.println("Youtuve video Five Successfully verified");
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
	
	public void clickAccordionSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionSix)) {
			scrollDownUsingElement(accordionSix);
			clickElementUsingJavaScript(accordionSix);
			visibilityOf(accordionActiveSix);
			Assert.assertTrue(elementIsDisplayed(accordionActiveSix));
			if (isElementPresent(AccordionYoutubeSix)) {
				clickElementUsingJavaScript(AccordionYoutubeSix);
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
				System.out.println("Youtuve video Six Successfully verified");
			} else {
				System.out.println("Accordion Youtube Six is not presented in the page");
				throw new Exception("Accordion Youtube Six is not presented in the page");
			}
			clickElementUsingJavaScript(accordionSix);
			visibilityOf(accordionCloseSix);
			Assert.assertTrue(elementIsDisplayed(accordionCloseSix));
			System.out.println("Accordion Six verified successfully");
		} else {
			System.out.println("Accordion Six is not verified");
			throw new Exception("Accordion Six is not verified");
		}
	}
	
	public void clickAccordionSeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionSeven)) {
			scrollDownUsingElement(accordionSeven);
			clickElementUsingJavaScript(accordionSeven);
			visibilityOf(accordionActiveSeven);
			Assert.assertTrue(elementIsDisplayed(accordionActiveSeven));
			if (isElementPresent(AccordionYoutubeSeven)) {
				clickElementUsingJavaScript(AccordionYoutubeSeven);
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
				System.out.println("Youtuve video Seven Successfully verified");
			} else {
				System.out.println("Accordion Youtube Seven is not presented in the page");
				throw new Exception("Accordion Youtube Seven is not presented in the page");
			}
			clickElementUsingJavaScript(accordionSeven);
			visibilityOf(accordionCloseSeven);
			Assert.assertTrue(elementIsDisplayed(accordionCloseSeven));
			System.out.println("Accordion Seven verified successfully");
		} else {
			System.out.println("Accordion Seven is not verified");
			throw new Exception("Accordion Seven is not verified");
		}
	}
	
	public void clickAccordionEight() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionEight)) {
			scrollDownUsingElement(accordionEight);
			clickElementUsingJavaScript(accordionEight);
			visibilityOf(accordionActiveEight);
			Assert.assertTrue(elementIsDisplayed(accordionActiveEight));
			if (isElementPresent(AccordionYoutubeEight)) {
				clickElementUsingJavaScript(AccordionYoutubeEight);
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
				System.out.println("Youtuve video Eight Successfully verified");
			} else {
				System.out.println("Accordion Youtube Eight is not presented in the page");
				throw new Exception("Accordion Youtube Eight is not presented in the page");
			}
			clickElementUsingJavaScript(accordionEight);
			visibilityOf(accordionCloseEight);
			Assert.assertTrue(elementIsDisplayed(accordionCloseEight));
			System.out.println("Accordion Eight verified successfully");
		} else {
			System.out.println("Accordion Eight is not verified");
			throw new Exception("Accordion Eight is not verified");
		}
	}
	
	public void clickAccordionNine() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionNine)) {
			scrollDownUsingElement(accordionNine);
			clickElementUsingJavaScript(accordionNine);
			visibilityOf(accordionActiveNine);
			Assert.assertTrue(elementIsDisplayed(accordionActiveNine));
			if (isElementPresent(AccordionYoutubeNine)) {
				clickElementUsingJavaScript(AccordionYoutubeNine);
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
				System.out.println("Youtuve video Nine Successfully verified");
			} else {
				System.out.println("Accordion Youtube Nine is not presented in the page");
				throw new Exception("Accordion Youtube Nine is not presented in the page");
			}
			clickElementUsingJavaScript(accordionNine);
			visibilityOf(accordionCloseNine);
			Assert.assertTrue(elementIsDisplayed(accordionCloseNine));
			System.out.println("Accordion Nine verified successfully");
		} else {
			System.out.println("Accordion Nine is not verified");
			throw new Exception("Accordion Nine is not verified");
		}
	}
	
	public void clickAccordionTen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionTen)) {
			scrollDownUsingElement(accordionTen);
			clickElementUsingJavaScript(accordionTen);
			visibilityOf(accordionActiveTen);
			Assert.assertTrue(elementIsDisplayed(accordionActiveTen));
			if (isElementPresent(AccordionYoutubeTen)) {
				clickElementUsingJavaScript(AccordionYoutubeTen);
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
				System.out.println("Youtuve video Ten Successfully verified");
			} else {
				System.out.println("Accordion Youtube Ten is not presented in the page");
				throw new Exception("Accordion Youtube Ten is not presented in the page");
			}
			clickElementUsingJavaScript(accordionTen);
			visibilityOf(accordionCloseTen);
			Assert.assertTrue(elementIsDisplayed(accordionCloseTen));
			System.out.println("Accordion Ten verified successfully");
		} else {
			System.out.println("Accordion Ten is not verified");
			throw new Exception("Accordion Ten is not verified");
		}
	}
	
	
	
	public void clickAccordionEleven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionEleven)) {
			scrollDownUsingElement(accordionEleven);
			clickElementUsingJavaScript(accordionEleven);
			visibilityOf(accordionActiveEleven);
			Assert.assertTrue(elementIsDisplayed(accordionActiveEleven));
			if (isElementPresent(AccordionYoutubeEleven)) {
				clickElementUsingJavaScript(AccordionYoutubeEleven);
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
				System.out.println("Youtuve video Eleven Successfully verified");
			} else {
				System.out.println("Accordion Youtube Eleven is not presented in the page");
				throw new Exception("Accordion Youtube Eleven is not presented in the page");
			}
			clickElementUsingJavaScript(accordionEleven);
			visibilityOf(accordionCloseEleven);
			Assert.assertTrue(elementIsDisplayed(accordionCloseEleven));
			System.out.println("Accordion Eleven verified successfully");
		} else {
			System.out.println("Accordion Eleven is not verified");
			throw new Exception("Accordion Eleven is not verified");
		}
	}
	
	public void clickAccordionTweleve() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionTweleve)) {
			scrollDownUsingElement(accordionTweleve);
			clickElementUsingJavaScript(accordionTweleve);
			visibilityOf(accordionActiveTweleve);
			Assert.assertTrue(elementIsDisplayed(accordionActiveTweleve));
			if (isElementPresent(AccordionYoutubeTweleve)) {
				clickElementUsingJavaScript(AccordionYoutubeTweleve);
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
				System.out.println("Youtuve video Tweleve Successfully verified");
			} else {
				System.out.println("Accordion Youtube Tweleve is not presented in the page");
				throw new Exception("Accordion Youtube Tweleve is not presented in the page");
			}
			clickElementUsingJavaScript(accordionTweleve);
			visibilityOf(accordionCloseTweleve);
			Assert.assertTrue(elementIsDisplayed(accordionCloseTweleve));
			System.out.println("Accordion Tweleve verified successfully");
		} else {
			System.out.println("Accordion Tweleve is not verified");
			throw new Exception("Accordion Tweleve is not verified");
		}
	}
	
	public void clickAccordionThirteen() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(accordionThirteen)) {
			scrollDownUsingElement(accordionThirteen);
			clickElementUsingJavaScript(accordionThirteen);
			visibilityOf(accordionActiveThirteen);
			Assert.assertTrue(elementIsDisplayed(accordionActiveThirteen));
			if (isElementPresent(AccordionYoutubeThirteen)) {
				clickElementUsingJavaScript(AccordionYoutubeThirteen);
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
				System.out.println("Youtuve video Thirteen Successfully verified");
			} else {
				System.out.println("Accordion Youtube Thirteen is not presented in the page");
				throw new Exception("Accordion Youtube Thirteen is not presented in the page");
			}
			clickElementUsingJavaScript(accordionThirteen);
			visibilityOf(accordionCloseThirteen);
			Assert.assertTrue(elementIsDisplayed(accordionCloseThirteen));
			System.out.println("Accordion Thirteen verified successfully");
		} else {
			System.out.println("Accordion Thirteen is not verified");
			throw new Exception("Accordion Thirteen is not verified");
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
