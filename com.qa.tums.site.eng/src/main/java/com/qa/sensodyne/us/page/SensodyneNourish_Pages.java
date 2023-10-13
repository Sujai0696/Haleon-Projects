package com.qa.sensodyne.us.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class SensodyneNourish_Pages extends BaseClass {
	
	public SensodyneNourish_Pages() {
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
    
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item even \"]")
	private static WebElement OurproductsBreadcrumbs;
	
	@FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd last is-current \"]")
	private static WebElement SensodyneNourishBreadcrumbs;
	
	@FindBy(xpath = "//span[text()='The science within Nourish']")
	private static WebElement Header1;
		
	@FindBy(xpath = "(//a[@class=\"ps-widget btn ps-enabled\"])[1]")
	private static WebElement WatchNow;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-nourish-sensitivity-toothpaste-healthy-white/\"])[2]")
	private static WebElement FindMore1;
	
	@FindBy(xpath = "(//a[@href=\"/en-us/products/sensodyne-nourish-gently-soothing/\"])[2]")
	private static WebElement FindMore2;
	
	@FindBy(xpath = "//span[text()='Nourish Healthy White toothpaste']")
	private static WebElement Header2;
	
	
	
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
	    public void clickOnOurProductsBreadCrumbs() throws Exception {
	    	moveToElement(OurproductsBreadcrumbs);
			clickElementUsingJavaScript(OurproductsBreadcrumbs);
		}
	    public void clickOnSensodyneNourishBreadCrumbs() throws Exception {
	    	moveToElement(SensodyneNourishBreadcrumbs);
			clickElementUsingJavaScript(SensodyneNourishBreadcrumbs);
		}
	    public void clickOnWatchVideoLink() throws Exception {
	    	scrollDownUsingElement(Header1);
	    	moveToElement(WatchNow);
			clickElementUsingJavaScript(WatchNow);
		}
	    public void clickOnFindMore1() throws Exception {
	    	scrollDownUsingElement(Header2);
	    	moveToElement(FindMore1);
			clickElementUsingJavaScript(FindMore1);
		}
	    public void clickOnFindMore2() throws Exception {
	    	scrollDownUsingElement(Header2);
	    	moveToElement(FindMore2);
			clickElementUsingJavaScript(FindMore2);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
