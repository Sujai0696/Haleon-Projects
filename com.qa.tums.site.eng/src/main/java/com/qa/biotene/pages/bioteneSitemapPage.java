package com.qa.biotene.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class bioteneSitemapPage extends BaseClass{
	
	public bioteneSitemapPage() {
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
	
	@FindBy(xpath = "//li[@class='breadcrumb-list-item even last is-current ']")
	private static WebElement sitemap_Breadcrumbs;		
	
	@FindBy(xpath = "//a[text()='Biotène #1 Dentist Recommended Dry Mouth Brand ']")
	private static WebElement biotenedentist_recommended;	
	
	@FindBy(xpath = "//span[text()='The #1 Dry Mouth brand trusted by dentists']")
	private static WebElement biotenedentist_recommended_txt;	
	
	@FindBy(xpath = "//a[text()='What Is Dry Mouth (Xerostomia) and How to Manage It ']")
	private static WebElement whatisdrymouth;
	
	@FindBy(xpath = "//a[text()='Medications that Cause Dry Mouth & Relief Options ']")
	private static WebElement mediationreliefoptions;
	
	@FindBy(xpath = "//a[text()='Cottonmouth Causes | Biotène']")
	private static WebElement cottonmouth_causes;
	
	@FindBy(xpath = "//a[text()='What Is Dry Mouth (Xerostomia) and How to Recognize It ']")
	private static WebElement whatisdrymouth_recognizeit;
	
	@FindBy(xpath = "//a[text()=' Medications that Can Cause Xerostomia (Dry Mouth)']")
	private static WebElement medicationcauseXerostomia;
	
	@FindBy(xpath = "//a[text()='Dry Mouth (Xerostomia) Causes: Sjögren’s Syndrome ']")
	private static WebElement sjogrensyndrome;
	
	@FindBy(xpath = "//a[text()='Dry Mouth (Xerostomia) Causes: Scleroderma ']")
	private static WebElement scleroderma;
	
	@FindBy(xpath = "//a[text()='Dry Mouth (Xerostomia) Causes: Diabetes Mellitus ']")
	private static WebElement Diabetesmellitus;
	
	@FindBy(xpath = "//ul[@class='navigation-root navigation-branch navigation-level2']//a[@href='/what-is-dry-mouth/parkinsons-disease/']")
	private static WebElement parkinsondisease;
	
	@FindBy(xpath = "//a[text()='Dry Mouth (Xerostomia) Symptoms and Relief ']")
	private static WebElement symptomsrelief;
	
	@FindBy(xpath = "//a[text()='Effects Of Dry Mouth (Xerostomia) On Oral Health | Biotène®']")
	private static WebElement effectsoralhealth;
	
	@FindBy(xpath = "//a[text()='Best Remedies for Dry Mouth Symptoms, Relief and Care ']")
	private static WebElement symptomsreliefcare;
	
	@FindBy(xpath = "//a[text()='Understanding Dry Mouth (Xerostomia) Causes & Relief Options ']")
	private static WebElement understaindingreliefoptions;
	
	@FindBy(xpath = "//a[text()='How Dry Mouth (Xerostomia) Is Diagnosed By a Health Professional ']")
	private static WebElement diagnossiedhealthprofesstional;
	
	@FindBy(xpath = "//a[text()='What Is Saliva? ']")
	private static WebElement whatissalvia;
	
	@FindBy(xpath = "//a[text()='Natural Remedies for Dry Mouth']")
	private static WebElement naturalremedies;
	
	@FindBy(xpath = "//a[text()='Foods That Can Help Dry Mouth']")
	private static WebElement foodhelpdrymouth;
	
	@FindBy(xpath = "//a[text()='Dry Mouth Products: Oral Rinse, Spray & Gel | Biotène ']")
	private static WebElement foodhelpdrymouthdrymouthproducts;
	
	@FindBy(xpath = "//a[text()='Mouth Rinse/ Mouthwash']")
	private static WebElement mouthrinsemouthwash;
	
	@FindBy(xpath = "//a[text()='Fresh Mint Original Fluoride Toothpaste| Biotène ']")
	private static WebElement freshmintoriginal;
	
	@FindBy(xpath = "//a[text()='Gentle Mint Fluoride Toothpaste | Biotène ']")
	private static WebElement gentlemintfluriode;
	
	@FindBy(xpath = "//a[text()='Alcohol-Free Moisturizing Mouth Spray | Biotène ']")
	private static WebElement alcholfreemoisturizing;
	
	@FindBy(xpath = "//a[text()='Oralbalance Moisturizing Gel for Dry Mouth Symptoms | Biotène ']")
	private static WebElement oralbalancemoisturizing;
	
	@FindBy(xpath = "//a[text()='Dry Mouth Gentle Oral Rinse (Mouthwash) | Biotène ']")
	private static WebElement biotenedrymouth;
	
	@FindBy(xpath = "//a[text()='Biotène Sugar-Free Dry Mouth Lozenges | Biotène ']")
	private static WebElement biotenesugarfreelozenges;
	
	@FindBy(xpath = "//a[text()='Alcohol-Free Oral Rinse (Mouthwash) for Dry Mouth']")
	private static WebElement alcholfreeoralrinse;
	
	@FindBy(xpath = "(//a[@href='/dry-mouth-products/fresh-mint-toothpaste/writeareview/'])[2]")
	private static WebElement writeReview1;
	
	@FindBy(xpath = "(//a[@href='/dry-mouth-products/gentle-toothpaste/writeareview/'])[2]")
	private static WebElement writeReview2;
	
	@FindBy(xpath = "(//a[@href='/dry-mouth-products/moisturizing-mouth-spray/writeareview/'])[2]")
	private static WebElement writeReview3;
	
	@FindBy(xpath = "(//a[@href='/dry-mouth-products/moisturizing-gel/writeareview/'])[2]")
	private static WebElement writeReview4;
	
	@FindBy(xpath = "(//a[@href='/dry-mouth-products/gentle-oral-rinse/writeareview/'])[2]")
	private static WebElement writeReview5;
	
	@FindBy(xpath = "(//a[@href='/dry-mouth-products/lozenges/writeareview/'])[2]")
	private static WebElement writeReview6;
	
	@FindBy(xpath = "//a[text()='Living a Full Life While Managing Dry Mouth ']")
	private static WebElement livingfulllife;
	
	@FindBy(xpath = "//a[text()='Finding Relief and Remedies for Dry Mouth ']")
	private static WebElement reliefremediesdrymouth;
	
	@FindBy(xpath = "//a[text()='Mouthwash for Bad Breath']")
	private static WebElement mouthwashbadbreathe;
	
	@FindBy(xpath = "//a[text()='Why Is Do I Have Dry Mouth After Drinking Water? ']")
	private static WebElement drymouthafterdrinkingwater;
	
	@FindBy(xpath = "//a[text()='How to Relieve Dry Mouth Symptoms at Night ']")
	private static WebElement drymouthsymptomsnight;
	
	@FindBy(xpath = "//a[text()='Beat Your Dry Mouth Symptoms on Labor Day ']")
	private static WebElement drymouthsymptomslaborday;
	
	@FindBy(xpath = "(//a[@href='/living-with-dry-mouth/dry-mouth-tips/'])[2]")
	private static WebElement handytipslearning;
	
	@FindBy(xpath = "//a[text()='How to Get Relief from Dry Mouth Symptoms ']")
	private static WebElement getreieffromsymptoms;
	
	@FindBy(xpath = "//a[text()='All Day Dry Mouth Symptom Relief | Biotène®']")
	private static WebElement Alldaydrymouthsymptoms;
	
	@FindBy(xpath = "//a[text()='Dry Mouth Symptoms Relief While Traveling ']")
	private static WebElement symptomswhileTraveling;
	
	@FindBy(xpath = "//a[text()='What to Pack in Your Beach Bag to Relieve Dry Mouth ']")
	private static WebElement beachbagrelievedrymouth;
	
	@FindBy(xpath = "//a[text()='Understanding the Link Between Cancer Treatment and Dry Mouth ']")
	private static WebElement understandinglinkbetweencancer;
	
	@FindBy(xpath = "//a[text()='Managing Diabetes and Dry Mouth: A Guide ']")
	private static WebElement ManagingDiabietes;
	
	@FindBy(xpath = "//a[text()='Asthma, Respiratory Allergies and Dry Mouth ']")
	private static WebElement AsthmaRespiratory;
	
	@FindBy(xpath = "//a[text()='The Link Between Dry Mouth and Medications ']")
	private static WebElement drymouthmedications;
	
	@FindBy(xpath = "//a[text()='About Dry Mouth: A Resource for Caregivers ']")
	private static WebElement caregivers;
	
	@FindBy(xpath = "(//a[text()='Quiz: Does Your Loved One Have Dry Mouth? '])[2]")
	private static WebElement quizlovedones;
	
	@FindBy(xpath = "(//a[text()='Managing Symptoms and Causes of Dry Mouth at Night '])[2]")
	private static WebElement ManagingSymptomsNight;
	
	@FindBy(xpath = "//a[text()='How to Use Mouthwash']")
	private static WebElement howtousemouthwash;
	
	@FindBy(xpath = "//a[text()='Why Your Dry Mouth and Throat Might Be Related']")
	private static WebElement drymouthandThroatRelated;
	
	@FindBy(xpath = "//a[text()='Do I Have Dry Mouth? Take the Quiz to Find Out. ']")
	private static WebElement doihavedrymouth;
	
	@FindBy(xpath = "//a[text()='Buy #1 Dentist Recommended Dry Mouth Products | Biotène ']")
	private static WebElement DentistRecommendedProducts;
	
	@FindBy(xpath = "//a[text()='Contact Us About Our Dry Mouth Products | Biotène ']")
	private static WebElement ContactUsDrymouthProducts;
	
	@FindBy(xpath = "//a[text()='Frequently Asked Questions About Dry Mouth ']")
	private static WebElement frequentlyaskedquestions;
	
	@FindBy(xpath = "//a[text()='Biotène Sitemap, Articles and Important Links ']")
	private static WebElement BioteneSitemapArticles;
	
	@FindBy(xpath = "//a[text()='Save Now with Biotène Product Coupons that Help Dry Mouth ']")
	private static WebElement savenowwithbioteneproductshelp;
	
	@FindBy(xpath = "//a[text()='sitemap']")
	private static WebElement sitemap;
	
	@FindBy(xpath = "//a[text()='Using My FSA or HSA to Purchase Biotène']")
	private static WebElement usingFSAHSA;
	
	@FindBy(xpath = "//a[text()='Thank you Biotène ']")
	private static WebElement thankyouBiotene;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod first odd grid_4 alpha']//child::a[text()='TAKE THE QUIZ']")
	private static WebElement takequiz;
	
	@FindBy(xpath = "//h1[text()='Take the Dry Mouth Self-Assessment Test']")
	private static WebElement takequiz_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod even grid_4']//child::a[text()='GET COUPONS']")
	private static WebElement getcoupons;
	
	@FindBy(xpath = "//h1[text()='Save Now on Biotène Products']")
	private static WebElement getcoupons_txt;
	
	@FindBy(xpath = "//div[@class='richText component section footer-pod odd last grid_4 omega']//child::a[text()='SHOP NOW']")
	private static WebElement shopnow;
	
	@FindBy(xpath = "//div[@class='richText component section banner_text_buynow wdm-banner-img first odd last grid_12 alpha omega']//h1")
	private static WebElement shopnow_txt;
	
	
	
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
			public void clickonSitemapBreadcrumbs() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(sitemap_Breadcrumbs);
				pageLoad();
			}
			public void clickonbiodentistrecommended() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(biotenedentist_recommended);
				pageLoad();
			}
			public void clickonwhatisdrymouth() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(whatisdrymouth);
				pageLoad();
			}
			public void clickonmediationcausesRelief() throws Exception {	
				waitForPageLoadJava();
				clickElementUsingJavaScript(mediationreliefoptions);
				pageLoad();
			}
			public void clickoncottonmouth_causes() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(cottonmouth_causes);
				clickElementUsingJavaScript(cottonmouth_causes);
				pageLoad();
			}
			public void clickondrymouthrecognize() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(whatisdrymouth_recognizeit);
				clickElementUsingJavaScript(whatisdrymouth_recognizeit);
				pageLoad();
			}
			public void clickonmedicationxerostomia() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(medicationcauseXerostomia);
				clickElementUsingJavaScript(medicationcauseXerostomia);
				pageLoad();
			}
			public void clickonsjogrenesyndrome() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(sjogrensyndrome);
				clickElementUsingJavaScript(sjogrensyndrome);
				pageLoad();
			}
			public void clickonSclerderma() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(scleroderma);
				clickElementUsingJavaScript(scleroderma);
				pageLoad();
			}
			public void clickonDiabetesMelletus() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Diabetesmellitus);
				clickElementUsingJavaScript(Diabetesmellitus);
				pageLoad();
			}
	
			public void clickonparkinsondisease() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(parkinsondisease);
				clickElementUsingJavaScript(parkinsondisease);
				pageLoad();
			}
			public void clickonSymptomsrelief() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(symptomsrelief);
				clickElementUsingJavaScript(symptomsrelief);
				pageLoad();
			}
			public void clickoneffectsoralhealth() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(effectsoralhealth);
				clickElementUsingJavaScript(effectsoralhealth);
				pageLoad();
			}
			public void clickonSymptomsreliefcare() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(symptomsreliefcare);
				clickElementUsingJavaScript(symptomsreliefcare);
				pageLoad();
			}
			public void clickonunderstandingreliefoptions() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(understaindingreliefoptions);
				clickElementUsingJavaScript(understaindingreliefoptions);
				pageLoad();
			}
			public void clickonDiagnoisedHealthprofesstional() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(diagnossiedhealthprofesstional);
				clickElementUsingJavaScript(diagnossiedhealthprofesstional);
				pageLoad();
			}
			public void clickonwhatissalvia() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(whatissalvia);
				clickElementUsingJavaScript(whatissalvia);
				pageLoad();
			}
			public void clickonnaturalremedies() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(naturalremedies);
				clickElementUsingJavaScript(naturalremedies);
				pageLoad();
			}
			public void clickonfoodhelpdrymouth() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(foodhelpdrymouth);
				clickElementUsingJavaScript(foodhelpdrymouth);
				pageLoad();
			}
			public void clickonmouthrinsemouthwash() throws Exception {	
				waitForPageLoadJava();
				if (isElementPresent(mouthrinsemouthwash)) {
					clickElementUsingJavaScript(mouthrinsemouthwash);
				} else {
					throw new Exception("mouthrinsemouthwash is not present on page");
				}
				pageLoad();
			}
			public void clickonfreshoriginalmint() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(freshmintoriginal);
				clickElementUsingJavaScript(freshmintoriginal);
				pageLoad();
			}
			public void clickongentlemintfluroide() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(gentlemintfluriode);
				clickElementUsingJavaScript(gentlemintfluriode);
				pageLoad();
			}
			public void clickonalcholfreemoisturizing() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(alcholfreemoisturizing);
				clickElementUsingJavaScript(alcholfreemoisturizing);
				pageLoad();
			}
			public void clickonoralbalancemoisturizinggel() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(oralbalancemoisturizing);
				clickElementUsingJavaScript(oralbalancemoisturizing);
				pageLoad();
			}
			public void clickonbiotenedrymouthgentle() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(biotenedrymouth);
				clickElementUsingJavaScript(biotenedrymouth);
				pageLoad();
			}
			public void clickonbiotenesugarfreelozenges() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(biotenesugarfreelozenges);
				clickElementUsingJavaScript(biotenesugarfreelozenges);
				pageLoad();
			}
			public void clickonAlcholfreeoralRinse() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(alcholfreeoralrinse);
				clickElementUsingJavaScript(alcholfreeoralrinse);
				pageLoad();
			}
			public void clickonWriteReview1() throws Exception {	
				waitForPageLoadJava();
				if (isElementPresent(writeReview1)) {
					clickElementUsingJavaScript(writeReview1);	
				} else {
					throw new Exception("Review is not present on page for fresh mint original toothpaste");
				}
				pageLoad();
			}
			public void clickonWriteReview2() throws Exception {	
				waitForPageLoadJava();
				if (isElementPresent(writeReview2)) {
					clickElementUsingJavaScript(writeReview2);	
				} else {
					throw new Exception("Review is not present on page for gentle mint fluroide");
				}
				pageLoad();
			}
			public void clickonWriteReview3() throws Exception {	
				waitForPageLoadJava();
				if (isElementPresent(writeReview3)) {
					clickElementUsingJavaScript(writeReview3);	
				} else {
					throw new Exception("Review is not present on page for Alchol free moisturizing mouth spray");
				}
				pageLoad();
			}
			public void clickonWriteReview4() throws Exception {	
				waitForPageLoadJava();
				if (isElementPresent(writeReview4)) {
					clickElementUsingJavaScript(writeReview4);	
				} else {
					throw new Exception("Review is not present on page for Oral balance moisturizing gel");
				}
				pageLoad();
			}
			public void clickonWriteReview5() throws Exception {	
				waitForPageLoadJava();
				if (isElementPresent(writeReview5)) {
					clickElementUsingJavaScript(writeReview5);	
				} else {
					throw new Exception("Review is not present on page for dry mouth gentle oral rinse");
				}
				pageLoad();
			}
			public void clickonWriteReview6() throws Exception {	
				waitForPageLoadJava();
				if (isElementPresent(writeReview6)) {
					clickElementUsingJavaScript(writeReview6);	
				} else {
					throw new Exception("Review is not present on page for biotene sugar free dry mouth");
				}
				pageLoad();
			}
			public void clickonlivingfulllife() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(livingfulllife);
				clickElementUsingJavaScript(livingfulllife);
				pageLoad();
			}
			public void clickonReliefremediesdrymouth() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(reliefremediesdrymouth);
				clickElementUsingJavaScript(reliefremediesdrymouth);
				pageLoad();
			}
			public void clickonmouthwashbadbreathe() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(mouthwashbadbreathe);
				clickElementUsingJavaScript(mouthwashbadbreathe);
				pageLoad();
			}
			public void clickondrymouthafterdrinkingwater() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(drymouthafterdrinkingwater);
				clickElementUsingJavaScript(drymouthafterdrinkingwater);
				pageLoad();
			}
			public void clickondrymouthsymptomsnight() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(drymouthsymptomsnight);
				clickElementUsingJavaScript(drymouthsymptomsnight);
				pageLoad();
			}
			public void clickondrymouthsymptomslaborday() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(drymouthsymptomslaborday);
				clickElementUsingJavaScript(drymouthsymptomslaborday);
				pageLoad();
			}
			public void clickonhandytipslearning() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(handytipslearning);
				clickElementUsingJavaScript(handytipslearning);
				pageLoad();
			}
			public void clickongetrelieffromsymptoms() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(getreieffromsymptoms);
				clickElementUsingJavaScript(getreieffromsymptoms);
				pageLoad();
			}
			public void clickonAlldaydrymouthSymptoms() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(Alldaydrymouthsymptoms);
				clickElementUsingJavaScript(Alldaydrymouthsymptoms);
				pageLoad();
			}
			public void clickonSymptomswhileTraveling() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(symptomswhileTraveling);
				clickElementUsingJavaScript(symptomswhileTraveling);
				pageLoad();
			}
			public void clickonBeachbagreliefdrymouth() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(beachbagrelievedrymouth);
				clickElementUsingJavaScript(beachbagrelievedrymouth);
				pageLoad();
			}
			public void clickonUnderstandinglinkbetweencancer() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(understandinglinkbetweencancer);
				clickElementUsingJavaScript(understandinglinkbetweencancer);
				pageLoad();
			}
			public void clickonManagingDiabites() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(ManagingDiabietes);
				clickElementUsingJavaScript(ManagingDiabietes);
				pageLoad();
			}
			public void clickonAsthmaRespiratory() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(AsthmaRespiratory);
				clickElementUsingJavaScript(AsthmaRespiratory);
				pageLoad();
			}
			public void clickonDrymouthMedications() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(drymouthmedications);
				clickElementUsingJavaScript(drymouthmedications);
				pageLoad();
			}
			public void clickonCaregivers() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(caregivers);
				clickElementUsingJavaScript(caregivers);
				pageLoad();
			}
			public void clickonQuizLovedones() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(quizlovedones);
				clickElementUsingJavaScript(quizlovedones);
				pageLoad();
			}
			public void clickonManagingSymptomsNight() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(ManagingSymptomsNight);
				clickElementUsingJavaScript(ManagingSymptomsNight);
				pageLoad();
			}
			public void clickonHowtouseMouthwash() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(howtousemouthwash);
				clickElementUsingJavaScript(howtousemouthwash);
				pageLoad();
			}
			public void clickondrymouthThroatRelated() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(drymouthandThroatRelated);
				clickElementUsingJavaScript(drymouthandThroatRelated);
				pageLoad();
			}
			public void clickonDoihavedrymouth() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(doihavedrymouth);
				clickElementUsingJavaScript(doihavedrymouth);
				pageLoad();
			}
			public void clickonDentistRecommendedDrymouth() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(DentistRecommendedProducts);
				clickElementUsingJavaScript(DentistRecommendedProducts);
				pageLoad();
			}
			public void clickonContactUsDryMouth() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(ContactUsDrymouthProducts);
				clickElementUsingJavaScript(ContactUsDrymouthProducts);
				pageLoad();
			}
			public void clickonFrequentlyAskedQuestions() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(frequentlyaskedquestions);
				clickElementUsingJavaScript(frequentlyaskedquestions);
				pageLoad();
			}
			public void clickonBioteneSitemapArticles() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(BioteneSitemapArticles);
				clickElementUsingJavaScript(BioteneSitemapArticles);
				pageLoad();
			}
			public void clickonSavenowwithBioteneProductsHelp() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(savenowwithbioteneproductshelp);
				clickElementUsingJavaScript(savenowwithbioteneproductshelp);
				pageLoad();
			}
			public void clickonSitemap() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(sitemap);
				clickElementUsingJavaScript(sitemap);
				pageLoad();
			}
			public void clickonUsingFSAHSA() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(usingFSAHSA);
				clickElementUsingJavaScript(usingFSAHSA);
				pageLoad();
			}
			public void clickonthankyouBiotene() throws Exception {	
				waitForPageLoadJava();
				if (isElementPresent(thankyouBiotene)) {
					clickElementUsingJavaScript(thankyouBiotene);
				} else {
					throw new Exception("Thank you Biotene is not present on Page");
				}
				
				pageLoad();
			}
			public void clickontakeQuiz() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(takequiz);
				clickElementUsingJavaScript(takequiz);
				visibilityOf(takequiz_txt);
				boolean elementIsDisplayed=elementIsDisplayed(takequiz_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(takequiz_txt));
				pageLoad();
			}
			public void clickonGetCoupons() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(getcoupons);
				clickElementUsingJavaScript(getcoupons);
				visibilityOf(getcoupons_txt);
				boolean elementIsDisplayed=elementIsDisplayed(getcoupons_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(getcoupons_txt));
				pageLoad();
			}
			public void clickonShopnow() throws Exception {	
				waitForPageLoadJava();
				scrollDownUsingElement(shopnow);
				clickElementUsingJavaScript(shopnow);
				visibilityOf(shopnow_txt);
				boolean elementIsDisplayed=elementIsDisplayed(shopnow_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(shopnow_txt));
				pageLoad();
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
