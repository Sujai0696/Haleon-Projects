package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengeltylenolarthristpainPage extends BaseClass{
	
	public voltarengeltylenolarthristpainPage() {
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
		
    @FindBy(xpath = "//a[text()='Tylenol Alternatives for Arthritis Pain']")
    private static WebElement  tylenolalternativespain_breadcrumbs;		
	
    @FindBy(xpath = "//a[text()='alternatives for arthritis pain.']")
    private static WebElement  alternativesarthristpain;	
	
    @FindBy(xpath = "//span[text()='Natural Remedies for Arthritis Pain Relief']")
    private static WebElement  alternativesarthristpain_txt;
	
    @FindBy(xpath = "//a[text()='managing arthritis pain']")
    private static WebElement  managingarthristpain;
	
    @FindBy(xpath = "//h1[text()='Managing Arthritis']")
    private static WebElement  managingarthristpain_txt;
	
    @FindBy(xpath = "//a[text()='Symptoms']")
    private static WebElement  symptoms;
    
    @FindBy(xpath = "//h1[@class='innerHeading text-center']")
    private static WebElement  symptoms_txt;
    
    @FindBy(xpath = "//a[text()='weather']")
    private static WebElement  weather;
    
    @FindBy(xpath = "//span[text()='Does Weather Affect Your Arthritis Pain?']")
    private static WebElement  weather_txt;
    
    @FindBy(xpath = "//a[text()='alleviate arthritis pain']")
    private static WebElement  alleviatearthristpain;
    
    @FindBy(xpath = "//span[text()='How to Find Arthritis Pain Relief']")
    private static WebElement  alleviatearthristpain_txt;
    
    @FindBy(xpath = "//a[text()='Voltaren Arthritis Gel']")
    private static WebElement  voltarenarthristgel;
    
    @FindBy(xpath = "//h1[text()='Powerful Arthritis Pain Relief In a Gel']")
    private static WebElement  voltarenarthristgel_txt;
    
    @FindBy(xpath = "//a[text()='alternate remedies']")
    private static WebElement  alternateremedies;
    
    @FindBy(xpath = "//span[text()='Natural Remedies for Arthritis Pain Relief']")
    private static WebElement  alternateremedies_txt;
    
    
    @FindBy(xpath = "//a[text()='about Voltaren']")
    private static WebElement  aboutvoltaren;
    
    @FindBy(xpath = "//h1[text()='What is Voltaren Arthritis Pain Relief Gel?']")
    private static WebElement  aboutvoltaren_txt;
    
    @FindBy(xpath = "//header[@class='accordion-head']")
    private static WebElement  ShowReferences;
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement  ShowReferences_Active;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/over-the-counter-diclofenac-gel/']")
    private static WebElement  Readmore1;
    
    @FindBy(xpath = "//span[text()='Diclofenac Gel']")
    private static WebElement  Readmore1_txt;
    
    @FindBy(xpath = "//a[@href='/living-with-arthritis/managing-arthritis/how-otc-arthritis-cream-gel-works/']")
    private static WebElement  Readmore2;
    
    @FindBy(xpath = "//span[text()='How Arthritis Pain Cream & Gel Works']")
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
    public void clickontylenolArthristpain_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(tylenolalternativespain_breadcrumbs);
    	clickElementUsingJavaScript(tylenolalternativespain_breadcrumbs);
    	pageLoad();
    }		
	
    public void clickonalternativesarthristpain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(alternativesarthristpain);
    	moveToElement(alternativesarthristpain);
    	clickElementUsingJavaScript(alternativesarthristpain);
    	visibilityOf(alternativesarthristpain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(alternativesarthristpain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(alternativesarthristpain_txt));
    	pageLoad();
    }		
    public void clickonManagingarthristpain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(managingarthristpain);
    	moveToElement(managingarthristpain);
    	clickElementUsingJavaScript(managingarthristpain);
    	visibilityOf(managingarthristpain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(managingarthristpain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(managingarthristpain_txt));
    	pageLoad();
    }		
    public void clickonSymptoms() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(symptoms);
    	moveToElement(symptoms);
    	clickElementUsingJavaScript(symptoms);
    	visibilityOf(symptoms_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(symptoms_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(symptoms_txt));
    	pageLoad();
    }		
    public void clickonWeather() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(weather);
    	moveToElement(weather);
    	clickElementUsingJavaScript(weather);
    	visibilityOf(weather_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(weather_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(weather_txt));
    	pageLoad();
    }		
    public void clickonAllevatearthristpain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(alleviatearthristpain);
    	moveToElement(alleviatearthristpain);
    	clickElementUsingJavaScript(alleviatearthristpain);
    	visibilityOf(alleviatearthristpain_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(alleviatearthristpain_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(alleviatearthristpain_txt));
    	pageLoad();
    }		
    public void clickonVoltarenarthristgel() throws Exception {
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
    public void clickonalternateremedies() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(alternateremedies);
    	moveToElement(alternateremedies);
    	clickElementUsingJavaScript(alternateremedies);
    	visibilityOf(alternateremedies_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(alternateremedies_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(alternateremedies_txt));
    	pageLoad();
    }		
    public void clickonaboutVoltaren() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(aboutvoltaren);
    	moveToElement(aboutvoltaren);
    	clickElementUsingJavaScript(aboutvoltaren);
    	visibilityOf(aboutvoltaren_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(aboutvoltaren_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(aboutvoltaren_txt));
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
