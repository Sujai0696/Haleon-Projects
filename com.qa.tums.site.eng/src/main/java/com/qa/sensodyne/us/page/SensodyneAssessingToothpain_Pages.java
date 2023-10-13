package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneAssessingToothpain_Pages extends BaseClass{
	
	public SensodyneAssessingToothpain_Pages(){
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
	private static WebElement shockpaintoothsensitivityBreadCrumbs;	
	
	@FindBy(xpath = "//a[text()='short, sharp pain']")
	private static WebElement shortsharppain;	
	
	@FindBy(xpath = "//a[text()='enamel erosion or receding gums']")
	private static WebElement enamelerosion;
	
	@FindBy(xpath = "//span[text()='Rollover for Facts and Tips on Tooth Sensitivity']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//a[text()='Sensodyne']")
	private static WebElement Sensodyne;
	
	@FindBy(xpath = "//a[text()='symptoms of sensitivity']")
	private static WebElement Symptonssensitivity;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header2;
	
	@FindBy(xpath = "//a[text()='Symptoms of Sensitive Teeth']")
	private static WebElement RelatedArticle1;
	
	@FindBy(xpath = "//a[text()='Treating Sensitive Teeth']")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "//a[text()='Sensitivity After a Trip to the Dentist']")
	private static WebElement RelatedArticle3;
	
	@FindBy(xpath = "//a[text()='Sensodyne vs Pronamel: Which Toothpaste Is Right For You?']")
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
    public void clickOnshockpaintoothsensitivityBreadcrumbs() throws Exception {
    	moveToElement(shockpaintoothsensitivityBreadCrumbs);
		clickElementUsingJavaScript(shockpaintoothsensitivityBreadCrumbs);
	}
    public void clickOnshortsharppain() throws Exception {
    	moveToElement(shortsharppain);
		clickElementUsingJavaScript(shortsharppain);
	}
    public void clickOnenamelerosion() throws Exception {
    	moveToElement(enamelerosion);
		clickElementUsingJavaScript(enamelerosion);
	}
    public void clickOnSensodyne() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(Sensodyne);
		clickElementUsingJavaScript(Sensodyne);
	}
    public void clickOnSymptonssensitivity() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(Symptonssensitivity);
		clickElementUsingJavaScript(Symptonssensitivity);
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
