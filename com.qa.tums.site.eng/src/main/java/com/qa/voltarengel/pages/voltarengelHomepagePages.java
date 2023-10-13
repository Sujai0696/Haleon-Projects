package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelHomepagePages extends BaseClass{

	public voltarengelHomepagePages() {
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
		
    @FindBy(xpath = "//div[@class='col-md-12 col-xs-12 paddingTop-1 paddingBottom-1']//child::a[text()='DISCOVER THE DIFFERENCE']")
    private static WebElement discoverdifference;	
	
    @FindBy(xpath = "//h1[text()='What is Voltaren Arthritis Pain Relief Gel?']")
    private static WebElement discoverdifference_txt;	
	
    @FindBy(xpath = "//div[@class='col-md-5 col-sm-5 col-xs-8 text-center']//child::a[@class='btn voltarenBtnBlue noTextDecoration ']")
    private static WebElement learnmore_caregivers;	
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage padding-25-top-dt first odd last component col-xs-9 col-sm-10 col-md-5 col-lg-5']//h1[text()='Voltaren Presents: CareWalks']")
    private static WebElement learnmore_caregivers_txt;	
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage padding-15-left-dt padding-15-right-dt even last component col-xs-12 col-md-8 col-lg-7']//child::a[@href='/living-with-arthritis/first-arthritis-friendly-site/']")
    private static WebElement readmoreArthirist_friendly;	
	
    @FindBy(xpath = "//span[text()='Learn how our arthritis-friendly features can help you navigate our site more easily—without using your hands.']")
    private static WebElement readmoreArthirist_friendly_txt;	
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage padding-30-left-dt padding-30-top-dt first odd last component col-xs-12 col-lg-12']//child::a[@href='/what-is-voltaren/what-makes-voltaren-different/']")
    private static WebElement findoutmore_arthristpaingel;	
	
    @FindBy(xpath = "//h1[text()='What Makes Voltaren Arthritis Pain Gel Different?']")
    private static WebElement findoutmore_arthristpaingel_txt;	
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style odd component col-xs-12 col-sm-6 col-md-3 col-lg-3 col-lg-offset-1']//child::a[text()='Read Reviews']")
    private static WebElement ReadReviews;	
	
    @FindBy(xpath = "//span[text()='Read Voltaren Arthritis Pain Gel Reviews']")
    private static WebElement ReadReviews_txt;	
	
    @FindBy(xpath = "//button[text()='Write a Review ']")
    private static WebElement writereview;	
	
    @FindBy(xpath = "//span[text()='My Review for Voltaren Arthritis Pain Gel']")
    private static WebElement writereview_txt;
	
    @FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
    private static WebElement writereview_Close;
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage padding-30-bottom-dt padding-30-left-dt padding-30-right-dt padding-30-top-dt first odd last component col-xs-12']//child::a[@href='/understanding-pain/impact-of-pain/']")
    private static WebElement letsgo;
	
    @FindBy(xpath = "//span[text()='The Impact of Body Pain Around the World']")
    private static WebElement letsgo_txt;
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage padding-15-left-dt padding-20-bottom-dt padding-20-top-dt padding-30-left-dt padding-30-right-dt even last component col-xs-12 col-md-6']//child::a[@href='/what-is-voltaren/']")
    private static WebElement learnmore_whatisvoltaren;
    
    @FindBy(xpath = "//h1[text()='What is Voltaren Arthritis Pain Relief Gel?']")
    private static WebElement learnmore_whatisvoltaren_txt;
    
    @FindBy(xpath = "(//div[@class='cmp-form-text']//child::input[@class='cmp-form-text__text input-name has-no-error'])[1]")
    private static WebElement firstname;
    
    @FindBy(xpath = "(//input[@class='cmp-form-text__text input-email has-no-error has-no-invalid-error'])[1]")
    private static WebElement email;
    
    @FindBy(xpath = "(//div[@class='form-button button default-style']//button[@type='submit'])[1]")
    private static WebElement signup;
    
  
	
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
    public void clickonDiscoverdifference() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(discoverdifference);
    	clickElementUsingJavaScript(discoverdifference);
    	visibilityOf(discoverdifference_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(discoverdifference_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(discoverdifference_txt));
    	pageLoad();
    }
    public void clickonLearnmore_caregivers() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(learnmore_caregivers);
    	clickElementUsingJavaScript(learnmore_caregivers);
    	visibilityOf(learnmore_caregivers_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(learnmore_caregivers_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(learnmore_caregivers_txt));
    	pageLoad();
    }
    public void clickonReadmoreArthristfriendly() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(readmoreArthirist_friendly);
    	clickElementUsingJavaScript(readmoreArthirist_friendly);
    	visibilityOf(readmoreArthirist_friendly_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(readmoreArthirist_friendly_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(readmoreArthirist_friendly_txt));
    	pageLoad();
    }
    public void clickonFindoutmore_Arthristpaingel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(findoutmore_arthristpaingel);
    	clickElementUsingJavaScript(findoutmore_arthristpaingel);
    	visibilityOf(findoutmore_arthristpaingel_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(findoutmore_arthristpaingel_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(findoutmore_arthristpaingel_txt));
    	pageLoad();
    }
    public void clickonReadReview() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ReadReviews);
    	clickElementUsingJavaScript(ReadReviews);
    	visibilityOf(ReadReviews_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(ReadReviews_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(ReadReviews_txt));
    	pageLoad();
    }
    public void clickonWriteReview() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(writereview);
    	moveToElement(writereview);
    	clickElementUsingJavaScript(writereview);
    	visibilityOf(writereview_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(writereview_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(writereview_txt));
    	clickElementUsingJavaScript(writereview_Close);
    	pageLoad();
    }
    public void clickonletsgo() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(letsgo);
    	moveToElement(letsgo);
    	clickElementUsingJavaScript(letsgo);
    	visibilityOf(letsgo_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(letsgo_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(letsgo_txt));
    	pageLoad();
    }
    public void clickonWhatisVoltarenArthrist_learnmore() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(learnmore_whatisvoltaren);
    	moveToElement(learnmore_whatisvoltaren);
    	clickElementUsingJavaScript(learnmore_whatisvoltaren);
    	visibilityOf(learnmore_whatisvoltaren_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(learnmore_whatisvoltaren_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(learnmore_whatisvoltaren_txt));
    	pageLoad();
    }
    public void clickonSignupsave() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(firstname);
    	moveToElement(firstname);
    	clickElementUsingJavaScript(firstname);
    	firstname.sendKeys("Yogita");
    	clickElementUsingJavaScript(email);
    	email.sendKeys("yogita.patil0515@gmail.com");
    	implicitWait();
    	clickElementUsingJavaScript(signup);
    	pageLoad();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

}
