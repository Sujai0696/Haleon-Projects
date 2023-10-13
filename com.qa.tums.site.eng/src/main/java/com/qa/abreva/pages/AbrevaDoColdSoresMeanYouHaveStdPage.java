package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaDoColdSoresMeanYouHaveStdPage extends BaseClass{
	
	public AbrevaDoColdSoresMeanYouHaveStdPage() {
		PageFactory.initElements(driver, this);
	} 
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//a[text()='Managing Your Triggers']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement breadcrumbOne;
    
    @FindBy(xpath = "//a[text()='HSV-1 virus']//self::a[@href='https://www.abreva.com/amp/how-common-herpes-simplex-1.html']")
    private static WebElement hyperLinkHsvVirus;
    
    @FindBy(xpath = "//a[text()='fever blisters']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/fever-blister-vs-cold-sore/']")
    private static WebElement hyperLinkFeverBlisters;
    
    @FindBy(xpath = "//a[text()='managing lip health']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement hyperLinkManagingLipHealth;
    
    @FindBy(xpath = "//a[text()='stress and cold sores']//self::a[@href='/managing-lip-health/cold-sores-and-stress/']")
    private static WebElement hyperLinkStressAndColdSores;
    
    @FindBy(xpath = "//a[text()='Abreva products']//self::a[@href='/cold-sore-products/abreva-cream/']")
    private static WebElement hyperLinkAbrevaProducts;
    
    
    @FindBy(xpath = "//span[text()='READ OUR LIP CARE TIPS']//ancestor::a[@href='/managing-lip-health/lip-care/']")
    private static WebElement readOurLipCareTips;
    
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
    
    public void clickHyperLinkHsvVirus() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkHsvVirus)) {
			scrollDownUsingElement(hyperLinkHsvVirus);
			clickElementUsingJavaScript(hyperLinkHsvVirus);
			pageLoad();
			System.out.println("HyperLink Hsv Virus clicked successfully");
		} else {
			System.out.println("HyperLink Hsv Virus is not presented in the page");
			throw new Exception("HyperLink Hsv Virus is not presented in the page");
		}
	}
    
    public void clickHyperLinkFeverBlisters() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkFeverBlisters)) {
			scrollDownUsingElement(hyperLinkFeverBlisters);
			clickElementUsingJavaScript(hyperLinkFeverBlisters);
			pageLoad();
			System.out.println("HyperLink Fever Blisters clicked successfully");
		} else {
			System.out.println("HyperLink Fever Blisters is not presented in the page");
			throw new Exception("HyperLink Fever Blisters is not presented in the page");
		}
	}
    
    public void clickHyperLinkManagingLipHealth() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkManagingLipHealth)) {
			scrollDownUsingElement(hyperLinkManagingLipHealth);
			clickElementUsingJavaScript(hyperLinkManagingLipHealth);
			pageLoad();
			System.out.println("HyperLink Managing Lip Health clicked successfully");
		} else {
			System.out.println("HyperLink Managing Lip Health is not presented in the page");
			throw new Exception("HyperLink Managing Lip Health is not presented in the page");
		}
	}
    
    public void clickHyperLinkStressAndColdSores() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkStressAndColdSores)) {
			scrollDownUsingElement(hyperLinkStressAndColdSores);
			clickElementUsingJavaScript(hyperLinkStressAndColdSores);
			pageLoad();
			System.out.println("HyperLink Stress And Cold Sores clicked successfully");
		} else {
			System.out.println("HyperLink Stress And Cold Sores is not presented in the page");
			throw new Exception("HyperLink Stress And Cold Sores is not presented in the page");
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
    
    public void clickReadOurLipCareTips() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(readOurLipCareTips)) {
			scrollDownUsingElement(readOurLipCareTips);
			clickElementUsingJavaScript(readOurLipCareTips);
			pageLoad();
			System.out.println("HyperLink readOurLipCareTips clicked successfully");
		} else {
			System.out.println("HyperLink readOurLipCareTips is not presented in the page");
			throw new Exception("HyperLink readOurLipCareTips is not presented in the page");
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
