package com.qa.sensodyne.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class SensodyneCaGumProtectionProductsPage extends BaseClass{
	
	public SensodyneCaGumProtectionProductsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//strong[text()='Sensitivity & Gum']//ancestor::a[@href='/en-ca/products/sensitivity-and-gum/']")
	private static WebElement productTextOne;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/sensitivity-and-gum/']//img[@alt='Sensodyne Rapid Relief toothpaste in Mint']")
	private static WebElement productImgOne;
	
	@FindBy(xpath = "//div[@class='box component section prod-1 product-box first odd col-xs-12 col-sm-6 col-md-3']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowOne;
	
	@FindBy(xpath = "//strong[text()='Sensitivity & Gum']//ancestor::a[@href='/en-ca/products/sensitivity-and-gum-whitening/']")
	private static WebElement productTextTwo;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/sensitivity-and-gum-whitening/']//img[@alt='Sensodyne Rapid Relief toothpaste in Extra Fresh']")
	private static WebElement productImgTwo;
	
	@FindBy(xpath = "//div[@class='box component section prod-2 product-box even col-xs-12 col-sm-6 col-md-3']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowTwo;
	
	@FindBy(xpath = "//strong[text()='Sensitivity & Gum']//ancestor::a[@href='/en-ca/products/sensitivity-gum-clean-and-fresh/']")
	private static WebElement productTextThree;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/sensitivity-gum-clean-and-fresh/']//img[@alt='Sensodyne Sensitivity and Gum Toothpaste Pack clean and fresh']")
	private static WebElement productImgThree;
	
	@FindBy(xpath = "//div[@class='box component section prod-2 product-box odd col-xs-12 col-sm-6 col-md-3']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowThree;
	
	@FindBy(xpath = "//a[@href='/en-ca/where-to-buy/']//img[@alt='Where to buy Sensodyne Toothpaste near you']")
	private static WebElement findYourStore;
	
	
	
	
	
	
	
	public void clickProductTextOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productTextOne)) {
			scrollDownUsingElement(productTextOne);
			clickElementUsingJavaScript(productTextOne);
			pageLoad();
		} else {
			System.out.println("Product text one is not presented in the page");
			throw new Exception("Product text one is not presented in the page");
		}
	}
	
	public void clickProductImgOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productImgOne)) {
			scrollDownUsingElement(productImgOne);
			clickElementUsingJavaScript(productImgOne);
			pageLoad();
		} else {
			System.out.println("Product Img one is not presented in the page");
			throw new Exception("Product Img one is not presented in the page");
		}
	}
	
	public void clickProductBuyNowOne() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productBuyNowOne)) {
			scrollDownUsingElement(productBuyNowOne);
			clickElementUsingJavaScript(productBuyNowOne);
			pageLoad();
		} else {
			System.out.println("Product Buy Now one is not presented in the page");
			throw new Exception("Product Buy Now one is not presented in the page");
		}
	}
	
	public void clickProductTextTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productTextTwo)) {
			scrollDownUsingElement(productTextTwo);
			clickElementUsingJavaScript(productTextTwo);
			pageLoad();
		} else {
			System.out.println("Product text Two is not presented in the page");
			throw new Exception("Product text Two is not presented in the page");
		}
	}
	
	public void clickProductImgTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productImgTwo)) {
			scrollDownUsingElement(productImgTwo);
			clickElementUsingJavaScript(productImgTwo);
			pageLoad();
		} else {
			System.out.println("Product Img Two is not presented in the page");
			throw new Exception("Product Img Two is not presented in the page");
		}
	}
	
	public void clickProductBuyNowTwo() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productBuyNowTwo)) {
			scrollDownUsingElement(productBuyNowTwo);
			clickElementUsingJavaScript(productBuyNowTwo);
			pageLoad();
		} else {
			System.out.println("Product Buy Now Two is not presented in the page");
			throw new Exception("Product Buy Now Two is not presented in the page");
		}
	}
	
	public void clickProductTextThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productTextThree)) {
			scrollDownUsingElement(productTextThree);
			clickElementUsingJavaScript(productTextThree);
			pageLoad();
		} else {
			System.out.println("Product text Three is not presented in the page");
			throw new Exception("Product text Three is not presented in the page");
		}
	}
	
	public void clickProductImgThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productImgThree)) {
			scrollDownUsingElement(productImgThree);
			clickElementUsingJavaScript(productImgThree);
			pageLoad();
		} else {
			System.out.println("Product Img Three is not presented in the page");
			throw new Exception("Product Img Three is not presented in the page");
		}
	}
	
	public void clickProductBuyNowThree() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productBuyNowThree)) {
			scrollDownUsingElement(productBuyNowThree);
			clickElementUsingJavaScript(productBuyNowThree);
			pageLoad();
		} else {
			System.out.println("Product Buy Now Three is not presented in the page");
			throw new Exception("Product Buy Now Three is not presented in the page");
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
