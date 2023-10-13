package com.qa.quit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class QuitSmokingAndAnxietyPage extends BaseClass{

	public QuitSmokingAndAnxietyPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id=\"onetrust-accept-btn-handler\"]")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first last ']//ancestor::a[text()='Quit Advice' and @href='/quit-smoking-tips.html']")
	private static WebElement breadcrumbOne;

	@FindBy(xpath = "//a[@href='/quit-smoking-tips/smoking-and-anxiety/dealing-with-stress.html']//ancestor::div[@class='image component section default-style first odd']")
	private static WebElement wholeCardImgOne;

	@FindBy(xpath = "//a[text()='Five calming techniques for when stress strikes' and @href='/quit-smoking-tips/smoking-and-anxiety/dealing-with-stress.html']")
	private static WebElement wholeCardTextOne;

	@FindBy(xpath = "//a[text()='Read more' and @href='/quit-smoking-tips/smoking-and-anxiety/dealing-with-stress.html']")
	private static WebElement wholeCardReadMoreOne;



	@FindBy(xpath = "//a[@href='/content/cf-consumer-healthcare/wellness-quit/en_us/content/overlay/ive-tried-to-quit-several-times.html']//ancestor::div[@class='image component section default-style first odd']//img")
	private static WebElement youTubeOne;

	@FindBy(xpath = "//div[@class='parametrizedhtml component section default-style first odd last reference-ive-tried-to-quit-several-times']//iframe[@id='widget2']")
	private static WebElement iframeOne;

	@FindBy(xpath = "//video[@class='video-stream html5-main-video']")
	private static WebElement videoPlayIcon;

	@FindBy(xpath = "//div[@id='movie_player']")
	private static WebElement videoClick;
	
	@FindBy(xpath = "//button[@class='ytp-play-button ytp-button']")
	private static WebElement unstartedMode;

	@FindBy(xpath = "//div[contains(@class,'playing-mode')]")
	private static WebElement playingMode;

	@FindBy(xpath = "//div[contains(@class,'paused-mode')]")
	private static WebElement pausedMode;

	@FindBy(xpath = "//div[@class='overlay-close']")
	private static WebElement youtubeClose;

	@FindBy(xpath = "//div[@style='display: none;' and @class='overlay-background']")
	private static WebElement youtubeCloseVerify;



	@FindBy(xpath = "//a[text()='I’ve tried to quit smoking several times. Why can’t I quit?' and @href='/content/cf-consumer-healthcare/wellness-quit/en_us/content/overlay/ive-tried-to-quit-several-times.html']")
	private static WebElement wholeCardTextTwo;


	@FindBy(xpath = "//a[@href='/content/cf-consumer-healthcare/wellness-quit/en_us/content/overlay/how-do-i-cope-with-cravings.html']//ancestor::div[@class='image component section default-style first odd']")
	private static WebElement youTubeTwo;

	@FindBy(xpath = "//div[@class='parametrizedhtml component section default-style first odd last reference-how-do-i-cope-with-cravings']//iframe[@id='widget16']")
	private static WebElement iframeTwo;


	@FindBy(xpath = "//a[text()='How do I cope with cravings?' and @href='/content/cf-consumer-healthcare/wellness-quit/en_us/content/overlay/how-do-i-cope-with-cravings.html']")
	private static WebElement wholeCardTextThree;

	@FindBy(xpath = "//a[@href='/quit-smoking-tips/smoking-and-anxiety/laugh-off-stress.html']//ancestor::div[@class='image component section default-style first odd']")
	private static WebElement wholeCardImgFour;

	@FindBy(xpath = "//a[text()='How to laugh off stress' and @href='/quit-smoking-tips/smoking-and-anxiety/laugh-off-stress.html']")
	private static WebElement wholeCardTextFour;

	@FindBy(xpath = "//a[text()='Read more' and @href='/quit-smoking-tips/smoking-and-anxiety/laugh-off-stress.html']")
	private static WebElement wholeCardReadMoreFour;

	@FindBy(xpath = "//a[@href='/relapse.html']//ancestor::div[@class='image component section default-style first odd']")
	private static WebElement wholeCardImgFive;

	@FindBy(xpath = "//a[text()='Smoking relapse?' and @href='/relapse.html']")
	private static WebElement wholeCardTextFive;

	@FindBy(xpath = "//a[text()='Read more' and @href='/relapse.html']")
	private static WebElement wholeCardReadMoreFive;



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

	public void clickWholeCardImgOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(wholeCardImgOne)) {
			scrollDownUsingElement(wholeCardImgOne);
			clickElementUsingJavaScript(wholeCardImgOne);
			pageLoad();
			System.out.println("wholeCardImgOne One clicked successfully");
		} else {
			System.out.println("wholeCardImgOne One is not presented in the page");
			throw new Exception("wholeCardImgOne One is not presented in the page");
		}
	}

	public void clickWholeCardTextOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(wholeCardTextOne)) {
			scrollDownUsingElement(wholeCardTextOne);
			clickElementUsingJavaScript(wholeCardTextOne);
			pageLoad();
			System.out.println("wholeCardTextOne One clicked successfully");
		} else {
			System.out.println("wholeCardTextOne One is not presented in the page");
			throw new Exception("wholeCardTextOne One is not presented in the page");
		}
	}

	public void clickWholeCardReadMoreOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(wholeCardReadMoreOne)) {
			scrollDownUsingElement(wholeCardReadMoreOne);
			clickElementUsingJavaScript(wholeCardReadMoreOne);
			pageLoad();
			System.out.println("wholeCardReadMoreOne One clicked successfully");
		} else {
			System.out.println("wholeCardReadMoreOne One is not presented in the page");
			throw new Exception("wholeCardReadMoreOne One is not presented in the page");
		}
	}


	public void clickWholecardYoutubeVideoTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(youTubeOne)) {
			scrollDownUsingElement(youTubeOne);
			clickElementUsingJavaScript(youTubeOne);
			switchToFrameUsingElement(iframeOne);
			clickElementUsingJavaScript(videoPlayIcon);
			visibilityOf(videoPlayIcon);
			moveToElement(videoPlayIcon);
			actionClick(videoPlayIcon);
			System.out.println("clicked");
			Thread.sleep(5000);
			visibilityOf(playingMode);
			Assert.assertTrue(elementIsDisplayed(playingMode));
			clickElementUsingJavaScript(videoClick);
			visibilityOf(pausedMode);
			Assert.assertTrue(elementIsDisplayed(pausedMode));
			frameSwitchingToParentFrame();
			//frameSwitchingToDefaultContent();
			visibilityOf(youtubeClose);
			moveToElement(youtubeClose);
			actionClick(youtubeClose);
			fluentWait();
			Assert.assertTrue(elementIsDisplayed(youtubeCloseVerify));
			System.out.println("YoutubeOne video Successfully verified");
		} else {
			System.out.println("YoutubeOne play icon is not presented in the page");
			throw new Exception("YoutubeOne play icon is not presented in the page");
		}
	}

	public void clickWholeCardTextTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(wholeCardTextTwo)) {
			scrollDownUsingElement(wholeCardTextTwo);
			clickElementUsingJavaScript(wholeCardTextTwo);
			pageLoad();
			System.out.println("wholeCardTextTwo One clicked successfully");
		} else {
			System.out.println("wholeCardTextTwo One is not presented in the page");
			throw new Exception("wholeCardTextTwo One is not presented in the page");
		}
	}
	
	
	public void clickWholecardYoutubeVideoThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(youTubeTwo)) {
			scrollDownUsingElement(youTubeTwo);
			clickElementUsingJavaScript(youTubeTwo);
			switchToFrameUsingElement(iframeTwo);
			visibilityOf(videoPlayIcon);
			moveToElement(videoPlayIcon);
			actionClick(videoPlayIcon);
			Thread.sleep(5000);
			visibilityOf(playingMode);
			Assert.assertTrue(elementIsDisplayed(playingMode));
			clickElementUsingJavaScript(videoClick);
			visibilityOf(pausedMode);
			Assert.assertTrue(elementIsDisplayed(pausedMode));
			frameSwitchingToParentFrame();
			//frameSwitchingToDefaultContent();
			visibilityOf(youtubeClose);
			moveToElement(youtubeClose);
			actionClick(youtubeClose);
			visibilityOf(youtubeCloseVerify);
			Assert.assertTrue(elementIsDisplayed(youtubeCloseVerify));
			System.out.println("YoutubeTwo video Successfully verified");
		} else {
			System.out.println("YoutubeTwo play icon is not presented in the page");
			throw new Exception("YoutubeTwo play icon is not presented in the page");
		}
	}

	public void clickWholeCardTextThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(wholeCardTextThree)) {
			scrollDownUsingElement(wholeCardTextThree);
			clickElementUsingJavaScript(wholeCardTextThree);
			pageLoad();
			System.out.println("wholeCardTextThree One clicked successfully");
		} else {
			System.out.println("wholeCardTextThree One is not presented in the page");
			throw new Exception("wholeCardTextThree One is not presented in the page");
		}
	}
	
	
	public void clickWholeCardImgFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(wholeCardImgFour)) {
			scrollDownUsingElement(wholeCardImgFour);
			clickElementUsingJavaScript(wholeCardImgFour);
			pageLoad();
			System.out.println("wholeCardImgFour clicked successfully");
		} else {
			System.out.println("wholeCardImgFour is not presented in the page");
			throw new Exception("wholeCardImgFour is not presented in the page");
		}
	}

	public void clickWholeCardTextFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(wholeCardTextFour)) {
			scrollDownUsingElement(wholeCardTextFour);
			clickElementUsingJavaScript(wholeCardTextFour);
			pageLoad();
			System.out.println("wholeCardTextFour clicked successfully");
		} else {
			System.out.println("wholeCardTextFour is not presented in the page");
			throw new Exception("wholeCardTextFour is not presented in the page");
		}
	}

	public void clickWholeCardReadMoreFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(wholeCardReadMoreFour)) {
			scrollDownUsingElement(wholeCardReadMoreFour);
			clickElementUsingJavaScript(wholeCardReadMoreFour);
			pageLoad();
			System.out.println("wholeCardReadMoreFour clicked successfully");
		} else {
			System.out.println("wholeCardReadMoreFour is not presented in the page");
			throw new Exception("wholeCardReadMoreFour is not presented in the page");
		}
	}
	
	public void clickWholeCardImgFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(wholeCardImgFive)) {
			scrollDownUsingElement(wholeCardImgFive);
			clickElementUsingJavaScript(wholeCardImgFive);
			pageLoad();
			System.out.println("wholeCardImgFive clicked successfully");
		} else {
			System.out.println("wholeCardImgFive is not presented in the page");
			throw new Exception("wholeCardImgFive is not presented in the page");
		}
	}

	public void clickWholeCardTextFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(wholeCardTextFive)) {
			scrollDownUsingElement(wholeCardTextFive);
			clickElementUsingJavaScript(wholeCardTextFive);
			pageLoad();
			System.out.println("wholeCardTextFive clicked successfully");
		} else {
			System.out.println("wholeCardTextFive is not presented in the page");
			throw new Exception("wholeCardTextFive is not presented in the page");
		}
	}

	public void clickWholeCardReadMoreFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(wholeCardReadMoreFive)) {
			scrollDownUsingElement(wholeCardReadMoreFive);
			clickElementUsingJavaScript(wholeCardReadMoreFive);
			pageLoad();
			System.out.println("wholeCardReadMoreFive clicked successfully");
		} else {
			System.out.println("wholeCardReadMoreFive is not presented in the page");
			throw new Exception("wholeCardReadMoreFive is not presented in the page");
		}
	}







}



























