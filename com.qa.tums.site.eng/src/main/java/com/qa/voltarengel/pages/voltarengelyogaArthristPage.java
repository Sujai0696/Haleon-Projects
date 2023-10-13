package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelyogaArthristPage extends BaseClass{

	public voltarengelyogaArthristPage() {
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
	
    @FindBy(xpath = "//a[text()='Yoga for Arthritis: Poses for Physical Comfort']")
    private static WebElement yogaArthrist_breadcrumbs;
	
    @FindBy(xpath = "//a[text()='certain exercises']")
    private static WebElement certainexercise;
	
    @FindBy(xpath = "//span[text()='Exercises for Arthritis']")
    private static WebElement certainexercise_txt;
	
    @FindBy(xpath = "//a[text()='different types of arthritis']")
    private static WebElement differenttypesArthrist;
	
    @FindBy(xpath = "//span[text()='What are the Different Types of Arthritis?']")
    private static WebElement differenttypesArthrist_txt;
	
    @FindBy(xpath = "//a[text()='Voltaren Arthritis Pain Gel']")
    private static WebElement voltarenArthristpaingel;
	
    @FindBy(xpath = "//h1[text()='What is Voltaren Arthritis Pain Relief Gel?']")
    private static WebElement voltarenArthristpaingel_txt;
	
    @FindBy(xpath = "//a[text()='living with arthritis']")
    private static WebElement livingwithArthrist;
    
    @FindBy(xpath = "//h1[text()='How to Manage and Live With Arthritis Pain']")
    private static WebElement livingwithArthrist_txt;
    
    @FindBy(xpath = "//header[@class='accordion-head']")
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
    public void clickonlivingarthrist_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(livingarthrist_breadcrumbs);
    	pageLoad();
    }
    public void clickonYogaArthrist_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(yogaArthrist_breadcrumbs);
    	clickElementUsingJavaScript(yogaArthrist_breadcrumbs);
    	pageLoad();
    }
    public void clickonCertainExercise() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(certainexercise);
    	moveToElement(certainexercise);
    	clickElementUsingJavaScript(certainexercise);
    	visibilityOf(certainexercise_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(certainexercise_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(certainexercise_txt));
    	pageLoad();
    }
    public void clickonDifferentArthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(differenttypesArthrist);
    	moveToElement(differenttypesArthrist);
    	clickElementUsingJavaScript(differenttypesArthrist);
    	visibilityOf(differenttypesArthrist_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(differenttypesArthrist_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(differenttypesArthrist_txt));
    	pageLoad();
    }
	
    public void clickonVoltarenArthristpaingel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenArthristpaingel);
    	moveToElement(voltarenArthristpaingel);
    	clickElementUsingJavaScript(voltarenArthristpaingel);
    	visibilityOf(voltarenArthristpaingel_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenArthristpaingel_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenArthristpaingel_txt));
    	pageLoad();
    }
    public void clickonlivingwithArthristpaingel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(livingwithArthrist);
    	moveToElement(livingwithArthrist);
    	clickElementUsingJavaScript(livingwithArthrist);
    	visibilityOf(livingwithArthrist_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(livingwithArthrist_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(livingwithArthrist_txt));
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
    public void clickonReadMore1() throws Exception {
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
    public void clickonReadMore2() throws Exception {
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
