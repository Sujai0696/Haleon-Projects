package com.qa.sensodyne.ca.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class SensodyneCaFastSensitiveTeethReliefProductsPage extends BaseClass{
	
	public SensodyneCaFastSensitiveTeethReliefProductsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;

	@FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage gigya-heading first odd component col-xs-12 active']")
	private static WebElement gigyaForm;

	@FindBy(xpath = "//div[contains(@class,'content_hide')]")
	private static WebElement gigyaClose;
	
	@FindBy(xpath = "//strong[text()='Rapid Relief']//ancestor::a[@href='/en-ca/products/rapid-relief-toothpaste/']")
	private static WebElement productTextOne;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/rapid-relief-toothpaste/']//img[@alt='Sensodyne Rapid Relief toothpaste in Mint']")
	private static WebElement productImgOne;
	
	@FindBy(xpath = "//div[@class='box component section prod-1 product-box first odd col-xs-12 col-sm-6 col-md-3']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowOne;
	
	@FindBy(xpath = "//strong[text()='Rapid Relief']//ancestor::a[@href='/en-ca/products/rapid-relief-extra-fresh-toothpaste/']")
	private static WebElement productTextTwo;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/rapid-relief-extra-fresh-toothpaste/']//img[@alt='Sensodyne Rapid Relief toothpaste in Extra Fresh']")
	private static WebElement productImgTwo;
	
	@FindBy(xpath = "//div[@class='box component section prod-2 product-box even col-xs-12 col-sm-6 col-md-3']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowTwo;
	
	@FindBy(xpath = "//strong[text()='Rapid Relief']//ancestor::a[@href='/en-ca/products/sensodyne-rapid-relief-whitening/']")
	private static WebElement productTextThree;
	
	@FindBy(xpath = "//a[@href='/en-ca/products/sensodyne-rapid-relief-whitening/']//img[@alt='Sensodyne Rapid Relief Whitening Toothpaste']")
	private static WebElement productImgThree;
	
	@FindBy(xpath = "//div[@class='box component section prod-2 product-box odd col-xs-12 col-sm-6 col-md-3']//ancestor::span[text()='Buy Now']//ancestor::a[@href='/en-ca/where-to-buy/']")
	private static WebElement productBuyNowThree;
	
	@FindBy(xpath = "//a[@href='/en-ca/where-to-buy/']//img[@alt='Where to buy Sensodyne Toothpaste near you']")
	private static WebElement findYourStore;
	
	
	
	
	public void clickCookieBtn() throws Exception {
		if (isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if (cookieBtn.isDisplayed()) {
					elementClick(cookieBtn);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			} catch (Exception e) {
			}
		}else {
			System.out.println("Dismiss is not presented");
		}
	}

	public void clickGigyaForm() throws Exception {
		if (isElementPresent(gigyaForm)) {
			elementToBeClickable(gigyaForm);
			try {
				if (gigyaForm.isDisplayed()) {
					elementClick(gigyaForm);
				}
				implicitWait();
				Assert.assertTrue(elementIsDisplayed(gigyaClose));
			} catch (Exception e) {
			}
		} else {
			System.out.println("gigya is not presented");
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
