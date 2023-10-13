package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaLipFillersAndColdSoresPage extends BaseClass{
	
	public AbrevaLipFillersAndColdSoresPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//a[text()='Managing Your Triggers']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement breadcrumbOne;
    
    @FindBy(xpath = "//a[text()='common cold sore triggers']//self::a[@href='/about-cold-sores/what-triggers-your-cold-sores/']")
    private static WebElement hyperLinkCommonColdSoreTriggers;
    
    @FindBy(xpath = "//a[text()='fatigue']//self::a[@href='/managing-lip-health/cold-sore-triggers/sleep/']")
    private static WebElement hyperLinkFatigue;
    
    @FindBy(xpath = "//a[text()='sun']//self::a[@href='/managing-lip-health/cold-sore-triggers/sun-and-cold-sores/']")
    private static WebElement hyperLinkSun;
    
    @FindBy(xpath = "//a[text()='Abreva']//self::a[@href='/cold-sore-products/abreva-cream/']")
    private static WebElement hyperLinkAbreva;
    
    @FindBy(xpath = "//a[text()='dealing with cold sores']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/']")
    private static WebElement hyperLinkDealingWithColdSores;
    
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
	
    
    public void clickHyperLinkCommonColdSoreTriggers() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkCommonColdSoreTriggers)) {
			scrollDownUsingElement(hyperLinkCommonColdSoreTriggers);
			clickElementUsingJavaScript(hyperLinkCommonColdSoreTriggers);
			pageLoad();
			System.out.println("HyperLink Common Cold Sore Triggers clicked successfully");
		} else {
			System.out.println("HyperLink Common Cold Sore Triggers is not presented in the page");
			throw new Exception("HyperLink Common Cold Sore Triggers is not presented in the page");
		}
	}
    
    public void clickHyperLinkFatigue() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkFatigue)) {
			scrollDownUsingElement(hyperLinkFatigue);
			clickElementUsingJavaScript(hyperLinkFatigue);
			pageLoad();
			System.out.println("HyperLink Fatigue clicked successfully");
		} else {
			System.out.println("HyperLink Fatigue is not presented in the page");
			throw new Exception("HyperLink Fatigue is not presented in the page");
		}
	}
    
    public void clickHyperLinkSun() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkSun)) {
			scrollDownUsingElement(hyperLinkSun);
			clickElementUsingJavaScript(hyperLinkSun);
			pageLoad();
			System.out.println("HyperLink Sun clicked successfully");
		} else {
			System.out.println("HyperLink Sun is not presented in the page");
			throw new Exception("HyperLink Sun is not presented in the page");
		}
	}
    
    public void clickHyperLinkAbreva() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkAbreva)) {
			scrollDownUsingElement(hyperLinkAbreva);
			clickElementUsingJavaScript(hyperLinkAbreva);
			pageLoad();
			System.out.println("HyperLink Abreva clicked successfully");
		} else {
			System.out.println("HyperLink Abreva is not presented in the page");
			throw new Exception("HyperLink Abreva is not presented in the page");
		}
	}
    
    public void clickHyperLinkDealingWithColdSores() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkDealingWithColdSores)) {
			scrollDownUsingElement(hyperLinkDealingWithColdSores);
			clickElementUsingJavaScript(hyperLinkDealingWithColdSores);
			pageLoad();
			System.out.println("HyperLink Dealing With Cold Sores clicked successfully");
		} else {
			System.out.println("HyperLink Dealing With Cold Sores is not presented in the page");
			throw new Exception("HyperLink Dealing With Cold Sores is not presented in the page");
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
