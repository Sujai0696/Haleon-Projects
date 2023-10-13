package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelFooterPage extends BaseClass{
	
	public voltarengelFooterPage() {
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
		
    @FindBy(xpath = "//div[@class='box component section padding-30-bottom-dt paddingTop45 first odd col-xs-12']//div[@class='image component section default-style first odd last col-xs-12']")
    private static WebElement Voltaren_footerlogo;
	
    @FindBy(xpath = "//a[text()='ABOUT VOLTAREN']")
    private static WebElement aboutVoltaren;
	
    @FindBy(xpath = "//a[text()='WHAT IS ARTHRITIS?']")
    private static WebElement whatisarthrist;
	
    @FindBy(xpath = "//a[text()='UNDERSTANDING PAIN']")
    private static WebElement understandingpain;
	
    @FindBy(xpath = "//a[text()='LIVING WITH ARTHRITIS']")
    private static WebElement livingwitharthrist;
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage padding-20-top-dt first odd last component col-xs-12']//a[text()='COUPONS']")
    private static WebElement coupons;
	
    @FindBy(xpath = "//a[text()='FSA HSA ELIGIBILITY']")
    private static WebElement FSAorHSA;
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage padding-20-top-dt first odd last component col-xs-12']//a[text()='NEWSLETTER']")
    private static WebElement Newsletter;
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage padding-20-top-dt first odd last component col-xs-12']//a[text()='FAQs']")
    private static WebElement FAQ;
    
    
    
    
    
    
    
    
    
	
	
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
    public void clickonVoltarenlogo_footer() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Voltaren_footerlogo);
    	clickElementUsingJavaScript(Voltaren_footerlogo);
    	pageLoad();
    }
    public void clickonAboutvoltaren() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(aboutVoltaren);
    	clickElementUsingJavaScript(aboutVoltaren);
    	pageLoad();
    }
    public void clickonwhatisArthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(whatisarthrist);
    	clickElementUsingJavaScript(whatisarthrist);
    	pageLoad();
    }
    public void clickonunderstandingpain() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(understandingpain);
    	clickElementUsingJavaScript(understandingpain);
    	pageLoad();
    }
    public void clickonlivingwitharthrist() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(livingwitharthrist);
    	clickElementUsingJavaScript(livingwitharthrist);
    	pageLoad();
    }
    public void clickonFSAorHSA() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(FSAorHSA);
    	clickElementUsingJavaScript(FSAorHSA);
    	pageLoad();
    }
	
    public void clickonCoupons() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(coupons);
    	clickElementUsingJavaScript(coupons);
    	pageLoad();
    }
    public void clickonNewsletter() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Newsletter);
    	clickElementUsingJavaScript(Newsletter);
    	pageLoad();
    }
    public void clickonFAQ() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(FAQ);
    	clickElementUsingJavaScript(FAQ);
    	pageLoad();
    }
	
	
	
	
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
