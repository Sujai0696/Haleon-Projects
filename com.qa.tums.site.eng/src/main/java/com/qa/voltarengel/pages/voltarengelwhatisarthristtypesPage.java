package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelwhatisarthristtypesPage extends BaseClass{
	
	public voltarengelwhatisarthristtypesPage() {
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
	
    @FindBy(xpath = "//a[text()='What are the Types of Arthritis? | Voltaren']")
    private static WebElement whattypesarthristvoltaren_breadcrumbs;	
	
    @FindBy(xpath = "//i[@class='icon icon-video-play']")
    private static WebElement youtube_button;	
	
    @FindBy(xpath = "//div[@class='video-content']")
    private static WebElement youtube_visibility;	
	
    @FindBy(xpath = "//iframe[@class='responsive-iframe']")
    private static WebElement iframe;	
	
    @FindBy(xpath = "//div[@class='accordion component section referenceAccordion video-transcript even last col-xs-12']//header[@class='accordion-head']")
    private static WebElement showtranscript;	
	
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement showtranscript_Active;	
	
    @FindBy(xpath = "//a[text()='chronic knee pain']")
    private static WebElement chronickneepain;	
	
    @FindBy(xpath = "//span[text()='What is Pain? Where Does It Come From?']")
    private static WebElement chronickneepain_txt;	
	
    @FindBy(xpath = "//a[text()='relief']")
    private static WebElement relief;	
	
    @FindBy(xpath = "//span[text()='How to Find Arthritis Pain Relief']")
    private static WebElement relief_txt;	
	
    @FindBy(xpath = "//a[text()='symptoms']")
    private static WebElement symptoms;	
	
    @FindBy(xpath = "//span[text()='Arthritis symptoms take many different forms, and the pain you may experience is unique to you.']")
    private static WebElement symptoms_txt;	
	
    @FindBy(xpath = "//div[@class='accordion component section referenceAccordion video-transcript even last col-xs-12']//header[@class='accordion-head']")
    private static WebElement ShowReferences;	
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement ShowReferences_Active;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//a[@href='/what-is-arthritis/symptoms/']")
    private static WebElement Readmore1;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style first odd last component col-xs-12 col-lg-10 col-lg-offset-1']//h1")
    private static WebElement Readmore1_txt;
    
    @FindBy(xpath = "//a[@href='/what-is-arthritis/causes/']")
    private static WebElement Readmore2;
    
    @FindBy(xpath = "//span[text()='What are the Different Causes of Arthritis?']")
    private static WebElement Readmore2_txt;
    
    @FindBy(xpath = "//a[text()='SIGN ME UP']")
    private static WebElement signmeup;
    
    @FindBy(xpath = "//h1[text()='Voltaren Arthritis Pain Gel Coupons']")
    private static WebElement signmeup_txt;
    
    @FindBy(xpath = "//a[text()='Get Coupons']")
    private static WebElement getcoupons;
    
    @FindBy(xpath = "//h1[text()='Voltaren Arthritis Pain Gel Coupons']")
    private static WebElement getcoupons_txt;
    
    
    
    
    
    
    
    
    
	
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
    public void clickonwhattypesarthrist_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(whattypesarthristvoltaren_breadcrumbs);
    	clickElementUsingJavaScript(whattypesarthristvoltaren_breadcrumbs);
    	pageLoad();
    }			
    public void clickonYoutube() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(youtube_button);
    	//moveToElement(youtube_button);
    	clickElementUsingJavaScript(youtube_button);
    	//Thread.sleep(1000);
    	//switchToFrameUsingElement(iframe);
    	visibilityOf(youtube_visibility);
    	actionClick(youtube_visibility);
    	boolean elementIsDisplayed=elementIsDisplayed(youtube_visibility);
    	Assert.assertTrue(elementIsDisplayed);
    	//frameSwitchingToDefaultContent();
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
    public void clickonchronickneepain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(chronickneepain);
    	clickElementUsingJavaScript(chronickneepain);
    	visibilityOf(chronickneepain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(chronickneepain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(chronickneepain_txt));
    	pageLoad();
    }			
    public void clickonRelief() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(relief);
    	clickElementUsingJavaScript(relief);
    	visibilityOf(relief_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(relief_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(relief_txt));
    	pageLoad();
    }			
    public void clickonSymptoms() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(symptoms);
    	clickElementUsingJavaScript(symptoms);
    	visibilityOf(symptoms_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(symptoms_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(symptoms_txt));
    	pageLoad();
    }			
    public void clickonShowReferences() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ShowReferences);
    	clickElementUsingJavaScript(ShowReferences);
    	visibilityOf(ShowReferences_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(ShowReferences_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	//System.out.println(getElementText(symptoms_txt));
    	pageLoad();
    }			
    public void clickonReadmore1() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Readmore1);
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
    	clickElementUsingJavaScript(Readmore2);
    	visibilityOf(Readmore2_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(Readmore2_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Readmore2_txt));
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
    public void clickongetcoupons() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(getcoupons);
    	clickElementUsingJavaScript(getcoupons);
    	visibilityOf(getcoupons_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(getcoupons_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(getcoupons_txt));
    	pageLoad();
    }			
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
