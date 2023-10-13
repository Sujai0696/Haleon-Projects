package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneSenstiveteethRepairToothpaste_Pages extends BaseClass{

	public SensodyneSenstiveteethRepairToothpaste_Pages() {
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
	private static WebElement productResultBreadcrumbs;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]")
	private static WebElement SensitiveToothpasteBreadcrumbs;
	
	@FindBy(xpath = "//a[text()='enamel wear']")
	private static WebElement enamelwear;
	
	@FindBy(xpath = "//a[text()='fast relief for sensitive teeth']")
	private static WebElement fastReliefsensitiveteeth;
	
	@FindBy(xpath = "//a[text()='Get Results']")
	private static WebElement getresults;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-whitening-toothpaste/\"])[2]")
	private static WebElement Product1;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-extra-fresh-toothpaste/\"])[2]")
	private static WebElement Product2;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-toothpaste/\"])[2]")
	private static WebElement Product3;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
	private static WebElement BuyNow1;
	
	@FindBy(xpath = "//span[@class=\"ps-lightbox-close\"]")
	private static WebElement BuyNowClose;
	
	@FindBy(xpath = "//h2[text()='Repair & Protect, Whitening 3.4 oz']")
	private static WebElement BuyNowTxt;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[2]")
	private static WebElement BuyNow2;
	
	@FindBy(xpath = "//h2[text()='Repair & Protect, Extra Fresh 3.4 oz']")
	private static WebElement BuyNowTxt1;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement BuyNowClose1;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[3]")
	private static WebElement BuyNow3;
	
	@FindBy(xpath = "//h2[text()='Repair & Protect, 3.4 oz']")
	private static WebElement BuyNowTxt2;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement BuyNowClose2;
	
	@FindBy(xpath = "//a[text()='Get your Coupon']")
	private static WebElement getcoupons;
	
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
    public void clickOnOurProductsBreadCrumbs() throws Exception {
    	moveToElement(OurproductsBreadcrumbs);
		clickElementUsingJavaScript(OurproductsBreadcrumbs);
	}
    public void clickOnProductsResultsBreadCrumbs() throws Exception {
    	moveToElement(productResultBreadcrumbs);
		clickElementUsingJavaScript(productResultBreadcrumbs);
	}
    public void clickOnSensitiveTeethToothpasteBreadCrumbs() throws Exception {
    	moveToElement(SensitiveToothpasteBreadcrumbs);
		clickElementUsingJavaScript(SensitiveToothpasteBreadcrumbs);
	}
    public void clickOnEnamelwear() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(enamelwear);
		clickElementUsingJavaScript(enamelwear);
	}
    public void clickOnFastReliefSensitiveTeeth() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(enamelwear);
    	moveToElement(fastReliefsensitiveteeth);
		clickElementUsingJavaScript(fastReliefsensitiveteeth);
	}
    public void clickOnGetResults() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(fastReliefsensitiveteeth);
    	moveToElement(getresults);
		clickElementUsingJavaScript(getresults);
	}
    public void clickOnProducts1() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(getresults);
    	moveToElement(Product1);
		clickElementUsingJavaScript(Product1);
	}
    public void clickOnProducts2() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(getresults);
    	moveToElement(Product2);
		clickElementUsingJavaScript(Product2);
	}
    public void clickOnProducts3() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(getresults);
    	moveToElement(Product3);
		clickElementUsingJavaScript(Product3);
	}
    public void clickOnBuyNow1() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Product1);
    	moveToElement(BuyNow1);
		clickElementUsingJavaScript(BuyNow1);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowTxt);
		Assert.assertTrue(elementIsDisplayed(BuyNowClose));
		clickElementUsingJavaScript(BuyNowClose);
	}
    public void clickOnBuyNow2() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Product1);
    	moveToElement(BuyNow2);
		clickElementUsingJavaScript(BuyNow2);
		//visibilityOf(BuyNowClose1);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowTxt1);
		Assert.assertTrue(elementIsDisplayed(BuyNowClose1));
		clickElementUsingJavaScript(BuyNowClose1);
	}
    public void clickOnBuyNow3() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Product1);
    	moveToElement(BuyNow3);
		clickElementUsingJavaScript(BuyNow3);
		//visibilityOf(BuyNowClose2);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowTxt2);
		Assert.assertTrue(elementIsDisplayed(BuyNowClose2));
		clickElementUsingJavaScript(BuyNowClose2);
	}
	
    public void clickOnGetCoupons() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Product1);
    	moveToElement(getcoupons);
		clickElementUsingJavaScript(getcoupons);
	}
    public void clickOnFindStore() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Product1);
    	moveToElement(FindStore);
		clickElementUsingJavaScript(FindStore);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
