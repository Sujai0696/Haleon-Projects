package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelTestimonialsPage extends BaseClass{
	
	public voltarengelTestimonialsPage() {
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
	
    @FindBy(xpath = "//a[text()='About Voltaren']")
    private static WebElement aboutvoltaren_breadcrumbs;	
	
    @FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']")
    private static WebElement Testimonials_breadcrumbs;	
	
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[1]")
    private static WebElement youtube_button1;	
	
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement youtube_visibility1;	
	
    @FindBy(xpath = "(//div[@class='accordion component section referenceAccordion video-transcript even last col-xs-12']//child::span[text()='Show Transcript'])[1]")
    private static WebElement showtranscript1;	
	
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement showtranscript1_Active;	
	
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[2]")
    private static WebElement youtube_button2;	
	
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement youtube_visibility2;	
	
    @FindBy(xpath = "(//header[@class='accordion-head'])[2]")
    private static WebElement showtranscript2;	
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement showtranscript2_Active;	
    
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[3]")
    private static WebElement youtube_button3;	
    
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement youtube_visibility3;	
    
    @FindBy(xpath = "(//header[@class='accordion-head'])[3]")
    private static WebElement showtranscript3;	
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement showtranscript3_Active;	
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//a[@href='/living-with-arthritis/stress/']")
    private static WebElement ReadMore1;	
    
    @FindBy(xpath = "//span[text()='How to Manage Stress When Living With Arthritis']")
    private static WebElement ReadMore1_txt;	
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//a[@href='/living-with-arthritis/first-arthritis-friendly-site/']")
    private static WebElement ReadMore2;	
	
    @FindBy(xpath = "//span[text()='The First Arthritis-Friendly Website, Designed for You']")
    private static WebElement ReadMore2_txt;	
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage margin-60-top-dt even last component col-xs-12 col-md-3']//child::a[text()='Get Coupons']")
    private static WebElement getcoupons;	
    
    @FindBy(xpath = "//h1[text()='Voltaren Arthritis Pain Gel Coupons']")
    private static WebElement getcoupons_txt;	
    
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
    public void clickonaboutvoltarenBreadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(aboutvoltaren_breadcrumbs);
    	pageLoad();
    }
    public void clickonTestimonialsBreadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(Testimonials_breadcrumbs);
    	pageLoad();
    }
    public void clickonYoutube1() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(youtube_button1);
    	clickElementUsingJavaScript(youtube_button1);
    	visibilityOf(youtube_visibility1);
    	actionClick(youtube_visibility1);
    	boolean elementIsDisplayed=elementIsDisplayed(youtube_visibility1);
    	Assert.assertTrue(elementIsDisplayed);
    	pageLoad();
    }
    public void clickonShowTranscript1() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(showtranscript1);
    	clickElementUsingJavaScript(showtranscript1);
    	visibilityOf(showtranscript1_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(showtranscript1_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	Thread.sleep(1000);
    	clickElementUsingJavaScript(showtranscript1);
    	pageLoad();
    }
    public void clickonYoutube2() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(youtube_button2);
    	clickElementUsingJavaScript(youtube_button2);
    	visibilityOf(youtube_visibility2);
    	actionClick(youtube_visibility2);
    	boolean elementIsDisplayed=elementIsDisplayed(youtube_visibility2);
    	Assert.assertTrue(elementIsDisplayed);
    	pageLoad();
    }
    public void clickonShowTranscript2() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(showtranscript2);
    	clickElementUsingJavaScript(showtranscript2);
    	visibilityOf(showtranscript2_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(showtranscript2_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	Thread.sleep(1000);
    	clickElementUsingJavaScript(showtranscript2);
    	pageLoad();
    }
    public void clickonYoutube3() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(youtube_button3);
    	clickElementUsingJavaScript(youtube_button3);
    	visibilityOf(youtube_visibility3);
    	actionClick(youtube_visibility3);
    	boolean elementIsDisplayed=elementIsDisplayed(youtube_visibility3);
    	Assert.assertTrue(elementIsDisplayed);
    	pageLoad();
    }
    public void clickonShowTranscript3() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(showtranscript3);
    	clickElementUsingJavaScript(showtranscript3);
    	visibilityOf(showtranscript3_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(showtranscript3_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	Thread.sleep(1000);
    	clickElementUsingJavaScript(showtranscript3);
    	pageLoad();
    }
    public void clickonReadMore1() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ReadMore1);
    	clickElementUsingJavaScript(ReadMore1);
    	visibilityOf(ReadMore1_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(ReadMore1_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	Thread.sleep(1000);
    	System.out.println(getElementText(ReadMore1_txt));
    	pageLoad();
    }
	
    public void clickonReadMore2() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ReadMore2);
    	clickElementUsingJavaScript(ReadMore2);
    	visibilityOf(ReadMore2_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(ReadMore2_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	Thread.sleep(1000);
    	System.out.println(getElementText(ReadMore2_txt));
    	pageLoad();
    }
    public void clickonGetCoupons() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(getcoupons);
    	clickElementUsingJavaScript(getcoupons);
    	visibilityOf(getcoupons_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(getcoupons_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	Thread.sleep(1000);
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
