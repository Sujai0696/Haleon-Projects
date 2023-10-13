package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneCausesSensitiveTeeth_Pages extends BaseClass{
	public SensodyneCausesSensitiveTeeth_Pages(){
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
	
	@FindBy(xpath = "(//a[@title=\"Causes of Sensitive Teeth\"])[1]")
	private static WebElement CausesSensitiveTeeth;
	
	@FindBy(xpath = "(//a[@title='Understanding Sensitivity'])[1]")
	private static WebElement UnderstandingSensitivity;
	
	@FindBy(xpath = "(//li[@class=\"breadcrumb-list-item odd first \"])[1]")
	private static WebElement HomeIcon_Bread;
	
	@FindBy(xpath = "(//li[@class=\"breadcrumb-list-item even \"])[1]")
	private static WebElement UnderstandingSenstivity_Bread;
	
	@FindBy(xpath = "(//li[@class=\"breadcrumb-list-item odd last is-current \"])[2]")
	private static WebElement CausesSensitiveTeeth_Bread;
	
	@FindBy(xpath = "//span[text()=' How Sensodyne Can Help']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//a[text()='Explore Our Products']")
	private static WebElement ExploreProducts;
	
	@FindBy(xpath = "//a[text()='Treating Sensitive Teeth']")
	private static WebElement SensitiveTeeth;
	
	@FindBy(xpath = "//a[text()='Symptoms of Sensitive Teeth']")
	private static WebElement SymptonsSensitiveTeeth;
	
	@FindBy(xpath = "(//a[text()='How Sensodyne Can Help'])[2]")
	private static WebElement HowSensodyneHelp;
	
	@FindBy(xpath = "//a[text()='Sensodyne Ingredients']")
	private static WebElement SensodyneIngredients;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
            Assert.assertTrue(elementIsDisplayed(gigyaClose));
            elementClick(gigyaClose);
        } catch (Exception e) {
       }
    }
    public void clickOnCausesSensitiveTeeth() throws Exception {
		moveToElement(UnderstandingSensitivity);
		clickElementUsingJavaScript(CausesSensitiveTeeth);
	}
    public void clickOnHomeIconBread() throws Exception {
		clickElementUsingJavaScript(HomeIcon_Bread);
	}
    public void clickOnUnderstandingSensitivity() throws Exception {
		clickElementUsingJavaScript(UnderstandingSensitivity);
	}
    public void clickOnCausesSensitiveTeethBread() throws Exception {
		elementClick(CausesSensitiveTeeth_Bread);
	}
    public void clickOnExploreProducts() throws Exception {
		clickElementUsingJavaScript(ExploreProducts);
	}
    public void clickOnSensitiveTeeth() throws Exception {
		clickElementUsingJavaScript(SensitiveTeeth);
	}
    public void clickOnSymptonsSensitiveTeeth() throws Exception {
		clickElementUsingJavaScript(SymptonsSensitiveTeeth);
	}
    public void clickOnHowSensodyneHelp() throws Exception {
		clickElementUsingJavaScript(HowSensodyneHelp);
	}
    public void clickOnSensodyneIngredients() throws Exception {
    	//scrollDownUsingElement(Header1);
		clickElementUsingJavaScript(SensodyneIngredients);
	}
	
	
	
	
	
	
	
	
	

}
