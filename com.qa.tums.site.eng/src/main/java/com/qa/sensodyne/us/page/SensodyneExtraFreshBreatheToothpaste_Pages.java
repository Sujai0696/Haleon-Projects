package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneExtraFreshBreatheToothpaste_Pages extends BaseClass{
	
	public SensodyneExtraFreshBreatheToothpaste_Pages(){
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
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/extra-fresh-breath-toothpaste/\"])[1]")
	private static WebElement ExtraFreshBreathe;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]")
	private static WebElement ExtraFreshBreathe_BreadCrumbs;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/fast-sensitive-teeth-relief-toothpaste/\"])[3]")
	private static WebElement SensitiveTeethRelief;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/teeth-whitening-toothpaste/\"])[3]")
	private static WebElement TeethWhiteningToothpaste;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/\"])[3]")
	private static WebElement GetResults;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitive-care-toothbrush/\"])[1]")
	private static WebElement SensitiveCareToothBrush;
	
	@FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[1]//img")
	private static WebElement SensitiveCareToothBrushProduct;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[2]")
	private static WebElement SensitiveCareToothBrush_BuyNow;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement BuyNowClose;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitivity-and-gum-fresh-clean-toothpaste/\"])[2]")
	private static WebElement sensitivitygumcleanfresh;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
	private static WebElement sensitivitygumcleanfresh_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Sensitivity & Gum, Clean & Fresh 3.4 oz']")
	private static WebElement sensitivitygumcleanfresh_txt;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement sensitivitygumcleanfresh_close;
	
	@FindBy(xpath = "//strong[text()='Rapid Relief']")
	private static WebElement rapidreliefextrafresh;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[3]")
	private static WebElement rapidreliefextrafresh_buynow;
	
	@FindBy(xpath = "//h2[text()='Rapid Relief, Extra Fresh 3.4 oz']")
	private static WebElement rapidreliefextrafresh_txt;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-extra-fresh-toothpaste/\"])[2]")
	private static WebElement repairprotectextrafresh;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[4]")
	private static WebElement repairprotectextrafresh_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Repair & Protect, Extra Fresh 3.4 oz']")
	private static WebElement repairprotectextrafresh_txt;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-complete-protection-extra-fresh-toothpaste/\"])[2]")
	private static WebElement completeprotectionextrafresh;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[5]")
	private static WebElement completeprotectionextrafresh_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Complete Protection, Extra Fresh 3.4 oz']")
	private static WebElement completeprotectionextrafresh_txt;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-true-white-extra-fresh-toothpaste/\"])[2]")
	private static WebElement truewhiteextrafresh;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[6]")
	private static WebElement truewhiteextrafresh_BuyNow;
	
	@FindBy(xpath = "//h2[text()='True White, Extra Fresh 3.0 oz']")
	private static WebElement truewhiteextrafresh_txt;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-deep-clean-toothpaste/\"])[2]")
	private static WebElement deepclean;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[7]")
	private static WebElement deepclean_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Deep Clean, 4.0 oz']")
	private static WebElement deepclean_txt;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-fresh-mint-toothpaste/\"])[2]")
	private static WebElement freshmint;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[8]")
	private static WebElement freshmint_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Fresh Mint, 4.0 oz']")
	private static WebElement freshmint_txt;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-fresh-impact-toothpaste/\"])[2]")
	private static WebElement freshimpact;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[9]")
	private static WebElement freshimpact_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Fresh Impact, 4.0 oz']")
	private static WebElement freshimpact_txt;
	
	@FindBy(xpath = "//a[text()='Get your Coupon']")
	private static WebElement getyourcoupon;
	
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
    public void clickOnExtraFreshBreathe() throws Exception {
    	moveToElement(OurProducts);
		clickElementUsingJavaScript(ExtraFreshBreathe);
	}
    public void clickOnExtraFreshBreathe_BreadCrumbs() throws Exception {
		clickElementUsingJavaScript(ExtraFreshBreathe_BreadCrumbs);
	}
    public void clickOnSensitiveTeethRelief() throws Exception {
    	scrollDownUsingElement(SensitiveTeethRelief);
		clickElementUsingJavaScript(SensitiveTeethRelief);
	}
    public void clickOnTeethWhiteningTeethPaste() throws Exception {
    	scrollDownUsingElement(TeethWhiteningToothpaste);
		clickElementUsingJavaScript(TeethWhiteningToothpaste);
	}
    public void clickOnGetResults() throws Exception {
    	scrollDownUsingElement(GetResults);
		clickElementUsingJavaScript(GetResults);
	}
    public void clickOnSensitivecareToothBrush() throws Exception {
    	scrollDownUsingElement(GetResults);
		clickElementUsingJavaScript(SensitiveCareToothBrush);
	}
    public void clickOnSensitivecareToothBrushProduct() throws Exception {
    	scrollDownUsingElement(GetResults);
		clickElementUsingJavaScript(SensitiveCareToothBrushProduct);
	}
    public void clickOnSensitiveCareToothBrush_BuyNow() throws Exception {
    	scrollDownUsingElement(GetResults);
    	moveToElement(SensitiveCareToothBrush_BuyNow);
		clickElementUsingJavaScript(SensitiveCareToothBrush_BuyNow);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClose);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
	}
    public void clickOnsensitivitygumcleanfresh() throws Exception {
    	scrollDownUsingElement(sensitivitygumcleanfresh);
		clickElementUsingJavaScript(sensitivitygumcleanfresh);
	}
    public void clickOnSensitivitygumcleanfresh_BuyNow() throws Exception {
    	moveToElement(sensitivitygumcleanfresh_BuyNow);
		clickElementUsingJavaScript(sensitivitygumcleanfresh_BuyNow);
		visibilityOf(sensitivitygumcleanfresh_close);
		boolean elementIsDisplayed=elementIsDisplayed(sensitivitygumcleanfresh_txt);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(sensitivitygumcleanfresh_close);
		refreshWebPage();
	}
    public void clickOnrapidreliefextrafresh() throws Exception {
    	//scrollDownUsingElement(rapidreliefextrafresh);
		clickElementUsingJavaScript(rapidreliefextrafresh);
	}
    public void clickOnrapidreliefextrafresh_BuyNow() throws Exception {
    	moveToElement(rapidreliefextrafresh_buynow);
		clickElementUsingJavaScript(rapidreliefextrafresh_buynow);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(rapidreliefextrafresh_txt);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
		refreshWebPage();
	}
    public void clickOnrepairprotectextrafresh() throws Exception {
    	scrollDownUsingElement(repairprotectextrafresh);
		clickElementUsingJavaScript(repairprotectextrafresh);
	}
    public void clickOnrepairprotectextrafresh_BuyNow() throws Exception {
    	moveToElement(repairprotectextrafresh_BuyNow);
		clickElementUsingJavaScript(repairprotectextrafresh_BuyNow);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(repairprotectextrafresh_txt);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
		refreshWebPage();
	}
    public void clickOncompleteprotectionextrafresh() throws Exception {
    	scrollDownUsingElement(completeprotectionextrafresh);
		clickElementUsingJavaScript(completeprotectionextrafresh);
	}
    public void clickOncompleteprotectionextrafresh_BuyNow() throws Exception {
    	moveToElement(completeprotectionextrafresh_BuyNow);
		clickElementUsingJavaScript(completeprotectionextrafresh_BuyNow);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(completeprotectionextrafresh_txt);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
		refreshWebPage();
	}
    public void clickOntruewhiteextrafresh() throws Exception {
    	scrollDownUsingElement(truewhiteextrafresh);
		clickElementUsingJavaScript(truewhiteextrafresh);
	}
    public void clickOntruewhiteextrafresh_BuyNow() throws Exception {
    	moveToElement(truewhiteextrafresh_BuyNow);
		clickElementUsingJavaScript(truewhiteextrafresh_BuyNow);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(truewhiteextrafresh_txt);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
		refreshWebPage();
	}
    public void clickOndeepclean() throws Exception {
    	scrollDownUsingElement(deepclean);
		clickElementUsingJavaScript(deepclean);
	}
    public void clickOndeepclean_BuyNow() throws Exception {
    	moveToElement(truewhiteextrafresh_BuyNow);
		clickElementUsingJavaScript(truewhiteextrafresh_BuyNow);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(truewhiteextrafresh_txt);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
		refreshWebPage();
	}
    public void clickOnfreshmint() throws Exception {
    	scrollDownUsingElement(freshmint);
		clickElementUsingJavaScript(freshmint);
	}
    public void clickOnfreshmint_BuyNow() throws Exception {
    	moveToElement(freshmint_BuyNow);
		clickElementUsingJavaScript(freshmint_BuyNow);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(freshmint_txt);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
		refreshWebPage();
	}
    public void clickOnfreshimpact() throws Exception {
    	scrollDownUsingElement(freshimpact);
		clickElementUsingJavaScript(freshimpact);
	}
    public void clickOnfreshimpact_BuyNow() throws Exception {
    	moveToElement(freshimpact_BuyNow);
		clickElementUsingJavaScript(freshimpact_BuyNow);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(freshimpact_txt);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
		refreshWebPage();
	}
    public void clickOngetcoupon() throws Exception {
    	scrollDownUsingElement(getyourcoupon);
		clickElementUsingJavaScript(getyourcoupon);
	}
    public void clickOnfindyourstore() throws Exception {
    	scrollDownUsingElement(findyourstore);
		clickElementUsingJavaScript(findyourstore);
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
