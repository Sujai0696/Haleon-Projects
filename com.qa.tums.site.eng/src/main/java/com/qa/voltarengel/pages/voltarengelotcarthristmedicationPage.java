package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelotcarthristmedicationPage extends BaseClass{
	
	public voltarengelotcarthristmedicationPage() {
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
	
    @FindBy(xpath = "//a[text()='Living with Arthritis']")
    private static WebElement livingwithArthrist_breadcrumbs;			
	
    @FindBy(xpath = "//a[text()='Managing Your Arthritis']")
    private static WebElement  managingarthrist_breadcrumbs;	
		
    @FindBy(xpath = "//a[text()='OTC Arthritis Medication']")
    private static WebElement  otcarthristmedications_breadcrumbs;	
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage padding-10-bottom padding-20-top-dt first odd last component col-xs-12 col-lg-10 col-lg-offset-1']//a[@href='/living-with-arthritis/']")
    private static WebElement  livingwitharthrist;	
	
    @FindBy(xpath = "//h1[text()='How to Manage and Live With Arthritis Pain']")
    private static WebElement  livingwitharthrist_txt;	
	
    @FindBy(xpath = "//a[text()='help relieve symptoms']")
    private static WebElement  helprelievesymptoms;	
	
    @FindBy(xpath = "//h1[@class='innerHeading text-center']")
    private static WebElement  helprelievesymptoms_txt;	
	
    @FindBy(xpath = "//a[text()='manage the pain']")
    private static WebElement  managepain;	
	
    @FindBy(xpath = "//h1[text()='Managing Arthritis']")
    private static WebElement  managepain_txt;	
	
    @FindBy(xpath = "//a[text()='kind of arthritis']")
    private static WebElement  kindarthrist;	
	
    @FindBy(xpath = "//span[text()='What are the Different Types of Arthritis?']")
    private static WebElement  kindarthrist_txt;
    
    @FindBy(xpath = "//a[text()='Arthritis sufferers']")
    private static WebElement  arthristsuffers;
    
    @FindBy(xpath = "//h1[text()='What Causes Arthritis?']")
    private static WebElement  arthristsuffers_txt;
    
    @FindBy(xpath = "//a[text()='pain relief']")
    private static WebElement  painrelief;
    
    @FindBy(xpath = "//span[text()='How to Find Arthritis Pain Relief']")
    private static WebElement  painrelief_txt;
    
    @FindBy(xpath = "//a[text()='understanding your pain']")
    private static WebElement  understandingpain;
    
    @FindBy(xpath = "//h1[text()='Understanding What Your Pain Specifically Means']")
    private static WebElement  understandingpain_txt;
    
    @FindBy(xpath = "//a[text()='living with arthritis']")
    private static WebElement  livingwitharthrists;
    
    @FindBy(xpath = "//h1[text()='How to Manage and Live With Arthritis Pain']")
    private static WebElement  livingwitharthrists_txt;
    
    @FindBy(xpath = "//a[text()='Voltaren']")
    private static WebElement  voltaren;
    
    @FindBy(xpath = "//h1[text()='What is Voltaren Arthritis Pain Relief Gel?']")
    private static WebElement  voltaren_txt;
    
    @FindBy(xpath = "//header[@class='accordion-head']")
    private static WebElement  Showreferences;
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement  Showreferences_Active;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/over-the-counter-diclofenac-gel/']")
    private static WebElement  Readmore1;
    
    @FindBy(xpath = "//span[text()='Diclofenac Gel']")
    private static WebElement  Readmore1_txt;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/how-otc-arthritis-cream-gel-works/']")
    private static WebElement  Readmore2;
    
    @FindBy(xpath = "//span[text()='How Arthritis Pain Cream & Gel Works']")
    private static WebElement  Readmore2_txt;
    
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
    public void clickonlivingArthrist_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(livingwithArthrist_breadcrumbs);
    	clickElementUsingJavaScript(livingwithArthrist_breadcrumbs);
    	pageLoad();
    }		
    public void clickonManagingArthrist_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(managingarthrist_breadcrumbs);
    	clickElementUsingJavaScript(managingarthrist_breadcrumbs);
    	pageLoad();
    }		
    public void clickonotcArthristmedications_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(otcarthristmedications_breadcrumbs);
    	clickElementUsingJavaScript(otcarthristmedications_breadcrumbs);
    	pageLoad();
    }		
    public void clickonlivingwitharthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(livingwitharthrist);
    	//moveToElement(livingwitharthrist);
    	clickElementUsingJavaScript(livingwitharthrist);
    	visibilityOf(livingwitharthrist_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(livingwitharthrist_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(livingwitharthrist_txt));
    	pageLoad();
    }		
    public void clickonhelprelievesymptoms() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(helprelievesymptoms);
    	moveToElement(helprelievesymptoms);
    	clickElementUsingJavaScript(helprelievesymptoms);
    	visibilityOf(helprelievesymptoms_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(helprelievesymptoms_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(helprelievesymptoms_txt));
    	pageLoad();
    }		
    public void clickonmanagepain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(managepain);
    	moveToElement(managepain);
    	clickElementUsingJavaScript(managepain);
    	visibilityOf(managepain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(managepain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(managepain_txt));
    	pageLoad();
    }		
    public void clickonkindarthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(kindarthrist);
    	moveToElement(kindarthrist);
    	clickElementUsingJavaScript(kindarthrist);
    	visibilityOf(kindarthrist_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(kindarthrist_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(kindarthrist_txt));
    	pageLoad();
    }		
    public void clickonArthristsufferes() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(arthristsuffers);
    	moveToElement(arthristsuffers);
    	clickElementUsingJavaScript(arthristsuffers);
    	visibilityOf(arthristsuffers_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(arthristsuffers_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(arthristsuffers_txt));
    	pageLoad();
    }		
    public void clickonpainrelief() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(painrelief);
    	moveToElement(painrelief);
    	clickElementUsingJavaScript(painrelief);
    	visibilityOf(painrelief_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(painrelief_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(painrelief_txt));
    	pageLoad();
    }		
    public void clickonunderstandingpain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(understandingpain);
    	moveToElement(understandingpain);
    	clickElementUsingJavaScript(understandingpain);
    	visibilityOf(understandingpain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(understandingpain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(understandingpain_txt));
    	pageLoad();
    }		
    public void clickonlivingwitharthrists() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(livingwitharthrists);
    	moveToElement(livingwitharthrists);
    	clickElementUsingJavaScript(livingwitharthrists);
    	visibilityOf(livingwitharthrists_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(livingwitharthrists_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(livingwitharthrists_txt));
    	pageLoad();
    }		
	
    public void clickonvoltaren() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltaren);
    	moveToElement(voltaren);
    	clickElementUsingJavaScript(voltaren);
    	visibilityOf(voltaren_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(voltaren_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltaren_txt));
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
    	//System.out.println(getElementText(voltaren_txt));
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
