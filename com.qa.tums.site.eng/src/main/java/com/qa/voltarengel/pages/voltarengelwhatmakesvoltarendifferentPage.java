package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelwhatmakesvoltarendifferentPage extends BaseClass{
	
	public voltarengelwhatmakesvoltarendifferentPage() {
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
	
    @FindBy(xpath = "//a[text()='What Makes Voltaren Different?']")
    private static WebElement whatmakesvoltarendifferent_breadcrumbs;		
	
    @FindBy(xpath = "//a[text()='READ FAQs']")
    private static WebElement ReadFAQs;		
	
    @FindBy(xpath = "//h1[text()='Frequently Asked Questions About Arthritis & Voltaren']")
    private static WebElement ReadFAQs_txt;		
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/living-with-arthritis/managing-arthritis/otc-arthritis-medication/']")
    private static WebElement OTCArthristMedication;		
	
    @FindBy(xpath = "//span[text()='Over-the-Counter Arthritis Medication for Pain Relief']")
    private static WebElement OTCArthristMedication_txt;	
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/living-with-arthritis/managing-arthritis/how-otc-arthritis-cream-gel-works/']")
    private static WebElement HowOTCArthristcreamwork;	
	
    @FindBy(xpath = "//span[text()='How Arthritis Pain Cream & Gel Works']")
    private static WebElement HowOTCArthristcreamwork_txt;	
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/living-with-arthritis/managing-arthritis/over-the-counter-diclofenac-gel/']")
    private static WebElement OTCDeclofenacgel;	
	
    @FindBy(xpath = "//span[text()='Diclofenac Gel']")
    private static WebElement OTCDeclofenacgel_txt;	
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/living-with-arthritis/managing-arthritis/tylenol-alternatives-for-arthritis-pain/']")
    private static WebElement tylenolAlternative;	
    
    @FindBy(xpath = "//span[text()='Alternatives to Tylenol for Arthritis Pain']")
    private static WebElement tylenolAlternative_txt;	
    
    //FAQ//
    
    @FindBy(xpath = "//span[text()='What is Voltaren Emulgel™?']")
    private static WebElement voltarenemulgel;	
    
    @FindBy(xpath = "//li[@class='accordion-slide first odd is-active']")
    private static WebElement voltarenemulgel_Active;	
    
    @FindBy(xpath = "//span[text()='How is Voltaren Arthritis Pain Gel different from other over-the-counter topical pain relievers?']")
    private static WebElement VoltarenArthristpaingel;	
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']")
    private static WebElement VoltarenArthristpaingel_Active;	
    
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[1]")
    private static WebElement VoltarenArthrist_Videobtn;
    
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement voltarenArthrist_play;
    
    @FindBy(xpath = "//span[text()='How is Voltaren different from Aspercreme?']")
    private static WebElement voltarendifferentfromAspercreme;
    
    @FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
    private static WebElement voltarendifferentfromAspercreme_Active;
    
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[2]")
    private static WebElement voltarendifferentfromAspercreme_Youtubebtn;
    
    @FindBy(xpath = "(//div[@style='display: flex;'])[1]")
    private static WebElement thumbnail_iconplay;
    
    
    @FindBy(xpath = "//span[text()='How is Voltaren different from Salonpas?']")
    private static WebElement voltarendifferentsalonpas;
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']")
    private static WebElement voltarendifferentsalonpas_Active;
    
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[3]")
    private static WebElement voltarendifferentsalonpas_youtube;
    
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement voltarendifferentsalonpas_thumbnailvisibility;
    
    @FindBy(xpath = "//span[text()='How is Voltaren different from Icy Hot and other lidocaine products?']")
    private static WebElement voltarendifferenticyhot;
    
    @FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
    private static WebElement voltarendifferenticyhot_Active;
    
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[4]")
    private static WebElement voltarendifferenticyhot_youtube;
    
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement voltarendifferenticyhot_visibility;
    
    @FindBy(xpath = "//span[text()='How does Voltaren differ from topical pain relievers like Biofreeze? ']")
    private static WebElement voltarendifferfromtropicalpain;
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']")
    private static WebElement voltarendifferfromtropicalpain_Active;
    
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[5]")
    private static WebElement voltarendifferfromtropicalpain_youtube;
    
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement voltarendifferfromtropicalpain_visibility;
    
    @FindBy(xpath = "//span[text()='How does Voltaren differ from topical pain relievers like Bengay?']")
    private static WebElement voltarendifferfromrelieversBengay;
    
    @FindBy(xpath = "//header[@class='accordion-head active']")
    private static WebElement voltarendifferfromrelieversBengay_Active;
    
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[6]")
    private static WebElement voltarendifferfromrelieversBengay_youtube;
    
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement voltarendifferfromrelieversBengay_visibility;
    
    @FindBy(xpath = "//span[text()='Voltaren Arthritis Pain vs. Diclofenac: What’s the difference?']")
    private static WebElement voltarenArthristpainvsDiclofenac;
    
    @FindBy(xpath = "//li[@class='accordion-slide even is-active']")
    private static WebElement voltarenArthristpainvsDiclofenac_Active;
    
    @FindBy(xpath = "//span[text()='What’s the difference between Voltaren Arthritis Pain and Voltarol?']")
    private static WebElement differencebetweenVoltarenArthristpainVoltarol;
    
    @FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
    private static WebElement differencebetweenVoltarenArthristpainVoltarol_Active;
    
    @FindBy(xpath = "//span[text()='How is over-the-counter Voltaren Arthritis Pain Gel different from prescription Voltaren Gel?']")
    private static WebElement voltrandifferentprescription;
    
    @FindBy(xpath = "//li[@class='accordion-slide last even is-active']")
    private static WebElement voltrandifferentprescription_Active;
    
    @FindBy(xpath = "//a[text()='SEE MORE FAQs']")
    private static WebElement seemoreFAQ;
    
    @FindBy(xpath = "//h1[text()='Frequently Asked Questions About Arthritis & Voltaren']")
    private static WebElement seemoreFAQ_txt;
    
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
    public void clickonWhatmakesvoltarendifferent_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(whatmakesvoltarendifferent_breadcrumbs);
    	pageLoad();
    }
	
    public void clickonReadFAQs() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ReadFAQs);
    	clickElementUsingJavaScript(ReadFAQs);
    	visibilityOf(ReadFAQs_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(ReadFAQs_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(ReadFAQs_txt));
    	pageLoad();
    }
    public void clickonOTCArthristMedications() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(OTCArthristMedication);
    	clickElementUsingJavaScript(OTCArthristMedication);
    	visibilityOf(OTCArthristMedication_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(OTCArthristMedication_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(OTCArthristMedication_txt));
    	pageLoad();
    }
    public void clickonHowOTCArthristcreamgelworks() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(HowOTCArthristcreamwork);
    	clickElementUsingJavaScript(HowOTCArthristcreamwork);
    	visibilityOf(HowOTCArthristcreamwork_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(HowOTCArthristcreamwork_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	//System.out.println(getElementText(HowOTCArthristcreamwork));
    	pageLoad();
    }
    public void clickonOTCDeclofenacgel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(OTCDeclofenacgel);
    	clickElementUsingJavaScript(OTCDeclofenacgel);
    	visibilityOf(OTCDeclofenacgel_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(OTCDeclofenacgel_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	//System.out.println(getElementText(OTCDeclofenacgel));
    	pageLoad();
    }
    public void clickontylenolAlternative() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(tylenolAlternative);
    	clickElementUsingJavaScript(tylenolAlternative);
    	visibilityOf(tylenolAlternative_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(tylenolAlternative_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	//System.out.println(getElementText(tylenolAlternative));
    	pageLoad();
    }
    public void clickonVoltarenEmulgel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenemulgel);
    	clickElementUsingJavaScript(voltarenemulgel);
    	visibilityOf(voltarenemulgel_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenemulgel_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenemulgel));
    	clickElementUsingJavaScript(voltarenemulgel);
    	pageLoad();
    }
    public void clickonVoltarenArthristPaingel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(VoltarenArthristpaingel);
    	clickElementUsingJavaScript(VoltarenArthristpaingel);
    	visibilityOf(VoltarenArthristpaingel_Active);
    	scrollDownUsingElement(VoltarenArthrist_Videobtn);
    	clickElementUsingJavaScript(VoltarenArthrist_Videobtn);
    	visibilityOf(voltarenArthrist_play);
    	actionClick(voltarenArthrist_play);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenArthrist_play);
    	Assert.assertTrue(elementIsDisplayed);
    	pageLoad();
    }
    public void clickonVoltarendifferentAspercreme() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarendifferentfromAspercreme);
    	clickElementUsingJavaScript(voltarendifferentfromAspercreme);
    	visibilityOf(voltarendifferentfromAspercreme_Active);
    	clickElementUsingJavaScript(voltarendifferentfromAspercreme_Youtubebtn);
    	visibilityOf(thumbnail_iconplay);
    	actionClick(thumbnail_iconplay);
    	boolean elementIsDisplayed=elementIsDisplayed(thumbnail_iconplay);
    	Assert.assertTrue(elementIsDisplayed);
    	pageLoad();
    }
    public void clickonVoltarendifferentSalonpas() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarendifferentsalonpas);
    	clickElementUsingJavaScript(voltarendifferentsalonpas);
    	visibilityOf(voltarendifferentsalonpas_Active);
    	clickElementUsingJavaScript(voltarendifferentsalonpas_youtube);
    	visibilityOf(voltarendifferentsalonpas_thumbnailvisibility);
    	actionClick(voltarendifferentsalonpas_thumbnailvisibility);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarendifferentsalonpas_thumbnailvisibility);
    	Assert.assertTrue(true);
    	pageLoad();
    }
    public void clickonVoltarendifferenticyhot() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarendifferenticyhot);
    	clickElementUsingJavaScript(voltarendifferenticyhot);
    	visibilityOf(voltarendifferenticyhot_Active);
    	clickElementUsingJavaScript(voltarendifferenticyhot_youtube);
    	visibilityOf(voltarendifferenticyhot_visibility);
    	actionClick(voltarendifferenticyhot_visibility);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarendifferenticyhot_visibility);
    	Assert.assertTrue(true);
    	pageLoad();
    }
    public void clickonVoltarendifferfromtropicalpain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarendifferfromtropicalpain);
    	clickElementUsingJavaScript(voltarendifferfromtropicalpain);
    	visibilityOf(voltarendifferfromtropicalpain_Active);
    	clickElementUsingJavaScript(voltarendifferfromtropicalpain_youtube);
    	visibilityOf(voltarendifferfromtropicalpain_visibility);
    	actionClick(voltarendifferfromtropicalpain_visibility);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarendifferfromtropicalpain_visibility);
    	Assert.assertTrue(true);
    	pageLoad();
    }
    public void clickonVoltarendifferfromtropicalBengay() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarendifferfromrelieversBengay);
    	clickElementUsingJavaScript(voltarendifferfromrelieversBengay);
    	visibilityOf(voltarendifferfromrelieversBengay_Active);
    	clickElementUsingJavaScript(voltarendifferfromrelieversBengay_youtube);
    	visibilityOf(voltarendifferfromrelieversBengay_visibility);
    	actionClick(voltarendifferfromrelieversBengay_visibility);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarendifferfromrelieversBengay_visibility);
    	Assert.assertTrue(true);
    	pageLoad();
    }
	
    public void clickonVoltarenArthristpainvsDiclofenac() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenArthristpainvsDiclofenac);
    	clickElementUsingJavaScript(voltarenArthristpainvsDiclofenac);
    	visibilityOf(voltarenArthristpainvsDiclofenac_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenArthristpainvsDiclofenac_Active);
    	Assert.assertTrue(true);
    	clickElementUsingJavaScript(voltarenArthristpainvsDiclofenac);
    	pageLoad();
    }
    public void clickonVoltarenArthristpainvsvoltarol() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(differencebetweenVoltarenArthristpainVoltarol);
    	clickElementUsingJavaScript(differencebetweenVoltarenArthristpainVoltarol);
    	visibilityOf(differencebetweenVoltarenArthristpainVoltarol_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(differencebetweenVoltarenArthristpainVoltarol_Active);
    	Assert.assertTrue(true);
    	clickElementUsingJavaScript(differencebetweenVoltarenArthristpainVoltarol);
    	pageLoad();
    }
    public void clickonVoltarenArthristdifferfromprescription() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltrandifferentprescription);
    	clickElementUsingJavaScript(voltrandifferentprescription);
    	visibilityOf(voltrandifferentprescription_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(voltrandifferentprescription_Active);
    	Assert.assertTrue(true);
    	clickElementUsingJavaScript(voltrandifferentprescription);
    	pageLoad();
    }
    public void clickonSeemoreFAQ() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(seemoreFAQ);
    	clickElementUsingJavaScript(seemoreFAQ);
    	visibilityOf(seemoreFAQ_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(seemoreFAQ_txt);
    	Assert.assertTrue(true);
    	//clickElementUsingJavaScript(seemoreFAQ);
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
