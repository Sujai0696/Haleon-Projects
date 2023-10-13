package com.qa.sensodyne.in.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneInSensodyneDeepCleanToothpastePage extends BaseClass{
	
	public SensodyneInSensodyneDeepCleanToothpastePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd first ']//ancestor::a[text()='home']//self::a[@href='/']")
	private static WebElement breadcrumbOne;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even ']//ancestor::a[text()='Our Products']//self::a[@href='/products.html']")
	private static WebElement breadcrumbTwo;
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//ancestor::li[text()=' Deep Clean ']")
	private static WebElement breadcrumbThree;
	
	@FindBy(xpath = "//span[@class='button-text' and text()='Buy Now']//ancestor::a")
	private static WebElement buyNow;
	
	@FindBy(xpath = "//a[text()='Deep Clean Soft Toothbrush' and @href='/products/deep-clean-toothbrush.html']")
	private static WebElement availablePrdtText;
	
	@FindBy(xpath = "//a[@href='/products/deep-clean-toothbrush.html']//img[@alt='Sensodyne Deep Clean Soft toothbrush']")
	private static WebElement availablePrdtImg;
	
	@FindBy(xpath = "//span[text()='Ingredients']//ancestor::li[@class='tabs-nav-item odd first']")
	private static WebElement tabIngredients;
	
	@FindBy(xpath = "//span[text()='Ingredients']//ancestor::li[@class='tabs-nav-item odd first is-active']")
	private static WebElement tabIngredientsActive;
	
	@FindBy(xpath = "//span[text()='Directions']//ancestor::li[@class='tabs-nav-item even ']")
	private static WebElement tabDirections;
	
	@FindBy(xpath = "//span[text()='Directions']//ancestor::li[@class='tabs-nav-item even is-active']")
	private static WebElement tabDirectionsActive;
	
	@FindBy(xpath = "//span[text()='Warnings']//ancestor::li[@class='tabs-nav-item odd']")
	private static WebElement tabWarnings;
	
	@FindBy(xpath = "//span[text()='Warnings']//ancestor::li[@class='tabs-nav-item odd is-active']")
	private static WebElement tabWarningsActive;
	
	@FindBy(xpath = "//span[text()='Materials']//ancestor::li[@class='tabs-nav-item even last']")
	private static WebElement tabMaterials;
	
	@FindBy(xpath = "//span[text()='Materials']//ancestor::li[@class='tabs-nav-item even last is-active']")
	private static WebElement tabMaterialsActive;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Rapid Relief']//self::a[@href='/products/sensodyne-rapid-relief-toothpaste.html']")
	private static WebElement mostPopularProductsOne;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Fresh Mint ']//self::a[@href='/products/sensodyne-fresh-mint-toothpaste.html']")
	private static WebElement mostPopularProductsTwo;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Sensitivity & Gum ']//self::a[@href='/products/sensitivity-gum-toothpaste.html']")
	private static WebElement mostPopularProductsThree;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Repair & Protect']//self::a[@href='/products/sensodyne-repair-protect-toothpaste.html']")
	private static WebElement mostPopularProductsFour;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']//following::a[text()='Whitening ']//self::a[@href='/products/sensodyne-whitening-toothpaste.html']")
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
		} else {
			System.out.println("availablePrdtText is not presented in the page");
			throw new Exception("availablePrdtText is not presented in the page");
		}
	}
	
	public void clickAvailablePrdtImg() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(availablePrdtImg)) {
			scrollDownUsingElement(availablePrdtImg);
			clickElementUsingJavaScript(availablePrdtImg);
			pageLoad();
		} else {
			System.out.println("availablePrdtImg is not presented in the page");
			throw new Exception("availablePrdtImg is not presented in the page");
		}
	}
	
	
	
	
	public void clickTabSection() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(tabIngredientsActive)) {
			scrollDownUsingElement(tabIngredientsActive);
			clickElementUsingJavaScript(tabDirections);
			pageLoad();
			visibilityOf(tabDirectionsActive);
			Assert.assertTrue(elementIsDisplayed(tabDirectionsActive));
			clickElementUsingJavaScript(tabWarnings);
			pageLoad();
			visibilityOf(tabWarningsActive);
			Assert.assertTrue(elementIsDisplayed(tabWarningsActive));
			clickElementUsingJavaScript(tabMaterials);
			pageLoad();
			visibilityOf(tabMaterialsActive);
			Assert.assertTrue(elementIsDisplayed(tabMaterialsActive));
			clickElementUsingJavaScript(tabIngredients);
			pageLoad();
			visibilityOf(tabIngredientsActive);
			Assert.assertTrue(elementIsDisplayed(tabIngredientsActive));
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
