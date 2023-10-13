package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneWhattoKnow_Pages extends BaseClass {
	
	public SensodyneWhattoKnow_Pages(){
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
	private static WebElement WhatyoushouldknowBreadCrumbs;	
	
	@FindBy(xpath = "//a[text()='tooth whitening techniques can cause tooth sensitivity']")
	private static WebElement ToothwhiteningTechniques;	
	
	@FindBy(xpath = "//h2[text()='What to Know About Teeth Whitening']")
	private static WebElement Header1;	
	
	@FindBy(xpath = "//a[text()='what to know about teeth whitening']")
	private static WebElement KnowaboutTeethwhitening;	
	
	@FindBy(xpath = "//a[text()='sensitive teeth or a cavity']")
	private static WebElement SensitiveTeethCavity;	
	
	@FindBy(xpath = "//a[text()='symptoms of sensitive teeth']")
	private static WebElement SymptonssensetiveTeeth;	
	
	@FindBy(xpath = "(//a[text()='Sensodyne True White'])[1]")
	private static WebElement SensodyneTrueWhite;
	
	@FindBy(xpath = "//h3[text()='Which Is Best – Toothpaste or Bleaching?']")
	private static WebElement Header2;
	
	@FindBy(xpath = "(//a[text()='Sensodyne True White'])[2]")
	private static WebElement SensodyneTruewhite1;
	
	@FindBy(xpath = "(//a[text()='Sensodyne True White'])[3]")
	private static WebElement SensodyneTruewhite2;
	
	@FindBy(xpath = "//a[text()='Sensodyne Pronamel Gentle Whitening.']")
	private static WebElement Sensodynepronamelgentlewhitening;
	
	@FindBy(xpath = "(//a[text()='Sensodyne True White'])[4]")
	private static WebElement SensodyneTruewhite3;
	
	
	@FindBy(xpath = "//h2[text()='What to Know About Teeth Whitening – Next Steps']")
	private static WebElement Header3;
	
	@FindBy(xpath = "//a[text()='Sensodyne toothpastes']")
	private static WebElement SensodyneToothpaste;
	
	@FindBy(xpath = "//a[text()='where to buy Sensodyne products']")
	private static WebElement WheretobuyProducts;
	
	@FindBy(xpath = "(//a[text()='Sensodyne True White'])[5]")
	private static WebElement SensodyneTruewhite4;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header4;
	
	@FindBy(xpath = "//a[text()='Sensodyne True White Ingredients and How They Work']")
	private static WebElement RelatedArticle1;
	
	@FindBy(xpath = "//a[text()='Whitening Home Remedies: How They May Affect Sensitive Teeth']")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/oral-health-tips/whitening-sensitive-teeth/whitening-products-and-sensitive-teeth/\"])[3]")
	private static WebElement RelatedArticle3;
	
	@FindBy(xpath = "//a[text()='6 Tips for Whitening Sensitive Teeth']")
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
    public void clickOnWhatYouShouldKnowBreadcrumbs() throws Exception {
    	moveToElement(WhatyoushouldknowBreadCrumbs);
		clickElementUsingJavaScript(WhatyoushouldknowBreadCrumbs);
	}
    public void clickOnToothwhiteningTechniques() throws Exception {
    	moveToElement(ToothwhiteningTechniques);
		clickElementUsingJavaScript(ToothwhiteningTechniques);
	}
    public void clickOnknowaboutTeethwhitening() throws Exception {
    	moveToElement(KnowaboutTeethwhitening);
		clickElementUsingJavaScript(KnowaboutTeethwhitening);
	}
    public void clickOnSensitiveTeethCavity() throws Exception {
    	scrollDownUsingElement(KnowaboutTeethwhitening);
    	moveToElement(SensitiveTeethCavity);
		clickElementUsingJavaScript(SensitiveTeethCavity);
	}
    public void clickOnSymptonsSensitiveTeeth() throws Exception {
    	scrollDownUsingElement(SensitiveTeethCavity);
    	moveToElement(SymptonssensetiveTeeth);
		clickElementUsingJavaScript(SymptonssensetiveTeeth);
	}
    public void clickOnSensodyneTrueWhite() throws Exception {
    	scrollDownUsingElement(SymptonssensetiveTeeth);
    	moveToElement(SensodyneTrueWhite);
		clickElementUsingJavaScript(SensodyneTrueWhite);
	}
    public void clickOnSensodyneTrueWhite1() throws Exception {
    	scrollDownUsingElement(Header2);
    	moveToElement(SensodyneTruewhite1);
		clickElementUsingJavaScript(SensodyneTruewhite1);
	}
    public void clickOnSensodyneTrueWhite2() throws Exception {
    	scrollDownUsingElement(SensodyneTruewhite1);
    	moveToElement(SensodyneTruewhite2);
		clickElementUsingJavaScript(SensodyneTruewhite2);
	}
    public void clickOnSensodynepronamelwhitening() throws Exception {
    	scrollDownUsingElement(SensodyneTruewhite2);
    	moveToElement(Sensodynepronamelgentlewhitening);
		clickElementUsingJavaScript(Sensodynepronamelgentlewhitening);
	}
    public void clickOnSensodyneToothpaste() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(SensodyneToothpaste);
		clickElementUsingJavaScript(SensodyneToothpaste);
	}
    public void clickOnwheretobuyproducts() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(WheretobuyProducts);
		clickElementUsingJavaScript(WheretobuyProducts);
	}
    public void clickOnSensodyneTruewhite3() throws Exception {
    	scrollDownUsingElement(SensodyneTruewhite2);
    	moveToElement(SensodyneTruewhite3);
		clickElementUsingJavaScript(SensodyneTruewhite3);
	}
    public void clickOnSensodyneTruewhite4() throws Exception {
    	scrollDownUsingElement(Header3);
    	moveToElement(SensodyneTruewhite4);
		clickElementUsingJavaScript(SensodyneTruewhite4);
	}
    public void clickOnRelatedArticle1() throws Exception {
    	scrollDownUsingElement(Header4);
    	moveToElement(RelatedArticle1);
		clickElementUsingJavaScript(RelatedArticle1);
	}
    public void clickOnRelatedArticle2() throws Exception {
    	scrollDownUsingElement(Header4);
    	moveToElement(RelatedArticle2);
		clickElementUsingJavaScript(RelatedArticle2);
	}
    public void clickOnRelatedArticle3() throws Exception {
    	scrollDownUsingElement(Header4);
    	moveToElement(RelatedArticle3);
		clickElementUsingJavaScript(RelatedArticle3);
	}
    public void clickOnRelatedArticle4() throws Exception {
    	scrollDownUsingElement(Header4);
    	moveToElement(RelatedArticle4);
		clickElementUsingJavaScript(RelatedArticle4);
	}
	
	
	

    
    
    
    
    
    
    
    
    
    
    
}
