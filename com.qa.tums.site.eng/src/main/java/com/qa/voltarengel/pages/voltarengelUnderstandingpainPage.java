package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelUnderstandingpainPage extends BaseClass{
	
	public voltarengelUnderstandingpainPage() {
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
    private static WebElement understanding_breadcrumbs;		
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/understanding-pain/about-pain/']")
    private static WebElement Readmore1;		
	
    @FindBy(xpath = "//span[text()='What is Pain? Where Does It Come From?']")
    private static WebElement Readmore1_txt;	
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/understanding-pain/impact-of-pain/']")
    private static WebElement Readmore2;	
	
    @FindBy(xpath = "//span[text()='The Impact of Body Pain Around the World']")
    private static WebElement Readmore2_txt;
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/understanding-pain/arthritis-weather/']")
    private static WebElement Readmore3;
	
    @FindBy(xpath = "//span[text()='Does Weather Affect Your Arthritis Pain?']")
    private static WebElement Readmore3_txt;
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/understanding-pain/morning-joint-pain/']")
    private static WebElement Readmore4;
	
    @FindBy(xpath = "//span[text()='Morning Arthritis Pain']")
    private static WebElement Readmore4_txt;
    
    @FindBy(xpath = "//a[@href='/supporting-caregivers/']")
    private static WebElement learnmore;
    
    @FindBy(xpath = "(//h1[@id='banner01'])[1]")
    private static WebElement learnmore_txt;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/understanding-pain/how-is-arthritis-diagnosed/']")
    private static WebElement Readmore5;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style first odd last component col-xs-12 col-lg-10 col-lg-offset-1']//span[text()='How Is Arthritis Diagnosed?']")
    private static WebElement Readmore5_txt;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/understanding-pain/arthritis-elbow-pain/']")
    private static WebElement Readmore6;
    
    @FindBy(xpath = "//span[text()='Elbow Arthritis: Symptoms and Treatment of Arthritis Elbow Pain']")
    private static WebElement Readmore6_txt;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/understanding-pain/sore-knee-causes/']")
    private static WebElement Readmore7;
    
    @FindBy(xpath = "//span[text()='Sore Knees: Causes and Treatments']")
    private static WebElement Readmore7_txt;
    
    @FindBy(xpath = "//a[text()='SIGN ME UP']")
    private static WebElement signup;
    
    @FindBy(xpath = "//a[text()='Get Coupons']")
    private static WebElement getcoupons;
    
    
    
    
    
    
    
	
	
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
    public void clickonunderstandingpain_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(understanding_breadcrumbs);
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
    public void clickonlearnmore() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(learnmore);
    	clickElementUsingJavaScript(learnmore);
    	visibilityOf(learnmore_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(learnmore_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(learnmore_txt));
    	pageLoad();
    }
    public void clickonReadmore5() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Readmore5);
    	clickElementUsingJavaScript(Readmore5);
    	visibilityOf(Readmore5_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(Readmore5_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Readmore5_txt));
    	pageLoad();
    }
    public void clickonReadmore6() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Readmore6);
    	clickElementUsingJavaScript(Readmore6);
    	visibilityOf(Readmore6_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(Readmore6_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Readmore6_txt));
    	pageLoad();
    }
    public void clickonReadmore7() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(Readmore7);
    	clickElementUsingJavaScript(Readmore7);
    	visibilityOf(Readmore7_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(Readmore7_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(Readmore7_txt));
    	pageLoad();
    }
    public void clickonsignup() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(signup);
    	clickElementUsingJavaScript(signup);
    	pageLoad();
    }
    public void clickongetcoupons() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(getcoupons);
    	clickElementUsingJavaScript(getcoupons);
    	pageLoad();
    }
	
	
	
	
	
	
	
	

}
