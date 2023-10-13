package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneTrainingforSpeed_Pages extends BaseClass {
	
	public SensodyneTrainingforSpeed_Pages(){
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
	private static WebElement SensodyneInnovationBreadCrumbs;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even last is-current \"]")
	private static WebElement SensodyneTrainingforspeedBreadCrumbs;
		
	@FindBy(xpath = "//span[text()='Beat Tooth Sensitivity Pain Fast*']")
	private static WebElement Header1;
	
	@FindBy(xpath = "//a[text()='Sensodyne Rapid Relief toothpaste']")
	private static WebElement SensodyneRapidRelief;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header2;
	
	@FindBy(xpath = "//a[text()='The Science Behind Sensodyne Rapid Relief Toothpaste']")
	private static WebElement RelatedArticle1;
	
	@FindBy(xpath = "//a[text()='Engineered for Speed']")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "//a[text()='The Speed of Sensation']")
	private static WebElement RelatedArticle3;
	
	@FindBy(xpath = "//a[text()='Ski Gear: Science, Style, and Speed']")
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
	    public void clickOnSensodyneInnovationBreadcrumbs() throws Exception {
	    	moveToElement(SensodyneInnovationBreadCrumbs);
			clickElementUsingJavaScript(SensodyneInnovationBreadCrumbs);
		}
	    public void clickOnSensodyneTrainingforSpeedBreadcrumbs() throws Exception {
	    	moveToElement(SensodyneTrainingforspeedBreadCrumbs);
			clickElementUsingJavaScript(SensodyneTrainingforspeedBreadCrumbs);
		}
	    public void clickOnSensodyneRapidReliefToothpaste() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	moveToElement(SensodyneRapidRelief);
			clickElementUsingJavaScript(SensodyneRapidRelief);
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
