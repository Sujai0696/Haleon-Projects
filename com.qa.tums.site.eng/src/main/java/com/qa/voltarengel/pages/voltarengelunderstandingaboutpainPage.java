package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelunderstandingaboutpainPage extends BaseClass{
	
	public voltarengelunderstandingaboutpainPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
	
	@FindBy(xpath = "//h2[text()='Sign Up. Save.']")
    private static WebElement gigyaForm;

    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage gigyaform__heading first odd component col-xs-12']")
    private static WebElement gigyaClose;
		
    @FindBy(xpath = "//a[text()='Homepage']")
    private static WebElement homepage_breadcrumbs;			
	
    @FindBy(xpath = "//a[text()='Understanding Pain']")
    private static WebElement understandingpain_breadcrumbs;			
	
    @FindBy(xpath = "//a[text()='What is Pain']")
    private static WebElement whatispain_breadcrumbs;					
	
    @FindBy(xpath = "//a[text()='people around the world who feel pain every day']")
    private static WebElement feelpaineveryday;	
	
    @FindBy(xpath = "//span[text()='The Impact of Body Pain Around the World']")
    private static WebElement feelpaineveryday_txt;	
	
    @FindBy(xpath = "//a[text()='arthritis treatment']")
    private static WebElement arthristtreatment;	
	
    @FindBy(xpath = "//h1[text()='Managing Arthritis']")
    private static WebElement arthristtreatment_txt;	
	
    @FindBy(xpath = "//a[text()='pain']")
    private static WebElement pain;
	
    @FindBy(xpath = "//span[text()='How to Manage Stress When Living With Arthritis']")
    private static WebElement pain_txt;
	
    @FindBy(xpath = "//span[text()='Show References']")
    private static WebElement Showreferences;
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement Showreferences_Active;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//a[@href='/understanding-pain/impact-of-pain/']")
    private static WebElement Readmore1;
    
    @FindBy(xpath = "//span[text()='The Impact of Body Pain Around the World']")
    private static WebElement Readmore1_txt;
    
    @FindBy(xpath = "//a[@href='/what-is-arthritis/types/']")
    private static WebElement Readmore2;
    
    @FindBy(xpath = "//span[text()='What are the Different Types of Arthritis?']")
    private static WebElement Readmore2_txt;
    
    @FindBy(xpath = "//a[text()='Get Coupons']")
    private static WebElement getCoupons;
    
    @FindBy(xpath = "//h1[text()='Voltaren Arthritis Pain Gel Coupons']")
    private static WebElement getCoupons_txt;
    
    @FindBy(xpath = "//span[text()='BUY NOW']//ancestor::button[@class='rd-nr-btn btn voltarenBtnBlueOutline noTextDecoration']")
    private static WebElement buyNow;
   
   @FindBy(xpath = "//div[contains(text(),'Shopping Bag')]/..//img[@alt='close cart icon']")
    private static WebElement buyNowCloseIcon;
   
   @FindBy(xpath = "//div[contains(@style,'background-color: initial;')]")
    private static WebElement verifyBuyNowClose;
    
    
    
    
    
    
    
//methods
	
    public void clickCookieBtn() throws Exception {
        waitForPageLoadJava();
        if(isElementPresent(cookieBtn)) {
			elementToBeClickable(cookieBtn);
			try {
				if(cookieBtn.isDisplayed()) {
					clickElementUsingJavaScript(cookieBtn);
				}
				implicitWait();
				visibilityOf(cookieClose);
				Assert.assertTrue(elementIsDisplayed(cookieClose));
			}
			catch (Exception e) {
				
			}
		}else {
			System.out.println("Dismiss is not presented");
			throw new Exception("Unable to click on cookie Pop-up");
		}
    }
    public void clickGigyaForm() throws Exception {
       waitForPageLoadJava();
        try {
            if (gigyaForm.isDisplayed()) {
                clickElementUsingJavaScript(gigyaForm);
            }
           // visibilityOf(gigyaClose);
            implicitWait();
            actionClick(gigyaClose);
            Assert.assertTrue(elementIsDisplayed(gigyaClose));
           // elementClick(gigyaClose);
           // actionClick(gigyaClose);
        } catch (Exception e) {
       }
        
		}
    public void clickonHomepageBreadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(homepage_breadcrumbs);
    	clickElementUsingJavaScript(homepage_breadcrumbs);
    	pageLoad();
    }
    public void clickonUnderstandingpain_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(understandingpain_breadcrumbs);
    	clickElementUsingJavaScript(understandingpain_breadcrumbs);
    	pageLoad();
    }				
    public void clickonwhatispain_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(whatispain_breadcrumbs);
    	clickElementUsingJavaScript(whatispain_breadcrumbs);
    	pageLoad();
    }				
    public void clickonfeelpaineveryday() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(feelpaineveryday);
    	clickElementUsingJavaScript(feelpaineveryday);
    	visibilityOf(feelpaineveryday_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(feelpaineveryday_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(feelpaineveryday_txt));
    	pageLoad();
    }				
    public void clickonArthristtreatment() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(arthristtreatment);
    	clickElementUsingJavaScript(arthristtreatment);
    	visibilityOf(arthristtreatment_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(arthristtreatment_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(arthristtreatment_txt));
    	pageLoad();
    }			
    public void clickonpain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(pain);
    	moveToElement(pain);
    	clickElementUsingJavaScript(pain);
    	visibilityOf(pain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(pain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(pain_txt));
    	pageLoad();
    }			
    public void clickonShowReferences() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Showreferences);
    	moveToElement(Showreferences);
    	clickElementUsingJavaScript(Showreferences);
    	visibilityOf(Showreferences_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(Showreferences_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	//System.out.println(getElementText(pain_txt));
    	pageLoad();
    }			
    public void clickonReadmore1() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Readmore1);
    	moveToElement(Readmore1);
    	clickElementUsingJavaScript(Readmore1);
    	visibilityOf(Readmore1_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(Readmore1_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Readmore1_txt));
    	pageLoad();
    }			
    public void clickonReadmore2() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Readmore2);
    	moveToElement(Readmore2);
    	clickElementUsingJavaScript(Readmore2);
    	visibilityOf(Readmore2_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(Readmore2_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Readmore2_txt));
    	pageLoad();
    }			
    public void clickonGetCoupons() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(getCoupons);
    	moveToElement(getCoupons);
    	clickElementUsingJavaScript(getCoupons);
    	visibilityOf(getCoupons_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(getCoupons_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(getCoupons_txt));
    	pageLoad();
    }
    public void clickonBuyNow() throws Exception{
   	 waitForPageLoadJava();
   	 if (isElementPresent(buyNow)) {
			scrollDownUsingElement(buyNow);
			clickElementUsingJavaScript(buyNow);
			visibilityOf(buyNowCloseIcon);
			Assert.assertTrue(elementIsDisplayed(buyNowCloseIcon));
			clickElementUsingJavaScript(buyNowCloseIcon);
			visibilityOf(verifyBuyNowClose);
			Assert.assertTrue(elementIsDisplayed(verifyBuyNowClose));
			System.out.println("Buy Now button successfully verified");
			
		} else {
			System.out.println("Buy Now Button is not Presented in the page");
			throw new Exception("Buy Now Button is not Presented in the page");
		}
 }
	
	
	
	
	
	
	
	
	
	

}
