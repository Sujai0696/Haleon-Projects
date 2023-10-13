package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaHowToHealColdSoreScabPage extends BaseClass{
	
	public AbrevaHowToHealColdSoreScabPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//u[text()='Dealing with Cold Sores']//ancestor::a[@href='/managing-lip-health/dealing-with-cold-sores/']")
    private static WebElement breadcrumbOne;
    
    @FindBy(xpath = "//a[text()='cold sore outbreak']//self::a[@href='/about-cold-sores/what-are-cold-sores/']")
    private static WebElement hyperLinkColdSoreOutbreak;
    
    @FindBy(xpath = "//a[text()='spreading the cold sore virus']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/spreading-cold-sores/']")
    private static WebElement hyperLinkSpreadingTheColdSoreVirus;
    
    @FindBy(xpath = "//a[text()='dealing with cold sores']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/']")
    private static WebElement hyperLinkDealingWithColdSores;
    
    @FindBy(xpath = "//a[text()='managing your lip health']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement hyperLinkManagingYourLipHealth;
    
    @FindBy(xpath = "//a[text()='common cold sore questions']//self::a[@href='/faq/abreva-basics/']")
    private static WebElement hyperLinkCommonColdSoreQuestions;
    
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
    
    public void clickHyperLinkColdSoreOutbreak() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkColdSoreOutbreak)) {
			scrollDownUsingElement(hyperLinkColdSoreOutbreak);
			clickElementUsingJavaScript(hyperLinkColdSoreOutbreak);
			pageLoad();
			System.out.println("HyperLink Cold Sore Out break clicked successfully");
		} else {
			System.out.println("HyperLink Cold Sore Out break is not presented in the page");
			throw new Exception("HyperLink Cold Sore Out break is not presented in the page");
		}
	}
    
    public void clickHyperLinkSpreadingTheColdSoreVirus() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkSpreadingTheColdSoreVirus)) {
			scrollDownUsingElement(hyperLinkSpreadingTheColdSoreVirus);
			clickElementUsingJavaScript(hyperLinkSpreadingTheColdSoreVirus);
			pageLoad();
			System.out.println("HyperLink Spreading The Cold Sore Virus clicked successfully");
		} else {
			System.out.println("HyperLink Spreading The Cold Sore Virus is not presented in the page");
			throw new Exception("HyperLink Spreading The Cold Sore Virus is not presented in the page");
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
    
    public void clickHyperLinkManagingYourLipHealth() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkManagingYourLipHealth)) {
			scrollDownUsingElement(hyperLinkManagingYourLipHealth);
			clickElementUsingJavaScript(hyperLinkManagingYourLipHealth);
			pageLoad();
			System.out.println("HyperLink Managing Your Lip Health clicked successfully");
		} else {
			System.out.println("HyperLink Managing Your Lip Health is not presented in the page");
			throw new Exception("HyperLink Managing Your Lip Health is not presented in the page");
		}
	}
    
    public void clickHyperLinkCommonColdSoreQuestions() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkCommonColdSoreQuestions)) {
			scrollDownUsingElement(hyperLinkCommonColdSoreQuestions);
			clickElementUsingJavaScript(hyperLinkCommonColdSoreQuestions);
			pageLoad();
			System.out.println("HyperLink Common Cold Sore Questions clicked successfully");
		} else {
			System.out.println("HyperLink Common Cold Sore Questions is not presented in the page");
			throw new Exception("HyperLink Common Cold Sore Questions is not presented in the page");
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
