package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelforcaregiversPage extends BaseClass{
	
	public voltarengelforcaregiversPage() {
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
	
    @FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']")
    private static WebElement carewalkssupportcaregivers_breadcrumbs;			
	
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[1]")
    private static WebElement Youtube1;	
	
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement Youtube1_visibility;	
	
    @FindBy(xpath = "(//i[@class='icon icon-video-play'])[2]")
    private static WebElement Youtube2;	
	
    @FindBy(xpath = "//div[@style='display: flex;']")
    private static WebElement Youtube2_visibility;	
	
    @FindBy(xpath = "//a[@href='/supporting-caregivers/health-wellness-tips-for-caregivers/']")
    private static WebElement Readmore1;
    
    @FindBy(xpath = "//span[text()='Health and Wellness Tips for Caregivers']")
    private static WebElement Readmore1_txt;
    
    
    @FindBy(xpath = "//a[@href='/supporting-caregivers/caregiver-self-care-tips/']")
    private static WebElement Readmore2;	
    
    @FindBy(xpath = "//span[text()='The Best Caregiver Self-Care Tips']")
    private static WebElement Readmore2_txt;	
    
    @FindBy(xpath = "//a[@href='/supporting-caregivers/caregiver-support-resources/']")
    private static WebElement Readmore3;	
    
    @FindBy(xpath = "//span[text()='Caregiver Support and Resources']")
    private static WebElement Readmore3_txt;	
    
    @FindBy(xpath = "//a[@href='/supporting-caregivers/caregiver-fatigue/']")
    private static WebElement Readmore4;	
    
    @FindBy(xpath = "//span[text()='What Is Caregiver Fatigue?']")
    private static WebElement Readmore4_txt;	
    
    @FindBy(xpath = "(//a[@href='/what-is-voltaren/'])[2]")
    private static WebElement learnmore;	
    
    @FindBy(xpath = "//h1[text()='What is Voltaren Arthritis Pain Relief Gel?']")
    private static WebElement learnmore_txt;	
    
    @FindBy(xpath = "//span[text()='Show References']")
    private static WebElement ShowReferences;	
    
    @FindBy(xpath = "//li[@class='accordion-slide first last odd is-active']")
    private static WebElement ShowReferences_Active;	
    
    
    
    
    
    
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
    public void clickonCarewalkerssupportResourceBreadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	//moveToElement(carewalkssupportcaregivers_breadcrumbs);
    	clickElementUsingJavaScript(carewalkssupportcaregivers_breadcrumbs);
    	pageLoad();
    }
    public void clickonYoutubebtnCaregiver1() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Youtube1);
    	clickElementUsingJavaScript(Youtube1);
    	visibilityOf(Youtube1_visibility);
    	actionClick(Youtube1_visibility);
    	boolean elementIsDisplayed=elementIsDisplayed(Youtube1_visibility);
    	Assert.assertTrue(elementIsDisplayed);
    	pageLoad();
    }
    public void clickonYoutubebtnCaregiver2() throws Exception {
    	waitForPageLoadJava();
    	if (isElementPresent(Youtube2)) {
    		clickElementUsingJavaScript(Youtube2);
			//visibilityOf(Youtube2_visibility);
			actionClick(Youtube2_visibility);
			boolean elementIsDisplayed=elementIsDisplayed(Youtube2_visibility);
			Assert.assertTrue(elementIsDisplayed);
		} else {
			throw new Exception("Youtube is not played on Page");
		}
    	pageLoad();
    }
    public void clickonReadmore1() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Readmore1);
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
    	clickElementUsingJavaScript(Readmore2);
    	visibilityOf(Readmore2_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(Readmore2_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Readmore2_txt));
    	pageLoad();
    }
    public void clickonReadmore3() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Readmore3);
    	clickElementUsingJavaScript(Readmore3);
    	visibilityOf(Readmore3_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(Readmore3_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Readmore3_txt));
    	pageLoad();
    }
    public void clickonReadmore4() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Readmore4);
    	clickElementUsingJavaScript(Readmore4);
    	visibilityOf(Readmore4_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(Readmore4_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Readmore4_txt));
    	pageLoad();
    }
    public void clickonLearnmore() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(learnmore);
    	clickElementUsingJavaScript(learnmore);
    	visibilityOf(learnmore_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(learnmore_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(learnmore_txt));
    	pageLoad();
    }
    public void clickonShowReferences() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ShowReferences);
    	if (isElementPresent(ShowReferences)) {
    		clickElementUsingJavaScript(ShowReferences);
    		//visibilityOf(ShowReferences_Active);
        	boolean elementIsDisplayed=elementIsDisplayed(ShowReferences_Active);
        	Assert.assertTrue(elementIsDisplayed);
		} else {
			throw new Exception("Show References not present on page");
		}
    	
    	pageLoad();
    }
	
	
	
	
	
	
	
	
	

}
