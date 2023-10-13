package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaColdSoreConfidencePage extends BaseClass{
	
	public AbrevaColdSoreConfidencePage() {
		PageFactory.initElements(driver, this);
	} 
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//a[text()='Dealing with Cold Sores']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/']")
    private static WebElement breadcrumbOne;
    
    @FindBy(xpath = "//a[text()='here']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/how-to-cover-up-cold-sores/']")
    private static WebElement hyperLinkHere;
    
    @FindBy(xpath = "//a[text()='Read More']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/staying-confident/']")
    private static WebElement hyperLinkReadMore;
    
    @FindBy(xpath = "//a[text()='TAKE IT EASY']//self::a[@href='/managing-lip-health/cold-sore-triggers/relaxation-techniques/']//ancestor::div[@class='image component section article-promo-img clickable-box first odd grid_4']")
    private static WebElement wholeCardSecOne;
    
    @FindBy(xpath = "//a[text()='HELP STOP THE SPREAD']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/spreading-cold-sores/']//ancestor::div[@class='image component section article-promo-img clickable-box even grid_4']")
    private static WebElement wholeCardSecTwo;
    
    @FindBy(xpath = "//a[text()='KNOCK OUT YOUR CHAPPED LIPS']//self::a[@href='/managing-lip-health/lip-care/hydrate-chapped-lips/']//ancestor::div[@class='image component section article-promo-img clickable-box odd last grid_4 omega']")
    private static WebElement wholeCardSecThree;
    
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
    
    public void clickHyperLinkHere() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkHere)) {
			scrollDownUsingElement(hyperLinkHere);
			clickElementUsingJavaScript(hyperLinkHere);
			pageLoad();
			System.out.println("HyperLink here clicked successfully");
		} else {
			System.out.println("HyperLink here is not presented in the page");
			throw new Exception("HyperLink here is not presented in the page");
		}
	}
    
    public void clickHyperLinkReadMore() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkReadMore)) {
			scrollDownUsingElement(hyperLinkReadMore);
			clickElementUsingJavaScript(hyperLinkReadMore);
			pageLoad();
			System.out.println("HyperLink Read More clicked successfully");
		} else {
			System.out.println("HyperLink Read More is not presented in the page");
			throw new Exception("HyperLink Read More is not presented in the page");
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
