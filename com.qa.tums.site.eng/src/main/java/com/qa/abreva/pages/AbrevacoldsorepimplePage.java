package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevacoldsorepimplePage extends BaseClass{
	
	public AbrevacoldsorepimplePage() {
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

	@FindBy(xpath = "//div[@class='richText component section abreva-text first odd']//h1[text()='What Causes a Cold Sore?']")
	private static WebElement coldsorestriggers_txt;

	@FindBy(xpath = "//a[text()='COLD SORE TREATMENTS ']")
	private static WebElement coldsorestreatment;

	@FindBy(xpath = "//div[@class='richText component section abreva-text treatment-txt first odd']//h1[text()='Treating Cold Sores: Why Choose Abreva?']")
	private static WebElement coldsorestreatment_txt;

	@FindBy(xpath = "//a[text()='COLD SORE MYTHS ']")
	private static WebElement coldsorestmyths;

	@FindBy(xpath = "//h1[text()='Cold Sore Facts and Myths']")
	private static WebElement coldsorestmyths_txt;

	@FindBy(xpath = "//a[text()='HOW TO TAKE CARE OF DRY LIPS IN WINTER ']")
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
	
	@FindBy(xpath = "//a[text()='cold sore']")
	private static WebElement coldsore;
	
	@FindBy(xpath = "//h1[text()='What Are Cold Sores?']")
	private static WebElement coldsore_txt;
	
	@FindBy(xpath = "//a[text()='Cold sores can appear as small clusters or patches of fluid-filled blisters']")
	private static WebElement fluidblisters;
	
	@FindBy(xpath = "//h1[text()='Fever Blister Vs. Cold Sore']")
	private static WebElement fluidblisters_txt;
	
	@FindBy(xpath = "//a[text()='potential treatment options']")
	private static WebElement potenialtreatmentoptions;
	
	@FindBy(xpath = "//h1[text()='Treating Cold Sores: Why Choose Abreva?']")
	private static WebElement potenialtreatmentoptions_txt;
	
	@FindBy(xpath = "//a[text()='do not pop or pick']")
	private static WebElement notpoporpick;
	
	@FindBy(xpath = "//h1[text()='How to Prevent Spreading Cold Sores']")
	private static WebElement notpoporpick_txt;
	
	@FindBy(xpath = "(//a[@href='/about-cold-sores/cold-sore-treatments/'])[3]")
	private static WebElement howtotratthem;
	
	@FindBy(xpath = "//h1[text()='Treating Cold Sores: Why Choose Abreva?']")
	private static WebElement howtotratthem_txt;
	
	@FindBy(xpath = "//span[text()='LEARN MORE']")
	private static WebElement learnmore;
	
	@FindBy(xpath = "//h1[text()='HOW ABREVA WORKS']")
	private static WebElement learnmore_txt;
	
	@FindBy(xpath = "//span[text()='BUY NOW']")
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
		clickElementUsingJavaScript(takecarelips);
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
		//scrollDownUsingElement(coldsorepimple_txt);
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
	public void clickonColdsore() throws Exception {	
		waitForPageLoadJava();
		moveToElement(coldsore);
		clickElementUsingJavaScript(coldsore);
		scrollDownUsingElement(coldsore_txt);
		visibilityOf(coldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(coldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(coldsore_txt));
		pageLoad();
	}	
	public void clickonFluidblisters() throws Exception {	
		waitForPageLoadJava();
		moveToElement(fluidblisters);
		clickElementUsingJavaScript(fluidblisters);
		scrollDownUsingElement(fluidblisters_txt);
		visibilityOf(fluidblisters_txt);
		boolean elementIsDisplayed=elementIsDisplayed(fluidblisters_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(fluidblisters_txt));
		pageLoad();
	}	
	public void clickonPotenialtreatmentOptions() throws Exception {	
		waitForPageLoadJava();
		moveToElement(potenialtreatmentoptions);
		clickElementUsingJavaScript(potenialtreatmentoptions);
		scrollDownUsingElement(potenialtreatmentoptions_txt);
		visibilityOf(potenialtreatmentoptions_txt);
		boolean elementIsDisplayed=elementIsDisplayed(potenialtreatmentoptions_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(potenialtreatmentoptions_txt));
		pageLoad();
	}	
	public void clickonnotpoporpick() throws Exception {	
		waitForPageLoadJava();
		moveToElement(notpoporpick);
		clickElementUsingJavaScript(notpoporpick);
		scrollDownUsingElement(notpoporpick_txt);
		visibilityOf(notpoporpick_txt);
		boolean elementIsDisplayed=elementIsDisplayed(notpoporpick_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(notpoporpick_txt));
		pageLoad();
	}	
	public void clickonhowtotreatthem() throws Exception {	
		waitForPageLoadJava();
		moveToElement(howtotratthem);
		clickElementUsingJavaScript(howtotratthem);
		//scrollDownUsingElement(howtotratthem_txt);
		visibilityOf(howtotratthem_txt);
		boolean elementIsDisplayed=elementIsDisplayed(howtotratthem_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(howtotratthem_txt));
		pageLoad();
	}	
	public void clickonlearnmore() throws Exception {	
		waitForPageLoadJava();
		moveToElement(learnmore);
		clickElementUsingJavaScript(learnmore);
		//scrollDownUsingElement(howtotratthem_txt);
		visibilityOf(learnmore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(learnmore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(learnmore_txt));
		pageLoad();
	}	
	public void clickonBuyNow() throws Exception {	
		waitForPageLoadJava();
		moveToElement(buynow);
		clickElementUsingJavaScript(buynow);
		//scrollDownUsingElement(howtotratthem_txt);
		visibilityOf(buynow_txt);
		boolean elementIsDisplayed=elementIsDisplayed(buynow_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(buynow_txt));
		clickElementUsingJavaScript(buynow_close);
		pageLoad();
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
