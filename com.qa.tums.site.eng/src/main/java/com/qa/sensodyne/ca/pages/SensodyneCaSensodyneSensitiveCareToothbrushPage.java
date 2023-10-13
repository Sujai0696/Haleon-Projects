package com.qa.sensodyne.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneCaSensodyneSensitiveCareToothbrushPage extends BaseClass{
	
	public SensodyneCaSensodyneSensitiveCareToothbrushPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']//self::a[@href='/en-ca/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Our Products']//self::a[@href='/en-ca/products/']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='Sensodyne Sensitive Care Toothbrush']//self::a[@href='/en-ca/products/sensodyne-sensitive-care-toothbrush/']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//div[@class='parametrizedhtml component section visible-desktop col-xs-12 reference-buy-now-button buy-now-button fixed-component']//a[text()='Buy now']//self::a[@href='/en-ca/where-to-buy/']")
	private static WebElement buyNow;
	
	@FindBy(xpath = "//button[@data-v-src='https://www.youtube.com/embed/o280WUg8DuU']//i[@class='icon icon-video-play']")
	private static WebElement youTube;
	
	@FindBy(xpath = "//div[@class='parametrizedhtml component section video-int even col-xs-12 col-md-12 reference-videos-custom-component']//iframe[@id='ytplayer']")
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
	
	@FindBy(xpath = "//div[@style='display: none;']//preceding::button[@data-v-src='https://www.youtube.com/embed/o280WUg8DuU']")
	private static WebElement youtubeCloseVerify;
	
	@FindBy(xpath = "//span[text()='Directions']//ancestor::li[@class='tabs-nav-item odd first']")
	private static WebElement tabDirections;
	
	@FindBy(xpath = "//span[text()='Directions']//ancestor::li[@class='tabs-nav-item odd first is-active']")
	private static WebElement tabDirectionsActive;
	
	@FindBy(xpath = "//span[text()='Warnings and Precautions']//ancestor::li[@class='tabs-nav-item even last ']")
	private static WebElement tabWarningsAndPrecautions;
	
	@FindBy(xpath = "//span[text()='Warnings and Precautions']//ancestor::li[@class='tabs-nav-item even last is-active']")
	private static WebElement tabWarningsAndPrecautionsActive;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Rapid Relief']//self::a[@href='/en-ca/products/rapid-relief-toothpaste/']")
	private static WebElement mostPopularProductsOne;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::span[text()='Brilliant Whitening']//ancestor::a[@href='/en-ca/products/brilliant-whitening-toothpaste/']")
	private static WebElement mostPopularProductsTwo;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Repair and Protect Whitening']//self::a[@href='/en-ca/products/repair-and-protect-whitening/']")
	private static WebElement mostPopularProductsThree;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::span[text()='Complete Protection Extra Fresh']//ancestor::a[@href='/en-ca/products/complete-protection-extra-fresh/']")
	private static WebElement mostPopularProductsFour;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::span[text()='Fresh Mint']//ancestor::a[@href='/en-ca/products/fresh-mint-toothpaste/']")
	private static WebElement mostPopularProductsFive;
	
	@FindBy(xpath = "//a[@href='/en-ca/where-to-buy/']//img[@alt='Arrow to find your store and purchase Sensodyne toothpaste']")
	private static WebElement findYourStore;
	
	
	
	
	
	
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
			clickElementUsingJavaScript(breadcrumbThree);
			pageLoad();
			System.out.println("Breadcrumb Three clicked successfully");
		} else {
			System.out.println("Breadcrumb Three is not presented in the page");
			throw new Exception("Breadcrumb Three is not presented in the page");
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
	
	public void clickTabSection() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tabDirectionsActive)) {
			clickElementUsingJavaScript(tabWarningsAndPrecautions);
			visibilityOf(tabWarningsAndPrecautionsActive);
			Assert.assertTrue(elementIsDisplayed(tabWarningsAndPrecautionsActive));
			clickElementUsingJavaScript(tabDirections);
			visibilityOf(tabDirectionsActive);
			Assert.assertTrue(elementIsDisplayed(tabDirectionsActive));
			System.out.println("Tab section verified Successfully");
		} else {
			System.out.println("Tab Directions is not active in the page");
			throw new Exception("Tab Directions is not active in the page");
		}
	}
	
	public void clickMostPopularProductOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(mostPopularProductsOne)) {
			scrollDownUsingElement(mostPopularProductsOne);
			clickElementUsingJavaScript(mostPopularProductsOne);
			pageLoad();
		} else {
			System.out.println("Most Popular Products One is not presented in the page");
			throw new Exception("Most Popular Products One is not presented in the page");
		}
	}
	
	public void clickMostPopularProductTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(mostPopularProductsTwo)) {
			scrollDownUsingElement(mostPopularProductsTwo);
			clickElementUsingJavaScript(mostPopularProductsTwo);
			pageLoad();
		} else {
			System.out.println("Most Popular Products Two is not presented in the page");
			throw new Exception("Most Popular Products Two is not presented in the page");
		}
	}
	
	public void clickMostPopularProductThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(mostPopularProductsThree)) {
			scrollDownUsingElement(mostPopularProductsThree);
			clickElementUsingJavaScript(mostPopularProductsThree);
			pageLoad();
		} else {
			System.out.println("Most Popular Products Three is not presented in the page");
			throw new Exception("Most Popular Products Three is not presented in the page");
		}
	}
	
	public void clickMostPopularProductFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(mostPopularProductsFour)) {
			scrollDownUsingElement(mostPopularProductsFour);
			clickElementUsingJavaScript(mostPopularProductsFour);
			pageLoad();
		} else {
			System.out.println("Most Popular Products Four is not presented in the page");
			throw new Exception("Most Popular Products Four is not presented in the page");
		}
	}
	
	public void clickMostPopularProductFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(mostPopularProductsFive)) {
			scrollDownUsingElement(mostPopularProductsFive);
			clickElementUsingJavaScript(mostPopularProductsFive);
			pageLoad();
		} else {
			System.out.println("Most Popular Products Five is not presented in the page");
			throw new Exception("Most Popular Products Five is not presented in the page");
		}
	}
	
	public void clickFindYourStore() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(findYourStore)) {
			scrollDownUsingElement(findYourStore);
			clickElementUsingJavaScript(findYourStore);
			pageLoad();
		} else {
			System.out.println("Find your store is not presented in the page");
			throw new Exception("Find your store is not presented in the page");
		}
	}


}
