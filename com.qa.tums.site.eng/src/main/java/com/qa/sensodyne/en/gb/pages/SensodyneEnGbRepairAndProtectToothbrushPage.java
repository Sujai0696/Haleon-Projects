package com.qa.sensodyne.en.gb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneEnGbRepairAndProtectToothbrushPage extends BaseClass{
	
	public SensodyneEnGbRepairAndProtectToothbrushPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Accept All Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//div[@class='breadcrumbs component section breadcrumbs-comp container-override col-xs-12 breadcrumbs-article fixed-component']//ancestor::a[text()='Home']//self::a[@href='/en-gb/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//div[@class='breadcrumbs component section breadcrumbs-comp container-override col-xs-12 breadcrumbs-article fixed-component']//ancestor::a[text()='Our Products']//self::a[@href='/en-gb/products/']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//div[@class='breadcrumbs component section breadcrumbs-comp container-override col-xs-12 breadcrumbs-article fixed-component']//ancestor::a[text()='Sensodyne Repair Protect toothbrush']//self::a[@href='/en-gb/products/repair-and-protect-toothbrush/']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//span[@class='ps-button-label' and text()='Buy Now']//ancestor::a")
	private static WebElement buyNow;
	
	@FindBy(xpath = "//h2[@class='ps-product-name' and text()='Sensodyne Repair & Protect Whitening Toothpaste']")
	private static WebElement buyNowText;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement buyNowClose;
	
	@FindBy(xpath = "(//div[@style='display: none; z-index: -10000; opacity: 0;'])[2]")
	private static WebElement buyNowCloseVerify;
	
	@FindBy(xpath = "//div[@class='image component section image-without-link-underline even col-xs-6 col-xs-offset-3 col-md-12 col-md-offset-0']//a//img")
	private static WebElement availableProductImgOne;
	
	@FindBy(xpath = "//span[text()='Repair & Protect']//ancestor::a[@href='/en-gb/products/repair-and-protect-toothpaste/']")
	private static WebElement availableProductLinkOne;
	
	@FindBy(xpath = "//a[@href='/en-gb/products/repair-and-protect-extra-fresh-toothpaste/']//img[@alt='Sensodyne Repair and Protect toothpaste in Extra Fresh']")
	private static WebElement availableProductImgTwo;
	
	@FindBy(xpath = "//span[text()='Repair & Protect Extra Fresh']//ancestor::a[@href='/en-gb/products/repair-and-protect-extra-fresh-toothpaste/']")
	private static WebElement availableProductLinkTwo;
	
	
	@FindBy(xpath = "//span[text()='Ingredients']//ancestor::li[@class='tabs-nav-item odd first']")
	private static WebElement tabIngredients;
	
	@FindBy(xpath = "//span[text()='Ingredients']//ancestor::li[@class='tabs-nav-item odd first is-active']")
	private static WebElement tabIngredientsActive;
	
	@FindBy(xpath = "//span[text()='Directions']//ancestor::li[@class='tabs-nav-item even ']")
	private static WebElement tabDirections;
	
	@FindBy(xpath = "//span[text()='Directions']//ancestor::li[@class='tabs-nav-item even is-active']")
	private static WebElement tabDirectionsActive;
	
	@FindBy(xpath = "//span[text()='Warnings']//ancestor::li[@class='tabs-nav-item odd last']")
	private static WebElement tabWarnings;
	
	@FindBy(xpath = "//span[text()='Warnings']//ancestor::li[@class='tabs-nav-item odd last is-active']")
	private static WebElement tabWarningsActive;
	
	
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Repair & Protect']//self::a[@href='/en-gb/products/repair-and-protect-toothpaste/']")
	private static WebElement mostPopularProductsOne;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::span[text()='Sensitivity & Gum']//ancestor::a[@href='/en-gb/products/sensitivity-and-gum-toothpaste/']")
	private static WebElement mostPopularProductsTwo;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Gentle Whitening']//self::a[@href='/en-gb/products/daily-care-gentle-whitening-toothpaste/']")
	private static WebElement mostPopularProductsThree;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Repair & Protect Toothbrush']//ancestor::a[@href='/en-gb/products/repair-and-protect-toothbrush/']")
	private static WebElement mostPopularProductsFour;
	
	@FindBy(xpath = "//a[@href='/en-gb/where-to-buy/']//img[@alt='Arrow to find your store and purchase Sensodyne toothpaste']")
	private static WebElement findYourStore;
	
	
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
//			String href = breadcrumbThree.getAttribute("href");
//	        boolean hasValidUrl = href != null && !href.isEmpty();
//	        Assert.assertFalse(hasValidUrl);
			clickElementUsingJavaScript(breadcrumbThree);
			pageLoad();
			System.out.println("Breadcrumb Three verified successfully");
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
			visibilityOf(buyNowText);
			Assert.assertTrue(elementIsDisplayed(buyNowText));
			clickElementUsingJavaScript(buyNowClose);
			visibilityOf(buyNowCloseVerify);
			Assert.assertTrue(elementIsDisplayed(buyNowCloseVerify));
			System.out.println("Buy Now verified successfully");
		} else {
			System.out.println("Buy Now is not presented in the page");
			throw new Exception("Buy Now is not presented in the page");
		}
	}
	
	public void clickAvailableProductImgOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(availableProductImgOne)) {
			scrollDownUsingElement(availableProductImgOne);
			clickElementUsingJavaScript(availableProductImgOne);
			pageLoad();
		} else {
			System.out.println("Available Product Img One is not presented in the page");
			throw new Exception("Available Product Img One is not presented in the page");
		}
	}
	
	public void clickAvailableProductLinkOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(availableProductLinkOne)) {
			scrollDownUsingElement(availableProductLinkOne);
			clickElementUsingJavaScript(availableProductLinkOne);
			pageLoad();
		} else {
			System.out.println("Available Product Link One is not presented in the page");
			throw new Exception("Available Product Link One is not presented in the page");
		}
	}
	
	public void clickAvailableProductImgTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(availableProductImgTwo)) {
			scrollDownUsingElement(availableProductImgTwo);
			clickElementUsingJavaScript(availableProductImgTwo);
			pageLoad();
		} else {
			System.out.println("Available Product Img Two is not presented in the page");
			throw new Exception("Available Product Img Two is not presented in the page");
		}
	}
	
	public void clickAvailableProductLinkTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(availableProductLinkTwo)) {
			scrollDownUsingElement(availableProductLinkTwo);
			clickElementUsingJavaScript(availableProductLinkTwo);
			pageLoad();
		} else {
			System.out.println("Available Product Link Two is not presented in the page");
			throw new Exception("Available Product Link Two is not presented in the page");
		}
	}
	
	
	
	public void clickTabSection() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tabIngredientsActive)) {
			clickElementUsingJavaScript(tabDirections);
			visibilityOf(tabDirectionsActive);
			Assert.assertTrue(elementIsDisplayed(tabDirectionsActive));
			clickElementUsingJavaScript(tabWarnings);
			visibilityOf(tabWarningsActive);
			Assert.assertTrue(elementIsDisplayed(tabWarningsActive));
			clickElementUsingJavaScript(tabIngredients);
			visibilityOf(tabIngredientsActive);
			Assert.assertTrue(elementIsDisplayed(tabIngredientsActive));
			System.out.println("Tab section verified Successfully");
		} else {
			System.out.println("Tab Ingredients is not active in the page");
			throw new Exception("Tab Ingredients is not active in the page");
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
