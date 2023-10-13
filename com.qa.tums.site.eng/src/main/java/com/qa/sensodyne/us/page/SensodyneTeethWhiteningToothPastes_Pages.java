package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneTeethWhiteningToothPastes_Pages extends BaseClass{

	public SensodyneTeethWhiteningToothPastes_Pages(){
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
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/teeth-whitening-toothpaste/\"])[1]")
	private static WebElement TeethWhiteningtoothpastes;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]")
	private static WebElement TeethWhiteningtoothpastes_breadcrumb;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/extra-fresh-breath-toothpaste/\"])[3]")
	private static WebElement freshenbreathe;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/sensitive-teeth-repair-toothpaste/\"])[3]")
	private static WebElement SensitiveTeethRepair;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/plaque-and-gum-protection-toothpaste/\"])[3]")
	private static WebElement plaguegumprotection;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/\"])[3]")
	private static WebElement Results;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement BuyNowClosebtn;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitivity-and-gum-whitening-toothpaste/\"])[2]")
	private static WebElement SensitiveGumWhitening;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
	private static WebElement SensitiveGumWhitening_BuyNow;
	
	@FindBy(xpath = "(//div[@class=\"component-content left\"])[10]//child::img")
	private static WebElement SensitiveGumWhiteningImg;
	
	@FindBy(xpath = "//a[@href=\"/en-us/products/sensodyne-sensitive-care-toothbrush/\"]")
	private static WebElement SensitiveCareToothbrush;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[2]")
	private static WebElement SensitiveCareToothbrush_BuyNow;
	
	@FindBy(xpath = "(//div[@class=\"component-content left\"])[11]//child::img")
	private static WebElement SensitiveCareToothbrushImg;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-whitening-toothpaste/\"])[4]")
	private static WebElement RepairProtectWhitening;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[4]")
	private static WebElement RepairProtectWhitening_BuyNow;
	
	@FindBy(xpath = "(//div[@class=\"component-content left\"])[13]//child::img")
	private static WebElement RepairProtectWhitening_Img;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-true-white-extra-fresh-toothpaste/\"])[2] ")
	private static WebElement ExtraFreshToothpaste;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[5]")
	private static WebElement ExtraFreshToothpaste_BuyNow;
	
	@FindBy(xpath = "(//div[@class=\"component-content left\"])[14]//child::img")
	private static WebElement ExtraFreshToothpasteProd;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-true-white-mint-toothpaste/\"])[2]")
	private static WebElement TrueWhiteMint;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[6]")
	private static WebElement TrueWhiteMint_BuyNow;
	
	@FindBy(xpath = "(//div[@class=\"component-content left\"])[15]//child::img")
	private static WebElement TrueWhiteMint_Product;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-deep-clean-toothpaste/\"])[2]")
	private static WebElement DeepClean;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[7]")
	private static WebElement DeepClean_BuyNow;
	
	@FindBy(xpath = "(//div[@class=\"component-content left\"])[16]//child::img")
	private static WebElement DeepClean_Product;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-extra-whitening-toothpaste/\"])[2]")
	private static WebElement ExtraWhitening;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[8]")
	private static WebElement ExtraWhitening_BuyNow;
	
	@FindBy(xpath = "(//div[@class=\"component-content left\"])[17]//following-sibling::img")
	private static WebElement ExtraWhitening_Product;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-full-protection-toothpaste/\"])[2]")
	private static WebElement FullProtectionToothpaste;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[9]")
	private static WebElement FullProtectionToothpaste_BuyNow;
	
	@FindBy(xpath = "(//div[@class=\"component-content left\"])[18]//child::img")
	private static WebElement FullProtectionToothpaste_Product;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-tartar-control-toothpaste/\"])[2]")
	private static WebElement TartarControl;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[10]")
	private static WebElement TartarControl_BuyNow;
	
	@FindBy(xpath = "//img[@title=\"Packshot photography of Sensodyne Tartar Control\"]")
	private static WebElement TartarControl_Product;
	
	@FindBy(xpath = "//a[text()='Get your Coupon']")
	private static WebElement GetCoupon;
	
	@FindBy(xpath = "//a[text()='Find your Store']")
	private static WebElement FindStore;
	

	
	
	
	//Methods//y
	
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
    public void clickOnTeethWhiteningToothpastes() throws Exception {
    	moveToElement(OurProducts);
		clickElementUsingJavaScript(TeethWhiteningtoothpastes);
	}
    public void clickOnTeethWhiteningToothpastesBreadcrumb() throws Exception {
		clickElementUsingJavaScript(TeethWhiteningtoothpastes_breadcrumb);
	}
    public void clickOnFreshenbreathe() throws Exception {
    	moveToElement(freshenbreathe);
		clickElementUsingJavaScript(freshenbreathe);
	}
    public void clickOnSensitiveTeethRepair() throws Exception {
    	moveToElement(SensitiveTeethRepair);
		clickElementUsingJavaScript(SensitiveTeethRepair);
	}
    public void clickOnplaguegumprotection() throws Exception {
    	moveToElement(plaguegumprotection);
		clickElementUsingJavaScript(plaguegumprotection);
	}
    public void clickOnResults() throws Exception {
    	moveToElement(Results);
		clickElementUsingJavaScript(Results);
	}
    public void clickOnSensitiveGumWhitening() throws Exception {
    	moveToElement(Results);
		clickElementUsingJavaScript(SensitiveGumWhitening);
	}
    public void clickOnSensitiveGumWhitening_BuyNow() throws Exception {
    	moveToElement(SensitiveGumWhitening_BuyNow);
		clickElementUsingJavaScript(SensitiveGumWhitening_BuyNow);
		visibilityOf(BuyNowClosebtn);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClosebtn);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClosebtn);
	}
    public void clickOnSensitiveGumWhitening_Img() throws Exception {
    	moveToElement(SensitiveGumWhiteningImg);
		clickElementUsingJavaScript(SensitiveGumWhiteningImg);
	}
    public void clickOnSensitiveCareToothBrush() throws Exception {
    	scrollDownUsingElement(Results);
    	moveToElement(SensitiveCareToothbrush);
		clickElementUsingJavaScript(SensitiveCareToothbrush);
	}
    public void clickOnSensitiveCareToothBrush_BuyNow() throws Exception {
    	scrollDownUsingElement(Results);
    	moveToElement(SensitiveCareToothbrush_BuyNow);
		clickElementUsingJavaScript(SensitiveCareToothbrush_BuyNow);
		visibilityOf(BuyNowClosebtn);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClosebtn);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClosebtn);
	}
    public void clickOnSensitiveCareToothBrush_Img() throws Exception {
    	scrollDownUsingElement(Results);
    	//moveToElement(SensitiveCareToothbrushImg);
		clickElementUsingJavaScript(SensitiveCareToothbrushImg);
	}
    public void clickOnRepairProtectWhitening() throws Exception {
    	scrollDownUsingElement(Results);
    	//moveToElement(RepairProtectWhitening);
		clickElementUsingJavaScript(RepairProtectWhitening);
	}
    public void clickOnRepairProtectWhitening_BuyNow() throws Exception {
    	scrollDownUsingElement(Results);
    	moveToElement(RepairProtectWhitening_BuyNow);
		clickElementUsingJavaScript(RepairProtectWhitening_BuyNow);
		visibilityOf(BuyNowClosebtn);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClosebtn);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClosebtn);
	}
    public void clickOnRepairProtectWhiteningImg() throws Exception {
    	scrollDownUsingElement(Results);
    	//moveToElement(RepairProtectWhitening);
		clickElementUsingJavaScript(RepairProtectWhitening_Img);
	}
    public void clickOnExtraFreshToothPaste() throws Exception {
    	scrollDownUsingElement(Results);
    	//moveToElement(RepairProtectWhitening);
		clickElementUsingJavaScript(ExtraFreshToothpaste);
	}
    public void clickOnExtraFreshTrueWhite_BuyNow() throws Exception {
    	scrollDownUsingElement(Results);
    	moveToElement(ExtraFreshToothpaste_BuyNow);
		clickElementUsingJavaScript(ExtraFreshToothpaste_BuyNow);
		visibilityOf(BuyNowClosebtn);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClosebtn);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClosebtn);
		refreshWebPage();
	}
    public void clickOnExtraFreshToothPasteProduct() throws Exception {
    	scrollDownUsingElement(Results);
    	//moveToElement(RepairProtectWhitening);
		clickElementUsingJavaScript(ExtraFreshToothpasteProd);
	}
    public void clickOnTrueWhiteMint() throws Exception {
    	scrollDownUsingElement(Results);
		clickElementUsingJavaScript(TrueWhiteMint);
	}
    
    public void clickOnTrueWhiteMint_BuyNow() throws Exception {
    	scrollDownUsingElement(Results);
    	moveToElement(TrueWhiteMint_BuyNow);
		clickElementUsingJavaScript(TrueWhiteMint_BuyNow);
		visibilityOf(BuyNowClosebtn);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClosebtn);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClosebtn);
	}
    public void clickOnTrueWhiteMint_Product() throws Exception {
    	scrollDownUsingElement(SensitiveGumWhitening_BuyNow);
		clickElementUsingJavaScript(TrueWhiteMint_Product);
	}
    public void clickOnDeepClean() throws Exception {
    	scrollDownUsingElement(SensitiveGumWhitening_BuyNow);
		clickElementUsingJavaScript(DeepClean);
	}
    
    public void clickOnDeepClean_BuyNow() throws Exception {
    	scrollDownUsingElement(SensitiveGumWhitening_BuyNow);
    	moveToElement(DeepClean_BuyNow);
		clickElementUsingJavaScript(DeepClean_BuyNow);
		visibilityOf(BuyNowClosebtn);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClosebtn);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClosebtn);
	}
    public void clickOnDeepClean_Product() throws Exception {
    	scrollDownUsingElement(SensitiveGumWhitening_BuyNow);
		clickElementUsingJavaScript(DeepClean_Product);
	}
    public void clickOnExtraWhitening() throws Exception {
    	scrollDownUsingElement(SensitiveGumWhitening_BuyNow);
		clickElementUsingJavaScript(ExtraWhitening);
	}
    public void clickOnExtraWhitening_BuyNow() throws Exception {
    	scrollDownUsingElement(SensitiveGumWhitening_BuyNow);
    	moveToElement(ExtraWhitening_BuyNow);
		clickElementUsingJavaScript(ExtraWhitening_BuyNow);
		visibilityOf(BuyNowClosebtn);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClosebtn);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClosebtn);
	}
    public void clickOnExtraWhitening_Product() throws Exception {
    	scrollDownUsingElement(SensitiveGumWhitening_BuyNow);
		clickElementUsingJavaScript(ExtraWhitening_Product);
	}
    public void clickOnFullProtectionToothpaste() throws Exception {
    	scrollDownUsingElement(SensitiveGumWhitening_BuyNow);
		clickElementUsingJavaScript(FullProtectionToothpaste);
	}
    public void clickOnFullProtectionToothpaste_BuyNow() throws Exception {
    	scrollDownUsingElement(SensitiveGumWhitening_BuyNow);
    	moveToElement(FullProtectionToothpaste_BuyNow);
		clickElementUsingJavaScript(FullProtectionToothpaste_BuyNow);
		visibilityOf(BuyNowClosebtn);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClosebtn);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClosebtn);
	}
    public void clickOnFullProtectionToothpaste_Product() throws Exception {
    	scrollDownUsingElement(SensitiveGumWhitening_BuyNow);
		clickElementUsingJavaScript(FullProtectionToothpaste_Product);
	}
    public void clickOnTartarControl() throws Exception {
    	scrollDownUsingElement(TrueWhiteMint_BuyNow);
		clickElementUsingJavaScript(TartarControl);
	}
    public void clickOnTartarControl_BuyNow() throws Exception {
    	scrollDownUsingElement(TrueWhiteMint_BuyNow);
    	moveToElement(TartarControl_BuyNow);
		clickElementUsingJavaScript(TartarControl_BuyNow);
		visibilityOf(BuyNowClosebtn);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClosebtn);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClosebtn);
	}
    public void clickOnTartarControl_Product() throws Exception {
    	scrollDownUsingElement(TrueWhiteMint_BuyNow);
		clickElementUsingJavaScript(TartarControl_Product);
	}
    public void clickOnGetCoupon() throws Exception {
    	//scrollDownUsingElement(GetCoupon);
		clickElementUsingJavaScript(GetCoupon);
	}
    public void clickOnFindStore() throws Exception {
    	//scrollDownUsingElement(FindStore);
		clickElementUsingJavaScript(FindStore);
	}
    
    
    
    
    
    
    
    
    
    
    
    
}
