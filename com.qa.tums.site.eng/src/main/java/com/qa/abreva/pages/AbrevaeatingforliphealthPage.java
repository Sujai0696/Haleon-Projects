package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaeatingforliphealthPage extends BaseClass{
	
	public AbrevaeatingforliphealthPage() {
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
	
	@FindBy(xpath = "//u[text()='Dealing with Cold Sores']")
	private static WebElement dealingwithcoldsores;
	
	@FindBy(xpath = "//h1[text()='Dealing with Cold Sores']")
	private static WebElement dealingwithcoldsores_txt;	
	
	@FindBy(xpath = "//a[text()='about cold sores']")
	private static WebElement aboutcoldsores;	
	
	@FindBy(xpath = "//h1[text()='What Are Cold Sores?']")
	private static WebElement aboutcoldsores_txt;	
	
	@FindBy(xpath = "//a[text()='people have recurring cold sores']")
	private static WebElement recuringsores;	
	
	@FindBy(xpath = "//h1[text()='What Are Cold Sores?']")
	private static WebElement recuringsores_txt;	
	
	@FindBy(xpath = "//a[text()='Lip Care']")
	private static WebElement lipcare1;
	
	@FindBy(xpath = "//h1[text()='Lip Care']")
	private static WebElement lipcare1_txt;
	
	@FindBy(xpath = "//a[text()='lip care']")
	private static WebElement lipcare2;
	
	@FindBy(xpath = "//h1[text()='Lip Care']")
	private static WebElement lipcare2_txt;
	
	
	@FindBy(xpath = "//a[text()='how to protect your lips from UV rays']")
	private static WebElement uvrays;
	
	@FindBy(xpath = "//h1[text()='The Sun and Cold Sores']")
	private static WebElement uvrays_txt;
	
	@FindBy(xpath = "//a[text()='how to treat a cold sore']")
	private static WebElement treatcoldsore;
	
	@FindBy(xpath = "//h1[text()='Should You Pop a Cold Sore?']")
	private static WebElement treatcoldsore_txt;
	
	@FindBy(xpath = "//a[text()='GET MOVING']")
	private static WebElement Relatedarticle1;
	
	@FindBy(xpath = "//h1[text()='Cold Sores and Exercise']")
	private static WebElement Relatedarticle1_txt;
	
	@FindBy(xpath = "//a[@href='/managing-lip-health/dealing-with-cold-sores/staying-confident/']")
	private static WebElement Relatedarticle2;
	
	@FindBy(xpath = "//h1[text()='How to Stay Confident with a Cold Sore']")
	private static WebElement Relatedarticle2_txt;
	
	@FindBy(xpath = "//a[text()='KNOCK OUT YOUR CHAPPED LIPS']")
	private static WebElement Relatedarticle3;
	
	@FindBy(xpath = "//h1[text()='Hydrate and Heal Chapped Lips']")
	private static WebElement Relatedarticle3_txt;
	
	
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
				moveToElement(lipcare1);
				clickElementUsingJavaScript(lipcare1);
				scrollDownUsingElement(lipcare1_txt);
				visibilityOf(lipcare1_txt);
				boolean elementIsDisplayed=elementIsDisplayed(lipcare1_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(lipcare1_txt));
				pageLoad();
			}			
			public void clickonlipcare2() throws Exception {	
				waitForPageLoadJava();
				moveToElement(lipcare2);
				clickElementUsingJavaScript(lipcare2);
				scrollDownUsingElement(lipcare2_txt);
				visibilityOf(lipcare2_txt);
				boolean elementIsDisplayed=elementIsDisplayed(lipcare2_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(lipcare2_txt));
				pageLoad();
			}			
			public void clickonuvrays() throws Exception {	
				waitForPageLoadJava();
				moveToElement(uvrays);
				clickElementUsingJavaScript(uvrays);
				scrollDownUsingElement(uvrays_txt);
				visibilityOf(uvrays_txt);
				boolean elementIsDisplayed=elementIsDisplayed(uvrays_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(uvrays_txt));
				pageLoad();
			}			
			public void clickontreatcoldsore() throws Exception {	
				waitForPageLoadJava();
				moveToElement(treatcoldsore);
				clickElementUsingJavaScript(treatcoldsore);
				scrollDownUsingElement(treatcoldsore_txt);
				visibilityOf(treatcoldsore_txt);
				boolean elementIsDisplayed=elementIsDisplayed(treatcoldsore_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(treatcoldsore_txt));
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
				moveToElement(Relatedarticle3);
				clickElementUsingJavaScript(Relatedarticle3);
				scrollDownUsingElement(Relatedarticle3_txt);
				visibilityOf(Relatedarticle3_txt);
				boolean elementIsDisplayed=elementIsDisplayed(Relatedarticle3_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(Relatedarticle3_txt));
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
