package com.qa.sensodyne.us.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class Sensodynevspronamel_Pages extends BaseClass{
	
	public Sensodynevspronamel_Pages(){
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
	private static WebElement SensodyneorpronamelBreadCrumbs;		
	
	@FindBy(xpath = "//a[text()='sensitivity relief']")
	private static WebElement SensitivityRelief;	
	
	@FindBy(xpath = "//a[text()='acid-weakened enamel']")
	private static WebElement acidweakened;	
	
	@FindBy(xpath = "(//a[text()='Yes'])[1]")
	private static WebElement yes;	
	
	@FindBy(xpath = "(//a[text()='No'])[3]")
	private static WebElement No;	
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header1;	
	
	@FindBy(xpath = "(//a[text()='How Sensodyne Can Help'])[2]")
	private static WebElement RelatedArticle1;	
	
	@FindBy(xpath = "//a[text()='Sensodyne Products']")
	private static WebElement RelatedArticle2;	
	
	@FindBy(xpath = "//a[text()='The Effects of Acid Erosion']")
	private static WebElement RelatedArticle3;	
	
	@FindBy(xpath = "//a[text()='Pronamel Products']")
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
	    public void clickOnsensodynepronamelBreadcrumbs() throws Exception {
	    	moveToElement(SensodyneorpronamelBreadCrumbs);
			clickElementUsingJavaScript(SensodyneorpronamelBreadCrumbs);
		}	
	    public void clickOnsensitivityrelief() throws Exception {
	    	moveToElement(SensitivityRelief);
			clickElementUsingJavaScript(SensitivityRelief);
		}	
	    public void clickOnacidweakened() throws Exception {
	    	moveToElement(acidweakened);
			clickElementUsingJavaScript(acidweakened);
		}
	    public void clickOnYesBtn() throws Exception {
	    	scrollDownUsingElement(acidweakened);
	    	moveToElement(yes);
			clickElementUsingJavaScript(yes);
		}
	    public void clickOnNoBtn() throws Exception {
	    	scrollDownUsingElement(acidweakened);
	    	moveToElement(No);
			clickElementUsingJavaScript(No);
		}
	    public void clickOnRelatedArticle1() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	//moveToElement(RelatedArticle1);
			elementClick(RelatedArticle1);
		}
	    public void clickOnRelatedArticle2() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	//moveToElement(RelatedArticle2);
			elementClick(RelatedArticle2);
		}
	    public void clickOnRelatedArticle3() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	//moveToElement(RelatedArticle3);
			elementClick(RelatedArticle3);
		}
	    public void clickOnRelatedArticle4() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	//moveToElement(RelatedArticle4);
			elementClick(RelatedArticle4);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
