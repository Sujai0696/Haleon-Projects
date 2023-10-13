package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengeleffectsofagingbodyPage extends BaseClass{
	
	public voltarengeleffectsofagingbodyPage() {
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
	
    @FindBy(xpath = "//li[@class='breadcrumb-list-item even ']")
    private static WebElement livingarthrist_breadcrumbs;			
	
    @FindBy(xpath = "//a[text()='The Effects of Aging on the Body']")
    private static WebElement effectsagingbody_breadcrumbs;
	
    @FindBy(xpath = "//a[@href='https://www.voltarengel.com/what-is-arthritis/symptoms/']")
    private static WebElement symptoms;
	
    @FindBy(xpath = "//h1[@class='innerHeading text-center']")
    private static WebElement symptoms_txt;
	
    @FindBy(xpath = "//a[@href='https://www.voltarengel.com/what-is-voltaren/']")
    private static WebElement medications;
	
    @FindBy(xpath = "//h1[text()='What is Voltaren Arthritis Pain Relief Gel?']")
    private static WebElement medications_txt;
	
    @FindBy(xpath = "//header[@class='accordion-head']")
    private static WebElement showreferences;
	
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement showreferences_Active;
	
    
    //Related Articles//
    
    @FindBy(xpath = "//a[@href='/understanding-pain/arthritis-weather/']")
    private static WebElement Readmore1;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style first odd last component col-xs-12 col-lg-10 col-lg-offset-1']//span[text()='Does Weather Affect Your Arthritis Pain?']")
    private static WebElement Readmore1_txt;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/living-with-arthritis/stress/']")
    private static WebElement Readmore2;
    
    @FindBy(xpath = "//span[text()='How to Manage Stress When Living With Arthritis']")
    private static WebElement Readmore2_txt;
    
    @FindBy(xpath = "//a[text()='Get Coupons']")
    private static WebElement getcoupons;
    
    @FindBy(xpath = "//h1[text()='Voltaren Arthritis Pain Gel Coupons']")
    private static WebElement getcoupons_txt;
    
    @FindBy(xpath = "//span[text()='BUY NOW']//ancestor::button[@class='rd-nr-btn btn voltarenBtnBlueOutline noTextDecoration']")
    private static WebElement buyNow;
   
   @FindBy(xpath = "//div[contains(text(),'Shopping Bag')]/..//img[@alt='close cart icon']")
    private static WebElement buyNowCloseIcon;
   
   @FindBy(xpath = "//div[contains(@style,'background-color: initial;')]")
    private static WebElement verifyBuyNowClose;
    
    
    
    
    
    
    
    
    
///methods
	
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
    public void clickonlivingarthrist_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(livingarthrist_breadcrumbs);
    	pageLoad();
    }
    public void clickoneffectsagingbody_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(effectsagingbody_breadcrumbs);
    	pageLoad();
    }
    public void clickonSymptoms() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(symptoms);
    	moveToElement(symptoms);
    	clickElementUsingJavaScript(symptoms);
    	visibilityOf(symptoms_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(symptoms_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(symptoms_txt));
    	
    	pageLoad();
    }
    public void clickonmedications() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(medications);
    	moveToElement(medications);
    	clickElementUsingJavaScript(medications);
    	visibilityOf(medications_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(medications_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(medications_txt));
    	
    	pageLoad();
    }
    public void clickonshowReferences() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(showreferences);
    	moveToElement(showreferences);
    	clickElementUsingJavaScript(showreferences);
    	visibilityOf(showreferences_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(showreferences_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	//clickElementUsingJavaScript(showreferences);
    	
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
    public void clickongetcoupons() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(getcoupons);
    	moveToElement(getcoupons);
    	clickElementUsingJavaScript(getcoupons);
    	visibilityOf(getcoupons_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(getcoupons_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(getcoupons_txt));
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
