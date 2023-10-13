package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengeldiclofenacgelPage extends BaseClass{
	
	public voltarengeldiclofenacgelPage() {
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
	
    @FindBy(xpath = "//a[text()='Living with Arthritis']")
    private static WebElement livingwithArthrist_breadcrumbs;			
	
    @FindBy(xpath = "//a[text()='Managing Your Arthritis']")
    private static WebElement  managingarthrist_breadcrumbs;	
	
    @FindBy(xpath = "//a[text()='OTC Diclofenac Gel: What You Need to Know']")
    private static WebElement OTCDiclofenacgel_breadcrumbs;
	
    @FindBy(xpath = "//a[text()='osteoarthritis pain']")
    private static WebElement osteoarthrist;
	
    @FindBy(xpath = "//span[text()='What is Pain? Where Does It Come From?']")
    private static WebElement osteoarthrist_txt;
	
    @FindBy(xpath = "//a[text()='Voltaren Arthritis Pain']")
    private static WebElement voltarenarthristgel;
	
    @FindBy(xpath = "//h1[text()='What is Voltaren Arthritis Pain Relief Gel?']")
    private static WebElement voltarenarthristgel_txt;
	
    @FindBy(xpath = "//a[text()='arthritis pain relief gel']")
    private static WebElement arthristpainreliefgel;
	
    @FindBy(xpath = "//h1[text()='What is Voltaren Arthritis Pain Relief Gel?']")
    private static WebElement arthristpainreliefgel_txt;
	
    @FindBy(xpath = "//a[text()='relieve pain from arthritis']")
    private static WebElement relievepainArthrist;
	
    @FindBy(xpath = "//span[text()='How to Find Arthritis Pain Relief']")
    private static WebElement relievepainArthrist_txt;
	
    @FindBy(xpath = "//a[text()='arthritis resource center']")
    private static WebElement arthristrescourcecenter;
	
    @FindBy(xpath = "//h1[text()='How to Manage and Live With Arthritis Pain']")
    private static WebElement arthristrescourcecenter_txt;
	
    @FindBy(xpath = "//a[text()='arthritis symptoms']")
    private static WebElement arthristsymptoms;
	
    @FindBy(xpath = "//h1[@class='innerHeading text-center']")
    private static WebElement arthristsymptoms_txt;
    
    @FindBy(xpath = "//header[@class='accordion-head']")
    private static WebElement ShowReferences;
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement ShowReferences_Active;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//a[@href='/what-is-arthritis/symptoms/']")
    private static WebElement ReadMore1;
	
    @FindBy(xpath = "//h1[@class='innerHeading text-center']")
    private static WebElement ReadMore1_txt;
	
    @FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/how-otc-arthritis-cream-gel-works/']")
    private static WebElement ReadMore2;
    
    @FindBy(xpath = "//span[text()='How Arthritis Pain Cream & Gel Works']")
    private static WebElement ReadMore2_txt;
    
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
    public void clickonlivingArthrist_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(livingwithArthrist_breadcrumbs);
    	clickElementUsingJavaScript(livingwithArthrist_breadcrumbs);
    	pageLoad();
    }		
    public void clickonManagingArthrist_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(managingarthrist_breadcrumbs);
    	clickElementUsingJavaScript(managingarthrist_breadcrumbs);
    	pageLoad();
    }		
    public void clickonOTCDiclofenacgel_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(OTCDiclofenacgel_breadcrumbs);
    	clickElementUsingJavaScript(OTCDiclofenacgel_breadcrumbs);
    	pageLoad();
    }		
    public void clickonOsteoarthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(osteoarthrist);
    	moveToElement(osteoarthrist);
    	clickElementUsingJavaScript(osteoarthrist);
    	visibilityOf(osteoarthrist_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(osteoarthrist_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(osteoarthrist_txt));
    	pageLoad();
    }		
    public void clickonvoltarenarthristgel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenarthristgel);
    	moveToElement(voltarenarthristgel);
    	clickElementUsingJavaScript(voltarenarthristgel);
    	visibilityOf(voltarenarthristgel_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenarthristgel_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenarthristgel_txt));
    	pageLoad();
    }		
    public void clickonVoltarenArthristpainReliefgel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(arthristpainreliefgel);
    	moveToElement(arthristpainreliefgel);
    	clickElementUsingJavaScript(arthristpainreliefgel);
    	visibilityOf(arthristpainreliefgel_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(arthristpainreliefgel_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(arthristpainreliefgel_txt));
    	pageLoad();
    }		
    
    public void clickonRelievepainArthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(relievepainArthrist);
    	moveToElement(relievepainArthrist);
    	clickElementUsingJavaScript(relievepainArthrist);
    	visibilityOf(relievepainArthrist_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(relievepainArthrist_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(relievepainArthrist_txt));
    	pageLoad();
    }		
    public void clickonArthristRecourcecenter() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(arthristrescourcecenter);
    	moveToElement(arthristrescourcecenter);
    	clickElementUsingJavaScript(arthristrescourcecenter);
    	visibilityOf(arthristrescourcecenter_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(arthristrescourcecenter_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(arthristrescourcecenter_txt));
    	pageLoad();
    }		
    public void clickonArthristSymptoms() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(arthristsymptoms);
    	moveToElement(arthristsymptoms);
    	clickElementUsingJavaScript(arthristsymptoms);
    	visibilityOf(arthristsymptoms_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(arthristsymptoms_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(arthristsymptoms_txt));
    	pageLoad();
    }		
    public void clickonShowReferences() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ShowReferences);
    	moveToElement(ShowReferences);
    	clickElementUsingJavaScript(ShowReferences);
    	visibilityOf(ShowReferences_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(ShowReferences_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	
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
    public void clickonReadMore2() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ReadMore2);
    	moveToElement(ReadMore2);
    	clickElementUsingJavaScript(ReadMore2);
    	visibilityOf(ReadMore2_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(ReadMore2_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(ReadMore2_txt));
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
