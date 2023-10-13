package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevavsCompetitorsPage extends BaseClass{
	
	public AbrevavsCompetitorsPage() {
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
	
	@FindBy(xpath = "//a[text()='Lip Care']")
	private static WebElement lipcare1;		
	
	@FindBy(xpath = "//h1[text()='Lip Care']")
	private static WebElement lipcare1_txt;				
	
	@FindBy(xpath = "//a[text()='Other cold sore treatments']")
	private static WebElement othercoldsoretreatments;				
	
	@FindBy(xpath = "//h1[text()='Treating Cold Sores: Why Choose Abreva?']")
	private static WebElement othercoldsoretreatments_txt;				
	
	@FindBy(xpath = "//a[text()='FIND YOUR SPOT IN THE SHADE']")
	private static WebElement RelatedArticle1;	
	
	@FindBy(xpath = "//h1[text()='The Sun and Cold Sores']")
	private static WebElement RelatedArticle1_txt;	
	
	@FindBy(xpath = "//a[text()='THE TRUTH ABOUT COLD SORE REMEDIES']")
	private static WebElement RelatedArticle2;	
	
	@FindBy(xpath = "//h1[text()='AT-HOME REMEDIES FOR COLD SORES']")
	private static WebElement RelatedArticle2_txt;	
	
	@FindBy(xpath = "//a[text()='LYSINE AND COLD SORES']")
	private static WebElement RelatedArticle3;	
	
	@FindBy(xpath = "//h1[text()='LYSINE FOR COLD SORE TREATMENT']")
	private static WebElement RelatedArticle3_txt;	
	
	@FindBy(xpath = "//span[text()='TAKE THE QUIZ']")
	private static WebElement takequiz;	
	
	@FindBy(xpath = "//h1[text()='What Causes a Cold Sore?']")
	private static WebElement takequiz_txt;	
	
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
	public void clickonothercoldsoretreatment() throws Exception {	
		waitForPageLoadJava();
		moveToElement(othercoldsoretreatments);
		clickElementUsingJavaScript(othercoldsoretreatments);
		scrollDownUsingElement(othercoldsoretreatments_txt);
		visibilityOf(othercoldsoretreatments_txt);
		boolean elementIsDisplayed=elementIsDisplayed(othercoldsoretreatments_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(othercoldsoretreatments_txt));
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
	public void clickonTakequiz() throws Exception {	
		waitForPageLoadJava();
		moveToElement(takequiz);
		clickElementUsingJavaScript(takequiz);
		scrollDownUsingElement(takequiz_txt);
		visibilityOf(takequiz_txt);
		boolean elementIsDisplayed=elementIsDisplayed(takequiz_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(takequiz_txt));
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
