package com.qa.voltarengel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class voltarengelwhatisArthristPage extends BaseClass{

	public voltarengelwhatisArthristPage() {
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
    private static WebElement whatisArthrist_breadcrumbs;	
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/what-is-arthritis/types/']")
    private static WebElement ReadMore1;	
	
    @FindBy(xpath = "//span[text()='What are the Different Types of Arthritis?']")
    private static WebElement ReadMore1_txt;	
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/what-is-arthritis/symptoms/']")
    private static WebElement ReadMore2;	
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style first odd last component col-xs-12 col-lg-10 col-lg-offset-1']")
    private static WebElement ReadMore2_txt;	
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/what-is-arthritis/causes/']")
    private static WebElement ReadMore3;	
	
    @FindBy(xpath = "//span[text()='What are the Different Causes of Arthritis?']")
    private static WebElement ReadMore3_txt;	
	
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/what-is-arthritis/early-signs-of-osteoarthritis/']")
    private static WebElement ReadMore4;	
	
    @FindBy(xpath = "//span[text()='Early Signs of Osteoarthritis']")
    private static WebElement ReadMore4_txt;	
    
    @FindBy(xpath = "//a[@href='/supporting-caregivers/']")
    private static WebElement learnmore;	
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage padding-25-top-dt first odd last component col-xs-9 col-sm-10 col-md-5 col-lg-5']//h1[text()='Voltaren Presents: CareWalks']")
    private static WebElement learnmore_txt;	
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/what-is-arthritis/interesting-arthritis-facts/']")
    private static WebElement Readmore5;	
    
    @FindBy(xpath = "//span[text()='4 Interesting Facts About Osteoarthritis']")
    private static WebElement Readmore5_txt;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style even last component col-xs-12']//child::a[@href='/what-is-arthritis/foot-arthritis-symptoms/']")
    private static WebElement Readmore6;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style first odd last component col-xs-12 col-lg-10 col-lg-offset-1']//span[text()='Arthritis Symptoms in Feet']")
    private static WebElement Readmore6_txt;
    
    @FindBy(xpath = "//a[@href='/what-is-arthritis/foot-arthritis-symptoms/']")
    private static WebElement Readmore7;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage default-style first odd last component col-xs-12 col-lg-10 col-lg-offset-1']//span[text()='Arthritis Symptoms in Feet']")
    private static WebElement Readmore7_txt;
    
    @FindBy(xpath = "//div[@class='richTextEnhanced richText section richTextHyperlinkedImage margin-40-top-dt padding-10-top-dt padding-20-top-dt padding-30-top-dt padding-56-top-dt even last component col-xs-12 col-md-4']//a[@href='/samples-and-coupons/coupons/']")
    private static WebElement signup;
    
    @FindBy(xpath = "//h1[text()='Voltaren Arthritis Pain Gel Coupons']")
    private static WebElement signup_txt;
    
    @FindBy(xpath = "//a[text()='Get Coupons']")
    private static WebElement getcoupons;
    
    @FindBy(xpath = "//h1[text()='Voltaren Arthritis Pain Gel Coupons']")
    private static WebElement getcoupons_txt;
    
    
	
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
    public void clickonwhatisArthrist_Breadcrumbs() throws Exception {
    	waitForPageLoadJava();
    	clickElementUsingJavaScript(whatisArthrist_breadcrumbs);
    	pageLoad();
    }
    public void clickonReadmore1() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ReadMore1);
    	clickElementUsingJavaScript(ReadMore1);
    	visibilityOf(ReadMore1_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(ReadMore1_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(ReadMore1_txt));
    	pageLoad();
    }
    public void clickonReadmore2() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ReadMore2);
    	clickElementUsingJavaScript(ReadMore2);
    	visibilityOf(ReadMore2_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(ReadMore2_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(ReadMore2_txt));
    	pageLoad();
    }
	
    public void clickonReadmore3() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ReadMore3);
    	clickElementUsingJavaScript(ReadMore3);
    	visibilityOf(ReadMore3_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(ReadMore3_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(ReadMore3_txt));
    	pageLoad();
    }
	
    public void clickonReadmore4() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(ReadMore4);
    	clickElementUsingJavaScript(ReadMore4);
    	visibilityOf(ReadMore4_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(ReadMore4_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(ReadMore4_txt));
    	pageLoad();
    }
    public void clickonlearnmore() throws Exception {
    	waitForPageLoadJava();
    	//scrollDownUsingElement(learnmore);
    	if (isElementPresent(learnmore)) {
    		clickElementUsingJavaScript(learnmore);
			
		} else {
			throw new Exception("learn more button is not verified on page");
		}
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
    	visibilityOf(signup_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(signup_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(signup_txt));
    	pageLoad();
    }
    public void clickongetcoupons() throws Exception {
    	waitForPageLoadJava();
    	scrollDownUsingElement(getcoupons);
    	clickElementUsingJavaScript(getcoupons);
    	visibilityOf(getcoupons_txt);
    	boolean elementIsDisplayed=elementIsDisplayed(getcoupons_txt);
    	Assert.assertTrue(elementIsDisplayed);
    	System.out.println(getElementText(getcoupons_txt));
    	pageLoad();
    }
	
	
	
	
	
	
	
	
	
	

}
