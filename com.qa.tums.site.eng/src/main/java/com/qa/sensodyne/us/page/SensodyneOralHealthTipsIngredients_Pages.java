package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneOralHealthTipsIngredients_Pages extends BaseClass {
	
	public SensodyneOralHealthTipsIngredients_Pages(){
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
	
	@FindBy(xpath = "(//a[@title=\"Oral Health Tips\"])[1]")
	private static WebElement OralHealthTips;

	@FindBy(xpath = "(//a[text()='Toothpaste for Sensitive Teeth - Ingredients | Sensodyne® '])[1]")
	private static WebElement Ingredients;
	
	@FindBy(xpath = "//strong[text()='Fluoride']")
	private static WebElement Header1;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/\"])[4]")
	private static WebElement Sensodyneproducts;
	
	@FindBy(xpath = "//strong[text()='Abrasives']")
	private static WebElement Header2;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/\"])[2]")
	private static WebElement SLSfreetoothpaste;
	
	@FindBy(xpath = "//a[text()='toothpastes for sensitive teeth']")
	private static WebElement ToothpastesensitiveTeeth;
	
	@FindBy(xpath = "//a[text()='relief for sensitive teeth']")
	private static WebElement ReliefsensitiveTeeth;
	
	@FindBy(xpath = "//strong[text()='Baking Soda']")
	private static WebElement Header3;
	
	@FindBy(xpath = "//a[text()='whitening toothpaste']")
	private static WebElement WhiteningToothpaste;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header4;
	
	@FindBy(xpath = "(//div[@class=\"col-xs-6 col-md-3 default-style\"])[1]//a")
	private static WebElement ChangeyourToothpasteBrand;
	
	@FindBy(xpath = "(//div[@class=\"col-xs-6 col-md-3 default-style\"])[2]//a")
	private static WebElement SensitiveTeethBadThing;
	
	@FindBy(xpath = "(//div[@class=\"col-xs-6 col-md-3 default-style\"])[3]//a")
	private static WebElement WhattodoTeethSensitivity;
	
	@FindBy(xpath = "(//div[@class=\"col-xs-6 col-md-3 default-style\"])[4]//a")
	private static WebElement DentistTips;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
    public void clickOnIngredients() throws Exception {
    	moveToElement(OralHealthTips);
		clickElementUsingJavaScript(Ingredients);
	}
    public void clickOnSensodyneProducts() throws Exception {
    	scrollDownUsingElement(Header1);
		clickElementUsingJavaScript(Sensodyneproducts);
	}
    public void clickOnSLSFreeToothpaste() throws Exception {
    	scrollDownUsingElement(Header2);
		clickElementUsingJavaScript(SLSfreetoothpaste);
	}
    public void clickOnToothpastesensitiveTeeth() throws Exception {
    	scrollDownUsingElement(SLSfreetoothpaste);
		clickElementUsingJavaScript(ToothpastesensitiveTeeth);
	}
    public void clickOnReliefsensitiveTeeth() throws Exception {
    	scrollDownUsingElement(ToothpastesensitiveTeeth);
		clickElementUsingJavaScript(ReliefsensitiveTeeth);
	}
    public void clickOnWhiteningToothpaste() throws Exception {
    	scrollDownUsingElement(ReliefsensitiveTeeth);
		clickElementUsingJavaScript(WhiteningToothpaste);
	}
    public void clickOnchangeyourToothpasteBrand() throws Exception {
    	scrollDownUsingElement(Header4);
		clickElementUsingJavaScript(ChangeyourToothpasteBrand);
	}
    public void clickOnSensitiveTeethBadThing() throws Exception {
    	scrollDownUsingElement(Header4);
		clickElementUsingJavaScript(SensitiveTeethBadThing);
	}
    public void clickOnWhattodoTeethSensitivity() throws Exception {
    	scrollDownUsingElement(Header4);
		clickElementUsingJavaScript(WhattodoTeethSensitivity);
	}
    public void clickOnDentistTips() throws Exception {
    	scrollDownUsingElement(Header4);
		clickElementUsingJavaScript(DentistTips);
	}
	
	
	
	
	
	
	
	
	
	
	

}
