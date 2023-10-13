package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class biotenedrymouththroatPage extends BaseClass{
	
	public biotenedrymouththroatPage() {
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
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']")
	private static WebElement drymouththroat_breadcrumbs;	
			
	@FindBy(xpath = "//div[@class='richText component section dis-health-text med-depression-text med-is-medication-text first odd']//child::a[@href='/what-is-dry-mouth/']")
	private static WebElement drymouth;
	
	@FindBy(xpath = "//div[@class='richText component section dis-health-text med-depression-text med-is-medication-text first odd']//child::a[@href='/dry-mouth-health-impacts/dry-mouth-saliva/']")
	private static WebElement salvia;
	
	@FindBy(xpath = "//h1[text()='What Is Saliva and Why Is It Important for Dry Mouth?']")
	private static WebElement salvia_txt;
	
	@FindBy(xpath = "//div[@class='richText component section dis-health-text med-depression-text med-is-medication-text first odd']//child::a[text()='Biotène Dry Mouth Oral Rinse']")
	private static WebElement drymouthoralrinse;
	
	@FindBy(xpath = "//div[@class='richText component section mouthwash-banner-text product-title-text first odd omega']")
	private static WebElement drymouthoralrinse_txt;
	
	@FindBy(xpath = "//div[@class='richText component section dis-health-text med-depression-text med-is-medication-text first odd']//child::a[text()='Biotène Dry Mouth Lozenges']")
	private static WebElement drymouthLozenges;
	
	@FindBy(xpath = "//h1[text()='Biotène Dry Mouth Lozenges']")
	private static WebElement drymouthLozenges_txt;
	
	@FindBy(xpath = "//a[text()='Biotène Oralbalance Moisturizing Gel']")
	private static WebElement drymouthoralbalance;
	
	@FindBy(xpath = "//h1[text()='Biotène Oralbalance Moisturizing Gel']")
	private static WebElement drymouthoralbalance_txt;
	
	@FindBy(xpath = "//a[text()='Biotène Moisturizing Spray']")
	private static WebElement moisturizingspray;
	
	@FindBy(xpath = "//h1[text()='Biotène Moisturizing Spray']")
	private static WebElement moisturizingspray_txt;
	
	@FindBy(xpath = "//a[text()='Biotène products']")
	private static WebElement bioteneproducts;
	
	@FindBy(xpath = "//h1[text()='Biotène Dry Mouth Products']")
	private static WebElement bioteneproducts_txt;
	
	@FindBy(xpath = "//a[text()='natural remedies']")
	private static WebElement naturalremedies;
	
	@FindBy(xpath = "//h1[text()='Natural Remedies for Dry Mouth']")
	private static WebElement naturalremedies_txt;
	
	
	
	
	
	
	
	
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
		public void clickondrymouththroatBreadcrumbs() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(drymouththroat_breadcrumbs);
			pageLoad();
		}
		public void clickondrymouth() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(drymouth);
			pageLoad();
		}
		public void clickonSalvia() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(salvia);
			clickElementUsingJavaScript(salvia);
			visibilityOf(salvia_txt);
			boolean elementIsDisplayed=elementIsDisplayed(salvia_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(salvia_txt));
			pageLoad();
		}
		public void clickondrymouthOralRinse() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(drymouthoralrinse);
			clickElementUsingJavaScript(drymouthoralrinse);
			visibilityOf(drymouthoralrinse_txt);
			boolean elementIsDisplayed=elementIsDisplayed(drymouthoralrinse_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(drymouthoralrinse_txt));
			pageLoad();
		}
		public void clickondrymouthlozenges() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(drymouthLozenges);
			clickElementUsingJavaScript(drymouthLozenges);
			visibilityOf(drymouthLozenges_txt);
			boolean elementIsDisplayed=elementIsDisplayed(drymouthLozenges_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(drymouthLozenges_txt));
			pageLoad();
		}
		public void clickondrymouthOralbalance() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(drymouthoralbalance);
			clickElementUsingJavaScript(drymouthoralbalance);
			visibilityOf(drymouthoralbalance_txt);
			boolean elementIsDisplayed=elementIsDisplayed(drymouthoralbalance_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(drymouthoralbalance_txt));
			pageLoad();
		}
		public void clickonmoisturizingspray() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(moisturizingspray);
			clickElementUsingJavaScript(moisturizingspray);
			visibilityOf(moisturizingspray_txt);
			boolean elementIsDisplayed=elementIsDisplayed(moisturizingspray_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(moisturizingspray_txt));
			pageLoad();
		}
		public void clickonbioteneproducts() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(bioteneproducts);
			clickElementUsingJavaScript(bioteneproducts);
			visibilityOf(bioteneproducts_txt);
			boolean elementIsDisplayed=elementIsDisplayed(bioteneproducts_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(bioteneproducts_txt));
			pageLoad();
		}
		public void clickonnaturalremedies() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(naturalremedies);
			clickElementUsingJavaScript(naturalremedies);
			visibilityOf(naturalremedies_txt);
			boolean elementIsDisplayed=elementIsDisplayed(naturalremedies_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(naturalremedies_txt));
			pageLoad();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
