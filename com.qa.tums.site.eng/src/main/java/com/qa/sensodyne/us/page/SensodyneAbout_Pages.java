package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneAbout_Pages extends BaseClass{
	
	public SensodyneAbout_Pages(){
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

	@FindBy(xpath = "(//a[@href=\"/en-us/about-sensodyne/\"])[1]")
	private static WebElement AboutSensodyne;
	
	@FindBy(xpath = "(//li[@class=\"breadcrumb-list-item odd first \"])[2]")
	private static WebElement AboutHome_BreadCrumbs;
	
	@FindBy(xpath = "(//li[@class=\"breadcrumb-list-item even last is-current \"])[2]")
	private static WebElement AboutSensodyne_BreadCrumbs;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/product-results/fast-sensitive-teeth-relief-toothpaste/\"])[3]")
	private static WebElement PainRelief;
	
	@FindBy(xpath = "//a[@href=\"#footnote-1\"]")
	private static WebElement FootNote1;
	
	@FindBy(xpath = "//a[@href=\"#footnote-2\"]")
	private static WebElement FootNote2;
	
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/\"])[4]")
	private static WebElement Products;
	
	@FindBy(xpath = "(//span[@class=\"highlight-text\"])[1]")
	private static WebElement SensitiveTeeth;
	
	@FindBy(xpath = "//a[text()='See How Our Ingredients Work']")
	private static WebElement IngredientsWork;
	
	@FindBy(xpath = "(//a[@href=\"#footnote-3\"])[1]")
	private static WebElement FootNote3;
	
	@FindBy(xpath = "//a[text()='Symptoms of sensitive teeth']")
	private static WebElement SymptonsSensitiveTeeth;
	
	@FindBy(xpath = "(//a[@href=\"#footnote-3\"])[2]")
	private static WebElement FootNote_3;
	
	@FindBy(xpath = "//a[@href=\"#footnote-4\"]")
	private static WebElement FootNote4;
	
	@FindBy(xpath = "//h2[text()='Causes of Sensitive Teeth']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//a[@href=\"#footnote-5\"]")
	private static WebElement FootNote5;
	
	@FindBy(xpath = "//a[text()='products to help relieve tooth sensitivity here']")
	private static WebElement RelieveToothSensitive;
	
	@FindBy(xpath = "//a[text()='Find the Right Toothpaste']")
	private static WebElement RightToothPaste;
	
	@FindBy(xpath = "//strong[text()='SOURCES']")
	private static WebElement Header2;
	
	@FindBy(xpath = "//a[text()='Get Your Coupon']")
	private static WebElement GetCoupons;
	
	@FindBy(xpath = "(//a[text()='Explore Our Products'])[1]")
	private static WebElement ExploreProducts;
	
	@FindBy(xpath = "//a[text()='Sensodyne toothpaste']")
	private static WebElement SensodyneToothpastes;
	
	@FindBy(xpath = "//a[text()='sensitive teeth']")
	private static WebElement SensodyneTeeth;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header3;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/about-sensodyne/ingredients/\"])[4]")
	private static WebElement Article1;
	
	@FindBy(xpath = "//a[text()='Sensodyne Products']")
	private static WebElement Article2;
	
	@FindBy(xpath = "//a[text()='Treating Sensitive Teeth']")
	private static WebElement Article3;
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief: Engineered for Speed']")
	private static WebElement Article4;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Methods//
	
	public void clickCookieBtn() throws Exception {
        //elementToBeClickable(cookieBtn);
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
        //elementToBeClickable(gigyaForm);
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
    public void clickOnAboutSensodyne() throws Exception {
		elementClick(AboutSensodyne);
	}
    public void clickOnAboutHomeBreadcrumbs() throws Exception {
		moveToElement(AboutSensodyne);
		elementClick(AboutHome_BreadCrumbs);
	}
    public void clickOnAboutSensodyne_Breadcrumbs() throws Exception {
		moveToElement(AboutSensodyne);
		elementClick(AboutSensodyne_BreadCrumbs);
	}
    public void clickOnPainRelief() throws Exception {
		scrollDownUsingElement(PainRelief);
		clickElementUsingJavaScript(PainRelief);
	}
    public void clickOnFootNote1() throws Exception {
		scrollDownUsingElement(PainRelief);
		clickElementUsingJavaScript(FootNote1);
	}
    public void clickOnFootNote2() throws Exception {
		scrollDownUsingElement(PainRelief);
		clickElementUsingJavaScript(FootNote2);
	}
    
    public void clickOnProducts() throws Exception {
		scrollDownUsingElement(Products);
		clickElementUsingJavaScript(Products);
	}
    public void clickOnSensitiveTeeth() throws Exception {
		scrollDownUsingElement(Products);
		clickElementUsingJavaScript(SensitiveTeeth);
	}
    public void clickOnIngredientsWork() throws Exception {
		scrollDownUsingElement(SensitiveTeeth);
		clickElementUsingJavaScript(IngredientsWork);
	}
    public void clickOnFootNote3() throws Exception {
		scrollDownUsingElement(IngredientsWork);
		clickElementUsingJavaScript(FootNote3);
	}
    public void clickOnSymptonsSensitiveTeeth() throws Exception {
		scrollDownUsingElement(FootNote3);
		clickElementUsingJavaScript(SymptonsSensitiveTeeth);
	}
    public void clickOnFootNote_3() throws Exception {
		scrollDownUsingElement(SymptonsSensitiveTeeth);
		clickElementUsingJavaScript(FootNote_3);
	}
    public void clickOnFootNote4() throws Exception {
		scrollDownUsingElement(SymptonsSensitiveTeeth);
		clickElementUsingJavaScript(FootNote4);
	}
    public void clickOnFootNote5() throws Exception {
		scrollDownUsingElement(Header1);
		clickElementUsingJavaScript(FootNote5);
	}
    public void clickOnRelieveToothSensitiveHere() throws Exception {
		scrollDownUsingElement(FootNote5);
		clickElementUsingJavaScript(RelieveToothSensitive);
	}
    public void clickOnRightToothPaste() throws Exception {
		scrollDownUsingElement(Header2);
		clickElementUsingJavaScript(RightToothPaste);
	}
    public void clickOnGetCoupons() throws Exception {
		scrollDownUsingElement(Header2);
		clickElementUsingJavaScript(GetCoupons);
	}
    public void clickOnExploreProducts() throws Exception {
		scrollDownUsingElement(GetCoupons);
		clickElementUsingJavaScript(ExploreProducts);
	}
    public void clickOnSensodyneToothPastes() throws Exception {
		scrollDownUsingElement(ExploreProducts);
		moveToElement(SensodyneToothpastes);
		clickElementUsingJavaScript(SensodyneToothpastes);
	}
    public void clickOnSensitiveTeeths() throws Exception {
		scrollDownUsingElement(ExploreProducts);
		moveToElement(SensodyneTeeth);
		clickElementUsingJavaScript(SensodyneTeeth);
	}
    public void clickOnArticle1() throws Exception {
		//scrollDownUsingElement(Header3);
		moveToElement(Article1);
		clickElementUsingJavaScript(Article1);
	}
    public void clickOnArticle2() throws Exception {
		moveToElement(Article2);
		clickElementUsingJavaScript(Article2);
	}
    public void clickOnArticle3() throws Exception {
    	//scrollDownUsingElement(Header3);
		moveToElement(Article3);
		clickElementUsingJavaScript(Article3);
	}
    public void clickOnArticle4() throws Exception {
		moveToElement(Article4);
		clickElementUsingJavaScript(Article4);
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
