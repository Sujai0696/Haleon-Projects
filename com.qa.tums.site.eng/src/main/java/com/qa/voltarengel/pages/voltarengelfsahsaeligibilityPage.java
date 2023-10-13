package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelfsahsaeligibilityPage extends BaseClass{
	
	public voltarengelfsahsaeligibilityPage() {
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
	
    @FindBy(xpath = "//ol[@class='breadcrumbs-list breadcrumbs-without-separator']//child::a[text()='Using My FSA or HAS to Purchase Voltaren Products']")
    private static WebElement usingfsaorhsaproducts_breadcrumbs;				
	
    @FindBy(xpath = "//a[text()='Voltaren arthritis pain gel']")
    private static WebElement voltarenarthristpaingel;		
	
    @FindBy(xpath = "//h1[text()='What is Voltaren Arthritis Pain Relief Gel?']")
    private static WebElement voltarenarthristpaingel_txt;	
	
    @FindBy(xpath = "//a[text()='Voltaren pain relief gel.']")
    private static WebElement voltarenapainrelief;	
	
    @FindBy(xpath = "//h1[text()='What is Voltaren Arthritis Pain Relief Gel?']")
    private static WebElement voltarenapainrelief_txt;	
	
    @FindBy(xpath = "//a[text()='FAQ page']")
    private static WebElement FAQpage;	
	
    @FindBy(xpath = "//h1[text()='Frequently Asked Questions About Arthritis & Voltaren']")
    private static WebElement FAQpage_txt;	
	
	
	
	
	
	
	
	
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
    public void clickonUsingfsaorhsaVoltaren_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	moveToElement(usingfsaorhsaproducts_breadcrumbs);
    	clickElementUsingJavaScript(usingfsaorhsaproducts_breadcrumbs);
    	pageLoad();
    }	
    public void clickonVoltarenArthristpaingel() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenarthristpaingel);
    	moveToElement(voltarenarthristpaingel);
    	clickElementUsingJavaScript(voltarenarthristpaingel);
    	visibilityOf(voltarenarthristpaingel_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenarthristpaingel_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenarthristpaingel_txt));
    	pageLoad();
    }	
    public void clickonVoltarenpainrelief() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(voltarenapainrelief);
    	moveToElement(voltarenapainrelief);
    	clickElementUsingJavaScript(voltarenapainrelief);
    	visibilityOf(voltarenapainrelief_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(voltarenapainrelief_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(voltarenapainrelief_txt));
    	pageLoad();
    }	
    public void clickonFAQpage() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(FAQpage);
    	moveToElement(FAQpage);
    	clickElementUsingJavaScript(FAQpage);
    	visibilityOf(FAQpage_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(FAQpage_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(FAQpage_txt));
    	pageLoad();
    }	
	
	
	
	
	
	
	
	
	
	
	
	

}
