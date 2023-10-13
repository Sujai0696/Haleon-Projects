package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneWhiteningProductsImpact_Pages extends BaseClass {
	
	public SensodyneWhiteningProductsImpact_Pages(){
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
	private static WebElement WhiteningSensitiveTeethBreadCrumbs;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]")
	private static WebElement WhiteningProductsImpactBreadCrumbs;		
	
	@FindBy(xpath = "//a[text()='at-home whitening remedies']")
	private static WebElement homeremedies;		
	
	@FindBy(xpath = "//h2[text()='Bleaching Agents']")
	private static WebElement header1;	
	
	@FindBy(xpath = "(//a[text()='Sensodyne Extra Whitening'])[1]")
	private static WebElement Sensodyneextrawhitening;
	
	@FindBy(xpath = "//strong[text()='relief and lasting protection from sensitivity pain']")
	private static WebElement Relieffrompain;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement header2;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-true-white-extra-fresh-toothpaste/\"])[2]")
	private static WebElement RelatedArticle1;
	
	
	@FindBy(xpath = "//a[text()='What You Should Know About Whitening Sensitive Teeth']")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "//a[text()='Whitening Home Remedies: How They May Affect Sensitive Teeth']")
	private static WebElement RelatedArticle3;
	
	
	@FindBy(xpath = "(//a[text()='Causes of Sensitive Teeth'])[2]")
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
    public void clickOnWhiteningSensitiveTeethBreadcrumbs() throws Exception {
    	moveToElement(WhiteningSensitiveTeethBreadCrumbs);
		clickElementUsingJavaScript(WhiteningSensitiveTeethBreadCrumbs);
	}
    public void clickOnWhiteningproductsImpactBreadcrumbs() throws Exception {
    	moveToElement(WhiteningProductsImpactBreadCrumbs);
		clickElementUsingJavaScript(WhiteningProductsImpactBreadCrumbs);
	}
    public void clickOnSensodyneExtrawhitening() throws Exception {
    	scrollDownUsingElement(header1);
    	moveToElement(Sensodyneextrawhitening);
		clickElementUsingJavaScript(Sensodyneextrawhitening);
	}
    public void clickOnRelieffromPain() throws Exception {
    	scrollDownUsingElement(header1);
    	moveToElement(Relieffrompain);
		clickElementUsingJavaScript(Relieffrompain);
	}
    public void clickOnRelatedArticle1() throws Exception {
    	scrollDownUsingElement(header2);
    	//moveToElement(RelatedArticle1);
		clickElementUsingJavaScript(RelatedArticle1);
	}
    public void clickOnRelatedArticle2() throws Exception {
    	scrollDownUsingElement(header2);
    	moveToElement(RelatedArticle2);
		clickElementUsingJavaScript(RelatedArticle2);
	}
    public void clickOnRelatedArticle3() throws Exception {
    	scrollDownUsingElement(header2);
    	moveToElement(RelatedArticle3);
		clickElementUsingJavaScript(RelatedArticle3);
	}
    public void clickOnRelatedArticle4() throws Exception {
    	scrollDownUsingElement(header2);
    	moveToElement(RelatedArticle4);
		clickElementUsingJavaScript(RelatedArticle4);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
