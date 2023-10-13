package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaspreadingcoldsoresPage extends BaseClass{
	
	public AbrevaspreadingcoldsoresPage() {
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
		private static WebElement dealingcoldsore1;
	
		@FindBy(xpath = "//a[text()='cold sore triggers']")
		private static WebElement coldsoretrigger;
		
		@FindBy(xpath = "//h1[text()='Managing Lip Health']")
		private static WebElement coldsoretrigger_txt;
		
		@FindBy(xpath = "//div[@class='richText component section abreva-txt odd']//a[@href='/cold-sore-products/abreva-cream/']")
		private static WebElement Abrevacream;
		
		@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
		private static WebElement Abrevacream_txt;
		
		@FindBy(xpath = "//a[@href='/cold-sore-products/how-abreva-cream-works/']")
		private static WebElement Abrevacreamworks;
		
		@FindBy(xpath = "//h1[text()='HOW ABREVA WORKS']")
		private static WebElement Abrevacreamworks_txt;
		
		@FindBy(xpath = "//a[text()='lip care tips']")
		private static WebElement lipcaretips;
		
		@FindBy(xpath = "//h1[text()='Lip Care']")
		private static WebElement lipcaretips_txt;
		
		@FindBy(xpath = "//a[text()='DON’T DITCH THE DENTIST']")
		private static WebElement dontditchdentist;
		
		@FindBy(xpath = "//h1[text()='Going to the Dentist with a Cold Sore']")
		private static WebElement dontditchdentist_txt;
		
		@FindBy(xpath = "//a[text()='THE TRUTH ABOUT COLD SORE REMEDIES']")
		private static WebElement coldsoreremedies;
		
		@FindBy(xpath = "//h1[text()='AT-HOME REMEDIES FOR COLD SORES']")
		private static WebElement coldsoreremedies_txt;
		
		@FindBy(xpath = "//a[text()='LIP CARE VS. LIP HEALTH']")
		private static WebElement lipcareliphealth;
		
		@FindBy(xpath = "//h1[text()='LEARN WHAT TRIGGERS YOUR COLD SORE']")
		private static WebElement lipcareliphealth_txt;
		
		@FindBy(xpath = "//span[text()='GET COUPON']")
		private static WebElement getcoupons;
		
		
		@FindBy(xpath = "//h1[text()='Abreva Coupons']")
		private static WebElement getcoupons_txt;
		
		@FindBy(xpath = "//a[@class='ps-widget ps-5c82a518515475001e4e381e ps-enabled']")
		private static WebElement BuyNow;
		
		@FindBy(xpath = "//h2[text()='Oral Care Pump']")
		private static WebElement BuyNow_txt;
		
		
		@FindBy(xpath = "//span[@class='ps-lightbox-close']")
		private static WebElement BuyNow_close;
		
		
		
	
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
				public void clickonDealingcoldsore1() throws Exception {	
					waitForPageLoadJava();
					moveToElement(dealingcoldsore1);
					clickElementUsingJavaScript(dealingcoldsore1);
					pageLoad();
				}
				public void clickonColdsoretrigger() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(coldsoretrigger);
					moveToElement(coldsoretrigger);
					clickElementUsingJavaScript(coldsoretrigger);
					scrollDownUsingElement(coldsoretrigger_txt);
					visibilityOf(coldsoretrigger_txt);
					boolean elementIsDisplayed=elementIsDisplayed(coldsoretrigger_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(coldsoretrigger_txt));
					pageLoad();
				}	
				public void clickonAbrevaCream() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(Abrevacream);
					moveToElement(Abrevacream);
					clickElementUsingJavaScript(Abrevacream);
					scrollDownUsingElement(Abrevacream_txt);
					visibilityOf(Abrevacream_txt);
					boolean elementIsDisplayed=elementIsDisplayed(Abrevacream_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(Abrevacream_txt));
					pageLoad();
				}	
				public void clickonAbrevaWorks() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(Abrevacreamworks);
					moveToElement(Abrevacreamworks);
					clickElementUsingJavaScript(Abrevacreamworks);
					scrollDownUsingElement(Abrevacreamworks_txt);
					visibilityOf(Abrevacreamworks_txt);
					boolean elementIsDisplayed=elementIsDisplayed(Abrevacreamworks_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(Abrevacreamworks_txt));
					pageLoad();
				}	
				public void clickonLipcaretips() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(lipcaretips);
					moveToElement(lipcaretips);
					clickElementUsingJavaScript(lipcaretips);
					scrollDownUsingElement(lipcaretips_txt);
					visibilityOf(lipcaretips_txt);
					boolean elementIsDisplayed=elementIsDisplayed(lipcaretips_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(lipcaretips_txt));
					pageLoad();
				}	
				public void clickondontditchdentist() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(dontditchdentist);
					moveToElement(dontditchdentist);
					clickElementUsingJavaScript(dontditchdentist);
					scrollDownUsingElement(dontditchdentist_txt);
					visibilityOf(dontditchdentist_txt);
					boolean elementIsDisplayed=elementIsDisplayed(dontditchdentist_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(dontditchdentist_txt));
					pageLoad();
				}	
				public void clickonColdsoreremedies() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(coldsoreremedies);
					moveToElement(coldsoreremedies);
					clickElementUsingJavaScript(coldsoreremedies);
					scrollDownUsingElement(coldsoreremedies_txt);
					visibilityOf(coldsoreremedies_txt);
					boolean elementIsDisplayed=elementIsDisplayed(coldsoreremedies_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(coldsoreremedies_txt));
					pageLoad();
				}	
				public void clickonlipcareliphealth() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(lipcareliphealth);
					moveToElement(lipcareliphealth);
					clickElementUsingJavaScript(lipcareliphealth);
					scrollDownUsingElement(lipcareliphealth_txt);
					visibilityOf(lipcareliphealth_txt);
					boolean elementIsDisplayed=elementIsDisplayed(lipcareliphealth_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(lipcareliphealth_txt));
					pageLoad();
				}	
				public void clickonGetCoupons() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(getcoupons);
					moveToElement(getcoupons);
					clickElementUsingJavaScript(getcoupons);
					if (isElementPresent(getcoupons_txt)) {
						visibilityOf(getcoupons_txt);
						boolean elementIsDisplayed=elementIsDisplayed(getcoupons_txt);
						Assert.assertTrue(elementIsDisplayed);
						
					} else {
						System.out.println("GetCoupons_txt is not present on page");
						throw new Exception("GetCoupons_txt is not present on page");
					}
					pageLoad();
				}	
	
				public void clickonBuyNow1() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(BuyNow);
					moveToElement(BuyNow);
					clickElementUsingJavaScript(BuyNow);
					visibilityOf(BuyNow_txt);
					boolean elementIsDisplayed=elementIsDisplayed(BuyNow_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(BuyNow_txt));
					clickElementUsingJavaScript(BuyNow_close);
					pageLoad();
				}	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	

}
