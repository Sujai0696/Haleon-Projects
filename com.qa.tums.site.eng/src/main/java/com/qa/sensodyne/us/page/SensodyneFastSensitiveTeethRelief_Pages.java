package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneFastSensitiveTeethRelief_Pages extends BaseClass{
	
	public SensodyneFastSensitiveTeethRelief_Pages(){
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

	@FindBy(xpath = "(//a[@href=\"/en-us/products/\"])[1]")
	private static WebElement OurProducts;
	
	@FindBy(xpath = "//a[text()='Fast Sensitive Teeth Relief']")
	private static WebElement FastSensitiveTeethRelief;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd \"]")
	private static WebElement ProductResult;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]")
	private static WebElement ToothPasteReliefBreadcrumb;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/teeth-whitening-toothpaste/\"])[3]")
	private static WebElement HelpsWhitenTeeth;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/sensitive-teeth-repair-toothpaste/\"])[3]")
	private static WebElement SensitiveTeethRepair;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/\"])[3]")
	private static WebElement GetResults;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitive-care-toothbrush/\"])[1]")
	private static WebElement SensitiveCareToothBrush;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
	private static WebElement SensitiveCareToothBrush_BuyNow;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement BuyNowClose;
	
	@FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[1]//child::img")
	private static WebElement SensitiveCareToothBrush_Product;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-whitening-toothpaste/\"])[2]")
	private static WebElement RapidReliefWhitening;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[2]")
	private static WebElement RapidReliefWhitening_BuyNow;
	
	@FindBy(xpath = "(//img[@alt=\"Sensodyne Rapid Relief Whitening Toothpaste\"])[1]")
	private static WebElement RapidReliefWhitening_Product;
	
	@FindBy(xpath = "(//strong[text()='Rapid Relief'])[2]")
	private static WebElement RapidReliefMint;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[3]")
	private static WebElement RapidReliefMint_BuyNow;
	
	@FindBy(xpath = "(//div[@class=\"component-content left\"])[12]//child::img")
	private static WebElement RapidReliefMint_Product;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-extra-fresh-toothpaste/\"])[2]")
	private static WebElement RapidReliefExtraFresh;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[4]")
	private static WebElement RapidReliefExtraFresh_BuyNow;
	
	@FindBy(xpath = "//a[text()='Get your Coupon']")
	private static WebElement Coupons;
	
	@FindBy(xpath = "//a[text()='Find your Store']")
	private static WebElement FindStore;
	
	
	
	
	
	
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
    public void clickOnFastSensitiveTeethRelief() throws Exception {
    	moveToElement(OurProducts);
		elementClick(FastSensitiveTeethRelief);
	}
    public void clickOnProductResult() throws Exception {
    	//moveToElement(OurProducts);
		elementClick(ProductResult);
	}
    
    public void clickOnToothPasteReliefBreadCrumb() throws Exception {
    	//moveToElement(OurProducts);
		elementClick(ToothPasteReliefBreadcrumb);
	}
    public void clickOnHelpsWhitenTeeth() throws Exception {
    	moveToElement(HelpsWhitenTeeth);
		clickElementUsingJavaScript(HelpsWhitenTeeth);
	}
    public void clickOnSensitiveTeethRepair() throws Exception {
    	moveToElement(SensitiveTeethRepair);
		clickElementUsingJavaScript(SensitiveTeethRepair);
	}
    public void clickOnGetResults() throws Exception {
    	moveToElement(GetResults);
		clickElementUsingJavaScript(GetResults);
	}
    public void clickOnSensitiveCareToothBrush() throws Exception {
    	moveToElement(SensitiveCareToothBrush);
		clickElementUsingJavaScript(SensitiveCareToothBrush);
	}
    public void clickOnSensitiveCareToothBrush_BuyNow() throws Exception {
    	moveToElement(SensitiveCareToothBrush_BuyNow);
		clickElementUsingJavaScript(SensitiveCareToothBrush_BuyNow);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClose);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
	}
    public void clickOnSensitiveCareToothBrush_Product() throws Exception {
    	scrollDownUsingElement(GetResults);
    	//moveToElement(SensitiveCareToothBrush_Product);
		clickElementUsingJavaScript(SensitiveCareToothBrush_Product);
	}
    public void clickOnRapidReliefWhitening() throws Exception {
    	scrollDownUsingElement(GetResults);
    	//moveToElement(SensitiveCareToothBrush_Product);
		clickElementUsingJavaScript(RapidReliefWhitening);
	}
    public void clickOnRapidReliefWhitening_BuyNow() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(RapidReliefWhitening_BuyNow);
		clickElementUsingJavaScript(RapidReliefWhitening_BuyNow);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClose);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
	}
    public void clickOnRapidReliefWhitening_Product() throws Exception {
    	//scrollDownUsingElement(GetResults);
    	//moveToElement(SensitiveCareToothBrush_Product);
		clickElementUsingJavaScript(RapidReliefWhitening_Product);
	}
    public void clickOnRapidReliefMint() throws Exception {
    	scrollDownUsingElement(GetResults);
    	//moveToElement(SensitiveCareToothBrush_Product);
		elementClick(RapidReliefMint);
	}
    public void clickOnRapidReliefMint_BuyNow() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(RapidReliefMint_BuyNow);
		clickElementUsingJavaScript(RapidReliefMint_BuyNow);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClose);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
	}
    public void clickOnRapidReliefMintProduct() throws Exception {
    	scrollDownUsingElement(GetResults);
    	//moveToElement(SensitiveCareToothBrush_Product);
		clickElementUsingJavaScript(RapidReliefMint_Product);
	}
    public void clickOnRapidReliefExtrafresh() throws Exception {
    	scrollDownUsingElement(GetResults);
    	//moveToElement(SensitiveCareToothBrush_Product);
		clickElementUsingJavaScript(RapidReliefExtraFresh);
	}
    public void clickOnRapidReliefExtraFresh_BuyNow() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(RapidReliefExtraFresh_BuyNow);
		clickElementUsingJavaScript(RapidReliefExtraFresh_BuyNow);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClose);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
	}
    public void clickOnGetCoupons() throws Exception {
    	scrollDownUsingElement(Coupons);
    	//moveToElement(SensitiveCareToothBrush_Product);
		clickElementUsingJavaScript(Coupons);
	}
    public void clickOnFindStore() throws Exception {
    	scrollDownUsingElement(FindStore);
    	//moveToElement(SensitiveCareToothBrush_Product);
		clickElementUsingJavaScript(FindStore);
	}
	
	
	
	
	
	
	
	

}
