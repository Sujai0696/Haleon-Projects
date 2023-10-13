package com.qa.sensodyne.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneInDeepCleanToothbrushPage extends BaseClass{
	
	public SensodyneInDeepCleanToothbrushPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']//self::a[@href='/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Our Products']//self::a[@href='/products.html']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::li[text()=' Sensodyne Deep Clean Soft toothbrush ']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//span[@class='button-text' and text()='Buy Now']//ancestor::a")
	private static WebElement buyNow;
	
	@FindBy(xpath = "//span[text()='Deep Clean Toothpaste']//ancestor::a[@href='/products/sensodyne-deep-clean-toothpaste.html']")
	private static WebElement availablePrdtText;
	
	@FindBy(xpath = "//a[@href='/products/sensodyne-deep-clean-toothpaste.html']//img[@alt='Sensodyne toothpaste in Deep Clean']")
	private static WebElement availablePrdtImg;
	
	
	@FindBy(xpath = "//a[@href='/products/sensodyne-deep-clean-toothpaste.html' and text()='Sensodyne toothpaste']")
	private static WebElement hyperLinkOne;
	
	@FindBy(xpath = "//span[text()='Directions']//ancestor::li[@class='tabs-nav-item odd first']")
	private static WebElement tabDirections;
	
	@FindBy(xpath = "//span[text()='Directions']//ancestor::li[@class='tabs-nav-item odd first is-active']")
	private static WebElement tabDirectionsActive;
	
	@FindBy(xpath = "//span[text()='Warnings and Precautions']//ancestor::li[@class='tabs-nav-item even ']")
	private static WebElement tabWarningsAndPrecautions;
	
	@FindBy(xpath = "//span[text()='Warnings and Precautions']//ancestor::li[@class='tabs-nav-item even is-active']")
	private static WebElement tabWarningsAndPrecautionsActive;
	
	@FindBy(xpath = "//span[text()='Materials']//ancestor::li[@class='tabs-nav-item odd last']")
	private static WebElement tabMaterials;
	
	@FindBy(xpath = "//span[text()='Materials']//ancestor::li[@class='tabs-nav-item odd last is-active']")
	private static WebElement tabMaterialsActive;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Sensitive Toothbrush']//self::a[@href='/products/sensitive-toothbrush.html']")
	private static WebElement mostPopularProductsOne;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Expert Toothbrush']//self::a[@href='/products/expert-toothbrush.html']")
	private static WebElement mostPopularProductsTwo;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Sensitivity & Gum Toothbrush']//self::a[@href='/products/sensitive-teeth-gums-toothbrush.html']")
	private static WebElement mostPopularProductsThree;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Fresh Gel']//self::a[@href='/products/sensodyne-fresh-gel.html']")
	private static WebElement mostPopularProductsFour;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Fresh Mint']//self::a[@href='/products/sensodyne-fresh-mint-toothpaste.html']")
	private static WebElement mostPopularProductsFive;
	
	@FindBy(xpath = "//a[@href='/where-to-buy.html']//img[@alt='Arrow to find your store and purchase Sensodyne toothpaste']")
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
	
	
	public void clickBuyNow() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(buyNow)) {
			scrollDownUsingElement(buyNow);
			clickElementUsingJavaScript(buyNow);
			pageLoad();
			System.out.println("buyNow is clicked successfully");
		} else {
			System.out.println("buyNow is not presented in the page");
			throw new Exception("buyNow is not presented in the page");
		}
	}
	
	public void clickAvailablePrdtText() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(availablePrdtText)) {
			scrollDownUsingElement(availablePrdtText);
			clickElementUsingJavaScript(availablePrdtText);
			pageLoad();
			System.out.println("availablePrdtText is clicked successfully");
		} else {
			System.out.println("availablePrdtText is not presented in the page");
			throw new Exception("availablePrdtText  is not presented in the page");
		}
	}
	
	public void clickAvailablePrdtImg() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(availablePrdtImg)) {
			scrollDownUsingElement(availablePrdtImg);
			clickElementUsingJavaScript(availablePrdtImg);
			pageLoad();
			System.out.println("availablePrdtImg is clicked successfully");
		} else {
			System.out.println("availablePrdtImg is not presented in the page");
			throw new Exception("availablePrdtImg  is not presented in the page");
		}
	}
	
	
	public void clickHyperLinkOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkOne)) {
			scrollDownUsingElement(hyperLinkOne);
			clickElementUsingJavaScript(hyperLinkOne);
			pageLoad();
			System.out.println("hyperLinkOne is clicked successfully");
		} else {
			System.out.println("hyperLinkOne is not presented in the page");
			throw new Exception("hyperLinkOne  is not presented in the page");
		}
	}
	
	public void clickTabSection() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tabDirectionsActive)) {
			clickElementUsingJavaScript(tabWarningsAndPrecautions);
			visibilityOf(tabWarningsAndPrecautionsActive);
			Assert.assertTrue(elementIsDisplayed(tabWarningsAndPrecautionsActive));
			clickElementUsingJavaScript(tabMaterials);
			visibilityOf(tabMaterialsActive);
			Assert.assertTrue(elementIsDisplayed(tabMaterialsActive));
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
			throw new Exception("Most Popular Products FIve is not presented in the page");
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
