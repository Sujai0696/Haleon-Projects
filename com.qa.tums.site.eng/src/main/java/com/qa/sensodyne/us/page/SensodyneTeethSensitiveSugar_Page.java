package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneTeethSensitiveSugar_Page extends BaseClass{
	
	public SensodyneTeethSensitiveSugar_Page(){
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
	
	@FindBy(xpath = "(//a[@title='Understanding Sensitivity'])[1]")
	private static WebElement UnderstandingSensitivity;
	
	@FindBy(xpath = "(//a[@title=\"Teeth Sensitive to Sugar\"])[1]")
	private static WebElement SensitiveSugar;
	
	
	@FindBy(xpath = "(//li[@class=\"breadcrumb-list-item odd first \"])[1]")
	private static WebElement HomeIcon_Bread;
	
	@FindBy(xpath = "(//li[@class=\"breadcrumb-list-item even \"])[1]")
	private static WebElement UnderstandingSenstivity_Bread;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/understanding-tooth-sensitivity/teeth-sensitive-to-sugar/\"])[3]")
	private static WebElement TeethSensitiveSugar_Bread;
	
	@FindBy(xpath = "//h2[text()='Sweets and Tooth Sensitivity']")
	private static WebElement Header1;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/understanding-tooth-sensitivity/\"])[4]")
	private static WebElement UnderstandingToothSensitivity;
	
	@FindBy(xpath = "//h2[text()='What Treatments Are Available for Sensitive Teeth?']")
	private static WebElement Header2;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/about-sensodyne/ingredients/\"])[3]")
	private static WebElement AboutSensodyneIngredients;
	
	@FindBy(xpath = "//h2[text()='How to Manage Teeth Sensitive to Sugar']")
	private static WebElement Header3;
	
	@FindBy(xpath = "//a[@href=\"https://www.pronamel.us/products/multi-action-toothpaste/\"]")
	private static WebElement multiactiontoothpaste;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header4;
	
	@FindBy(xpath = "(//div[@class=\"component-content left\"])[11]")
	private static WebElement OralHealthTips;
	
	@FindBy(xpath = "//a[@href=\"/en-us/oral-health-tips/oral-health-tips-and-tricks/\"]")
	private static WebElement OralHealthTipsLink;
	
	@FindBy(xpath = "//a[@href=\"/en-us/oral-health-tips/can-you-brush-teeth-too-hard/\"]")
	private static WebElement BrushYourTeeth;
	
	@FindBy(xpath = "//a[text()='Can Having Sensitive Teeth Be A Bad Thing?']")
	private static WebElement SensitiveTeethBadThing;
	
	@FindBy(xpath = "//a[@href=\"/en-us/oral-health-tips/dentist-wants-people-to-know-about-sensitive-teeth/\"]")
	private static WebElement KnowAboutSensitiveTeeth;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
    public void clickOnTeethSensitiveSugar() throws Exception {
    	moveToElement(UnderstandingSensitivity);
    	clickElementUsingJavaScript(SensitiveSugar);
	}
    public void clickOnHomeIcon_bread() throws Exception {
    	clickElementUsingJavaScript(HomeIcon_Bread);
	}
    public void clickOnUnderstandingSensitivity_bread() throws Exception {
    	clickElementUsingJavaScript(UnderstandingSenstivity_Bread);
	}
    public void clickOnTeethSensitiveSugar_bread() throws Exception {
    	clickElementUsingJavaScript(TeethSensitiveSugar_Bread);
	}
    public void clickOnToothSensitivity() throws Exception {
    	scrollDownUsingElement(Header1);
    	clickElementUsingJavaScript(UnderstandingToothSensitivity);
	}
    public void clickOnAboutSensitiveIngredients() throws Exception {
    	scrollDownUsingElement(Header2);
    	clickElementUsingJavaScript(AboutSensodyneIngredients);
	}
    public void clickOnmultiAction() throws Exception {
    	scrollDownUsingElement(Header3);
    	clickElementUsingJavaScript(multiactiontoothpaste);
	}
    public void clickOnOralHealthTips() throws Exception {
    	scrollDownUsingElement(Header4);
    	elementClick(OralHealthTips);
	}
    public void clickOnOralHealthTipsLink() throws Exception {
    	scrollDownUsingElement(Header4);
    	clickElementUsingJavaScript(OralHealthTipsLink);
	}
    public void clickOnBrushYourTeethLink() throws Exception {
    	scrollDownUsingElement(Header4);
    	clickElementUsingJavaScript(BrushYourTeeth);
	}
    public void clickOnSensitiveTeethBadThingLink() throws Exception {
    	scrollDownUsingElement(Header4);
    	clickElementUsingJavaScript(SensitiveTeethBadThing);
	}
    public void clickOnKnowAboutSensitiveTeethLink() throws Exception {
    	scrollDownUsingElement(Header4);
    	clickElementUsingJavaScript(KnowAboutSensitiveTeeth);
	}
	
	
	
	
	
	
	
	
	
	
	

}
