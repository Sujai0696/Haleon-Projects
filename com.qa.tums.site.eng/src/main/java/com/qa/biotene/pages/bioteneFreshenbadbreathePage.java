package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class bioteneFreshenbadbreathePage extends BaseClass{
	
	public bioteneFreshenbadbreathePage() {
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
	
	@FindBy(xpath = "//a[text()='FRESHEN BAD BREATH CAUSED BY DRY MOUTH']")
	private static WebElement freshenbadbreathe_Breadcrumbs;	
	
	@FindBy(xpath = "//div[@class='richText component section dis-health-text first odd grid_6 alpha']//a[text()='Dry mouth']")
	private static WebElement drymouth;	
	
	@FindBy(xpath = "//div[@class='richText component section dis-health-text first odd grid_6 alpha']//child::a[text()='Many medications']")
	private static WebElement medications;	
	
	@FindBy(xpath = "//h1[text()='The Link Between Dry Mouth and Medications']")
	private static WebElement medications_txt;	
	
	@FindBy(xpath = "//a[@href='https://www.biotene.com/what-is-dry-mouth/sjogrens-syndrome/']")
	private static WebElement sjogrenssyndrome;	
	
	@FindBy(xpath = "//div[@class='richText component section dis-health-text first odd grid_6 alpha']//child::a[text()='Biotène Dry Mouth Oral Rinse']")
	private static WebElement oralrinse;	
	
	@FindBy(xpath = "//a[text()='relieve your Dry Mouth symptoms']")
	private static WebElement relievedrymouthsymptoms;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod first odd grid_4 alpha']//child::a[text()='TAKE THE QUIZ']")
	private static WebElement takequiz;
	
	@FindBy(xpath = "//h1[text()='Take the Dry Mouth Self-Assessment Test']")
	private static WebElement takequiz_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod three even grid_4']//child::a[text()='READ MORE']")
	private static WebElement readmore;
	
	@FindBy(xpath = "//h1[text()='Dry Mouth Symptoms & Remedies']")
	private static WebElement readmore_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod three odd last grid_4 omega']//child::a[text()='READ MORE']")
	private static WebElement readmore1;
	
	@FindBy(xpath = "//h1[text()='Relieve Symptoms from Dry Mouth at Night']")
	private static WebElement readmore1_txt1;
	
	
	
	
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
	public void clickonFreshenbadbreatheBreadcrumbs() throws Exception {	
		waitForPageLoadJava();
		clickElementUsingJavaScript(freshenbadbreathe_Breadcrumbs);
		pageLoad();
	}
	public void clickondrymouth() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(drymouth);
		clickElementUsingJavaScript(drymouth);
		pageLoad();
	}
	public void clickonMedications() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(medications);
		clickElementUsingJavaScript(medications);
		visibilityOf(medications_txt);
		boolean elementIsDisplayed=elementIsDisplayed(medications_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(medications_txt));
		pageLoad();
	}
	public void clickonsjogrensyndrome() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(sjogrenssyndrome);
		clickElementUsingJavaScript(sjogrenssyndrome);
		pageLoad();
	}
	public void clickonOralRinse() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(oralrinse);
		clickElementUsingJavaScript(oralrinse);
		pageLoad();
	}
	public void clickonrelievedrymouthsymptoms() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(relievedrymouthsymptoms);
		clickElementUsingJavaScript(relievedrymouthsymptoms);
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
		scrollDownUsingElement(readmore);
		clickElementUsingJavaScript(readmore);
		visibilityOf(readmore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(readmore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(readmore_txt));
		pageLoad();
	}
	public void clickonReadmore1() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(readmore1);
		clickElementUsingJavaScript(readmore1);
		visibilityOf(readmore1_txt1);
		boolean elementIsDisplayed=elementIsDisplayed(readmore1_txt1);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(readmore1_txt1));
		pageLoad();
	}
	
	
	
	
	
	
	
	
	
	
	

}
