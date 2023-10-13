package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaToothpasteOnColdSoresPage extends BaseClass{
	
	
	public AbrevaToothpasteOnColdSoresPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//u[text()='Dealing with Cold Sores']//ancestor::a[@href='/managing-lip-health/dealing-with-cold-sores/']")
    private static WebElement breadcrumbOne;
    
    @FindBy(xpath = "//a[text()='tingling or burning sensations']//self::a[@href='/tingle-alert/']")
    private static WebElement hyperLinkTinglingOrBurningSensations;
    
    @FindBy(xpath = "//a[text()='Abreva cream']//self::a[@href='/cold-sore-products/abreva-cream/']")
    private static WebElement hyperLinkAbrevaCream;
    
    @FindBy(xpath = "//a[text()='Abreva site']//self::a[@href='/faq/abreva-basics/']")
    private static WebElement hyperLinkAbrevaSite;
    
    @FindBy(xpath = "//span[text()='GET COUPON']//ancestor::a[@href='/coupon/']")
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
	
    
    public void clickHyperLinkTinglingOrBurningSensations() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkTinglingOrBurningSensations)) {
			scrollDownUsingElement(hyperLinkTinglingOrBurningSensations);
			clickElementUsingJavaScript(hyperLinkTinglingOrBurningSensations);
			pageLoad();
			System.out.println("HyperLink Tingling Or Burning Sensations clicked successfully");
		} else {
			System.out.println("HyperLink Tingling Or Burning Sensations is not presented in the page");
			throw new Exception("HyperLink Tingling Or Burning Sensations is not presented in the page");
		}
	}
    
    public void clickHyperLinkAbrevaCream() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkAbrevaCream)) {
			scrollDownUsingElement(hyperLinkAbrevaCream);
			clickElementUsingJavaScript(hyperLinkAbrevaCream);
			pageLoad();
			System.out.println("HyperLink Abreva Cream  clicked successfully");
		} else {
			System.out.println("HyperLink Abreva Cream  is not presented in the page");
			throw new Exception("HyperLink Abreva Cream  is not presented in the page");
		}
	}
    
    public void clickHyperLinkAbrevaSite() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkAbrevaSite)) {
			scrollDownUsingElement(hyperLinkAbrevaSite);
			clickElementUsingJavaScript(hyperLinkAbrevaSite);
			pageLoad();
			System.out.println("HyperLink Abreva Site One clicked successfully");
		} else {
			System.out.println("HyperLink Abreva Site One is not presented in the page");
			throw new Exception("HyperLink Abreva Site One is not presented in the page");
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
