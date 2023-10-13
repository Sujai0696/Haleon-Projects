package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelotcarthristcreamgelworksPage extends BaseClass{
	
	public voltarengelotcarthristcreamgelworksPage() {
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
		
    @FindBy(xpath = "//a[text()='How OTC Arthritis Cream & Gel Works']")
    private static WebElement  otcarthristcreamegel_breadcrumbs;	
		
    @FindBy(xpath = "//a[text()='Living with arthritis']")
    private static WebElement  livingwithArthrist;	
	
    @FindBy(xpath = "//h1[text()='How to Manage and Live With Arthritis Pain']")
    private static WebElement  livingwithArthrist_txt;	
	
    @FindBy(xpath = "//a[text()='manage pain']")
    private static WebElement  managepain;	
	
    @FindBy(xpath = "//h1[text()='Managing Arthritis']")
    private static WebElement  managepain_txt;	
	
    @FindBy(xpath = "//a[text()='help relieve your arthritis pain']")
    private static WebElement  helprelievearthristpain;	
    
    @FindBy(xpath = "//span[text()='How to Find Arthritis Pain Relief']")
    private static WebElement  helprelievearthristpain_txt;	
    
    @FindBy(xpath = "//a[text()='your specific symptoms']")
    private static WebElement  yourspecificsymptoms;	
    
    @FindBy(xpath = "//h1[@class='innerHeading text-center']")
    private static WebElement  yourspecificsymptoms_txt;	
    
    @FindBy(xpath = "//a[text()='Lidocaine']")
    private static WebElement  lidocaine;	
    
    @FindBy(xpath = "//h1[text()='What Makes Voltaren Arthritis Pain Gel Different?']")
    private static WebElement  lidocaine_txt;	
    
    @FindBy(xpath = "//a[text()='Voltaren Arthritis Pain gel']")
    private static WebElement  voltarenarthristgel;	
    
    @FindBy(xpath = "//h1[text()='Powerful Arthritis Pain Relief In a Gel']")
    private static WebElement  voltarenarthristgel_txt;	
    
    @FindBy(xpath = "//a[text()='Voltaren FAQ page']")
    private static WebElement  voltarenarFAQpage;	
    
    @FindBy(xpath = "//h1[text()='Frequently Asked Questions About Arthritis & Voltaren']")
    private static WebElement  voltarenarFAQpage_txt;
    
    @FindBy(xpath = "//header[@class='accordion-head']")
    private static WebElement  ShowReferences;
   
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement  ShowReferences_Active;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/over-the-counter-diclofenac-gel/']")
    private static WebElement  Readmore1;
    
    @FindBy(xpath = "//span[text()='Diclofenac Gel']")
    private static WebElement  Readmore1_txt;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/understanding-pain/about-pain/']")
    private static WebElement  Readmore2;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style first odd last component col-xs-12 col-lg-10 col-lg-offset-1']//span[text()='What is Pain? Where Does It Come From?']")
    private static WebElement  Readmore2_txt;
    
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
    public void clickonotcArthristcreamegel_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(otcarthristcreamegel_breadcrumbs);
    	clickElementUsingJavaScript(otcarthristcreamegel_breadcrumbs);
    	pageLoad();
    }		
    public void clickonlivingwithArthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(livingwithArthrist);
    	moveToElement(livingwithArthrist);
    	clickElementUsingJavaScript(livingwithArthrist);
    	visibilityOf(livingwithArthrist_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(livingwithArthrist_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(livingwithArthrist_txt));
    	pageLoad();
    }		
    public void clickonmanagepain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(managepain);
    	moveToElement(managepain);
    	clickElementUsingJavaScript(managepain);
    	visibilityOf(managepain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(managepain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(managepain_txt));
    	pageLoad();
    }		
    public void clickonhelprelievepainarthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(helprelievearthristpain);
    	moveToElement(helprelievearthristpain);
    	clickElementUsingJavaScript(helprelievearthristpain);
    	visibilityOf(helprelievearthristpain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(helprelievearthristpain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(helprelievearthristpain_txt));
    	pageLoad();
    }		
    public void clickonyourspecificsymptoms() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(yourspecificsymptoms);
    	moveToElement(yourspecificsymptoms);
    	clickElementUsingJavaScript(yourspecificsymptoms);
    	visibilityOf(yourspecificsymptoms_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(yourspecificsymptoms_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(yourspecificsymptoms_txt));
    	pageLoad();
    }		
    public void clickonlidocaine() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(lidocaine);
    	moveToElement(lidocaine);
    	clickElementUsingJavaScript(lidocaine);
    	visibilityOf(lidocaine_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(lidocaine_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(lidocaine_txt));
    	pageLoad();
    }		
    public void clickonVoltarenArthristpaingel() throws Exception {
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
    public void clickonVoltarenFAQPage() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenarFAQpage);
    	moveToElement(voltarenarFAQpage);
    	clickElementUsingJavaScript(voltarenarFAQpage);
    	visibilityOf(voltarenarFAQpage_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenarFAQpage_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenarFAQpage_txt));
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
    	//System.out.println(getElementText(ShowReferences_Active));
    	pageLoad();
    }		
    public void clickonReadmore1() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Readmore1);
    	moveToElement(Readmore1);
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
    	moveToElement(Readmore2);
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
