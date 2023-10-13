package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class biotenedrinkingwaterdrymouthPage extends BaseClass{
	
	public biotenedrinkingwaterdrymouthPage() {
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
		
	@FindBy(xpath = "//a[text()='LIVING WITH DRY MOUTH']")
	private static WebElement livingdrymouth_Breadcrumbs;			
	
	@FindBy(xpath = "//a[text()='A DRY MOUTH NEEDS MORE THAN JUST WATER']")
	private static WebElement drymouthneedswater_Breadcrumbs;	
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod first odd grid_4 alpha']//child::a[text()='TAKE THE QUIZ']")
	private static WebElement takequiz;	
	
	@FindBy(xpath = "//h1[text()='Take the Dry Mouth Self-Assessment Test']")
	private static WebElement takequiz_txt;	
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod three even grid_4']//child::a[text()='READ MORE']")
	private static WebElement Readmore;	
	
	@FindBy(xpath = "//h1[text()='What Is Saliva and Why Is It Important for Dry Mouth?']")
	private static WebElement Readmore_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod three odd last grid_4 omega']//child::a[text()='READ MORE']")
	private static WebElement Readmore1;
	
	@FindBy(xpath = "//h1[text()='Dry Mouth Symptoms & Remedies']")
	private static WebElement Readmore1_txt1;
	
	
	
	
	
	
	
	
	
	
	
	
	
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
		public void clickonlivingdrymouthBreadcrumbs() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(livingdrymouth_Breadcrumbs);
			pageLoad();
		}
		public void clickondrymouthneedswaterBreadcrumbs() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(drymouthneedswater_Breadcrumbs);
			pageLoad();
		}
		public void clickontakequiz() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(takequiz);
			clickElementUsingJavaScript(takequiz);
			visibilityOf(takequiz_txt);
			boolean elementIsDisplayed=elementIsDisplayed(takequiz_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(takequiz_txt));
			pageLoad();
		}
		public void clickonReadmore() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Readmore);
			clickElementUsingJavaScript(Readmore);
			visibilityOf(Readmore_txt);
			boolean elementIsDisplayed=elementIsDisplayed(Readmore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Readmore_txt));
			pageLoad();
		}
		public void clickonReadmore1() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Readmore1);
			clickElementUsingJavaScript(Readmore1);
			visibilityOf(Readmore1_txt1);
			boolean elementIsDisplayed=elementIsDisplayed(Readmore1_txt1);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Readmore1_txt1));
			pageLoad();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
