package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelcaregiversupportresourcesPage extends BaseClass{

	public voltarengelcaregiversupportresourcesPage() {
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
	
    @FindBy(xpath = "//a[@href='/supporting-caregivers/']")
    private static WebElement carewalkssupportresource_breadcrumbs;			
	
    @FindBy(xpath = "//a[text()='Caregiver Support and Resources']")
    private static WebElement caregiversupportresource_breadcrumbs;	
	
    @FindBy(xpath = "//header[@class='accordion-head']")
    private static WebElement showReferences;	
	
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement showReferences_Active;	
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//a[@href='/supporting-caregivers/what-is-caregiver-burden/']")
    private static WebElement Readmore1;	
	
    @FindBy(xpath = "//span[text()='What Is Caregiver Burden?']")
    private static WebElement Readmore1_txt;	
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//a[@href='/supporting-caregivers/caregiver-burnout-and-stress/']")
    private static WebElement Readmore2;
	
    @FindBy(xpath = "//span[text()='What Is Caregiver Burnout and Stress?']")
    private static WebElement Readmore2_txt;
	
    @FindBy(xpath = "//a[text()='Get Coupons']")
    private static WebElement getCoupons;
    
    @FindBy(xpath = "//h1[text()='Voltaren Arthritis Pain Gel Coupons']")
    private static WebElement getCoupons_txt;
    
    @FindBy(xpath = "//a[@class='rd-nr-btn btn voltarenBtnBlueOutline noTextDecoration']")
    private static WebElement BuyNow;
    
    
    
    
    
    
    
    
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
    public void clickoncarewalkssupport_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(carewalkssupportresource_breadcrumbs);
    	clickElementUsingJavaScript(carewalkssupportresource_breadcrumbs);
    	pageLoad();
    }		
    public void clickoncaregiversupportresource_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(caregiversupportresource_breadcrumbs);
    	clickElementUsingJavaScript(caregiversupportresource_breadcrumbs);
    	pageLoad();
    }		
    public void clickonShowReferences() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(showReferences);
    	clickElementUsingJavaScript(showReferences);
    	visibilityOf(showReferences_Active);
    	boolean elementIsDisplayed=elementIsDisplayed(showReferences_Active);
    	Assert.assertTrue(elementIsDisplayed);
    	
    	pageLoad();
    }		
    public void clickonReadmore1() throws Exception {
    	waitForPageLoadJava();
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
    public void clickonBuyNow() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(BuyNow);
    	moveToElement(BuyNow);
    	clickElementUsingJavaScript(BuyNow);
//    	visibilityOf(BuyNow_txt);
//    	boolean elementIsDisplayed=elementIsDisplayed(BuyNow_txt);
//    	Assert.assertTrue(elementIsDisplayed);
//    	System.out.println(getElementText(BuyNow_txt));
//    	clickElementUsingJavaScript(Continue);
//    	Thread.sleep(1000);
//    	clickElementUsingJavaScript(Checkout);
    	pageLoad();
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
