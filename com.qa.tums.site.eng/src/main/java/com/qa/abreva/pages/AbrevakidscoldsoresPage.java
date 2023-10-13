package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevakidscoldsoresPage extends BaseClass{
	
	public AbrevakidscoldsoresPage() {
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

	@FindBy(xpath = "//a[text()='HOW TO TAKE CARE OF DRY LIPS IN WINTER ']")
	private static WebElement takecarelips;
	
	@FindBy(xpath = "//h1[text()='How to Take Care of Dry Lips in the Winter']")
	private static WebElement takecarelips_txt;
	
	@FindBy(xpath = "//a[text()='COLD SORES VS. PIMPLES ']")
	private static WebElement coldsorepimple;
	
	@FindBy(xpath = "//h1[text()='Cold Sore vs. Pimple']")
	private static WebElement coldsorepimple_txt;
	
	@FindBy(xpath = "//a[@href='/about-cold-sores/types-of-cold-sore-medicine/']")
	private static WebElement typescoldsoremedicine;
	
	@FindBy(xpath = "//h1[text()='Our Guide to Different Types of Cold Sore Medication']")
	private static WebElement typescoldsoremedicine_txt;
	
	@FindBy(xpath = "//a[@href='/about-cold-sores/kids-cold-sores/']")
	private static WebElement coldsoreteens;
	
	@FindBy(xpath = "//h1[text()='Learn All About Cold Sores in Teen']")
	private static WebElement coldsoreteens_txt;		
	
	@FindBy(xpath = "//a[text()='treatment options']")
	private static WebElement treatmentoptions;		
	
	@FindBy(xpath = "//h1[text()='Treating Cold Sores: Why Choose Abreva?']")
	private static WebElement treatmentoptions_txt;		
	
	@FindBy(xpath = "//a[text()='fever']")
	private static WebElement fever;	
	
	@FindBy(xpath = "//h1[text()='Fever Blister Vs. Cold Sore']")
	private static WebElement fever_txt;	
	
	@FindBy(xpath = "//a[text()='Sunlight']")
	private static WebElement sunlight;	
	
	@FindBy(xpath = "//h1[text()='The Sun and Cold Sores']")
	private static WebElement sunlight_txt;	
	
	@FindBy(xpath = "//a[text()='Cold weather']")
	private static WebElement coldweather;	
	
	@FindBy(xpath = "//h1[text()='Cold Sores From Cold Weather: How to Prevent Winter Cold Sores']")
	private static WebElement coldweather_txt;	
	
	@FindBy(xpath = "//a[text()='Stress']")
	private static WebElement stress;	
	
	@FindBy(xpath = "//h1[text()='Pump Up Your Brain: Ways to Relieve Stress']")
	private static WebElement stress_txt;	
	
	@FindBy(xpath = "//a[text()='cold sores are spread through direct contact with another person']")
	private static WebElement coldsoresperson;	
	
	@FindBy(xpath = "//h1[text()='How to Prevent Spreading Cold Sores']")
	private static WebElement coldsoresperson_txt;
	
	@FindBy(xpath = "//a[text()='signs and symptoms']")
	private static WebElement signsymptoms;
	
	@FindBy(xpath = "//h1[text()='What Are Cold Sores?']")
	private static WebElement signsymptoms_txt;
	
	@FindBy(xpath = "//a[text()='causes']")
	private static WebElement causes;
	
	@FindBy(xpath = "//h1[text()='What Causes a Cold Sore?']")
	private static WebElement causes_txt;
	
	@FindBy(xpath = "//a[text()='myths and facts']")
	private static WebElement mythsfacts;
	
	@FindBy(xpath = "//h1[text()='Cold Sore Facts and Myths']")
	private static WebElement mythsfacts_txt;
	
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
			actionClick(takecarelips);
			scrollDownUsingElement(takecarelips_txt);
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
			actionClick(typescoldsoremedicine);
			//scrollDownUsingElement(typescoldsoremedicine_txt);
			visibilityOf(typescoldsoremedicine_txt);
			boolean elementIsDisplayed=elementIsDisplayed(typescoldsoremedicine_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(typescoldsoremedicine_txt));
			pageLoad();
		}
		public void clickonColdsoresteens() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsoreteens);
			elementToBeClickable(coldsoreteens);
		//	scrollDownUsingElement(coldsoreteens_txt);
			visibilityOf(coldsoreteens_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsoreteens_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsoreteens_txt));
			pageLoad();
		}		
		public void clickonTreatmentOptions() throws Exception {	
			waitForPageLoadJava();
			moveToElement(treatmentoptions);
			clickElementUsingJavaScript(treatmentoptions);
			scrollDownUsingElement(treatmentoptions_txt);
			visibilityOf(treatmentoptions_txt);
			boolean elementIsDisplayed=elementIsDisplayed(treatmentoptions_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(treatmentoptions_txt));
			pageLoad();
		}		
		public void clickonFever() throws Exception {	
			waitForPageLoadJava();
			moveToElement(fever);
			clickElementUsingJavaScript(fever);
			scrollDownUsingElement(fever_txt);
			visibilityOf(fever_txt);
			boolean elementIsDisplayed=elementIsDisplayed(fever_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(fever_txt));
			pageLoad();
		}		
		public void clickonSunlight() throws Exception {	
			waitForPageLoadJava();
			moveToElement(sunlight);
			clickElementUsingJavaScript(sunlight);
			scrollDownUsingElement(sunlight_txt);
			visibilityOf(sunlight_txt);
			boolean elementIsDisplayed=elementIsDisplayed(sunlight_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(sunlight_txt));
			pageLoad();
		}		
	
		public void clickonColdweather() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldweather);
			clickElementUsingJavaScript(coldweather);
			scrollDownUsingElement(coldweather_txt);
			visibilityOf(coldweather_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldweather_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldweather_txt));
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
		public void clickonColdsoreperson() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsoresperson);
			clickElementUsingJavaScript(coldsoresperson);
			scrollDownUsingElement(coldsoresperson_txt);
			visibilityOf(coldsoresperson_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsoresperson_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsoresperson_txt));
			pageLoad();
		}		
		public void clickonSignsymptoms() throws Exception {	
			waitForPageLoadJava();
			moveToElement(signsymptoms);
			clickElementUsingJavaScript(signsymptoms);
			scrollDownUsingElement(signsymptoms_txt);
			visibilityOf(signsymptoms_txt);
			boolean elementIsDisplayed=elementIsDisplayed(signsymptoms_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(signsymptoms_txt));
			pageLoad();
		}		
		public void clickonCauses() throws Exception {	
			waitForPageLoadJava();
			moveToElement(causes);
			clickElementUsingJavaScript(causes);
			scrollDownUsingElement(causes_txt);
			visibilityOf(causes_txt);
			boolean elementIsDisplayed=elementIsDisplayed(causes_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(causes_txt));
			pageLoad();
		}		
		public void clickonMythfacts() throws Exception {	
			waitForPageLoadJava();
			moveToElement(mythsfacts);
			clickElementUsingJavaScript(mythsfacts);
			scrollDownUsingElement(mythsfacts_txt);
			visibilityOf(mythsfacts_txt);
			boolean elementIsDisplayed=elementIsDisplayed(mythsfacts_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(mythsfacts_txt));
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
				actionClick(BuyNow);
				
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
