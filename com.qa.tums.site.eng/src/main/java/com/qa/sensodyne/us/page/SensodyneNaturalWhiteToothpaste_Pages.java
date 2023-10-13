package com.qa.sensodyne.us.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneNaturalWhiteToothpaste_Pages extends BaseClass {
	
	public SensodyneNaturalWhiteToothpaste_Pages(){
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
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd last is-current \"]")
	private static WebElement SensodyneNaturalWhitesBreadCrumbs;
	
	@FindBy(xpath = "(//a[@class=\"ps-widget btn ps-5b6e03fcd6cbbe001fa936ea ps-enabled\"])[1]")
	private static WebElement BuyNow;
	
	@FindBy(xpath = "//div[@class=\"ps-header\"]")
	private static WebElement BuyNowClose;
	
	@FindBy(xpath = "//span[text()='Frequently Asked Questions']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//span[text()='Ingredients']")
	private static WebElement Ingredients;
	
	@FindBy(xpath = "//span[text()='Directions']")
	private static WebElement Directions;
	
	@FindBy(xpath = "//span[text()='Warnings']")
	private static WebElement Warnings;
	
	@FindBy(xpath = "//span[text()='Materials']")
	private static WebElement Materials;
	
	@FindBy(xpath = "//header[@class=\"accordion-head\"]")
	private static WebElement QuestionClose;
	
	@FindBy(xpath = "//li[@class=\"accordion-slide first last odd is-active\"]")
	private static WebElement QuestionOpen;

	@FindBy(xpath = "//span[text()='Most Popular Products']")
	private static WebElement Header2;

	@FindBy(xpath = "//a[text()='Rapid Relief']")
	private static WebElement PopularProducts1;
	
	@FindBy(xpath = "//span[text()='Extra Whitening']")
	private static WebElement PopularProducts2;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-repair-protect-whitening-toothpaste/\"])[2]")
	private static WebElement PopularProducts3;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-complete-protection-extra-fresh-toothpaste/\"])[2]")
	private static WebElement PopularProducts4;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-fresh-mint-toothpaste/\"])[2]")
	private static WebElement PopularProducts5;
	
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
    public void clickOnSensodyneNaturalWhiteBreadcrumbs() throws Exception {
    	moveToElement(SensodyneNaturalWhitesBreadCrumbs);
		clickElementUsingJavaScript(SensodyneNaturalWhitesBreadCrumbs);
	}
    public void clickOnBuyNow() throws Exception {
    	scrollDownUsingElement(SensodyneNaturalWhitesBreadCrumbs);
    	moveToElement(BuyNow);
		clickElementUsingJavaScript(BuyNow);
		visibilityOf(BuyNowClose);
		boolean ElementIsDisplayed=elementIsDisplayed(BuyNowClose);
		Assert.assertTrue(ElementIsDisplayed);
		clickElementUsingJavaScript(BuyNowClose);
	}
    public void clickOnIngredients() throws Exception {
    	scrollupUsingElement(Header1);
    	moveToElement(Ingredients);
		clickElementUsingJavaScript(Ingredients);
	}
    public void clickOnDirections() throws Exception {
    	scrollupUsingElement(Header1);
    	moveToElement(Directions);
		clickElementUsingJavaScript(Directions);
	}
    public void clickOnWarnings() throws Exception {
    	scrollupUsingElement(Header1);
    	moveToElement(Warnings);
		clickElementUsingJavaScript(Warnings);
	}
    public void clickOnMaterials() throws Exception {
    	scrollupUsingElement(Header1);
    	moveToElement(Materials);
		clickElementUsingJavaScript(Materials);
	}
    public void clickOnQuestion() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(QuestionClose);
		clickElementUsingJavaScript(QuestionClose);
		visibilityOf(QuestionOpen);
		boolean elementIsDisplayed=elementIsDisplayed(QuestionOpen);
		Assert.assertTrue(elementIsDisplayed);
		clickElementUsingJavaScript(QuestionOpen);
	}
    public void clickOnPopularProducts1() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(PopularProducts1);
		clickElementUsingJavaScript(PopularProducts1);
	}
    public void clickOnPopularProducts2() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(PopularProducts2);
		clickElementUsingJavaScript(PopularProducts2);
	}
    public void clickOnPopularProducts3() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(PopularProducts3);
		clickElementUsingJavaScript(PopularProducts3);
	}
    public void clickOnPopularProducts4() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(PopularProducts4);
		clickElementUsingJavaScript(PopularProducts4);
	}
    public void clickOnPopularProducts5() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(PopularProducts5);
		clickElementUsingJavaScript(PopularProducts5);
	}
    public void clickOnGetCoupons() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(GetCoupons);
		clickElementUsingJavaScript(GetCoupons);
	}
    public void clickOnFindStore() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(FindStore);
		clickElementUsingJavaScript(FindStore);
	}
	
	
	
	

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
