package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class biotenedrymouthnighttimePage extends BaseClass{
	
	public biotenedrymouthnighttimePage() {
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
	private static WebElement livingwithdrymouth_Breadcrumbs;				
			
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//a[text()='Managing Symptoms and Causes of Dry Mouth at Night ']")
	private static WebElement managingsymptomsnight_Breadcrumbs;
		
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/night-time/how-to-cope.html']")
	private static WebElement Copedrymouthnight;
		
	@FindBy(xpath = "//h1[text()='How to Cope with Dry Mouth at Nighttime']")
	private static WebElement Copedrymouthnight_txt;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/night-time/keep-calm.html']")
	private static WebElement Anxietyatnight;
	
	@FindBy(xpath = "//h1[text()='Anxiety at Night: Keeping Calm and Relaxed']")
	private static WebElement Anxietyatnight_txt;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/night-time/manage-anxiety.html']")
	private static WebElement managinganxiety;
	
	@FindBy(xpath = "//h1[text()='How to Manage Anxiety Throughout the Day']")
	private static WebElement managinganxiety_txt;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/night-time/bedtime-routine.html']")
	private static WebElement goodbedtimeroutine;
	
	@FindBy(xpath = "//h1[text()='Night Routines to Reduce Dry Mouth at Bedtime']")
	private static WebElement goodbedtimeroutine_txt;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/night-time/managing-dry-mouth-at-night.html']")
	private static WebElement wakeupdrymouth;
	
	@FindBy(xpath = "//h1[text()='5 Tips for How to Manage Dry Mouth While Sleeping']")
	private static WebElement wakeupdrymouth_txt;
	
	
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
		public void clickonLivingwithdrymouthBreadcrumbs() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(livingwithdrymouth_Breadcrumbs);
			pageLoad();
		}
		public void clickonManagingsymptomsnight_Breadcrumbs() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(managingsymptomsnight_Breadcrumbs);
			pageLoad();
		}	
		public void clickonCopedrymouth_nighttime() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Copedrymouthnight);
			clickElementUsingJavaScript(Copedrymouthnight);
			visibilityOf(Copedrymouthnight_txt);
			boolean elementIsDisplayed=elementIsDisplayed(Copedrymouthnight_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Copedrymouthnight_txt));
			pageLoad();
		}	
		public void clickonAnxietyatnight() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Anxietyatnight);
			clickElementUsingJavaScript(Anxietyatnight);
			visibilityOf(Anxietyatnight_txt);
			boolean elementIsDisplayed=elementIsDisplayed(Anxietyatnight_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Anxietyatnight_txt));
			pageLoad();
		}	
		public void clickonManagingAnxiety() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(managinganxiety);
			clickElementUsingJavaScript(managinganxiety);
			visibilityOf(managinganxiety_txt);
			boolean elementIsDisplayed=elementIsDisplayed(managinganxiety_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(managinganxiety_txt));
			pageLoad();
		}	
		public void clickonGoodbedtime() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(goodbedtimeroutine);
			clickElementUsingJavaScript(goodbedtimeroutine);
			visibilityOf(goodbedtimeroutine_txt);
			boolean elementIsDisplayed=elementIsDisplayed(goodbedtimeroutine_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(goodbedtimeroutine_txt));
			pageLoad();
		}	
		public void clickonwakeupdrymouth() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(wakeupdrymouth);
			clickElementUsingJavaScript(wakeupdrymouth);
			visibilityOf(wakeupdrymouth_txt);
			boolean elementIsDisplayed=elementIsDisplayed(wakeupdrymouth_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(wakeupdrymouth_txt));
			pageLoad();
		}	
	
	
	
	
	
	
	
	
	
	
	
	

}
