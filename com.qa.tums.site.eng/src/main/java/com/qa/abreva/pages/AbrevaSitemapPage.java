package com.qa.abreva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.baseClass.BaseClass;

public class AbrevaSitemapPage extends BaseClass{
	
	public AbrevaSitemapPage() {
		PageFactory.initElements(driver, this);
	}		
	
		@FindBy(xpath = "//button[text()='Accept Cookies']")
		private static WebElement cookieBtn;
		
		@FindBy(xpath = "//div[@class='otFloatingRounded ot-bottom-left ot-wo-title vertical-align-content']//self::div[@id='onetrust-banner-sdk']")
		private static WebElement cookieClose;
					
		@FindBy(xpath = "//a[text()='Home']")
		private static WebElement home;
	
		@FindBy(xpath = "//h1[text()='Abreva Cold Sore Cream']")
		private static WebElement home_txt;
	
		@FindBy(xpath = "//a[text()='Cold Sore First Signs']")
		private static WebElement coldsorefirstsigns;
	
		@FindBy(xpath = "//h2[text()='NEARLY 50% OF AMERICAN ADULTS HAVE THE VIRUS THAT CAUSES COLD SORES']")
		private static WebElement coldsorefirstsigns_txt;
	
		@FindBy(xpath = "//a[text()='Contact Us']")
		private static WebElement contactus;
	
		@FindBy(xpath = "//h1[text()='Contact Us']")
		private static WebElement contactus_txt;
	
		@FindBy(xpath = "//a[text()='Coupon']")
		private static WebElement coupons;
	
		@FindBy(xpath = "//h1[text()='Abreva Coupons']")
		private static WebElement coupons_txt;
	
		@FindBy(xpath = "//a[text()='Where to Buy']")
		private static WebElement wheretobuy;
	
		@FindBy(xpath = "//h1[text()='Where to Buy Abreva']")
		private static WebElement wheretobuy_txt;
	
		@FindBy(xpath = "//a[text()='ABREVA PRODUCTS']")
		private static WebElement abrevaproducts;
	
		@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
		private static WebElement abrevaproducts_txt;
	
		@FindBy(xpath = "//a[text()='Abreva Cream']")
		private static WebElement abrevacream;
	
		@FindBy(xpath = "//h1[text()='About Abreva Cold Sore Cream']")
		private static WebElement abrevacream_txt;
		
		@FindBy(xpath = "//a[text()='How Abreva Cream Works']")
		private static WebElement abrevacreamworks;
		
		@FindBy(xpath = "//h1[text()='HOW ABREVA WORKS']")
		private static WebElement abrevacreamworks_txt;
		
		@FindBy(xpath = "//a[text()='How to Use Abreva Cream']")
		private static WebElement abrevacreamuse;
		
		@FindBy(xpath = "//h1[text()='HOW TO USE ABREVA CREAM TO TREAT COLD SORES']")
		private static WebElement abrevacreamuse_txt;
		
		@FindBy(xpath = "//a[text()='Abreva Reviews']")
		private static WebElement abrevareviews;
		
		@FindBy(xpath = "//h1[text()='Abreva Reviews']")
		private static WebElement abrevareviews_txt;
		
		@FindBy(xpath = "//a[text()='Write a Review']")
		private static WebElement writeReview;
		
		@FindBy(xpath = "//h1[text()='WRITE A REVIEW']")
		private static WebElement writeReview_txt;
		
		@FindBy(xpath = "//a[text()='ABOUT COLD SORES']")
		private static WebElement aboutcoldsores;
		
		@FindBy(xpath = "//h1[text()='What Are Cold Sores?']")
		private static WebElement aboutcoldsores_txt;
		
		@FindBy(xpath = "//a[text()='What Are Cold Sores?']")
		private static WebElement whatarecoldsores;
		
		@FindBy(xpath = "//h1[text()='What Are Cold Sores?']")
		private static WebElement whatarecoldsores_txt;
		
		@FindBy(xpath = "//a[text()='How Cold Sores Spread']")
		private static WebElement coldsorespread;
		
		@FindBy(xpath = "//h1[text()='How to Prevent Spreading Cold Sores']")
		private static WebElement coldsorespread_txt;
		
		@FindBy(xpath = "//a[text()='Cold Sore Triggers']")
		private static WebElement coldsoretriggers;
		
		@FindBy(xpath = "//h1[text()='What Causes a Cold Sore?']")
		private static WebElement coldsoretriggers_txt;
		
		@FindBy(xpath = "//a[text()='Cold Sore Treatments']")
		private static WebElement coldsoretreatment;
		
		@FindBy(xpath = "//h1[text()='Treating Cold Sores: Why Choose Abreva?']")
		private static WebElement coldsoretreatment_txt;
		
		@FindBy(xpath = "//a[text()='Cold Sore Facts and Myths ']")
		private static WebElement coldsorefactsmyths;
		
		@FindBy(xpath = "//h1[text()='Cold Sore Facts and Myths']")
		private static WebElement coldsorefactsmyths_txt;
		
		@FindBy(xpath = "//a[text()='Explore the Cold Sore Stages']")
		private static WebElement explorecoldsorestages;
		
		
		@FindBy(xpath = "//h1[text()='Cold Sore Stages']")
		private static WebElement explorecoldsorestages_txt;
	
		@FindBy(xpath = "//a[text()='How to Take Care of Dry Lips in Winter']")
		private static WebElement takecarewinter;
		
		@FindBy(xpath = "//h1[text()='How to Take Care of Dry Lips in the Winter']")
		private static WebElement takecarewinter_txt;
		
		@FindBy(xpath = "//a[text()='Cold Sores vs. Pimples: What’s the Difference?']")
		private static WebElement coldsorespimples;
		
		@FindBy(xpath = "//h1[text()='Cold Sore vs. Pimple']")
		private static WebElement coldsorespimples_txt;
		
		@FindBy(xpath = "//a[text()='Types of Cold Sore Medicine']")
		private static WebElement typescoldsoresmedicine;
		
		@FindBy(xpath = "//h1[text()='Our Guide to Different Types of Cold Sore Medication']")
		private static WebElement typescoldsoresmedicine_txt;
		
		@FindBy(xpath = "//a[text()='Kids Cold Sores']")
		private static WebElement kidscoldsores;
		
		@FindBy(xpath = "//h1[text()='Learn All About Cold Sores in Teen']")
		private static WebElement kidscoldsores_txt;
		
		@FindBy(xpath = "//a[text()='MANAGING LIP HEALTH']")
		private static WebElement managingliphealth;
		
