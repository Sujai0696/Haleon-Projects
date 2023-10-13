package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelarthristcausesPage extends BaseClass{
	
	public voltarengelarthristcausesPage() {
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
	
    @FindBy(xpath = "//a[text()='What is Arthritis?']")
    private static WebElement whatisarthrist_breadcrumbs;			
	
    @FindBy(xpath = "//a[text()='What are the Causes of Arthritis? | Voltaren']")
    private static WebElement causesarthristvoltaren_breadcrumbs;		
	
    @FindBy(xpath = "//i[@class='icon icon-video-play']")
    private static WebElement Youtube_button;		
	
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement Youtube_visibility;	
	
    @FindBy(xpath = "//button[@title='Pause (k)']")
    private static WebElement Youtube_play;	
	
    @FindBy(xpath = "//span[text()='Show Transcript']")
    private static WebElement showtranscript;	
	
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement showtranscript_Active;
	
    @FindBy(xpath = "//a[text()='people around the world to write off mild joint pain']")
    private static WebElement mildjointpain;
    
    @FindBy(xpath = "//span[text()='The Impact of Body Pain Around the World']")
    private static WebElement mildjointpain_txt;
    
    @FindBy(xpath = "//a[text()='arthritis pain']")
    private static WebElement arthristpain;
    
    @FindBy(xpath = "//span[text()='What is Pain? Where Does It Come From?']")
    private static WebElement arthristpain_txt;
    
    @FindBy(xpath = "//a[text()='inflammation']")
    private static WebElement inflammation;
    
    @FindBy(xpath = "//a[text()='treatment options']")
    private static WebElement treatmentoptions;
    
    @FindBy(xpath = "//h1[text()='Managing Arthritis']")
    private static WebElement treatmentoptions_txt;
    
    @FindBy(xpath = "//a[text()='exercising']")
    private static WebElement exercising;

    @FindBy(xpath = "//h1[text()='Exercises for Arthritis & Joint Pain Relief']")
    private static WebElement exercising_txt;
    
    @FindBy(xpath = "//span[text()='Show References']")
    private static WebElement ShowReferences;
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement ShowReferences_Active;
    
    @FindBy(xpath = "//a[@href='/what-is-arthritis/symptoms/']")
    private static WebElement Readmore1;
    
    @FindBy(xpath = "//h1[@class='innerHeading text-center']")
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
    public void clickonwhatisarthrist_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(whatisarthrist_breadcrumbs);
    	clickElementUsingJavaScript(whatisarthrist_breadcrumbs);
    	pageLoad();
    }			
    public void clickoncausesArthristvoltaren_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(causesarthristvoltaren_breadcrumbs);
    	clickElementUsingJavaScript(causesarthristvoltaren_breadcrumbs);
    	pageLoad();
    }			
    public void clickonYoutube_Button() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Youtube_button);
    	clickElementUsingJavaScript(Youtube_button);
    	visibilityOf(Youtube_visibility);
    	actionClick(Youtube_visibility);
    	boolean elementIsDisplayed=elementIsDisplayed(Youtube_visibility);
    	Assert.assertTrue(elementIsDisplayed);
    	//moveToElement(Youtube_play);
    	//clickElementUsingJavaScript(Youtube_play);
    	pageLoad();
    }			
    public void clickonShowTranscript_Button() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(showtranscript);
    	clickElementUsingJavaScript(showtranscript);
    	visibilityOf(showtranscript_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(showtranscript_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	pageLoad();
    }			
    public void clickonMildjointpain_Button() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(mildjointpain);
    	clickElementUsingJavaScript(mildjointpain);
    	visibilityOf(mildjointpain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(mildjointpain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(mildjointpain_txt));
    	pageLoad();
    }			
    public void clickonArthristpain_Button() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(arthristpain);
    	clickElementUsingJavaScript(arthristpain);
    	visibilityOf(arthristpain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(arthristpain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(arthristpain_txt));
    	pageLoad();
    }			
    public void clickonInflammation_Button() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(inflammation);
    	clickElementUsingJavaScript(inflammation);
    	
    	pageLoad();
    }
    public void clickonTreatmentoptions_Button() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(treatmentoptions);
    	clickElementUsingJavaScript(treatmentoptions);
    	visibilityOf(treatmentoptions_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(treatmentoptions_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(treatmentoptions_txt));
    	pageLoad();
    }			
    public void clickonExercise_Button() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(exercising);
    	clickElementUsingJavaScript(exercising);
    	visibilityOf(exercising_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(exercising_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText( exercising_txt));
    	pageLoad();
    }			
    public void clickonShowReferences_Button() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ShowReferences);
    	clickElementUsingJavaScript(ShowReferences);
    	visibilityOf(ShowReferences_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(ShowReferences_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	pageLoad();
    }			
    public void clickonReadmore1_Button() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Readmore1);
    	clickElementUsingJavaScript(Readmore1);
    	visibilityOf(Readmore1_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(Readmore1_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Readmore1_txt));
    	pageLoad();
    }			
    public void clickonReadmore2_Button() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Readmore2);
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
