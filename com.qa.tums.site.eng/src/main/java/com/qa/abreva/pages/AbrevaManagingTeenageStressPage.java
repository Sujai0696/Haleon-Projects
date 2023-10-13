package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaManagingTeenageStressPage extends BaseClass{
	
	public AbrevaManagingTeenageStressPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//a[text()='Managing Your Triggers']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement breadcrumbOne;
    
    @FindBy(xpath = "//a[text()='cold sores']//self::a[@href='/managing-lip-health/cold-sores-and-stress/']")
    private static WebElement hyperLinkColdSores;
    
    @FindBy(xpath = "//a[text()='ways to relax']//self::a[@href='/managing-lip-health/cold-sore-triggers/relaxation-techniques/']")
    private static WebElement hyperLinkWaysToRelax;
    
    @FindBy(xpath = "//a[text()='Regular exercise']//self::a[@href='/managing-lip-health/cold-sore-triggers/exercise/']")
    private static WebElement hyperLinkRegularExercise;
    
    @FindBy(xpath = "//a[text()='Abreva’s Cold Sore Cream']//self::a[@href='/cold-sore-products/abreva-cream/']")
    private static WebElement hyperLinkAbrevaColdSoreCream;
    
    @FindBy(xpath = "//a[text()='sleep']//self::a[@href='/managing-lip-health/cold-sore-triggers/sleep/']")
    private static WebElement hyperLinkSleep;
    
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
    
    public void clickHyperLinkWaysToRelax() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkWaysToRelax)) {
			scrollDownUsingElement(hyperLinkWaysToRelax);
			clickElementUsingJavaScript(hyperLinkWaysToRelax);
			pageLoad();
			System.out.println("HyperLink Ways To Relax clicked successfully");
		} else {
			System.out.println("HyperLink Ways To Relax is not presented in the page");
			throw new Exception("HyperLink Ways To Relax is not presented in the page");
		}
	}
    
    public void clickHyperLinkRegularExercise() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkRegularExercise)) {
			scrollDownUsingElement(hyperLinkRegularExercise);
			clickElementUsingJavaScript(hyperLinkRegularExercise);
			pageLoad();
			System.out.println("HyperLink Regular Exercise clicked successfully");
		} else {
			System.out.println("HyperLink Regular Exercise is not presented in the page");
			throw new Exception("HyperLink Regular Exercise is not presented in the page");
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
    
    public void clickHyperLinkSleep() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkSleep)) {
			scrollDownUsingElement(hyperLinkSleep);
			clickElementUsingJavaScript(hyperLinkSleep);
			pageLoad();
			System.out.println("HyperLink Sleep clicked successfully");
		} else {
			System.out.println("HyperLink Sleep is not presented in the page");
			throw new Exception("HyperLink Sleep is not presented in the page");
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
