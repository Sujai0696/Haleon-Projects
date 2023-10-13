package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaNoseColdSoresPage extends BaseClass{
	
	public AbrevaNoseColdSoresPage() {
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//u[text()='Dealing with Cold Sores']//ancestor::a[@href='/managing-lip-health/dealing-with-cold-sores/']")
    private static WebElement breadcrumbOne;
    
    @FindBy(xpath = "//a[text()='Abreva Cream']//self::a[@href='/cold-sore-products/abreva-cream/']")
    private static WebElement hyperLinkAbrevaCream;
    
    @FindBy(xpath = "//a[text()='what cold sores are']//self::a[@href='/about-cold-sores/what-are-cold-sores/']")
    private static WebElement hyperLinkWhatColdSoresAre;
    
    @FindBy(xpath = "//a[text()='how to keep yourself healthy']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement hyperLinkHowToKeepYourSelfHealthy;
    
    @FindBy(xpath = "//a[text()='how to deal with cold sores']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/']")
    private static WebElement hyperLinkHowToDealWithColdSores;
    
    
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
	
    
    public void clickHyperLinkAbrevaCream() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkAbrevaCream)) {
			scrollDownUsingElement(hyperLinkAbrevaCream);
			clickElementUsingJavaScript(hyperLinkAbrevaCream);
			pageLoad();
			System.out.println("HyperLink Abreva Cream clicked successfully");
		} else {
			System.out.println("HyperLink Abreva Cream is not presented in the page");
			throw new Exception("HyperLink Abreva Cream is not presented in the page");
		}
	}
    
    public void clickHyperLinkWhatColdSoresAre() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkWhatColdSoresAre)) {
			scrollDownUsingElement(hyperLinkWhatColdSoresAre);
			clickElementUsingJavaScript(hyperLinkWhatColdSoresAre);
			pageLoad();
			System.out.println("HyperLink What Cold Sores Are clicked successfully");
		} else {
			System.out.println("HyperLink What Cold Sores Are is not presented in the page");
			throw new Exception("HyperLink What Cold Sores Are is not presented in the page");
		}
	}
    
    public void clickHyperLinkHowToKeepYourSelfHealthy() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkHowToKeepYourSelfHealthy)) {
			scrollDownUsingElement(hyperLinkHowToKeepYourSelfHealthy);
			clickElementUsingJavaScript(hyperLinkHowToKeepYourSelfHealthy);
			pageLoad();
			System.out.println("HyperLink How To Keep Your Self Healthy clicked successfully");
		} else {
			System.out.println("HyperLink How To Keep Your Self Healthy is not presented in the page");
			throw new Exception("HyperLink How To Keep Your Self Healthy is not presented in the page");
		}
	}
    
    public void clickHyperLinkHowToDealWithColdSores() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkHowToDealWithColdSores)) {
			scrollDownUsingElement(hyperLinkHowToDealWithColdSores);
			clickElementUsingJavaScript(hyperLinkHowToDealWithColdSores);
			pageLoad();
			System.out.println("HyperLink How To Deal With Cold Sores clicked successfully");
		} else {
			System.out.println("HyperLink How To Deal With Cold Sores is not presented in the page");
			throw new Exception("HyperLink How To Deal With Cold Sores is not presented in the page");
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
