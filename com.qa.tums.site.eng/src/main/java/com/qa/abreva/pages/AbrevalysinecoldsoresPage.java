package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevalysinecoldsoresPage extends BaseClass{

	public AbrevalysinecoldsoresPage() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//div[@class='navigation component section default-style first odd initialized']//a[@href='/managing-lip-health/cold-sore-triggers/']")
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
	
	@FindBy(xpath = "//div[@class='richText component section article-back-text first odd']//a[@href='/managing-lip-health/lip-care/']")
	private static WebElement lipcare1;		
	
	@FindBy(xpath = "//h1[text()='Lip Care']")
	private static WebElement lipcare1_txt;				
	
	@FindBy(xpath = "//a[text()='natural cold sore remedies']")
	private static WebElement naturalremedies;		
	
	@FindBy(xpath = "//h1[text()='AT-HOME REMEDIES FOR COLD SORES']")
	private static WebElement naturalremedies_txt;		
	
	@FindBy(xpath = "//a[text()='Abreva Cold Sore Cream']")
	private static WebElement Abrevacoldsorecream;	
	
	@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
	private static WebElement Abrevacoldsorecream_txt;	
	
	@FindBy(xpath = "//a[text()='A LITTLE PREVENTION GOES A LONG WAY']")
	private static WebElement Relatedarticle1;	
	
	@FindBy(xpath = "//h1[text()='Cold and Flu Prevention']")
	private static WebElement Relatedarticle1_txt;
	
	@FindBy(xpath = "//a[text()='THE TRUTH ABOUT COLD SORE REMEDIES']")
	private static WebElement Relatedarticle2;
	
	@FindBy(xpath = "//h1[text()='AT-HOME REMEDIES FOR COLD SORES']")
	private static WebElement Relatedarticle2_txt;
	
	@FindBy(xpath = "//a[text()='LIP CARE VS. LIP HEALTH']")
	private static WebElement Relatedartticle3;
	
	@FindBy(xpath = "//h1[text()='LEARN WHAT TRIGGERS YOUR COLD SORE']")
	private static WebElement Relatedartticle3_txt;
	
	@FindBy(xpath = "//span[text()='TAKE THE QUIZ']")
	private static WebElement takequiz;	
	
	@FindBy(xpath = "//h1[text()='What Causes a Cold Sore?']")
	private static WebElement takequiz_txt;	
	
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
		public void clickonlipcare1() throws Exception {	
			waitForPageLoadJava();
			//moveToElement(lipcare1);
			clickElementUsingJavaScript(lipcare1);
			scrollDownUsingElement(lipcare1_txt);
			visibilityOf(lipcare1_txt);
			boolean elementIsDisplayed=elementIsDisplayed(lipcare1_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(lipcare1_txt));
			pageLoad();
		}					
		public void clickonNaturalRemedies() throws Exception {	
			waitForPageLoadJava();
			moveToElement(naturalremedies);
			clickElementUsingJavaScript(naturalremedies);
			scrollDownUsingElement(naturalremedies_txt);
			visibilityOf(naturalremedies_txt);
			boolean elementIsDisplayed=elementIsDisplayed(naturalremedies_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(naturalremedies_txt));
			pageLoad();
		}					
		public void clickonAbrevacoldsorecream() throws Exception {	
			waitForPageLoadJava();
			moveToElement(Abrevacoldsorecream);
			clickElementUsingJavaScript(Abrevacoldsorecream);
			scrollDownUsingElement(Abrevacoldsorecream_txt);
			visibilityOf(Abrevacoldsorecream_txt);
			boolean elementIsDisplayed=elementIsDisplayed(Abrevacoldsorecream_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Abrevacoldsorecream_txt));
			pageLoad();
		}					
		public void clickonRelatedArticle1() throws Exception {	
			waitForPageLoadJava();
			moveToElement(Relatedarticle1);
			clickElementUsingJavaScript(Relatedarticle1);
			scrollDownUsingElement(Relatedarticle1_txt);
			visibilityOf(Relatedarticle1_txt);
			boolean elementIsDisplayed=elementIsDisplayed(Relatedarticle1_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Relatedarticle1_txt));
			pageLoad();
		}					
		public void clickonRelatedArticle2() throws Exception {	
			waitForPageLoadJava();
			moveToElement(Relatedarticle2);
			clickElementUsingJavaScript(Relatedarticle2);
			scrollDownUsingElement(Relatedarticle2_txt);
			visibilityOf(Relatedarticle2_txt);
			boolean elementIsDisplayed=elementIsDisplayed(Relatedarticle2_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Relatedarticle2_txt));
			pageLoad();
		}					
		public void clickonRelatedArticle3() throws Exception {	
			waitForPageLoadJava();
			moveToElement(Relatedartticle3);
			clickElementUsingJavaScript(Relatedartticle3);
			scrollDownUsingElement(Relatedartticle3_txt);
			visibilityOf(Relatedartticle3_txt);
			boolean elementIsDisplayed=elementIsDisplayed(Relatedartticle3_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(Relatedartticle3_txt));
			pageLoad();
		}					
		public void clickonTakequiz() throws Exception {	
			waitForPageLoadJava();
			moveToElement(takequiz);
			clickElementUsingJavaScript(takequiz);
			scrollDownUsingElement(takequiz_txt);
			visibilityOf(takequiz_txt);
			boolean elementIsDisplayed=elementIsDisplayed(takequiz_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(takequiz_txt));
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
