package com.qa.abreva.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaUnderstandingColdSoresPage extends BaseClass{
	
	public AbrevaUnderstandingColdSoresPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	@FindBy(xpath = "//a[text()='cause of cold sores']//self::a[@href='/about-cold-sores/what-are-cold-sores/']")
	private static WebElement hyperLinkCausesOfColdSores;
	
	@FindBy(xpath = "//a[text()='Cold sore triggers']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
	private static WebElement hyperLinkColdSoreTriggers;
	
	@FindBy(xpath = "//p[contains(text(),'curable, treatment can significantly shorten the')]//a[@aria-label='ABREVA PRODUCTS-Abreva® Cream'][normalize-space()='Abreva® Cream']")
	private static WebElement hyperLinkAbrevaCreamOne;
	
	@FindBy(xpath = "//a[text()='tingling, itching, or burning sensation']//self::a[@href='/cold-sore-first-signs/']")
	private static WebElement hyperLinkTinglingItching;
	
	@FindBy(xpath = "//p[contains(text(),'There’s no scientific evidence that natural remedi')]//a[@aria-label='ABREVA PRODUCTS-Abreva® Cream'][normalize-space()='Abreva® Cream']")
	private static WebElement hyperLinkAbrevaCreamTwo;
	
	@FindBy(xpath = "//a[text()='most common triggers']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
	private static WebElement hyperLinkMostCommonTriggers;
	
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
    
    public void clickHyperLinkCausesOfColdSores() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkCausesOfColdSores)) {
			scrollDownUsingElement(hyperLinkCausesOfColdSores);
			clickElementUsingJavaScript(hyperLinkCausesOfColdSores);
			pageLoad();
			System.out.println("HyperLink Causes Of Cold Sores clicked successfully");
		} else {
			System.out.println("HyperLink Causes Of Cold Sores is not presented in the page");
			throw new Exception("HyperLink Causes Of Cold Sores is not presented in the page");
		}
	}
    
    public void clickHyperLinkColdSoreTriggers() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkColdSoreTriggers)) {
			scrollDownUsingElement(hyperLinkColdSoreTriggers);
			clickElementUsingJavaScript(hyperLinkColdSoreTriggers);
			pageLoad();
			System.out.println("HyperLink Cold Sore Triggers clicked successfully");
		} else {
			System.out.println("HyperLink Cold Sore Triggers is not presented in the page");
			throw new Exception("HyperLink Cold Sore Triggers is not presented in the page");
		}
	}
    
    public void clickHyperLinkAbrevaCreamOne() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkAbrevaCreamOne)) {
			scrollDownUsingElement(hyperLinkAbrevaCreamOne);
			clickElementUsingJavaScript(hyperLinkAbrevaCreamOne);
			pageLoad();
			System.out.println("HyperLink Abreva Cream One clicked successfully");
		} else {
			System.out.println("HyperLink Abreva Cream One is not presented in the page");
			throw new Exception("HyperLink Abreva Cream One is not presented in the page");
		}
	}
    
    public void clickHyperLinkTinglingItching() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkTinglingItching)) {
			scrollDownUsingElement(hyperLinkTinglingItching);
			clickElementUsingJavaScript(hyperLinkTinglingItching);
			pageLoad();
			System.out.println("HyperLink Tingling Itching clicked successfully");
		} else {
			System.out.println("HyperLink Tingling Itching is not presented in the page");
			throw new Exception("HyperLink Tingling Itching is not presented in the page");
		}
	}
    
    public void clickHyperLinkAbrevaCreamTwo() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkAbrevaCreamTwo)) {
			scrollDownUsingElement(hyperLinkAbrevaCreamTwo);
			clickElementUsingJavaScript(hyperLinkAbrevaCreamTwo);
			pageLoad();
			System.out.println("HyperLink Abreva Cream Two clicked successfully");
		} else {
			System.out.println("HyperLink Abreva Cream Two is not presented in the page");
			throw new Exception("HyperLink Abreva Cream Two is not presented in the page");
		}
	}
    
    public void clickHyperLinkMostCommonTriggers() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkMostCommonTriggers)) {
			scrollDownUsingElement(hyperLinkMostCommonTriggers);
			clickElementUsingJavaScript(hyperLinkMostCommonTriggers);
			pageLoad();
			System.out.println("HyperLink Most Common Triggers clicked successfully");
		} else {
			System.out.println("HyperLink Most Common Triggers is not presented in the page");
			throw new Exception("HyperLink Most Common Triggers is not presented in the page");
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
