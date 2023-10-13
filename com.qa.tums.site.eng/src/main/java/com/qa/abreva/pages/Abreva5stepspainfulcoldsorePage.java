package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;


public class Abreva5stepspainfulcoldsorePage extends BaseClass{
	
	public Abreva5stepspainfulcoldsorePage() {
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
	
	@FindBy(xpath = "//a[text()='cold sore']")
	private static WebElement coldsore;	
	
	@FindBy(xpath = "//h1[text()='Understanding Cold Sores: Causes, Symptoms, and Treatments']")
	private static WebElement coldsore_txt;	
	
	@FindBy(xpath = "//a[text()='as soon as you feel that familiar tingle.']")
	private static WebElement familartingle;	
	
	@FindBy(xpath = "//h2[text()='NEARLY 50% OF AMERICAN ADULTS HAVE THE VIRUS THAT CAUSES COLD SORES']")
	private static WebElement familartingle_txt;	
	
	@FindBy(xpath = "//a[text()='cold sores are contagious']")
	private static WebElement coldsorecontagious;
	
	@FindBy(xpath = "//h1[text()='How to Prevent Spreading Cold Sores']")
	private static WebElement coldsorecontagious_txt;
	
	@FindBy(xpath = "//u[text()='triggers a cold sore']")
	private static WebElement triggerscoldsore;
	
	@FindBy(xpath = "//h1[text()='Managing Lip Health']")
	private static WebElement triggerscoldsore_txt;
	
	@FindBy(xpath = "//a[text()='5 WAYS TO GET RID OF COLD SORES']")
	private static WebElement RelatedArticle1;
	
	@FindBy(xpath = "//h1[text()='How to Get Rid of a Cold Sore Fast']")
	private static WebElement RelatedArticle1_txt;
	
	@FindBy(xpath = "//a[text()='THE TRUTH ABOUT COLD SORE REMEDIES']")
	private static WebElement RelatedArticle2;
	
	@FindBy(xpath = "//h1[text()='AT-HOME REMEDIES FOR COLD SORES']")
	private static WebElement RelatedArticle2_txt;
	
	@FindBy(xpath = "//a[text()='ABREVA VS. THE COMPETITION']")
	private static WebElement RelatedArticle3;
	
	@FindBy(xpath = "//h1[text()='COMPARE ABREVA VS. OTHER COLD SORE TREATMENTS']")
	private static WebElement RelatedArticle3_txt;
	
	@FindBy(xpath = "//span[text()='GET COUPON']")
	private static WebElement getcoupons;
	
	@FindBy(xpath = "//h1[text()='Where to Buy Abreva']")
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
	public void clickonfamilartingle() throws Exception {	
		waitForPageLoadJava();
		moveToElement(familartingle);
		clickElementUsingJavaScript(familartingle);
		scrollDownUsingElement(familartingle_txt);
		visibilityOf(familartingle_txt);
		boolean elementIsDisplayed=elementIsDisplayed(familartingle_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(familartingle_txt));
		pageLoad();
	}				
	
	public void clickonColdsorescontagious() throws Exception {	
		waitForPageLoadJava();
		moveToElement(coldsorecontagious);
		clickElementUsingJavaScript(coldsorecontagious);
		scrollDownUsingElement(coldsorecontagious_txt);
		visibilityOf(coldsorecontagious_txt);
		boolean elementIsDisplayed=elementIsDisplayed(coldsorecontagious_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(coldsorecontagious_txt));
		pageLoad();
	}				
	public void clickontriggerscoldsore() throws Exception {	
		waitForPageLoadJava();
		moveToElement(triggerscoldsore);
		clickElementUsingJavaScript(triggerscoldsore);
		scrollDownUsingElement(triggerscoldsore_txt);
		visibilityOf(triggerscoldsore_txt);
		boolean elementIsDisplayed=elementIsDisplayed(triggerscoldsore_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(triggerscoldsore_txt));
		pageLoad();
	}				
	
	public void clickonRelatedArticle1() throws Exception {	
		waitForPageLoadJava();
		moveToElement(RelatedArticle1);
		clickElementUsingJavaScript(RelatedArticle1);
		scrollDownUsingElement(RelatedArticle1_txt);
		visibilityOf(RelatedArticle1_txt);
		boolean elementIsDisplayed=elementIsDisplayed(RelatedArticle1_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(RelatedArticle1_txt));
		pageLoad();
	}				
	public void clickonRelatedArticle2() throws Exception {	
		waitForPageLoadJava();
		moveToElement(RelatedArticle2);
		clickElementUsingJavaScript(RelatedArticle2);
		scrollDownUsingElement(RelatedArticle2_txt);
		visibilityOf(RelatedArticle2_txt);
		boolean elementIsDisplayed=elementIsDisplayed(RelatedArticle2_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(RelatedArticle2_txt));
		pageLoad();
	}				
	public void clickonRelatedArticle3() throws Exception {	
		waitForPageLoadJava();
		moveToElement(RelatedArticle3);
		clickElementUsingJavaScript(RelatedArticle3);
		scrollDownUsingElement(RelatedArticle3_txt);
		visibilityOf(RelatedArticle3_txt);
		boolean elementIsDisplayed=elementIsDisplayed(RelatedArticle3_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(RelatedArticle3_txt));
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
