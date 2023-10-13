package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaWhatAntiviralColdSoreMedicationIsRightForMePage extends BaseClass{
	
	
	public AbrevaWhatAntiviralColdSoreMedicationIsRightForMePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//li[@class='odd first has-active-child navigation-item navigation-level1 page-cold-sore-triggers']//a[text()='MANAGING LIP HEALTH ']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement bannerLinkOne;
    
    
    
    
    
    @FindBy(xpath = "//a[text()='DEALING WITH COLD SORES ']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/']")
    private static WebElement bannerLinkTwo;
    
    @FindBy(xpath = "//a[text()='LIP CARE ']//self::a[@href='/managing-lip-health/lip-care/']")
    private static WebElement bannerLinkThree;
    
    @FindBy(xpath = "//a[text()='STRESS AND COLD SORES ']//self::a[@href='/managing-lip-health/cold-sores-and-stress/']")
    private static WebElement bannerLinkFour;
    
    @FindBy(xpath = "//a[text()='LIP PROBLEMS ']//self::a[@href='/managing-lip-health/common-lip-problems/']")
    private static WebElement bannerLinkFive;
    
    @FindBy(xpath = "//a[text()='CAN YOU PUT ALOE VERA ON COLD SORES? ']//self::a[@href='/managing-lip-health/can-you-put-aloe-vera-on-cold-sores/']")
    private static WebElement bannerLinkSix;
    
    @FindBy(xpath = "//a[text()='RECURRING COLD SORES ']//self::a[@href='/managing-lip-health/why-do-i-keep-getting-cold-sores/']")
    private static WebElement bannerLinkSeven;
    
    @FindBy(xpath = "//a[text()='Managing Your Triggers']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement breadcrumbOne;
    
    @FindBy(xpath = "//a[text()='Abreva']//self::a[@href='/cold-sore-products/abreva-cream/']")
    private static WebElement hyperLinkAbreva;
    
    @FindBy(xpath = "//a[text()='cold sore medications']//self::a[@href='/about-cold-sores/types-of-cold-sore-medicine/']")
    private static WebElement hyperLinkColdSoreMedications;
    
    @FindBy(xpath = "//a[text()='heal on their own']//self::a[@href='/about-cold-sores/cold-sore-stages/']")
    private static WebElement hyperLinkHealOnTheirOwn;
    
    @FindBy(xpath = "//a[text()='consult your doctor']//self::a[@href='https://www.abreva.com/amp/how-to-talk-to-doctor-about-cold-sore.html']")
    private static WebElement hyperLinkConsultYourDoctor;
    
    @FindBy(xpath = "//span[text()='READ OUR LIP CARE TIPS']//ancestor::a[@href='/managing-lip-health/lip-care/']")
    private static WebElement readOurLipCareTips;
    
    @FindBy(xpath = "//div[@class='component-content']//ancestor::span[text()='BUY NOW']")
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
    
    public void clickBannerLinkOne() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(bannerLinkOne)) {
			scrollDownUsingElement(bannerLinkOne);
			boolean elementIsSelected = elementIsSelected(bannerLinkOne);
			Assert.assertTrue(elementIsSelected);
			pageLoad();
			System.out.println("Banner Link One selected successfully");
		} else {
			System.out.println("Banner Link One is not presented in the page");
			throw new Exception("Banner Link One is not presented in the page");
		}
	}
    
    public void clickBannerLinkTwo() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(bannerLinkTwo)) {
			scrollDownUsingElement(bannerLinkTwo);
			clickElementUsingJavaScript(bannerLinkTwo);
			pageLoad();
			System.out.println("Banner Link Two clicked successfully");
		} else {
			System.out.println("Banner Link Two is not presented in the page");
			throw new Exception("Banner Link Two is not presented in the page");
		}
	}
    
    public void clickBannerLinkThree() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(bannerLinkThree)) {
			scrollDownUsingElement(bannerLinkThree);
			clickElementUsingJavaScript(bannerLinkThree);
			pageLoad();
			System.out.println("Banner Link Three clicked successfully");
		} else {
			System.out.println("Banner Link Three is not presented in the page");
			throw new Exception("Banner Link Three is not presented in the page");
		}
	}
    
    public void clickBannerLinkFour() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(bannerLinkFour)) {
			scrollDownUsingElement(bannerLinkFour);
			clickElementUsingJavaScript(bannerLinkFour);
			pageLoad();
			System.out.println("Banner Link Four clicked successfully");
		} else {
			System.out.println("Banner Link Four is not presented in the page");
			throw new Exception("Banner Link Four is not presented in the page");
		}
	}
    
    public void clickBannerLinkFive() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(bannerLinkFive)) {
			scrollDownUsingElement(bannerLinkFive);
			clickElementUsingJavaScript(bannerLinkFive);
			pageLoad();
			System.out.println("Banner Link Five clicked successfully");
		} else {
			System.out.println("Banner Link Five is not presented in the page");
			throw new Exception("Banner Link Five is not presented in the page");
		}
	}
    
    public void clickBannerLinkSix() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(bannerLinkSix)) {
			scrollDownUsingElement(bannerLinkSix);
			clickElementUsingJavaScript(bannerLinkSix);
			pageLoad();
			System.out.println("Banner Link Six clicked successfully");
		} else {
			System.out.println("Banner Link Six is not presented in the page");
			throw new Exception("Banner Link Six is not presented in the page");
		}
	}
    
    public void clickBannerLinkSeven() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(bannerLinkSeven)) {
			scrollDownUsingElement(bannerLinkSeven);
			clickElementUsingJavaScript(bannerLinkSeven);
			pageLoad();
			System.out.println("Banner Link Seven clicked successfully");
		} else {
			System.out.println("Banner Link Seven is not presented in the page");
			throw new Exception("Banner Link Seven is not presented in the page");
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
    
    public void clickHyperLinkColdSoreMedications() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkColdSoreMedications)) {
			scrollDownUsingElement(hyperLinkColdSoreMedications);
			clickElementUsingJavaScript(hyperLinkColdSoreMedications);
			pageLoad();
			System.out.println("HyperLink Cold Sore Medications clicked successfully");
		} else {
			System.out.println("HyperLink Cold Sore Medications is not presented in the page");
			throw new Exception("HyperLink ColdSore Medications is not presented in the page");
		}
	}
    
    public void clickHyperLinkHealOnTheirOwn() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkHealOnTheirOwn)) {
			scrollDownUsingElement(hyperLinkHealOnTheirOwn);
			clickElementUsingJavaScript(hyperLinkHealOnTheirOwn);
			pageLoad();
			System.out.println("HyperLink Heal On Their Own clicked successfully");
		} else {
			System.out.println("HyperLink Heal On Their Own is not presented in the page");
			throw new Exception("HyperLink Heal On Their Own is not presented in the page");
		}
	}
    
    public void clickHyperLinkConsultYourDoctor() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkConsultYourDoctor)) {
			scrollDownUsingElement(hyperLinkConsultYourDoctor);
			clickElementUsingJavaScript(hyperLinkConsultYourDoctor);
			pageLoad();
			System.out.println("HyperLink Consult Your Doctor clicked successfully");
		} else {
			System.out.println("HyperLink Consult Your Doctor is not presented in the page");
			throw new Exception("HyperLink Consult Your Doctor is not presented in the page");
		}
	}
    
    public void clickReadOurLipCareTips() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(readOurLipCareTips)) {
			scrollDownUsingElement(readOurLipCareTips);
			clickElementUsingJavaScript(readOurLipCareTips);
			pageLoad();
			System.out.println("Read Our Lip Care Tips clicked successfully");
		} else {
			System.out.println("Read Our Lip Care Tips is not presented in the page");
			throw new Exception("Read Our Lip Care Tips is not presented in the page");
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
