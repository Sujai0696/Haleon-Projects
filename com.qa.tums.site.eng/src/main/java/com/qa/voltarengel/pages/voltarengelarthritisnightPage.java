package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelarthritisnightPage extends BaseClass{
	
	public voltarengelarthritisnightPage() {
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
    private static WebElement livingwitharthrist_breadcrumbs;			
			
    @FindBy(xpath = "//a[text()='Exercises for Arthritis Pain Relief']")
    private static WebElement exercisearthristrelief_breadcrumbs;		
	
    @FindBy(xpath = "//a[text()='Why Arthritis Hurts at Night']")
    private static WebElement arthristatnight_breadcrumbs;			
	
    @FindBy(xpath = "//a[text()='Osteoarthritis pain']")
    private static WebElement Osteoarthrist;	
	
    @FindBy(xpath = "//h1[text()='What Causes Arthritis?']")
    private static WebElement Osteoarthrist_txt;	
	
    @FindBy(xpath = "//a[text()='stress']")
    private static WebElement stress;	
	
    @FindBy(xpath = "//span[text()='How to Manage Stress When Living With Arthritis']")
    private static WebElement stress_txt;	
	
    @FindBy(xpath = "//a[text()='Exercise']")
    private static WebElement exercise;	
    
    @FindBy(xpath = "//h1[text()='Exercises for Arthritis & Joint Pain Relief']")
    private static WebElement exercise_txt;	
    
    @FindBy(xpath = "//a[text()='topical creams']")
    private static WebElement tropicalcreams;	
    
    @FindBy(xpath = "//span[text()='How Arthritis Pain Cream & Gel Works']")
    private static WebElement tropicalcreams_txt;	
    
    @FindBy(xpath = "//a[text()='Voltaren Arthritis Pain Gel']")
    private static WebElement voltarenarthristpaingel;	
    
    @FindBy(xpath = "//h1[text()='What is Voltaren Arthritis Pain Relief Gel?']")
    private static WebElement voltarenarthristpaingel_txt;	
    
    @FindBy(xpath = "//a[text()='living with arthritis']")
    private static WebElement livingwitharthritis;	
    
    @FindBy(xpath = "//h1[text()='How to Manage and Live With Arthritis Pain']")
    private static WebElement livingwitharthritis_txt;	
    
    @FindBy(xpath = "//a[text()='understanding pain']")
    private static WebElement understandingpain;	
    
    @FindBy(xpath = "//h1[text()='Understanding What Your Pain Specifically Means']")
    private static WebElement understandingpain_txt;
    
    @FindBy(xpath = "//a[text()='Voltaren webpage']")
    private static WebElement voltarenwebpage;
    
    @FindBy(xpath = "//h1[text()='Powerful Arthritis Pain Relief In a Gel']")
    private static WebElement voltarenwebpage_txt;
    
    @FindBy(xpath = "//span[text()='Show References']")
    private static WebElement ShowReferences;
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement ShowReferences_Active;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//a[@href='/living-with-arthritis/how-to-relieve-arthritis-pain/']")
    private static WebElement Readmore1;
    
    @FindBy(xpath = "//span[text()='How to Find Arthritis Pain Relief']")
    private static WebElement Readmore1_txt;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//a[@href='/living-with-arthritis/effects-of-aging-on-the-body/']")
    private static WebElement Readmore2;
    
    @FindBy(xpath = "//span[text()='What are the Effects of Aging on the Body']")
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
    public void clickonlivingwitharthrist_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(livingwitharthrist_breadcrumbs);
    	clickElementUsingJavaScript(livingwitharthrist_breadcrumbs);
    	pageLoad();
    }				
    public void clickonexercisespainrelief_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(exercisearthristrelief_breadcrumbs);
    	clickElementUsingJavaScript(exercisearthristrelief_breadcrumbs);
    	pageLoad();
    }				
    public void clickonArthristatnight_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(arthristatnight_breadcrumbs);
    	clickElementUsingJavaScript(arthristatnight_breadcrumbs);
    	pageLoad();
    }				
    public void clickonOsteoarthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Osteoarthrist);
    	moveToElement(Osteoarthrist);
    	clickElementUsingJavaScript(Osteoarthrist);
    	visibilityOf(Osteoarthrist_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(Osteoarthrist_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Osteoarthrist_txt));
    	pageLoad();
    }				
    public void clickonStress() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(stress);
    	moveToElement(stress);
    	clickElementUsingJavaScript(stress);
    	visibilityOf(stress_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(stress_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(stress_txt));
    	pageLoad();
    }				
    public void clickonExercise() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(exercise);
    	moveToElement(exercise);
    	clickElementUsingJavaScript(exercise);
    	visibilityOf(exercise_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(exercise_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(exercise_txt));
    	pageLoad();
    }				
    public void clickonTropicalcreams() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(tropicalcreams);
    	moveToElement(tropicalcreams);
    	clickElementUsingJavaScript(tropicalcreams);
    	visibilityOf(tropicalcreams_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(tropicalcreams_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(tropicalcreams_txt));
    	pageLoad();
    }				
    public void clickonVoltarenarthristpaingel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenarthristpaingel);
    	moveToElement(voltarenarthristpaingel);
    	clickElementUsingJavaScript(voltarenarthristpaingel);
    	visibilityOf(voltarenarthristpaingel_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenarthristpaingel_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenarthristpaingel_txt));
    	pageLoad();
    }				
    public void clickonlivingwitharthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(livingwitharthritis);
    	moveToElement(livingwitharthritis);
    	clickElementUsingJavaScript(livingwitharthritis);
    	visibilityOf(livingwitharthritis_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(livingwitharthritis_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(livingwitharthritis_txt));
    	pageLoad();
    }				
    public void clickonUnderstandingpain() throws Exception {
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
    public void clickonVoltarenwebpage() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenwebpage);
    	moveToElement(voltarenwebpage);
    	clickElementUsingJavaScript(voltarenwebpage);
    	visibilityOf(voltarenwebpage_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenwebpage_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenwebpage_txt));
    	pageLoad();
    }				
    public void clickonShowReferences() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ShowReferences);
    	moveToElement(ShowReferences);
    	clickElementUsingJavaScript(ShowReferences);
    	visibilityOf(ShowReferences_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(ShowReferences_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	//System.out.println(getElementText(ShowReferences_Active));
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
