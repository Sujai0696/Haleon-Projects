package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneNourishgentlySoothing_Pages extends BaseClass{
	
	public SensodyneNourishgentlySoothing_Pages() {
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
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd last is-current \"]")
	private static WebElement GumProtectionBreadcrumbs;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget btn ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
	private static WebElement BuyNowBtn;
	
	@FindBy(xpath = "//span[@class=\"ps-lightbox-close\"]")
	private static WebElement BuyNowClose;
	
	@FindBy(xpath = "//h2[text()='Sensodyne Nourish Gently Soothing 4.0 oz']")
	private static WebElement BuyNowTxt;
	
	@FindBy(xpath = "//a[text()='Sensodyne Nourish Sensitivity Toothpaste Healthy White']")
	private static WebElement SensodyneNourishToothpaste;
	
	@FindBy(xpath = "//strong[text()='Sensodyne Nourish Gently Soothing']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//li[@class=\"tabs-nav-item odd first is-active\"]")
	private static WebElement Ingredients;
	
	@FindBy(xpath = "//li[@class=\"tabs-nav-item even is-active\"]")
	private static WebElement DirectionsActive;
	
	@FindBy(xpath = "//span[text()='Directions']")
	private static WebElement Directions;
	
	@FindBy(xpath = "//li[@class=\"tabs-nav-item odd is-active\"]")
	private static WebElement WarningsActive;
	
	@FindBy(xpath = "//span[text()='Warnings']")
	private static WebElement Warnings;
	
	@FindBy(xpath = "//li[@class=\"tabs-nav-item even is-active\"]")
	private static WebElement MaterialsActive;
	
	@FindBy(xpath = "//span[text()='Materials']")
	private static WebElement Materials;
	
	@FindBy(xpath = "//li[@class=\"tabs-nav-item odd last is-active\"]")
	private static WebElement DietaryActive;
	
	@FindBy(xpath = "//span[text()='Dietary']")
	private static WebElement Dietary;
	
	@FindBy(xpath = "//span[text()='Frequently Asked Questions']")
	private static WebElement Header2;
	
	@FindBy(xpath = "//span[text()='Are Sensodyne Nourish toothpaste tubes recyclable?']")
	private static WebElement recyclable;
	
	@FindBy(xpath = "//li[@class=\"accordion-slide first odd is-active\"]")
	private static WebElement recyclableActive;
	
	@FindBy(xpath = "//span[text()='Is Sensodyne Nourish toothpaste vegan?']")
	private static WebElement ToothpasteVegan;
	
	@FindBy(xpath = "//li[@class=\"accordion-slide last even is-active\"]")
	private static WebElement ToothpasteVeganActive;
	
	@FindBy(xpath = "//span[text()='Most Popular Products']")
	private static WebElement Header3;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-rapid-relief-mint-toothpaste/\"])[3]")
	private static WebElement PopularProducts1;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-extra-whitening-toothpaste/\"])[2]")
	private static WebElement PopularProducts2;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-whitening-toothpaste/\"])[2]")
	private static WebElement PopularProducts3;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-complete-protection-extra-fresh-toothpaste/\"])[2]")
	private static WebElement PopularProducts4;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-fresh-mint-toothpaste/\"])[2]")
	private static WebElement PopularProducts5;
	
	@FindBy(xpath = "//a[text()='Get Your Coupon']")
	private static WebElement getcoupons;
	
	@FindBy(xpath = "//a[text()='Find Your Store']")
	private static WebElement findstore;
	
	
	
	
	
	
	
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
    public void clickOnGumProtectionBreadCrumbs() throws Exception {
    	moveToElement(GumProtectionBreadcrumbs);
		clickElementUsingJavaScript(GumProtectionBreadcrumbs);
	}
    public void clickOnBuyNowLink() throws Exception {
    	moveToElement(BuyNowBtn);
		clickElementUsingJavaScript(BuyNowBtn);
		visibilityOf(BuyNowClose);
		boolean elementIsDisplayed=elementIsDisplayed(BuyNowTxt);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
	}
    public void clickOnSensodyneNourishSensitivity() throws Exception {
    	moveToElement(SensodyneNourishToothpaste);
		clickElementUsingJavaScript(SensodyneNourishToothpaste);
	}
    public void clickOnIngredients() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(Ingredients);
		clickElementUsingJavaScript(Ingredients);
	}
    public void clickOnDirection() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Header1);
    	moveToElement(Directions);
		clickElementUsingJavaScript(Directions);
		visibilityOf(DirectionsActive);
		Assert.assertTrue(elementIsDisplayed(DirectionsActive));
	}
    public void clickOnWarnings() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Header1);
    	moveToElement(Warnings);
		clickElementUsingJavaScript(Warnings);
		visibilityOf(WarningsActive);
		Assert.assertTrue(elementIsDisplayed(WarningsActive));
	}
    public void clickOnMaterials() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Header1);
    	moveToElement(Materials);
		clickElementUsingJavaScript(Materials);
		visibilityOf(MaterialsActive);
		Assert.assertTrue(elementIsDisplayed(MaterialsActive));
	}
    public void clickOnDietary() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Header1);
    	moveToElement(Dietary);
		clickElementUsingJavaScript(Dietary);
		visibilityOf(DietaryActive);
		Assert.assertTrue(elementIsDisplayed(DietaryActive));
	}
    public void clickOnRecyclable() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Header2);
    	moveToElement(recyclable);
		clickElementUsingJavaScript(recyclable);
		visibilityOf(recyclableActive);
		Assert.assertTrue(elementIsDisplayed(recyclableActive));
	}
    public void clickOnToothpasteVegan() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Header2);
    	moveToElement(ToothpasteVegan);
		clickElementUsingJavaScript(ToothpasteVegan);
		visibilityOf(ToothpasteVeganActive);
		Assert.assertTrue(elementIsDisplayed(ToothpasteVeganActive));
		
	}
    public void clickOnPopularProducts1() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Header3);
    	moveToElement(PopularProducts1);
		clickElementUsingJavaScript(PopularProducts1);	
	}
    public void clickOnPopularProducts2() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Header3);
    	moveToElement(PopularProducts2);
		clickElementUsingJavaScript(PopularProducts2);	
	}
    public void clickOnPopularProducts3() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Header3);
    	moveToElement(PopularProducts3);
		clickElementUsingJavaScript(PopularProducts3);	
	}
    public void clickOnPopularProducts4() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Header3);
    	moveToElement(PopularProducts4);
		clickElementUsingJavaScript(PopularProducts4);	
	}
    public void clickOnPopularProducts5() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Header3);
    	moveToElement(PopularProducts5);
		clickElementUsingJavaScript(PopularProducts5);	
	}
    public void clickOnGetCoupons() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Header3);
    	moveToElement(getcoupons);
		clickElementUsingJavaScript(getcoupons);	
	}
    public void clickOnFindStore() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Header3);
    	moveToElement(findstore);
		clickElementUsingJavaScript(findstore);	
	}
	
	

}
