package com.qa.sensodyne.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneCaSensitivityAndGumReliefToothpastePage extends BaseClass{
	
	public SensodyneCaSensitivityAndGumReliefToothpastePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/en-ca/where-to-buy/']//ancestor::span[text()='Buy Now']")
	private static WebElement buyNow;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']//self::a[@href='/en-ca/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//ancestor::a[text()='Sensitivity and gum relief toothpaste']//self::a[@href='/en-ca/sensitivity-and-gum-relief-toothpaste/']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//button[@data-v-src='https://www.youtube-nocookie.com/embed/nxdayNVK6H8?enablejsapi']//i[@class='icon icon-video-play']")
	private static WebElement youTube;
	
	@FindBy(xpath = "//div[@class='parametrizedhtml component section video-int odd last col-xs-12 reference-p55-video-en']//iframe[@id='ytplayer']")
	private static WebElement iframe;

	@FindBy(xpath = "//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")
	private static WebElement videoPlayIcon;

	@FindBy(xpath = "//div[@id='movie_player']")
	private static WebElement videoClick;

	@FindBy(xpath = "//div[contains(@class,'playing-mode')]")
	private static WebElement playingMode;

	@FindBy(xpath = "//div[contains(@class,'paused-mode')]")
	private static WebElement pausedMode;
	
	@FindBy(xpath = "(//div[@class='close'])[1]")
	private static WebElement youtubeClose;
	
	@FindBy(xpath = "//div[@style='display: none;']//preceding::button[@data-v-src='https://www.youtube-nocookie.com/embed/nxdayNVK6H8?enablejsapi']")
	private static WebElement youtubeCloseVerify;
	
	@FindBy(xpath = "//div[@class='box component section col-xs-12 odd default-style interactive-infographics-generated-container']//button[@class='button-next']")
	private static WebElement nextBtn;
	
	@FindBy(xpath = "//div[@class='box component section col-xs-12 odd default-style interactive-infographics-generated-container']//button[@class='button-prev']")
	private static WebElement previousButton;
	
	@FindBy(xpath = "//img[@alt='Teeth checkup']//ancestor::div[@class='interactiveInfographics-slide slick-slide slick-current slick-active']")
	private static WebElement slideActiveOne;
	
	@FindBy(xpath = "//img[@alt='Teeth brushing']//ancestor::div[@class='interactiveInfographics-slide slick-slide slick-current slick-active']")
	private static WebElement slideActiveTwo;
	
	@FindBy(xpath = "//img[@alt='Finger runnig along brush head bristles']//ancestor::div[@class='interactiveInfographics-slide slick-slide slick-current slick-active']")
	private static WebElement slideActiveThree;
	
	@FindBy(xpath = "//img[@alt='Interdental cleaning in-between teeth']//ancestor::div[@class='interactiveInfographics-slide slick-slide slick-current slick-active']")
	private static WebElement slideActiveFour;
	
	@FindBy(xpath = "//span[text()='Learn About Sensitivity & Gum Problems']//ancestor::a[@href='/en-ca/products/sensitivity-and-gum/']")
	private static WebElement learnAboutSensitivityAndGumProblems;
	
	@FindBy(xpath = "//h2//a[text()='Causes of Sensitive Teeth']//self::a[@href='/en-ca/about-sensitivity/causes/']")
	private static WebElement relatedArticleTextOne;
	
	@FindBy(xpath = "//h2//a[text()='Treating Sensitive Teeth']//self::a[@href='/en-ca/about-sensitivity/treatment-of-sensitivity/']")
	private static WebElement relatedArticleTextTwo;
	
	@FindBy(xpath = "//h2//a[text()='How Sensodyne Can Help']//self::a[@href='/en-ca/about-sensodyne/']")
	private static WebElement relatedArticleTextThree;

	@FindBy(xpath = "//h2//a[text()='Sensodyne Products']//self::a[@href='/en-ca/products/']")
	private static WebElement relatedArticleTextFour;
	
	@FindBy(xpath = "//div[@class='image component section related-box zglazyload col-xs-12 RelatedArticle1 fixed-component']//a[@href='/en-ca/about-sensitivity/causes/']//img[@alt='Triggered nerves in teeth']")
	private static WebElement relatedArticleImgOne;
	
	@FindBy(xpath = "//div[@class='image component section related-box zglazyload col-xs-12 RelatedArticle2 fixed-component']//a[@href='/en-ca/about-sensitivity/treatment-of-sensitivity/']//img[@alt='Treating tooth sensitivity with Sensodyne toothpastes']")
	private static WebElement relatedArticleImgTwo;
	
	@FindBy(xpath = "//div[@class='image component section related-box zglazyload col-xs-12 RelatedArticle3 fixed-component']//a[@href='/en-ca/about-sensodyne/']//img[@alt='How Sensodyne Toothpaste can help with sensitive teeth symptoms']")
	private static WebElement relatedArticleImgThree;
	
	@FindBy(xpath = "//div[@class='image component section related-box zglazyload col-xs-12 RelatedArticle4 fixed-component']//a[@href='/en-ca/products/']//img[@alt='Variety of Sensodyne Toothpaste products for tooth sensitivity']")
	private static WebElement relatedArticleImgFour;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
			moveToElement(videoPlayIcon);
			actionClick(videoPlayIcon);
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
			visibilityOf(youtubeCloseVerify);
			Assert.assertTrue(elementIsDisplayed(youtubeCloseVerify));
			System.out.println("Youtuve video Successfully verified");
		} else {
			System.out.println("Youtube play icon is not presented in the page");
			throw new Exception("Youtube play icon is not presented in the page");
			}
		}
	
	
	public void clickSlideSection() throws Exception{
		waitForPageLoadJava();
		
		if (isElementPresent(slideActiveOne)) {
			scrollDownUsingElement(slideActiveOne);
			clickElementUsingJavaScript(nextBtn);
			pageLoad();
			visibilityOf(slideActiveTwo);
			Assert.assertTrue(elementIsDisplayed(slideActiveTwo));
			pageLoad();
			clickElementUsingJavaScript(nextBtn);
			visibilityOf(slideActiveThree);
			Assert.assertTrue(elementIsDisplayed(slideActiveThree));
			pageLoad();
			clickElementUsingJavaScript(nextBtn);
			visibilityOf(slideActiveFour);
			Assert.assertTrue(elementIsDisplayed(slideActiveFour));
			pageLoad();
			clickElementUsingJavaScript(previousButton);
			visibilityOf(slideActiveThree);
			Assert.assertTrue(elementIsDisplayed(slideActiveThree));
			pageLoad();
			clickElementUsingJavaScript(previousButton);
			visibilityOf(slideActiveTwo);
			Assert.assertTrue(elementIsDisplayed(slideActiveTwo));
			pageLoad();
			clickElementUsingJavaScript(previousButton);
			visibilityOf(slideActiveOne);
			Assert.assertTrue(elementIsDisplayed(slideActiveOne));
		} else {
			System.out.println("Slide one is not active in the page");
			throw new Exception("Slide one is not active in the page");
		}
	}
	
	public void clickLearnAboutSensitivityAndGumProblems() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(learnAboutSensitivityAndGumProblems)) {
			scrollDownUsingElement(learnAboutSensitivityAndGumProblems);
			moveToElement(learnAboutSensitivityAndGumProblems);
			actionClick(learnAboutSensitivityAndGumProblems);
			pageLoad();
			System.out.println("Learn About Sensitivity And Gum Problems clicked successfully");
		} else {
			System.out.println("Learn About Sensitivity And Gum Problems is not presented in the page");
			throw new Exception("Learn About Sensitivity And Gum Problems is not presented in the page");
		}
	}
	
	public void clickRelatedArticleTextOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleTextOne)) {
			scrollDownUsingElement(relatedArticleTextOne);
			clickElementUsingJavaScript(relatedArticleTextOne);
			pageLoad();
			System.out.println("Related Article Text One clicked successfully");
		} else {
			System.out.println("Related Article Text One is not presented in the page");
			throw new Exception("Related Article Text One is not presented in the page");
		}
	}
	
	public void clickRelatedArticleTextTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleTextTwo)) {
			scrollDownUsingElement(relatedArticleTextTwo);
			clickElementUsingJavaScript(relatedArticleTextTwo);
			pageLoad();
			System.out.println("Related Article Text Two clicked successfully");
		} else {
			System.out.println("Related Article Text Two is not presented in the page");
			throw new Exception("Related Article Text Two is not presented in the page");
		}
	}
	
	public void clickRelatedArticleTextThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleTextThree)) {
			scrollDownUsingElement(relatedArticleTextThree);
			clickElementUsingJavaScript(relatedArticleTextThree);
			pageLoad();
			System.out.println("Related Article Text Three clicked successfully");
		} else {
			System.out.println("Related Article Text Three is not presented in the page");
			throw new Exception("Related Article Text Three is not presented in the page");
		}
	}
	
	public void clickRelatedArticleTextFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleTextFour)) {
			scrollDownUsingElement(relatedArticleTextFour);
			clickElementUsingJavaScript(relatedArticleTextFour);
			pageLoad();
			System.out.println("Related Article Text Four clicked successfully");
		} else {
			System.out.println("Related Article Text Four is not presented in the page");
			throw new Exception("Related Article Text Four is not presented in the page");
		}
	}
	
	public void clickRelatedArticleImgOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleImgOne)) {
			scrollDownUsingElement(relatedArticleImgOne);
			clickElementUsingJavaScript(relatedArticleImgOne);
			pageLoad();
			System.out.println("Related Article Img One clicked successfully");
		} else {
			System.out.println("Related Article Img One is not presented in the page");
			throw new Exception("Related Article Img One is not presented in the page");
		}
	}
	
	public void clickRelatedArticleImgTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleImgTwo)) {
			scrollDownUsingElement(relatedArticleImgTwo);
			clickElementUsingJavaScript(relatedArticleImgTwo);
			pageLoad();
			System.out.println("Related Article Img Two clicked successfully");
		} else {
			System.out.println("Related Article Img Two is not presented in the page");
			throw new Exception("Related Article Img Two is not presented in the page");
		}
	}
	
	public void clickRelatedArticleImgThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleImgThree)) {
			scrollDownUsingElement(relatedArticleImgThree);
			clickElementUsingJavaScript(relatedArticleImgThree);
			pageLoad();
			System.out.println("Related Article Img Three clicked successfully");
		} else {
			System.out.println("Related Article Img Three is not presented in the page");
			throw new Exception("Related Article Img Three is not presented in the page");
		}
	}
	
	public void clickRelatedArticleImgFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleImgFour)) {
			scrollDownUsingElement(relatedArticleImgFour);
			clickElementUsingJavaScript(relatedArticleImgFour);
			pageLoad();
			System.out.println("Related Article Img Four clicked successfully");
		} else {
			System.out.println("Related Article Img Four is not presented in the page");
			throw new Exception("Related Article Img Four is not presented in the page");
		}
	}
	

}
