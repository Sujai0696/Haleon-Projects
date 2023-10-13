package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodynePlagueandGumProtection_Pages extends BaseClass{
	
	public SensodynePlagueandGumProtection_Pages() {
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
	private static WebElement plagueandGumProtectionBreadcrumbs;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/plaque-and-gum-protection-toothpaste/\"])[4]")
	private static WebElement plagueandGumProtection;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/teeth-whitening-toothpaste/\"])[3]")
	private static WebElement toothwhitening;
	
	@FindBy(xpath = "//a[text()='Get Results']")
	private static WebElement GetResults;
	
	@FindBy(xpath = "(//strong[text()='Sensitivity & Gum'])[1]")
	private static WebElement SensitivityGum;
	
	@FindBy(xpath = "//img[@alt=\"Sensodyne Sensitivity & Gum Clean & Fresh\"]")
	private static WebElement SensitivityGumcleanFresh;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
	private static WebElement SensitivityGumcleanFresh_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Sensitivity & Gum, Clean & Fresh 3.4 oz']")
	private static WebElement SensitivityGumcleanFresh_Txt;
	
	@FindBy(xpath = "//span[@class=\"ps-lightbox-close\"]")
	private static WebElement SensitivityGumcleanFresh_Close;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitivity-and-gum-whitening-toothpaste/\"])[2]")
	private static WebElement Sensitivitygumwhitening;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[2]")
	private static WebElement Sensitivitygumwhitening_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Sensitivity & Gum, Whitening 3.4 oz']")
	private static WebElement Sensitivitygumwhitening_Txt;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement Sensitivitygumwhitening_Close;
	
	@FindBy(xpath = "(//strong[text()='Sensitivity & Gum'])[3]")
	private static WebElement SensitivityGumMint;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[3]")
	private static WebElement SensitivityGumMint_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Sensitivity & Gum, Mint 3.4 oz']")
	private static WebElement SensitivityGumMint_Txt;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement SensitivityGumMint_Close;
	
	@FindBy(xpath = "//strong[text()='Sensitive Care']")
	private static WebElement SensitivityCareToothbrush;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[4]")
	private static WebElement SensitivityCareToothbrush_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Sensitive Care Toothbrush']")
	private static WebElement SensitivityCareToothbrush_Txt;
	
	@FindBy(xpath = "(//span[@class=\"ps-lightbox-close\"])[2]")
	private static WebElement SensitivityCareToothbrush_Close;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-complete-protection-extra-fresh-toothpaste/\"])[2]")
	private static WebElement CompleteProtection;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[5]")
	private static WebElement CompleteProtection_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Complete Protection, Extra Fresh 3.4 oz']")
	private static WebElement CompleteProtection_Txt;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement CompleteProtection_Close;
	
	@FindBy(xpath = "(//strong[text()='Complete Protection'])[2]")
	private static WebElement CompleteProtectionOnly;
	

	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[6]")
	private static WebElement CompleteProtectionOnly_BuYnow;
	
	@FindBy(xpath = "//h2[text()='Complete Protection, Original 3.4 oz']")
	private static WebElement CompleteProtectionOnly_Txt;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement CompleteProtectionOnly_Close;
	
	@FindBy(xpath = "//a[text()='Get your Coupon']")
	private static WebElement getcoupon;
	
	@FindBy(xpath = "//a[text()='Find your Store']")
	private static WebElement findStore;
	
	
	
	
	
	
	
	
	
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
		    public void clickOnPlagueandGumProtectionBreadCrumbs() throws Exception {
		    	moveToElement(plagueandGumProtectionBreadcrumbs);
				clickElementUsingJavaScript(plagueandGumProtectionBreadcrumbs);
			}
		    public void clickOnPlagueandGumProtection() throws Exception {
		    	moveToElement(plagueandGumProtection);
				clickElementUsingJavaScript(plagueandGumProtection);
			}
		    public void clickOnToothwhitening() throws Exception {
		    	moveToElement(toothwhitening);
				clickElementUsingJavaScript(toothwhitening);
			}
		    public void clickOnGetResults() throws Exception {
		    	scrollDownUsingElement(toothwhitening);
		    	moveToElement(GetResults);
				clickElementUsingJavaScript(GetResults);
			}
		    public void clickOnSensitivitygum() throws Exception {
		    	scrollDownUsingElement(GetResults);
		    	moveToElement(SensitivityGum);
				clickElementUsingJavaScript(SensitivityGum);
			}
		    public void clickOnSensitivitygumCleanFreshProduct() throws Exception {
		    	scrollDownUsingElement(GetResults);
		    	moveToElement(SensitivityGumcleanFresh);
				clickElementUsingJavaScript(SensitivityGumcleanFresh);
			}
		    public void clickOnSensitivitygumCleanFreshBuyNow() throws Exception {
		    	scrollDownUsingElement(GetResults);
		    	moveToElement(SensitivityGumcleanFresh_BuyNow);
				clickElementUsingJavaScript(SensitivityGumcleanFresh_BuyNow);
				visibilityOf(SensitivityGumcleanFresh_Close);
				boolean elementIsDisplayed=elementIsDisplayed(SensitivityGumcleanFresh_Txt);
				Assert.assertTrue(elementIsDisplayed);
				clickElementUsingJavaScript(SensitivityGumcleanFresh_Close);
			}
		    public void clickOnSensitivitygumWhitening() throws Exception {
		    	scrollDownUsingElement(GetResults);
		    	moveToElement(Sensitivitygumwhitening);
				clickElementUsingJavaScript(Sensitivitygumwhitening);
			}
		    public void clickOnSensitivitygumwhiteningBuyNow() throws Exception {
		    	scrollDownUsingElement(GetResults);
		    	moveToElement(Sensitivitygumwhitening_BuyNow);
				clickElementUsingJavaScript(Sensitivitygumwhitening_BuyNow);
				visibilityOf(Sensitivitygumwhitening_Close);
				boolean elementIsDisplayed=elementIsDisplayed(Sensitivitygumwhitening_Txt);
				Assert.assertTrue(elementIsDisplayed);
				clickElementUsingJavaScript(Sensitivitygumwhitening_Close);
			}
		    public void clickOnSensitivitygumMint() throws Exception {
		    	scrollDownUsingElement(GetResults);
		    	moveToElement(SensitivityGumMint);
				clickElementUsingJavaScript(SensitivityGumMint);
			}
		    public void clickOnSensitivitygumMintBuyNow() throws Exception {
		    	scrollDownUsingElement(GetResults);
		    	moveToElement(SensitivityGumMint_BuyNow);
				clickElementUsingJavaScript(SensitivityGumMint_BuyNow);
				//visibilityOf(SensitivityGumMint_Close);
				boolean elementIsDisplayed=elementIsDisplayed(SensitivityGumMint_Txt);
				Assert.assertTrue(elementIsDisplayed);
				clickElementUsingJavaScript(SensitivityGumMint_Close);
			}
		    public void clickOnSensitiveCareToothbrush() throws Exception {
		    	scrollDownUsingElement(GetResults);
		    	moveToElement(SensitivityCareToothbrush);
				clickElementUsingJavaScript(SensitivityCareToothbrush);
			}
		    public void clickOnSensitivecareToothbrushBuyNow() throws Exception {
		    	scrollDownUsingElement(GetResults);
		    	moveToElement(SensitivityCareToothbrush_BuyNow);
				clickElementUsingJavaScript(SensitivityCareToothbrush_BuyNow);
				visibilityOf(SensitivityCareToothbrush_Close);
				boolean elementIsDisplayed=elementIsDisplayed(SensitivityCareToothbrush_Txt);
				Assert.assertTrue(elementIsDisplayed);
				clickElementUsingJavaScript(SensitivityCareToothbrush_Close);
			}
		    public void clickOnCompleteProtection() throws Exception {
		    	scrollDownUsingElement(GetResults);
		    	moveToElement(CompleteProtection);
				clickElementUsingJavaScript(CompleteProtection);
			}
		    public void clickOnCompleteProtectionBuyNow() throws Exception {
		    	scrollDownUsingElement(GetResults);
		    	moveToElement(CompleteProtection_BuyNow);
				clickElementUsingJavaScript(CompleteProtection_BuyNow);
				//visibilityOf(CompleteProtection_Close);
				boolean elementIsDisplayed=elementIsDisplayed(CompleteProtection_Txt);
				Assert.assertTrue(elementIsDisplayed);
				//clickElementUsingJavaScript(CompleteProtection_Close);
			}
		    public void clickOnCompleteProtectionOnly() throws Exception {
		    	scrollDownUsingElement(GetResults);
		    	moveToElement(CompleteProtectionOnly);
				clickElementUsingJavaScript(CompleteProtectionOnly);
			}
		    public void clickOnCompleteProtectionOnlyBuyNow() throws Exception {
		    	scrollDownUsingElement(GetResults);
		    	moveToElement(CompleteProtectionOnly_BuYnow);
				clickElementUsingJavaScript(CompleteProtectionOnly_BuYnow);
				//visibilityOf(CompleteProtection_Close);
				boolean elementIsDisplayed=elementIsDisplayed(CompleteProtectionOnly_Txt);
				Assert.assertTrue(elementIsDisplayed);
				//clickElementUsingJavaScript(CompleteProtection_Close);
			}
		    public void clickOnGetCoupon() throws Exception {
		    	scrollDownUsingElement(CompleteProtectionOnly);
		    	moveToElement(getcoupon);
				clickElementUsingJavaScript(getcoupon);
			}
		    public void clickOnFindStore() throws Exception {
		    	scrollDownUsingElement(CompleteProtectionOnly);
		    	moveToElement(findStore);
				clickElementUsingJavaScript(findStore);
			}
	
	
	

}