		@FindBy(xpath = "//h1[text()='Managing Lip Health']")
		private static WebElement managingliphealth_txt;
		
		@FindBy(xpath = "//a[text()='Stress and Cold Sores']")
		private static WebElement stresscoldsores;
		
		@FindBy(xpath = "//h1[text()='Stress and Cold Sores']")
		private static WebElement stresscoldsores_txt;
		
		@FindBy(xpath = "//a[text()='Can You Put Aloe Vera on Cold Sores?']")
		private static WebElement aloeveracoldsores;
		
		@FindBy(xpath = "//h1[text()='Aloe Vera for Cold Sores']")
		private static WebElement aloeveracoldsores_txt;
		
		@FindBy(xpath = "//a[text()='Why Do I Keep Getting Cold Sores?']")
		private static WebElement keepgettingcoldsores;
		
		@FindBy(xpath = "//h1[text()='Why Do I Get Cold Sores?']")
		private static WebElement keepgettingcoldsores_txt;
		
		@FindBy(xpath = "//a[text()='3 Common Lip Problems (and How to Solve Them)']")
		private static WebElement commonlipproblems;
		
		@FindBy(xpath = "//h1[text()='Common Lip Problems']")
		private static WebElement commonlipproblems_txt;
		
		@FindBy(xpath = "//a[text()='Cold Sore Fact Check: Do Cold Sores Mean You Have An STD?']")
		private static WebElement coldsorefactscheck;
		
		@FindBy(xpath = "//h1[text()='Cold Sore Fact Check: Do Cold Sores Mean You Have An STD?']")
		private static WebElement coldsorefactscheck_txt;
		
		@FindBy(xpath = "//a[text()='A Parent’s Guide for Managing Teenage Stress']")
		private static WebElement parentsguide;
		
		@FindBy(xpath = "//h1[text()='A Parent’s Guide for Managing Teenage Stress']")
		private static WebElement parentsguide_txt;
		
		@FindBy(xpath = "//a[text()='Managing Your Triggers']")
		private static WebElement managgingtriggers;
		
		@FindBy(xpath = "//h1[text()='Managing Lip Health']")
		private static WebElement managgingtriggers_txt;
		
		@FindBy(xpath = "//a[text()='Weather the Winter']")
		private static WebElement weatherwinter;
		
		@FindBy(xpath = "//h1[text()='Cold Sores From Cold Weather: How to Prevent Winter Cold Sores']")
		private static WebElement weatherwinter_txt;
		
		@FindBy(xpath = "//a[text()='Sun and Cold Sores']")
		private static WebElement suncoldsores;
		
		@FindBy(xpath = "//h1[text()='The Sun and Cold Sores']")
		private static WebElement suncoldsores_txt;
		
		@FindBy(xpath = "(//a[@href='/managing-lip-health/cold-sore-triggers/sun-and-cold-sores/'])[2]")
		private static WebElement spotshade;
		
		@FindBy(xpath = "//h1[text()='The Sun and Cold Sores']")
		private static WebElement spotshade_txt;
		
		@FindBy(xpath = "//a[@href='/managing-lip-health/cold-sore-triggers/sleep/']")
		private static WebElement getyourzzzs;
		
		@FindBy(xpath = "//h1[text()='How to Get Better Sleep']")
		private static WebElement getyourzzzs_txt;
		
		@FindBy(xpath = "//a[text()='Get Moving']")
		private static WebElement getmoving;
		
		@FindBy(xpath = "//h1[text()='Cold Sores and Exercise']")
		private static WebElement getmoving_txt;
		
		@FindBy(xpath = "//a[text()='Pump Up Your Brain']")
		private static WebElement pumpyourbrain;
		
		@FindBy(xpath = "//h1[text()='Pump Up Your Brain: Ways to Relieve Stress']")
		private static WebElement pumpyourbrain_txt;
		
		@FindBy(xpath = "//a[text()='Take It Easy']")
		private static WebElement takeiteasy;
		
		@FindBy(xpath = "//h1[text()='Take It Easy: Relaxation Techniques']")
		private static WebElement takeiteasy_txt;
		
		@FindBy(xpath = "//a[text()='Face Your Finances']")
		private static WebElement facefinances;
		
		@FindBy(xpath = "//h1[text()='Stress-Busting Money Management Tips']")
		private static WebElement facefinances_txt;
		
		@FindBy(xpath = "//a[text()='Cope With Illness or Loss']")
		private static WebElement copeillness;
		
		@FindBy(xpath = "//h1[text()='COPE WITH ILLNESS OR LOSS']")
		private static WebElement copeillness_txt;
		
		@FindBy(xpath = "//a[text()='Take That Coffee Break']")
		private static WebElement coffeebreak;
		
		@FindBy(xpath = "//h1[text()='Cold Sore Triggers: Stress at Work and How to Manage It']")
		private static WebElement coffeebreak_txt;
		
		@FindBy(xpath = "//a[text()='Plan for Important Days']")
		private static WebElement planimportantdays;
		
		@FindBy(xpath = "//span[text()='PLAN FOR IMPORTANT DAYS']")
		private static WebElement planimportantdays_txt;
		
		@FindBy(xpath = "//a[text()='Periods and Pregnancy']")
		private static WebElement peroidpregancy;
		
		@FindBy(xpath = "//h1[text()='Cold Sores, Periods, and Pregnancy']")
		private static WebElement peroidpregancy_txt;
		
		@FindBy(xpath = "(//a[@href='/managing-lip-health/cold-sore-triggers/dentist-visit/'])[2]")
		private static WebElement dentistvisit;
		
		@FindBy(xpath = "//h1[text()='Going to the Dentist with a Cold Sore']")
		private static WebElement dentistvisit_txt;
		
		@FindBy(xpath = "//a[text()='Prevention']")
		private static WebElement prevention;
		
		@FindBy(xpath = "//h1[text()='Cold and Flu Prevention']")
		private static WebElement prevention_txt;
		
		@FindBy(xpath = "//a[text()='Cold Sores After Lip Fillers: What You Need to Know']")
		private static WebElement lipfillers;
		
		@FindBy(xpath = "//h1[text()='What to Know About Cold Sores After Lip Fillers']")
		private static WebElement lipfillers_txt;
		
		@FindBy(xpath = "//a[text()='Trigger Free Summer Vacation Planning']")
		private static WebElement summervaccationplanning;
		
		@FindBy(xpath = "//h1[text()='Cold Sore Trigger-Free Summer Vacation Planning']")
		private static WebElement summervaccationplanning_txt;
		
		@FindBy(xpath = "//a[text()='What Type of Antiviral Cold Sore Medication Is Right for Me?']")
		private static WebElement antiviralcoldsore;
		
