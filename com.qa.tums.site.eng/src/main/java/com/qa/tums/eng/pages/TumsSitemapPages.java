package com.qa.tums.eng.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class TumsSitemapPages extends BaseClass{
	
	public TumsSitemapPages() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()='Accept Cookies']")
    private static WebElement cookieBtn;

    @FindBy(xpath = "//*[@class='onetrust-pc-dark-filter ot-hide ot-fade-in']//self::div[contains(@style,'display: none;')]")
    private static WebElement cookieClose;
    
    @FindBy(xpath = "//li[@class=\"breadcrumb-list-item odd first \"]")
    private static WebElement homebreadcrumbs;
   
	@FindBy(xpath="//li[@class=\"breadcrumb-list-item even last is-current \"]")
    private static WebElement sitemapbreadcrumbs;	
	
	@FindBy(xpath="//a[text()='TUMS Home ']")
    private static WebElement tumshome;	
	
	
	//Heartburn101//
	
	@FindBy(xpath="(//a[text()='Heartburn 101 '])[2]")
    private static WebElement heartburn101;	
	
	@FindBy(xpath="(//a[text()='Symptoms '])[3]")
    private static WebElement symptoms;	
	
	@FindBy(xpath="(//a[text()='Signs of severe heartburn '])[3]")
    private static WebElement signsevereburn;
	
	@FindBy(xpath="(//a[text()='What does heartburn feel like '])[3]")
    private static WebElement heartburnfeellike;
	
	@FindBy(xpath="(//a[@href=\"/about-heartburn/symptoms/heartburn-at-night/\"])[3]")
    private static WebElement heartburnnight;
	
	@FindBy(xpath="(//a[@href=\"/about-heartburn/symptoms/how-to-know-if-you-have-acid-reflux/\"])[3]")
    private static WebElement knowacidreflux;
	
	
	//causes//
	
	@FindBy(xpath="(//a[@href=\"/about-heartburn/causes/\"])[3]")
    private static WebElement causes;
	
	@FindBy(xpath="(//a[@href=\"/about-heartburn/causes/daily-heartburn-triggers/\"])[3]")
    private static WebElement heartburntriggers;
	
	@FindBy(xpath="//a[text()='Seven Surprising Heartburn Facts']")
    private static WebElement sevensurprisingheartburn;
	
	@FindBy(xpath="(//a[text()='Heartburn Causes Checklist '])[3]")
    private static WebElement heartburnchecklist;
	
	@FindBy(xpath="(//a[text()='Acid Reflux vs. GERD '])[3]")
    private static WebElement acidrefluxGERD;
	
	@FindBy(xpath="(//a[text()='Heartburn vs. Indigestion '])[3]")
    private static WebElement heartburnindigestion;
	
	@FindBy(xpath="(//a[text()='Foods That Cause Heartburn '])[3]")
    private static WebElement foodcausesheartburn;
	
	@FindBy(xpath="(//a[@href=\"/about-heartburn/causes/upset-stomach-after-eating/\"])[3]")
    private static WebElement upsetstomach;
	
	@FindBy(xpath="(//a[text()='What is GERD? Symptoms, Treatment and Medication '])")
    private static WebElement symptomstreatment;
	
	//quick heartburn relief//
	
	@FindBy(xpath="(//a[@href=\"/about-heartburn/quick-heartburn-relief/\"])[3]")
    private static WebElement quickhratburnrelief;
	
	@FindBy(xpath="(//a[text()='How to Reduce Heartburn '])[3]")
    private static WebElement reduceheartburn;
	
	@FindBy(xpath="(//a[text()='Indigestion Remedies '])[3]")
    private static WebElement indigestionremedies;
	
	@FindBy(xpath="(//a[text()='Which TUMS Product is Right for Me?'])")
    private static WebElement tumsrightproduct;
	
	@FindBy(xpath="(//a[text()='Gas Relief'])")
    private static WebElement gasrelief;
	
	@FindBy(xpath="//a[text()='Heartburn and Exercise']")
    private static WebElement heartburnexercise;
	
	@FindBy(xpath="//a[text()='Natural Remedies for Heartburn']")
    private static WebElement naturalremediesheartburn;
	
	@FindBy(xpath="//a[text()=' How to Improve Your Gut Health ']")
    private static WebElement improveguthealth;
	
	@FindBy(xpath="//a[text()=' Gut Health Foods: How to Keep Your Gut Happy']")
    private static WebElement guthealthfood;
	
	@FindBy(xpath="(//a[text()='How Tums Work '])[3]")
    private static WebElement howtumwork;
	
	@FindBy(xpath="(//a[text()='Why Antacids Work '])[3]")
    private static WebElement whyantacidwork;
	
	@FindBy(xpath="(//a[text()='Lifestyle Changes to Reduce Heartburn '])[3]")
    private static WebElement lifestylechangesreduceheartburn;
	
	@FindBy(xpath="(//a[text()='Heartburn Diet '])[3]")
    private static WebElement heartburndiet;
	
	@FindBy(xpath="(//a[text()='Heartburn Relief Home Remedies '])[3]")
    private static WebElement heartburnreliefhomeremedies;
	
	@FindBy(xpath="(//a[@href=\"/about-heartburn/quick-heartburn-relief/five-ways-to-relieve-stress/\"])[3]")
    private static WebElement fivewaysrelievestress;
	
	@FindBy(xpath="(//a[text()='Choosing over the counter heartburn medication '])[3]")
    private static WebElement choosingcountermedication;
	
	@FindBy(xpath="//a[text()='Stress and Heartburn ']")
    private static WebElement stressheartburn;
	
	//Tums &Pregancy//
	
	@FindBy(xpath="(//a[text()='TUMS & Pregnancy '])[3]")
    private static WebElement Tumspregancy;
	
	@FindBy(xpath="//a[text()='Remedies for Heartburn During Pregnancy ']")
    private static WebElement remediesheartburnpregancy;
	
	@FindBy(xpath="(//a[@href=\"/about-heartburn/tums-while-pregnant/probiotics-during-pregnancy/\"])[3]")
    private static WebElement probioticduringpregancy;
	
	@FindBy(xpath="(//a[@href=\"/about-heartburn/tums-while-pregnant/pregnancy-heartburn-101/\"])[3]")
    private static WebElement pregancysymptomsheartburn;
	
	@FindBy(xpath="(//a[text()='Foods To Eat During Your Pregnancy '])[3]")
    private static WebElement foodtoeatduringpregancy;
	
	@FindBy(xpath="(//a[text()='What Causes Heartburn During Pregnancy '])[3]")
    private static WebElement causesheartburnduringpregancy;
	
	@FindBy(xpath="(//a[text()='Healthy Pregnancy Tips '])[3]")
    private static WebElement healthypregancytips;
	
	@FindBy(xpath="//a[text()='How One Woman Dealt With Heartburn During Pregnancy ']")
    private static WebElement womendealtpregancy;
	
	@FindBy(xpath="//a[text()='Is Heartburn an Early Pregnancy Sign?']")
    private static WebElement earlypregancysign;
	
	@FindBy(xpath="(//a[text()='About TUMS '])[2]")
    private static WebElement aboutTums;
	
	//Product Selector//
	
	@FindBy(xpath="(//a[text()='Product Selector '])[3]")
    private static WebElement productselector;
	
	@FindBy(xpath="(//a[text()='TUMS Naturals '])[3]")
    private static WebElement tumsnatural;
	
	@FindBy(xpath="(//a[@href=\"/antacid-products/chewy-bites/\"])[3]")
    private static WebElement chewybites;
	
	@FindBy(xpath="(//a[@href=\"/antacid-products/chewy-bites-cooling-sensation/\"])[3]")
    private static WebElement chewybitescoolingsensation;
	
	@FindBy(xpath="(//a[@href=\"/antacid-products/chewy-bites-gas-relief/\"])[3]")
    private static WebElement chewybitesgasrelief;
	
	@FindBy(xpath="(//a[@href=\"/antacid-products/sugar-free/\"])[3]")
    private static WebElement antacidsugarfree;
	
	@FindBy(xpath="(//a[@href=\"/antacid-products/smoothies/\"])[3]")
    private static WebElement antacidsmoothies;
	
	@FindBy(xpath="(//a[@href=\"/antacid-products/chewy-delights/\"])[3]")
    private static WebElement antacidchewydelights;
	
	@FindBy(xpath="(//a[@href=\"/antacid-products/ultra-1000/\"])[3]")
    private static WebElement tumsultra;
	
	@FindBy(xpath="(//a[@href=\"/antacid-products/extra-750/\"])[3]")
    private static WebElement tumsextra;
	
	@FindBy(xpath="(//a[@href=\"/antacid-products/regular/\"])[3]")
    private static WebElement tumsregular;
	
	@FindBy(xpath="//a[text()='Coupons ']")
    private static WebElement coupons;
	
	@FindBy(xpath="(//a[@href=\"/faqs/\"])[2]")
    private static WebElement FAQ;
	
	@FindBy(xpath="//a[text()='Contact Us ']")
    private static WebElement contactus;
	
	@FindBy(xpath="(//a[@href=\"/where-to-buy/\"])[2]")
    private static WebElement wheretobuy;
	
	@FindBy(xpath="(//a[@href=\"/hsa-fsa-eligibility/\"])[1]")
    private static WebElement hsaorfsa;
	
	
	
	
	
	//methods
	
		public void clickCookieBtn() throws Exception {
			
	        if (isElementPresent(cookieBtn)) {
	            elementToBeClickable(cookieBtn);
	            try {
	                if (cookieBtn.isDisplayed()) {
	                    clickElementUsingJavaScript(cookieBtn);
	                }
	              implicitWait();
	              actionClick(cookieClose);
	                Assert.assertTrue(elementIsDisplayed(cookieClose));
	                clickElementUsingJavaScript(cookieClose);
	            } catch (Exception e) {
	            }
	        }else {
	            System.out.println("Dismiss is not presented");
	        }
		}
		public void clickonhomebreadcrumbs() throws Throwable {
			elementClick(homebreadcrumbs);
	}
		
			public void clickonsitemapbreadcrumbs() throws Throwable {
				elementClick(sitemapbreadcrumbs);
		}

			public void clickontumshome() throws Throwable {
				clickElementUsingJavaScript(tumshome);
		}
			public void clickonheartburn101() throws Throwable {
				clickElementUsingJavaScript(heartburn101);
		}
			public void clickonsymptoms() throws Throwable {
				clickElementUsingJavaScript(symptoms);
		}
			public void clickonsignseverburn() throws Throwable {
				clickElementUsingJavaScript(signsevereburn);
		}
			public void clickonheartburnfeellike() throws Throwable {
				clickElementUsingJavaScript(heartburnfeellike);
		}
			public void clickonheartburnnight() throws Throwable {
				clickElementUsingJavaScript(heartburnnight);
		}
			public void clickonknowacidreflux() throws Throwable {
				clickElementUsingJavaScript(knowacidreflux);
		}
			public void clickonheartburntriggers() throws Throwable {
				clickElementUsingJavaScript(heartburntriggers);
		}
			public void clickonsevensurprisingheartburn() throws Throwable {
				clickElementUsingJavaScript(sevensurprisingheartburn);
		}
			public void clickonheartburnshecklist() throws Throwable {
				clickElementUsingJavaScript(heartburnchecklist);
		}
			public void clickonacidrefluxvGERDlist() throws Throwable {
				clickElementUsingJavaScript(acidrefluxGERD);
		}
			public void clickonheartburnindigestionlist() throws Throwable {
				clickElementUsingJavaScript(heartburnindigestion);
		}
			public void clickonfoodcausesheartburn() throws Throwable {
				clickElementUsingJavaScript(foodcausesheartburn);
		}
			public void clickonupsetstomachlist() throws Throwable {
				clickElementUsingJavaScript(upsetstomach);
		}
			public void clickonsymptomstreatmentlist() throws Throwable {
				clickElementUsingJavaScript(symptomstreatment);
		}
			public void clickonquickheartburnrelieflist() throws Throwable {
				clickElementUsingJavaScript(quickhratburnrelief);
		}
			public void clickonreduceheartburnlist() throws Throwable {
				clickElementUsingJavaScript(reduceheartburn);
		}
			public void clickonindigestionremedieslist() throws Throwable {
				clickElementUsingJavaScript(indigestionremedies);
		}
			public void clickonTumsrightproductlist() throws Throwable {
				clickElementUsingJavaScript(tumsrightproduct);
		}
			public void clickongasrelieflist() throws Throwable {
				clickElementUsingJavaScript(gasrelief);
		}
			public void clickonheartburnexerciselist() throws Throwable {
				clickElementUsingJavaScript(heartburnexercise);
		}
			public void clickonnaturalremediesheartburnlist() throws Throwable {
				clickElementUsingJavaScript(naturalremediesheartburn);
		}
			public void clickonimprovesguthealthlist() throws Throwable {
				clickElementUsingJavaScript(improveguthealth);
		}	
			public void clickonguthealthfoodlist() throws Throwable {
				clickElementUsingJavaScript(guthealthfood);
		}	
			public void clickonhowtumworklist() throws Throwable {
				clickElementUsingJavaScript(howtumwork);
		}	
			public void clickonwhyantacidworklist() throws Throwable {
				clickElementUsingJavaScript(whyantacidwork);
		}	
			public void clickonlifestylechangesheartburnlist() throws Throwable {
				clickElementUsingJavaScript(lifestylechangesreduceheartburn);
		}	
			public void clickonheartburndietlist() throws Throwable {
				clickElementUsingJavaScript(heartburndiet);
		}	
			public void clickonheartburnreliefhomeremedieslist() throws Throwable {
				clickElementUsingJavaScript(heartburnreliefhomeremedies);
		}	
			public void clickonfivewaysrelievestresslist() throws Throwable {
				clickElementUsingJavaScript(fivewaysrelievestress);
		}	
			
			public void clickonchoosecounterheartburnmedicationlist() throws Throwable {
				clickElementUsingJavaScript(choosingcountermedication);
		}	
			public void clickonstressheartburnlist() throws Throwable {
				clickElementUsingJavaScript(stressheartburn);
		}	
			public void clickonTumsPregancylist() throws Throwable {
				clickElementUsingJavaScript(Tumspregancy);
		}	
			public void clickonRemediesheartburnduringpregancylist() throws Throwable {
				clickElementUsingJavaScript(remediesheartburnpregancy);
		}	
			public void clickonProbioticduringpregancylist() throws Throwable {
				clickElementUsingJavaScript(probioticduringpregancy);
		}	
			public void clickonPregancysymptomsheartburnlist() throws Throwable {
				clickElementUsingJavaScript(pregancysymptomsheartburn);
		}	
			public void clickonFoodtoeatduringpregancylist() throws Throwable {
				clickElementUsingJavaScript(foodtoeatduringpregancy);
		}	
			
			public void clickonCausesheartburnduringPregancylist() throws Throwable {
				clickElementUsingJavaScript(causesheartburnduringpregancy);
		}	
			public void clickonHealthypregancyTipslist() throws Throwable {
				clickElementUsingJavaScript(healthypregancytips);
		}	
			public void clickonwomendealtpregancylist() throws Throwable {
				clickElementUsingJavaScript(womendealtpregancy);
		}	
			public void clickonearlypregancysignlist() throws Throwable {
				clickElementUsingJavaScript(earlypregancysign);
		}	
			public void clickonaboutTumslist() throws Throwable {
				clickElementUsingJavaScript(aboutTums);
		}	
			public void clickonProductselectorlist() throws Throwable {
				clickElementUsingJavaScript(productselector);
		}	
			public void clickonTumsnaturallist() throws Throwable {
				clickElementUsingJavaScript(tumsnatural);
		}	
			public void clickonChewybiteslist() throws Throwable {
				clickElementUsingJavaScript(chewybites);
		}	
			public void clickonChewybitescoolingsensationlist() throws Throwable {
				clickElementUsingJavaScript(chewybitescoolingsensation);
		}	
			public void clickonChewybitesgasrelieflist() throws Throwable {
				clickElementUsingJavaScript(chewybitesgasrelief);
		}	
			public void clickonAntacidsugarfreelist() throws Throwable {
				clickElementUsingJavaScript(antacidsugarfree);
		}	
			public void clickonAntacidsmoothiesist() throws Throwable {
				clickElementUsingJavaScript(antacidsmoothies);
		}	
			public void clickonAntacidchewydelight() throws Throwable {
				clickElementUsingJavaScript(antacidchewydelights);
		}	
			public void clickonTumsultra() throws Throwable {
				clickElementUsingJavaScript(tumsultra);
		}	
			public void clickonTumsextra() throws Throwable {
				clickElementUsingJavaScript(tumsextra);
		}	
			public void clickonTumsregular() throws Throwable {
				clickElementUsingJavaScript(tumsregular);
		}	
			public void clickoncoupons() throws Throwable {
				clickElementUsingJavaScript(coupons);
		}	
			public void clickonFAQ() throws Throwable {
				clickElementUsingJavaScript(FAQ);
		}	
			public void clickonContactus() throws Throwable {
				clickElementUsingJavaScript(contactus);
		}	
			public void clickonwheretobuy() throws Throwable {
				clickElementUsingJavaScript(wheretobuy);
		}	
			public void clickonhsaorfsa() throws Throwable {
				clickElementUsingJavaScript(hsaorfsa);
		}	
			
			
			
			
			
			
			
}
