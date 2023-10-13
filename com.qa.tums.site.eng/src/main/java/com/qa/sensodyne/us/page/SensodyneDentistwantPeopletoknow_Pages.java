package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneDentistwantPeopletoknow_Pages extends BaseClass {

	public SensodyneDentistwantPeopletoknow_Pages(){
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

	@FindBy(xpath = "//a[text()='Back to the article list']")
	private static WebElement BackToArticleList;
	
	@FindBy(xpath = "//a[text()='Academy of General Dentistry']")
	private static WebElement AcademyGeneralDentistry;
	
	@FindBy(xpath = "//a[text()='Dr. Lory Richter, DDS']")
	private static WebElement loryrichter;
	
	@FindBy(xpath = "//a[text()='Our teeth are porous']")
	private static WebElement OurTeethPorous;
	
	@FindBy(xpath = "(//a[@href=\"https://www.sensodyne.com/en-us/products/sensodyne-rapid-relief-mint-toothpaste/\"])[1]")
	private static WebElement RapidReliefToothpaste;
	
	@FindBy(xpath = "//h3[text()='When Should You Consult a Dentist?']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//a[text()='have a cavity']")
	private static WebElement haveCavity;
	
	@FindBy(xpath = "(//a[@href=\"https://www.sensodyne.com/en-us/products/sensodyne-rapid-relief-mint-toothpaste/\"])[2]")
	private static WebElement SensodynerapidRelief;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header2;
	
	@FindBy(xpath = "//a[text()='5 Oral Health Tips Everyone Should Follow']")
	private static WebElement OralHealthTipsTricks;
	
	@FindBy(xpath = "//a[text()='Can You Brush Your Teeth Too Hard?']")
	private static WebElement BrushTeethtoohard;
	
	@FindBy(xpath = "//div[@class=\"image component section zglazyload related-box col-xs-12 RelatedArticle2 fixed-component\"]//following-sibling::p")
	private static WebElement whyteethhurtcold;
	
	@FindBy(xpath = "//a[text()='Can Having Sensitive Teeth Be A Bad Thing?']")
	private static WebElement SensitiveTeethBadThing;
	
	
	
	
	
	
	
	
	
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
    public void clickOnBacktoArticleList() throws Exception {
    	moveToElement(BackToArticleList);
		clickElementUsingJavaScript(BackToArticleList);
	}
    public void clickOnAcademyGeneralDentistry() throws Exception {
    	scrollDownUsingElement(BackToArticleList);
    	moveToElement(AcademyGeneralDentistry);
		clickElementUsingJavaScript(AcademyGeneralDentistry);
	}
    public void clickOnLoryRichter() throws Exception {
    	scrollDownUsingElement(BackToArticleList);
    	moveToElement(loryrichter);
		clickElementUsingJavaScript(loryrichter);
	}
    public void clickOnOurTeethPorous() throws Exception {
    	scrollDownUsingElement(BackToArticleList);
    	moveToElement(OurTeethPorous);
		clickElementUsingJavaScript(OurTeethPorous);
	}
    public void clickOnRapidReliefToothpaste() throws Exception {
    	scrollDownUsingElement(OurTeethPorous);
    	moveToElement(RapidReliefToothpaste);
		clickElementUsingJavaScript(RapidReliefToothpaste);
	}
    public void clickOnhaveCavity() throws Exception {
    	scrollDownUsingElement(OurTeethPorous);
    	moveToElement(haveCavity);
		clickElementUsingJavaScript(haveCavity);
	}
    public void clickOnSensodyneRapidRelief() throws Exception {
    	scrollDownUsingElement(OurTeethPorous);
    	moveToElement(SensodynerapidRelief);
		clickElementUsingJavaScript(SensodynerapidRelief);
	}
    public void clickOnOralHealthTipsTricks() throws Exception {
    	scrollDownUsingElement(Header2);
    	//moveToElement(OralHealthTipsTricks);
		clickElementUsingJavaScript(OralHealthTipsTricks);
	}
    public void clickOnBrushteethtoohard() throws Exception {
    	scrollDownUsingElement(Header2);
    	//moveToElement(BrushTeethtoohard);
		clickElementUsingJavaScript(BrushTeethtoohard);
	}
    public void clickOnwhyteethhurtcoldOutside() throws Exception {
    	//scrollDownUsingElement(Header2);
    	//moveToElement(BrushTeethtoohard);
		elementClick(whyteethhurtcold);
	}
    public void clickOnSensitiveTeethBadThing() throws Exception {
    	//scrollDownUsingElement(Header2);
    	//moveToElement(BrushTeethtoohard);
		clickElementUsingJavaScript(SensitiveTeethBadThing);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
