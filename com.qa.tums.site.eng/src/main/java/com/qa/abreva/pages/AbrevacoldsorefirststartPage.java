package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevacoldsorefirststartPage extends BaseClass{
	
	public AbrevacoldsorefirststartPage() {
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
	private static WebElement dealingcoldsores;
	
	@FindBy(xpath = "//h1[text()='Dealing with Cold Sores']")
	private static WebElement dealingcoldsores_txt;
	
	
	@FindBy(xpath = "//a[text()='exercising']")
	private static WebElement exercising;
	
	@FindBy(xpath = "//h1[text()='Cold Sores and Exercise']")
	private static WebElement exercising_txt;
	
	@FindBy(xpath = "//a[text()='relaxation techniques']")
	private static WebElement relaxationtechniques;
	
	@FindBy(xpath = "//h1[text()='Take It Easy: Relaxation Techniques']")
	private static WebElement relaxationtechniques_txt;
	
	@FindBy(xpath = "//a[text()='manage your triggers']")
	private static WebElement managetriggers;
	
	@FindBy(xpath = "//h1[text()='Managing Lip Health']")
	private static WebElement managetriggers_txt;
	
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
	public void clickonDealingcoldsores() throws Exception {	
		waitForPageLoadJava();
		moveToElement(dealingcoldsores);
		clickElementUsingJavaScript(dealingcoldsores);
		scrollDownUsingElement(dealingcoldsores_txt);
		visibilityOf(dealingcoldsores_txt);
		boolean elementIsDisplayed=elementIsDisplayed(dealingcoldsores_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(dealingcoldsores_txt));
		pageLoad();
	}				
	public void clickonExercising() throws Exception {	
		waitForPageLoadJava();
		moveToElement(exercising);
		clickElementUsingJavaScript(exercising);
		scrollDownUsingElement(exercising_txt);
		visibilityOf(exercising_txt);
		boolean elementIsDisplayed=elementIsDisplayed(exercising_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(exercising_txt));
		pageLoad();
	}				
	public void clickonRelaxationTechniques() throws Exception {	
		waitForPageLoadJava();
		moveToElement(relaxationtechniques);
		clickElementUsingJavaScript(relaxationtechniques);
		//scrollDownUsingElement(relaxationtechniques_txt);
		visibilityOf(relaxationtechniques_txt);
		boolean elementIsDisplayed=elementIsDisplayed(relaxationtechniques_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(relaxationtechniques_txt));
		pageLoad();
	}				
	public void clickonManageTriggers() throws Exception {	
		waitForPageLoadJava();
		moveToElement(managetriggers);
		clickElementUsingJavaScript(managetriggers);
		scrollDownUsingElement(managetriggers_txt);
		visibilityOf(managetriggers_txt);
		boolean elementIsDisplayed=elementIsDisplayed(managetriggers_txt);
		Assert.assertTrue(elementIsDisplayed);
		System.out.println(getElementText(managetriggers_txt));
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
