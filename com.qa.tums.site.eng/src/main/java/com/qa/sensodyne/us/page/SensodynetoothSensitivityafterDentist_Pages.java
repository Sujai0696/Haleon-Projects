package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodynetoothSensitivityafterDentist_Pages extends BaseClass{
	
	public SensodynetoothSensitivityafterDentist_Pages(){
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
    
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd \"]")
	private static WebElement RecognizingsensitiveTeethBreadCrumbs;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]")
	private static WebElement SensitivityafterDentistBreadCrumbs;		
	
	@FindBy(xpath = "//a[text()='how to care for your teeth']")
	private static WebElement howtotakecare;	
	
	@FindBy(xpath = "//a[text()='tooth pain after a filling.']")
	private static WebElement toothpainfilling;	
	
	@FindBy(xpath = "//span[text()='Pre- and Post-Procedure Care Tips']")
	private static WebElement Header1;	
	
	@FindBy(xpath = "//a[text()='Sensodyne']")
	private static WebElement sensodyne;	
	
	@FindBy(xpath = "//a[text()='flossing daily']")
	private static WebElement flossingdaily;	
	
	@FindBy(xpath = "//a[text()='using a soft-bristled or electric toothbrush']")
	private static WebElement softelectricbrush;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header2;
	
	@FindBy(xpath = "(//a[text()='How Sensodyne Can Help'])[2]")
	private static WebElement RelatedArticle1;
	
	@FindBy(xpath = "//a[text()='Sensodyne Products']")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "//a[text()='Is It a Cavity or Sensitive Teeth?']")
	private static WebElement RelatedArticle3;
	
	@FindBy(xpath = "//a[text()='Tips for Tooth Sensitivity to Cold']")
	private static WebElement RelatedArticle4;
	
	
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
    public void clickOnRecognizingsensitiveteethBreadcrumbs() throws Exception {
    	moveToElement(RecognizingsensitiveTeethBreadCrumbs);
		clickElementUsingJavaScript(RecognizingsensitiveTeethBreadCrumbs);
	}
    public void clickOnsensitivityafterDentistBreadcrumbs() throws Exception {
    	moveToElement(SensitivityafterDentistBreadCrumbs);
		clickElementUsingJavaScript(SensitivityafterDentistBreadCrumbs);
	}
    public void clickOnHowtotakecareteeth() throws Exception {
    	moveToElement(howtotakecare);
		clickElementUsingJavaScript(howtotakecare);
	}
    public void clickOntoothpainfilling() throws Exception {
    	scrollDownUsingElement(howtotakecare);
    	moveToElement(toothpainfilling);
		clickElementUsingJavaScript(toothpainfilling);
	}
    public void clickOnSensodyne() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(sensodyne);
		clickElementUsingJavaScript(sensodyne);
	}
    public void clickOnflossingdaily() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(flossingdaily);
		clickElementUsingJavaScript(flossingdaily);
	}
    public void clickOnsoftelectricbrush() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(softelectricbrush);
		clickElementUsingJavaScript(softelectricbrush);
	}
    public void clickOnRelatedArticle1() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(RelatedArticle1);
		clickElementUsingJavaScript(RelatedArticle1);
	}
    public void clickOnRelatedArticle2() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(RelatedArticle2);
		clickElementUsingJavaScript(RelatedArticle2);
	}
    public void clickOnRelatedArticle3() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(RelatedArticle3);
		clickElementUsingJavaScript(RelatedArticle3);
	}
    public void clickOnRelatedArticle4() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(RelatedArticle4);
		clickElementUsingJavaScript(RelatedArticle4);
	}
	
	
	
	
	
	
	
	
	
	

}
