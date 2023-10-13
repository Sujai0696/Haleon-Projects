package com.qa.quit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class QuitMastheadArticlePage extends BaseClass{
	
	public QuitMastheadArticlePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id=\"onetrust-accept-btn-handler\"]")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//a[@href='/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Support Hub']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='Masthead Article']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//a[text()='Back' and @href='/support-hub.html']")
	private static WebElement linkBack;
	
	
	
	@FindBy(xpath = "//div[@class='pagevideo']//img[@title='Masthead Article']")
	private static WebElement youTube;
	
	@FindBy(xpath = "//div[@class='parametrizedhtml component section default-style first odd grid_12 alpha reference-iframe-video']//iframe[@id='rdvideo']")
	private static WebElement iframe;

	@FindBy(xpath = "//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")
	private static WebElement videoPlayIcon;

	@FindBy(xpath = "//div[@id='movie_player']")
	private static WebElement videoClick;

	@FindBy(xpath = "//div[contains(@class,'playing-mode')]")
	private static WebElement playingMode;

	@FindBy(xpath = "//div[contains(@class,'paused-mode')]")
	private static WebElement pausedMode;
	
	
	@FindBy(xpath = "//a[text()='What’s Your Why?' and @href='/support-hub.html']")
	private static WebElement tabOne;
	
	@FindBy(xpath = "//a[text()='Inspiration' and @href='/support-hub.html']")
	private static WebElement tabTwo;
	
	@FindBy(xpath = "//a[text()='Support' and @href='/support-hub.html']")
	private static WebElement tabThree;
	
	@FindBy(xpath = "//div[@class='image component section related-art-img related-art-img1 rel-art-yellow even grid_4 alpha']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//div[@class='image component section related-art-img related-art-img1 rel-art-yellow odd grid_4']")
	private static WebElement relatedArticleTwo;
	
	@FindBy(xpath = "//div[@class='image component section rel-art-purple related-art-img related-art-img3 even last grid_4']")
	private static WebElement relatedArticleThree;
	
	
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

	public void clickBreadcrumbThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(breadcrumbThree)) {
			scrollDownUsingElement(breadcrumbThree);
//			clickElementUsingJavaScript(breadcrumbTwo);
			String href = breadcrumbThree.getAttribute("href");
	        boolean hasValidUrl = href != null && !href.isEmpty();
	        Assert.assertFalse(hasValidUrl);
			pageLoad();
			System.out.println("Breadcrumb Three verified successfully");
		} else {
			System.out.println("Breadcrumb Three is not presented in the page");
			throw new Exception("Breadcrumb Three is not presented in the page");
		}
	}
	
	public void clickLinkBack() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(linkBack)) {
			scrollDownUsingElement(linkBack);
			clickElementUsingJavaScript(linkBack);
			pageLoad();
			System.out.println("linkBack  clicked successfully");
		} else {
			System.out.println("linkBack  is not presented in the page");
			throw new Exception("linkBack  is not presented in the page");
		}
	}
	
	public void clickYoutubeVideo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(youTube)) {
			scrollDownUsingElement(youTube);
			clickElementUsingJavaScript(youTube);
			switchToFrameUsingElement(iframe);
			visibilityOf(videoPlayIcon);
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
	
	public void clickTabOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tabOne)) {
			scrollDownUsingElement(tabOne);
			clickElementUsingJavaScript(tabOne);
			pageLoad();
			System.out.println("tabOne  clicked successfully");
		} else {
			System.out.println("tabOne  is not presented in the page");
			throw new Exception("tabOne  is not presented in the page");
		}
	}
	
	public void clickTabTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tabTwo)) {
			scrollDownUsingElement(tabTwo);
			clickElementUsingJavaScript(tabTwo);
			pageLoad();
			System.out.println("tabTwo  clicked successfully");
		} else {
			System.out.println("tabTwo  is not presented in the page");
			throw new Exception("tabTwo  is not presented in the page");
		}
	}
	
	
	public void clickTabThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tabThree)) {
			scrollDownUsingElement(tabThree);
			clickElementUsingJavaScript(tabThree);
			pageLoad();
			System.out.println("tabThree  clicked successfully");
		} else {
			System.out.println("tabThree  is not presented in the page");
			throw new Exception("tabThree  is not presented in the page");
		}
	}
	
	public void clickRelatedArticleOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleOne)) {
			scrollDownUsingElement(relatedArticleOne);
			
			clickElementUsingJavaScript(relatedArticleOne);
			pageLoad();
			System.out.println("relatedArticleOne  clicked successfully");
		} else {
			System.out.println("relatedArticleOne  is not presented in the page");
			throw new Exception("relatedArticleOne  is not presented in the page");
		}
	}
	
	public void clickRelatedArticleTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleTwo)) {
			scrollDownUsingElement(relatedArticleTwo);
			clickElementUsingJavaScript(relatedArticleTwo);
			pageLoad();
			System.out.println("relatedArticleTwo  clicked successfully");
		} else {
			System.out.println("relatedArticleTwo  is not presented in the page");
			throw new Exception("relatedArticleTwo  is not presented in the page");
		}
	}
	
	
	public void clickRelatedArticleThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(relatedArticleThree)) {
			scrollDownUsingElement(relatedArticleThree);
			clickElementUsingJavaScript(relatedArticleThree);
			pageLoad();
			System.out.println("relatedArticleThree  clicked successfully");
		} else {
			System.out.println("relatedArticleThree  is not presented in the page");
			throw new Exception("relatedArticleThree  is not presented in the page");
		}
	}
}
