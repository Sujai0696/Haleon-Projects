package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaCanYouPutAloeVeraOnColdSoresPage extends BaseClass{
	
	public AbrevaCanYouPutAloeVeraOnColdSoresPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//a[text()='helping heal cold sores']//self::a[@href='/about-cold-sores/cold-sore-treatments/']")
    private static WebElement hyperLinkHelpingHealColdSores;
    
    @FindBy(xpath = "//a[text()='cold sores']//self::a[@href='/about-cold-sores/what-are-cold-sores/']")
    private static WebElement hyperLinkColdSores;
    
    @FindBy(xpath = "//a[text()='Abreva cold sore cream']//self::a[@href='/cold-sore-products/abreva-cream/']")
    private static WebElement hyperLinkAbrevaColdSoreCream;
    
    @FindBy(xpath = "//a[text()='how to stay trigger free on summer vacation']//self::a[@href='/managing-lip-health/cold-sore-triggers/trigger-free-summer-vacation-planning/']")
    private static WebElement hyperLinkHowToStayTriggerFree;
    
    @FindBy(xpath = "//a[text()='relaxation techniques to help manage cold sores']//self::a[@href='/managing-lip-health/cold-sore-triggers/relaxation-techniques/']")
    private static WebElement hyperLinkRelaxationTechniques;
    
    @FindBy(xpath = "//a[text()='the connection between hormones and cold sores']//self::a[@href='/managing-lip-health/cold-sore-triggers/pregnancy-and-periods/']")
    private static WebElement hyperLinkTheConnectionBetweenHormones;
    
    @FindBy(xpath = "//a[text()='how to navigate a cold sore breakout with confidence']//self::a[@href='/managing-lip-health/lip-care/how-to-stay-confident-with-cold-sores/']")
    private static WebElement hyperLinkHowToNavigateACold;
    
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
	
    public void clickHyperLinkHelpingHealColdSores() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkHelpingHealColdSores)) {
			scrollDownUsingElement(hyperLinkHelpingHealColdSores);
			clickElementUsingJavaScript(hyperLinkHelpingHealColdSores);
			pageLoad();
			System.out.println("HyperLink Helping Heal Cold Sores clicked successfully");
		} else {
			System.out.println("HyperLink Helping Heal Cold Sores is not presented in the page");
			throw new Exception("HyperLink Helping Heal Cold Sores is not presented in the page");
		}
	}
    
    public void clickHyperLinkColdSores() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkColdSores)) {
			scrollDownUsingElement(hyperLinkColdSores);
			clickElementUsingJavaScript(hyperLinkColdSores);
			pageLoad();
			System.out.println("HyperLink Cold Sores clicked successfully");
		} else {
			System.out.println("HyperLink Cold Sores is not presented in the page");
			throw new Exception("HyperLink Cold Sores is not presented in the page");
		}
	}
    
    public void clickHyperLinkAbrevaColdSoreCream() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkAbrevaColdSoreCream)) {
			scrollDownUsingElement(hyperLinkAbrevaColdSoreCream);
			clickElementUsingJavaScript(hyperLinkAbrevaColdSoreCream);
			pageLoad();
			System.out.println("HyperLink Abreva Cold Sore Cream clicked successfully");
		} else {
			System.out.println("HyperLink Abreva Cold Sore Cream is not presented in the page");
			throw new Exception("HyperLink Abreva Cold Sore Cream is not presented in the page");
		}
	}
    
    public void clickHyperLinkHowToStayTriggerFree() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkHowToStayTriggerFree)) {
			scrollDownUsingElement(hyperLinkHowToStayTriggerFree);
			clickElementUsingJavaScript(hyperLinkHowToStayTriggerFree);
			pageLoad();
			System.out.println("HyperLink How To Stay Trigger Free clicked successfully");
		} else {
			System.out.println("HyperLink How To Stay Trigger Free is not presented in the page");
			throw new Exception("HyperLink How To Stay Trigger Free is not presented in the page");
		}
	}
    
    public void clickHyperLinkRelaxationTechniques() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkRelaxationTechniques)) {
			scrollDownUsingElement(hyperLinkRelaxationTechniques);
			clickElementUsingJavaScript(hyperLinkRelaxationTechniques);
			pageLoad();
			System.out.println("HyperLink Relaxation Techniques clicked successfully");
		} else {
			System.out.println("HyperLink Relaxation Techniques is not presented in the page");
			throw new Exception("HyperLink Relaxation Techniques is not presented in the page");
		}
	}
    
    public void clickHyperLinkTheConnectionBetweenHormones() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkTheConnectionBetweenHormones)) {
			scrollDownUsingElement(hyperLinkTheConnectionBetweenHormones);
			clickElementUsingJavaScript(hyperLinkTheConnectionBetweenHormones);
			pageLoad();
			System.out.println("HyperLink The Connection Between Hormones clicked successfully");
		} else {
			System.out.println("HyperLink The Connection Between Hormones is not presented in the page");
			throw new Exception("HyperLink The Connection Between Hormones is not presented in the page");
		}
	}
    
    public void clickHyperLinkHowToNavigateACold() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkHowToNavigateACold)) {
			scrollDownUsingElement(hyperLinkHowToNavigateACold);
			clickElementUsingJavaScript(hyperLinkHowToNavigateACold);
			pageLoad();
			System.out.println("HyperLink How To Navigate A Cold clicked successfully");
		} else {
			System.out.println("HyperLink How To Navigate A Cold is not presented in the page");
			throw new Exception("HyperLink How To Navigate A Cold is not presented in the page");
		}
	}
    
    public void clickHyperLinkReadOurLipCareTips() throws Exception{
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
