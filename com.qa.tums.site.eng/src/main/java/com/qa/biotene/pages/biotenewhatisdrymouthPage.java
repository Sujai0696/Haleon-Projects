package com.qa.biotene.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class biotenewhatisdrymouthPage extends BaseClass{
	
	public biotenewhatisdrymouthPage() {
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
	
	@FindBy(xpath = "//div[@class='box component section breadcrumbs-icon-box odd grid_12 alpha omega']//child::ol[@class='breadcrumbs-list breadcrumbs-with-separator']//li[@class='breadcrumb-list-item even last is-current ']")
	private static WebElement whatisdrymouth_Breadcrumbs;
	
	@FindBy(xpath = "//div[@class='box component section live-beyond-article-box first odd grid_6 alpha']//child::span[text()='LEARN MORE']")
	private static WebElement drymouth_learnmore;
	
	@FindBy(xpath = "//h1[text()='Dry Mouth 101']")
	private static WebElement drymouth_learnmoretxt;
	
	@FindBy(xpath = "//div[@class='box component section live-beyond-article-box even grid_6']//child::span[text()='LEARN MORE']")
	private static WebElement Medication_learnmore;
	
	@FindBy(xpath = "//h1[text()='Medications that Cause Dry Mouth']")
	private static WebElement Medication_learnmoretxt;
	
	@FindBy(xpath = "//a[text()='Sjögren’s Syndrome']")
	private static WebElement sjogren_Syndrome;
	
	@FindBy(xpath = "//a[text()='Diabetes']")
	private static WebElement Diabetes;
	
	@FindBy(xpath = "//a[text()='Scleroderma']")
	private static WebElement scleroderma;
	
	@FindBy(xpath = "//a[text()='Parkinson’s Disease']")
	private static WebElement parkinsondisease;
	
	@FindBy(xpath = "//div[@class='box component section live-beyond-article-box even grid_6 omega']//child::span[text()='LEARN MORE']")
	private static WebElement symptomsremedies_learnmore;
	
	@FindBy(xpath = "//h1[text()='Dry Mouth Symptoms & Remedies']")
	private static WebElement symptomsremedies_learnmoretxt;
	
	@FindBy(xpath = "//div[@class='box component section live-beyond-article-box odd last grid_6 alpha']//child::span[text()='LEARN MORE']")
	private static WebElement Cottommouthcauses_learnmore;
	
	@FindBy(xpath = "//h1[text()='Cottonmouth Causes: How Does it Happen?']")
	private static WebElement Cottommouthcauses_learnmoretxt;
	
	
	
	
	
	
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
			public void clickonWhatisdrymouthBreadcrumbs() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(whatisdrymouth_Breadcrumbs);
				pageLoad();
			}
			public void clickondrymouth_Learnmore() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(drymouth_learnmore);
				clickElementUsingJavaScript(drymouth_learnmore);
				boolean elementIsDisplayed=elementIsDisplayed(drymouth_learnmoretxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(drymouth_learnmoretxt));				
				pageLoad();
			}
			public void clickonMedicationdrymouth_Learnmore() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Medication_learnmore);
				clickElementUsingJavaScript(Medication_learnmore);
				boolean elementIsDisplayed=elementIsDisplayed(Medication_learnmoretxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Medication_learnmoretxt));				
				pageLoad();
			}
			public void clickonSjogrneSyndrome() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(sjogren_Syndrome);
				clickElementUsingJavaScript(sjogren_Syndrome);
				pageLoad();
			}
			public void clickonDiabetes() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Diabetes);
				clickElementUsingJavaScript(Diabetes);
				pageLoad();
			}
			public void clickonSchlerderma() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(scleroderma);
				clickElementUsingJavaScript(scleroderma);
				pageLoad();
			}
			public void clickonParkinsondisease() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(parkinsondisease);
				clickElementUsingJavaScript(parkinsondisease);
				pageLoad();
			}
			public void clickonSymptomsRemedies_Learnmore() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(symptomsremedies_learnmore);
				clickElementUsingJavaScript(symptomsremedies_learnmore);
				boolean elementIsDisplayed=elementIsDisplayed(symptomsremedies_learnmoretxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(symptomsremedies_learnmoretxt));				
				pageLoad();
			}
			public void clickonCottoncauses_Learnmore() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Cottommouthcauses_learnmore);
				clickElementUsingJavaScript(Cottommouthcauses_learnmore);
				boolean elementIsDisplayed=elementIsDisplayed(Cottommouthcauses_learnmoretxt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Cottommouthcauses_learnmoretxt));				
				pageLoad();
			}
	
	
	
	
	
	
	
	

}
