package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelReadReviewsPage extends BaseClass{

	public voltarengelReadReviewsPage() {
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
	
    @FindBy(xpath = "//a[text()='About Voltaren']")
    private static WebElement aboutvoltaren_breadcrumbs;	
    
    @FindBy(xpath = "//li[@class='even is-active navigation-item navigation-level2 page-read-reviews']//a[text()='Read Reviews for Voltaren Arthritis Pain Gel ']")
    private static WebElement ReviewvoltarenArthristpaingel_breadcrumbs;
    
    @FindBy(xpath = "//input[@id='bv-text-field-search-contentSearch1']")
    private static WebElement search_text;
    
    @FindBy(xpath = "//div[@class='bv-control-bar']")
    private static WebElement search_Result;
    
    @FindBy(xpath = "(//span[@class='bv-search-control-icon'])[2]")
    private static WebElement search_Submit;
    
    @FindBy(xpath = "//button[text()=' Write a Review   ']")
    private static WebElement writeReview;
    
    @FindBy(xpath = "//span[text()='My Review for Voltaren Arthritis Pain Gel']")
    private static WebElement writeReview_txt;
    
    @FindBy(xpath = "//button[@class='bv-mbox-close bv-focusable']")
    private static WebElement writeReview_Close;
    
    
    
    
    
    
    
    
    
    
    
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
    public void clickonaboutvoltarenBreadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(aboutvoltaren_breadcrumbs);
    	pageLoad();
    }
    public void clickonReadReviewVoltarenArthristpaingelBreadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(ReviewvoltarenArthristpaingel_breadcrumbs);
    	pageLoad();
    }
    public void clickonSearchIcon() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(search_text);
    	clickElementUsingJavaScript(search_text);
    	search_text.sendKeys("What is Arthrist?");
    	clickElementUsingJavaScript(search_Submit);
    	visibilityOf(search_Result);
    	boolean elementIsDisplayed=elementIsDisplayed(search_Result);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(search_Result));
    	
    	pageLoad();
    }
    public void clickonWriteReview() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(writeReview);
    	clickElementUsingJavaScript(writeReview);
    	
    	visibilityOf(writeReview_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(writeReview_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(writeReview_txt));
    	clickElementUsingJavaScript(writeReview_Close);
    	
    	pageLoad();
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
