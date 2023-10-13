package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class biotenelivingwithdrymouthcaregiversPage extends BaseClass{
	
	public biotenelivingwithdrymouthcaregiversPage() {
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
		
	@FindBy(xpath = "//a[text()='CAREGIVERS']")
	private static WebElement caregivers_Breadcrumbs;	
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/care-givers/caring-for-someone.html']")
	private static WebElement drymouthsymptoms_theyhave;	
	
	@FindBy(xpath = "//h1[text()='Dry Mouth Symptoms - a Guide for Caregivers']")
	private static WebElement drymouthsymptoms_theyhave_txt;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/care-givers/remedies.html']")
	private static WebElement drymouthremedies;
	
	@FindBy(xpath = "//h1[text()='Dry Mouth Remedies – a Guide for Caregivers']")
	private static WebElement drymouthremedies_txt;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/care-givers/risk.html']")
	private static WebElement causesdrymouth;
	
	@FindBy(xpath = "//h1[text()='Causes of Dry Mouth – a Reference for Caregivers']")
	private static WebElement causesdrymouth_txt;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/living-with-dry-mouth/care-givers/quiz/']")
	private static WebElement quizcaregivers;
	
	@FindBy(xpath = "//h1[text()='Does Your Loved One Have Dry Mouth? A Quiz for Caregivers']")
	private static WebElement quizcaregivers_txt;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/care-givers/how-to-create-a-caregiver-basket.html']")
	private static WebElement caregiverbasket;
	
	@FindBy(xpath = "//h1[text()='Creating a Caregiver Basket for Loved One ']")
	private static WebElement caregiverbasket_txt;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/care-givers/how-to-help-your-partner-with-a-chronic-illness.html']")
	private static WebElement ChronicIllness;
	
	@FindBy(xpath = "//h1[text()='How to Help a Partner with Chronic Illness']")
	private static WebElement ChronicIllness_txt;
	
	
	
	
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
		public void clickonCaregiversBreadcrumbs() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(caregivers_Breadcrumbs);
			pageLoad();
		}
		public void clickondrymouthsymptoms_theymayhave() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(drymouthsymptoms_theyhave);
			clickElementUsingJavaScript(drymouthsymptoms_theyhave);
			visibilityOf(drymouthsymptoms_theyhave_txt);
			boolean elementIsDisplayed=elementIsDisplayed(drymouthsymptoms_theyhave_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(drymouthsymptoms_theyhave_txt));
			pageLoad();
		}
		public void clickondrymouthRemedies() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(drymouthremedies);
			clickElementUsingJavaScript(drymouthremedies);
			visibilityOf(drymouthremedies_txt);
			boolean elementIsDisplayed=elementIsDisplayed(drymouthremedies_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(drymouthremedies_txt));
			pageLoad();
		}
		public void clickonCausesdrymouthcaregivers() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(causesdrymouth);
			clickElementUsingJavaScript(causesdrymouth);
			visibilityOf(causesdrymouth_txt);
			boolean elementIsDisplayed=elementIsDisplayed(causesdrymouth_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(causesdrymouth_txt));
			pageLoad();
		}
		public void clickonQuizcaregivers() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(quizcaregivers);
			clickElementUsingJavaScript(quizcaregivers);
			visibilityOf(quizcaregivers_txt);
			boolean elementIsDisplayed=elementIsDisplayed(quizcaregivers_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(quizcaregivers_txt));
			pageLoad();
		}
		public void clickonCaregiverBasket() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(caregiverbasket);
			clickElementUsingJavaScript(caregiverbasket);
			visibilityOf(caregiverbasket_txt);
			boolean elementIsDisplayed=elementIsDisplayed(caregiverbasket_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(caregiverbasket_txt));
			pageLoad();
		}
	
		public void clickonChronicIllness() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(ChronicIllness);
			clickElementUsingJavaScript(ChronicIllness);
			visibilityOf(ChronicIllness_txt);
			boolean elementIsDisplayed=elementIsDisplayed(ChronicIllness_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(ChronicIllness_txt));
			pageLoad();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
