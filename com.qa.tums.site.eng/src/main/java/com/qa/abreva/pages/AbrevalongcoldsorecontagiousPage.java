package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevalongcoldsorecontagiousPage extends BaseClass{
	
	public AbrevalongcoldsorecontagiousPage() {
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
	
	@FindBy(xpath = "//a[text()='cold sore tingle']")
	private static WebElement coldsoretingle;
	
	@FindBy(xpath = "//h1[text()='What Causes a Cold Sore?']")
	private static WebElement coldsoretingle_txt;
	
	@FindBy(xpath = "//a[text()='Abreva Cold Sore Cream']")
	private static WebElement Abrevacoldsorecream;
	
	@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
	private static WebElement Abrevacoldsorecream_txt;
	
	@FindBy(xpath = "//a[text()='relaxation techniques']")
	private static WebElement relaxationtechniques;
	
	@FindBy(xpath = "//h1[text()='Take It Easy: Relaxation Techniques']")
	private static WebElement relaxationtechniques_txt;
	
	@FindBy(xpath = "//a[text()='managing your lip health']")
	private static WebElement managingyourliphealth;
	
	@FindBy(xpath = "//h1[text()='Managing Lip Health']")
	private static WebElement managingyourliphealth_txt;
	
	@FindBy(xpath = "//a[text()='PERIODS AND PREGNANCY']")
	private static WebElement peroidspregancy;
	
	@FindBy(xpath = "//h1[text()='Cold Sores, Periods, and Pregnancy']")
	private static WebElement peroidspregancy_txt;
	
	@FindBy(xpath = "//a[@href='/managing-lip-health/dealing-with-cold-sores/cold-sore-confessions/']")
	private static WebElement coldsoreconfession;
	
	@FindBy(xpath = "//h1[text()='Living with Cold Sores: Cold Sore Confessions']")
	private static WebElement coldsoreconfession_txt;
	
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
			public void clickonDealingwithcoldsores() throws Exception {	
				waitForPageLoadJava();
				moveToElement(dealingcoldsore);
				clickElementUsingJavaScript(dealingcoldsore);
				scrollDownUsingElement(dealingcoldsore_txt);
				visibilityOf(dealingcoldsore_txt);
				boolean elementIsDisplayed=elementIsDisplayed(dealingcoldsore_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(dealingcoldsore_txt));
				pageLoad();
			}			
			public void clickonColdsoreTingle() throws Exception {	
				waitForPageLoadJava();
				moveToElement(coldsoretingle);
				clickElementUsingJavaScript(coldsoretingle);
				scrollDownUsingElement(coldsoretingle_txt);
				visibilityOf(coldsoretingle_txt);
				boolean elementIsDisplayed=elementIsDisplayed(coldsoretingle_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(coldsoretingle_txt));
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
			public void clickonRelaxationTechniques() throws Exception {	
				waitForPageLoadJava();
				moveToElement(relaxationtechniques);
				clickElementUsingJavaScript(relaxationtechniques);
				scrollDownUsingElement(relaxationtechniques_txt);
				visibilityOf(relaxationtechniques_txt);
				boolean elementIsDisplayed=elementIsDisplayed(relaxationtechniques_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(relaxationtechniques_txt));
				pageLoad();
			}			
			public void clickonManagingyourliphealth() throws Exception {	
				waitForPageLoadJava();
				moveToElement(managingyourliphealth);
				clickElementUsingJavaScript(managingyourliphealth);
				scrollDownUsingElement(managingyourliphealth_txt);
				visibilityOf(managingyourliphealth_txt);
				boolean elementIsDisplayed=elementIsDisplayed(managingyourliphealth_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(managingyourliphealth_txt));
				pageLoad();
			}			
			public void clickonPeroidpregancy() throws Exception {	
				waitForPageLoadJava();
				moveToElement(peroidspregancy);
				clickElementUsingJavaScript(peroidspregancy);
				scrollDownUsingElement(peroidspregancy_txt);
				visibilityOf(peroidspregancy_txt);
				boolean elementIsDisplayed=elementIsDisplayed(peroidspregancy_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(peroidspregancy_txt));
				pageLoad();
			}			
			public void clickonColdsoreconfession() throws Exception {	
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
			public void clickonlipcareliphealthtips() throws Exception {	
				waitForPageLoadJava();
				moveToElement(lipcareliphealth);
				clickElementUsingJavaScript(lipcareliphealth);
				scrollDownUsingElement(lipcareliphealth_txt);
				visibilityOf(lipcareliphealth_txt);
				boolean elementIsDisplayed=elementIsDisplayed(lipcareliphealth_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(lipcareliphealth_txt));
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
