package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevacoldsoretriggerPage extends BaseClass{
	
	public AbrevacoldsoretriggerPage() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//div[@class='navigation component section secondary-nav aria-label-js first odd last initialized']//a[text()='MANAGING LIP HEALTH ']")
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
	
	@FindBy(xpath = "//a[text()='Lip health']")
	private static WebElement liphealth;	
	
	@FindBy(xpath = "//h1[text()='LEARN WHAT TRIGGERS YOUR COLD SORE']")
	private static WebElement liphealth_txt;
	
	@FindBy(xpath = "//a[text()='cold sores']")
	private static WebElement coldsores;
	
	@FindBy(xpath = "//h1[text()='What Are Cold Sores?']")
	private static WebElement coldsores_txt;
	
	@FindBy(xpath = "//a[text()='stress']")
	private static WebElement stress;
	
	@FindBy(xpath = "//h1[text()='Pump Up Your Brain: Ways to Relieve Stress']")
	private static WebElement stress_txt;
	
	@FindBy(xpath = "//a[text()='getting enough sleep']")
	private static WebElement gettingenoughsleep;
	
	@FindBy(xpath = "//h1[text()='How to Get Better Sleep']")
	private static WebElement gettingenoughsleep_txt;
	
	@FindBy(xpath = "//a[text()='using sunscreen when you go out in the sun']")
	private static WebElement usingsunscreen;
	
	@FindBy(xpath = "//h1[text()='The Sun and Cold Sores']")
	private static WebElement usingsunscreen_txt;
	
	@FindBy(xpath = "//a[text()='understanding hormonal changes']")
	private static WebElement hormonalchanges;
	
	@FindBy(xpath = "//h1[text()='Cold Sores, Periods, and Pregnancy']")
	private static WebElement hormonalchanges_txt;
	
	@FindBy(xpath = "//a[text()='protecting your lips from the cold']")
	private static WebElement protectinglips;
	
	@FindBy(xpath = "//h1[text()='Cold Sores From Cold Weather: How to Prevent Winter Cold Sores']")
	private static WebElement protectinglips_txt;
	
	@FindBy(xpath = "//a[text()='dealing with a cold sore']")
	private static WebElement dealingcoldsores1;
	
	@FindBy(xpath = "//h1[text()='Dealing with Cold Sores']")
	private static WebElement dealingcoldsores1_txt;
	
	@FindBy(xpath = "(//select[@class='triggers-ctg']//option)[1]")
	private static WebElement select;
	
	@FindBy(xpath = "//select[@class='triggers-ctg']")
	private static WebElement select_open;
	
	@FindBy(xpath = "//h2[text()='Cold Sore Trigger-Free Summer Vacation Planning ']")
	private static WebElement summerplanning;
	
	@FindBy(xpath = "//h1[text()='Cold Sore Trigger-Free Summer Vacation Planning']")
	private static WebElement summerplanning_txt;
	
	@FindBy(xpath = "//h2[text()='Cold Sores From Cold Weather: How to Prevent Winter Cold Sores ']")
	private static WebElement coldsoresweather;
	
	@FindBy(xpath = "//h1[text()='Cold Sores From Cold Weather: How to Prevent Winter Cold Sores']")
	private static WebElement coldsoresweather_txt;
	
	@FindBy(xpath = "//h2[text()='Get the Facts: Cold Sores and Sun Exposure ']")
	private static WebElement getfacts;
	
	@FindBy(xpath = "//h1[text()='The Sun and Cold Sores']")
	private static WebElement getfacts_txt;
	
	@FindBy(xpath = "//h2[text()='Managing Lip Health: How to Get Better Sleep ']")
	private static WebElement managingliphealthbettersleep;
	
	
	@FindBy(xpath = "//h1[text()='How to Get Better Sleep']")
	private static WebElement managingliphealthbettersleep_txt;
	
	@FindBy(xpath = "//h2[text()='Managing Your Triggers: Cold Sores and Exercise ']")
	private static WebElement managingtriggers;
	
	@FindBy(xpath = "//h1[text()='Cold Sores and Exercise']")
	private static WebElement managingtriggers_txt;
	
	@FindBy(xpath = "//h2[text()='Managing Lip Health: Ways to Relieve Stress ']")
	private static WebElement managingliphealthstress;
	
	@FindBy(xpath = "//h1[text()='Pump Up Your Brain: Ways to Relieve Stress']")
	private static WebElement managingliphealthstress_txt;
	
	@FindBy(xpath = "//h2[text()='Preventing Cold Sores: Relaxation Techniques ']")
	private static WebElement relaxationtechniques;
	
	@FindBy(xpath = "//h1[text()='Take It Easy: Relaxation Techniques']")
	private static WebElement relaxationtechniques_txt;
	
	@FindBy(xpath = "//h2[text()='REDUCE STRESS & COLD SORE TRIGGERS | ABREVA']")
	private static WebElement reducestresstrigger;
	
	@FindBy(xpath = "//h1[text()='Stress-Busting Money Management Tips']")
	private static WebElement reducestresstrigger_txt;
	

	@FindBy(xpath = "//h2[text()='COPE WITH ILLNESS OR LOSS']")
	private static WebElement copeillness;
	
	@FindBy(xpath = "//h1[text()='COPE WITH ILLNESS OR LOSS']")
	private static WebElement copeillness_txt;
	
	@FindBy(xpath = "//h2[text()='Cold Sore Triggers: Stress at Work and How to Manage It ']")
	private static WebElement stressworkmanage;
	
	@FindBy(xpath = "//h1[text()='Cold Sore Triggers: Stress at Work and How to Manage It']")
	private static WebElement stressworkmanage_txt;
	
	@FindBy(xpath = "//h2[text()='PLAN FOR IMPORTANT DAYS']")
	private static WebElement planimportantdays;
	
	@FindBy(xpath = "//span[text()='PLAN FOR IMPORTANT DAYS']")
	private static WebElement planimportantdays_txt;
	
	@FindBy(xpath = "//h2[text()='Get the Facts: Cold Sores, Periods, and Pregnancy ']")
	private static WebElement getfactscoldsore;
	
	@FindBy(xpath = "//h1[text()='Cold Sores, Periods, and Pregnancy']")
	private static WebElement getfactscoldsore_txt;
	
	@FindBy(xpath = "//h2[text()='Visiting the Dentist - Cold Sore Triggers']")
	private static WebElement visitingdentist;
	
	@FindBy(xpath = "//h1[text()='Going to the Dentist with a Cold Sore']")
	private static WebElement visitingdentist_txt;
	
	@FindBy(xpath = "//h2[text()='Managing Cold Sores: Cold and Flu Prevention ']")
	private static WebElement fluprevention;
	
	@FindBy(xpath = "//h1[text()='Cold and Flu Prevention']")
	private static WebElement fluprevention_txt;
	
	@FindBy(xpath = "//h2[text()='Avoid Cold Sores: Stress-Busting Money Management Tips ']")
	private static WebElement avoidcoldsores;
	
	@FindBy(xpath = "//h1[text()='Stress-Busting Money Management Tips']")
	private static WebElement avoidcoldsores_txt;
	
	@FindBy(xpath = "//h2[text()='Can Lip Filler Cause Cold Sores? Cold Sores After Lip Filler ']")
	private static WebElement lipfillercausesores;
	
	@FindBy(xpath = "//h1[text()='What to Know About Cold Sores After Lip Fillers']")
	private static WebElement lipfillercausesores_txt;
	
	@FindBy(xpath = "//h2[text()='Cold Sore Fact Check: Do Cold Sores Mean You Have An STD?']")
	private static WebElement havestd;
	
	@FindBy(xpath = "//h1[text()='Cold Sore Fact Check: Do Cold Sores Mean You Have An STD?']")
	private static WebElement havestd_txt;
	
	@FindBy(xpath = "//h2[text()='What Type of Antiviral Cold Sore Medication Is Right for Me?']")
	private static WebElement antiviralcoldsore;
	
	@FindBy(xpath = "//h1[text()='What Type of Antiviral Cold Sore Medication Is Right for Me?']")
	private static WebElement antiviralcoldsore_txt;
	
	@FindBy(xpath = "//h2[text()='A Parent’s Guide for Managing Teenage Stress']")
	private static WebElement parentsguide;
	
	@FindBy(xpath = "//h1[text()='A Parent’s Guide for Managing Teenage Stress']")
	private static WebElement parentsguide_txt;
	
	@FindBy(xpath = "//span[text()='READ OUR LIP CARE TIPS']")
	private static WebElement readlipcare;
	
	@FindBy(xpath = "//h1[text()='Lip Care']")
	private static WebElement readlipcare_txt;
	
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
		elementToBeClickable(managingliphealth);
		visibilityOf(managingliphealth_txt);
		boolean elementIsDisplayed=elementIsDisplayed(managingliphealth_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(managingliphealth_txt));
		pageLoad();
	}	
	public void clickonDealingColdSore() throws Exception {	
		waitForPageLoadJava();
		moveToElement(dealingcoldsore);
		clickElementUsingJavaScript(dealingcoldsore);
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
	public void clickonliphealth() throws Exception {	
		waitForPageLoadJava();
		moveToElement(liphealth);
		clickElementUsingJavaScript(liphealth);
		scrollDownUsingElement(liphealth_txt);
		visibilityOf(liphealth_txt);
		boolean elementIsDisplayed=elementIsDisplayed(liphealth_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(liphealth_txt));
		pageLoad();
	}			
	public void clickonColdsores() throws Exception {	
		waitForPageLoadJava();
		moveToElement(coldsores);
		clickElementUsingJavaScript(coldsores);
		scrollDownUsingElement(coldsores_txt);
		visibilityOf(coldsores_txt);
		boolean elementIsDisplayed=elementIsDisplayed(coldsores_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(coldsores_txt));
		pageLoad();
	}			
	public void clickonStress() throws Exception {	
		waitForPageLoadJava();
		moveToElement(stress);
		clickElementUsingJavaScript(stress);
		scrollDownUsingElement(stress_txt);
		visibilityOf(stress_txt);
		boolean elementIsDisplayed=elementIsDisplayed(stress_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(stress_txt));
		pageLoad();
	}			
	
	public void clickongettingenoughsleep() throws Exception {	
		waitForPageLoadJava();
		moveToElement(gettingenoughsleep);
		clickElementUsingJavaScript(gettingenoughsleep);
		scrollDownUsingElement(gettingenoughsleep_txt);
		visibilityOf(gettingenoughsleep_txt);
		boolean elementIsDisplayed=elementIsDisplayed(gettingenoughsleep_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(gettingenoughsleep_txt));
		pageLoad();
	}			
	public void clickonusingsunscreen() throws Exception {	
		waitForPageLoadJava();
		moveToElement(usingsunscreen);
		clickElementUsingJavaScript(usingsunscreen);
		scrollDownUsingElement(usingsunscreen_txt);
		visibilityOf(usingsunscreen_txt);
		boolean elementIsDisplayed=elementIsDisplayed(usingsunscreen_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(usingsunscreen_txt));
		pageLoad();
	}			
	public void clickonHormonalchange() throws Exception {	
		waitForPageLoadJava();
		moveToElement(hormonalchanges);
		clickElementUsingJavaScript(hormonalchanges);
		scrollDownUsingElement(hormonalchanges_txt);
		visibilityOf(hormonalchanges_txt);
		boolean elementIsDisplayed=elementIsDisplayed(hormonalchanges_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(hormonalchanges_txt));
		pageLoad();
	}			
	public void clickonProtectinglips() throws Exception {	
		waitForPageLoadJava();
		moveToElement(protectinglips);
		clickElementUsingJavaScript(protectinglips);
		scrollDownUsingElement(protectinglips_txt);
		visibilityOf(protectinglips_txt);
		boolean elementIsDisplayed=elementIsDisplayed(protectinglips_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(protectinglips_txt));
		pageLoad();
	}			
	public void clickonDealingcoldsores1() throws Exception {	
		waitForPageLoadJava();
		moveToElement(dealingcoldsores1);
		clickElementUsingJavaScript(dealingcoldsores1);
		scrollDownUsingElement(dealingcoldsores1_txt);
		visibilityOf(dealingcoldsores1_txt);
		boolean elementIsDisplayed=elementIsDisplayed(dealingcoldsores1_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(dealingcoldsores1_txt));
		pageLoad();
	}			
	public void clickonSelect_dropdown() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(select);
		Thread.sleep(1000);
		clickElementUsingJavaScript(select);
		pageLoad();
	}			
	public void clickonSummerplanning() throws Exception {	
		waitForPageLoadJava();
		moveToElement(summerplanning);
		clickElementUsingJavaScript(summerplanning);
		scrollDownUsingElement(summerplanning_txt);
		visibilityOf(summerplanning_txt);
		boolean elementIsDisplayed=elementIsDisplayed(summerplanning_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(summerplanning_txt));
		pageLoad();
	}			
	public void clickoncoldsoresweather() throws Exception {	
		waitForPageLoadJava();
		moveToElement(coldsoresweather);
		clickElementUsingJavaScript(coldsoresweather);
		scrollDownUsingElement(coldsoresweather_txt);
		visibilityOf(coldsoresweather_txt);
		boolean elementIsDisplayed=elementIsDisplayed(coldsoresweather_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(coldsoresweather_txt));
		pageLoad();
	}			
	public void clickongetfacts() throws Exception {	
		waitForPageLoadJava();
		moveToElement(getfacts);
		clickElementUsingJavaScript(getfacts);
		scrollDownUsingElement(getfacts_txt);
		visibilityOf(getfacts_txt);
		boolean elementIsDisplayed=elementIsDisplayed(getfacts_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(getfacts_txt));
		pageLoad();
	}			
	public void clickonmanagingliphealthbettersleep() throws Exception {	
		waitForPageLoadJava();
		moveToElement(managingliphealthbettersleep);
		clickElementUsingJavaScript(managingliphealthbettersleep);
		scrollDownUsingElement(managingliphealthbettersleep_txt);
		visibilityOf(managingliphealthbettersleep_txt);
		boolean elementIsDisplayed=elementIsDisplayed(managingliphealthbettersleep_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(managingliphealthbettersleep_txt));
		pageLoad();
	}			
	public void clickonmanagingtriggers() throws Exception {	
		waitForPageLoadJava();
		moveToElement(managingtriggers);
		clickElementUsingJavaScript(managingtriggers);
		scrollDownUsingElement(managingtriggers_txt);
		visibilityOf(managingtriggers_txt);
		boolean elementIsDisplayed=elementIsDisplayed(managingtriggers_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(managingtriggers_txt));
		pageLoad();
	}			
	public void clickonmanagingliphealths() throws Exception {	
		waitForPageLoadJava();
		moveToElement(managingliphealth);
		clickElementUsingJavaScript(managingliphealth);
		//scrollDownUsingElement(managingliphealth_txt);
		visibilityOf(managingliphealth_txt);
		boolean elementIsDisplayed=elementIsDisplayed(managingliphealth_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(managingliphealth_txt));
		pageLoad();
	}			
	public void clickonRelaxationTechniques() throws Exception {	
		waitForPageLoadJava();
		//moveToElement(relaxationtechniques);
		scrollDownUsingElement(relaxationtechniques);
		clickElementUsingJavaScript(relaxationtechniques);
		scrollDownUsingElement(relaxationtechniques_txt);
		visibilityOf(relaxationtechniques_txt);
		boolean elementIsDisplayed=elementIsDisplayed(relaxationtechniques_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(relaxationtechniques_txt));
		pageLoad();
	}			
	public void clickonReducestresstrigger() throws Exception {	
		waitForPageLoadJava();
	//	scrollDownUsingElement(reducestresstrigger);
		
		if (isElementPresent(reducestresstrigger)) {
			clickElementUsingJavaScript(reducestresstrigger);
			//visibilityOf(reducestresstrigger_txt);
			boolean elementIsDisplayed=elementIsDisplayed(reducestresstrigger_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(reducestresstrigger_txt));
			pageLoad();
		} else {
			throw new Exception("Reduce stress and cold sore Txt is not present on Page");
		}
	}			
	public void clickonCopeillness() throws Exception {	
		waitForPageLoadJava();
		
		scrollDownUsingElement(copeillness);
		clickElementUsingJavaScript(copeillness);
		scrollDownUsingElement(copeillness_txt);
		visibilityOf(copeillness_txt);
		boolean elementIsDisplayed=elementIsDisplayed(copeillness_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(copeillness_txt));
		pageLoad();
	}			
	public void clickonstressworkmanage() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(stressworkmanage);
		clickElementUsingJavaScript(stressworkmanage);
		scrollDownUsingElement(stressworkmanage_txt);
		visibilityOf(stressworkmanage_txt);
		boolean elementIsDisplayed=elementIsDisplayed(stressworkmanage_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(stressworkmanage_txt));
		pageLoad();
	}			
	public void clickonplanimportantdays() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(planimportantdays);
		clickElementUsingJavaScript(planimportantdays);
		scrollDownUsingElement(planimportantdays_txt);
		visibilityOf(planimportantdays_txt);
		boolean elementIsDisplayed=elementIsDisplayed(planimportantdays_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(planimportantdays_txt));
		pageLoad();
	}			
	public void clickongetfactscoldsores() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(getfactscoldsore);
		clickElementUsingJavaScript(getfactscoldsore);
		scrollDownUsingElement(getfactscoldsore_txt);
		visibilityOf(getfactscoldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(getfactscoldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(getfactscoldsore_txt));
		pageLoad();
	}			
	public void clickonvisitingDentist() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(visitingdentist);
		clickElementUsingJavaScript(visitingdentist);
		scrollDownUsingElement(visitingdentist_txt);
		visibilityOf(visitingdentist_txt);
		boolean elementIsDisplayed=elementIsDisplayed(visitingdentist_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(visitingdentist_txt));
		pageLoad();
	}			
	public void clickonfluprevention() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(fluprevention);
		clickElementUsingJavaScript(fluprevention);
		scrollDownUsingElement(fluprevention_txt);
		visibilityOf(fluprevention_txt);
		boolean elementIsDisplayed=elementIsDisplayed(fluprevention_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(fluprevention_txt));
		pageLoad();
	}			
	public void clickonAvoidcoldsores() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(avoidcoldsores);
		clickElementUsingJavaScript(avoidcoldsores);
		scrollDownUsingElement(avoidcoldsores_txt);
		visibilityOf(avoidcoldsores_txt);
		boolean elementIsDisplayed=elementIsDisplayed(avoidcoldsores_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(avoidcoldsores_txt));
		pageLoad();
	}		
	public void clickonlipfillercause() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(lipfillercausesores);
		clickElementUsingJavaScript(lipfillercausesores);
		scrollDownUsingElement(lipfillercausesores_txt);
		visibilityOf(lipfillercausesores_txt);
		boolean elementIsDisplayed=elementIsDisplayed(lipfillercausesores_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(lipfillercausesores_txt));
		pageLoad();
	}		
	public void clickonhavestd() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(havestd);
		clickElementUsingJavaScript(havestd);
		scrollDownUsingElement(havestd_txt);
		visibilityOf(havestd_txt);
		boolean elementIsDisplayed=elementIsDisplayed(havestd_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(havestd_txt));
		pageLoad();
	}		
	public void clickonAntiviralcoldsores() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(antiviralcoldsore);
		clickElementUsingJavaScript(antiviralcoldsore);
		scrollDownUsingElement(antiviralcoldsore_txt);
		visibilityOf(antiviralcoldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(antiviralcoldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(antiviralcoldsore_txt));
		pageLoad();
	}		
	public void clickonparentguide() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(parentsguide);
		clickElementUsingJavaScript(parentsguide);
		scrollDownUsingElement(parentsguide_txt);
		visibilityOf(parentsguide_txt);
		boolean elementIsDisplayed=elementIsDisplayed(parentsguide_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(parentsguide_txt));
		pageLoad();
	}		
	public void clickonreadlipcare() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(readlipcare);
		clickElementUsingJavaScript(readlipcare);
		scrollDownUsingElement(readlipcare_txt);
		visibilityOf(readlipcare_txt);
		boolean elementIsDisplayed=elementIsDisplayed(readlipcare_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(readlipcare_txt));
		pageLoad();
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
