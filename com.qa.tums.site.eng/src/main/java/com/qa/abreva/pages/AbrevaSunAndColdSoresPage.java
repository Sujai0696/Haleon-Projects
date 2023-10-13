package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaSunAndColdSoresPage extends BaseClass{
	
	public AbrevaSunAndColdSoresPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//a[text()='Managing Your Triggers']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement breadcrumbOne;
    
    @FindBy(xpath = "//a[text()='trigger']//self::a[@href='/about-cold-sores/what-triggers-your-cold-sores/']")
    private static WebElement hyperLinkTrigger;
    
    @FindBy(xpath = "//a[text()='Abreva']//self::a[@href='/cold-sore-products/abreva-cream/']")
    private static WebElement hyperLinkAbreva;
    
    @FindBy(xpath = "//a[text()='vacations']//self::a[@href='/managing-lip-health/cold-sore-triggers/trigger-free-summer-vacation-planning/']")
    private static WebElement hyperLinkVacations;
    
    @FindBy(xpath = "//a[text()='FACE YOUR FINANCES']//self::a[@href='/managing-lip-health/cold-sore-triggers/money-management-tips/']//ancestor::div[@class='image component section article-promo-img clickable-box first odd grid_4 alpha']")
    private static WebElement wholeCardSecOne;
    
    @FindBy(xpath = "//a[text()='COLD SORE CONFIDENCE']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/staying-confident/']//ancestor::div[@class='image component section article-promo-img clickable-box even grid_4']")
    private static WebElement wholeCardSecTwo;
    
    @FindBy(xpath = "//a[text()='LIP CARE VS. LIP HEALTH']//self::a[@href='/managing-lip-health/lip-care/lip-care-vs-lip-health/']//ancestor::div[@class='image component section article-promo-img clickable-box odd last grid_4 omega']")
    private static WebElement wholeCardSecThree;
    
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
    
    public void clickHyperLinkTrigger() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkTrigger)) {
			scrollDownUsingElement(hyperLinkTrigger);
			clickElementUsingJavaScript(hyperLinkTrigger);
			pageLoad();
			System.out.println("HyperLink Trigger clicked successfully");
		} else {
			System.out.println("HyperLink Trigger is not presented in the page");
			throw new Exception("HyperLink Trigger is not presented in the page");
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
    
    public void clickHyperLinkVacations() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkVacations)) {
			scrollDownUsingElement(hyperLinkVacations);
			clickElementUsingJavaScript(hyperLinkVacations);
			pageLoad();
			System.out.println("HyperLink Vacations clicked successfully");
		} else {
			System.out.println("HyperLink Vacations is not presented in the page");
			throw new Exception("HyperLink Vacations is not presented in the page");
		}
	}
    
    public void clickWholeCardSecOne() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(wholeCardSecOne)) {
			scrollDownUsingElement(wholeCardSecOne);
			clickElementUsingJavaScript(wholeCardSecOne);
			pageLoad();
			System.out.println("HyperLink Whole Card Sec One clicked successfully");
		} else {
			System.out.println("HyperLink Whole Card Sec One is not presented in the page");
			throw new Exception("HyperLink Whole Card Sec One is not presented in the page");
		}
	}
    
    public void clickWholeCardSecTwo() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(wholeCardSecTwo)) {
			scrollDownUsingElement(wholeCardSecTwo);
			clickElementUsingJavaScript(wholeCardSecTwo);
			pageLoad();
			System.out.println("HyperLink Whole Card Sec Two clicked successfully");
		} else {
			System.out.println("HyperLink Whole Card Sec Two is not presented in the page");
			throw new Exception("HyperLink Whole Card Sec Two is not presented in the page");
		}
	}
    
    public void clickWholeCardSecThree() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(wholeCardSecThree)) {
			scrollDownUsingElement(wholeCardSecThree);
			clickElementUsingJavaScript(wholeCardSecThree);
			pageLoad();
			System.out.println("HyperLink Whole Card Sec Three clicked successfully");
		} else {
			System.out.println("HyperLink Whole Card Sec Three is not presented in the page");
			throw new Exception("HyperLink Whole Card Sec Three is not presented in the page");
		}
	}
    
    public void clickReadOurLipCareTips() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(readOurLipCareTips)) {
			scrollDownUsingElement(readOurLipCareTips);
			clickElementUsingJavaScript(readOurLipCareTips);
			pageLoad();
			System.out.println("HyperLink Read Our Lip Care Tips clicked successfully");
		} else {
			System.out.println("HyperLink Read Our Lip Care Tips is not presented in the page");
			throw new Exception("HyperLink Read Our Lip Care Tips is not presented in the page");
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
