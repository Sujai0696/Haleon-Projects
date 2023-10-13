package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelarthristsymptomsPage extends BaseClass{
	
	public voltarengelarthristsymptomsPage() {
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
	
    @FindBy(xpath = "//a[text()='What are the Signs & Symptoms of Arthritis? ']")
    private static WebElement signssymptomsArthrist_breadcrumbs;	
	
    @FindBy(xpath = "//i[@class='icon icon-video-play']")
    private static WebElement youtube_button;	
	
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement youtube_visibility;	
	
    @FindBy(xpath = "//span[text()='Show Transcript']")
    private static WebElement showtranscript;	
	
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement showtranscript_Active;	
	
    @FindBy(xpath = "//a[text()='types of arthritis']")
    private static WebElement typesarthrist;	
	
    @FindBy(xpath = "//span[text()='What are the Different Types of Arthritis?']")
    private static WebElement typesarthrist_txt;
	
    @FindBy(xpath = "//a[text()='Arthritis can strike at any stage in life']")
    private static WebElement arthriststrikelife;
    
    @FindBy(xpath = "//span[text()='What are the Effects of Aging on the Body']")
    private static WebElement arthriststrikelife_txt;
    
    @FindBy(xpath = "//a[text()='find a path to relief']")
    private static WebElement pathtorelief;
    
    @FindBy(xpath = "//span[text()='How to Find Arthritis Pain Relief']")
    private static WebElement pathtorelief_txt;
    
    @FindBy(xpath = "//a[text()='stress']")
    private static WebElement stress;
    
    @FindBy(xpath = "//span[text()='How to Manage Stress When Living With Arthritis']")
    private static WebElement stress_txt;
    
    @FindBy(xpath = "//div[@class='accordion component section referenceAccordion video-transcript even last col-xs-12']//header[@class='accordion-head']")
    private static WebElement ShowReferences;
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement ShowReferences_Active;
    
    @FindBy(xpath = "//a[@href='/what-is-arthritis/causes/']")
    private static WebElement whatisArthrist;
    
    @FindBy(xpath = "//span[text()='What are the Different Causes of Arthritis?']")
    private static WebElement whatisArthrist_txt;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//a[@href='/what-is-arthritis/types/']")
    private static WebElement Readmore1;
    
    @FindBy(xpath = "//span[text()='What are the Different Types of Arthritis?']")
    private static WebElement Readmore1_txt;
    
    @FindBy(xpath = "//a[text()='SIGN ME UP']")
    private static WebElement signmeup;
    
    @FindBy(xpath = "//h1[text()='Voltaren Arthritis Pain Gel Coupons']")
    private static WebElement signmeup_txt;
    
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
    public void clickonSignsymptomsArthrist_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(signssymptomsArthrist_breadcrumbs);
    	clickElementUsingJavaScript(signssymptomsArthrist_breadcrumbs);
    	pageLoad();
    }			
    public void clickonYouTubeButton() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(youtube_button);
    	clickElementUsingJavaScript(youtube_button);
    	visibilityOf(youtube_visibility);
    	actionClick(youtube_visibility);
    	boolean elementIsDisplayed=elementIsDisplayed(youtube_visibility);
    	Assert.assertTrue(elementIsDisplayed);
    	pageLoad();
    }			
    public void clickonShowTranscript() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(showtranscript);
    	clickElementUsingJavaScript(showtranscript);
    	visibilityOf(showtranscript_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(showtranscript_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	pageLoad();
    }			
    public void clickonTypesArthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(typesarthrist);
    	clickElementUsingJavaScript(typesarthrist);
    	visibilityOf(typesarthrist_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(typesarthrist_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(typesarthrist_txt));
    	pageLoad();
    }			
    public void clickonArthriststrikelife() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(arthriststrikelife);
    	clickElementUsingJavaScript(arthriststrikelife);
    	visibilityOf(arthriststrikelife_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(arthriststrikelife_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(arthriststrikelife_txt));
    	pageLoad();
    }			
    public void clickonPathtoRelief() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(pathtorelief);
    	clickElementUsingJavaScript(pathtorelief);
    	visibilityOf(pathtorelief_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(pathtorelief_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(pathtorelief_txt));
    	pageLoad();
    }			
    public void clickonStress() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(stress);
    	clickElementUsingJavaScript(stress);
    	visibilityOf(stress_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(stress_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(stress_txt));
    	pageLoad();
    }			
    public void clickonShowReferences() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ShowReferences);
    	clickElementUsingJavaScript(ShowReferences);
    	visibilityOf(ShowReferences_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(ShowReferences_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	//System.out.println(getElementText(ShowReferences_Active));
    	pageLoad();
    }			
    public void clickonWhatisArthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(whatisArthrist);
    	clickElementUsingJavaScript(whatisArthrist);
    	visibilityOf(whatisArthrist_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(whatisArthrist_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(whatisArthrist_txt));
    	pageLoad();
    }		
    public void clickonReadmore2() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Readmore1);
    	clickElementUsingJavaScript(Readmore1);
    	visibilityOf(Readmore1_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(Readmore1_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Readmore1_txt));
    	pageLoad();
    }		
    public void clickonSignmeup() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(signmeup);
    	clickElementUsingJavaScript(signmeup);
    	visibilityOf(signmeup_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(signmeup_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(signmeup_txt));
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