		@FindBy(xpath = "//h1[text()='What Type of Antiviral Cold Sore Medication Is Right for Me?']")
		private static WebElement antiviralcoldsore_txt;
		
		@FindBy(xpath = "//a[text()='Dealing With Cold Sores']")
		private static WebElement dealingcoldsores;
		
		@FindBy(xpath = "//h1[text()='Dealing with Cold Sores']")
		private static WebElement dealingcoldsores_txt;
		
		@FindBy(xpath = "(//a[text()='Get Rid of Cold Sores'])[1]")
		private static WebElement getridcoldsores;
		
		@FindBy(xpath = "//h1[text()='How to Treat Cold Sores']")
		private static WebElement getridcoldsores_txt;
		
		@FindBy(xpath = "//a[text()='Feel More Confident']")
		private static WebElement feelmoreconfident;
		
		@FindBy(xpath = "//h1[text()='How To Feel Confident with A Cold Sore']")
		private static WebElement feelmoreconfident_txt;
		
		@FindBy(xpath = "//a[text()='Conceal a Cold Sore']")
		private static WebElement concealcoldsore;
		
		@FindBy(xpath = "//h1[text()='How to Cover a Cold Sore with Makeup']")
		private static WebElement concealcoldsore_txt;
		
		@FindBy(xpath = "//a[text()='Kiss and Tell']")
		private static WebElement kisstell;
		
		@FindBy(xpath = "//h1[text()='Tips for Dating with Cold Sores']")
		private static WebElement kisstell_txt;
		
		@FindBy(xpath = "//a[text()='Fever Blister vs. Cold Sore']")
		private static WebElement feverblistercoldsore;
		
		@FindBy(xpath = "//h1[text()='Fever Blister Vs. Cold Sore']")
		private static WebElement feverblistercoldsore_txt;
		
		@FindBy(xpath = "//a[text()='5 Ways to Get Rid of Cold Sores']")
		private static WebElement waysridcoldsores;
		
		@FindBy(xpath = "//h1[text()='How to Get Rid of a Cold Sore Fast']")
		private static WebElement waysridcoldsores_txt;
		
		@FindBy(xpath = "//a[text()='Face Cold Sores With Confidence']")
		private static WebElement facecoldsores;
		
		@FindBy(xpath = "//h1[text()='Cold Sores and Confidence']")
		private static WebElement facecoldsores_txt;
		
		@FindBy(xpath = "//a[text()='Cold Sore Remedies']")
		private static WebElement coldsoreremedies;
		
		@FindBy(xpath = "//h1[text()='AT-HOME REMEDIES FOR COLD SORES']")
		private static WebElement coldsoreremedies_txt;
		
		@FindBy(xpath = "//a[text()='Deal with Cold Sores']")
		private static WebElement dealcoldsores;
		
		@FindBy(xpath = "//h1[text()='How to Stay Confident with a Cold Sore']")
		private static WebElement dealcoldsores_txt;
		
		@FindBy(xpath = "//a[text()='Cold Sore Confessions']")
		private static WebElement coldsoreconfession;
		
		@FindBy(xpath = "//h1[text()='Living with Cold Sores: Cold Sore Confessions']")
		private static WebElement coldsoreconfession_txt;
		
		@FindBy(xpath = "//a[text()='Help Stop the Spread']")
		private static WebElement stopspread;
		
		@FindBy(xpath = "//h1[text()='Are Cold Sores Contagious?']")
		private static WebElement stopspread_txt;
		
		@FindBy(xpath = "//a[text()='How to Stop A Cold Sore When it First Starts']")
		private static WebElement howtostopcoldsore;
		
		@FindBy(xpath = "//h1[text()='How to Stop a Cold Sore When it First Starts']")
		private static WebElement howtostopcoldsore_txt;
		
		@FindBy(xpath = "//a[text()='Toothpaste on Cold Sores—Does it Work?']")
		private static WebElement toothpastecoldsores;
		
		@FindBy(xpath = "//h1[text()='Toothpaste on Cold Sores: Does it Work?']")
		private static WebElement toothpastecoldsores_txt;
		
		@FindBy(xpath = "//a[text()='Nose Cold Sores']")
		private static WebElement nosecoldsores;
		
		@FindBy(xpath = "//h1[text()='How to Treat Cold Sores Inside Nose']")
		private static WebElement nosecoldsores_txt;
		
		@FindBy(xpath = "//a[text()='How to Treat a Cold Sore']")
		private static WebElement treatcoldsores;
		
		@FindBy(xpath = "//h1[text()='How to Treat Cold Sores']")
		private static WebElement treatcoldsores_txt;
		
		@FindBy(xpath = "//a[text()='How to Heal a Cold Sore Scab']")
		private static WebElement coldsorescab;
		
		@FindBy(xpath = "//h1[text()='How to Heal a Cold Sore Scab']")
		private static WebElement coldsorescab_txt;
		
		@FindBy(xpath = "//a[text()='Can You Get Cold Sores on Your Nose?']")
		private static WebElement coldsorenose;
		
		@FindBy(xpath = "//h1[text()='How to Treat Cold Sores Inside Nose']")
		private static WebElement coldsorenose_txt;
		
		@FindBy(xpath = "//a[text()='Lip Care Tips']")
		private static WebElement lipcaretips;
		
		@FindBy(xpath = "//h1[text()='Lip Care']")
		private static WebElement lipcaretips_txt;
		
		@FindBy(xpath = "//a[text()='Your Lips Say A Lot']")
		private static WebElement lipsayslot;
		
		@FindBy(xpath = "//h1[text()='Healthy Lips: Your Lips Can Say a Lot About You']")
		private static WebElement lipsayslot_txt;
		
		@FindBy(xpath = "//a[text()='Chapped Lips']")
		private static WebElement chappedlips;
		
		
		@FindBy(xpath = "//h1[text()='Hydrate and Heal Chapped Lips']")
		private static WebElement chappedlips_txt;
		
		@FindBy(xpath = "//a[text()='Where Can You Get a Cold Sore?']")
		private static WebElement wheregetcoldsore;
		
		@FindBy(xpath = "//h1[text()='WHERE CAN YOU GET A COLD SORE?']")
		private static WebElement wheregetcoldsore_txt;
		
		@FindBy(xpath = "//a[text()='Abreva vs. the Competition']")
		private static WebElement abrevavscompetion;
		
		@FindBy(xpath = "//h1[text()='COMPARE ABREVA VS. OTHER COLD SORE TREATMENTS']")
		private static WebElement abrevavscompetion_txt;
		
