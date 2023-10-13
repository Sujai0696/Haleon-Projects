package com.qa.quit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class QuitIncreaseYourChancesOfSuccessPage extends BaseClass{
	
	
	
	public QuitIncreaseYourChancesOfSuccessPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id=\"onetrust-accept-btn-handler\"]")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='Support Hub' and @href='/support-hub.htm']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//a[text()='Increase Your Chances of Success']//ancestor::li[@class='breadcrumb-list-item odd last is-current ']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//a[text()='Back' and @href='/support-hub.html']")
	private static WebElement linkBack;
	
	@FindBy(xpath = "//a[text()='MyQuit' and @href='/join-myquit.html']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//p//a[text()='Quit.com' and @href='/']")
	private static WebElement hyperLinkTwo;
	
	@FindBy(xpath = "//p//a[text()='MyQuit App' and @href='https://play.google.com/store/apps/details?id=com.gsk.myquit&hl=en']")
	private static WebElement hyperLinkThree;
	
	
	
	@FindBy(xpath = "//div[@class='pagevideo']//img[@title='Increase your chances of success']")
	private static WebElement youTube;
	
	@FindBy(xpath = "//div[@class='parametrizedhtml component section default-style even last grid_12 alpha reference-iframe-video']//iframe[@id='rdvideo']")
	private static WebElement iframe;

	@FindBy(xpath = "//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")
	private static WebElement videoPlayIcon;

	@FindBy(xpath = "//div[@id='movie_player']")
	private static WebElement videoClick;

	@FindBy(xpath = "//div[contains(@class,'playing-mode')]")
	private static WebElement playingMode;

	@FindBy(xpath = "//div[contains(@class,'paused-mode')]")
	private static WebElement pausedMode;
	
	
	
	@FindBy(xpath = "//a[text()='Support' and @href='/support-hub.html']")
	private static WebElement tabOne;
	
	@FindBy(xpath = "//a[text()='Inspiration' and @href='/support-hub.html']")
	private static WebElement tabTwo;
	
	@FindBy(xpath = "(//a[normalize-space()=\"What's your Why?\" and @href='/support-hub.html'])")
	private static WebElement tabThree;
	
	@FindBy(xpath = "//div[@class='image component section related-art-img related-art-img1 rel-art-yellow even grid_4 alpha']")
	private static WebElement relatedArticleOne;
	
	@FindBy(xpath = "//div[@class='image component section related-art-img related-art-img1 rel-art-blue odd last grid_4']")
	private static WebElement relatedArticleTwo;
	
	
	
	
	
	
	
	
	
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
//			clickElementUsingJavaScript(breadcrumbTwo);
			String href = breadcrumbTwo.getAttribute("href");
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
	
	public void clickHyperLinkOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkOne)) {
			scrollDownUsingElement(hyperLinkOne);
			
			clickElementUsingJavaScript(hyperLinkOne);
			pageLoad();
			 
			System.out.println("hyperLinkOne  clicked successfully");
		} else {
			System.out.println("hyperLinkOne  is not presented in the page");
			throw new Exception("hyperLinkOne  is not presented in the page");
		}
	}
	

	public void clickHyperLinkTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkTwo)) {
			scrollDownUsingElement(hyperLinkTwo);
			clickElementUsingJavaScript(hyperLinkTwo);
			pageLoad();
			System.out.println("hyperLinkTwo  clicked successfully");
		} else {
			System.out.println("hyperLinkTwo  is not presented in the page");
			throw new Exception("hyperLinkTwo  is not presented in the page");
		}
	}
	
	public String clickHyperLinkThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkThree)) {
			scrollDownUsingElement(hyperLinkThree);
			clickElementUsingJavaScript(hyperLinkThree);
			pageLoad();
			String currentUrl = getCurrentUrl();
			return currentUrl;
		} else {
			System.out.println("hyperLinkThree  is not presented in the page");
			throw new Exception("hyperLinkThree  is not presented in the page");
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
	
	
	
	

}
