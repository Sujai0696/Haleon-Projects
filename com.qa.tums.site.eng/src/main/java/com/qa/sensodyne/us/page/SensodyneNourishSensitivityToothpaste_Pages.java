package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneNourishSensitivityToothpaste_Pages extends BaseClass{
	
	public SensodyneNourishSensitivityToothpaste_Pages(){
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
	private static WebElement OurproductsBreadCrumbs;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd last is-current \"]")
	private static WebElement OurproductsMainBreadCrumbs;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget btn ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
	private static WebElement BuyNowBtn;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement BuyNowClose;
	
	@FindBy(xpath = "//a[text()='Sensodyne Nourish Sensitivity Toothpaste Gently Soothing']")
	private static WebElement ToothpasteGentlySoothing;
	
	@FindBy(xpath = "//h2[text()=' DENTIST RECOMMENDED TOOTHPASTE BRAND FOR SENSITIVE TEETH']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//span[text()='Ingredients']")
	private static WebElement Ingredients;
	
	@FindBy(xpath = "//span[text()='Directions']")
	private static WebElement Directions;
	
	@FindBy(xpath = "//span[text()='Warnings']")
	private static WebElement Warnings;
	
	@FindBy(xpath = "//span[text()='Materials']")
	private static WebElement Materials;
	
	@FindBy(xpath = "//span[text()='Dietary']")
	private static WebElement Dietary;
	
	@FindBy(xpath = "//li[@class=\"accordion-slide first odd\"]")
	private static WebElement Question1;
	
	@FindBy(xpath = "(//header[@class=\"accordion-head\"])[1]")
	private static WebElement Question1Open;
	
	
	@FindBy(xpath = "//span[text()='Frequently Asked Questions']")
	private static WebElement Header2;
	
	@FindBy(xpath = "//li[@class=\"accordion-slide last even\"]")
	private static WebElement QuestionClose;
	
	@FindBy(xpath = "(//header[@class=\"accordion-head\"])[2]")
	private static WebElement QuestionOpen;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']")
	private static WebElement Header3;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-mint-toothpaste/\"])[3]")
	private static WebElement popularProducts1;
	
	@FindBy(xpath = "//span[text()='Extra Whitening']")
	private static WebElement popularProducts2;
	
	@FindBy(xpath = "//a[text()='Repair and Protect']")
	private static WebElement popularProducts3;
	
	@FindBy(xpath = "//a[text()='Complete Protection']")
	private static WebElement popularProducts4;
	
	@FindBy(xpath = "(//span[@class=\"related-product-title\"])[5]//parent::a")
	private static WebElement popularProducts5;
	
	@FindBy(xpath = "//a[text()='Get Your Coupon']")
	private static WebElement GetCoupons;
	
	@FindBy(xpath = "//a[text()='Find Your Store']")
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
    public void clickOnOurProductsBreadcrumbs() throws Exception {
    	moveToElement(OurproductsBreadCrumbs);
		clickElementUsingJavaScript(OurproductsBreadCrumbs);
	}
    public void clickOnOurProductsMainBreadcrumbs() throws Exception {
    	moveToElement(OurproductsMainBreadCrumbs);
		clickElementUsingJavaScript(OurproductsMainBreadCrumbs);
	}
    public void clickOnBuyNow() throws Exception {
    	scrollDownUsingElement(OurproductsMainBreadCrumbs);
    	moveToElement(BuyNowBtn);
		clickElementUsingJavaScript(BuyNowBtn);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowClose);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
	}
    public void clickOnToothpasteGentlySoothing() throws Exception {
    	scrollDownUsingElement(BuyNowBtn);
    	moveToElement(ToothpasteGentlySoothing);
		clickElementUsingJavaScript(ToothpasteGentlySoothing);
	}
    public void clickOnIngredientsTable() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(Ingredients);
		clickElementUsingJavaScript(Ingredients);
	}
    public void clickOnDirectionsTable() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(Directions);
		clickElementUsingJavaScript(Directions);
	}
    public void clickOnWarningsTable() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(Warnings);
		clickElementUsingJavaScript(Warnings);
	}
    public void clickOnMaterialTable() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(Materials);
		clickElementUsingJavaScript(Materials);
	}
    public void clickOnDietaryTable() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(Dietary);
		clickElementUsingJavaScript(Dietary);
	}
    public void clickOnQuestion1() throws Exception {
    	scrollDownUsingElement(Header2);
    	//moveToElement(Question1Open);
		clickElementUsingJavaScript(Question1);
		visibilityOf(Question1Open);
		boolean elementIsDisplayed=elementIsDisplayed(Question1Open);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(Question1Open);
	}
    public void clickOnQuestion2() throws Exception {
    	scrollDownUsingElement(Header2);
    	//moveToElement(Question1Open);
		clickElementUsingJavaScript(QuestionClose);
		visibilityOf(QuestionOpen);
		boolean elementIsDisplayed=elementIsDisplayed(QuestionOpen);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(QuestionOpen);
	}
    public void clickOnPopularProducts1() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(popularProducts1);
		clickElementUsingJavaScript(popularProducts1);
	}
    public void clickOnPopularProducts2() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(popularProducts2);
		clickElementUsingJavaScript(popularProducts2);
	}
    public void clickOnPopularProducts3() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(popularProducts3);
		clickElementUsingJavaScript(popularProducts3);
	}
    public void clickOnPopularProducts4() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(popularProducts4);
		clickElementUsingJavaScript(popularProducts4);
	}
    public void clickOnPopularProducts5() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(popularProducts5);
		clickElementUsingJavaScript(popularProducts5);
	}
    public void clickOnGetCoupons() throws Exception {
    	scrollDownUsingElement(Header3);
    	//moveToElement(GetCoupons);
		clickElementUsingJavaScript(GetCoupons);
	}
    public void clickOnFindStore() throws Exception {
    	scrollDownUsingElement(Header3);
    	//moveToElement(FindStore);
		clickElementUsingJavaScript(FindStore);
	}
	
	
	

    
    
    
    
    
    
    
    
    
    
    
}
