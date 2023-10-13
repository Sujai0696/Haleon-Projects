package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneCompleteProtectionToothpaste_Pages extends BaseClass{
	
	public SensodyneCompleteProtectionToothpaste_Pages() {
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
	private static WebElement CompleteTprotectionToothpasteBreadcrumbs;
		
	@FindBy(xpath = "//a[text()='tooth whitening']")
	private static WebElement Toothwhitening;
		
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/\"])[3]")
	private static WebElement Result;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitivity-and-gum-fresh-clean-toothpaste/\"])[2]")
	private static WebElement sensitivitygumcleanfresh;
	
	@FindBy(xpath = "//img[@alt=\" Packshot photography of Sensodyne Sensitivity & Gum Clean & Fresh\"]")
	private static WebElement sensitivitygumcleanfresh_img;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
	private static WebElement sensitivitygumcleanfresh_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Sensitivity & Gum, Clean & Fresh 3.4 oz']")
	private static WebElement BuyNow_Text;
	
	@FindBy(xpath = "//span[@class=\"ps-lightbox-close\"]")
	private static WebElement BuyNow_close;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-sensitivity-and-gum-mint-toothpaste/\"])[3]")
	private static WebElement Sensitivitygum_mint;
	
	@FindBy(xpath = "//img[@alt=\"Sensodyne Sensitivity & Gum Mint Toothpaste\"]")
	private static WebElement Sensitivitygum_mint_img;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[2]")
	private static WebElement Sensitivitygum_mint_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Sensitivity & Gum, Mint 3.4 oz']")
	private static WebElement Sensitivitygum_mint_txt;
	
	@FindBy(xpath = "(//span[@tabindex=\"0\"])[4]")
	private static WebElement Sensitivitygum_mint_BuyNowClose;
	
	@FindBy(xpath = "//a[@href=\"/en-us/products/sensodyne-sensitive-care-toothbrush/\"]")
	private static WebElement Sensitivitycare_toothbrush;
	
	@FindBy(xpath = "//img[@alt=\"Packshot photography of Sensodyne Sensitive Care Toothbrush\"]")
	private static WebElement Sensitivitycare_toothbrush_img;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[3]")
	private static WebElement Sensitivitycare_toothbrush_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Sensitive Care Toothbrush']")
	private static WebElement Sensitivitycare_toothbrush_txt;
	
	@FindBy(xpath = "(//span[@class=\"ps-lightbox-close\"])[3]")
	private static WebElement Sensitivitycare_toothbrush_close;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-complete-protection-extra-fresh-toothpaste/\"])[2]")
	private static WebElement completeprotectionextrafresh;
	
	@FindBy(xpath = "//img[@alt=\"Packshot photography of Sensodyne Complete Protection Extra Fresh\"]")
	private static WebElement completeprotectionextrafresh_img;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[4]")
	private static WebElement completeprotectionextrafresh_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Complete Protection, Extra Fresh 3.4 oz']")
	private static WebElement completeprotectionextrafresh_txt;
	
	@FindBy(xpath = "(//div[@class=\"ps-header\"])[4]")
	private static WebElement completeprotectionextrafresh_Close;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-complete-protection-toothpaste/\"])[2]")
	private static WebElement completeprotection;
	
	@FindBy(xpath = "//img[@alt=\"Packshot photography of Sensodyne Complete Protection\"]")
	private static WebElement completeprotection_img;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[5]")
	private static WebElement completeprotection_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Complete Protection, Original 3.4 oz']")
	private static WebElement completeprotection_txt;
	
	@FindBy(xpath = "(//span[@aria-label=\"Close the shop now dialog box / popup.\"])[5]")
	private static WebElement completeprotection_buynowclose;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-full-protection-toothpaste/\"])[2]")
	private static WebElement fullprotection;
	
	@FindBy(xpath = "//img[@alt=\"Packshot photography of Sensodyne Full Protection\"]")
	private static WebElement fullprotection_img;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget ps-landing ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[6]")
	private static WebElement fullprotection_BuyNow;
	
	@FindBy(xpath = "//h2[text()='Full Protection + Whitening, 4.0 oz']")
	private static WebElement fullprotection_txt;
	
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
    public void clickOnProductsResultsBreadCrumbs() throws Exception {
    	moveToElement(productResultBreadcrumbs);
		clickElementUsingJavaScript(productResultBreadcrumbs);
	}
    public void clickOnCompleteProtectionToothpasteBreadCrumbs() throws Exception {
    	moveToElement(CompleteTprotectionToothpasteBreadcrumbs);
		clickElementUsingJavaScript(CompleteTprotectionToothpasteBreadcrumbs);
	}
    public void clickOnToothWhitening() throws Exception {
    	moveToElement(Toothwhitening);
		clickElementUsingJavaScript(Toothwhitening);
	}
    public void clickOnGetResults() throws Exception {
    	moveToElement(Result);
		clickElementUsingJavaScript(Result);
	}
    public void clickOnsensitivitygumcleanfresh() throws Exception {
    	moveToElement(sensitivitygumcleanfresh);
		clickElementUsingJavaScript(sensitivitygumcleanfresh);
	}
    public void clickOnsensitivitygumcleanfresh_img() throws Exception {
    	moveToElement(sensitivitygumcleanfresh_img);
		clickElementUsingJavaScript(sensitivitygumcleanfresh_img);
	}
    public void clickOnsensitivitygumcleanfresh_BuyNow() throws Exception {
    	moveToElement(sensitivitygumcleanfresh_BuyNow);
		clickElementUsingJavaScript(sensitivitygumcleanfresh_BuyNow);
		visibilityOf(BuyNow_close);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNow_Text);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNow_close);
		refreshWebPage();
	}
    public void clickOnsensitivitygum_mint() throws Exception {
    	moveToElement(Sensitivitygum_mint);
		clickElementUsingJavaScript(Sensitivitygum_mint);
	}
    public void clickOnsensitivitygum_mint_image() throws Exception {
    	moveToElement(Sensitivitygum_mint_img);
		clickElementUsingJavaScript(Sensitivitygum_mint_img);
	}
    public void clickOnsensitivitygum_mint_BuyNow() throws Exception {
    	moveToElement(Sensitivitygum_mint_BuyNow);
		clickElementUsingJavaScript(Sensitivitygum_mint_BuyNow);
		//visibilityOf(Sensitivitygum_mint_BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(Sensitivitygum_mint_txt);
		Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(Sensitivitygum_mint_BuyNowClose);
		refreshWebPage();
	}
    public void clickOnsensitivitycaretoothbrush() throws Exception {
    	moveToElement(Sensitivitycare_toothbrush);
		clickElementUsingJavaScript(Sensitivitycare_toothbrush);
	}
    public void clickOnsensitivitycaretoothbrush_Img() throws Exception {
    	moveToElement(Sensitivitycare_toothbrush_img);
		clickElementUsingJavaScript(Sensitivitycare_toothbrush_img);
	}
    public void clickOnsensitivitycaretoothbrush_BuyNow() throws Exception {
    	moveToElement(Sensitivitycare_toothbrush_BuyNow);
		clickElementUsingJavaScript(Sensitivitycare_toothbrush_BuyNow);
		//visibilityOf(Sensitivitycare_toothbrush_close);
		boolean elementIsDisplayed=elementIsDisplayed(Sensitivitycare_toothbrush_txt);
		Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(Sensitivitycare_toothbrush_close);
		refreshWebPage();
	}
    public void clickOncompleteprotectionextrafresh() throws Exception {
    	moveToElement(completeprotectionextrafresh);
		clickElementUsingJavaScript(completeprotectionextrafresh);
	}
    public void clickOncompleteprotectionextrafresh_Image() throws Exception {
    	moveToElement(completeprotectionextrafresh_img);
		clickElementUsingJavaScript(completeprotectionextrafresh_img);
	}
    public void clickOnCompleteprotectionextrafresh_BuyNow() throws Exception {
    	moveToElement(completeprotectionextrafresh_BuyNow);
		clickElementUsingJavaScript(completeprotectionextrafresh_BuyNow);
		//visibilityOf(completeprotectionextrafresh_Close);
		boolean elementIsDisplayed=elementIsDisplayed(completeprotectionextrafresh_txt);
		Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(completeprotectionextrafresh_Close);
		refreshWebPage();
	}
    public void clickOncompleteprotection() throws Exception {
    	moveToElement(completeprotection);
		clickElementUsingJavaScript(completeprotection);
	}
    public void clickOncompleteprotection_Image() throws Exception {
    	moveToElement(completeprotection_img);
		clickElementUsingJavaScript(completeprotection_img);
	}
    public void clickOnCompleteprotection_BuyNow() throws Exception {
    	moveToElement(completeprotection_BuyNow);
		clickElementUsingJavaScript(completeprotection_BuyNow);
		//visibilityOf(completeprotectionextrafresh_Close);
		boolean elementIsDisplayed=elementIsDisplayed(completeprotection_txt);
		Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(completeprotectionextrafresh_Close);
		refreshWebPage();
	}
    public void clickOnfullprotection() throws Exception {
    	moveToElement(fullprotection);
		clickElementUsingJavaScript(fullprotection);
	}
    public void clickOnfullprotection_Image() throws Exception {
    	//moveToElement(fullprotection_img);
		clickElementUsingJavaScript(fullprotection_img);
	}
    public void clickOnfullprotection_BuyNow() throws Exception {
    	moveToElement(fullprotection_BuyNow);
		clickElementUsingJavaScript(fullprotection_BuyNow);
		//visibilityOf(completeprotectionextrafresh_Close);
		boolean elementIsDisplayed=elementIsDisplayed(fullprotection_txt);
		Assert.assertTrue(elementIsDisplayed);
		//clickElementUsingJavaScript(completeprotectionextrafresh_Close);
		refreshWebPage();
	}
    public void clickOngetcoupon() throws Exception {
    	moveToElement(getcoupon);
		clickElementUsingJavaScript(getcoupon);
	}
    public void clickOnfindyourstore() throws Exception {
    	moveToElement(findyourstore);
		clickElementUsingJavaScript(findyourstore);
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
