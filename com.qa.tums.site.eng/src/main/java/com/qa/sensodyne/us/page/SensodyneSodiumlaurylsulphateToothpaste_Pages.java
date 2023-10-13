package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneSodiumlaurylsulphateToothpaste_Pages extends BaseClass{
	
	public SensodyneSodiumlaurylsulphateToothpaste_Pages() {
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
	private static WebElement SodiumlaurylsulphateToothpasteBreadcrumbs;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/teeth-whitening-toothpaste/\"])[3]")
	private static WebElement Toothwhitening;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-tartar-control-toothpaste/\"])[2]")
	private static WebElement tartarcontrol;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/extra-fresh-breath-toothpaste/\"])[3]")
	private static WebElement freshBreathe;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/\"])[3]")
	private static WebElement GetResults;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitive-care-toothbrush/\"])[1]")
	private static WebElement Sensitivecare;
	
	@FindBy(xpath = "//img[@alt=\"Packshot photography of Sensodyne Sensitivity Care Toothbrush\"]")
	private static WebElement SensitivecareProduct;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
	private static WebElement BuyNowsensitivecare;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement BuyNowCloseSensitivecare;
	
	@FindBy(xpath = "//h2[text()='Sensitive Care Toothbrush']")
	private static WebElement BuyNowTxtSensitivecare;
	
	@FindBy(xpath = "(//strong[text()='True White'])[1]")
	private static WebElement TrueWhite;
	
	@FindBy(xpath = "(//div[@class=\"image component section switchable-image zglazyload even col-xs-12\"])[2]//child::a")
	private static WebElement TrueWhiteProduct;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[2]")
	private static WebElement TrueWhiteBuyNow;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement TrueWhiteBuyNowClose;
	
	@FindBy(xpath = "//h2[text()='True White, Extra Fresh 3.0 oz']")
	private static WebElement TrueWhiteBuyNowTxt;
	
	@FindBy(xpath = "(//strong[text()='True White'])[2]")
	private static WebElement TrueWhiteMint;
	
//	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-true-white-mint-toothpaste/\"])[3]")
//	private static WebElement TrueWhiteMintProduct;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[3]")
	private static WebElement TrueWhiteMintBuyNow;
	
	@FindBy(xpath = "//h2[text()='True White, Mint 3.0 oz']")
	private static WebElement TrueWhiteMintTxt;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement TrueWhiteMintClose;
	
	@FindBy(xpath = "//strong[text()='Extra Whitening']")
	private static WebElement ExtraWhitening;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-extra-whitening-toothpaste/\"])[3]")
	private static WebElement ExtraWhitening_product;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[4]")
	private static WebElement ExtraWhitening_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Extra Whitening, 4.0 oz']")
	private static WebElement ExtraWhitening_Txt;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement ExtraWhitening_Close;
	
	@FindBy(xpath = "//strong[text()='Fresh Mint']")
	private static WebElement FreshMint;
	
	@FindBy(xpath = "//img[@title=\"Packshot photography of Sensodyne Fresh Mint\"]")
	private static WebElement FreshMint_Product;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[5]")
	private static WebElement FreshMint_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Fresh Mint, 4.0 oz']")
	private static WebElement FreshMint_Txt;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement FreshMint_Close;
	
	@FindBy(xpath = "//strong[text()='Full Protection']")
	private static WebElement Fullprotection;
	
	@FindBy(xpath = "//img[@title=\"Packshot photography of Sensodyne Full Protection\"]")
	private static WebElement Fullprotection_Product;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[6]")
	private static WebElement Fullprotection_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Full Protection + Whitening, 4.0 oz']")
	private static WebElement Fullprotection_Txt;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement Fullprotection_Close;
	
	@FindBy(xpath = "//strong[text()='Tartar Control']")
	private static WebElement TartarControl;
	
