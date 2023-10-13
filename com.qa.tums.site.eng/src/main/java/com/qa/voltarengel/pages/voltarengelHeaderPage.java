package com.qa.voltarengel.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.qa.baseClass.BaseClass;

public class voltarengelHeaderPage extends BaseClass{

	public voltarengelHeaderPage() {
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
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage msitetopHeader first odd last component col-xs-12']//a[text()='COUPONS']")
    private static WebElement Coupons;
	
    @FindBy(xpath = "//h1[text()='Voltaren Arthritis Pain Gel Coupons']")
    private static WebElement Coupons_txt;
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage msitetopHeader first odd last component col-xs-12']//a[text()='NEWSLETTER']")
    private static WebElement Newsletter;
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage msitetopHeader first odd last component col-xs-12']//a[text()='FAQs']")
    private static WebElement FAQ;
	
    @FindBy(xpath = "//h1[text()='Frequently Asked Questions About Arthritis & Voltaren']")
    private static WebElement FAQ_txt;
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage msitetopHeader first odd last component col-xs-12']//a[text()='FOR CAREGIVERS']")
    private static WebElement caregivers;
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage padding-25-top-dt first odd last component col-xs-9 col-sm-10 col-md-5 col-lg-5']//h1[text()='Voltaren Presents: CareWalks']")
    private static WebElement caregivers_txt;
	
    @FindBy(xpath = "//div[@class='dropdown-toggle']//self::div[@aria-expanded='false']")
    private static WebElement dropdown_US;
    
    @FindBy(xpath = "//div[@aria-expanded='true']")
    private static WebElement dropdown_US_drop;
    
    @FindBy(xpath = "//div[@class='box component section background-wordmark-blue topHeaderPadding topNav-Box even col-xs-12']//input[@type='text']")
    private static WebElement Search;
    
    @FindBy(xpath = "//div[@class='searchBox component section Header_searchBox first odd last col-xs-12 col-lg-12']//button[@type='submit']")
    private static WebElement Search_txt;
    
    @FindBy(xpath = "//div[@class='searchResults component section container search-results-ui-kit even last col-xs-12']//child::div[@class='searchResults-number']")
    private static WebElement Search_Numbertxt;
    
    @FindBy(xpath = "//div[@class='image component section navigation-logo padding-15-right-dt switchable-image brand-logo odd col-xs-12 col-md-3']//a")
    private static WebElement Voltrangel_logo;
    
    @FindBy(xpath = "//a[text()='About Voltaren ']")
    private static WebElement AboutVoltaren;
    
    @FindBy(xpath = "//li[@class='odd first navigation-item navigation-level2 page-what-makes-voltaren-different']//a[text()='What Makes Voltaren Different? ']")
    private static WebElement voltarendifferent;
    
    @FindBy(xpath = "//li[@class='even navigation-item navigation-level2 page-read-reviews']//a[text()='Read Reviews for Voltaren Arthritis Pain Gel ']")
    private static WebElement ReadReview;
    
    @FindBy(xpath = "//li[@class='odd last navigation-item navigation-level2 page-testimonials']//a[text()='Testimonials ']")
    private static WebElement Testimonals;
    
    @FindBy(xpath = "//a[text()='What is Arthritis? ']")
    private static WebElement whatisArthritis;
    
    @FindBy(xpath = "//a[text()='Understanding Pain ']")
    private static WebElement understanding_pain;
    
    @FindBy(xpath = "//a[text()='Living with Arthritis ']")
    private static WebElement livingarthritis;
    
    @FindBy(xpath = "//li[@class='odd first navigation-item navigation-level2 page-joint-pain-medicine']//a[text()='Joint Pain Medicine ']")
    private static WebElement joint_pain;
    
    @FindBy(xpath = "//li[@class='even navigation-item navigation-level2 page-exercises-for-arthritis']//a[text()='Exercises for Arthritis ']")
    private static WebElement exerciseArthritis;
    
    @FindBy(xpath = "//li[@class='odd navigation-item navigation-level1 page-managing-arthritis']//a[text()='Managing Your Arthritis ']")
    private static WebElement managingArthritis;
    
    @FindBy(xpath = "//li[@class='even navigation-item navigation-level1 page-exercises']//a[text()='Exercises for Arthritis Pain Relief ']")
    private static WebElement exercisepainrelief;
    
    @FindBy(xpath = "//li[@class='odd navigation-item navigation-level2 page-how-to-relieve-arthritis-pain']//a[text()='Relieve Arthritis Pain ']")
    private static WebElement relieveArthristpain;
    
    @FindBy(xpath = "//li[@class='even navigation-item navigation-level2 page-natural-remedies']//a[text()='Natural Remedies ']")
    private static WebElement naturalRemedies;
    
    @FindBy(xpath = "//li[@class='odd navigation-item navigation-level2 page-stress']//a[text()='Stress and Arthritis ']")
    private static WebElement Stressarthritis;
    
    @FindBy(xpath = "//li[@class='even navigation-item navigation-level2 page-first-arthritis-friendly-site']//a[text()='Arthritis-Friendly Website ']")
    private static WebElement Arthristfriendlywebsite;
    
    @FindBy(xpath = "//li[@class='odd navigation-item navigation-level1 page-use-your-head-to-navigate-websites']//a")
    private static WebElement Navigatewebsite;
    
    @FindBy(xpath = "//li[@class='even navigation-item navigation-level1 page-effects-of-aging-on-the-body']//a")
    private static WebElement agingbody;
    
    @FindBy(xpath = "(//ul[@class='navigation-root navigation-branch navigation-level1']//child::li[@class='odd is-active navigation-item navigation-level1 page-how-to-relieve-wrist-pain'])[1]")
    private static WebElement relievewristpain;
	
    @FindBy(xpath = "(//li[@class='even navigation-item navigation-level1 page-how-to-relieve-joint-pain']//child::a[text()='How to Relieve Joint Pain '])[2]")
    private static WebElement relievejointpain;
    
    @FindBy(xpath = "(//li[@class='odd navigation-item navigation-level1 page-is-arthritis-hereditary'])[1]")
    private static WebElement arthristhereditary;
    
    @FindBy(xpath = "//li[@class='even navigation-item navigation-level1 page-morning-routine-arthritis-relief']")
    private static WebElement morningarthrist;
    
    @FindBy(xpath = "//div[@class='parametrizedhtml component section padding-20-bottom-mb odd last col-xs-1 col-md-1 col-lg-1 reference-add-to-cart']//a[@class='ripple btn-primary text-center mb-2 rd-nr-btn btn voltarenBtnOrange']")
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
    
    
    public void clickonCoupons() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(Coupons);
    	visibilityOf(Coupons_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(Coupons_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Coupons_txt));
    	pageLoad();
    }
    public void clickonNewsLetter() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(Newsletter);
    	pageLoad();
    }
    public void clickonFAQ() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(FAQ);
    	visibilityOf(FAQ_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(FAQ_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(FAQ_txt));
    	pageLoad();
    }
    public void clickonCaregivers() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(caregivers);
    	visibilityOf(caregivers_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(caregivers_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(caregivers_txt));
    	pageLoad();
    }
    public void clickonUS_Dropdown() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(dropdown_US);
    	visibilityOf(dropdown_US_drop);
    	boolean elementIsDisplayed=elementIsDisplayed(dropdown_US_drop);
    	Assert.assertTrue(elementIsDisplayed);
    	clickElementUsingJavaScript(dropdown_US_drop);
    	pageLoad();
    }
    public void clickonSearchIcon() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(Search);
    	Search.sendKeys("Arthritis");
    	clickElementUsingJavaScript(Search_txt);
    	visibilityOf(Search_Numbertxt);
    	boolean elementIsDisplayed=elementIsDisplayed(Search_Numbertxt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Search_Numbertxt));
    	
    	pageLoad();
    }
    public void clickonVoltarengel_logo() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(Voltrangel_logo);
    	clickElementUsingJavaScript(Voltrangel_logo);
    	pageLoad();
    }
    public void clickonAboutVoltaren() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(AboutVoltaren);
    	clickElementUsingJavaScript(AboutVoltaren);
    	pageLoad();
    }
    public void clickonVoltarendifferent() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(AboutVoltaren);
    	clickElementUsingJavaScript(voltarendifferent);
    	pageLoad();
    }
    public void clickonReadReview() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(AboutVoltaren);
    	clickElementUsingJavaScript(ReadReview);
    	pageLoad();
    }
    public void clickonTestimonals() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(AboutVoltaren);
    	clickElementUsingJavaScript(Testimonals);
    	pageLoad();
    }
    public void clickonWhatisArthritis() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(whatisArthritis);
    	clickElementUsingJavaScript(whatisArthritis);
    	pageLoad();
    }
    public void clickonUnderstandingpain() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(understanding_pain);
    	clickElementUsingJavaScript(understanding_pain);
    	pageLoad();
    }
    public void clickonlivingArthiritis() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(livingarthritis);
    	clickElementUsingJavaScript(livingarthritis);
    	pageLoad();
    }
    public void clickonjoint_pain() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(livingarthritis);
    	if (isElementPresent(joint_pain)) {
    		clickElementUsingJavaScript(joint_pain);
    		boolean elementIsDisplayed=elementIsDisplayed(joint_pain);
    		Assert.assertTrue(elementIsDisplayed);
		} else {
			throw new Exception("Joint pain is not present on page");
		}
    	
    	pageLoad();
    }
    public void clickonExerciseArthritis() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(livingarthritis);
    	if (isElementPresent(exerciseArthritis)) {
    		clickElementUsingJavaScript(exerciseArthritis);
    		boolean elementIsDisplayed=elementIsDisplayed(exerciseArthritis);
    		Assert.assertTrue(elementIsDisplayed);
		} else {
			throw new Exception("Exercise Arthritis is not present on page");
		}
    	
    	pageLoad();
    }
    public void clickonMangingArthritis() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(livingarthritis);
    	if (isElementPresent(managingArthritis)) {
    		clickElementUsingJavaScript(managingArthritis);
    		boolean elementIsDisplayed=elementIsDisplayed(managingArthritis);
    		Assert.assertTrue(elementIsDisplayed);
		} else {
			throw new Exception("Managing Arthritis is not present on page");
		}
    	
    	pageLoad();
    }
    public void clickonExercisepainRelief() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(livingarthritis);
    	clickElementUsingJavaScript(exercisepainrelief);
    	pageLoad();
    }
    public void clickonRelieveArthristpain() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(livingarthritis);
    	clickElementUsingJavaScript(relieveArthristpain);
    	pageLoad();
    }
    public void clickonNaturalRemedies() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(livingarthritis);
    	clickElementUsingJavaScript(naturalRemedies);
    	pageLoad();
    }
    public void clickonStressArthritis() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(livingarthritis);
    	clickElementUsingJavaScript(Stressarthritis);
    	pageLoad();
    }
    public void clickonArthritisfriendlywebsite() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(livingarthritis);
    	clickElementUsingJavaScript(Arthristfriendlywebsite);
    	pageLoad();
    }
    public void clickonNavigatewebsite() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(livingarthritis);
    	clickElementUsingJavaScript(Navigatewebsite);
    	pageLoad();
    }
    
    public void clickonAgingBody() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(livingarthritis);
    	clickElementUsingJavaScript(agingbody);
    	pageLoad();
    }
    public void clickonRelievewristpain() throws Exception {
    	waitForPageLoadJava();
    	
        	moveToElement(livingarthritis);
        	if (isElementPresent(relievewristpain)) {
        		clickElementUsingJavaScript(relievewristpain);
        		boolean elementIsDisplayed=elementIsDisplayed(relievewristpain);
        		Assert.assertTrue(elementIsDisplayed);
    		} else {
    			throw new Exception("Relieve Wrist pain is not present on preprod  page");
    		}
        	
        	pageLoad();
        }
    public void clickonArthristHeredietary() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(livingarthritis);
    	clickElementUsingJavaScript(arthristhereditary);
    	pageLoad();
    }
    public void clickonMorningarthrist() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(livingarthritis);
    	clickElementUsingJavaScript(morningarthrist);
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
