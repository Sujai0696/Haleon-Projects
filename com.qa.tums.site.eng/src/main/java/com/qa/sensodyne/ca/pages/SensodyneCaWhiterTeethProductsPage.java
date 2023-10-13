package com.qa.sensodyne.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class SensodyneCaWhiterTeethProductsPage extends BaseClass{
	
	public SensodyneCaWhiterTeethProductsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='freshen breath']//self::a[@href='/en-ca/products/product-results/fresh-breath-products/']")
	private static WebElement hyperLinkFreshenBreath;
	
	@FindBy(xpath = "//a[text()='repairing sensitive teeth']//self::a[@href='/en-ca/products/product-results/repair-sensitive-teeth-products/']")
	private static WebElement hyperLinkReparingSensitiveTeeth;
	
	@FindBy(xpath = "//strong[text()='Rapid Relief']//ancestor::a[@href='/en-ca/products/sensodyne-rapid-relief-whitening/']")
	private static WebElement productTextOne;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/sensodyne-rapid-relief-whitening/']//img[@alt='Sensodyne Rapid Relief Whitening Toothpaste']")
	private static WebElement productImgOne;
	
	@FindBy(xpath = "//div[@class='box component section prod-2 product-box first odd col-xs-12 col-sm-6 col-md-3']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowOne;
	
	@FindBy(xpath = "//strong[text()='Repair and Protect']//ancestor::a[@href='/en-ca/products/repair-and-protect-whitening/']")
	private static WebElement productTextTwo;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/repair-and-protect-whitening/']//img[@alt='Sensodyne Repair and Protect toothpaste in Whitening']")
	private static WebElement productImgTwo;
	
	@FindBy(xpath = "//div[@class='box component section prod-8 product-box even col-xs-12 col-sm-6 col-md-3']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowTwo;
	
	@FindBy(xpath = "//strong[text()='Brilliant Whitening']//ancestor::a[@href='/en-ca/products/brilliant-whitening-toothpaste/']")
	private static WebElement productTextThree;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/brilliant-whitening-toothpaste/']//img[@alt='Sensodyne Brilliant Whitening toothpaste']")
	private static WebElement productImgThree;
	
	@FindBy(xpath = "//div[@class='box component section prod-3 product-box odd col-xs-12 col-sm-6 col-md-3']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowThree;
	
	@FindBy(xpath = "//strong[text()='Multi-Action']//ancestor::a[@href='/en-ca/products/multi-action-whitening/']")
	private static WebElement productTextFour;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/multi-action-whitening/']//img[@alt='Sensodyne Multi-Action toothpaste']")
	private static WebElement productImgFour;
	
	@FindBy(xpath = "//div[@class='box component section prod-13 product-box even col-xs-12 col-sm-6 col-md-3']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowFour;
	
	@FindBy(xpath = "//strong[text()='Whitening Plus Tartar Fighting']//ancestor::a[@href='/en-ca/products/whitening-plus-tartar-fighting-toothpaste/']")
	private static WebElement productTextFive;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/whitening-plus-tartar-fighting-toothpaste/']//img[@alt='Sensodyne Tartar Control with Whitening toothpaste']")
	private static WebElement productImgFive;
	
	@FindBy(xpath = "//div[@class='box component section prod-14 product-box odd col-xs-12 col-sm-6 col-md-3']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowFive;
	
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
	
	public void clickProductTextFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productTextFour)) {
			scrollDownUsingElement(productTextFour);
			clickElementUsingJavaScript(productTextFour);
			pageLoad();
		} else {
			System.out.println("Product text Four is not presented in the page");
			throw new Exception("Product text Four is not presented in the page");
		}
	}
	
	public void clickProductImgFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productImgFour)) {
			scrollDownUsingElement(productImgFour);
			clickElementUsingJavaScript(productImgFour);
			pageLoad();
		} else {
			System.out.println("Product Img Four is not presented in the page");
			throw new Exception("Product Img Four is not presented in the page");
		}
	}
	
	public void clickProductBuyNowFour() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productBuyNowFour)) {
			scrollDownUsingElement(productBuyNowFour);
			clickElementUsingJavaScript(productBuyNowFour);
			pageLoad();
		} else {
			System.out.println("Product Buy Now Four is not presented in the page");
			throw new Exception("Product Buy Now Four is not presented in the page");
		}
	}
	
	public void clickProductTextFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productTextFive)) {
			scrollDownUsingElement(productTextFive);
			clickElementUsingJavaScript(productTextFive);
			pageLoad();
		} else {
			System.out.println("Product text Five is not presented in the page");
			throw new Exception("Product text Five is not presented in the page");
		}
	}
	
	public void clickProductImgFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productImgFive)) {
			scrollDownUsingElement(productImgFive);
			clickElementUsingJavaScript(productImgFive);
			pageLoad();
		} else {
			System.out.println("Product Img Five is not presented in the page");
			throw new Exception("Product Img Five is not presented in the page");
		}
	}
	
	public void clickProductBuyNowFive() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productBuyNowFive)) {
			scrollDownUsingElement(productBuyNowFive);
			clickElementUsingJavaScript(productBuyNowFive);
			pageLoad();
		} else {
			System.out.println("Product Buy Now Five is not presented in the page");
			throw new Exception("Product Buy Now Five is not presented in the page");
		}
	}
	
	public void clickHyperLinkFreshenBreath() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkFreshenBreath)) {
			scrollDownUsingElement(hyperLinkFreshenBreath);
			clickElementUsingJavaScript(hyperLinkFreshenBreath);
			pageLoad();
		} else {
			System.out.println("HyperLink Freshen Breath is not presented in the page");
			throw new Exception("HyperLink Freshen Breath is not presented in the page");
		}
	}
	
	public void clickHyperLinkReparingSensitiveTeeth() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkReparingSensitiveTeeth)) {
			scrollDownUsingElement(hyperLinkReparingSensitiveTeeth);
			clickElementUsingJavaScript(hyperLinkReparingSensitiveTeeth);
			pageLoad();
		} else {
			System.out.println("HyperLink Reparing Sensitive Teeth is not presented in the page");
			throw new Exception("HyperLink Reparing Sensitive Teeth is not presented in the page");
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
