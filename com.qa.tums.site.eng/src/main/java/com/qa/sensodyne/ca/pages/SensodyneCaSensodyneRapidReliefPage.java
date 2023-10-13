package com.qa.sensodyne.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneCaSensodyneRapidReliefPage extends BaseClass{
	
	public SensodyneCaSensodyneRapidReliefPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']//self::a[@href='/en-ca/'])[2]")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "(//li[@class='breadcrumb-list-item even last is-current ']//ancestor::a[text()='Sensitivity Rapid Relief']//self::a[@href='/en-ca/sensodyne-rapid-relief/'])[2]")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//button[@data-v-src='https://www.youtube-nocookie.com/embed/c5isCSl25BE?enablejsapi']//i[@class='icon icon-video-play']")
	private static WebElement youTube;
	
	@FindBy(xpath = "//div[@class='parametrizedhtml component section margin-top-3 video-int first odd last col-xs-12 reference-videos-custom-component']//iframe[@id='ytplayer']")
	private static WebElement iframe;

	@FindBy(xpath = "(//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg'])[1]")
	private static WebElement videoPlayIcon;

	@FindBy(xpath = "//div[@id='movie_player']")
	private static WebElement videoClick;

	@FindBy(xpath = "//div[contains(@class,'playing-mode')]")
	private static WebElement playingMode;

	@FindBy(xpath = "//div[contains(@class,'paused-mode')]")
	private static WebElement pausedMode;
	
	@FindBy(xpath = "(//div[@class='close'])[1]")
	private static WebElement youtubeClose;
	
	@FindBy(xpath = "(//div[@class='video-content']//self::div[@style='display: none;'])[1]")
	private static WebElement youtubeCloseVerify;
	
	
	@FindBy(xpath = "//a[@href='/en-ca/where-to-buy/']//ancestor::span[text()='Buy now']")
	private static WebElement buyNow;
	
	@FindBy(xpath = "//a[@href='/en-ca/about-sensitivity/teeth-sensitivity-quiz/']//ancestor::span[text()='Take the Sensodyne Sensitivity Quiz']")
	private static WebElement takeTheSensodyneSensitivityQuiz;
	
	
	@FindBy(xpath = "//button[@data-v-src='https://www.youtube-nocookie.com/embed/VjoRzNijs4I?enablejsapi']//i[@class='icon icon-video-play']")
	private static WebElement youTubeTwo;
	
	@FindBy(xpath = "//div[@class='parametrizedhtml component section margin-top-3 video-int first odd last col-xs-12 reference-videos-custom-component']//iframe[@id='ytplayer']")
	private static WebElement iframeTwo;

	@FindBy(xpath = "//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")
	private static WebElement videoPlayIconTwo;

	@FindBy(xpath = "//div[@id='movie_player']")
	private static WebElement videoClickTwo;

	@FindBy(xpath = "//div[contains(@class,'playing-mode')]")
	private static WebElement playingModeTwo;

	@FindBy(xpath = "//div[contains(@class,'paused-mode')]")
	private static WebElement pausedModeTwo;
	
	@FindBy(xpath = "(//div[@class='close'])[1]")
	private static WebElement youtubeCloseTwo;
	
	@FindBy(xpath = "(//div[@class='video-content']//self::div[@style='display: none;'])[1]")
	private static WebElement youtubeCloseVerifyTwo;
	
	
	@FindBy(xpath = "//a[@href='/en-ca/about-sensitivity/causes/']//ancestor::div[@class='col-xs-6 col-sm-3 col-md-3 default-style']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//a[@href='/en-ca/about-sensitivity/treatment-of-sensitivity/']//ancestor::div[@class='col-xs-6 col-sm-3 col-md-3 default-style']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//a[@href='/en-ca/about-sensodyne/']//ancestor::div[@class='col-xs-6 col-sm-3 col-md-3 default-style']")
	private static WebElement relatedArticleThree;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/']//ancestor::div[@class='col-xs-6 col-sm-3 col-md-3 default-style']")
	private static WebElement relatedArticleFour;
	
	
	
	
	
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
			System.out.println("Breadcrumb Two clicked successfully");
		} else {
			System.out.println("Breadcrumb Two is not presented in the page");
			throw new Exception("Breadcrumb Two is not presented in the page");
		}
	}

	public void clickYoutubeVideo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(youTube)) {
			scrollDownUsingElement(youTube);
			clickElementUsingJavaScript(youTube);
			switchToFrameUsingElement(iframe);
			moveToElement(videoClick);
			actionClick(videoClick);
			Thread.sleep(5000);
			visibilityOf(playingMode);
			Assert.assertTrue(elementIsDisplayed(playingMode));
			clickElementUsingJavaScript(videoClick);
			visibilityOf(pausedMode);
			Assert.assertTrue(elementIsDisplayed(pausedMode));
			frameSwitchingToParentFrame();
//			frameSwitchingToDefaultContent();
			visibilityOf(youtubeClose);
			moveToElement(youtubeClose);
			actionClick(youtubeClose);
//			visibilityOf(youTube);
//			clickElementUsingJavaScript(youTube);
			System.out.println("Youtuve video Successfully verified");
		} else {
			System.out.println("Youtube play icon is not presented in the page");
			throw new Exception("Youtube play icon is not presented in the page");
			}
		}
	
	
	public void clickBuyNow() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(buyNow)) {
			scrollDownUsingElement(buyNow);
			clickElementUsingJavaScript(buyNow);
			pageLoad();
			System.out.println("Buy Now clicked successfully");
		} else {
			System.out.println("Buy Now is not presented in the page");
			throw new Exception("Buy Now is not presented in the page");
		}
	}
	
	
	public void clickTakeTheSensodyneSensitivityQuiz() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(takeTheSensodyneSensitivityQuiz)) {
			scrollDownUsingElement(takeTheSensodyneSensitivityQuiz);
			clickElementUsingJavaScript(takeTheSensodyneSensitivityQuiz);
			pageLoad();
			System.out.println("Take The Sensodyne Sensitivity Quiz clicked successfully");
		} else {
			System.out.println("Take The Sensodyne Sensitivity Quiz is not presented in the page");
			throw new Exception("Take The Sensodyne Sensitivity Quiz is not presented in the page");
		}
	}
	
	public void clickYoutubeVideoTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(youTubeTwo)) {
			scrollDownUsingElement(youTubeTwo);
			clickElementUsingJavaScript(youTubeTwo);
			switchToFrameUsingElement(iframeTwo);
			moveToElement(videoPlayIconTwo);
			actionClick(videoPlayIconTwo);
			Thread.sleep(5000);
			visibilityOf(playingModeTwo);
			Assert.assertTrue(elementIsDisplayed(playingModeTwo));
			clickElementUsingJavaScript(videoClickTwo);
			visibilityOf(pausedModeTwo);
			Assert.assertTrue(elementIsDisplayed(pausedModeTwo));
			frameSwitchingToParentFrame();
//			frameSwitchingToDefaultContent();
			visibilityOf(youtubeCloseTwo);
			moveToElement(youtubeCloseTwo);
			actionClick(youtubeCloseTwo);
//			visibilityOf(youTube);
//			clickElementUsingJavaScript(youTube);
			System.out.println("Youtuve video Two Successfully verified");
		} else {
			System.out.println("Youtube play icon Two is not presented in the page");
			throw new Exception("Youtube play icon Two is not presented in the page");
			}
		}
	
	
	public void clickRelatedArticleOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleOne)) {
			scrollDownUsingElement(relatedArticleOne);
			elementClick(relatedArticleOne);
			pageLoad();
			System.out.println("Related Article One clicked successfully");
		} else {
			System.out.println("Related Article One is not presented in the page");
			throw new Exception("Related Article One is not presented in the page");
		}
	}
	
	public void clickRelatedArticleTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleTwo)) {
			scrollDownUsingElement(relatedArticleTwo);
			elementClick(relatedArticleTwo);
			pageLoad();
			System.out.println("Related Article Two clicked successfully");
		} else {
			System.out.println("Related Article Two is not presented in the page");
			throw new Exception("Related Article Two is not presented in the page");
		}
	}
	
	
	public void clickRelatedArticleThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleThree)) {
			scrollDownUsingElement(relatedArticleThree);
			elementClick(relatedArticleThree);
			pageLoad();
			System.out.println("Related Article Three clicked successfully");
		} else {
			System.out.println("Related Article Three is not presented in the page");
			throw new Exception("Related Article Three is not presented in the page");
		}
	}
	
	
	public void clickRelatedArticleFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleFour)) {
			scrollDownUsingElement(relatedArticleFour);
			moveToElement(relatedArticleFour);
			actionClick(relatedArticleFour);
			pageLoad();
			System.out.println("Related Article Four clicked successfully");
		} else {
			System.out.println("Related Article Four is not presented in the page");
			throw new Exception("Related Article Four is not presented in the page");
		}
	}
	
	
	

}
