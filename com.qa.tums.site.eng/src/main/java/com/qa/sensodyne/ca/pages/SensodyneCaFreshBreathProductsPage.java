package com.qa.sensodyne.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseClass.BaseClass;

public class SensodyneCaFreshBreathProductsPage extends BaseClass{
	
	public SensodyneCaFreshBreathProductsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[text()='sensitivity relief']//self::a[@href='/en-ca/products/product-results/fast-sensitive-teeth-relief-products/']")
	private static WebElement hyperLinkSensitivityRelief;
	
	@FindBy(xpath = "//a[text()='whiter teeth']//self::a[@href='/en-ca/products/product-results/whiter-teeth-products/']")
	private static WebElement hyperLinkWhiterTeeth;
	
	@FindBy(xpath = "//strong[text()='Rapid Relief']//ancestor::a[@href='/en-ca/products/rapid-relief-extra-fresh-toothpaste/']")
	private static WebElement productTextOne;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/rapid-relief-extra-fresh-toothpaste/']//img[@alt='Sensodyne Rapid Relief toothpaste in Extra Fresh']")
	private static WebElement productImgOne;
	
	@FindBy(xpath = "//div[@class='box component section prod-2 product-box first odd col-xs-12 col-sm-6 col-md-3']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowOne;
	
	@FindBy(xpath = "//strong[text()='Repair and Protect']//ancestor::a[@href='/en-ca/products/repair-and-protect-extra-fresh-toothpaste/']")
	private static WebElement productTextTwo;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/repair-and-protect-extra-fresh-toothpaste/']//img[@alt='Sensodyne Repair and Protect toothpaste in Extra Fresh']")
	private static WebElement productImgTwo;
	
	@FindBy(xpath = "//div[@class='box component section prod-7 product-box even col-xs-12 col-sm-6 col-md-3']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowTwo;
	
	@FindBy(xpath = "//strong[text()='Complete Protection']//ancestor::a[@href='/en-ca/products/complete-protection-extra-fresh/']")
	private static WebElement productTextThree;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/complete-protection-extra-fresh/']//img[@alt='Sensodyne Complete Protection toothpaste in Extra Fresh']")
	private static WebElement productImgThree;
	
	@FindBy(xpath = "//div[@class='box component section prod-11 product-box odd col-xs-12 col-sm-6 col-md-3']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowThree;
	
	@FindBy(xpath = "//strong[text()='Fresh Mint']//ancestor::a[@href='/en-ca/products/fresh-mint-toothpaste/']")
	private static WebElement productTextFour;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/fresh-mint-toothpaste/']//img[@alt='Sensodyne toothpaste in Fresh Mint']")
	private static WebElement productImgFour;
	
	@FindBy(xpath = "//div[@class='box component section prod-12 product-box even col-xs-12 col-sm-6 col-md-3']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowFour;
	
	@FindBy(xpath = "//strong[text()='Ultra Fresh']//ancestor::a[@href='/en-ca/products/ultra-fresh-toothpaste/']")
	private static WebElement productTextFive;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/ultra-fresh-toothpaste/']//img[@alt='Sensodyne Ultra Fresh toothpaste']")
	private static WebElement productImgFive;
	
	@FindBy(xpath = "//div[@class='box component section prod-15 product-box odd col-xs-12 col-sm-6 col-md-3 col-md-offset-0']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowFive;
	
	@FindBy(xpath = "//strong[text()='Multi-Action']//ancestor::a[@href='/en-ca/products/multi-action-whitening/']")
	private static WebElement productTextSix;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/multi-action-whitening/']//img[@alt='Sensodyne Multi-Action toothpaste']")
	private static WebElement productImgSix;
	
	@FindBy(xpath = "//div[@class='box component section prod-13 product-box even col-xs-12 col-sm-6 col-md-3']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowSix;
	
	@FindBy(xpath = "//strong[text()='Deep Clean']//ancestor::a[@href='/en-ca/products/deep-clean-toothpaste/']")
	private static WebElement productTextSeven;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/deep-clean-toothpaste/']//img[@alt='Sensodyne toothpaste in Deep Clean']")
	private static WebElement productImgSeven;
	
	@FindBy(xpath = "//div[@class='box component section prod-9 product-box odd col-xs-12 col-sm-6 col-md-3 col-md-offset-0']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowSeven;
	
	@FindBy(xpath = "//a[@href='/en-ca/where-to-buy/']//img[@alt='Where to buy Sensodyne Toothpaste near you']")
	private static WebElement findYourStore;
	
	
	
	public void clickHyperLinkSensitivityRelief() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkSensitivityRelief)) {
			scrollDownUsingElement(hyperLinkSensitivityRelief);
			clickElementUsingJavaScript(hyperLinkSensitivityRelief);
			pageLoad();
		} else {
			System.out.println("HyperLink Sensitivity Relief is not presented in the page");
			throw new Exception("HyperLink Sensitivity Relief is not presented in the page");
		}
	}
	
	public void clickHyperLinkWhiterTeeth() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(hyperLinkWhiterTeeth)) {
			scrollDownUsingElement(hyperLinkWhiterTeeth);
			clickElementUsingJavaScript(hyperLinkWhiterTeeth);
			pageLoad();
		} else {
			System.out.println("HyperLink Whiter Teeth is not presented in the page");
			throw new Exception("HyperLink Whiter Teeth is not presented in the page");
		}
	}
	
	
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
	
	public void clickProductTextSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productTextSix)) {
			scrollDownUsingElement(productTextSix);
			clickElementUsingJavaScript(productTextSix);
			pageLoad();
		} else {
			System.out.println("Product text Six is not presented in the page");
			throw new Exception("Product text Six is not presented in the page");
		}
	}
	
	public void clickProductImgSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productImgSix)) {
			scrollDownUsingElement(productImgSix);
			clickElementUsingJavaScript(productImgSix);
			pageLoad();
		} else {
			System.out.println("Product Img Six is not presented in the page");
			throw new Exception("Product Img Six is not presented in the page");
		}
	}
	
	public void clickProductBuyNowSix() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productBuyNowSix)) {
			scrollDownUsingElement(productBuyNowSix);
			clickElementUsingJavaScript(productBuyNowSix);
			pageLoad();
		} else {
			System.out.println("Product Buy Now Six is not presented in the page");
			throw new Exception("Product Buy Now Six is not presented in the page");
		}
	}
	
	public void clickProductTextSeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productTextSeven)) {
			scrollDownUsingElement(productTextSeven);
			clickElementUsingJavaScript(productTextSeven);
			pageLoad();
		} else {
			System.out.println("Product text Seven is not presented in the page");
			throw new Exception("Product text Seven is not presented in the page");
		}
	}
	
	public void clickProductImgSeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productImgSeven)) {
			scrollDownUsingElement(productImgSeven);
			clickElementUsingJavaScript(productImgSeven);
			pageLoad();
		} else {
			System.out.println("Product Img Seven is not presented in the page");
			throw new Exception("Product Img Seven is not presented in the page");
		}
	}
	
	public void clickProductBuyNowSeven() throws Exception{
		waitForPageLoadJava();
		if (isElementPresent(productBuyNowSeven)) {
			scrollDownUsingElement(productBuyNowSeven);
			clickElementUsingJavaScript(productBuyNowSeven);
			pageLoad();
		} else {
			System.out.println("Product Buy Now Seven is not presented in the page");
			throw new Exception("Product Buy Now Seven is not presented in the page");
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
