package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelArthristdietPage extends BaseClass{
	
	public voltarengelArthristdietPage() {
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
	
    @FindBy(xpath = "//a[text()='Arthritis Diet']")
    private static WebElement ArthristDiet_breadcrumbs;
		
    @FindBy(xpath = "//a[text()='exercises for arthritis']")
    private static WebElement exerciseArthrist;
	
    @FindBy(xpath = "//h1[text()='Exercises for Arthritis & Joint Pain Relief']")
    private static WebElement exerciseArthrist_txt;
	
    @FindBy(xpath = "//a[text()='Voltaren Arthritis Pain Relief Gel']")
    private static WebElement voltarenArthristpaingel;
	
    @FindBy(xpath = "//h1[text()='What is Voltaren Arthritis Pain Relief Gel?']")
    private static WebElement voltarenArthristpaingel_txt;
	
    @FindBy(xpath = "//a[text()='natural remedies for arthritis pain relief']")
    private static WebElement naturalremediespaingel;
	
    @FindBy(xpath = "//span[text()='Natural Remedies for Arthritis Pain Relief']")
    private static WebElement naturalremediespaingel_txt;
	
    @FindBy(xpath = "//span[text()='Show References']")
    private static WebElement showReferences;
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement showReferences_txt;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//a[@href='/living-with-arthritis/how-to-relieve-arthritis-pain/']")
    private static WebElement ReadMore;
    
    @FindBy(xpath = "//span[text()='How to Find Arthritis Pain Relief']")
    private static WebElement ReadMore_txt;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//a[@href='/living-with-arthritis/effects-of-aging-on-the-body/']")
    private static WebElement ReadMore1;
    
    @FindBy(xpath = "//span[text()='What are the Effects of Aging on the Body']")
    private static WebElement ReadMore1_txt;
    
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
    public void clickonArthristDiet_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(ArthristDiet_breadcrumbs);
    	clickElementUsingJavaScript(ArthristDiet_breadcrumbs);
    	pageLoad();
    }
    public void clickonExerciseArthrist() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(exerciseArthrist);
    	clickElementUsingJavaScript(exerciseArthrist);
    	visibilityOf(exerciseArthrist_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(exerciseArthrist_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(exerciseArthrist_txt));
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
    public void clickonNaturalRemediespaingel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(naturalremediespaingel);
    	moveToElement(naturalremediespaingel);
    	clickElementUsingJavaScript(naturalremediespaingel);
    	visibilityOf(naturalremediespaingel_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(naturalremediespaingel_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(naturalremediespaingel_txt));
    	pageLoad();
    }
    public void clickonShowReferences() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(showReferences);
    	moveToElement(showReferences);
    	clickElementUsingJavaScript(showReferences);
    	visibilityOf(showReferences_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(showReferences_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	clickElementUsingJavaScript(showReferences);
    	pageLoad();
    }
    public void clickonReadMore() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ReadMore);
    	moveToElement(ReadMore);
    	clickElementUsingJavaScript(ReadMore);
    	visibilityOf(ReadMore_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(ReadMore_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(ReadMore_txt));
    	pageLoad();
    }
    public void clickonReadMore1() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ReadMore1);
    	moveToElement(ReadMore1);
    	clickElementUsingJavaScript(ReadMore1);
    	visibilityOf(ReadMore1_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(ReadMore1_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(ReadMore1_txt));
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
