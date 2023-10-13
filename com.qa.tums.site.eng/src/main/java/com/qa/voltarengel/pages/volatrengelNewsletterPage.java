package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class volatrengelNewsletterPage extends BaseClass{
	
	public volatrengelNewsletterPage() {
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
	
    @FindBy(xpath = "//a[text()='Get Arthritis Pain Relief Get Samples & Coupons | Voltaren']")
    private static WebElement getarthristpainrelief_breadcrumbs;		
		
    @FindBy(xpath = "//a[text()='Voltaren Arthritis Pain Gel Coupons']")
    private static WebElement voltarenarthristpaingel_breadcrumbs;
	
    @FindBy(xpath = "(//div[@class='form-text text default-style']//input[@class='cmp-form-text__text input-name has-no-error'])[1]")
    private static WebElement Firstname;
	
    @FindBy(xpath = "(//input[@class='cmp-form-text__text input-email has-no-error has-no-invalid-error'])[1]")
    private static WebElement emailname;
	
    @FindBy(xpath = "(//div[@class='form-qa default-style']//input[@class='cmp-cf-form-qa__field cmp-form-qa__field--radio'])[1]")
    private static WebElement Occasional_btn;
	
    @FindBy(xpath = "(//fieldset[@class='cmp-cf-form-qa cmp-form-qa--checkbox ']//input[@class='cmp-cf-form-qa__field cmp-form-qa__field--checkbox'])[1]")
    private static WebElement moveorwalk_btn;
	
    @FindBy(xpath = "(//div[@class='form-button button default-style']//button[@type='submit'])[1]")
    private static WebElement submit;
	
    @FindBy(xpath = "(//input[@placeholder='First Name *'])[2]")
    private static WebElement firstname1;
    
    @FindBy(xpath = "(//input[@class='cmp-form-text__text input-email has-no-error has-no-invalid-error'])[2]")
    private static WebElement emailname1;
    
    @FindBy(xpath = "(//button[@type='submit'])[3]")
    private static WebElement submitform;
	
	
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
//				Assert.assertTrue(elementIsDisplayed(cookieClose));
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
//            Assert.assertTrue(elementIsDisplayed(gigyaClose));
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
    public void clickongetarthristpainreliefBreadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(getarthristpainrelief_breadcrumbs);
    	clickElementUsingJavaScript(getarthristpainrelief_breadcrumbs);
    	pageLoad();
    }
    public void clickonVoltarenArthristpaingelBreadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(voltarenarthristpaingel_breadcrumbs);
    	clickElementUsingJavaScript(voltarenarthristpaingel_breadcrumbs);
    	pageLoad();
    }
    public void clickonDetails() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(Firstname);
    	clickElementUsingJavaScript(Firstname);
    	Firstname.sendKeys("Yogita");
    	implicitWait();
    	moveToElement(emailname);
    	clickElementUsingJavaScript(emailname);
    	emailname.sendKeys("yogita.patil0515@gmail.com");
    	pageLoad();
    }
    
    @FindBy(xpath = "(//div[@class='form-qa default-style']//input[@class='cmp-cf-form-qa__field cmp-form-qa__field--radio'])[2]")
    private static WebElement opt;
    public void clickonRadiobtns() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(Occasional_btn);
    	clickElementUsingJavaScript(Occasional_btn);
    	clickElementUsingJavaScript(opt);
    	boolean elementIsSelected = elementIsSelected(opt);
    	System.out.println(elementIsSelected);
    	
//    	implicitWait();
//    	clickElementUsingJavaScript(moveorwalk_btn);
//    	implicitWait();
//    	clickElementUsingJavaScript(submit);
//    	pageLoad();
    }
    
    public void clickonDetails1() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(firstname1);
    	clickElementUsingJavaScript(firstname1);
    	firstname1.sendKeys("YogitaMP");
    	implicitWait();
    	moveToElement(emailname1);
    	clickElementUsingJavaScript(emailname1);
    	emailname1.sendKeys("yogita.patil0515@gmail.com");
    	implicitWait();
    	clickElementUsingJavaScript(submitform);
    	pageLoad();
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
