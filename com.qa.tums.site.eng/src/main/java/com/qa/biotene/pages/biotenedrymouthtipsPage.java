package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class biotenedrymouthtipsPage extends BaseClass{

	public biotenedrymouthtipsPage() {
		PageFactory.initElements(driver, this);
	}		
	
	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']//self::button[text()='Accept Cookies']")
	private static WebElement cookieBtn;
	
	@FindBy(xpath = "//div[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
	private static WebElement cookieClose;

	@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//child::div[@class='component-content']")
	private static WebElement emailpopup_Close;

	@FindBy(xpath = "//div[@class='box component section close-button first odd alpha']//ancestor::div[@class='component-content']//self::div[@style]")
	private static WebElement email_text;
	
	@FindBy(xpath = "//a[text()='Home']")
	private static WebElement Home_Breadcrumbs;		
		
	@FindBy(xpath = "//a[text()='LIVING WITH DRY MOUTH']")
	private static WebElement livingdrymouth_Breadcrumbs;			
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item odd last is-current ']//a")
	private static WebElement tipsbiotene_breadcrumbs;		
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/proactive-approaches-healthy-aging.html']")
	private static WebElement easytipshealthyAging;	
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/homemade-chicken-broth-recipe.html']")
	private static WebElement makeyourchickenbroth;	
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/relax-and-unwind-healthy-soothing-teas.html']")
	private static WebElement teasRelaxation;	
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/why-you-should-stay-hydrated-benefits-of-water.html']")
	private static WebElement Benefitshydrated;	
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/dehydration-symptoms-you-should-not-ignore.html']")
	private static WebElement dehydrationsymptoms;	
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/alcohol-what-causes-dry-mouth.html']")
	private static WebElement alcholdrymouth;	
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/coffee-dry-mouth-symptoms.html']")
	private static WebElement caffeineworse;	
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/living-with-dry-mouth/dry-mouth-tips/all-day-symptom-relief/']")
	private static WebElement daydoingbetter;	
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/what-living-with-dry-mouth-is-really-like.html']")
	private static WebElement drymouthreallylike;	
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/how-to-thrive-chronic-health-condition.html']")
	private static WebElement tipshealthpriority;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/how-to-make-plane-travel-comfortable.html']")
	private static WebElement plancomfortable;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/pumpkin-pie-recipe-low-sugar-dry-mouth-approved.html']")
	private static WebElement pumpkinreciepe;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/healthy-infused-water-recipes.html']")
	private static WebElement infusedwaterreciepes;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/healthy-soup-recipes-for-fall.html']")
	private static WebElement soupreciepes;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/benefits-of-coconut-water-for-dry-mouth.html']")
	private static WebElement cocunutwater;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/hydration-summer-fruits.html']")
	private static WebElement hydratingsummerfruits;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/dry-mouth-friendly-picnic-food.html']")
	private static WebElement Picnicfood;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/road-trip-tips-dry-mouth.html']")
	private static WebElement drymouthroad;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/things-that-should-be-on-your-healthy-holiday-packing-list.html']")
	private static WebElement healthyholiday_packing;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/mood-boost-benefits-of-walking.html']")
	private static WebElement benefits_walking;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/amp/living-with-dry-mouth/dry-mouth-tips/how-to-become-self-health-care-advocate.html']")
	private static WebElement becomeadvocate;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/living-with-dry-mouth/dry-mouth-tips/traveling-dry-mouth-relief/']")
	private static WebElement vacationsummer;
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/living-with-dry-mouth/dry-mouth-tips/dry-mouth-tips-beach-day/']")
	private static WebElement beachbettersummer;
	
	
	@FindBy(xpath = "//div[@class='richText component section home-causes-text even last']//child::a[@href='/living-with-dry-mouth/dry-mouth-tips/dry-mouth-relief-tips/']")
	private static WebElement betterthisyear;
	
	@FindBy(xpath = "(//div[@class='richText component section home-causes-text even last']//child::span[text()='LEARN MORE'])[19]")
	private static WebElement Symptomsmissing;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
		public void clickonEmailBtn() throws Exception {	
		waitForPageLoadJava();
		if(isElementPresent(email_text)) {
			elementToBeClickable(email_text);
			try {
				if(email_text.isDisplayed()) {
					clickElementUsingJavaScript(email_text);
				}
				implicitWait();
				visibilityOf(emailpopup_Close);
				Assert.assertTrue(elementIsDisplayed(emailpopup_Close));
			}
			catch (Exception e) {
				
			}
		}else {
			System.out.println("Email Pop-Up is not presented");
			throw new Exception("Unable to click on Email Pop-up");
		}
		}
		
		public void clickonHomeBreadcrumbs() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(Home_Breadcrumbs);
			pageLoad();
		}
		public void clickonlivingdrymouthBreadcrumbs() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(livingdrymouth_Breadcrumbs);
			pageLoad();
		}
		public void clickonTipsbioteneBreadcrumbs() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(tipsbiotene_breadcrumbs);
			pageLoad();
		}
		public void clickonEastTipsHealthyAging() throws Exception {	
			waitForPageLoadJava();
			clickElementUsingJavaScript(easytipshealthyAging);
			pageLoad();
		}
		public void clickonmakechickenbroth() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(makeyourchickenbroth);
			clickElementUsingJavaScript(makeyourchickenbroth);
			pageLoad();
		}
		public void clickonTeasRelaxtion() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(teasRelaxation);
			clickElementUsingJavaScript(teasRelaxation);
			pageLoad();
		}
		public void clickonBenfitsHydrated() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Benefitshydrated);
			clickElementUsingJavaScript(Benefitshydrated);
			pageLoad();
		}
		public void clickonDehydrationSymptoms() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(dehydrationsymptoms);
			clickElementUsingJavaScript(dehydrationsymptoms);
			pageLoad();
		}
		public void clickonAlcholdrymouth() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(alcholdrymouth);
			clickElementUsingJavaScript(alcholdrymouth);
			pageLoad();
		}
		public void clickonCaffenieworks() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(caffeineworse);
			clickElementUsingJavaScript(caffeineworse);
			pageLoad();
		}
		public void clickonDaydoingbetter() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(daydoingbetter);
			clickElementUsingJavaScript(daydoingbetter);
			pageLoad();
		}
		public void clickondrymouthreallylike() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(drymouthreallylike);
			clickElementUsingJavaScript(drymouthreallylike);
			pageLoad();
		}
		public void clickonTipsHealthPriority() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(tipshealthpriority);
			clickElementUsingJavaScript(tipshealthpriority);
			pageLoad();
		}
		public void clickonplancomfortable() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(plancomfortable);
			clickElementUsingJavaScript(plancomfortable);
			pageLoad();
		}
	
		public void clickonpumpkinReceipe() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(pumpkinreciepe);
			clickElementUsingJavaScript(pumpkinreciepe);
			pageLoad();
		}
		public void clickonInfusedWaterReceipe() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(infusedwaterreciepes);
			clickElementUsingJavaScript(infusedwaterreciepes);
			pageLoad();
		}
		public void clickonFallInspiredsoupReceipe() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(soupreciepes);
			clickElementUsingJavaScript(soupreciepes);
			pageLoad();
		}
		public void clickonCocunutwater() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(cocunutwater);
			clickElementUsingJavaScript(cocunutwater);
			pageLoad();
		}
		public void clickonHydratingsummerfruits() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(hydratingsummerfruits);
			clickElementUsingJavaScript(hydratingsummerfruits);
			pageLoad();
		}
		public void clickonPicnicFood() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Picnicfood);
			clickElementUsingJavaScript(Picnicfood);
			pageLoad();
		}
		public void clickonDryMouthRoad() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(drymouthroad);
			clickElementUsingJavaScript(drymouthroad);
			pageLoad();
		}
		public void clickonHealthypackingList() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(healthyholiday_packing);
			clickElementUsingJavaScript(healthyholiday_packing);
			pageLoad();
		}
		public void clickonBenefitswalking() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(benefits_walking);
			clickElementUsingJavaScript(benefits_walking);
			pageLoad();
		}
		public void clickonbecomeAdvocate() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(becomeadvocate);
			clickElementUsingJavaScript(becomeadvocate);
			pageLoad();
		}
		public void clickonVacationSummer() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(vacationsummer);
			clickElementUsingJavaScript(vacationsummer);
			pageLoad();
		}
		public void clickonbeachbetterSummer() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(beachbettersummer);
			clickElementUsingJavaScript(beachbettersummer);
			pageLoad();
		}
		public void clickonBetterthisYear() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(betterthisyear);
			clickElementUsingJavaScript(betterthisyear);
			pageLoad();
		}
		public void clickonSymptomsmissing() throws Exception {	
			waitForPageLoadJava();
			scrollDownUsingElement(Symptomsmissing);
			clickElementUsingJavaScript(Symptomsmissing);
			pageLoad();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	

}
