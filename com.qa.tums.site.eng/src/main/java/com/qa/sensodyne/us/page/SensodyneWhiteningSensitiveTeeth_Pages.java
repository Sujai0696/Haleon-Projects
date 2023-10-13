package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneWhiteningSensitiveTeeth_Pages extends BaseClass{
	
	public SensodyneWhiteningSensitiveTeeth_Pages(){
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

	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even \"]")
	private static WebElement WhiteningSensitiveTeeth_Breadcrumbs;
	
	
	@FindBy(xpath = "//a[text()='whitening sensitive teeth']")
	private static WebElement WhiteningSensitiveTeeth;
	
	@FindBy(xpath = "//h2[text()='Teeth Whitening Home Treatments: The Pros and Cons']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//a[text()='removing stains from sensitive teeth']")
	private static WebElement RemovingStrains;
	
	@FindBy(xpath = "//h3[text()='Whitening Rinses (Mouthwashes)']")
	private static WebElement Header2;
	
	@FindBy(xpath = "//a[text()='Sensodyne True White Extra Fresh']")
	private static WebElement SensodyneTrueWhite;
	
	@FindBy(xpath = "//a[text()='Sensodyne Extra Whitening toothpaste']")
	private static WebElement SensodyneExtraWhiteningToothpaste;
	
	@FindBy(xpath = "//a[text()='full Sensodyne teeth whitening toothpaste range']")
	private static WebElement FullSensodyneToothwhitening;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header3;
	
	@FindBy(xpath = "//a[text()='Sensodyne Extra Whitening']")
	private static WebElement RelatedArticle1;
	
	@FindBy(xpath = "//a[text()='Whitening Products and Their Impact on Sensitive Teeth']")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "//a[text()='6 Tips for Whitening Sensitive Teeth']")
	private static WebElement RelatedArticle3;
	
	@FindBy(xpath = "//a[text()='Foods and Drinks That Cause Acid Erosion']")
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
    	//moveToElement(WhiteningSensitiveTeeth_Breadcrumbs);
		elementClick(WhiteningSensitiveTeeth_Breadcrumbs);
	}
    
    public void clickOnWhiteningSensitiveTeeth() throws Exception {
    	moveToElement(WhiteningSensitiveTeeth);
		clickElementUsingJavaScript(WhiteningSensitiveTeeth);
	}
    public void clickOnRemovingStrains() throws Exception {
    	scrollDownUsingElement(Header1);
    	moveToElement(RemovingStrains);
		clickElementUsingJavaScript(RemovingStrains);
	}
    public void clickOnSensodyneTrueWhite() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(SensodyneTrueWhite);
		clickElementUsingJavaScript(SensodyneTrueWhite);
	}
    public void clickOnSensodyneExtraWhiteningToothpaste() throws Exception {
    	scrollDownUsingElement(SensodyneTrueWhite);
    	moveToElement(SensodyneExtraWhiteningToothpaste);
		clickElementUsingJavaScript(SensodyneExtraWhiteningToothpaste);
	}
    public void clickOnSensodyneFullWhiteningToothpaste() throws Exception {
    	scrollDownUsingElement(SensodyneExtraWhiteningToothpaste);
    	moveToElement(FullSensodyneToothwhitening);
		clickElementUsingJavaScript(FullSensodyneToothwhitening);
	}
    public void clickOnRelatedArticle1() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(RelatedArticle1);
		clickElementUsingJavaScript(RelatedArticle1);
	}
    public void clickOnRelatedArticle2() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(RelatedArticle2);
		clickElementUsingJavaScript(RelatedArticle2);
	}
    public void clickOnRelatedArticle3() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(RelatedArticle3);
		clickElementUsingJavaScript(RelatedArticle3);
	}
    public void clickOnRelatedArticle4() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(RelatedArticle4);
		clickElementUsingJavaScript(RelatedArticle4);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
