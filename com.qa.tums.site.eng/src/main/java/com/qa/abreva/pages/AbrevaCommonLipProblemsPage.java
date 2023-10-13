package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaCommonLipProblemsPage extends BaseClass{
	
	public AbrevaCommonLipProblemsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//a[text()='Managing Your Triggers']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement breadcrumbOne;
    
    @FindBy(xpath = "//a[text()='cold sores']//self::a[@href='/about-cold-sores/what-are-cold-sores/']")
    private static WebElement hyperLinkColdSores;
    
    @FindBy(xpath = "//a[text()='fever blisters']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/fever-blister-vs-cold-sore/']")
    private static WebElement hyperLinkFeverBlisters;
    
    @FindBy(xpath = "//a[text()='cold sores can spread']//self::a[@href='/about-cold-sores/spreading-cold-sores/']")
    private static WebElement hyperLinkColdSoresCanSpread;
    
    @FindBy(xpath = "//a[text()='person-to-person contact like kissing']//self::a[@href='https://www.abreva.com/amp/what-causes-cold-sores-from-kissing.html']")
    private static WebElement hyperLinkPersonToPersonContactLikeKissing;
    
    @FindBy(xpath = "//a[text()='Abreva cold sore cream']//self::a[@href='/cold-sore-products/abreva-cream/']")
    private static WebElement hyperLinkAbrevaColdSoreCream;
    
    @FindBy(xpath = "//a[text()='dry lips']//self::a[@href='/about-cold-sores/how-to-take-care-dry-lips-in-winter/']")
    private static WebElement hyperLinkDryLips;
    
    @FindBy(xpath = "//a[text()='avoiding exposing your lips to the sun']//self::a[@href='/managing-lip-health/cold-sore-triggers/sun-and-cold-sores/']")
    private static WebElement hyperLinkAvoidingExposingYourLipsToTheSun;
    
    @FindBy(xpath = "//a[text()='winter months']//self::a[@href='/managing-lip-health/cold-sore-triggers/cold-weather/']")
    private static WebElement hyperLinkWinterMonths;
    
    @FindBy(xpath = "//a[text()='articles on managing lip health from Abreva']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement hyperLinkArticlesOnManagingLipHealthFromAbreva;
    
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
    
    public void clickHyperLinkColdSoresCanSpread() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkColdSoresCanSpread)) {
			scrollDownUsingElement(hyperLinkColdSoresCanSpread);
			clickElementUsingJavaScript(hyperLinkColdSoresCanSpread);
			pageLoad();
			System.out.println("HyperLink Cold Sores Can Spread clicked successfully");
		} else {
			System.out.println("HyperLink Cold Sores Can Spread is not presented in the page");
			throw new Exception("HyperLink Cold Sores Can Spread is not presented in the page");
		}
	}
    
    public void clickHyperLinkPersonToPersonContactLikeKissing() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkPersonToPersonContactLikeKissing)) {
			scrollDownUsingElement(hyperLinkPersonToPersonContactLikeKissing);
			clickElementUsingJavaScript(hyperLinkPersonToPersonContactLikeKissing);
			pageLoad();
			System.out.println("HyperLink Person To Person Contact Like Kissing clicked successfully");
		} else {
			System.out.println("HyperLink Person To Person Contact Like Kissing is not presented in the page");
			throw new Exception("HyperLink Person To Person Contact Like Kissing is not presented in the page");
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
    
    public void clickHyperLinkDryLips() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkDryLips)) {
			scrollDownUsingElement(hyperLinkDryLips);
			clickElementUsingJavaScript(hyperLinkDryLips);
			pageLoad();
			System.out.println("HyperLink Dry Lips clicked successfully");
		} else {
			System.out.println("HyperLink Dry Lips is not presented in the page");
			throw new Exception("HyperLink Dry Lips is not presented in the page");
		}
	}
    
    public void clickHyperLinkAvoidingExposingYourLipsToTheSun() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkAvoidingExposingYourLipsToTheSun)) {
			scrollDownUsingElement(hyperLinkAvoidingExposingYourLipsToTheSun);
			clickElementUsingJavaScript(hyperLinkAvoidingExposingYourLipsToTheSun);
			pageLoad();
			System.out.println("HyperLink Avoiding Exposing Your Lips To The Sun clicked successfully");
		} else {
			System.out.println("HyperLink Avoiding Exposing Your Lips To The Sun is not presented in the page");
			throw new Exception("HyperLink Avoiding Exposing Your Lips To The Sun is not presented in the page");
		}
	}
    
    public void clickHyperLinkWinterMonths() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkWinterMonths)) {
			scrollDownUsingElement(hyperLinkWinterMonths);
			clickElementUsingJavaScript(hyperLinkWinterMonths);
			pageLoad();
			System.out.println("HyperLink Winter Months clicked successfully");
		} else {
			System.out.println("HyperLink Winter Months is not presented in the page");
			throw new Exception("HyperLink Winter Months is not presented in the page");
		}
	}
    
    public void clickHyperLinkArticlesOnManagingLipHealthFromAbreva() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkArticlesOnManagingLipHealthFromAbreva)) {
			scrollDownUsingElement(hyperLinkArticlesOnManagingLipHealthFromAbreva);
			clickElementUsingJavaScript(hyperLinkArticlesOnManagingLipHealthFromAbreva);
			pageLoad();
			System.out.println("HyperLink Articles On Managing Lip Health From Abreva clicked successfully");
		} else {
			System.out.println("HyperLink Articles On Managing Lip Health From Abreva is not presented in the page");
			throw new Exception("HyperLink Articles On Managing Lip Health From Abreva is not presented in the page");
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
