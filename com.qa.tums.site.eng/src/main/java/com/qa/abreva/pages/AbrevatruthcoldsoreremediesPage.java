package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevatruthcoldsoreremediesPage extends BaseClass{
	
	public AbrevatruthcoldsoreremediesPage() {
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
	
		@FindBy(xpath = "//a[text()='Dealing with Cold Sores']")
		private static WebElement dealingcoldsore_link;
	
		@FindBy(xpath = "//h1[text()='Dealing with Cold Sores']")
		private static WebElement dealingcoldsore_linktxt;
	
		@FindBy(xpath = "//a[text()='lips']")
		private static WebElement lips;
	
		@FindBy(xpath = "//h1[text()='Lip Care']")
		private static WebElement lips_txt;
	
		@FindBy(xpath = "//a[text()='Abreva Cream']")
		private static WebElement abrevacream;
	
		@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
		private static WebElement abrevacream_txt;
	
		@FindBy(xpath = "//a[text()='cold sore topics']")
		private static WebElement coldsoretips;
	
		@FindBy(xpath = "//h1[text()='What Are Cold Sores?']")
		private static WebElement coldsoretips_txt;
	
		@FindBy(xpath = "//a[text()='WEATHER THE WINTER']")
		private static WebElement weatherwinter;
	
	
		@FindBy(xpath = "//h1[text()='Cold Sores From Cold Weather: How to Prevent Winter Cold Sores']")
		private static WebElement weatherwinter_txt;
	
		@FindBy(xpath = "//a[text()='COLD SORE CONFIDENCE']")
		private static WebElement coldsoreconfidence;
	
		@FindBy(xpath = "//h1[text()='Cold Sores and Confidence']")
		private static WebElement coldsoreconfidence_txt;
		
		@FindBy(xpath = "//a[text()='LYSINE AND COLD SORES']")
		private static WebElement lysinecoldsore;
		
		@FindBy(xpath = "//h1[text()='LYSINE FOR COLD SORE TREATMENT']")
		private static WebElement lysinecoldsore_txt;
		
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
				public void clickonDealingwithcoldsoreslink() throws Exception {	
					waitForPageLoadJava();
					moveToElement(dealingcoldsore_link);
					clickElementUsingJavaScript(dealingcoldsore_link);
					visibilityOf(dealingcoldsore_linktxt);
					boolean elementIsDisplayed=elementIsDisplayed(dealingcoldsore_linktxt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(dealingcoldsore_linktxt));
					pageLoad();
				}	
				public void clickonlipslink() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(lips);
					moveToElement(lips);
					clickElementUsingJavaScript(lips);
					visibilityOf(lips_txt);
					boolean elementIsDisplayed=elementIsDisplayed(lips_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(lips_txt));
					pageLoad();
				}	
				public void clickonAbrevacreamlink() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(abrevacream);
					moveToElement(abrevacream);
					clickElementUsingJavaScript(abrevacream);
					visibilityOf(abrevacream_txt);
					boolean elementIsDisplayed=elementIsDisplayed(abrevacream_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(abrevacream_txt));
					pageLoad();
				}	
				public void clickonColdSoreTipslink() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(coldsoretips);
					moveToElement(coldsoretips);
					clickElementUsingJavaScript(coldsoretips);
					visibilityOf(coldsoretips_txt);
					boolean elementIsDisplayed=elementIsDisplayed(coldsoretips_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(coldsoretips_txt));
					pageLoad();
				}	
				public void clickonWeatherwinterlink() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(weatherwinter);
					moveToElement(weatherwinter);
					clickElementUsingJavaScript(weatherwinter);
					scrollDownUsingElement(weatherwinter_txt);
					visibilityOf(weatherwinter_txt);
					boolean elementIsDisplayed=elementIsDisplayed(weatherwinter_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(weatherwinter_txt));
					pageLoad();
				}	
				public void clickonColdsoreConfidencelink() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(coldsoreconfidence);
					moveToElement(coldsoreconfidence);
					clickElementUsingJavaScript(coldsoreconfidence);
					scrollDownUsingElement(coldsoreconfidence_txt);
					visibilityOf(coldsoreconfidence_txt);
					boolean elementIsDisplayed=elementIsDisplayed(coldsoreconfidence_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(coldsoreconfidence_txt));
					pageLoad();
				}	
				public void clickonlysinecoldsorelink() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(lysinecoldsore);
					moveToElement(lysinecoldsore);
					clickElementUsingJavaScript(lysinecoldsore);
					scrollDownUsingElement(lysinecoldsore_txt);
					visibilityOf(lysinecoldsore_txt);
					boolean elementIsDisplayed=elementIsDisplayed(lysinecoldsore_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(lysinecoldsore_txt));
					pageLoad();
				}	
				public void clickonGetCouponslink() throws Exception {	
					waitForPageLoadJava();
					//scrollDownUsingElement(getcoupons);
					if (isElementPresent(getcoupons)) {
						clickElementUsingJavaScript(getcoupons);
						visibilityOf(getcoupons_txt);
						boolean elementIsDisplayed=elementIsDisplayed(getcoupons_txt);
						Assert.assertTrue(elementIsDisplayed);
						System.out.println(getElementText(getcoupons_txt));
						pageLoad();
					} else {
						throw new Exception("Get Coupons is not Present on Page");
					}
					
				}	
				public void clickonBuyNowlink() throws Exception {	
					waitForPageLoadJava();
					scrollDownUsingElement(BuyNow);
					moveToElement(BuyNow);
					clickElementUsingJavaScript(BuyNow);
					visibilityOf(BuyNow_txt);
					boolean elementIsDisplayed=elementIsDisplayed(BuyNow_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(BuyNow_txt));
					clickElementUsingJavaScript(BuyNow_Close);
					pageLoad();
				}	
	
	
	

				
				
				
				
				
				
				
				
				

				
				
				
				
				
				
				
				
				
				
				
				
}