//	@FindBy(xpath = "//img[@alt=\"Packshot photography of Sensodyne Tartar Control\"]")
//	private static WebElement TartarControl_Product;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[7]")
	private static WebElement TartarControl_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Tartar Control + Whitening 4.0 oz']")
	private static WebElement TartarControl_Txt;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement TartarControl_Close;
	
	@FindBy(xpath = "//strong[text()='Fresh Impact']")
	private static WebElement FreshImpact;
	
	@FindBy(xpath = "//img[@title=\"Packshot photography of Sensodyne Fresh Impact\"]")
	private static WebElement FreshImpact_product;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[8]")
	private static WebElement FreshImpact_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Fresh Impact, 4.0 oz']")
	private static WebElement FreshImpact_Txt;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement FreshImpact_Close;
	
	@FindBy(xpath = "//a[text()='Get your Coupon']")
	private static WebElement Getcoupon;
	
	@FindBy(xpath = "//a[text()='Find your Store']")
	private static WebElement Findstore;
	
	
	
	
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
	    	//moveToElement(OurproductsBreadcrumbs);
			clickElementUsingJavaScript(OurproductsBreadcrumbs);
		}
	    public void clickOnProductsResultsBreadCrumbs() throws Exception {
	    	//moveToElement(productResultBreadcrumbs);
			clickElementUsingJavaScript(productResultBreadcrumbs);
		}
	    public void clickOnSodiumLaurylSulphateToothpasteBreadCrumbs() throws Exception {
	    	moveToElement(SodiumlaurylsulphateToothpasteBreadcrumbs);
			clickElementUsingJavaScript(SodiumlaurylsulphateToothpasteBreadcrumbs);
		}
	    public void clickOnToothwhitening() throws Exception {
	    	moveToElement(Toothwhitening);
			clickElementUsingJavaScript(Toothwhitening);
		}
	    public void clickOnTartarControl() throws Exception {
	    	moveToElement(tartarcontrol);
			clickElementUsingJavaScript(tartarcontrol);
		}
	    public void clickOnFreshBreathe() throws Exception {
	    	moveToElement(freshBreathe);
			clickElementUsingJavaScript(freshBreathe);
		}
	    public void clickOnGetResults() throws Exception {
	    	scrollDownUsingElement(GetResults);
	    	moveToElement(GetResults);
			clickElementUsingJavaScript(GetResults);
		}
	    public void clickOnSensitivvecare() throws Exception {
	    	scrollDownUsingElement(GetResults);
	    	moveToElement(Sensitivecare);
			clickElementUsingJavaScript(Sensitivecare);
		}
	    public void clickOnSensitivvecareProducts() throws Exception {
	    	scrollDownUsingElement(GetResults);
	    	moveToElement(SensitivecareProduct);
			clickElementUsingJavaScript(SensitivecareProduct);
		}
	    public void clickOnSensitivecareBuyNow() throws Exception {
	    	scrollDownUsingElement(GetResults);
	    	moveToElement(BuyNowsensitivecare);
			clickElementUsingJavaScript(BuyNowsensitivecare);
			visibilityOf(BuyNowCloseSensitivecare);
			boolean elementIsDisplayed=elementIsDisplayed(BuyNowTxtSensitivecare);
			Assert.assertTrue(elementIsDisplayed);
			clickElementUsingJavaScript(BuyNowCloseSensitivecare);
		}
	    public void clickOnTrueWhite() throws Exception {
	    	scrollDownUsingElement(GetResults);
	    	//moveToElement(TrueWhite);
			clickElementUsingJavaScript(TrueWhite);
		}
	    public void clickOnTrueWhiteProducts() throws Exception {
	    	scrollDownUsingElement(GetResults);
	    	//moveToElement(TrueWhiteProduct);
			clickElementUsingJavaScript(TrueWhiteProduct);
		}
	    public void clickOnTrueWhiteBuyNow() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(GetResults);
	    	moveToElement(TrueWhiteBuyNow);
			clickElementUsingJavaScript(TrueWhiteBuyNow);
			visibilityOf(TrueWhiteBuyNowClose);
			boolean elementIsDisplayed=elementIsDisplayed(TrueWhiteBuyNowTxt);
			Assert.assertTrue(elementIsDisplayed);
			clickElementUsingJavaScript(TrueWhiteBuyNowClose);
		}
	    public void clickOnTrueWhiteMint() throws Exception {
	    	scrollDownUsingElement(GetResults);
	    	//moveToElement(TrueWhiteProduct);
			clickElementUsingJavaScript(TrueWhiteMint);
		}
//	    public void clickOnTrueWhiteMintProduct() throws Exception {
//	    	scrollDownUsingElement(GetResults);
//	    	//moveToElement(TrueWhiteProduct);
//			clickElementUsingJavaScript(TrueWhiteMintProduct);
//		}
	    public void clickOnTrueWhiteMintBuyNow() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(GetResults);
	    	moveToElement(TrueWhiteMintBuyNow);
			clickElementUsingJavaScript(TrueWhiteMintBuyNow);
			visibilityOf(TrueWhiteMintClose);
			boolean elementIsDisplayed=elementIsDisplayed(TrueWhiteMintTxt);
			Assert.assertTrue(elementIsDisplayed);
			clickElementUsingJavaScript(TrueWhiteMintClose);
		}
	    public void clickOnExtraWhitening() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(GetResults);
	    	//moveToElement(TrueWhiteProduct);
			clickElementUsingJavaScript(ExtraWhitening);
		}
