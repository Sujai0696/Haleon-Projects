package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class bioteneFSAorHSApurchasePage extends BaseClass{
	
	public bioteneFSAorHSApurchasePage() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']//self::button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//child::div[@class='component-content']")
	private static WebElement emailpopup_Close;

	@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//ancestor::div[@class='component-content']//self::div[@style]")
	private static WebElement email_text;
	
	@FindBy(xpath = "//a[text()='Home']")
	private static WebElement Home_Breadcrumbs;		
		
	@FindBy(xpath = "//a[text()='Using My FSA or HSA to Purchase Biotène']")
	private static WebElement FSAorHSApurchase_Breadcrumbs;			
		
	@FindBy(xpath = "//span[text()='Can I Use My Flexible Spending Account (FSA) or Health Savings Account (HSA) to Purchase Biotène® Dry Mouth Products?']")
	private static WebElement Accordion1;		
	
	@FindBy(xpath = "//li[@class='accordion-slide first odd is-active']")
	private static WebElement Accordion1_Active;	
	
	@FindBy(xpath = "//span[text()='Using My FSA to Purchase Biotène® Products']")
	private static WebElement Accordion2;	
	
	@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
	private static WebElement Accordion2_Active;	
	
	@FindBy(xpath = "//span[text()='Using My HSA to Purchase Biotène® Products']")
	private static WebElement Accordion3;	
	
	@FindBy(xpath = "//li[@class='accordion-slide odd is-active']")
	private static WebElement Accordion3_Active;	
	
	@FindBy(xpath = "//span[text()='Questions about Biotène® Products? Learn More on our FAQ page.']")
	private static WebElement Accordion4;	
	
	@FindBy(xpath = "//li[@class='accordion-slide even is-active']")
	private static WebElement Accordion4_Active;	
	
	@FindBy(xpath = "//span[text()='FSA and HSA Frequently Asked Questions']")
	private static WebElement Accordion5;	
	
	@FindBy(xpath = "//li[@class='accordion-slide last odd is-active']")
	private static WebElement Accordion5_Active;	
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod first odd grid_4 alpha']//child::a[text()='TAKE THE QUIZ']")
	private static WebElement takequiz;	
	
	@FindBy(xpath = "//h1[text()='Take the Dry Mouth Self-Assessment Test']")
	private static WebElement takequiz_txt;	
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod even grid_4']//child::a[text()='GET COUPONS']")
	private static WebElement getcoupons;	
	
	@FindBy(xpath = "//h1[text()='Save Now on Biotène Products']")
	private static WebElement getcoupons_txt;	
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod odd last grid_4 omega']//child::a[text()='SHOP NOW']")
	private static WebElement shopnow;
	
	@FindBy(xpath = "//div[@class='richText component section banner_text_buynow wdm-banner-img first odd last grid_12 alpha omega']//h1")
	private static WebElement shopnow_txt;
	
	
	
	
	
	
	//Methods//
	
		public void clickonCookieBtn() throws Exception {
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
		public void clickonEmailBtn() throws Exception {	
		waitForPageLoadJava();
		if(isElementPresent(email_text)) {
			elementToBeClickable(email_text);
			try {
				if(email_text.isDisplayed()) {
					clickElementUsingJavaScript(email_text);
				}
				implicitWait();
				visibilityOf(emailpopup_Close);
				Assert.assertTrue(elementIsDisplayed(emailpopup_Close));
			}
			catch (Exception e) {
				
			}
		}else {
			System.out.println("Email Pop-Up is not presented");
			throw new Exception("Unable to click on Email Pop-up");
		}
		}
		
		public void clickonHomeBreadcrumbs() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(Home_Breadcrumbs);
			pageLoad();
		}
		public void clickonFSAorHSApurchaseBreadcrumbs() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(FSAorHSApurchase_Breadcrumbs);
			pageLoad();
		}
		public void clickonAccordion1() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(Accordion1);
			if (isElementPresent(Accordion1_Active)) {
				clickElementUsingJavaScript(Accordion1_Active);
				Assert.assertTrue(true);
			} else {
				throw new Exception("Accordion1_Active is not present on page");
			}
			
			pageLoad();
		}
		public void clickonAccordion2() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(Accordion2);
			if (isElementPresent(Accordion2_Active)) {
				clickElementUsingJavaScript(Accordion2_Active);
				Assert.assertTrue(true);
			} else {
				throw new Exception("Accordion2_Active is not present on page");
			}
			
			pageLoad();
		}
		public void clickonAccordion3() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(Accordion3);
			if (isElementPresent(Accordion3_Active)) {
				clickElementUsingJavaScript(Accordion3_Active);
				Assert.assertTrue(true);
			} else {
				throw new Exception("Accordion3_Active is not present on page");
			}
			
			pageLoad();
		}
		public void clickonAccordion4() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(Accordion4);
			if (isElementPresent(Accordion4_Active)) {
				clickElementUsingJavaScript(Accordion4_Active);
				Assert.assertTrue(true);
			} else {
				throw new Exception("Accordion4_Active is not present on page");
			}
			
			pageLoad();
		}
		public void clickonAccordion5() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(Accordion5);
			if (isElementPresent(Accordion5_Active)) {
				clickElementUsingJavaScript(Accordion5_Active);
				Assert.assertTrue(true);
			} else {
				throw new Exception("Accordion5_Active is not present on page");
			}
			
			pageLoad();
		}
		public void clickonTakeQuiz() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(takequiz);
			clickElementUsingJavaScript(takequiz);
			visibilityOf(takequiz_txt);
			boolean elementIsDisplayed=elementIsDisplayed(takequiz_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(takequiz_txt));
			
			pageLoad();
		}
		public void clickonGetCoupons() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(getcoupons);
			clickElementUsingJavaScript(getcoupons);
			visibilityOf(getcoupons_txt);
			boolean elementIsDisplayed=elementIsDisplayed(getcoupons_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(getcoupons_txt));
			
			pageLoad();
		}
		public void clickonShopnow() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(shopnow);
			clickElementUsingJavaScript(shopnow);
			visibilityOf(shopnow_txt);
			boolean elementIsDisplayed=elementIsDisplayed(shopnow_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(shopnow_txt));
			
			pageLoad();
		}
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