		@FindBy(xpath = "//a[text()='Lip Care vs. Lip Health']")
		private static WebElement lipcareliphealth;
		
		@FindBy(xpath = "//h1[text()='LEARN WHAT TRIGGERS YOUR COLD SORE']")
		private static WebElement lipcareliphealth_txt;
		
		@FindBy(xpath = "//a[text()='Fuel Your Lips']")
		private static WebElement fuellips;
		
		@FindBy(xpath = "//h1[text()='Foods for Healthy Lips']")
		private static WebElement fuellips_txt;
		
		@FindBy(xpath = "//a[text()='Lysine and Cold Sores']")
		private static WebElement lysinecoldsores;
		
		@FindBy(xpath = "//h1[text()='LYSINE FOR COLD SORE TREATMENT']")
		private static WebElement lysinecoldsores_txt;
		
		@FindBy(xpath = "//a[text()='Lip Care Routine']")
		private static WebElement lipcareroutine;
		
		@FindBy(xpath = "//h1[text()='Easy 5-Step Lip Care Routine']")
		private static WebElement lipcareroutine_txt;
		
		@FindBy(xpath = "//a[text()='How to Not Touch Your Face']")
		private static WebElement nottouchface;
		
		@FindBy(xpath = "//h1[text()='HOW NOT TO TOUCH YOUR FACE']")
		private static WebElement nottouchface_txt;
		
		@FindBy(xpath = "//a[text()='Bumps on Lips']")
		private static WebElement bumpslips;
		
		
		@FindBy(xpath = "//h1[text()='Managing Bumps on Lips']")
		private static WebElement bumpslips_txt;
		
		@FindBy(xpath = "//a[text()='Easy 5-Step Lip Care Routine']")
		private static WebElement stepcareroutine;
		
		@FindBy(xpath = "//h1[text()='Easy 5-Step Lip Care Routine']")
		private static WebElement stepcareroutine_txt;
		
		@FindBy(xpath = "//a[text()='The Cold Sore Tingle Poll']")
		private static WebElement coldsoretinglepoll;
		
		@FindBy(xpath = "//a[text()='FAQS']")
		private static WebElement faqs;
		
		@FindBy(xpath = "//h1[text()='How to Use Abreva Cold Sore Treatment']")
		private static WebElement faqs_txt;
		
		@FindBy(xpath = "//a[text()='Using My Fsa or Hsa to Purchase']")
		private static WebElement fsahsa;
		
		@FindBy(xpath = "//h1[text()='Can I Use My Flexible Spending Account (FSA) or Health Savings Account (HSA) to Purchase Abreva Products?']")
		private static WebElement fsahsa_txt;
		
		@FindBy(xpath = "//a[text()='When to Use Abreva']")
		private static WebElement whenuseabreva;
		
		@FindBy(xpath = "//h1[text()='When to Use Abreva']")
		private static WebElement whenuseabreva_txt;
		
		@FindBy(xpath = "//a[text()='How to Use Abreva']")
		private static WebElement howtouseabreva;
		
		@FindBy(xpath = "//h1[text()='How to Use Abreva Cold Sore Treatment']")
		private static WebElement howtouseabreva_txt;
		
		@FindBy(xpath = "//a[text()='Understanding Cold Sores']")
		private static WebElement understandingcoldsores;
		
		@FindBy(xpath = "//h1[text()='Understanding Cold Sores: Causes, Symptoms, and Treatments']")
		private static WebElement understandingcoldsores_txt;
		
		@FindBy(xpath = "(//a[text()='Get Rid of Cold Sores'])[2]")
		private static WebElement getridcoldsores1;
		
