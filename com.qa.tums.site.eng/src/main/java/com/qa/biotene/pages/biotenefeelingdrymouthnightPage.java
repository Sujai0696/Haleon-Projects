package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class biotenefeelingdrymouthnightPage extends BaseClass{
	
	public biotenefeelingdrymouthnightPage() {
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
	
	@FindBy(xpath = "//a[text()='RELIEVE OVERNIGHT DRY MOUTH SYMPTOMS']")
	private static WebElement relieveovernight_breadcrumbs;	
		
	@FindBy(xpath = "//div[@class='richText component section dis-health-text first odd grid_6 alpha']//child::span[text()='medications']")
	private static WebElement Medications;	
	
	@FindBy(xpath = "//h1[text()='Medications that Cause Dry Mouth']")
	private static WebElement Medications_txt;	
	
	@FindBy(xpath = "//div[@class='richText component section dis-health-text even last grid_6 alpha']//a[@href='/dry-mouth-health-impacts/dry-mouth-diagnosis/']")
	private static WebElement DentistDiagnosis;	
	
	@FindBy(xpath = "//h1[text()='Dry Mouth Diagnosis']")
	private static WebElement DentistDiagnosis_txt;	
	
	@FindBy(xpath = "//div[@class='richText component section three-lines footer-pod first odd grid_4 alpha']//child::a[text()='TAKE THE QUIZ']")
	private static WebElement takequiz;	
	
	@FindBy(xpath = "//h1[text()='Take the Dry Mouth Self-Assessment Test']")
	private static WebElement takequiz_txt;	
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod three even grid_4']//child::a[text()='READ MORE']")
	private static WebElement Readmore;	
	
	@FindBy(xpath = "//h1[text()='Dry Mouth Symptoms & Remedies']")
	private static WebElement Readmore_txt;	
	
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod three odd last grid_4 omega']//child::a[text()='READ MORE']")
	private static WebElement Readmore1;	
	
	@FindBy(xpath = "//h1[text()='Dry Mouth Remedies, Relief & Care']")
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
			public void clickonrelieveovernightBreadcrumbs() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(relieveovernight_breadcrumbs);
				pageLoad();
			}
			public void clickonMedications() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(Medications);
				visibilityOf(Medications_txt);
				boolean elementIsDisplayed=elementIsDisplayed(Medications_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Medications_txt));
				pageLoad();
			}
			public void clickonDentistDiagnosis() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(DentistDiagnosis);
				clickElementUsingJavaScript(DentistDiagnosis);
				visibilityOf(DentistDiagnosis_txt);
				boolean elementIsDisplayed=elementIsDisplayed(DentistDiagnosis_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(DentistDiagnosis_txt));
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
