package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneenamelstrengtheningToothpaste_Pages extends BaseClass{
	
	public SensodyneenamelstrengtheningToothpaste_Pages() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;

    @FindBy(xpath = "(//h2[text()='Sign Up & Save!'])[2]")
    private static WebElement gigyaForm;

    @FindBy(xpath = "//div[contains(@class,'content_hide')]")
    private static WebElement gigyaClose;
    
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even \"]")
	private static WebElement OurproductsBreadcrumbs;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd \"]")
	private static WebElement productsResultBreadcrumbs;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]")
	private static WebElement enamelprotectionBreadcrumbs;
	
	@FindBy(xpath = "//a[text()='multi-benefit toothpastes']")
	private static WebElement MultibenefitToothpaste;
	
	@FindBy(xpath = "//a[text()='fast relief from sensitivity']")
	private static WebElement fastreliefsensitivity;
	
	@FindBy(xpath = "//a[text()='Get Results']")
	private static WebElement GetResults;
	
	@FindBy(xpath = "//strong[text()='Sensitive Care']")
	private static WebElement SensitiveCare;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
	private static WebElement SensitiveCare_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Sensitive Care Toothbrush']")
	private static WebElement SensitiveCare_BuyNowTxt;
	
	@FindBy(xpath = "//span[@class=\"ps-lightbox-close\"]")
	private static WebElement SensitiveCare_BuyNowClose;
	
	@FindBy(xpath = "//strong[text()='Pronamel Gentle Whitening']")
	private static WebElement Pronamelgentlewhitening;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[2]")
	private static WebElement Pronamelgentlewhitening_BuyNow;
	
	@FindBy(xpath = "//h2[text()='True White, Mint 3.0 oz']")
	private static WebElement Pronamelgentlewhitening_BuyNowTxt;
	
	@FindBy(xpath = "//span[@class=\"ps-lightbox-close\"]")
	private static WebElement Pronamelgentlewhitening_BuyNowClose;
	
	@FindBy(xpath = "//strong[text()='Pronamel Multi-Action']")
	private static WebElement Pronamelmultiaction;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[3]")
	private static WebElement Pronamelmultiaction_BuyNow;
	
	@FindBy(xpath = "//strong[text()='Pronamel Fresh Breath']")
	private static WebElement PronamelfreshBreathe;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[4]")
	private static WebElement PronamelfreshBreathe_BuyNow;
	
	@FindBy(xpath = "//strong[text()='Pronamel Daily Protection']")
	private static WebElement Pronameldailyprotection;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[5]")
	private static WebElement Pronameldailyprotection_BuyNow;
	
	@FindBy(xpath = "(//strong[text()='Pronamel Strong and Bright Enamel'])[1]")
	private static WebElement Pronamelstrongbrightenamel;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[6]")
	private static WebElement Pronamelstrongbrightenamel_BuyNow;
	
	@FindBy(xpath = "(//strong[text()='Pronamel Strong and Bright Enamel'])[2]")
	private static WebElement Pronamelstrongbrightenamelnext;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[7]")
	private static WebElement Pronamelstrongbrightenamelnext_BuyNow;
	
	@FindBy(xpath = "(//strong[text()='Pronamel Mineral Boost'])[1]")
	private static WebElement PronamelMineralBoost;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[8]")
	private static WebElement PronamelMineralBoost_BuyNow;
	
	@FindBy(xpath = "(//strong[text()='Pronamel Mineral Boost'])[2]")
	private static WebElement PronamelMineralBoostgentlewhitening;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[9]")
	private static WebElement PronamelMineralBoostgentlewhitening_BuyNow;
	
	@FindBy(xpath = "//a[text()='Get your Coupon']")
	private static WebElement getcoupon;
	
	@FindBy(xpath = "//a[text()='Find your Store']")
	private static WebElement findyourstore;
	
	
	//Methods//
	
	public void clickCookieBtn() throws Exception {
        elementToBeClickable(cookieBtn);
        try {
            if (cookieBtn.isDisplayed()) {
                elementClick(cookieBtn);
            }
            visibilityOf(cookieClose);
            Assert.assertTrue(elementIsDisplayed(cookieClose));
            elementClick(cookieClose);
        } catch (Exception e) {
        }
    }
    public void clickGigyaForm() throws Exception {
        elementToBeClickable(gigyaForm);
        try {
            if (gigyaForm.isDisplayed()) {
                elementClick(gigyaForm);
            }
            visibilityOf(gigyaClose);
            implicitWait();
            Assert.assertTrue(elementIsDisplayed(gigyaClose));
            elementClick(gigyaClose);
        } catch (Exception e) {
       }
    }
    public void clickOnOurProductsBreadCrumbs() throws Exception {
    	moveToElement(OurproductsBreadcrumbs);
		clickElementUsingJavaScript(OurproductsBreadcrumbs);
	}
    public void clickOnProductsResultBreadCrumbs() throws Exception {
    	moveToElement(productsResultBreadcrumbs);
		clickElementUsingJavaScript(productsResultBreadcrumbs);
	}
    public void clickOnEnamelProtectionBreadCrumbs() throws Exception {
    	moveToElement(enamelprotectionBreadcrumbs);
		clickElementUsingJavaScript(enamelprotectionBreadcrumbs);
	}	
    public void clickOnMultiBenefitToothpaste() throws Exception {
    	scrollPageInUpAndDown();
    	moveToElement(MultibenefitToothpaste);
		clickElementUsingJavaScript(MultibenefitToothpaste);
	}	
    public void clickOnFastreliefsensitivity() throws Exception {
    	scrollPageInUpAndDown();
    	moveToElement(fastreliefsensitivity);
		clickElementUsingJavaScript(fastreliefsensitivity);
	}	
    public void clickOnGetResults() throws Exception {
    	scrollPageInUpAndDown();
    	moveToElement(GetResults);
		clickElementUsingJavaScript(GetResults);
	}	
    public void clickOnSensitiveCareToothbrush() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(SensitiveCare);
		clickElementUsingJavaScript(SensitiveCare);
	}	
    public void clickOnSensitiveCareToothbrushBuyNow() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(SensitiveCare_BuyNow);
		clickElementUsingJavaScript(SensitiveCare_BuyNow);
		visibilityOf(SensitiveCare_BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(SensitiveCare_BuyNowTxt);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(SensitiveCare_BuyNowClose);
	}	
    public void clickOnPronamelGentleWhitening() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(Pronamelgentlewhitening);
		clickElementUsingJavaScript(Pronamelgentlewhitening);
	}	
    public void clickOnPronamelGentleWhiteningBuyNow() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(Pronamelgentlewhitening_BuyNow);
		clickElementUsingJavaScript(Pronamelgentlewhitening_BuyNow);
		//visibilityOf(Pronamelgentlewhitening_BuyNowClose);
		//boolean elementIsDisplayed=elementIsDisplayed(Pronamelgentlewhitening_BuyNowTxt);
		//Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(Pronamelgentlewhitening_BuyNowClose);
	}	
    public void clickOnPronamelMultiAction() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(Pronamelmultiaction);
		clickElementUsingJavaScript(Pronamelmultiaction);
	}	
	
    public void clickOnPronamelMultiActionBuyNow() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(Pronamelgentlewhitening_BuyNow);
		clickElementUsingJavaScript(Pronamelgentlewhitening_BuyNow);
    }
    public void clickOnPronamelFreshBreathe() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(PronamelfreshBreathe);
		clickElementUsingJavaScript(PronamelfreshBreathe);
	}	
    public void clickOnPronamelFreshBreatheBuyNow() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(PronamelfreshBreathe_BuyNow);
		clickElementUsingJavaScript(PronamelfreshBreathe_BuyNow);
    }
    public void clickOnPronamelDailyProtection() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(Pronameldailyprotection);
		clickElementUsingJavaScript(Pronameldailyprotection);
	}	
    public void clickOnPronamelDailyProtection_BuyNow() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(Pronameldailyprotection_BuyNow);
		clickElementUsingJavaScript(Pronameldailyprotection_BuyNow);
	}	
    public void clickOnPronamelStrongBrightEnamel() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(Pronamelstrongbrightenamel);
		clickElementUsingJavaScript(Pronamelstrongbrightenamel);
	}	
    public void clickOnPronamelStrongBrightEnamel_BuyNow() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(Pronamelstrongbrightenamel_BuyNow);
		clickElementUsingJavaScript(Pronamelstrongbrightenamel_BuyNow);
	}
    public void clickOnPronamelStrongBrightEnamelNext() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(Pronamelstrongbrightenamelnext);
		clickElementUsingJavaScript(Pronamelstrongbrightenamelnext);
	}	
    public void clickOnPronamelStrongBrightEnamelNext_BuyNow() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(Pronamelstrongbrightenamelnext_BuyNow);
		clickElementUsingJavaScript(Pronamelstrongbrightenamelnext_BuyNow);
	}
    public void clickOnPronamelMineralBoost() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(PronamelMineralBoost);
		clickElementUsingJavaScript(PronamelMineralBoost);
	}
    public void clickOnPronamelMineralBoost_BuyNow() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(PronamelMineralBoost_BuyNow);
		clickElementUsingJavaScript(PronamelMineralBoost_BuyNow);
	}
    public void clickOnPronamelMineralBoostGentlewhitening() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(PronamelMineralBoostgentlewhitening);
		clickElementUsingJavaScript(PronamelMineralBoostgentlewhitening);
	}
    public void clickOnPronamelMineralBoostGentlewhitening_BuyNow() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(PronamelMineralBoostgentlewhitening_BuyNow);
		clickElementUsingJavaScript(PronamelMineralBoostgentlewhitening_BuyNow);
	}
    public void clickOnGetCoupon() throws Exception {
    	scrollDownUsingElement(PronamelMineralBoostgentlewhitening);
    	moveToElement(getcoupon);
		clickElementUsingJavaScript(getcoupon);
	}
    public void clickOnFindyourStore() throws Exception {
    	scrollDownUsingElement(PronamelMineralBoostgentlewhitening);
    	moveToElement(findyourstore);
		clickElementUsingJavaScript(findyourstore);
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