		@FindBy(xpath = "//h2[text()='NEARLY 50% OF AMERICAN ADULTS HAVE THE VIRUS THAT CAUSES COLD SORES']")
		private static WebElement getridcoldsores1_txt;
		
		
	
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
		public void clickonhome() throws Exception {	
			waitForPageLoadJava();
			moveToElement(home);
			clickElementUsingJavaScript(home);
			visibilityOf(home_txt);
			boolean elementIsDisplayed=elementIsDisplayed(home_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(home_txt));
			pageLoad();
		}	
		public void clickoncoldsorefirstsigns() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsorefirstsigns);
			clickElementUsingJavaScript(coldsorefirstsigns);
			visibilityOf(coldsorefirstsigns_txt);
			boolean elementIsDisplayed=elementIsDisplayed(coldsorefirstsigns_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsorefirstsigns_txt));
			pageLoad();
		}	
		public void clickoncontactus() throws Exception {	
			waitForPageLoadJava();
			moveToElement(contactus);
			clickElementUsingJavaScript(contactus);
			visibilityOf(contactus_txt );
			boolean elementIsDisplayed=elementIsDisplayed(contactus_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(contactus_txt));
			pageLoad();
		}	
		public void clickonCoupons() throws Exception {	
			waitForPageLoadJava();
			if (isElementPresent(coupons)) {
				elementToBeClickable(coupons_txt);
				visibilityOf(coupons_txt );
				boolean elementIsDisplayed=elementIsDisplayed(coupons_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(coupons_txt));
				pageLoad();
			} else {
				throw new Exception("Verified Coupons text is not present on Page");
			}
		}	
		public void clickonWheretobuy() throws Exception {	
			waitForPageLoadJava();
			moveToElement(wheretobuy);
			clickElementUsingJavaScript(wheretobuy);
			visibilityOf(wheretobuy_txt );
			boolean elementIsDisplayed=elementIsDisplayed(wheretobuy_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(wheretobuy_txt));
			pageLoad();
		}	
		public void clickonAbrevaProducts() throws Exception {	
			waitForPageLoadJava();
			moveToElement(abrevaproducts);
			clickElementUsingJavaScript(abrevaproducts);
			visibilityOf(abrevaproducts_txt );
			boolean elementIsDisplayed=elementIsDisplayed(abrevaproducts_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(abrevaproducts_txt));
			pageLoad();
		}	
		public void clickonAbrevaCream() throws Exception {	
			waitForPageLoadJava();
			moveToElement(abrevacream);
			clickElementUsingJavaScript(abrevacream);
			visibilityOf(abrevacream_txt );
			boolean elementIsDisplayed=elementIsDisplayed(abrevacream_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(abrevacream_txt));
			pageLoad();
		}	
		public void clickonAbrevaCreamworks() throws Exception {	
			waitForPageLoadJava();
			moveToElement(abrevacreamworks);
			clickElementUsingJavaScript(abrevacreamworks);
			visibilityOf(abrevacreamworks_txt );
			boolean elementIsDisplayed=elementIsDisplayed(abrevacreamworks_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(abrevacreamworks_txt));
			pageLoad();
		}	
		public void clickonAbrevaCreamuse() throws Exception {	
			waitForPageLoadJava();
			moveToElement(abrevacreamuse);
			clickElementUsingJavaScript(abrevacreamuse);
			visibilityOf(abrevacreamuse_txt );
			boolean elementIsDisplayed=elementIsDisplayed(abrevacreamuse_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(abrevacreamuse_txt));
			pageLoad();
		}	
		public void clickonAbrevaReviews() throws Exception {	
			waitForPageLoadJava();
			moveToElement(abrevareviews);
			clickElementUsingJavaScript(abrevareviews);
			visibilityOf(abrevareviews_txt );
			boolean elementIsDisplayed=elementIsDisplayed(abrevareviews_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(abrevareviews_txt));
			pageLoad();
		}	
		public void clickonWriteReviews() throws Exception {	
			waitForPageLoadJava();
			if (isElementPresent(writeReview)) {
				clickElementUsingJavaScript(writeReview);
				visibilityOf(writeReview_txt );
				boolean elementIsDisplayed=elementIsDisplayed(writeReview_txt);
				Assert.assertTrue(elementIsDisplayed);
				System.out.println(getElementText(writeReview_txt));
				pageLoad();
			} else {
				throw new Exception("Verified Write Review is not present on Page");
			}
			
		}	
		public void clickonAboutcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(aboutcoldsores);
			clickElementUsingJavaScript(aboutcoldsores);
			visibilityOf(aboutcoldsores_txt );
			boolean elementIsDisplayed=elementIsDisplayed(aboutcoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(aboutcoldsores_txt));
			pageLoad();
		}	
		public void clickonWhatarecoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(whatarecoldsores);
			clickElementUsingJavaScript(whatarecoldsores);
			visibilityOf(whatarecoldsores_txt );
			boolean elementIsDisplayed=elementIsDisplayed(whatarecoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(whatarecoldsores_txt));
			pageLoad();
		}	
		public void clickoncoldsoresspread() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsorespread);
			clickElementUsingJavaScript(coldsorespread);
			visibilityOf(coldsorespread_txt );
			boolean elementIsDisplayed=elementIsDisplayed(coldsorespread_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsorespread_txt));
			pageLoad();
		}	
		public void clickoncoldsorestriggers() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsoretriggers);
			clickElementUsingJavaScript(coldsoretriggers);
			visibilityOf(coldsoretriggers_txt );
			boolean elementIsDisplayed=elementIsDisplayed(coldsoretriggers_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsoretriggers_txt));
			pageLoad();
		}	
		public void clickoncoldsorestreatment() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsoretreatment);
			clickElementUsingJavaScript(coldsoretreatment);
			visibilityOf(coldsoretreatment_txt );
			boolean elementIsDisplayed=elementIsDisplayed(coldsoretreatment_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsoretreatment_txt));
			pageLoad();
		}	
		public void clickoncoldsoresfactsmyths() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsorefactsmyths);
			clickElementUsingJavaScript(coldsorefactsmyths);
			visibilityOf(coldsorefactsmyths_txt );
			boolean elementIsDisplayed=elementIsDisplayed(coldsorefactsmyths_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsorefactsmyths_txt));
			pageLoad();
		}	
		public void clickonExplorecoldstorestages() throws Exception {	
			waitForPageLoadJava();
			moveToElement(explorecoldsorestages);
			clickElementUsingJavaScript(explorecoldsorestages);
			visibilityOf(explorecoldsorestages_txt );
			boolean elementIsDisplayed=elementIsDisplayed(explorecoldsorestages_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(explorecoldsorestages_txt));
			pageLoad();
		}	
		public void clickontakecareWinters() throws Exception {	
			waitForPageLoadJava();
			moveToElement(takecarewinter);
			clickElementUsingJavaScript(takecarewinter);
			visibilityOf(takecarewinter_txt );
			boolean elementIsDisplayed=elementIsDisplayed(takecarewinter_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(takecarewinter_txt));
			pageLoad();
		}	
		public void clickonColdsorespimples() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsorespimples);
			clickElementUsingJavaScript(coldsorespimples);
			visibilityOf(coldsorespimples_txt );
			boolean elementIsDisplayed=elementIsDisplayed(coldsorespimples_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsorespimples_txt));
			pageLoad();
		}	
		public void clickontypescoldsoresmedicine() throws Exception {	
			waitForPageLoadJava();
			moveToElement(typescoldsoresmedicine);
			clickElementUsingJavaScript(typescoldsoresmedicine);
			visibilityOf(typescoldsoresmedicine_txt );
			boolean elementIsDisplayed=elementIsDisplayed(typescoldsoresmedicine_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(typescoldsoresmedicine_txt));
			pageLoad();
		}	
		public void clickonkidscoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(kidscoldsores);
			clickElementUsingJavaScript(kidscoldsores);
			visibilityOf(kidscoldsores_txt );
			boolean elementIsDisplayed=elementIsDisplayed(kidscoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(kidscoldsores_txt));
			pageLoad();
		}	
		public void clickonManagingliphealth() throws Exception {	
			waitForPageLoadJava();
			moveToElement(managingliphealth);
			clickElementUsingJavaScript(managingliphealth);
			visibilityOf(managingliphealth_txt );
			boolean elementIsDisplayed=elementIsDisplayed(managingliphealth_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(managingliphealth_txt));
			pageLoad();
		}	
		public void clickonstresscoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(stresscoldsores);
			clickElementUsingJavaScript(stresscoldsores);
			visibilityOf(stresscoldsores_txt );
			boolean elementIsDisplayed=elementIsDisplayed(stresscoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(stresscoldsores_txt));
			pageLoad();
		}	
		public void clickonAloeveracoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(aloeveracoldsores);
			clickElementUsingJavaScript(aloeveracoldsores);
			visibilityOf(aloeveracoldsores_txt );
			boolean elementIsDisplayed=elementIsDisplayed(aloeveracoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(aloeveracoldsores_txt));
			pageLoad();
		}	
		public void clickonkeepgettingcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(keepgettingcoldsores);
			clickElementUsingJavaScript(keepgettingcoldsores);
			visibilityOf(keepgettingcoldsores_txt );
			boolean elementIsDisplayed=elementIsDisplayed(keepgettingcoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(keepgettingcoldsores_txt));
			pageLoad();
		}	
		public void clickoncommonlipproblems() throws Exception {	
			waitForPageLoadJava();
			moveToElement(commonlipproblems);
			clickElementUsingJavaScript(commonlipproblems);
			visibilityOf(commonlipproblems_txt );
			boolean elementIsDisplayed=elementIsDisplayed(commonlipproblems_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(commonlipproblems_txt));
			pageLoad();
		}	
		public void clickoncoldsorefactscheck() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsorefactscheck);
			clickElementUsingJavaScript(coldsorefactscheck);
			visibilityOf(coldsorefactscheck_txt );
			boolean elementIsDisplayed=elementIsDisplayed(coldsorefactscheck_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsorefactscheck_txt));
			pageLoad();
		}	
		public void clickonparentsguide() throws Exception {	
			waitForPageLoadJava();
			moveToElement(parentsguide);
			clickElementUsingJavaScript(parentsguide);
			visibilityOf(parentsguide_txt );
			boolean elementIsDisplayed=elementIsDisplayed(parentsguide_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(parentsguide_txt));
			pageLoad();
		}	
		public void clickonmanagingtriggers() throws Exception {	
			waitForPageLoadJava();
			moveToElement(managgingtriggers);
			clickElementUsingJavaScript(managgingtriggers);
			visibilityOf(managgingtriggers_txt );
			boolean elementIsDisplayed=elementIsDisplayed(managgingtriggers_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(managgingtriggers_txt));
			pageLoad();
		}	
		public void clickonWeatherwinter() throws Exception {	
			waitForPageLoadJava();
			moveToElement(weatherwinter);
			clickElementUsingJavaScript(weatherwinter);
			visibilityOf(weatherwinter_txt );
			boolean elementIsDisplayed=elementIsDisplayed(weatherwinter_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(weatherwinter_txt));
			pageLoad();
		}	
		public void clickonSuncoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(suncoldsores);
			clickElementUsingJavaScript(suncoldsores);
			visibilityOf(suncoldsores_txt );
			boolean elementIsDisplayed=elementIsDisplayed(suncoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(suncoldsores_txt));
			pageLoad();
		}	
		public void clickonSpotshade() throws Exception {	
			waitForPageLoadJava();
			//moveToElement(spotshade);
			clickElementUsingJavaScript(spotshade);
			scrollDownUsingElement(spotshade_txt);
			visibilityOf(spotshade_txt );
			boolean elementIsDisplayed=elementIsDisplayed(spotshade_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(spotshade_txt));
			pageLoad();
		}	
		public void clickongetyourzzzs() throws Exception {	
			waitForPageLoadJava();
			moveToElement(getyourzzzs);
			clickElementUsingJavaScript(getyourzzzs);
			visibilityOf(getyourzzzs_txt );
			boolean elementIsDisplayed=elementIsDisplayed(getyourzzzs_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(getyourzzzs_txt));
			pageLoad();
		}	
		public void clickongetmoving() throws Exception {	
			waitForPageLoadJava();
			moveToElement(getmoving);
			clickElementUsingJavaScript(getmoving);
			visibilityOf(getmoving_txt );
			boolean elementIsDisplayed=elementIsDisplayed(getmoving_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(getmoving_txt));
			pageLoad();
		}	
		public void clickonpumpyourbrain() throws Exception {	
			waitForPageLoadJava();
			moveToElement(pumpyourbrain);
			clickElementUsingJavaScript(pumpyourbrain);
			visibilityOf(pumpyourbrain_txt );
			boolean elementIsDisplayed=elementIsDisplayed(pumpyourbrain_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(pumpyourbrain_txt));
			pageLoad();
		}	
		public void clickontakeiteasy() throws Exception {	
			waitForPageLoadJava();
			moveToElement(takeiteasy);
			clickElementUsingJavaScript(takeiteasy);
			visibilityOf(takeiteasy_txt );
			boolean elementIsDisplayed=elementIsDisplayed(takeiteasy_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(takeiteasy_txt));
			pageLoad();
		}	
		public void clickonfacefinances() throws Exception {	
			waitForPageLoadJava();
			moveToElement(facefinances);
			clickElementUsingJavaScript(facefinances);
			visibilityOf(facefinances_txt );
			boolean elementIsDisplayed=elementIsDisplayed(facefinances_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(facefinances_txt));
			pageLoad();
		}	
		public void clickoncopeillness() throws Exception {	
			waitForPageLoadJava();
			moveToElement(copeillness);
			clickElementUsingJavaScript(copeillness);
			visibilityOf(copeillness_txt );
			boolean elementIsDisplayed=elementIsDisplayed(copeillness_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(copeillness_txt));
			pageLoad();
		}	
		public void clickoncoffeebreak() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coffeebreak);
			clickElementUsingJavaScript(coffeebreak);
			visibilityOf(coffeebreak_txt );
			boolean elementIsDisplayed=elementIsDisplayed(coffeebreak_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coffeebreak_txt));
			pageLoad();
		}	
		public void clickonplanimportantdays() throws Exception {	
			waitForPageLoadJava();
			moveToElement(planimportantdays);
			clickElementUsingJavaScript(planimportantdays);
			visibilityOf(planimportantdays_txt );
			boolean elementIsDisplayed=elementIsDisplayed(planimportantdays_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(planimportantdays_txt));
			pageLoad();
		}	
		public void clickonperoidpregancy() throws Exception {	
			waitForPageLoadJava();
			moveToElement(peroidpregancy);
			clickElementUsingJavaScript(peroidpregancy);
			visibilityOf(peroidpregancy_txt );
			boolean elementIsDisplayed=elementIsDisplayed(peroidpregancy_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(peroidpregancy_txt));
			pageLoad();
		}	
		public void clickonDentistvisit() throws Exception {	
			waitForPageLoadJava();
			moveToElement(dentistvisit);
			clickElementUsingJavaScript(dentistvisit);
			visibilityOf(dentistvisit_txt );
			boolean elementIsDisplayed=elementIsDisplayed(dentistvisit_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(dentistvisit_txt));
			pageLoad();
		}	
		public void clickonPrevention() throws Exception {	
			waitForPageLoadJava();
			moveToElement(prevention);
			clickElementUsingJavaScript(prevention);
			visibilityOf(prevention_txt );
			boolean elementIsDisplayed=elementIsDisplayed(prevention_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(prevention_txt));
			pageLoad();
		}	
		public void clickonlipfillers() throws Exception {	
			waitForPageLoadJava();
			moveToElement(lipfillers);
			clickElementUsingJavaScript(lipfillers);
			visibilityOf(lipfillers_txt );
			boolean elementIsDisplayed=elementIsDisplayed(lipfillers_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(lipfillers_txt));
			pageLoad();
		}	
		public void clickonsummervaccationplanning() throws Exception {	
			waitForPageLoadJava();
			moveToElement(summervaccationplanning);
			clickElementUsingJavaScript(summervaccationplanning);
			visibilityOf(summervaccationplanning_txt );
			boolean elementIsDisplayed=elementIsDisplayed(summervaccationplanning_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(summervaccationplanning_txt));
			pageLoad();
		}	
		public void clickonAntiviralcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(antiviralcoldsore);
			clickElementUsingJavaScript(antiviralcoldsore);
			visibilityOf(antiviralcoldsore_txt );
			boolean elementIsDisplayed=elementIsDisplayed(antiviralcoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(antiviralcoldsore_txt));
			pageLoad();
		}	
		public void clickonDealingcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(dealingcoldsores);
			clickElementUsingJavaScript(dealingcoldsores);
			visibilityOf(dealingcoldsores_txt );
			boolean elementIsDisplayed=elementIsDisplayed(dealingcoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(dealingcoldsores_txt));
			pageLoad();
		}	
		public void clickongetridcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(getridcoldsores);
			clickElementUsingJavaScript(getridcoldsores);
			visibilityOf(getridcoldsores_txt );
			boolean elementIsDisplayed=elementIsDisplayed(getridcoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(getridcoldsores_txt));
			pageLoad();
		}	
		public void clickonfeelmoreconfident() throws Exception {	
			waitForPageLoadJava();
			moveToElement(feelmoreconfident);
			clickElementUsingJavaScript(feelmoreconfident);
			visibilityOf(feelmoreconfident_txt );
			boolean elementIsDisplayed=elementIsDisplayed(feelmoreconfident_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(feelmoreconfident_txt));
			pageLoad();
		}	
		public void clickonConcealcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(concealcoldsore);
			clickElementUsingJavaScript(concealcoldsore);
			visibilityOf(concealcoldsore_txt );
			boolean elementIsDisplayed=elementIsDisplayed(concealcoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(concealcoldsore_txt));
			pageLoad();
		}	
		public void clickonkisstell() throws Exception {	
			waitForPageLoadJava();
			moveToElement(kisstell);
			clickElementUsingJavaScript(kisstell);
			visibilityOf(kisstell_txt );
			boolean elementIsDisplayed=elementIsDisplayed(kisstell_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(kisstell_txt));
			pageLoad();
		}	
		public void clickonfeverblister() throws Exception {	
			waitForPageLoadJava();
			moveToElement(feverblistercoldsore);
			clickElementUsingJavaScript(feverblistercoldsore);
			visibilityOf(feverblistercoldsore_txt );
			boolean elementIsDisplayed=elementIsDisplayed(feverblistercoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(feverblistercoldsore_txt));
			pageLoad();
		}	
		public void clickonwaysridcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(waysridcoldsores);
			clickElementUsingJavaScript(waysridcoldsores);
			visibilityOf(waysridcoldsores_txt );
			boolean elementIsDisplayed=elementIsDisplayed(waysridcoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(waysridcoldsores_txt));
			pageLoad();
		}	
		public void clickonfacecoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(facecoldsores);
			clickElementUsingJavaScript(facecoldsores);
			visibilityOf(facecoldsores_txt );
			boolean elementIsDisplayed=elementIsDisplayed(facecoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(facecoldsores_txt));
			pageLoad();
		}	
		public void clickoncoldsoresremedies() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsoreremedies);
			clickElementUsingJavaScript(coldsoreremedies);
			visibilityOf(coldsoreremedies_txt );
			boolean elementIsDisplayed=elementIsDisplayed(coldsoreremedies_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsoreremedies_txt));
			pageLoad();
		}	
		public void clickondealcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(dealcoldsores);
			clickElementUsingJavaScript(dealcoldsores);
			visibilityOf(dealcoldsores_txt );
			boolean elementIsDisplayed=elementIsDisplayed(dealcoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(dealcoldsores_txt));
			pageLoad();
		}	
		public void clickoncoldsoresconfession() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsoreconfession);
			clickElementUsingJavaScript(coldsoreconfession);
			visibilityOf(coldsoreconfession_txt );
			boolean elementIsDisplayed=elementIsDisplayed(coldsoreconfession_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsoreconfession_txt));
			pageLoad();
		}	
		public void clickonstopspread() throws Exception {	
			waitForPageLoadJava();
			moveToElement(stopspread);
			clickElementUsingJavaScript(stopspread);
			visibilityOf(stopspread_txt );
			boolean elementIsDisplayed=elementIsDisplayed(stopspread_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(stopspread_txt));
			pageLoad();
		}	
		
		public void clickonhowtostopcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(howtostopcoldsore);
			clickElementUsingJavaScript(howtostopcoldsore);
			visibilityOf(howtostopcoldsore_txt );
			boolean elementIsDisplayed=elementIsDisplayed(howtostopcoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(howtostopcoldsore_txt));
			pageLoad();
		}	
		
		public void clickontoothpastecoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(toothpastecoldsores);
			clickElementUsingJavaScript(toothpastecoldsores);
			visibilityOf(toothpastecoldsores_txt );
			boolean elementIsDisplayed=elementIsDisplayed(toothpastecoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(toothpastecoldsores_txt));
			pageLoad();
		}	
		public void clickonnosecoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(nosecoldsores);
			clickElementUsingJavaScript(nosecoldsores);
			visibilityOf(nosecoldsores_txt );
			boolean elementIsDisplayed=elementIsDisplayed(nosecoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(nosecoldsores_txt));
			pageLoad();
		}	
		public void clickontreatcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(treatcoldsores);
			clickElementUsingJavaScript(treatcoldsores);
			visibilityOf(treatcoldsores_txt );
			boolean elementIsDisplayed=elementIsDisplayed(treatcoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(treatcoldsores_txt));
			pageLoad();
		}	
		public void clickoncoldsorescab() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsorescab);
			clickElementUsingJavaScript(coldsorescab);
			visibilityOf(coldsorescab_txt );
			boolean elementIsDisplayed=elementIsDisplayed(coldsorescab_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsorescab_txt));
			pageLoad();
		}	
		public void clickoncoldsorenose() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsorenose);
			clickElementUsingJavaScript(coldsorenose);
			visibilityOf(coldsorenose_txt );
			boolean elementIsDisplayed=elementIsDisplayed(coldsorenose_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(coldsorenose_txt));
			pageLoad();
		}	
		public void clickonlipcaretips() throws Exception {	
			waitForPageLoadJava();
			moveToElement(lipcaretips);
			clickElementUsingJavaScript(lipcaretips);
			visibilityOf(lipcaretips_txt );
			boolean elementIsDisplayed=elementIsDisplayed(lipcaretips_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(lipcaretips_txt));
			pageLoad();
		}	
		public void clickonlipsayslot() throws Exception {	
			waitForPageLoadJava();
			moveToElement(lipsayslot);
			clickElementUsingJavaScript(lipsayslot);
			visibilityOf(lipsayslot_txt );
			boolean elementIsDisplayed=elementIsDisplayed(lipsayslot_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(lipsayslot_txt));
			pageLoad();
		}	
		public void clickonchappedlips() throws Exception {	
			waitForPageLoadJava();
			moveToElement(chappedlips);
			clickElementUsingJavaScript(chappedlips);
			visibilityOf(chappedlips_txt );
			boolean elementIsDisplayed=elementIsDisplayed(chappedlips_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(chappedlips_txt));
			pageLoad();
		}	
		public void clickonwheregetcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(wheregetcoldsore);
			clickElementUsingJavaScript(wheregetcoldsore);
			visibilityOf(wheregetcoldsore_txt );
			boolean elementIsDisplayed=elementIsDisplayed(wheregetcoldsore_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(wheregetcoldsore_txt));
			pageLoad();
		}	
		public void clickonAbrevacompetion() throws Exception {	
			waitForPageLoadJava();
			moveToElement(abrevavscompetion);
			clickElementUsingJavaScript(abrevavscompetion);
			visibilityOf(abrevavscompetion_txt );
			boolean elementIsDisplayed=elementIsDisplayed(abrevavscompetion_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(abrevavscompetion_txt));
			pageLoad();
		}	
		public void clickonlipcareliphealth() throws Exception {	
			waitForPageLoadJava();
			moveToElement(lipcareliphealth);
			clickElementUsingJavaScript(lipcareliphealth);
			visibilityOf(lipcareliphealth_txt );
			boolean elementIsDisplayed=elementIsDisplayed(lipcareliphealth_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(lipcareliphealth_txt));
			pageLoad();
		}	
		public void clickonfuellips() throws Exception {	
			waitForPageLoadJava();
			moveToElement(fuellips);
			clickElementUsingJavaScript(fuellips);
			visibilityOf(fuellips_txt );
			boolean elementIsDisplayed=elementIsDisplayed(fuellips_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(fuellips_txt));
			pageLoad();
		}	
		public void clickonlysinecoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(lysinecoldsores);
			clickElementUsingJavaScript(lysinecoldsores);
			visibilityOf(lysinecoldsores_txt );
			boolean elementIsDisplayed=elementIsDisplayed(lysinecoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(lysinecoldsores_txt));
			pageLoad();
		}	
		public void clickonlipcareroutine() throws Exception {	
			waitForPageLoadJava();
			moveToElement(lipcareroutine);
			clickElementUsingJavaScript(lipcareroutine);
			visibilityOf(lipcareroutine_txt );
			boolean elementIsDisplayed=elementIsDisplayed(lipcareroutine_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(lipcareroutine_txt));
			pageLoad();
		}	
		public void clickonnottouchface() throws Exception {	
			waitForPageLoadJava();
			moveToElement(nottouchface);
			clickElementUsingJavaScript(nottouchface);
			visibilityOf(nottouchface_txt );
			boolean elementIsDisplayed=elementIsDisplayed(nottouchface_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(nottouchface_txt));
			pageLoad();
		}	
		public void clickonbumpslips() throws Exception {	
			waitForPageLoadJava();
			moveToElement(bumpslips);
			clickElementUsingJavaScript(bumpslips);
			visibilityOf(bumpslips_txt );
			boolean elementIsDisplayed=elementIsDisplayed(bumpslips_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(bumpslips_txt));
			pageLoad();
		}	
		public void clickonstepcareroutine() throws Exception {	
			waitForPageLoadJava();
			moveToElement(stepcareroutine);
			clickElementUsingJavaScript(stepcareroutine);
			visibilityOf(stepcareroutine_txt );
			boolean elementIsDisplayed=elementIsDisplayed(stepcareroutine_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(stepcareroutine_txt));
			pageLoad();
		}	
		public void clickoncoldsoretinglepoll() throws Exception {	
			waitForPageLoadJava();
			moveToElement(coldsoretinglepoll);
			clickElementUsingJavaScript(coldsoretinglepoll);
			pageLoad();
		}
		public void clickonFAQs() throws Exception {	
			waitForPageLoadJava();
			moveToElement(faqs);
			clickElementUsingJavaScript(faqs);
			visibilityOf(faqs_txt );
			boolean elementIsDisplayed=elementIsDisplayed(faqs_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(faqs_txt));
			pageLoad();
		}	
		public void clickonFsaorhsa() throws Exception {	
			waitForPageLoadJava();
			moveToElement(fsahsa);
			clickElementUsingJavaScript(fsahsa);
			visibilityOf(fsahsa_txt );
			boolean elementIsDisplayed=elementIsDisplayed(fsahsa_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(fsahsa_txt));
			pageLoad();
		}	
		public void clickonwhenuseabreva() throws Exception {	
			waitForPageLoadJava();
			moveToElement(whenuseabreva);
			clickElementUsingJavaScript(whenuseabreva);
			visibilityOf(whenuseabreva_txt );
			boolean elementIsDisplayed=elementIsDisplayed(whenuseabreva_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(whenuseabreva_txt));
			pageLoad();
		}	
		public void clickonhowuseabreva() throws Exception {	
			waitForPageLoadJava();
			moveToElement(howtouseabreva);
			clickElementUsingJavaScript(howtouseabreva);
			visibilityOf(howtouseabreva_txt );
			boolean elementIsDisplayed=elementIsDisplayed(howtouseabreva_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(howtouseabreva_txt));
			pageLoad();
		}	
		public void clickonunderstandingcoldsores() throws Exception {	
			waitForPageLoadJava();
			moveToElement(understandingcoldsores);
			clickElementUsingJavaScript(understandingcoldsores);
			visibilityOf(understandingcoldsores_txt );
			boolean elementIsDisplayed=elementIsDisplayed(understandingcoldsores_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(understandingcoldsores_txt));
			pageLoad();
		}	
		public void clickongetridcoldsores1() throws Exception {	
			waitForPageLoadJava();
			moveToElement(getridcoldsores1);
			clickElementUsingJavaScript(getridcoldsores1);
			visibilityOf(getridcoldsores1_txt );
			boolean elementIsDisplayed=elementIsDisplayed(getridcoldsores1_txt);
			Assert.assertTrue(elementIsDisplayed);
			System.out.println(getElementText(getridcoldsores1_txt));
			pageLoad();
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
