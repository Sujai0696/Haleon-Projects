package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class biotenedrymouthHealthImpactPage extends BaseClass{
	
	public biotenedrymouthHealthImpactPage() {
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
		
	@FindBy(xpath = "//a[text()='IMPACT ON ORAL HEALTH']")
	private static WebElement ImpactonoralHealth_Breadcrumbs;
	
	@FindBy(xpath = "(//div[@class='box component section live-beyond-article-box first odd grid_6 alpha']//child::div[@class='richText component section home-causes-text even last']//span[text()='LEARN MORE'])[1]")
	private static WebElement ReliefCare_Learnmore;
	
	@FindBy(xpath = "//h1[text()='Dry Mouth Remedies, Relief & Care']")
	private static WebElement ReliefCare_Learnmoretxt;
	
	@FindBy(xpath = "//div[@class='box component section live-beyond-article-box even grid_6']//child::span[text()='LEARN MORE']")
	private static WebElement Understandingdrymouth_learnmore;
	
	@FindBy(xpath = "//h1[text()='Understanding Dry Mouth']")
	private static WebElement Understandingdrymouth_learnmoretxt;
	
	@FindBy(xpath = "//div[@class='box component section live-beyond-article-box odd grid_6 alpha']//child::span[text()='LEARN MORE']")
	private static WebElement drymouthDiagnosis_learnmore;
	
	@FindBy(xpath = "//h1[text()='Dry Mouth Diagnosis']")
	private static WebElement drymouthDiagnosis_learnmoretxt;
	
	@FindBy(xpath = "//div[@class='box component section live-beyond-article-box even last grid_6 omega']//child::span[text()='LEARN MORE']")
	private static WebElement whatissalvia_learnmore;
	
	@FindBy(xpath = "//h1[text()='What Is Saliva and Why Is It Important for Dry Mouth?']")
	private static WebElement whatissalvia_learnmoretxt;
	
	@FindBy(xpath = "(//div[@class='box component section live-beyond-article-box first odd grid_6 alpha'])[2]//child::span[text()='LEARN MORE']")
	private static WebElement naturalremedies_learnmore;
	
	@FindBy(xpath = "//h1[text()='Natural Remedies for Dry Mouth']")
	private static WebElement naturalremedies_learnmoretxt;
	
	@FindBy(xpath = "//div[@class='box component section live-beyond-article-box even last grid_6']//child::span[text()='LEARN MORE']")
	private static WebElement foodhelpdrymouth_learnmore;
	
	@FindBy(xpath = "//h1[text()='Foods That Help Dry Mouth and Foods You Should Avoid']")
	private static WebElement foodhelpdrymouth_learnmoretxt;
	
	
	
	
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
	public void clickonImpactonOralHealthBreadcrumbs() throws Exception {	
		waitForPageLoadJava();
		clickElementUsingJavaScript(ImpactonoralHealth_Breadcrumbs);
		pageLoad();
	}
	public void clickonReliefCare_learnmore() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(ReliefCare_Learnmore);
		clickElementUsingJavaScript(ReliefCare_Learnmore);
		visibilityOf(ReliefCare_Learnmoretxt);
		boolean elementIsDisplayed=elementIsDisplayed(ReliefCare_Learnmoretxt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(ReliefCare_Learnmoretxt));
		pageLoad();
	}
	public void clickonUnderstandingdrymouth_learnmore() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(Understandingdrymouth_learnmore);
		clickElementUsingJavaScript(Understandingdrymouth_learnmore);
		visibilityOf(Understandingdrymouth_learnmoretxt);
		boolean elementIsDisplayed=elementIsDisplayed(Understandingdrymouth_learnmoretxt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(Understandingdrymouth_learnmoretxt));
		pageLoad();
	}
	public void clickonDrymouthDiagnosis_learnmore() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(drymouthDiagnosis_learnmore);
		clickElementUsingJavaScript(drymouthDiagnosis_learnmore);
		visibilityOf(drymouthDiagnosis_learnmoretxt);
		boolean elementIsDisplayed=elementIsDisplayed(drymouthDiagnosis_learnmoretxt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(drymouthDiagnosis_learnmoretxt));
		pageLoad();
	}
	public void clickonwhatisSalvia_learnmore() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(whatissalvia_learnmore);
		clickElementUsingJavaScript(whatissalvia_learnmore);
		visibilityOf(whatissalvia_learnmoretxt);
		boolean elementIsDisplayed=elementIsDisplayed(whatissalvia_learnmoretxt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(whatissalvia_learnmoretxt));
		pageLoad();
	}
	public void clickonNaturalRemedies_learnmore() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(naturalremedies_learnmore);
		clickElementUsingJavaScript(naturalremedies_learnmore);
		visibilityOf(naturalremedies_learnmoretxt);
		boolean elementIsDisplayed=elementIsDisplayed(naturalremedies_learnmoretxt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(naturalremedies_learnmoretxt));
		pageLoad();
	}
	public void clickonFoodhelpdrymouth_learnmore() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(foodhelpdrymouth_learnmore);
		clickElementUsingJavaScript(foodhelpdrymouth_learnmore);
		visibilityOf(foodhelpdrymouth_learnmoretxt);
		boolean elementIsDisplayed=elementIsDisplayed(foodhelpdrymouth_learnmoretxt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(foodhelpdrymouth_learnmoretxt));
		pageLoad();
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	

}
