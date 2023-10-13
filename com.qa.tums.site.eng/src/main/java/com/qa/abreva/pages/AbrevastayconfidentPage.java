package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevastayconfidentPage extends BaseClass{
	
	public AbrevastayconfidentPage() {
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
		private static WebElement dealingcoldsore1;
	
		@FindBy(xpath = "//a[text()='PERIODS AND PREGNANCY']")
		private static WebElement peroidspreganct;
	
		@FindBy(xpath = "//h1[text()='Cold Sores, Periods, and Pregnancy']")
		private static WebElement peroidspreganct_txt;
	
		@FindBy(xpath = "//a[@href='/managing-lip-health/dealing-with-cold-sores/cold-sore-confessions/']")
		private static WebElement coldsoreconfession;
	
		@FindBy(xpath = "//h1[text()='Living with Cold Sores: Cold Sore Confessions']")
		private static WebElement coldsoreconfession_txt;
	
		@FindBy(xpath = "//a[text()='FUEL YOUR LIPS']")
		private static WebElement fuelyourlips;
	
		@FindBy(xpath = "//h1[text()='Foods for Healthy Lips']")
		private static WebElement fuelyourlips_txt;
	
		@FindBy(xpath = "//span[text()='GET COUPON']")
		private static WebElement getcoupons;
	
		@FindBy(xpath = "//h1[text()='Abreva Coupons']")
		private static WebElement getcoupons_txt;
	
		@FindBy(xpath = "//a[@class='ps-widget ps-5c82a518515475001e4e381e ps-enabled']")
		private static WebElement buynow;
	
		@FindBy(xpath = "//h2[text()='Oral Care Pump']")
		private static WebElement buynow_txt;
	
		@FindBy(xpath = "//span[@class='ps-lightbox-close']")
		private static WebElement buynow_close;
	
	
		
		
		
		
		
		
		
		
	
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
		public void clickonDealingcoldsores1() throws Exception {	
			waitForPageLoadJava();
			moveToElement(dealingcoldsore1);
			clickElementUsingJavaScript(dealingcoldsore1);
			pageLoad();
		}
		public void clickonPeroidpregancetest() throws Exception {	
			waitForPageLoadJava();
			moveToElement(peroidspreganct);
			clickElementUsingJavaScript(peroidspreganct);
			scrollDownUsingElement(peroidspreganct_txt);
			visibilityOf(peroidspreganct_txt);
			boolean elementIsDisplayed=elementIsDisplayed(peroidspreganct_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(peroidspreganct_txt));
			pageLoad();
		}	
		public void clickonColdsoreConfession() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsoreconfession);
			clickElementUsingJavaScript(coldsoreconfession);
			scrollDownUsingElement(coldsoreconfession_txt);
			visibilityOf(coldsoreconfession_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsoreconfession_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsoreconfession_txt));
			pageLoad();
		}	
		public void clickonFuelYourLips() throws Exception {	
			waitForPageLoadJava();
			moveToElement(fuelyourlips);
			clickElementUsingJavaScript(fuelyourlips);
			scrollDownUsingElement(fuelyourlips_txt);
			visibilityOf(fuelyourlips_txt);
			boolean elementIsDisplayed=elementIsDisplayed(fuelyourlips_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(fuelyourlips_txt));
			pageLoad();
		}	
		public void clickonGetCoupons() throws Exception {	
			
			waitForPageLoadJava();
			//scrollDownUsingElement(getcoupons);
			//moveToElement(getcoupons);
			elementToBeClickable(getcoupons);
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
		public void clickonBuyNow() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(buynow);
			moveToElement(buynow);
			clickElementUsingJavaScript(buynow);
			visibilityOf(buynow_txt);
			boolean elementIsDisplayed=elementIsDisplayed(buynow_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(buynow_txt));
			clickElementUsingJavaScript(buynow_close);
			pageLoad();
		}	
	
	
	
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
