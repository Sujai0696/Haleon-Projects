package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class biotenedrymouthlabourdayPage extends BaseClass{
	
	public biotenedrymouthlabourdayPage() {
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
	
	@FindBy(xpath = "//a[text()='BEAT DRY MOUTH THIS LABOR DAY']")
	private static WebElement beatdrymouthlabour_breadcrumbs;		
	
	@FindBy(xpath = "//div[@class='richText component section tips-content-text-new tips-content-text odd last grid_7']//child::span[text()='Incorporating Biotène® into your daily routine']")
	private static WebElement incorpartingbiotene;
	
	@FindBy(xpath = "//div[@class='richText component section wdm-banner-img first odd last']//span")
	private static WebElement incorpartingbiotene_txt;
	
	@FindBy(xpath = "//div[@class='richText component section tips-content-text even last grid_7']//child::a[@href='/dry-mouth-products/moisturizing-mouth-spray/']")
	private static WebElement biotenemoisturizing;
	
	@FindBy(xpath = "//h1[text()='Biotène Moisturizing Spray']")
	private static WebElement biotenemoisturizing_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod first odd grid_4 alpha']//child::a[text()='TAKE THE QUIZ']")
	private static WebElement takeQuiz;
	
	@FindBy(xpath = "//h1[text()='Take the Dry Mouth Self-Assessment Test']")
	private static WebElement takeQuiz_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod three even grid_4']//child::a[text()='READ MORE']")
	private static WebElement Readmore;
	
	@FindBy(xpath = "//h1[text()='Dry Mouth Symptoms & Remedies']")
	private static WebElement Readmore_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod odd last grid_4 omega']//child::a[text()='READ MORE']")
	private static WebElement Readmore1;
	
	@FindBy(xpath = "//h1[text()='Relieve Symptoms from Dry Mouth at Night']")
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
	public void clickondrymouthlabourdayBreadcrumbs() throws Exception {	
		waitForPageLoadJava();
		clickElementUsingJavaScript(beatdrymouthlabour_breadcrumbs);
		pageLoad();
	}
	public void clickonIncorporatingBiotene() throws Exception {	
		waitForPageLoadJava();
		clickElementUsingJavaScript(incorpartingbiotene);
		visibilityOf(incorpartingbiotene_txt);
		boolean elementIsDisplayed=elementIsDisplayed(incorpartingbiotene_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(incorpartingbiotene_txt));
		pageLoad();
	}
	public void clickonBiotenemoisturizing() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(biotenemoisturizing);
		clickElementUsingJavaScript(biotenemoisturizing);
		visibilityOf(biotenemoisturizing_txt);
		boolean elementIsDisplayed=elementIsDisplayed(biotenemoisturizing_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(biotenemoisturizing_txt));
		pageLoad();
	}
	public void clickontakeQuiz() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(takeQuiz);
		clickElementUsingJavaScript(takeQuiz);
		visibilityOf(takeQuiz_txt);
		boolean elementIsDisplayed=elementIsDisplayed(takeQuiz_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(takeQuiz_txt));
		pageLoad();
	}
	public void clickonReadMore() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(Readmore);
		clickElementUsingJavaScript(Readmore);
		visibilityOf(Readmore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(Readmore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(Readmore_txt));
		pageLoad();
	}
	public void clickonReadMore1() throws Exception {	
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
