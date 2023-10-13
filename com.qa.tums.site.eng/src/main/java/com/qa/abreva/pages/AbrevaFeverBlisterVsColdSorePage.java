package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaFeverBlisterVsColdSorePage extends BaseClass{
	
	public AbrevaFeverBlisterVsColdSorePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//a[text()='Dealing with Cold Sores']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/']")
    private static WebElement breadcrumbOne;
    
    @FindBy(xpath = "//a[text()='cold sore.']//self::a[@href='/about-cold-sores/what-are-cold-sores/']")
    private static WebElement hyperLinkColdSore;
    
    @FindBy(xpath = "//a[text()='lip care tips']//self::a[@href='/managing-lip-health/lip-care/']")
    private static WebElement hyperLinkLipCareTips;
    
    @FindBy(xpath = "//a[text()='Fever blisters are highly contagious and can be spread easily']//self::a[@href='/about-cold-sores/spreading-cold-sores/']")
    private static WebElement hyperLinkFeverBlistersAreHighlyContagious;
    
    @FindBy(xpath = "//a[text()='first experiencing the tingling']//self::a[@href='/cold-sore-first-signs/']")
    private static WebElement hyperLinkFirstExperiencingTheTingling;
    
    @FindBy(xpath = "//p[contains(text(),'To avoid passing the virus to others, you should s')]//a[@aria-label='ABREVA PRODUCTS-Abreva® Cream']")
    private static WebElement hyperLinkAbrevaCreamOne;
    
    @FindBy(xpath = "//p[contains(text(),'A blister or cold sore on your lip may take up to ')]//a[@aria-label='ABREVA PRODUCTS-Abreva® Cream']")
    private static WebElement hyperLinkAbrevaCreamTwo;
    
    @FindBy(xpath = "//a[text()='trigger – such as a cold or flu']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement hyperLinkTriggerSuchAsAColdOrFlu;
    
    @FindBy(xpath = "//a[text()='excessive sunshine']//self::a[@href='/managing-lip-health/cold-sore-triggers/sun-and-cold-sores/']")
    private static WebElement hyperLinkExcessiveSunshine;
    
    @FindBy(xpath = "//a[text()='cold weather']//self::a[@href='/managing-lip-health/cold-sore-triggers/cold-weather/']")
    private static WebElement hyperLinkColdWeather;
    
    @FindBy(xpath = "//a[text()='stress']//self::a[@href='/managing-lip-health/cold-sore-triggers/stress/']")
    private static WebElement hyperLinkStress;
    
    @FindBy(xpath = "//a[text()='getting plenty of rest']//self::a[@href='/managing-lip-health/cold-sore-triggers/sleep/']")
    private static WebElement hyperLinkGettingPlentyOfRest;
    
    @FindBy(xpath = "//a[text()='managing cold sore triggers']//self::a[@href='/managing-lip-health/cold-sore-triggers/']")
    private static WebElement hyperLinkManagingColdSoreTriggers;
    
    @FindBy(xpath = "//a[text()='treat the blister']//self::a[@href='/about-cold-sores/cold-sore-treatments/']")
    private static WebElement hyperLinkTreatTheBlister;
    
    @FindBy(xpath = "//a[text()='treat the blister']//following::a[@href='/cold-sore-products/abreva-cream/']")
    private static WebElement hyperLinkAbrevaCreamThree;
    
    @FindBy(xpath = "//a[text()='THE TRUTH ABOUT COLD SORE REMEDIES']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/truth-about-cold-sore-remedies/']//ancestor::div[@class='parametrizedhtml component section article-promo-img clickable-box first odd grid_4 alpha reference-custom-figure-component image']")
    private static WebElement wholeCardSecOne;
    
    @FindBy(xpath = "//a[text()='HELP STOP THE SPREAD']//self::a[@href='/managing-lip-health/dealing-with-cold-sores/spreading-cold-sores/']//ancestor::div[@class='parametrizedhtml component section article-promo-img clickable-box even grid_4 reference-custom-figure-component image']")
    private static WebElement wholeCardSecTwo;
    
    @FindBy(xpath = "//a[text()='LIP CARE VS. LIP HEALTH']//self::a[@href='/managing-lip-health/lip-care/lip-care-vs-lip-health/']//ancestor::div[@class='parametrizedhtml component section article-promo-img clickable-box odd last grid_4 reference-custom-figure-component image']")
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
    
  //a[text()='']//self::a[@href='']//ancestor::div[@class='']
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
	
    
    public void clickHyperLinkColdSore() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkColdSore)) {
			scrollDownUsingElement(hyperLinkColdSore);
			clickElementUsingJavaScript(hyperLinkColdSore);
			pageLoad();
			System.out.println("HyperLink Cold Sore clicked successfully");
		} else {
			System.out.println("HyperLink Cold Sore is not presented in the page");
			throw new Exception("HyperLink Cold Sore is not presented in the page");
		}
	}
    
    public void clickHyperLinkLipCareTips() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkLipCareTips)) {
			scrollDownUsingElement(hyperLinkLipCareTips);
			clickElementUsingJavaScript(hyperLinkLipCareTips);
			pageLoad();
			System.out.println("HyperLink Lip Care Tips clicked successfully");
		} else {
			System.out.println("HyperLink Lip Care Tips is not presented in the page");
			throw new Exception("HyperLink Lip Care Tips is not presented in the page");
		}
	}
    
    public void clickHyperLinkFeverBlistersAreHighlyContagious() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkFeverBlistersAreHighlyContagious)) {
			scrollDownUsingElement(hyperLinkFeverBlistersAreHighlyContagious);
			clickElementUsingJavaScript(hyperLinkFeverBlistersAreHighlyContagious);
			pageLoad();
			System.out.println("HyperLink Fever Blisters Are Highly Contagious clicked successfully");
		} else {
			System.out.println("HyperLink Fever Blisters Are Highly Contagious is not presented in the page");
			throw new Exception("HyperLink Fever Blisters Are Highly Contagious is not presented in the page");
		}
	}
    
    public void clickHyperLinkFirstExperiencingTheTingling() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkFirstExperiencingTheTingling)) {
			scrollDownUsingElement(hyperLinkFirstExperiencingTheTingling);
			clickElementUsingJavaScript(hyperLinkFirstExperiencingTheTingling);
			pageLoad();
			System.out.println("HyperLink First Experiencing The Tingling clicked successfully");
		} else {
			System.out.println("HyperLink First Experiencing The Tingling is not presented in the page");
			throw new Exception("HyperLink First Experiencing The Tingling is not presented in the page");
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
    
    public void clickHyperLinkTriggerSuchAsAColdOrFlu() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkTriggerSuchAsAColdOrFlu)) {
			scrollDownUsingElement(hyperLinkTriggerSuchAsAColdOrFlu);
			clickElementUsingJavaScript(hyperLinkTriggerSuchAsAColdOrFlu);
			pageLoad();
			System.out.println("HyperLink Trigger Such As A Cold Or Flu clicked successfully");
		} else {
			System.out.println("HyperLink Trigger Such As A Cold Or Flu is not presented in the page");
			throw new Exception("HyperLink Trigger Such As A Cold Or Flu is not presented in the page");
		}
	}
    
    public void clickHyperLinkExcessiveSunshine() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkExcessiveSunshine)) {
			scrollDownUsingElement(hyperLinkExcessiveSunshine);
			clickElementUsingJavaScript(hyperLinkExcessiveSunshine);
			pageLoad();
			System.out.println("HyperLink Excessive Sunshine clicked successfully");
		} else {
			System.out.println("HyperLink Excessive Sunshine is not presented in the page");
			throw new Exception("HyperLink Excessive Sunshine is not presented in the page");
		}
	}
    
    public void clickHyperLinkColdWeather() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkColdWeather)) {
			scrollDownUsingElement(hyperLinkColdWeather);
			clickElementUsingJavaScript(hyperLinkColdWeather);
			pageLoad();
			System.out.println("HyperLink Cold Weather clicked successfully");
		} else {
			System.out.println("HyperLink Cold Weather is not presented in the page");
			throw new Exception("HyperLink Cold Weather is not presented in the page");
		}
	}
    
    public void clickHyperLinkStress() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkStress)) {
			scrollDownUsingElement(hyperLinkStress);
			clickElementUsingJavaScript(hyperLinkStress);
			pageLoad();
			System.out.println("HyperLink Stress clicked successfully");
		} else {
			System.out.println("HyperLink Stress is not presented in the page");
			throw new Exception("HyperLink Stress is not presented in the page");
		}
	}
    
    public void clickHyperLinkGettingPlentyOfRest() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkGettingPlentyOfRest)) {
			scrollDownUsingElement(hyperLinkGettingPlentyOfRest);
			clickElementUsingJavaScript(hyperLinkGettingPlentyOfRest);
			pageLoad();
			System.out.println("HyperLink Getting Plenty Of Rest clicked successfully");
		} else {
			System.out.println("HyperLink Getting Plenty Of Rest is not presented in the page");
			throw new Exception("HyperLink Getting Plenty Of Rest is not presented in the page");
		}
	}
    
    public void clickHyperLinkManagingColdSoreTriggers() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkManagingColdSoreTriggers)) {
			scrollDownUsingElement(hyperLinkManagingColdSoreTriggers);
			clickElementUsingJavaScript(hyperLinkManagingColdSoreTriggers);
			pageLoad();
			System.out.println("HyperLink Managing Cold Sore Triggers clicked successfully");
		} else {
			System.out.println("HyperLink Managing Cold Sore Triggers is not presented in the page");
			throw new Exception("HyperLink Managing Cold Sore Triggers is not presented in the page");
		}
	}
    
    public void clickHyperLinkTreatTheBlister() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkTreatTheBlister)) {
			scrollDownUsingElement(hyperLinkTreatTheBlister);
			clickElementUsingJavaScript(hyperLinkTreatTheBlister);
			pageLoad();
			System.out.println("HyperLink Treat The Blister clicked successfully");
		} else {
			System.out.println("HyperLink Treat The Blister is not presented in the page");
			throw new Exception("HyperLink Treat The Blister is not presented in the page");
		}
	}
    
    public void clickHyperLinkAbrevaCreamThree() throws Exception{
    	waitForPageLoadJava();
    	if (isElementPresent(hyperLinkAbrevaCreamThree)) {
			scrollDownUsingElement(hyperLinkAbrevaCreamThree);
			clickElementUsingJavaScript(hyperLinkAbrevaCreamThree);
			pageLoad();
			System.out.println("HyperLink Abreva Cream Three clicked successfully");
		} else {
			System.out.println("HyperLink Abreva Cream Three is not presented in the page");
			throw new Exception("HyperLink Abreva Cream Three is not presented in the page");
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
