package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class Sensodynebrushingflossingteeth_Pages extends BaseClass{
	
	public Sensodynebrushingflossingteeth_Pages(){
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
	private static WebElement brushingflossingcauseteethBreadCrumbs;		
	
	@FindBy(xpath = "//h3[text()='How to brush sensitive teeth']")
	private static WebElement Header1;	
	
	@FindBy(xpath = "(//a[text()='Sensodyne toothpaste'])[1]")
	private static WebElement SensodyneToothpaste;	
	
	@FindBy(xpath = "//span[text()='Visiting the dentist with sensitive teeth']")
	private static WebElement Header2;	
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/\"])[5]")
	private static WebElement Sensodynetoothpaste1;
	
	@FindBy(xpath = "//h2[text()='RELATED ARTICLES']")
	private static WebElement Header3;
	
	@FindBy(xpath = "(//a[text()='Causes of Sensitive Teeth'])[2]")
	private static WebElement RelatedArticle1;
	
	@FindBy(xpath = "//a[text()='Is It a Cavity or Sensitive Teeth?']")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "(//a[text()='How Sensodyne Can Help'])[2]")
	private static WebElement RelatedArticle3;
	
	@FindBy(xpath = "//a[text()='Sensodyne Products']")
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
	    public void clickOnbrushingflossingcauseteethBreadcrumbs() throws Exception {
	    	moveToElement(brushingflossingcauseteethBreadCrumbs);
			clickElementUsingJavaScript(brushingflossingcauseteethBreadCrumbs);
		}
	    public void clickOnSensodyneToothpaste() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	moveToElement(SensodyneToothpaste);
			clickElementUsingJavaScript(SensodyneToothpaste);
		}
	    public void clickOnSensodyneToothpaste1() throws Exception {
	    	scrollDownUsingElement(Header2);
	    	moveToElement(Sensodynetoothpaste1);
			clickElementUsingJavaScript(Sensodynetoothpaste1);
		}
	    public void clickOnRelatedArticle1() throws Exception {
	    	scrollDownUsingElement(Header3);
	    	moveToElement(RelatedArticle1);
			clickElementUsingJavaScript(RelatedArticle1);
		}
	    public void clickOnRelatedArticle2() throws Exception {
	    	scrollDownUsingElement(Header3);
	    	//moveToElement(RelatedArticle2);
			elementClick(RelatedArticle2);
		}
	    public void clickOnRelatedArticle3() throws Exception {
	    	scrollDownUsingElement(Header3);
	    	//moveToElement(RelatedArticle3);
			clickElementUsingJavaScript(RelatedArticle3);
		}
	    public void clickOnRelatedArticle4() throws Exception {
	    	scrollDownUsingElement(Header3);
	    	moveToElement(RelatedArticle4);
			clickElementUsingJavaScript(RelatedArticle4);
		}
	
	    
	    
	
	
	
	
	
	
	
	
	
	
	
	

}
