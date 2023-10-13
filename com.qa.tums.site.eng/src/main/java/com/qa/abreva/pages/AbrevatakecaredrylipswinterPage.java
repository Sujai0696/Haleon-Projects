package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevatakecaredrylipswinterPage extends BaseClass{
	
	public AbrevatakecaredrylipswinterPage() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(xpath = "//button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
	private static WebElement cookieClose;
	
	@FindBy(xpath = "//div[@class='navigation component section secondary-nav aria-label-js first odd last initialized']//child::a[text()='ABOUT COLD SORES ']")
	private static WebElement aboutcoldsores;

	@FindBy(xpath = "//h1[text()='What Are Cold Sores?']")
	private static WebElement aboutcoldsores_txt;

	@FindBy(xpath = "//a[text()='HOW COLD SORES SPREAD ']")
	private static WebElement coldsoresspread;

	@FindBy(xpath = "//h1[text()='How to Prevent Spreading Cold Sores']")
	private static WebElement coldsoresspread_txt;

	@FindBy(xpath = "//a[text()='COLD SORE TRIGGERS ']")
	private static WebElement coldsorestriggers;

	@FindBy(xpath = "//h1[text()='What Causes a Cold Sore?']")
	private static WebElement coldsorestriggers_txt;

	@FindBy(xpath = "//a[text()='COLD SORE TREATMENTS ']")
	private static WebElement coldsorestreatment;

	@FindBy(xpath = "//div[@class='richText component section abreva-text treatment-txt first odd']//h1[text()='Treating Cold Sores: Why Choose Abreva?']")
	private static WebElement coldsorestreatment_txt;

	@FindBy(xpath = "//a[text()='COLD SORE MYTHS ']")
	private static WebElement coldsorestmyths;

	@FindBy(xpath = "//div[@class='richText component section abreva-text first odd']//h1[text()='Cold Sore Facts and Myths']")
	private static WebElement coldsorestmyths_txt;

	@FindBy(xpath = "(//a[@href='/about-cold-sores/how-to-take-care-dry-lips-in-winter/'])[1]")
	private static WebElement takecarelips;
	
	@FindBy(xpath = "//h1[text()='How to Take Care of Dry Lips in the Winter']")
	private static WebElement takecarelips_txt;
	
	@FindBy(xpath = "//a[text()='COLD SORES VS. PIMPLES ']")
	private static WebElement coldsorepimple;
	
	@FindBy(xpath = "//h1[text()='Cold Sore vs. Pimple']")
	private static WebElement coldsorepimple_txt;
	
	@FindBy(xpath = "//a[text()='TYPES OF COLD SORE MEDICINE ']")
	private static WebElement typescoldsoremedicine;
	
	@FindBy(xpath = "//h1[text()='Our Guide to Different Types of Cold Sore Medication']")
	private static WebElement typescoldsoremedicine_txt;
	
	@FindBy(xpath = "//a[text()='COLD SORE IN TEENS ']")
	private static WebElement coldsoreteens;
	
	@FindBy(xpath = "//h1[text()='Learn All About Cold Sores in Teen']")
	private static WebElement coldsoreteens_txt;	
		
	@FindBy(xpath = "//a[text()='take better care of your lips']")
	private static WebElement takebettercarelips;	
		
	@FindBy(xpath = "//h1[text()='Lip Care']")
	private static WebElement takebettercarelips_txt;	
	
	@FindBy(xpath = "//a[text()='how to deal with things like cold sores']")
	private static WebElement dealwithcoldsores;	
	
	@FindBy(xpath = "//h1[text()='Dealing with Cold Sores']")
	private static WebElement dealwithcoldsores_txt;	
	
	@FindBy(xpath = "//a[text()='winter']")
	private static WebElement winter;	
	
	@FindBy(xpath = "//h1[text()='Cold Sores From Cold Weather: How to Prevent Winter Cold Sores']")
	private static WebElement winter_txt;
	
	@FindBy(xpath = "//a[text()='cold air and wind can chap your lips']")
	private static WebElement chapyourlips;
	
	@FindBy(xpath = "//h1[text()='Cold Sores From Cold Weather: How to Prevent Winter Cold Sores']")
	private static WebElement chapyourlips_txt;
	
	@FindBy(xpath = "//a[text()='trigger cold sores']")
	private static WebElement triggercoldsores;
	
	@FindBy(xpath = "//h1[text()='Managing Lip Health']")
	private static WebElement triggercoldsores_txt;
	
	@FindBy(xpath = "//a[text()='sun protection']")
	private static WebElement sunprotextion;
	
	@FindBy(xpath = "//h1[text()='The Sun and Cold Sores']")
	private static WebElement sunprotextion_txt;
	
	@FindBy(xpath = "//a[text()='dry lips']")
	private static WebElement drylips;
	
	@FindBy(xpath = "//h1[text()='How to Take Care of Dry Lips in the Winter']")
	private static WebElement drylips_txt;
	
	@FindBy(xpath = "//a[text()='cold sore treatments']")
	private static WebElement coldsoretreatments;
	
	@FindBy(xpath = "//h1[text()='Treating Cold Sores: Why Choose Abreva?']")
	private static WebElement coldsoretreatments_txt;
	
	@FindBy(xpath = "//a[text()='lip health topics']")
	private static WebElement liphealthtopics;
	
	@FindBy(xpath = "//h1[text()='LEARN WHAT TRIGGERS YOUR COLD SORE']")
	private static WebElement liphealthtopics_txt;
	
	@FindBy(xpath = "//a[@href='/cold-sore-products/how-abreva-cream-works/']")
	private static WebElement learnmore;
	
	@FindBy(xpath = "//h1[text()='HOW ABREVA WORKS']")
	private static WebElement learnmore_txt;
	
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
			public void clickonAboutcoldsores() throws Exception {	
				waitForPageLoadJava();
				moveToElement(aboutcoldsores);
				if (isElementPresent(aboutcoldsores)) {
					clickElementUsingJavaScript(aboutcoldsores);
					visibilityOf(aboutcoldsores_txt);
					boolean elementIsDisplayed=elementIsDisplayed(aboutcoldsores_txt);
					Assert.assertTrue(elementIsDisplayed);
					System.out.println(getElementText(aboutcoldsores_txt));
					
				} else {
					throw new Exception("About core sores is not Present on page");
				}
				
			}
			public void clickonColdsoresspread() throws Exception {	
				waitForPageLoadJava();
				moveToElement(coldsoresspread);
				clickElementUsingJavaScript(coldsoresspread);
				visibilityOf(coldsoresspread_txt);
				boolean elementIsDisplayed=elementIsDisplayed(coldsoresspread_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(coldsoresspread_txt));
				pageLoad();
			}
			public void clickonColdsorestriggers() throws Exception {	
				waitForPageLoadJava();
				moveToElement(coldsorestriggers);
				clickElementUsingJavaScript(coldsorestriggers);
				visibilityOf(coldsorestriggers_txt);
				boolean elementIsDisplayed=elementIsDisplayed(coldsorestriggers_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(coldsorestriggers_txt));
				pageLoad();
			}
			public void clickonColdsorestreatment() throws Exception {	
				waitForPageLoadJava();
				moveToElement(coldsorestreatment);
				clickElementUsingJavaScript(coldsorestreatment);
				visibilityOf(coldsorestreatment_txt);
				boolean elementIsDisplayed=elementIsDisplayed(coldsorestreatment_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(coldsorestreatment_txt));
				pageLoad();
			}
			public void clickonColdsoresmyths() throws Exception {	
				waitForPageLoadJava();
				moveToElement(coldsorestmyths);
				clickElementUsingJavaScript(coldsorestmyths);
				visibilityOf(coldsorestmyths_txt);
				boolean elementIsDisplayed=elementIsDisplayed(coldsorestmyths_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(coldsorestmyths_txt));
				pageLoad();
			}
			public void clickontakecarelips() throws Exception {	
				waitForPageLoadJava();
				moveToElement(takecarelips);
				elementToBeClickable(takecarelips);
				//scrollDownUsingElement(takecarelips_txt);
				visibilityOf(takecarelips_txt);
				boolean elementIsDisplayed=elementIsDisplayed(takecarelips_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(takecarelips_txt));
				pageLoad();
			}
			public void clickoncoldsorevspimple() throws Exception {	
				waitForPageLoadJava();
				moveToElement(coldsorepimple);
				clickElementUsingJavaScript(coldsorepimple);
				scrollDownUsingElement(coldsorepimple_txt);
				visibilityOf(coldsorepimple_txt);
				boolean elementIsDisplayed=elementIsDisplayed(coldsorepimple_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(coldsorepimple_txt));
				pageLoad();
			}
			public void clickontypesofcoldsoresmedicine() throws Exception {	
				waitForPageLoadJava();
				moveToElement(typescoldsoremedicine);
				clickElementUsingJavaScript(typescoldsoremedicine);
				scrollDownUsingElement(typescoldsoremedicine_txt);
				visibilityOf(typescoldsoremedicine_txt);
				boolean elementIsDisplayed=elementIsDisplayed(typescoldsoremedicine_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(typescoldsoremedicine_txt));
				pageLoad();
			}
			public void clickonColdsoresteens() throws Exception {	
				waitForPageLoadJava();
				moveToElement(coldsoreteens);
				clickElementUsingJavaScript(coldsoreteens);
				scrollDownUsingElement(coldsoreteens_txt);
				visibilityOf(coldsoreteens_txt);
				boolean elementIsDisplayed=elementIsDisplayed(coldsoreteens_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(coldsoreteens_txt));
				pageLoad();
			}		
			public void clickontakebettercarelips() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(takebettercarelips);
				moveToElement(takebettercarelips);
				clickElementUsingJavaScript(takebettercarelips);
				scrollDownUsingElement(takebettercarelips_txt);
				visibilityOf(takebettercarelips_txt);
				boolean elementIsDisplayed=elementIsDisplayed(takebettercarelips_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(takebettercarelips_txt));
				pageLoad();
			}		
			public void clickonDealingwithcoldsores() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(dealwithcoldsores);
				moveToElement(dealwithcoldsores);
				clickElementUsingJavaScript(dealwithcoldsores);
				scrollDownUsingElement(dealwithcoldsores_txt);
				visibilityOf(dealwithcoldsores_txt);
				boolean elementIsDisplayed=elementIsDisplayed(dealwithcoldsores_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(dealwithcoldsores_txt));
				pageLoad();
			}		
			public void clickonWinter() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(winter);
				moveToElement(winter);
				clickElementUsingJavaScript(winter);
				scrollDownUsingElement(winter_txt);
				visibilityOf(winter_txt);
				boolean elementIsDisplayed=elementIsDisplayed(winter_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(winter_txt));
				pageLoad();
			}		
			public void clickonChapyourlips() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(chapyourlips);
				moveToElement(chapyourlips);
				clickElementUsingJavaScript(chapyourlips);
				scrollDownUsingElement(chapyourlips_txt);
				visibilityOf(chapyourlips_txt);
				boolean elementIsDisplayed=elementIsDisplayed(chapyourlips_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(chapyourlips_txt));
				pageLoad();
			}		
			public void clickonTriggercoldsores() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(triggercoldsores);
				moveToElement(triggercoldsores);
				clickElementUsingJavaScript(triggercoldsores);
				scrollDownUsingElement(triggercoldsores_txt);
				visibilityOf(triggercoldsores_txt);
				boolean elementIsDisplayed=elementIsDisplayed(triggercoldsores_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(triggercoldsores_txt));
				pageLoad();
			}		
			public void clickonSunProtection() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(sunprotextion);
				moveToElement(sunprotextion);
				clickElementUsingJavaScript(sunprotextion);
				scrollDownUsingElement(sunprotextion_txt);
				visibilityOf(sunprotextion_txt);
				boolean elementIsDisplayed=elementIsDisplayed(sunprotextion_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(sunprotextion_txt));
				pageLoad();
			}		
			public void clickonColdsoretreatment() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(coldsorestreatment);
				moveToElement(coldsorestreatment);
				clickElementUsingJavaScript(coldsorestreatment);
				scrollDownUsingElement(coldsorestreatment_txt);
				visibilityOf(coldsorestreatment_txt);
				boolean elementIsDisplayed=elementIsDisplayed(coldsorestreatment_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(coldsorestreatment_txt));
				pageLoad();
			}		
			public void clickonliphealthtopics() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(liphealthtopics);
				moveToElement(liphealthtopics);
				clickElementUsingJavaScript(liphealthtopics);
				scrollDownUsingElement(liphealthtopics_txt);
				visibilityOf(liphealthtopics_txt);
				boolean elementIsDisplayed=elementIsDisplayed(liphealthtopics_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(liphealthtopics_txt));
				pageLoad();
			}		
			public void clickonlearnmore() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(learnmore);
				moveToElement(learnmore);
				clickElementUsingJavaScript(learnmore);
				scrollDownUsingElement(learnmore_txt);
				visibilityOf(learnmore_txt);
				boolean elementIsDisplayed=elementIsDisplayed(learnmore_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(learnmore_txt));
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
