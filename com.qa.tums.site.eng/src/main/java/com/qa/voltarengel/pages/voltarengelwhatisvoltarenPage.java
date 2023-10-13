package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelwhatisvoltarenPage extends BaseClass{
	
		
		public voltarengelwhatisvoltarenPage() {
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
	
	    @FindBy(xpath = "//button[text()='Write a Review ']")
	    private static WebElement writeReview;		
	
	    @FindBy(xpath = "//span[text()='My Review for Voltaren Arthritis Pain Gel']")
	    private static WebElement writeReview_txt;	
	
	    @FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
	    private static WebElement writeReview_Close;
	    
	    @FindBy(xpath = "//button[@class='rd-nr-btn btn voltarenBtnBlueOutline noTextDecoration']")
	    private static WebElement BuyNow1;
	    
	    @FindBy(xpath = "//div[@style='display: flex; flex-flow: column; justify-content: space-between; align-items: baseline; width: 68%;']//span[text()='Voltaren Arthritis Pain Gel']")
	    private static WebElement BuyNow1_txt;
	    
	    @FindBy(xpath = "//button[text()='Continue']")
	    private static WebElement Continue1;
	    
	    @FindBy(xpath = "//div[text()='CHECKOUT']")
	    private static WebElement Checkout1;
	    
	    
	    
	
	    @FindBy(xpath = "//a[text()='GET COUPONS']")
	    private static WebElement getcoupons;	
	
	    @FindBy(xpath = "//h1[text()='Voltaren Arthritis Pain Gel Coupons']")
	    private static WebElement getcoupons_txt;	
	
	    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[1]")
	    private static WebElement youtubebtn;	
	
	    @FindBy(xpath = "//div[@style='display: flex;']")
	    private static WebElement youtube_visibility;	
	    
	    @FindBy(xpath = "//span[text()='Show Transcript']")
	    private static WebElement showtranscript;
	    
	    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
	    private static WebElement showtranscript_Active;
	    
	    @FindBy(xpath = "//a[text()='See All Reviews']")
	    private static WebElement seeallreviews;
	    
	    @FindBy(xpath = "//span[text()='Read Voltaren Arthritis Pain Gel Reviews']")
	    private static WebElement seeallreviews_txt;
	    
	    @FindBy(xpath = "//a[text()='WATCH STORIES']")
	    private static WebElement watchstories;
	    
	    @FindBy(xpath = "//span[text()='Customer Testimonials']")
	    private static WebElement watchstories_txt;
	    
	    @FindBy(xpath = "//a[text()='SEE WHY VOLTAREN IS DIFFERENT']")
	    private static WebElement voltarendifferent;
	    
	    @FindBy(xpath = "//h1[text()='What Makes Voltaren Arthritis Pain Gel Different?']")
	    private static WebElement voltarendifferent_txt;
	    
	    @FindBy(xpath = "//a[text()='LEARN MORE ABOUT DICLOFENAC']")
	    private static WebElement learnmoreaboutdiclofenac;
	    
	    @FindBy(xpath = "//span[text()='Diclofenac Gel']")
	    private static WebElement learnmoreaboutdiclofenac_txt;
	    
	    @FindBy(xpath = "//span[text()='What is Voltaren Arthritis Pain Gel?']")
	    private static WebElement whatisvoltarenpaingel;
	    
	    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
	    private static WebElement whatisvoltarenpaingel_Active;
	    
	    @FindBy(xpath = "//span[text()='What is the active ingredient in Voltaren Arthritis Pain Gel?']")
	    private static WebElement whatisactiveingredients;
	    
	    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
	    private static WebElement whatisactiveingredients_Active;
	    
	    @FindBy(xpath = "//span[text()='What areas of the body should Voltaren be applied to?']")
	    private static WebElement whatareasvoltarenappliedto;
	    
	    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
	    private static WebElement whatareasvoltarenappliedto_Active;
	    
	    @FindBy(xpath = "//span[text()='How much should I use when applying Voltaren?']")
	    private static WebElement howmuchusedapplyingvoltaren;
	    
	    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
	    private static WebElement howmuchusedapplyingvoltaren_Active;
	    
	    @FindBy(xpath = "//span[text()='How many times a day should I apply Voltaren?']")
	    private static WebElement howmanytimesapplyVoltaren;
	    
	    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
	    private static WebElement howmanytimesapplyVoltaren_Active;
	    
	    @FindBy(xpath = "//span[text()='How long does it take for Voltaren Arthritis Pain Gel to work?']")
	    private static WebElement howlongdoesvoltarenArthristpainwork;
	    
	    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
	    private static WebElement howlongdoesvoltarenArthristpainwork_Active;
	    
	    @FindBy(xpath = "(//div[@class='title-content'])[1]")
	    private static WebElement YouTube_Arthristpaingel;
	    
	    @FindBy(xpath = "//video[@class='video-stream html5-main-video']")
	    private static WebElement ThumbnailVideo_Arthristpaingel;
	    
	    @FindBy(xpath = "//button[@class='ytp-play-button ytp-button']//self::button")
	    private static WebElement play_Arthristpaingel;
	    
	    @FindBy(xpath = "//span[text()='How do you open Voltaren Arthritis Pain Gel?']")
	    private static WebElement howdoyouopen_Arthristpaingel;
	    
	    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
	    private static WebElement howdoyouopen_Arthristpaingel_Active;
	    
	    @FindBy(xpath = "//span[text()='How do you use Voltaren Arthritis Pain Gel?']")
	    private static WebElement howdoyouuseArthristpaingel;
	    
	    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
	    private static WebElement howdoyouuseArthristpaingel_Active;
	    
	   //BuyNow//
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
	    	//moveToElement(carewalkssupportcaregivers_breadcrumbs);
	    	clickElementUsingJavaScript(aboutvoltaren_breadcrumbs);
	    	pageLoad();
	    }
	    public void clickonWriteReview() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(writeReview);
	    	clickElementUsingJavaScript(writeReview);
	    	visibilityOf(writeReview_txt);
	    	boolean elementIsDisplayed=elementIsDisplayed(writeReview_txt);
	    	Assert.assertTrue(elementIsDisplayed);
	    	System.out.println(getElementText(writeReview_txt));
	    	clickElementUsingJavaScript(writeReview_Close);
	    	pageLoad();
	    }
	    public void clickonBuyNow1() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(BuyNow1);
	    	moveToElement(BuyNow1);
	    	clickElementUsingJavaScript(BuyNow1);
	    	visibilityOf(BuyNow1_txt);
	    	boolean elementIsDisplayed=elementIsDisplayed(BuyNow1_txt);
	    	Assert.assertTrue(elementIsDisplayed);
	    	System.out.println(getElementText(BuyNow1_txt));
	    	clickElementUsingJavaScript(Continue1);
	    	Thread.sleep(1000);
	    	clickElementUsingJavaScript(Checkout1);
	    	pageLoad();
	    }
	    public void clickongetCoupons() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(getcoupons);
	    	clickElementUsingJavaScript(getcoupons);
	    	visibilityOf(getcoupons_txt);
	    	boolean elementIsDisplayed=elementIsDisplayed(getcoupons_txt);
	    	Assert.assertTrue(elementIsDisplayed);
	    	System.out.println(getElementText(getcoupons_txt));
	    	pageLoad();
	    }
	    public void clickonYoutube() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(youtubebtn);
	    	clickElementUsingJavaScript(youtubebtn);
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
	    	clickElementUsingJavaScript(showtranscript);
	    	pageLoad();
	    }
	    public void clickonSeeAllReviews() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(seeallreviews);
	    	clickElementUsingJavaScript(seeallreviews);
	    	visibilityOf(seeallreviews_txt);
	    	boolean elementIsDisplayed=elementIsDisplayed(seeallreviews_txt);
	    	Assert.assertTrue(elementIsDisplayed);
	    	pageLoad();
	    }
	    public void clickonWatchStories() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(watchstories);
	    	clickElementUsingJavaScript(watchstories);
	    	visibilityOf(watchstories_txt);
	    	boolean elementIsDisplayed=elementIsDisplayed(watchstories_txt);
	    	Assert.assertTrue(elementIsDisplayed);
	    	System.out.println(getElementText(watchstories_txt));
	    	pageLoad();
	    }
	    public void clickonVoltarenDifferent() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(voltarendifferent);
	    	clickElementUsingJavaScript(voltarendifferent);
	    	visibilityOf(voltarendifferent_txt);
	    	boolean elementIsDisplayed=elementIsDisplayed(voltarendifferent_txt);
	    	Assert.assertTrue(elementIsDisplayed);
	    	System.out.println(getElementText(voltarendifferent_txt));
	    	pageLoad();
	    }
	    public void clickonlearnmoreDiclofenac() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(learnmoreaboutdiclofenac);
	    	clickElementUsingJavaScript(learnmoreaboutdiclofenac);
	    	visibilityOf(learnmoreaboutdiclofenac_txt);
	    	boolean elementIsDisplayed=elementIsDisplayed(learnmoreaboutdiclofenac_txt);
	    	Assert.assertTrue(elementIsDisplayed);
	    	System.out.println(getElementText(learnmoreaboutdiclofenac_txt));
	    	pageLoad();
	    }
	    public void clickonWhatisvoltarengelpan() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(whatisvoltarenpaingel);
	    	clickElementUsingJavaScript(whatisvoltarenpaingel);
	    	visibilityOf(whatisvoltarenpaingel_Active);
	    	boolean elementIsDisplayed=elementIsDisplayed(whatisvoltarenpaingel_Active);
	    	Assert.assertTrue(elementIsDisplayed);
	    	System.out.println(getElementText(whatisvoltarenpaingel));
	    	clickElementUsingJavaScript(whatisvoltarenpaingel);
	    	pageLoad();
	    }
	    public void clickonWhatisActiveIngredients() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(whatisactiveingredients);
	    	clickElementUsingJavaScript(whatisactiveingredients);
	    	visibilityOf(whatisactiveingredients_Active);
	    	boolean elementIsDisplayed=elementIsDisplayed(whatisactiveingredients_Active);
	    	Assert.assertTrue(elementIsDisplayed);
	    	System.out.println(getElementText(whatisactiveingredients));
	    	clickElementUsingJavaScript(whatisactiveingredients);
	    	pageLoad();
	    }
	    public void clickonWhatisVoltarenbeapplied() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(whatareasvoltarenappliedto);
	    	clickElementUsingJavaScript(whatareasvoltarenappliedto);
	    	visibilityOf(whatareasvoltarenappliedto_Active);
	    	boolean elementIsDisplayed=elementIsDisplayed(whatareasvoltarenappliedto_Active);
	    	Assert.assertTrue(elementIsDisplayed);
	    	System.out.println(getElementText(whatareasvoltarenappliedto));
	    	clickElementUsingJavaScript(whatareasvoltarenappliedto);
	    	pageLoad();
	    }
	    public void clickonHowmuchweshouldusedVoltaren() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(howmuchusedapplyingvoltaren);
	    	clickElementUsingJavaScript(howmuchusedapplyingvoltaren);
	    	visibilityOf(howmuchusedapplyingvoltaren_Active);
	    	boolean elementIsDisplayed=elementIsDisplayed(howmuchusedapplyingvoltaren_Active);
	    	Assert.assertTrue(elementIsDisplayed);
	    	System.out.println(getElementText(howmuchusedapplyingvoltaren));
	    	clickElementUsingJavaScript(howmuchusedapplyingvoltaren);
	    	pageLoad();
	    }
	    public void clickonHowmanytimesvoltarenapply() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(howmanytimesapplyVoltaren);
	    	clickElementUsingJavaScript(howmanytimesapplyVoltaren);
	    	visibilityOf(howmanytimesapplyVoltaren_Active);
	    	boolean elementIsDisplayed=elementIsDisplayed(howmanytimesapplyVoltaren_Active);
	    	Assert.assertTrue(elementIsDisplayed);
	    	System.out.println(getElementText(howmanytimesapplyVoltaren));
	    	clickElementUsingJavaScript(howmanytimesapplyVoltaren);
	    	pageLoad();
	    }
	    public void clickonHowlongdoesVoltarenWork() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(howlongdoesvoltarenArthristpainwork);
	    	clickElementUsingJavaScript(howlongdoesvoltarenArthristpainwork);
	    	visibilityOf(howlongdoesvoltarenArthristpainwork_Active);
	    	scrollDownUsingElement(YouTube_Arthristpaingel);
	    	clickElementUsingJavaScript(YouTube_Arthristpaingel);
	    	
	    	//visibilityOf(ThumbnailVideo_Arthristpaingel);
	    	//moveToElement(ThumbnailVideo_Arthristpaingel);
	    	//actionClick(ThumbnailVideo_Arthristpaingel);
	    	boolean elementIsDisplayed=elementIsDisplayed(howlongdoesvoltarenArthristpainwork_Active);
	    	Assert.assertTrue(elementIsDisplayed);
	    	//clickElementUsingJavaScript(play_Arthristpaingel);
	    	System.out.println(getElementText(howlongdoesvoltarenArthristpainwork));
	    	clickElementUsingJavaScript(howlongdoesvoltarenArthristpainwork);
	    	pageLoad();
	    }
	    public void clickonHowdoyouopenArthrist() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(howdoyouopen_Arthristpaingel);
	    	clickElementUsingJavaScript(howdoyouopen_Arthristpaingel);
	    	visibilityOf(howdoyouopen_Arthristpaingel_Active);
	    	boolean elementIsDisplayed=elementIsDisplayed(howdoyouopen_Arthristpaingel_Active);
	    	Assert.assertTrue(elementIsDisplayed);
	    	System.out.println(getElementText(howdoyouopen_Arthristpaingel));
	    	clickElementUsingJavaScript(howdoyouopen_Arthristpaingel);
	    	pageLoad();
	    }
	    public void clickonHowdoyouuseArthristpaingel() throws Exception {
	    	waitForPageLoadJava();
	    	scrollDownUsingElement(howdoyouuseArthristpaingel);
	    	clickElementUsingJavaScript(howdoyouuseArthristpaingel);
	    	visibilityOf(howdoyouuseArthristpaingel_Active);
	    	boolean elementIsDisplayed=elementIsDisplayed(howdoyouuseArthristpaingel_Active);
	    	Assert.assertTrue(elementIsDisplayed);
	    	System.out.println(getElementText(howdoyouuseArthristpaingel));
	    	clickElementUsingJavaScript(howdoyouuseArthristpaingel);
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
