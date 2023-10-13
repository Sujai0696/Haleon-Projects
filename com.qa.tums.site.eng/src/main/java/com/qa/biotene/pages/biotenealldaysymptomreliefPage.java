package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class biotenealldaysymptomreliefPage extends BaseClass{
	
	public biotenealldaysymptomreliefPage() {
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
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']//a")
	private static WebElement daydoingbetter_breadcrumbs;	
		
	@FindBy(xpath = "//div[@class='richText component section doing-better-timeline-text first-text even grid_6 alpha']//child::a[@href='/dry-mouth-products/mouthwash/']")
	private static WebElement OralRinse;	
	
	@FindBy(xpath = "//div[@class='richText component section mouthwash-banner-text product-title-text first odd omega']")
	private static WebElement OralRinse_txt;	
	
	@FindBy(xpath = "//div[@class='richText component section doing-better-timeline-text third-text even grid_6 alpha']//child::a[@href='/dry-mouth-products/moisturizing-mouth-spray/']")
	private static WebElement moisturizingspray;	
	
	@FindBy(xpath = "//h1[text()='Biotène Moisturizing Spray']")
	private static WebElement moisturizingspray_txt;
	
	@FindBy(xpath = "//div[@class='richText component section doing-better-timeline-text fourth odd grid_6 alpha']//child::a[@href='/dry-mouth-products/moisturizing-gel/']")
	private static WebElement oralbalance_moisturizinggel;
	
	@FindBy(xpath = "//h1[text()='Biotène Oralbalance Moisturizing Gel']")
	private static WebElement oralbalance_moisturizinggel_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod first odd grid_4 alpha']//child::a[text()='TAKE THE QUIZ']")
	private static WebElement takequiz;
	
	@FindBy(xpath = "//h1[text()='Take the Dry Mouth Self-Assessment Test']")
	private static WebElement takequiz_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod three even grid_4']//child::a[@href='/what-is-dry-mouth/dry-mouth-symptoms/']")
	private static WebElement Readmore;
	
	@FindBy(xpath = "//h1[text()='Dry Mouth Symptoms & Remedies']")
	private static WebElement Readmore_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod three odd last grid_4 omega']//child::a[@href='/living-with-dry-mouth/how-to-freshen-bad-breath/']")
	private static WebElement Readmore2;
	
	@FindBy(xpath = "//h1[text()='FRESHEN BAD BREATH CAUSED BY DRY MOUTH']")
	private static WebElement Readmore_txt2;
	
	
	
	
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
	public void clickondaydoingbetterBreadcrumbs() throws Exception {	
		waitForPageLoadJava();
		clickElementUsingJavaScript(daydoingbetter_breadcrumbs);
		pageLoad();
	}
	public void clickonOralRinseMouthwash() throws Exception {	
		waitForPageLoadJava();
		clickElementUsingJavaScript(OralRinse);
		visibilityOf(OralRinse_txt);
		boolean elementIsDisplayed=elementIsDisplayed(OralRinse_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(OralRinse_txt));
		pageLoad();
	}
	public void clickonMoisturizingspray() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(moisturizingspray);
		clickElementUsingJavaScript(moisturizingspray);
		visibilityOf(moisturizingspray_txt);
		boolean elementIsDisplayed=elementIsDisplayed(moisturizingspray_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(moisturizingspray_txt));
		pageLoad();
	}
	public void clickonOralbalanceMoisturizinggel() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(oralbalance_moisturizinggel);
		clickElementUsingJavaScript(oralbalance_moisturizinggel);
		visibilityOf(oralbalance_moisturizinggel_txt);
		boolean elementIsDisplayed=elementIsDisplayed(oralbalance_moisturizinggel_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(oralbalance_moisturizinggel_txt));
		pageLoad();
	}
	public void clickonTakequiz() throws Exception {	
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
	public void clickonReadmore2() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(Readmore2);
		clickElementUsingJavaScript(Readmore2);
		visibilityOf(Readmore_txt2);
		boolean elementIsDisplayed=elementIsDisplayed(Readmore_txt2);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(Readmore_txt2));
		pageLoad();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
