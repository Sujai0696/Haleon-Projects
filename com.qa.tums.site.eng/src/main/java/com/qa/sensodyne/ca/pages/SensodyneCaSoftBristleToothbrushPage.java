package com.qa.sensodyne.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneCaSoftBristleToothbrushPage extends BaseClass{
	
	public SensodyneCaSoftBristleToothbrushPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']//self::a[@href='/en-ca/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Our Products']//self::a[@href='/en-ca/products/']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::a[text()='Sensodyne Gentle Care toothbrush']//self::a[@href='/en-ca/products/soft-bristle-toothbrush/']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//a[text()='Buy now']//self::a[@href='/en-ca/where-to-buy/']")
	private static WebElement buyNow;
	
	@FindBy(xpath = "//span[text()='Repair & Protect']//ancestor::a[@href='/en-ca/products/repair-and-protect-original/']")
	private static WebElement availableProductTextOne;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/repair-and-protect-original/']//img[@alt='Sensodyne Repair and Protect toothpaste']")
	private static WebElement availableProductImgOne;
	
	@FindBy(xpath = "//a[text()='sensitive teeth']//self::a[@href='/en-ca/about-sensitivity/']")
	private static WebElement hyperLinkSensitiveTeeth;
	
	@FindBy(xpath = "//a[text()='Sensodyne toothpaste']//self::a[@href='/en-ca/products/']")
	private static WebElement hyperLinkSensodyneToothpaste;
	
	@FindBy(xpath = "//span[text()='Directions']//ancestor::li[@class='tabs-nav-item odd first']")
	private static WebElement tabDirections;
	
	@FindBy(xpath = "//span[text()='Directions']//ancestor::li[@class='tabs-nav-item odd first is-active']")
	private static WebElement tabDirectionsActive;
	
	@FindBy(xpath = "//span[text()='Warnings and Precautions']//ancestor::li[@class='tabs-nav-item even last ']")
	private static WebElement tabWarningsAndPrecautions;
	
	@FindBy(xpath = "//span[text()='Warnings and Precautions']//ancestor::li[@class='tabs-nav-item even last is-active']")
	private static WebElement tabWarningsAndPrecautionsActive;
	
	@FindBy(xpath = "//a[text()='Find out how brush your teeth.']//self::a[@href='/en-ca/sensitive-teeth-toothbrushes/how-to-brush-teeth/']")
	private static WebElement hyperLinkFindOutHowBrushYourTeeth;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Rapid Relief']//self::a[@href='/en-ca/products/rapid-relief-toothpaste/']")
	private static WebElement mostPopularProductsOne;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::span[text()='Brilliant Whitening']//ancestor::a[@href='/en-ca/products/brilliant-whitening-toothpaste/']")
	private static WebElement mostPopularProductsTwo;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Repair and Protect Whitening']//self::a[@href='/en-ca/products/repair-and-protect-whitening/']")
	private static WebElement mostPopularProductsThree;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Complete Protection Extra Fresh']//ancestor::a[@href='/en-ca/products/complete-protection-extra-fresh/']")
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
	
	public void clickAvailableProductTextOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(availableProductTextOne)) {
			scrollDownUsingElement(availableProductTextOne);
			clickElementUsingJavaScript(availableProductTextOne);
			pageLoad();
		} else {
			System.out.println("Available Product Text One is not presented in the page");
			throw new Exception("Available Product Text One is not presented in the page");
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
	
	
	public void clickHyperLinkSensitiveTeeth() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkSensitiveTeeth)) {
			scrollDownUsingElement(hyperLinkSensitiveTeeth);
			clickElementUsingJavaScript(hyperLinkSensitiveTeeth);
			pageLoad();
		} else {
			System.out.println("hyperLink Sensitive Teeth is not presented in the page");
			throw new Exception("hyperLink Sensitive Teeth is not presented in the page");
		}
	}
	
	public void clickHyperLinkSensodyneToothpaste() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkSensodyneToothpaste)) {
			scrollDownUsingElement(hyperLinkSensodyneToothpaste);
			clickElementUsingJavaScript(hyperLinkSensodyneToothpaste);
			pageLoad();
		} else {
			System.out.println("hyperLink Sensodyne Toothpaste is not presented in the page");
			throw new Exception("hyperLink Sensodyne Toothpaste is not presented in the page");
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
	
	
	public void clickHyperLinkFindOutHowBrushYourTeeth() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tabDirectionsActive)) {
			scrollDownUsingElement(hyperLinkFindOutHowBrushYourTeeth);
			clickElementUsingJavaScript(hyperLinkFindOutHowBrushYourTeeth);
			pageLoad();
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
