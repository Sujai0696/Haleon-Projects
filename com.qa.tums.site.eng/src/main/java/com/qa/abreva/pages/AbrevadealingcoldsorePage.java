package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevadealingcoldsorePage extends BaseClass{
	
	public AbrevadealingcoldsorePage() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "(//a[@href='/managing-lip-health/cold-sore-triggers/'])[3]")
	private static WebElement managingliphealth;		
	
	@FindBy(xpath = "//h1[text()='Managing Lip Health']")
	private static WebElement managingliphealth_txt;	

	@FindBy(xpath = "//a[text()='DEALING WITH COLD SORES ']")
	private static WebElement dealingcoldsore;	


	@FindBy(xpath = "//h1[text()='Dealing with Cold Sores']")
	private static WebElement dealingcoldsore_txt;	

	@FindBy(xpath = "//a[text()='LIP CARE ']")
	private static WebElement lipcare;	

	@FindBy(xpath = "//h1[text()='Lip Care']")
	private static WebElement lipcare_txt;

	@FindBy(xpath = "//a[text()='STRESS AND COLD SORES ']")
	private static WebElement stresscoldsore;

	@FindBy(xpath = "//h1[text()='Stress and Cold Sores']")
	private static WebElement stresscoldsore_txt;

	@FindBy(xpath = "//a[text()='LIP PROBLEMS ']")
	private static WebElement lipproblem;

	@FindBy(xpath = "//h1[text()='Common Lip Problems']")
	private static WebElement lipproblem_txt;

	@FindBy(xpath = "//a[text()='CAN YOU PUT ALOE VERA ON COLD SORES? ']")
	private static WebElement aloeveracoldsores;

	@FindBy(xpath = "//h1[text()='Aloe Vera for Cold Sores']")
	private static WebElement aloeveracoldsores_txt;

	@FindBy(xpath = "//a[text()='RECURRING COLD SORES ']")
	private static WebElement recurringcoldsore;

	@FindBy(xpath = "//h1[text()='Why Do I Get Cold Sores?']")
	private static WebElement recurringcoldsore_txt;	
	
	@FindBy(xpath = "//h2[text()='How long are cold sores contagious?']")
	private static WebElement coldsorecontagious;	
	
	@FindBy(xpath = "//h1[text()='HOW LONG ARE COLD SORES CONTAGIOUS?']")
	private static WebElement coldsorecontagious_txt;	
	
	@FindBy(xpath = "//h2[text()='5 WAYS TO GET RID OF COLD SORES FAST']")
	private static WebElement waysridcoldsores;	
	
	@FindBy(xpath = "//h1[text()='How to Treat Cold Sores']")
	private static WebElement waysridcoldsores_txt;	
	
	@FindBy(xpath = "//strong[text()='4 ways to feel more confident when you have a cold sore']")
	private static WebElement feelconfidentcoldsore;	
	
	@FindBy(xpath = "//h1[text()='How To Feel Confident with A Cold Sore']")
	private static WebElement feelconfidentcoldsore_txt;	
	
	@FindBy(xpath = "//h2[text()='TIPS ON HOW TO CONCEAL A COLD SORE']")
	private static WebElement concealcoldsore;	
	
	@FindBy(xpath = "//h1[text()='How to Cover a Cold Sore with Makeup']")
	private static WebElement concealcoldsore_txt;	
	
	@FindBy(xpath = "//h2[text()='KISS AND TELL']")
	private static WebElement kisstell;	
	
	@FindBy(xpath = "//h1[text()='Tips for Dating with Cold Sores']")
	private static WebElement kisstell_txt;	
	
	@FindBy(xpath = "//h2[text()='FEVER BLISTER VS. COLD SORE']")
	private static WebElement feverblistercoldsore;	
	
	@FindBy(xpath = "//h1[text()='Fever Blister Vs. Cold Sore']")
	private static WebElement feverblistercoldsore_txt;	
	
	@FindBy(xpath = "//h2[text()='5 WAYS TO GET RID OF COLD SORES']")
	private static WebElement ridofcoldsore;	
	
	@FindBy(xpath = "//h1[text()='How to Get Rid of a Cold Sore Fast']")
	private static WebElement ridofcoldsore_txt;	
	
	@FindBy(xpath = "//h2[text()='FACE COLD SORES WITH CONFIDENCE']")
	private static WebElement facecoldsore;
	
	@FindBy(xpath = "//h1[text()='Cold Sores and Confidence']")
	private static WebElement facecoldsore_txt;
	
	@FindBy(xpath = "//h2[text()='THE TRUTH ABOUT COLD SORE REMEDIES']")
	private static WebElement coldsoreremedies;
	
	@FindBy(xpath = "//h1[text()='AT-HOME REMEDIES FOR COLD SORES']")
	private static WebElement coldsoreremedies_txt;
	
	@FindBy(xpath = "//h2[text()='DEAL WITH COLD SORES CONFIDENTLY']")
	private static WebElement coldsoreconfidently;
	
	@FindBy(xpath = "//h1[text()='How to Stay Confident with a Cold Sore']")
	private static WebElement coldsoreconfidently_txt;
	
	@FindBy(xpath = "//h2[text()='COLD SORE CONFESSIONS']")
	private static WebElement coldsoreconfession;
	
	@FindBy(xpath = "//h1[text()='Living with Cold Sores: Cold Sore Confessions']")
	private static WebElement coldsoreconfession_txt;
	
	@FindBy(xpath = "//h2[text()='HELP STOP THE SPREAD']")
	private static WebElement helpspread;
	
	@FindBy(xpath = "//h1[text()='Are Cold Sores Contagious?']")
	private static WebElement helpspread_txt;
	
	@FindBy(xpath = "//h2[text()='HOW TO TREAT A COLD SORE']")
	private static WebElement treatcoldsore;
	
	@FindBy(xpath = "//h1[text()='How to Treat Cold Sores']")
	private static WebElement treatcoldsore_txt;
	
	@FindBy(xpath = "//h2[text()='HOW TO HEAL A COLD SORE SCAB']")
	private static WebElement healcoldsorescab;
	
	@FindBy(xpath = "//h1[text()='How to Heal a Cold Sore Scab']")
	private static WebElement healcoldsorescab_txt;
	
	
	@FindBy(xpath = "//h2[text()='CAN YOU GET COLD SORES ON YOUR NOSE?']")
	private static WebElement coldsoresnose;
	
	@FindBy(xpath = "//h1[text()='How to Treat Cold Sores Inside Nose']")
	private static WebElement coldsoresnose_txt;
	
	@FindBy(xpath = "//h2[text()='TOOTHPASTE ON COLD SORES—DOES IT WORK?']")
	private static WebElement toothpasteworkt;
	
	@FindBy(xpath = "//h1[text()='Toothpaste on Cold Sores: Does it Work?']")
	private static WebElement toothpasteworkt_txt;
	
	@FindBy(xpath = "//span[text()='GET COUPON']")
	private static WebElement getcoupons;
	
	@FindBy(xpath = "//h1[text()='Abreva Coupons']")
	private static WebElement getcoupons_txt;
	
	@FindBy(xpath = "//a[@class='ps-widget ps-5c82a518515475001e4e381e ps-enabled']")
	private static WebElement BuyNow;
	

	@FindBy(xpath = "//h2[text()='Oral Care Pump']")
	private static WebElement BuyNow_txt;
	
	@FindBy(xpath = "//span[@class='ps-lightbox-close']")
	private static WebElement BuyNow_Close;
	
	
	
	
	
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
	public void clickonManagingliphealth() throws Exception {	
		waitForPageLoadJava();
		moveToElement(managingliphealth);
		clickElementUsingJavaScript(managingliphealth);
		visibilityOf(managingliphealth_txt);
		boolean elementIsDisplayed=elementIsDisplayed(managingliphealth_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(managingliphealth_txt));
		pageLoad();
	}	
	public void clickonDealingColdSore() throws Exception {	
		waitForPageLoadJava();
		moveToElement(dealingcoldsore);
		elementToBeClickable(dealingcoldsore);
		visibilityOf(dealingcoldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(dealingcoldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(dealingcoldsore_txt));
		pageLoad();
	}	
	public void clickonLipCare() throws Exception {	
		waitForPageLoadJava();
		moveToElement(lipcare);
		clickElementUsingJavaScript(lipcare);
		visibilityOf(lipcare_txt);
		boolean elementIsDisplayed=elementIsDisplayed(lipcare_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(lipcare_txt));
		pageLoad();
	}	
	public void clickonStressColdsore() throws Exception {	
		waitForPageLoadJava();
		moveToElement(stresscoldsore);
		clickElementUsingJavaScript(stresscoldsore);
		scrollDownUsingElement(stresscoldsore_txt);
		visibilityOf(stresscoldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(stresscoldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(stresscoldsore_txt));
		pageLoad();
	}	
	public void clickonLipProblem() throws Exception {	
		waitForPageLoadJava();
		moveToElement(lipproblem);
		clickElementUsingJavaScript(lipproblem);
		scrollDownUsingElement(lipproblem_txt);
		visibilityOf(lipproblem_txt);
		boolean elementIsDisplayed=elementIsDisplayed(lipproblem_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(lipproblem_txt));
		pageLoad();
	}	
	public void clickonAloeveracoldsores() throws Exception {	
		waitForPageLoadJava();
		moveToElement(aloeveracoldsores);
		clickElementUsingJavaScript(aloeveracoldsores);
		scrollDownUsingElement(aloeveracoldsores_txt);
		visibilityOf(aloeveracoldsores_txt);
		boolean elementIsDisplayed=elementIsDisplayed(aloeveracoldsores_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(aloeveracoldsores_txt));
		pageLoad();
	}	
	public void clickonRecurringcoldsores() throws Exception {	
		waitForPageLoadJava();
		moveToElement(recurringcoldsore);
		clickElementUsingJavaScript(recurringcoldsore);
		scrollDownUsingElement(recurringcoldsore_txt);
		visibilityOf(recurringcoldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(recurringcoldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(recurringcoldsore_txt));
		pageLoad();
	}			
	public void clickonColdsorecontagious() throws Exception {	
		waitForPageLoadJava();
		moveToElement(coldsorecontagious);
		clickElementUsingJavaScript(coldsorecontagious);
		scrollDownUsingElement(coldsorecontagious_txt);
		visibilityOf(coldsorecontagious_txt);
		boolean elementIsDisplayed=elementIsDisplayed(coldsorecontagious_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(coldsorecontagious_txt));
		pageLoad();
	}			
	public void clickonwaysridcoldsores() throws Exception {	
		waitForPageLoadJava();
		moveToElement(waysridcoldsores);
		clickElementUsingJavaScript(waysridcoldsores);
		scrollDownUsingElement(waysridcoldsores_txt);
		visibilityOf(waysridcoldsores_txt);
		boolean elementIsDisplayed=elementIsDisplayed(waysridcoldsores_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(waysridcoldsores_txt));
		pageLoad();
	}			
	public void clickonfeelconfidentcoldsore() throws Exception {	
		waitForPageLoadJava();
		moveToElement(feelconfidentcoldsore);
		clickElementUsingJavaScript(feelconfidentcoldsore);
		scrollDownUsingElement(feelconfidentcoldsore_txt);
		visibilityOf(feelconfidentcoldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(feelconfidentcoldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(feelconfidentcoldsore_txt));
		pageLoad();
	}			
	public void clickonConcealcoldsore() throws Exception {	
		waitForPageLoadJava();
		moveToElement(concealcoldsore);
		clickElementUsingJavaScript(concealcoldsore);
		scrollDownUsingElement(concealcoldsore_txt);
		visibilityOf(concealcoldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(concealcoldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(concealcoldsore_txt));
		pageLoad();
	}			
	public void clickonkisstell() throws Exception {	
		waitForPageLoadJava();
		moveToElement(kisstell);
		clickElementUsingJavaScript(kisstell);
		scrollDownUsingElement(kisstell_txt);
		visibilityOf(kisstell_txt);
		boolean elementIsDisplayed=elementIsDisplayed(kisstell_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(kisstell_txt));
		pageLoad();
	}			
	public void clickonfeverblistercoldsore() throws Exception {	
		waitForPageLoadJava();
		moveToElement(feverblistercoldsore);
		clickElementUsingJavaScript(feverblistercoldsore);
		scrollDownUsingElement(feverblistercoldsore_txt);
		visibilityOf(feverblistercoldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(feverblistercoldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(feverblistercoldsore_txt));
		pageLoad();
	}			
	public void clickonridofcoldsore() throws Exception {	
		waitForPageLoadJava();
		//moveToElement(ridofcoldsore);
		clickElementUsingJavaScript(ridofcoldsore);
		scrollDownUsingElement(ridofcoldsore_txt);
		visibilityOf(ridofcoldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(ridofcoldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(ridofcoldsore_txt));
		pageLoad();
	}			
	public void clickonfacecoldsore() throws Exception {	
		waitForPageLoadJava();
		//moveToElement(facecoldsore);
		clickElementUsingJavaScript(facecoldsore);
		scrollDownUsingElement(facecoldsore_txt);
		visibilityOf(facecoldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(facecoldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(facecoldsore_txt));
		pageLoad();
	}			
	public void clickonColdsoreremedies() throws Exception {	
		waitForPageLoadJava();
		//moveToElement(coldsoreremedies);
		clickElementUsingJavaScript(coldsoreremedies);
		scrollDownUsingElement(coldsoreremedies_txt);
		visibilityOf(coldsoreremedies_txt);
		boolean elementIsDisplayed=elementIsDisplayed(coldsoreremedies_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(coldsoreremedies_txt));
		pageLoad();
	}			
	public void clickonColdsoreconfidently() throws Exception {	
		waitForPageLoadJava();
		//moveToElement(coldsoreconfidently);
		clickElementUsingJavaScript(coldsoreconfidently);
		scrollDownUsingElement(coldsoreconfidently_txt);
		visibilityOf(coldsoreconfidently_txt);
		boolean elementIsDisplayed=elementIsDisplayed(coldsoreconfidently_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(coldsoreconfidently_txt));
		pageLoad();
	}			
	public void clickonColdsoreconfession() throws Exception {	
		waitForPageLoadJava();
		//moveToElement(coldsoreconfession);
		clickElementUsingJavaScript(coldsoreconfession);
		scrollDownUsingElement(coldsoreconfession_txt);
		visibilityOf(coldsoreconfession_txt);
		boolean elementIsDisplayed=elementIsDisplayed(coldsoreconfession_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(coldsoreconfession_txt));
		pageLoad();
	}			
	public void clickonhelpspread() throws Exception {	
		waitForPageLoadJava();
		//moveToElement(helpspread);
		clickElementUsingJavaScript(helpspread);
		scrollDownUsingElement(helpspread_txt);
		visibilityOf(helpspread_txt);
		boolean elementIsDisplayed=elementIsDisplayed(helpspread_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(helpspread_txt));
		pageLoad();
	}			
	public void clickontreatcoldsores() throws Exception {	
		waitForPageLoadJava();
		//moveToElement(treatcoldsore);
		clickElementUsingJavaScript(treatcoldsore);
		scrollDownUsingElement(treatcoldsore_txt);
		visibilityOf(treatcoldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(treatcoldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(treatcoldsore_txt));
		pageLoad();
	}			
	public void clickonhealcoldsorescab() throws Exception {	
		waitForPageLoadJava();
		//moveToElement(healcoldsorescab);
		clickElementUsingJavaScript(healcoldsorescab);
		scrollDownUsingElement(healcoldsorescab_txt);
		visibilityOf(healcoldsorescab_txt);
		boolean elementIsDisplayed=elementIsDisplayed(healcoldsorescab_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(healcoldsorescab_txt));
		pageLoad();
	}			
	public void clickoncoldsorenose() throws Exception {	
		waitForPageLoadJava();
		//moveToElement(coldsoresnose);
		clickElementUsingJavaScript(coldsoresnose);
		scrollDownUsingElement(coldsoresnose_txt);
		visibilityOf(coldsoresnose_txt);
		boolean elementIsDisplayed=elementIsDisplayed(coldsoresnose_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(coldsoresnose_txt));
		pageLoad();
	}			
	public void clickontoothpastework() throws Exception {	
		waitForPageLoadJava();
		//moveToElement(toothpasteworkt);
		clickElementUsingJavaScript(toothpasteworkt);
		scrollDownUsingElement(toothpasteworkt_txt);
		visibilityOf(toothpasteworkt_txt);
		boolean elementIsDisplayed=elementIsDisplayed(toothpasteworkt_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(toothpasteworkt_txt));
		pageLoad();
	}			
	public void clickongetcoupons() throws Exception {	
		waitForPageLoadJava();
		//moveToElement(getcoupons);
		if (isElementPresent(getcoupons)) {
			clickElementUsingJavaScript(getcoupons);
			
			visibilityOf(getcoupons_txt);
			boolean elementIsDisplayed=elementIsDisplayed(getcoupons_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(getcoupons_txt));
			pageLoad();
		} else {
			throw new Exception("Get Coupons is not present on Preprod Url");
		}
		
	}			
	public void clickonBuyNow() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(BuyNow);
		moveToElement(BuyNow);
		if (isElementPresent(BuyNow)) {
			clickElementUsingJavaScript(BuyNow);
			
			visibilityOf(BuyNow_txt);
			boolean elementIsDisplayed=elementIsDisplayed(BuyNow_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(BuyNow_txt));
			clickElementUsingJavaScript(BuyNow_Close);
			pageLoad();
		} else {
			throw new Exception("Buy Now is not present on Page");
		}
		
	}		
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
