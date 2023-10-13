package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelarthristpainwhiletravellingPage extends BaseClass{

	public voltarengelarthristpainwhiletravellingPage() {
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
	
    @FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']")
    private static WebElement managepainwhiletravelling_breadcrumbs;
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage padding-10-bottom padding-20-top-dt even component col-xs-12 col-lg-10 col-lg-offset-1']//a[@href='/understanding-pain/']")
    private static WebElement arthristpain;
	
    @FindBy(xpath = "//h1[text()='Understanding What Your Pain Specifically Means']")
    private static WebElement arthristpain_txt;
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage padding-10-bottom padding-20-top-dt even component col-xs-12 col-lg-10 col-lg-offset-1']//a[@href='/living-with-arthritis/exercises/']")
    private static WebElement exercise;
	
    @FindBy(xpath = "//h1[text()='Exercises for Arthritis & Joint Pain Relief']")
    private static WebElement exercise_txt;
	
    @FindBy(xpath = "//a[text()='managing arthritis at work']")
    private static WebElement managing_arthristwork;
	
    @FindBy(xpath = "//span[text()='Learn how you can manage pain caused by arthritis when you’re at work.']")
    private static WebElement managing_arthristwork_txt;
    
    @FindBy(xpath = "//a[text()='managing arthritis at home']")
    private static WebElement managing_arthristathome;
    
    @FindBy(xpath = "//span[text()='Arthritis Pain Relief at Home']")
    private static WebElement managing_arthristathometxt;
    
    
    @FindBy(xpath = "//a[text()='living independently with arthritis']")
    private static WebElement livingindependtlyarthrist;
    
    @FindBy(xpath = "//span[text()='Living Alone With Arthritis']")
    private static WebElement livingindependtlyarthrist_txt;
    
    @FindBy(xpath = "//header[@class='accordion-head']")
    private static WebElement showreferences;
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement showreferences_Active;
    
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
    public void clickonmanagepainwhiletravelling_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(managepainwhiletravelling_breadcrumbs);
    	pageLoad();
    }
    public void clickonarthristpain() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(arthristpain);
    	visibilityOf(arthristpain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(arthristpain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(arthristpain_txt));
    	pageLoad();
    }
    public void clickonExercise() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(exercise);
    	visibilityOf(exercise_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(exercise_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(exercise_txt));
    	pageLoad();
    }
    public void clickonManagingArthrist() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(managing_arthristwork);
    	visibilityOf(managing_arthristwork_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(managing_arthristwork_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(managing_arthristwork_txt));
    	pageLoad();
    }
    public void clickonlivingindependentarthrist() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(livingindependtlyarthrist);
    	visibilityOf(livingindependtlyarthrist_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(livingindependtlyarthrist_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(livingindependtlyarthrist_txt));
    	pageLoad();
    }
    public void clickonShowReferences() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(showreferences);
    	clickElementUsingJavaScript(showreferences);
    	visibilityOf(showreferences_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(showreferences_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	//System.out.println(getElementText(showreferences));
    	pageLoad();
    }
    public void clickonGetCoupons() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(getcoupons);
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
