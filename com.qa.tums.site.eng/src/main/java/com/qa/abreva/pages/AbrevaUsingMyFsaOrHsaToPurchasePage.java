package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class AbrevaUsingMyFsaOrHsaToPurchasePage extends BaseClass{
	
	public AbrevaUsingMyFsaOrHsaToPurchasePage() {
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//a[text()='Abreva']//self::a[@href='https://www.abreva.com/cold-sore-products/abreva-cream/']")
    private static WebElement hyperLinkAbrevaProducts;
    
    @FindBy(xpath = "//a[text()='FAQ page']//self::a[@href='https://www.abreva.com/faq/abreva-basics/']")
    private static WebElement hyperLinkFaqPage;
    
    @FindBy(xpath = "//a[text()='GET COUPON']//self::a[@href='/coupon/']")
    private static WebElement getcoupon;
    
    @FindBy(xpath = "//div[@class='parametrizedhtml component section default-style reference-abreva-price-spider-button fixedcomponent6 fixed-component image']//ancestor::span[text()='BUY NOW']")
    private static WebElement buyNow;
    
    @FindBy(xpath = "//h2[@class='ps-product-name']//self::h2[text()='Oral Care Pump']")
    private static WebElement buyNowText;
    
    @FindBy(xpath = "//span[@class='ps-lightbox-close']")
    private static WebElement buyNowClose;
    
    @FindBy(xpath = "//span[text()='BUY NOW']//ancestor::a[@tabindex='0']//self::a[@aria-hidden='false']")
    private static WebElement buyNowCloseVerify;
    
    
    
    
    
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
    
    
    public void clickHyperLinkAbrevaProducts() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkAbrevaProducts)) {
			scrollDownUsingElement(hyperLinkAbrevaProducts);
			clickElementUsingJavaScript(hyperLinkAbrevaProducts);
			pageLoad();
			System.out.println("HyperLink Abreva Products clicked successfully");
		} else {
			System.out.println("HyperLink Abreva Products is not presented in the page");
			throw new Exception("HyperLink Abreva Products is not presented in the page");
		}
	}
    
    public void clickHyperLinkFaqPage() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkFaqPage)) {
			scrollDownUsingElement(hyperLinkFaqPage);
			clickElementUsingJavaScript(hyperLinkFaqPage);
			pageLoad();
			System.out.println("HyperLink hyper Link Faq Page clicked successfully");
		} else {
			System.out.println("HyperLink hyper Link Faq Page is not presented in the page");
			throw new Exception("HyperLink hyper Link Faq Page is not presented in the page");
		}
	}
    
    public void clickGetcoupon() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(getcoupon)) {
			scrollDownUsingElement(getcoupon);
			clickElementUsingJavaScript(getcoupon);
			pageLoad();
			System.out.println("HyperLink Get coupon clicked successfully");
		} else {
			System.out.println("HyperLink Get coupon is not presented in the page");
			throw new Exception("HyperLink Get coupon is not presented in the page");
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
    		System.out.println("Buy Now button successfully verified");
		} else {
			System.out.println("Buy Now Button is not Presented in the page");
			throw new Exception("Buy Now Button is not Presented in the page");
		}
	}

}
