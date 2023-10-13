package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelarthristweatherPage extends BaseClass{
	
	public voltarengelarthristweatherPage() {
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
		
    @FindBy(xpath = "//a[text()='Does Weather Affect Arthritis Pain? | Voltaren']")
    private static WebElement weatheraffectsarthristpain_breadcrumbs;
	
    @FindBy(xpath = "//a[text()='dealing with arthritis']")
    private static WebElement dealingwitharthrist;
	
    @FindBy(xpath = "//h1[text()='Managing Arthritis']")
    private static WebElement dealingwitharthrist_txt;
	
    @FindBy(xpath = "//a[text()='soreness and pain']")
    private static WebElement sorenesspain;
	
    @FindBy(xpath = "//span[text()='What is Pain? Where Does It Come From?']")
    private static WebElement sorenesspain_txt;
	
    @FindBy(xpath = "//a[text()='arthritis symptoms']")
    private static WebElement arthristsymptoms;
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style first odd last component col-xs-12 col-lg-10 col-lg-offset-1']")
    private static WebElement arthristsymptoms_txt;
	
    @FindBy(xpath = "//a[text()='symptoms']")
    private static WebElement symptoms;
    
    @FindBy(xpath = "//a[text()='remedy for the pain']")
    private static WebElement remedyforpain;
    
    @FindBy(xpath = "//span[text()='How to Find Arthritis Pain Relief']")
    private static WebElement remedyforpain_txt;
    
    @FindBy(xpath = "//span[text()='Show References']")
    private static WebElement showReferences;
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement showReferences_Active;
    
    @FindBy(xpath = "//a[@href='/what-is-arthritis/types/']")
    private static WebElement Readmore1;
    
    @FindBy(xpath = "//span[text()='What are the Different Types of Arthritis?']")
    private static WebElement Readmore1_txt;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//a[@href='/understanding-pain/about-pain/']")
    private static WebElement Readmore2;
    
    @FindBy(xpath = "//span[text()='What is Pain? Where Does It Come From?']")
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
    public void clickonweatheraffectsarthristpain_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(weatheraffectsarthristpain_breadcrumbs);
    	clickElementUsingJavaScript(weatheraffectsarthristpain_breadcrumbs);
    	pageLoad();
    }				
    public void clickonDealingwithArthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(dealingwitharthrist);
    	moveToElement(dealingwitharthrist);
    	clickElementUsingJavaScript(dealingwitharthrist);
    	//moveToElement(dealingwitharthrist_txt);
    	visibilityOf(dealingwitharthrist_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(dealingwitharthrist_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(dealingwitharthrist_txt));
    	pageLoad();
    }			
    public void clickonSorenesspain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(sorenesspain);
    	moveToElement(sorenesspain);
    	clickElementUsingJavaScript(sorenesspain);
    	visibilityOf(sorenesspain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(sorenesspain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(sorenesspain_txt));
    	pageLoad();
    }			
    public void clickonarthristsymptoms() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(arthristsymptoms);
    	moveToElement(arthristsymptoms);
    	clickElementUsingJavaScript(arthristsymptoms);
    	//visibilityOf(sorenesspain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(arthristsymptoms_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(arthristsymptoms_txt));
    	pageLoad();
    }			
    public void clickonSymptoms() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(symptoms);
    	moveToElement(symptoms);
    	clickElementUsingJavaScript(symptoms);
    	pageLoad();
    }
    public void clickonRemedyforpain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(remedyforpain);
    	moveToElement(remedyforpain);
    	clickElementUsingJavaScript(remedyforpain);
    	visibilityOf(remedyforpain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(remedyforpain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(remedyforpain_txt));
    	pageLoad();
    }			
    public void clickonShowReferences() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(showReferences);
    	moveToElement(showReferences);
    	clickElementUsingJavaScript(showReferences);
    	visibilityOf(showReferences_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(showReferences_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	//System.out.println(getElementText(showReferences_Active));
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
