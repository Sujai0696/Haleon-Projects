package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevatypescoldsoremedicinePage extends BaseClass{
	
	public AbrevatypescoldsoremedicinePage() {
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
	
	@FindBy(xpath = "//a[text()='COLD SORE IN TEENS ']")
	private static WebElement coldsoreteens;
	
	@FindBy(xpath = "//h1[text()='Learn All About Cold Sores in Teen']")
	private static WebElement coldsoreteens_txt;		
	
	@FindBy(xpath = "//a[text()='tingling']")
	private static WebElement tingling;		
	
	@FindBy(xpath = "//h2[text()='NEARLY 50% OF AMERICAN ADULTS HAVE THE VIRUS THAT CAUSES COLD SORES']")
	private static WebElement tingling_txt;		
	
	@FindBy(xpath = "//a[text()='cold sore']")
	private static WebElement coldsore;		
	
	@FindBy(xpath = "//h1[text()='Treating Cold Sores: Why Choose Abreva?']")
	private static WebElement coldsore_txt;	
	
	@FindBy(xpath = "//a[text()='our cream']")
	private static WebElement ourcream;	
	
	@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
	private static WebElement ourcream_txt;	
	
	@FindBy(xpath = "//a[text()='future outbreaks']")
	private static WebElement futureoutbreaks;	
	
	@FindBy(xpath = "//h1[text()='How to Prevent Spreading Cold Sores']")
	private static WebElement futureoutbreaks_txt;	
	
	@FindBy(xpath = "//a[text()='cold sore education']")
	private static WebElement coldsoreeducation;	
	
	@FindBy(xpath = "//h1[text()='What Are Cold Sores?']")
	private static WebElement coldsoreeducation_txt;
	
	@FindBy(xpath = "//a[text()='Abreva newsroom']")
	private static WebElement abrevanewsroom;
	
	@FindBy(xpath = "//h1[text()='Managing Lip Health']")
	private static WebElement abrevanewsroom_txt;
	
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
		elementToBeClickable(typescoldsoremedicine);
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
		clickElementUsingJavaScript(coldsoreteens);
		scrollDownUsingElement(coldsoreteens_txt);
		visibilityOf(coldsoreteens_txt);
		boolean elementIsDisplayed=elementIsDisplayed(coldsoreteens_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(coldsoreteens_txt));
		pageLoad();
	}		
	public void clickonTingling() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(tingling);
		moveToElement(tingling);
		clickElementUsingJavaScript(tingling);
		scrollDownUsingElement(tingling_txt);
		visibilityOf(tingling_txt);
		boolean elementIsDisplayed=elementIsDisplayed(tingling_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(tingling_txt));
		pageLoad();
	}		
	public void clickonColdsore() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(coldsore);
		moveToElement(coldsore);
		clickElementUsingJavaScript(coldsore);
		scrollDownUsingElement(coldsore_txt);
		visibilityOf(coldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(coldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(coldsore_txt));
		pageLoad();
	}		
	
	public void clickonOurCream() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(ourcream);
		moveToElement(ourcream);
		clickElementUsingJavaScript(ourcream);
		scrollDownUsingElement(ourcream_txt);
		visibilityOf(ourcream_txt);
		boolean elementIsDisplayed=elementIsDisplayed(ourcream_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(ourcream_txt));
		pageLoad();
	}		
	public void clickonFutureOutbreaks() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(futureoutbreaks);
		moveToElement(futureoutbreaks);
		clickElementUsingJavaScript(futureoutbreaks);
		scrollDownUsingElement(futureoutbreaks_txt);
		visibilityOf(futureoutbreaks_txt);
		boolean elementIsDisplayed=elementIsDisplayed(futureoutbreaks_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(futureoutbreaks_txt));
		pageLoad();
	}		
	public void clickonColdsoreEducation() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(coldsoreeducation);
		moveToElement(coldsoreeducation);
		clickElementUsingJavaScript(coldsoreeducation);
		scrollDownUsingElement(coldsoreeducation_txt);
		visibilityOf(coldsoreeducation_txt);
		boolean elementIsDisplayed=elementIsDisplayed(coldsoreeducation_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(coldsoreeducation_txt));
		pageLoad();
	}		
	public void clickonAbrevaNewsroom() throws Exception {	
		waitForPageLoadJava();
		scrollDownUsingElement(abrevanewsroom);
		moveToElement(abrevanewsroom);
		clickElementUsingJavaScript(abrevanewsroom);
		scrollDownUsingElement(abrevanewsroom_txt);
		visibilityOf(abrevanewsroom_txt);
		boolean elementIsDisplayed=elementIsDisplayed(abrevanewsroom_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(abrevanewsroom_txt));
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