//	    public void clickOnExtraWhiteningProduct() throws Exception {
//	    	waitForPageLoadJava();
//	    	scrollDownUsingElement(GetResults);
//	    	//moveToElement(TrueWhiteProduct);
//			clickElementUsingJavaScript(ExtraWhitening_product);
//		}
	    public void clickOnExtraWhiteningBuyNow() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(GetResults);
	    	moveToElement(ExtraWhitening_BuyNow);
			clickElementUsingJavaScript(ExtraWhitening_BuyNow);
			//visibilityOf(ExtraWhitening_Close);
			boolean elementIsDisplayed=elementIsDisplayed(ExtraWhitening_Txt);
			Assert.assertTrue(elementIsDisplayed);
			clickElementUsingJavaScript(ExtraWhitening_Close);
		}
	    public void clickOnFreshMint() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(GetResults);
	    	//moveToElement(TrueWhiteProduct);
			clickElementUsingJavaScript(FreshMint);
		}
	    public void clickOnFreshMint_Product() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(GetResults);
	    	//moveToElement(TrueWhiteProduct);
			clickElementUsingJavaScript(FreshMint_Product);
		}
	    public void clickOnFreshMintBuyNow() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(GetResults);
	    	moveToElement(FreshMint_BuyNow);
			clickElementUsingJavaScript(FreshMint_BuyNow);
			visibilityOf(FreshMint_Close);
			boolean elementIsDisplayed=elementIsDisplayed(FreshMint_Txt);
			Assert.assertTrue(elementIsDisplayed);
			clickElementUsingJavaScript(FreshMint_Close);
		}
	    public void clickOnFullProtection() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(GetResults);
	    	//moveToElement(TrueWhiteProduct);
			clickElementUsingJavaScript(Fullprotection);
		}
	    public void clickOnFullProtection_Product() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(GetResults);
	    	//moveToElement(TrueWhiteProduct);
			clickElementUsingJavaScript(Fullprotection_Product);
		}
	    public void clickOnFullprotectionBuyNow() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(GetResults);
	    	moveToElement(Fullprotection_BuyNow);
			clickElementUsingJavaScript(Fullprotection_BuyNow);
			//visibilityOf(Fullprotection_Close);
			boolean elementIsDisplayed=elementIsDisplayed(Fullprotection_Txt);
			Assert.assertTrue(elementIsDisplayed);
			clickElementUsingJavaScript(Fullprotection_Close);
		}
	    public void clickOnTarTarControl() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(GetResults);
	    	//moveToElement(TrueWhiteProduct);
			clickElementUsingJavaScript(tartarcontrol);
		}
//	    public void clickOnTarTarControl_product() throws Exception {
//	    	waitForPageLoadJava();
//	    	scrollDownUsingElement(GetResults);
//	    	//moveToElement(TrueWhiteProduct);
//			clickElementUsingJavaScript(TartarControl_Product);
//		}
	    public void clickOnTarTarControlBuyNow() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(GetResults);
	    	moveToElement(TartarControl_BuyNow);
			clickElementUsingJavaScript(TartarControl_BuyNow);
			//visibilityOf(TartarControl_Close);
			boolean elementIsDisplayed=elementIsDisplayed(TartarControl_Txt);
			Assert.assertTrue(elementIsDisplayed);
			clickElementUsingJavaScript(TartarControl_Close);
		}
	    public void clickOnFreshImpact() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(GetResults);
	    	//moveToElement(TrueWhiteProduct);
			clickElementUsingJavaScript(FreshImpact);
		}
	    public void clickOnFreshImpact_Product() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(GetResults);
	    	//moveToElement(TrueWhiteProduct);
			clickElementUsingJavaScript(FreshImpact_product);
		}
	    public void clickOnFreshImpactBuyNow() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(GetResults);
	    	moveToElement(FreshImpact_BuyNow);
			clickElementUsingJavaScript(FreshImpact_BuyNow);
			visibilityOf(FreshImpact_Close);
			boolean elementIsDisplayed=elementIsDisplayed(FreshImpact_Txt);
			Assert.assertTrue(elementIsDisplayed);
			clickElementUsingJavaScript(FreshImpact_Close);
		}
	    public void clickOnGetCoupon() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(FreshImpact_BuyNow);
	    	//moveToElement(TrueWhiteProduct);
			clickElementUsingJavaScript(Getcoupon);
		}
	    public void clickOnFindStore() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(FreshImpact_BuyNow);
	    	//moveToElement(TrueWhiteProduct);
			clickElementUsingJavaScript(Findstore);
		}
	    

	    
	    
	    
	    
	    
	    
	    
	    
}
